package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class clienvww_impl extends GXDataArea
{
   public clienvww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public clienvww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( clienvww_impl.class ));
   }

   public clienvww_impl( int remoteHandle ,
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
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV26TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV27TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV28TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV29TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV30TFCliEnvLin = (byte)(GXutil.lval( httpContext.GetPar( "TFCliEnvLin"))) ;
      AV31TFCliEnvLin_To = (byte)(GXutil.lval( httpContext.GetPar( "TFCliEnvLin_To"))) ;
      AV32TFCliEnvNom = httpContext.GetPar( "TFCliEnvNom") ;
      AV33TFCliEnvNom_Sel = httpContext.GetPar( "TFCliEnvNom_Sel") ;
      AV34TFCliEnvNm2 = httpContext.GetPar( "TFCliEnvNm2") ;
      AV35TFCliEnvNm2_Sel = httpContext.GetPar( "TFCliEnvNm2_Sel") ;
      AV36TFCliEnvDom = httpContext.GetPar( "TFCliEnvDom") ;
      AV37TFCliEnvDom_Sel = httpContext.GetPar( "TFCliEnvDom_Sel") ;
      AV38TFCliEnvDm2 = httpContext.GetPar( "TFCliEnvDm2") ;
      AV39TFCliEnvDm2_Sel = httpContext.GetPar( "TFCliEnvDm2_Sel") ;
      AV40TFCliEnvPob = httpContext.GetPar( "TFCliEnvPob") ;
      AV41TFCliEnvPob_Sel = httpContext.GetPar( "TFCliEnvPob_Sel") ;
      AV42TFCliEnvCp = httpContext.GetPar( "TFCliEnvCp") ;
      AV43TFCliEnvCp_Sel = httpContext.GetPar( "TFCliEnvCp_Sel") ;
      AV44TFCliEnvCp2 = httpContext.GetPar( "TFCliEnvCp2") ;
      AV45TFCliEnvCp2_Sel = httpContext.GetPar( "TFCliEnvCp2_Sel") ;
      AV46TFCliEnvPrv = (short)(GXutil.lval( httpContext.GetPar( "TFCliEnvPrv"))) ;
      AV47TFCliEnvPrv_To = (short)(GXutil.lval( httpContext.GetPar( "TFCliEnvPrv_To"))) ;
      AV48TFCliEnvPrn = httpContext.GetPar( "TFCliEnvPrn") ;
      AV49TFCliEnvPrn_Sel = httpContext.GetPar( "TFCliEnvPrn_Sel") ;
      AV50TFCliEnvAg = httpContext.GetPar( "TFCliEnvAg") ;
      AV51TFCliEnvAg_Sel = httpContext.GetPar( "TFCliEnvAg_Sel") ;
      AV52TFCliEnvTp = (short)(GXutil.lval( httpContext.GetPar( "TFCliEnvTp"))) ;
      AV53TFCliEnvTp_To = (short)(GXutil.lval( httpContext.GetPar( "TFCliEnvTp_To"))) ;
      AV54TFCliEnvNmt = httpContext.GetPar( "TFCliEnvNmt") ;
      AV55TFCliEnvNmt_Sel = httpContext.GetPar( "TFCliEnvNmt_Sel") ;
      AV56TFCliEnvMail = httpContext.GetPar( "TFCliEnvMail") ;
      AV57TFCliEnvMail_Sel = httpContext.GetPar( "TFCliEnvMail_Sel") ;
      AV58TFCliEnvFx = httpContext.GetPar( "TFCliEnvFx") ;
      AV59TFCliEnvFx_Sel = httpContext.GetPar( "TFCliEnvFx_Sel") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
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
      pa1S92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1S92( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.clienvww", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CLIENVWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("clienvww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV62GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV63GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV60DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV60DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV26TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV27TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVLIN", GXutil.ltrim( localUtil.ntoc( AV30TFCliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVLIN_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliEnvLin_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNOM", GXutil.rtrim( AV32TFCliEnvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNOM_SEL", GXutil.rtrim( AV33TFCliEnvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNM2", GXutil.rtrim( AV34TFCliEnvNm2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNM2_SEL", GXutil.rtrim( AV35TFCliEnvNm2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVDOM", GXutil.rtrim( AV36TFCliEnvDom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVDOM_SEL", GXutil.rtrim( AV37TFCliEnvDom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVDM2", GXutil.rtrim( AV38TFCliEnvDm2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVDM2_SEL", GXutil.rtrim( AV39TFCliEnvDm2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPOB", GXutil.rtrim( AV40TFCliEnvPob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPOB_SEL", GXutil.rtrim( AV41TFCliEnvPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVCP", GXutil.rtrim( AV42TFCliEnvCp));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVCP_SEL", GXutil.rtrim( AV43TFCliEnvCp_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVCP2", GXutil.rtrim( AV44TFCliEnvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVCP2_SEL", GXutil.rtrim( AV45TFCliEnvCp2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPRV", GXutil.ltrim( localUtil.ntoc( AV46TFCliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPRV_TO", GXutil.ltrim( localUtil.ntoc( AV47TFCliEnvPrv_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPRN", GXutil.rtrim( AV48TFCliEnvPrn));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVPRN_SEL", GXutil.rtrim( AV49TFCliEnvPrn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVAG", GXutil.rtrim( AV50TFCliEnvAg));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVAG_SEL", GXutil.rtrim( AV51TFCliEnvAg_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVTP", GXutil.ltrim( localUtil.ntoc( AV52TFCliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVTP_TO", GXutil.ltrim( localUtil.ntoc( AV53TFCliEnvTp_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNMT", GXutil.rtrim( AV54TFCliEnvNmt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVNMT_SEL", GXutil.rtrim( AV55TFCliEnvNmt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVMAIL", GXutil.rtrim( AV56TFCliEnvMail));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVMAIL_SEL", GXutil.rtrim( AV57TFCliEnvMail_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVFX", GXutil.rtrim( AV58TFCliEnvFx));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIENVFX_SEL", GXutil.rtrim( AV59TFCliEnvFx_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we1S92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1S92( ) ;
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
      return formatLink("app.clienvww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "CLIENVWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla CLIENV", "") ;
   }

   public void wb1S90( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CLIENVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1S92( true) ;
      }
      else
      {
         wb_table1_19_1S92( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1S92e( boolean wbgen )
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
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV62GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV63GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CLIENVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV60DDO_TitleSettingsIcons);
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
      if ( wbEnd == 37 )
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

   public void start1S92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Tabla CLIENV", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1S90( ) ;
   }

   public void ws1S92( )
   {
      start1S92( ) ;
      evt1S92( ) ;
   }

   public void evt1S92( )
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
                           e111S92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121S92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131S92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141S92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e151S92 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV64GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A266CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliEnvLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A267CliEnvNom = httpContext.cgiGet( edtCliEnvNom_Internalname) ;
                           A5531CliEnvNm2 = httpContext.cgiGet( edtCliEnvNm2_Internalname) ;
                           A265CliEnvDom = httpContext.cgiGet( edtCliEnvDom_Internalname) ;
                           A5530CliEnvDm2 = httpContext.cgiGet( edtCliEnvDm2_Internalname) ;
                           A268CliEnvPob = httpContext.cgiGet( edtCliEnvPob_Internalname) ;
                           A264CliEnvCp = httpContext.cgiGet( edtCliEnvCp_Internalname) ;
                           A10775CliEnvCp2 = httpContext.cgiGet( edtCliEnvCp2_Internalname) ;
                           A270CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( edtCliEnvPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A269CliEnvPrn = GXutil.upper( httpContext.cgiGet( edtCliEnvPrn_Internalname)) ;
                           n269CliEnvPrn = false ;
                           A689CliEnvAg = httpContext.cgiGet( edtCliEnvAg_Internalname) ;
                           A723CliEnvTp = (short)(localUtil.ctol( httpContext.cgiGet( edtCliEnvTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A693CliEnvNmt = httpContext.cgiGet( edtCliEnvNmt_Internalname) ;
                           A10051CliEnvMail = httpContext.cgiGet( edtCliEnvMail_Internalname) ;
                           A10052CliEnvFx = httpContext.cgiGet( edtCliEnvFx_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161S92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171S92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181S92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we1S92( )
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

   public void pa1S92( )
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
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 String AV67Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV26TFEmprCod ,
                                 String AV27TFEmprCod_Sel ,
                                 int AV28TFCliCod ,
                                 int AV29TFCliCod_To ,
                                 byte AV30TFCliEnvLin ,
                                 byte AV31TFCliEnvLin_To ,
                                 String AV32TFCliEnvNom ,
                                 String AV33TFCliEnvNom_Sel ,
                                 String AV34TFCliEnvNm2 ,
                                 String AV35TFCliEnvNm2_Sel ,
                                 String AV36TFCliEnvDom ,
                                 String AV37TFCliEnvDom_Sel ,
                                 String AV38TFCliEnvDm2 ,
                                 String AV39TFCliEnvDm2_Sel ,
                                 String AV40TFCliEnvPob ,
                                 String AV41TFCliEnvPob_Sel ,
                                 String AV42TFCliEnvCp ,
                                 String AV43TFCliEnvCp_Sel ,
                                 String AV44TFCliEnvCp2 ,
                                 String AV45TFCliEnvCp2_Sel ,
                                 short AV46TFCliEnvPrv ,
                                 short AV47TFCliEnvPrv_To ,
                                 String AV48TFCliEnvPrn ,
                                 String AV49TFCliEnvPrn_Sel ,
                                 String AV50TFCliEnvAg ,
                                 String AV51TFCliEnvAg_Sel ,
                                 short AV52TFCliEnvTp ,
                                 short AV53TFCliEnvTp_To ,
                                 String AV54TFCliEnvNmt ,
                                 String AV55TFCliEnvNmt_Sel ,
                                 String AV56TFCliEnvMail ,
                                 String AV57TFCliEnvMail_Sel ,
                                 String AV58TFCliEnvFx ,
                                 String AV59TFCliEnvFx_Sel )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171S92 ();
      GRID_nCurrentRecord = 0 ;
      rf1S92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CLIENVWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("clienvww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLIENVLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVLIN", GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), ".", "")));
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
      rf1S92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "CLIENVWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV27TFEmprCod_Sel ,
                                           AV26TFEmprCod ,
                                           Integer.valueOf(AV28TFCliCod) ,
                                           Integer.valueOf(AV29TFCliCod_To) ,
                                           Byte.valueOf(AV30TFCliEnvLin) ,
                                           Byte.valueOf(AV31TFCliEnvLin_To) ,
                                           AV33TFCliEnvNom_Sel ,
                                           AV32TFCliEnvNom ,
                                           AV35TFCliEnvNm2_Sel ,
                                           AV34TFCliEnvNm2 ,
                                           AV37TFCliEnvDom_Sel ,
                                           AV36TFCliEnvDom ,
                                           AV39TFCliEnvDm2_Sel ,
                                           AV38TFCliEnvDm2 ,
                                           AV41TFCliEnvPob_Sel ,
                                           AV40TFCliEnvPob ,
                                           AV43TFCliEnvCp_Sel ,
                                           AV42TFCliEnvCp ,
                                           AV45TFCliEnvCp2_Sel ,
                                           AV44TFCliEnvCp2 ,
                                           Short.valueOf(AV46TFCliEnvPrv) ,
                                           Short.valueOf(AV47TFCliEnvPrv_To) ,
                                           AV49TFCliEnvPrn_Sel ,
                                           AV48TFCliEnvPrn ,
                                           AV51TFCliEnvAg_Sel ,
                                           AV50TFCliEnvAg ,
                                           Short.valueOf(AV52TFCliEnvTp) ,
                                           Short.valueOf(AV53TFCliEnvTp_To) ,
                                           AV57TFCliEnvMail_Sel ,
                                           AV56TFCliEnvMail ,
                                           AV59TFCliEnvFx_Sel ,
                                           AV58TFCliEnvFx ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A266CliEnvLin) ,
                                           A267CliEnvNom ,
                                           A5531CliEnvNm2 ,
                                           A265CliEnvDom ,
                                           A5530CliEnvDm2 ,
                                           A268CliEnvPob ,
                                           A264CliEnvCp ,
                                           A10775CliEnvCp2 ,
                                           Short.valueOf(A270CliEnvPrv) ,
                                           A269CliEnvPrn ,
                                           A689CliEnvAg ,
                                           Short.valueOf(A723CliEnvTp) ,
                                           A10051CliEnvMail ,
                                           A10052CliEnvFx ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV15FilterFullText ,
                                           A693CliEnvNmt ,
                                           AV55TFCliEnvNmt_Sel ,
                                           AV54TFCliEnvNmt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV26TFEmprCod = GXutil.padr( GXutil.rtrim( AV26TFEmprCod), 3, "%") ;
      lV32TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV32TFCliEnvNom), 30, "%") ;
      lV34TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV34TFCliEnvNm2), 30, "%") ;
      lV36TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV36TFCliEnvDom), 34, "%") ;
      lV38TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV38TFCliEnvDm2), 34, "%") ;
      lV40TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV40TFCliEnvPob), 30, "%") ;
      lV42TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV42TFCliEnvCp), 6, "%") ;
      lV44TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV44TFCliEnvCp2), 6, "%") ;
      lV48TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV48TFCliEnvPrn), 30, "%") ;
      lV50TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV50TFCliEnvAg), 1, "%") ;
      lV56TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV56TFCliEnvMail), 40, "%") ;
      lV58TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV58TFCliEnvFx), 20, "%") ;
      /* Using cursor H01S92 */
      pr_default.execute(0, new Object[] {lV26TFEmprCod, AV27TFEmprCod_Sel, Integer.valueOf(AV28TFCliCod), Integer.valueOf(AV29TFCliCod_To), Byte.valueOf(AV30TFCliEnvLin), Byte.valueOf(AV31TFCliEnvLin_To), lV32TFCliEnvNom, AV33TFCliEnvNom_Sel, lV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, lV36TFCliEnvDom, AV37TFCliEnvDom_Sel, lV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, lV40TFCliEnvPob, AV41TFCliEnvPob_Sel, lV42TFCliEnvCp, AV43TFCliEnvCp_Sel, lV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, Short.valueOf(AV46TFCliEnvPrv), Short.valueOf(AV47TFCliEnvPrv_To), lV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, lV50TFCliEnvAg, AV51TFCliEnvAg_Sel, Short.valueOf(AV52TFCliEnvTp), Short.valueOf(AV53TFCliEnvTp_To), lV56TFCliEnvMail, AV57TFCliEnvMail_Sel, lV58TFCliEnvFx, AV59TFCliEnvFx_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10052CliEnvFx = H01S92_A10052CliEnvFx[0] ;
         A10051CliEnvMail = H01S92_A10051CliEnvMail[0] ;
         A689CliEnvAg = H01S92_A689CliEnvAg[0] ;
         A269CliEnvPrn = H01S92_A269CliEnvPrn[0] ;
         n269CliEnvPrn = H01S92_n269CliEnvPrn[0] ;
         A270CliEnvPrv = H01S92_A270CliEnvPrv[0] ;
         A10775CliEnvCp2 = H01S92_A10775CliEnvCp2[0] ;
         A264CliEnvCp = H01S92_A264CliEnvCp[0] ;
         A268CliEnvPob = H01S92_A268CliEnvPob[0] ;
         A5530CliEnvDm2 = H01S92_A5530CliEnvDm2[0] ;
         A265CliEnvDom = H01S92_A265CliEnvDom[0] ;
         A5531CliEnvNm2 = H01S92_A5531CliEnvNm2[0] ;
         A267CliEnvNom = H01S92_A267CliEnvNom[0] ;
         A266CliEnvLin = H01S92_A266CliEnvLin[0] ;
         A252CliCod = H01S92_A252CliCod[0] ;
         A723CliEnvTp = H01S92_A723CliEnvTp[0] ;
         A396EmprCod = H01S92_A396EmprCod[0] ;
         A269CliEnvPrn = H01S92_A269CliEnvPrn[0] ;
         n269CliEnvPrn = H01S92_n269CliEnvPrn[0] ;
         GXt_char1 = A693CliEnvNmt ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A723CliEnvTp ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         clienvww_impl.this.A396EmprCod = GXv_char2[0] ;
         clienvww_impl.this.A723CliEnvTp = GXv_int3[0] ;
         clienvww_impl.this.GXt_char1 = GXv_char4[0] ;
         A693CliEnvNmt = GXt_char1 ;
         if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV54TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV55TFCliEnvNmt_Sel) == 0 ) ) )
               {
                  GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf1S92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e171S92 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
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
         subsflControlProps_372( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV27TFEmprCod_Sel ,
                                              AV26TFEmprCod ,
                                              Integer.valueOf(AV28TFCliCod) ,
                                              Integer.valueOf(AV29TFCliCod_To) ,
                                              Byte.valueOf(AV30TFCliEnvLin) ,
                                              Byte.valueOf(AV31TFCliEnvLin_To) ,
                                              AV33TFCliEnvNom_Sel ,
                                              AV32TFCliEnvNom ,
                                              AV35TFCliEnvNm2_Sel ,
                                              AV34TFCliEnvNm2 ,
                                              AV37TFCliEnvDom_Sel ,
                                              AV36TFCliEnvDom ,
                                              AV39TFCliEnvDm2_Sel ,
                                              AV38TFCliEnvDm2 ,
                                              AV41TFCliEnvPob_Sel ,
                                              AV40TFCliEnvPob ,
                                              AV43TFCliEnvCp_Sel ,
                                              AV42TFCliEnvCp ,
                                              AV45TFCliEnvCp2_Sel ,
                                              AV44TFCliEnvCp2 ,
                                              Short.valueOf(AV46TFCliEnvPrv) ,
                                              Short.valueOf(AV47TFCliEnvPrv_To) ,
                                              AV49TFCliEnvPrn_Sel ,
                                              AV48TFCliEnvPrn ,
                                              AV51TFCliEnvAg_Sel ,
                                              AV50TFCliEnvAg ,
                                              Short.valueOf(AV52TFCliEnvTp) ,
                                              Short.valueOf(AV53TFCliEnvTp_To) ,
                                              AV57TFCliEnvMail_Sel ,
                                              AV56TFCliEnvMail ,
                                              AV59TFCliEnvFx_Sel ,
                                              AV58TFCliEnvFx ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              Byte.valueOf(A266CliEnvLin) ,
                                              A267CliEnvNom ,
                                              A5531CliEnvNm2 ,
                                              A265CliEnvDom ,
                                              A5530CliEnvDm2 ,
                                              A268CliEnvPob ,
                                              A264CliEnvCp ,
                                              A10775CliEnvCp2 ,
                                              Short.valueOf(A270CliEnvPrv) ,
                                              A269CliEnvPrn ,
                                              A689CliEnvAg ,
                                              Short.valueOf(A723CliEnvTp) ,
                                              A10051CliEnvMail ,
                                              A10052CliEnvFx ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV15FilterFullText ,
                                              A693CliEnvNmt ,
                                              AV55TFCliEnvNmt_Sel ,
                                              AV54TFCliEnvNmt } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV26TFEmprCod = GXutil.padr( GXutil.rtrim( AV26TFEmprCod), 3, "%") ;
         lV32TFCliEnvNom = GXutil.padr( GXutil.rtrim( AV32TFCliEnvNom), 30, "%") ;
         lV34TFCliEnvNm2 = GXutil.padr( GXutil.rtrim( AV34TFCliEnvNm2), 30, "%") ;
         lV36TFCliEnvDom = GXutil.padr( GXutil.rtrim( AV36TFCliEnvDom), 34, "%") ;
         lV38TFCliEnvDm2 = GXutil.padr( GXutil.rtrim( AV38TFCliEnvDm2), 34, "%") ;
         lV40TFCliEnvPob = GXutil.padr( GXutil.rtrim( AV40TFCliEnvPob), 30, "%") ;
         lV42TFCliEnvCp = GXutil.padr( GXutil.rtrim( AV42TFCliEnvCp), 6, "%") ;
         lV44TFCliEnvCp2 = GXutil.padr( GXutil.rtrim( AV44TFCliEnvCp2), 6, "%") ;
         lV48TFCliEnvPrn = GXutil.padr( GXutil.rtrim( AV48TFCliEnvPrn), 30, "%") ;
         lV50TFCliEnvAg = GXutil.padr( GXutil.rtrim( AV50TFCliEnvAg), 1, "%") ;
         lV56TFCliEnvMail = GXutil.padr( GXutil.rtrim( AV56TFCliEnvMail), 40, "%") ;
         lV58TFCliEnvFx = GXutil.padr( GXutil.rtrim( AV58TFCliEnvFx), 20, "%") ;
         /* Using cursor H01S93 */
         pr_default.execute(1, new Object[] {lV26TFEmprCod, AV27TFEmprCod_Sel, Integer.valueOf(AV28TFCliCod), Integer.valueOf(AV29TFCliCod_To), Byte.valueOf(AV30TFCliEnvLin), Byte.valueOf(AV31TFCliEnvLin_To), lV32TFCliEnvNom, AV33TFCliEnvNom_Sel, lV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, lV36TFCliEnvDom, AV37TFCliEnvDom_Sel, lV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, lV40TFCliEnvPob, AV41TFCliEnvPob_Sel, lV42TFCliEnvCp, AV43TFCliEnvCp_Sel, lV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, Short.valueOf(AV46TFCliEnvPrv), Short.valueOf(AV47TFCliEnvPrv_To), lV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, lV50TFCliEnvAg, AV51TFCliEnvAg_Sel, Short.valueOf(AV52TFCliEnvTp), Short.valueOf(AV53TFCliEnvTp_To), lV56TFCliEnvMail, AV57TFCliEnvMail_Sel, lV58TFCliEnvFx, AV59TFCliEnvFx_Sel});
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10052CliEnvFx = H01S93_A10052CliEnvFx[0] ;
            A10051CliEnvMail = H01S93_A10051CliEnvMail[0] ;
            A689CliEnvAg = H01S93_A689CliEnvAg[0] ;
            A269CliEnvPrn = H01S93_A269CliEnvPrn[0] ;
            n269CliEnvPrn = H01S93_n269CliEnvPrn[0] ;
            A270CliEnvPrv = H01S93_A270CliEnvPrv[0] ;
            A10775CliEnvCp2 = H01S93_A10775CliEnvCp2[0] ;
            A264CliEnvCp = H01S93_A264CliEnvCp[0] ;
            A268CliEnvPob = H01S93_A268CliEnvPob[0] ;
            A5530CliEnvDm2 = H01S93_A5530CliEnvDm2[0] ;
            A265CliEnvDom = H01S93_A265CliEnvDom[0] ;
            A5531CliEnvNm2 = H01S93_A5531CliEnvNm2[0] ;
            A267CliEnvNom = H01S93_A267CliEnvNom[0] ;
            A266CliEnvLin = H01S93_A266CliEnvLin[0] ;
            A252CliCod = H01S93_A252CliCod[0] ;
            A723CliEnvTp = H01S93_A723CliEnvTp[0] ;
            A396EmprCod = H01S93_A396EmprCod[0] ;
            A269CliEnvPrn = H01S93_A269CliEnvPrn[0] ;
            n269CliEnvPrn = H01S93_n269CliEnvPrn[0] ;
            GXt_char1 = A693CliEnvNmt ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A723CliEnvTp ;
            GXv_char2[0] = GXt_char1 ;
            new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
            clienvww_impl.this.A396EmprCod = GXv_char4[0] ;
            clienvww_impl.this.A723CliEnvTp = GXv_int3[0] ;
            clienvww_impl.this.GXt_char1 = GXv_char2[0] ;
            A693CliEnvNmt = GXt_char1 ;
            if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A266CliEnvLin, 1, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A267CliEnvNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5531CliEnvNm2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A265CliEnvDom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5530CliEnvDm2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A268CliEnvPob) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A264CliEnvCp) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10775CliEnvCp2) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A270CliEnvPrv, 3, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A269CliEnvPrn) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A689CliEnvAg) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A723CliEnvTp, 4, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10051CliEnvMail) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10052CliEnvFx) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFCliEnvNmt)==0) ) ) || ( GXutil.like( GXutil.upper( A693CliEnvNmt) , GXutil.padr( "%" + GXutil.upper( AV54TFCliEnvNmt) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0) || ( ( GXutil.strcmp(A693CliEnvNmt, AV55TFCliEnvNmt_Sel) == 0 ) ) )
                  {
                     e181S92 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(37) ;
         wb1S90( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1S92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sGXsfl_37_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLIENVLIN"+"_"+sGXsfl_37_idx, getSecureSignedToken( sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9")));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliEnvLin, AV31TFCliEnvLin_To, AV32TFCliEnvNom, AV33TFCliEnvNom_Sel, AV34TFCliEnvNm2, AV35TFCliEnvNm2_Sel, AV36TFCliEnvDom, AV37TFCliEnvDom_Sel, AV38TFCliEnvDm2, AV39TFCliEnvDm2_Sel, AV40TFCliEnvPob, AV41TFCliEnvPob_Sel, AV42TFCliEnvCp, AV43TFCliEnvCp_Sel, AV44TFCliEnvCp2, AV45TFCliEnvCp2_Sel, AV46TFCliEnvPrv, AV47TFCliEnvPrv_To, AV48TFCliEnvPrn, AV49TFCliEnvPrn_Sel, AV50TFCliEnvAg, AV51TFCliEnvAg_Sel, AV52TFCliEnvTp, AV53TFCliEnvTp_To, AV54TFCliEnvNmt, AV55TFCliEnvNmt_Sel, AV56TFCliEnvMail, AV57TFCliEnvMail_Sel, AV58TFCliEnvFx, AV59TFCliEnvFx_Sel) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "CLIENVWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1S90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161S92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV60DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV62GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV63GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
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
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CLIENVWW");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("clienvww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e161S92 ();
      if (returnInSub) return;
   }

   public void e161S92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV68Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      clienvww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV68Station = GXt_char1 ;
      GXv_char4[0] = AV69Emprcod ;
      GXv_char2[0] = AV70Emprnom ;
      GXv_char5[0] = AV71Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char4, GXv_char2, GXv_char5) ;
      clienvww_impl.this.AV69Emprcod = GXv_char4[0] ;
      clienvww_impl.this.AV70Emprnom = GXv_char2[0] ;
      clienvww_impl.this.AV71Usurcod = GXv_char5[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Tabla CLIENV", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV60DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV60DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171S92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV6WWPContext = GXv_SdtWWPContext8[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV62GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridCurrentPage), 10, 0));
      AV63GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121S92( )
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
         AV61PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV61PageToGo) ;
      }
   }

   public void e131S92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141S92( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV26TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
            AV27TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvLin") == 0 )
         {
            AV30TFCliEnvLin = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliEnvLin", GXutil.str( AV30TFCliEnvLin, 1, 0));
            AV31TFCliEnvLin_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliEnvLin_To", GXutil.str( AV31TFCliEnvLin_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvNom") == 0 )
         {
            AV32TFCliEnvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliEnvNom", AV32TFCliEnvNom);
            AV33TFCliEnvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliEnvNom_Sel", AV33TFCliEnvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvNm2") == 0 )
         {
            AV34TFCliEnvNm2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliEnvNm2", AV34TFCliEnvNm2);
            AV35TFCliEnvNm2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliEnvNm2_Sel", AV35TFCliEnvNm2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvDom") == 0 )
         {
            AV36TFCliEnvDom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliEnvDom", AV36TFCliEnvDom);
            AV37TFCliEnvDom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliEnvDom_Sel", AV37TFCliEnvDom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvDm2") == 0 )
         {
            AV38TFCliEnvDm2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliEnvDm2", AV38TFCliEnvDm2);
            AV39TFCliEnvDm2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliEnvDm2_Sel", AV39TFCliEnvDm2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvPob") == 0 )
         {
            AV40TFCliEnvPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCliEnvPob", AV40TFCliEnvPob);
            AV41TFCliEnvPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliEnvPob_Sel", AV41TFCliEnvPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvCp") == 0 )
         {
            AV42TFCliEnvCp = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliEnvCp", AV42TFCliEnvCp);
            AV43TFCliEnvCp_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliEnvCp_Sel", AV43TFCliEnvCp_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvCp2") == 0 )
         {
            AV44TFCliEnvCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliEnvCp2", AV44TFCliEnvCp2);
            AV45TFCliEnvCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliEnvCp2_Sel", AV45TFCliEnvCp2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvPrv") == 0 )
         {
            AV46TFCliEnvPrv = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFCliEnvPrv), 3, 0));
            AV47TFCliEnvPrv_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliEnvPrv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliEnvPrv_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvPrn") == 0 )
         {
            AV48TFCliEnvPrn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliEnvPrn", AV48TFCliEnvPrn);
            AV49TFCliEnvPrn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliEnvPrn_Sel", AV49TFCliEnvPrn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvAg") == 0 )
         {
            AV50TFCliEnvAg = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliEnvAg", AV50TFCliEnvAg);
            AV51TFCliEnvAg_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliEnvAg_Sel", AV51TFCliEnvAg_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvTp") == 0 )
         {
            AV52TFCliEnvTp = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliEnvTp), 4, 0));
            AV53TFCliEnvTp_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCliEnvTp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFCliEnvTp_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvNmt") == 0 )
         {
            AV54TFCliEnvNmt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCliEnvNmt", AV54TFCliEnvNmt);
            AV55TFCliEnvNmt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliEnvNmt_Sel", AV55TFCliEnvNmt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvMail") == 0 )
         {
            AV56TFCliEnvMail = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliEnvMail", AV56TFCliEnvMail);
            AV57TFCliEnvMail_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliEnvMail_Sel", AV57TFCliEnvMail_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliEnvFx") == 0 )
         {
            AV58TFCliEnvFx = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliEnvFx", AV58TFCliEnvFx);
            AV59TFCliEnvFx_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliEnvFx_Sel", AV59TFCliEnvFx_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181S92( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(37) ;
         }
         sendrow_372( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
      {
         httpContext.doAjaxLoad(37, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV64GridActions, 4, 0)) );
   }

   public void e111S92( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CLIENVWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV67Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CLIENVWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CLIENVWWFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         clienvww_impl.this.GXt_char1 = GXv_char5[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e151S92( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.clienv", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","CliCod","CliEnvLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CLIENVWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
      AV27TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
      AV28TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
      AV29TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
      AV30TFCliEnvLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliEnvLin", GXutil.str( AV30TFCliEnvLin, 1, 0));
      AV31TFCliEnvLin_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliEnvLin_To", GXutil.str( AV31TFCliEnvLin_To, 1, 0));
      AV32TFCliEnvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliEnvNom", AV32TFCliEnvNom);
      AV33TFCliEnvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliEnvNom_Sel", AV33TFCliEnvNom_Sel);
      AV34TFCliEnvNm2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliEnvNm2", AV34TFCliEnvNm2);
      AV35TFCliEnvNm2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliEnvNm2_Sel", AV35TFCliEnvNm2_Sel);
      AV36TFCliEnvDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliEnvDom", AV36TFCliEnvDom);
      AV37TFCliEnvDom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliEnvDom_Sel", AV37TFCliEnvDom_Sel);
      AV38TFCliEnvDm2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliEnvDm2", AV38TFCliEnvDm2);
      AV39TFCliEnvDm2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliEnvDm2_Sel", AV39TFCliEnvDm2_Sel);
      AV40TFCliEnvPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFCliEnvPob", AV40TFCliEnvPob);
      AV41TFCliEnvPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliEnvPob_Sel", AV41TFCliEnvPob_Sel);
      AV42TFCliEnvCp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliEnvCp", AV42TFCliEnvCp);
      AV43TFCliEnvCp_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliEnvCp_Sel", AV43TFCliEnvCp_Sel);
      AV44TFCliEnvCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliEnvCp2", AV44TFCliEnvCp2);
      AV45TFCliEnvCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliEnvCp2_Sel", AV45TFCliEnvCp2_Sel);
      AV46TFCliEnvPrv = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFCliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFCliEnvPrv), 3, 0));
      AV47TFCliEnvPrv_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliEnvPrv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliEnvPrv_To), 3, 0));
      AV48TFCliEnvPrn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliEnvPrn", AV48TFCliEnvPrn);
      AV49TFCliEnvPrn_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliEnvPrn_Sel", AV49TFCliEnvPrn_Sel);
      AV50TFCliEnvAg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliEnvAg", AV50TFCliEnvAg);
      AV51TFCliEnvAg_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliEnvAg_Sel", AV51TFCliEnvAg_Sel);
      AV52TFCliEnvTp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliEnvTp), 4, 0));
      AV53TFCliEnvTp_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFCliEnvTp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFCliEnvTp_To), 4, 0));
      AV54TFCliEnvNmt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFCliEnvNmt", AV54TFCliEnvNmt);
      AV55TFCliEnvNmt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliEnvNmt_Sel", AV55TFCliEnvNmt_Sel);
      AV56TFCliEnvMail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliEnvMail", AV56TFCliEnvMail);
      AV57TFCliEnvMail_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliEnvMail_Sel", AV57TFCliEnvMail_Sel);
      AV58TFCliEnvFx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliEnvFx", AV58TFCliEnvFx);
      AV59TFCliEnvFx_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliEnvFx_Sel", AV59TFCliEnvFx_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S182( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.clienv", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A266CliEnvLin,1,0))}, new String[] {"Mode","EmprCod","CliCod","CliEnvLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S192( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.clienv", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A266CliEnvLin,1,0))}, new String[] {"Mode","EmprCod","CliCod","CliEnvLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV67Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV67Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV67Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV26TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV27TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVLIN") == 0 )
         {
            AV30TFCliEnvLin = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliEnvLin", GXutil.str( AV30TFCliEnvLin, 1, 0));
            AV31TFCliEnvLin_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliEnvLin_To", GXutil.str( AV31TFCliEnvLin_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNOM") == 0 )
         {
            AV32TFCliEnvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliEnvNom", AV32TFCliEnvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNOM_SEL") == 0 )
         {
            AV33TFCliEnvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliEnvNom_Sel", AV33TFCliEnvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNM2") == 0 )
         {
            AV34TFCliEnvNm2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliEnvNm2", AV34TFCliEnvNm2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNM2_SEL") == 0 )
         {
            AV35TFCliEnvNm2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliEnvNm2_Sel", AV35TFCliEnvNm2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDOM") == 0 )
         {
            AV36TFCliEnvDom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliEnvDom", AV36TFCliEnvDom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDOM_SEL") == 0 )
         {
            AV37TFCliEnvDom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliEnvDom_Sel", AV37TFCliEnvDom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDM2") == 0 )
         {
            AV38TFCliEnvDm2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCliEnvDm2", AV38TFCliEnvDm2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVDM2_SEL") == 0 )
         {
            AV39TFCliEnvDm2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCliEnvDm2_Sel", AV39TFCliEnvDm2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPOB") == 0 )
         {
            AV40TFCliEnvPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCliEnvPob", AV40TFCliEnvPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPOB_SEL") == 0 )
         {
            AV41TFCliEnvPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliEnvPob_Sel", AV41TFCliEnvPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP") == 0 )
         {
            AV42TFCliEnvCp = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliEnvCp", AV42TFCliEnvCp);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP_SEL") == 0 )
         {
            AV43TFCliEnvCp_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliEnvCp_Sel", AV43TFCliEnvCp_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP2") == 0 )
         {
            AV44TFCliEnvCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliEnvCp2", AV44TFCliEnvCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVCP2_SEL") == 0 )
         {
            AV45TFCliEnvCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliEnvCp2_Sel", AV45TFCliEnvCp2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRV") == 0 )
         {
            AV46TFCliEnvPrv = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCliEnvPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFCliEnvPrv), 3, 0));
            AV47TFCliEnvPrv_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCliEnvPrv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFCliEnvPrv_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRN") == 0 )
         {
            AV48TFCliEnvPrn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCliEnvPrn", AV48TFCliEnvPrn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVPRN_SEL") == 0 )
         {
            AV49TFCliEnvPrn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliEnvPrn_Sel", AV49TFCliEnvPrn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVAG") == 0 )
         {
            AV50TFCliEnvAg = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliEnvAg", AV50TFCliEnvAg);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVAG_SEL") == 0 )
         {
            AV51TFCliEnvAg_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliEnvAg_Sel", AV51TFCliEnvAg_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVTP") == 0 )
         {
            AV52TFCliEnvTp = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliEnvTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliEnvTp), 4, 0));
            AV53TFCliEnvTp_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCliEnvTp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFCliEnvTp_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNMT") == 0 )
         {
            AV54TFCliEnvNmt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCliEnvNmt", AV54TFCliEnvNmt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVNMT_SEL") == 0 )
         {
            AV55TFCliEnvNmt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliEnvNmt_Sel", AV55TFCliEnvNmt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVMAIL") == 0 )
         {
            AV56TFCliEnvMail = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliEnvMail", AV56TFCliEnvMail);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVMAIL_SEL") == 0 )
         {
            AV57TFCliEnvMail_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliEnvMail_Sel", AV57TFCliEnvMail_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVFX") == 0 )
         {
            AV58TFCliEnvFx = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliEnvFx", AV58TFCliEnvFx);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIENVFX_SEL") == 0 )
         {
            AV59TFCliEnvFx_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliEnvFx_Sel", AV59TFCliEnvFx_Sel);
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, GXv_char5) ;
      clienvww_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0), AV33TFCliEnvNom_Sel, GXv_char4) ;
      clienvww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char2[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0), AV35TFCliEnvNm2_Sel, GXv_char2) ;
      clienvww_impl.this.GXt_char12 = GXv_char2[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0), AV37TFCliEnvDom_Sel, GXv_char14) ;
      clienvww_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0), AV39TFCliEnvDm2_Sel, GXv_char16) ;
      clienvww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0), AV41TFCliEnvPob_Sel, GXv_char18) ;
      clienvww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0), AV43TFCliEnvCp_Sel, GXv_char20) ;
      clienvww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0), AV45TFCliEnvCp2_Sel, GXv_char22) ;
      clienvww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0), AV49TFCliEnvPrn_Sel, GXv_char24) ;
      clienvww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0), AV51TFCliEnvAg_Sel, GXv_char26) ;
      clienvww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0), AV55TFCliEnvNmt_Sel, GXv_char28) ;
      clienvww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0), AV57TFCliEnvMail_Sel, GXv_char30) ;
      clienvww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0), AV59TFCliEnvFx_Sel, GXv_char32) ;
      clienvww_impl.this.GXt_char31 = GXv_char32[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char11+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char15+"|"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"||"+GXt_char23+"|"+GXt_char25+"||"+GXt_char27+"|"+GXt_char29+"|"+GXt_char31 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFEmprCod)==0), AV26TFEmprCod, GXv_char32) ;
      clienvww_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliEnvNom)==0), AV32TFCliEnvNom, GXv_char30) ;
      clienvww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliEnvNm2)==0), AV34TFCliEnvNm2, GXv_char28) ;
      clienvww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFCliEnvDom)==0), AV36TFCliEnvDom, GXv_char26) ;
      clienvww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCliEnvDm2)==0), AV38TFCliEnvDm2, GXv_char24) ;
      clienvww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCliEnvPob)==0), AV40TFCliEnvPob, GXv_char22) ;
      clienvww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFCliEnvCp)==0), AV42TFCliEnvCp, GXv_char20) ;
      clienvww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFCliEnvCp2)==0), AV44TFCliEnvCp2, GXv_char18) ;
      clienvww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFCliEnvPrn)==0), AV48TFCliEnvPrn, GXv_char16) ;
      clienvww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFCliEnvAg)==0), AV50TFCliEnvAg, GXv_char14) ;
      clienvww_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFCliEnvNmt)==0), AV54TFCliEnvNmt, GXv_char5) ;
      clienvww_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFCliEnvMail)==0), AV56TFCliEnvMail, GXv_char4) ;
      clienvww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFCliEnvFx)==0), AV58TFCliEnvFx, GXv_char2) ;
      clienvww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char31+"|"+((0==AV28TFCliCod) ? "" : GXutil.str( AV28TFCliCod, 6, 0))+"|"+((0==AV30TFCliEnvLin) ? "" : GXutil.str( AV30TFCliEnvLin, 1, 0))+"|"+GXt_char29+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char19+"|"+GXt_char17+"|"+((0==AV46TFCliEnvPrv) ? "" : GXutil.str( AV46TFCliEnvPrv, 3, 0))+"|"+GXt_char15+"|"+GXt_char13+"|"+((0==AV52TFCliEnvTp) ? "" : GXutil.str( AV52TFCliEnvTp, 4, 0))+"|"+GXt_char12+"|"+GXt_char11+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFCliCod_To) ? "" : GXutil.str( AV29TFCliCod_To, 6, 0))+"|"+((0==AV31TFCliEnvLin_To) ? "" : GXutil.str( AV31TFCliEnvLin_To, 1, 0))+"||||||||"+((0==AV47TFCliEnvPrv_To) ? "" : GXutil.str( AV47TFCliEnvPrv_To, 3, 0))+"|||"+((0==AV53TFCliEnvTp_To) ? "" : GXutil.str( AV53TFCliEnvTp_To, 4, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV67Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFEMPRCOD", "", !(GXutil.strcmp("", AV26TFEmprCod)==0), (short)(0), AV26TFEmprCod, "", !(GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLICOD", "", !((0==AV28TFCliCod)&&(0==AV29TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVLIN", "", !((0==AV30TFCliEnvLin)&&(0==AV31TFCliEnvLin_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliEnvLin, 1, 0)), GXutil.trim( GXutil.str( AV31TFCliEnvLin_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVNOM", "", !(GXutil.strcmp("", AV32TFCliEnvNom)==0), (short)(0), AV32TFCliEnvNom, "", !(GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0), AV33TFCliEnvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVNM2", "", !(GXutil.strcmp("", AV34TFCliEnvNm2)==0), (short)(0), AV34TFCliEnvNm2, "", !(GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0), AV35TFCliEnvNm2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVDOM", "", !(GXutil.strcmp("", AV36TFCliEnvDom)==0), (short)(0), AV36TFCliEnvDom, "", !(GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0), AV37TFCliEnvDom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVDM2", "", !(GXutil.strcmp("", AV38TFCliEnvDm2)==0), (short)(0), AV38TFCliEnvDm2, "", !(GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0), AV39TFCliEnvDm2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVPOB", "", !(GXutil.strcmp("", AV40TFCliEnvPob)==0), (short)(0), AV40TFCliEnvPob, "", !(GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0), AV41TFCliEnvPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVCP", "", !(GXutil.strcmp("", AV42TFCliEnvCp)==0), (short)(0), AV42TFCliEnvCp, "", !(GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0), AV43TFCliEnvCp_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVCP2", "", !(GXutil.strcmp("", AV44TFCliEnvCp2)==0), (short)(0), AV44TFCliEnvCp2, "", !(GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0), AV45TFCliEnvCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVPRV", "", !((0==AV46TFCliEnvPrv)&&(0==AV47TFCliEnvPrv_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFCliEnvPrv, 3, 0)), GXutil.trim( GXutil.str( AV47TFCliEnvPrv_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVPRN", "", !(GXutil.strcmp("", AV48TFCliEnvPrn)==0), (short)(0), AV48TFCliEnvPrn, "", !(GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0), AV49TFCliEnvPrn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVAG", "", !(GXutil.strcmp("", AV50TFCliEnvAg)==0), (short)(0), AV50TFCliEnvAg, "", !(GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0), AV51TFCliEnvAg_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVTP", "", !((0==AV52TFCliEnvTp)&&(0==AV53TFCliEnvTp_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFCliEnvTp, 4, 0)), GXutil.trim( GXutil.str( AV53TFCliEnvTp_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVNMT", "", !(GXutil.strcmp("", AV54TFCliEnvNmt)==0), (short)(0), AV54TFCliEnvNmt, "", !(GXutil.strcmp("", AV55TFCliEnvNmt_Sel)==0), AV55TFCliEnvNmt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVMAIL", "", !(GXutil.strcmp("", AV56TFCliEnvMail)==0), (short)(0), AV56TFCliEnvMail, "", !(GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0), AV57TFCliEnvMail_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLIENVFX", "", !(GXutil.strcmp("", AV58TFCliEnvFx)==0), (short)(0), AV58TFCliEnvFx, "", !(GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0), AV59TFCliEnvFx_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV67Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "CLIENV" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_19_1S92( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_24_1S92( true) ;
      }
      else
      {
         wb_table2_24_1S92( false) ;
      }
      return  ;
   }

   public void wb_table2_24_1S92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1S92e( true) ;
      }
      else
      {
         wb_table1_19_1S92e( false) ;
      }
   }

   public void wb_table2_24_1S92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CLIENVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_24_1S92e( true) ;
      }
      else
      {
         wb_table2_24_1S92e( false) ;
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
      pa1S92( ) ;
      ws1S92( ) ;
      we1S92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613578", true, true);
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
      httpContext.AddJavascriptSource("clienvww.js", "?20268211613578", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_37_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_37_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_37_idx ;
      edtCliEnvLin_Internalname = "CLIENVLIN_"+sGXsfl_37_idx ;
      edtCliEnvNom_Internalname = "CLIENVNOM_"+sGXsfl_37_idx ;
      edtCliEnvNm2_Internalname = "CLIENVNM2_"+sGXsfl_37_idx ;
      edtCliEnvDom_Internalname = "CLIENVDOM_"+sGXsfl_37_idx ;
      edtCliEnvDm2_Internalname = "CLIENVDM2_"+sGXsfl_37_idx ;
      edtCliEnvPob_Internalname = "CLIENVPOB_"+sGXsfl_37_idx ;
      edtCliEnvCp_Internalname = "CLIENVCP_"+sGXsfl_37_idx ;
      edtCliEnvCp2_Internalname = "CLIENVCP2_"+sGXsfl_37_idx ;
      edtCliEnvPrv_Internalname = "CLIENVPRV_"+sGXsfl_37_idx ;
      edtCliEnvPrn_Internalname = "CLIENVPRN_"+sGXsfl_37_idx ;
      edtCliEnvAg_Internalname = "CLIENVAG_"+sGXsfl_37_idx ;
      edtCliEnvTp_Internalname = "CLIENVTP_"+sGXsfl_37_idx ;
      edtCliEnvNmt_Internalname = "CLIENVNMT_"+sGXsfl_37_idx ;
      edtCliEnvMail_Internalname = "CLIENVMAIL_"+sGXsfl_37_idx ;
      edtCliEnvFx_Internalname = "CLIENVFX_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_37_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_37_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_37_fel_idx ;
      edtCliEnvLin_Internalname = "CLIENVLIN_"+sGXsfl_37_fel_idx ;
      edtCliEnvNom_Internalname = "CLIENVNOM_"+sGXsfl_37_fel_idx ;
      edtCliEnvNm2_Internalname = "CLIENVNM2_"+sGXsfl_37_fel_idx ;
      edtCliEnvDom_Internalname = "CLIENVDOM_"+sGXsfl_37_fel_idx ;
      edtCliEnvDm2_Internalname = "CLIENVDM2_"+sGXsfl_37_fel_idx ;
      edtCliEnvPob_Internalname = "CLIENVPOB_"+sGXsfl_37_fel_idx ;
      edtCliEnvCp_Internalname = "CLIENVCP_"+sGXsfl_37_fel_idx ;
      edtCliEnvCp2_Internalname = "CLIENVCP2_"+sGXsfl_37_fel_idx ;
      edtCliEnvPrv_Internalname = "CLIENVPRV_"+sGXsfl_37_fel_idx ;
      edtCliEnvPrn_Internalname = "CLIENVPRN_"+sGXsfl_37_fel_idx ;
      edtCliEnvAg_Internalname = "CLIENVAG_"+sGXsfl_37_fel_idx ;
      edtCliEnvTp_Internalname = "CLIENVTP_"+sGXsfl_37_fel_idx ;
      edtCliEnvNmt_Internalname = "CLIENVNMT_"+sGXsfl_37_fel_idx ;
      edtCliEnvMail_Internalname = "CLIENVMAIL_"+sGXsfl_37_fel_idx ;
      edtCliEnvFx_Internalname = "CLIENVFX_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb1S90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_37_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV64GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV64GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV64GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e191s92_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV64GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_37_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvLin_Internalname,GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNom_Internalname,GXutil.rtrim( A267CliEnvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNm2_Internalname,GXutil.rtrim( A5531CliEnvNm2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvDom_Internalname,GXutil.rtrim( A265CliEnvDom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvDm2_Internalname,GXutil.rtrim( A5530CliEnvDm2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvDm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPob_Internalname,GXutil.rtrim( A268CliEnvPob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvCp_Internalname,GXutil.rtrim( A264CliEnvCp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvCp2_Internalname,GXutil.rtrim( A10775CliEnvCp2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPrv_Internalname,GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A270CliEnvPrv), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPrn_Internalname,GXutil.rtrim( A269CliEnvPrn),GXutil.rtrim( localUtil.format( A269CliEnvPrn, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvAg_Internalname,GXutil.rtrim( A689CliEnvAg),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvAg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvTp_Internalname,GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A723CliEnvTp), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNmt_Internalname,GXutil.rtrim( A693CliEnvNmt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNmt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvMail_Internalname,GXutil.rtrim( A10051CliEnvMail),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvMail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvFx_Internalname,GXutil.rtrim( A10052CliEnvFx),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvFx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1S92( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Direccion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Direccion (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Poblacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Postal (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Provincia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CliEnvPrn", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agencia?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mail", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fax", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A267CliEnvNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5531CliEnvNm2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A265CliEnvDom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5530CliEnvDm2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A268CliEnvPob));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A264CliEnvCp));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10775CliEnvCp2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A269CliEnvPrn));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A689CliEnvAg));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A693CliEnvNmt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10051CliEnvMail));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10052CliEnvFx));
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
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliEnvLin_Internalname = "CLIENVLIN" ;
      edtCliEnvNom_Internalname = "CLIENVNOM" ;
      edtCliEnvNm2_Internalname = "CLIENVNM2" ;
      edtCliEnvDom_Internalname = "CLIENVDOM" ;
      edtCliEnvDm2_Internalname = "CLIENVDM2" ;
      edtCliEnvPob_Internalname = "CLIENVPOB" ;
      edtCliEnvCp_Internalname = "CLIENVCP" ;
      edtCliEnvCp2_Internalname = "CLIENVCP2" ;
      edtCliEnvPrv_Internalname = "CLIENVPRV" ;
      edtCliEnvPrn_Internalname = "CLIENVPRN" ;
      edtCliEnvAg_Internalname = "CLIENVAG" ;
      edtCliEnvTp_Internalname = "CLIENVTP" ;
      edtCliEnvNmt_Internalname = "CLIENVNMT" ;
      edtCliEnvMail_Internalname = "CLIENVMAIL" ;
      edtCliEnvFx_Internalname = "CLIENVFX" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      edtCliEnvFx_Jsonclick = "" ;
      edtCliEnvMail_Jsonclick = "" ;
      edtCliEnvNmt_Jsonclick = "" ;
      edtCliEnvTp_Jsonclick = "" ;
      edtCliEnvAg_Jsonclick = "" ;
      edtCliEnvPrn_Jsonclick = "" ;
      edtCliEnvPrv_Jsonclick = "" ;
      edtCliEnvCp2_Jsonclick = "" ;
      edtCliEnvCp_Jsonclick = "" ;
      edtCliEnvPob_Jsonclick = "" ;
      edtCliEnvDm2_Jsonclick = "" ;
      edtCliEnvDom_Jsonclick = "" ;
      edtCliEnvNm2_Jsonclick = "" ;
      edtCliEnvNom_Jsonclick = "" ;
      edtCliEnvLin_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "CLIENVWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|||T|T|T|T|T|T|T||T|T||T|T|T" ;
      Ddo_grid_Filterisrange = "|T|T||||||||T|||T|||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Character|Character|Character|Character|Character|Character|Numeric|Character|Character|Numeric|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|1|5|6|7|8|9|10|11|12|13|14||15|16" ;
      Ddo_grid_Columnids = "1:EmprCod|2:CliCod|3:CliEnvLin|4:CliEnvNom|5:CliEnvNm2|6:CliEnvDom|7:CliEnvDm2|8:CliEnvPob|9:CliEnvCp|10:CliEnvCp2|11:CliEnvPrv|12:CliEnvPrn|13:CliEnvAg|14:CliEnvTp|15:CliEnvNmt|16:CliEnvMail|17:CliEnvFx" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Tabla CLIENV", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_37_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV64GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV64GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV62GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV63GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121S92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131S92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141S92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181S92',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111S92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliEnvLin',fld:'vTFCLIENVLIN',pic:'9'},{av:'AV31TFCliEnvLin_To',fld:'vTFCLIENVLIN_TO',pic:'9'},{av:'AV32TFCliEnvNom',fld:'vTFCLIENVNOM',pic:''},{av:'AV33TFCliEnvNom_Sel',fld:'vTFCLIENVNOM_SEL',pic:''},{av:'AV34TFCliEnvNm2',fld:'vTFCLIENVNM2',pic:''},{av:'AV35TFCliEnvNm2_Sel',fld:'vTFCLIENVNM2_SEL',pic:''},{av:'AV36TFCliEnvDom',fld:'vTFCLIENVDOM',pic:''},{av:'AV37TFCliEnvDom_Sel',fld:'vTFCLIENVDOM_SEL',pic:''},{av:'AV38TFCliEnvDm2',fld:'vTFCLIENVDM2',pic:''},{av:'AV39TFCliEnvDm2_Sel',fld:'vTFCLIENVDM2_SEL',pic:''},{av:'AV40TFCliEnvPob',fld:'vTFCLIENVPOB',pic:''},{av:'AV41TFCliEnvPob_Sel',fld:'vTFCLIENVPOB_SEL',pic:''},{av:'AV42TFCliEnvCp',fld:'vTFCLIENVCP',pic:''},{av:'AV43TFCliEnvCp_Sel',fld:'vTFCLIENVCP_SEL',pic:''},{av:'AV44TFCliEnvCp2',fld:'vTFCLIENVCP2',pic:''},{av:'AV45TFCliEnvCp2_Sel',fld:'vTFCLIENVCP2_SEL',pic:''},{av:'AV46TFCliEnvPrv',fld:'vTFCLIENVPRV',pic:'ZZ9'},{av:'AV47TFCliEnvPrv_To',fld:'vTFCLIENVPRV_TO',pic:'ZZ9'},{av:'AV48TFCliEnvPrn',fld:'vTFCLIENVPRN',pic:'@!'},{av:'AV49TFCliEnvPrn_Sel',fld:'vTFCLIENVPRN_SEL',pic:'@!'},{av:'AV50TFCliEnvAg',fld:'vTFCLIENVAG',pic:''},{av:'AV51TFCliEnvAg_Sel',fld:'vTFCLIENVAG_SEL',pic:''},{av:'AV52TFCliEnvTp',fld:'vTFCLIENVTP',pic:'ZZZ9'},{av:'AV53TFCliEnvTp_To',fld:'vTFCLIENVTP_TO',pic:'ZZZ9'},{av:'AV54TFCliEnvNmt',fld:'vTFCLIENVNMT',pic:''},{av:'AV55TFCliEnvNmt_Sel',fld:'vTFCLIENVNMT_SEL',pic:''},{av:'AV56TFCliEnvMail',fld:'vTFCLIENVMAIL',pic:''},{av:'AV57TFCliEnvMail_Sel',fld:'vTFCLIENVMAIL_SEL',pic:''},{av:'AV58TFCliEnvFx',fld:'vTFCLIENVFX',pic:''},{av:'AV59TFCliEnvFx_Sel',fld:'vTFCLIENVFX_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV62GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV63GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e191S92',iparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A266CliEnvLin',fld:'CLIENVLIN',pic:'9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV64GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e151S92',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A266CliEnvLin',fld:'CLIENVLIN',pic:'9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLIENVLIN","{handler:'valid_Clienvlin',iparms:[]");
      setEventMetadata("VALID_CLIENVLIN",",oparms:[]}");
      setEventMetadata("VALID_CLIENVNOM","{handler:'valid_Clienvnom',iparms:[]");
      setEventMetadata("VALID_CLIENVNOM",",oparms:[]}");
      setEventMetadata("VALID_CLIENVNM2","{handler:'valid_Clienvnm2',iparms:[]");
      setEventMetadata("VALID_CLIENVNM2",",oparms:[]}");
      setEventMetadata("VALID_CLIENVDOM","{handler:'valid_Clienvdom',iparms:[]");
      setEventMetadata("VALID_CLIENVDOM",",oparms:[]}");
      setEventMetadata("VALID_CLIENVDM2","{handler:'valid_Clienvdm2',iparms:[]");
      setEventMetadata("VALID_CLIENVDM2",",oparms:[]}");
      setEventMetadata("VALID_CLIENVPOB","{handler:'valid_Clienvpob',iparms:[]");
      setEventMetadata("VALID_CLIENVPOB",",oparms:[]}");
      setEventMetadata("VALID_CLIENVCP","{handler:'valid_Clienvcp',iparms:[]");
      setEventMetadata("VALID_CLIENVCP",",oparms:[]}");
      setEventMetadata("VALID_CLIENVCP2","{handler:'valid_Clienvcp2',iparms:[]");
      setEventMetadata("VALID_CLIENVCP2",",oparms:[]}");
      setEventMetadata("VALID_CLIENVPRV","{handler:'valid_Clienvprv',iparms:[]");
      setEventMetadata("VALID_CLIENVPRV",",oparms:[]}");
      setEventMetadata("VALID_CLIENVPRN","{handler:'valid_Clienvprn',iparms:[]");
      setEventMetadata("VALID_CLIENVPRN",",oparms:[]}");
      setEventMetadata("VALID_CLIENVAG","{handler:'valid_Clienvag',iparms:[]");
      setEventMetadata("VALID_CLIENVAG",",oparms:[]}");
      setEventMetadata("VALID_CLIENVTP","{handler:'valid_Clienvtp',iparms:[]");
      setEventMetadata("VALID_CLIENVTP",",oparms:[]}");
      setEventMetadata("VALID_CLIENVNMT","{handler:'valid_Clienvnmt',iparms:[]");
      setEventMetadata("VALID_CLIENVNMT",",oparms:[]}");
      setEventMetadata("VALID_CLIENVMAIL","{handler:'valid_Clienvmail',iparms:[]");
      setEventMetadata("VALID_CLIENVMAIL",",oparms:[]}");
      setEventMetadata("VALID_CLIENVFX","{handler:'valid_Clienvfx',iparms:[]");
      setEventMetadata("VALID_CLIENVFX",",oparms:[]}");
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
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15FilterFullText = "" ;
      AV67Pgmname = "" ;
      AV26TFEmprCod = "" ;
      AV27TFEmprCod_Sel = "" ;
      AV32TFCliEnvNom = "" ;
      AV33TFCliEnvNom_Sel = "" ;
      AV34TFCliEnvNm2 = "" ;
      AV35TFCliEnvNm2_Sel = "" ;
      AV36TFCliEnvDom = "" ;
      AV37TFCliEnvDom_Sel = "" ;
      AV38TFCliEnvDm2 = "" ;
      AV39TFCliEnvDm2_Sel = "" ;
      AV40TFCliEnvPob = "" ;
      AV41TFCliEnvPob_Sel = "" ;
      AV42TFCliEnvCp = "" ;
      AV43TFCliEnvCp_Sel = "" ;
      AV44TFCliEnvCp2 = "" ;
      AV45TFCliEnvCp2_Sel = "" ;
      AV48TFCliEnvPrn = "" ;
      AV49TFCliEnvPrn_Sel = "" ;
      AV50TFCliEnvAg = "" ;
      AV51TFCliEnvAg_Sel = "" ;
      AV54TFCliEnvNmt = "" ;
      AV55TFCliEnvNmt_Sel = "" ;
      AV56TFCliEnvMail = "" ;
      AV57TFCliEnvMail_Sel = "" ;
      AV58TFCliEnvFx = "" ;
      AV59TFCliEnvFx_Sel = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV60DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A269CliEnvPrn = "" ;
      A689CliEnvAg = "" ;
      A693CliEnvNmt = "" ;
      A10051CliEnvMail = "" ;
      A10052CliEnvFx = "" ;
      scmdbuf = "" ;
      lV15FilterFullText = "" ;
      lV26TFEmprCod = "" ;
      lV32TFCliEnvNom = "" ;
      lV34TFCliEnvNm2 = "" ;
      lV36TFCliEnvDom = "" ;
      lV38TFCliEnvDm2 = "" ;
      lV40TFCliEnvPob = "" ;
      lV42TFCliEnvCp = "" ;
      lV44TFCliEnvCp2 = "" ;
      lV48TFCliEnvPrn = "" ;
      lV50TFCliEnvAg = "" ;
      lV56TFCliEnvMail = "" ;
      lV58TFCliEnvFx = "" ;
      H01S92_A10052CliEnvFx = new String[] {""} ;
      H01S92_A10051CliEnvMail = new String[] {""} ;
      H01S92_A689CliEnvAg = new String[] {""} ;
      H01S92_A269CliEnvPrn = new String[] {""} ;
      H01S92_n269CliEnvPrn = new boolean[] {false} ;
      H01S92_A270CliEnvPrv = new short[1] ;
      H01S92_A10775CliEnvCp2 = new String[] {""} ;
      H01S92_A264CliEnvCp = new String[] {""} ;
      H01S92_A268CliEnvPob = new String[] {""} ;
      H01S92_A5530CliEnvDm2 = new String[] {""} ;
      H01S92_A265CliEnvDom = new String[] {""} ;
      H01S92_A5531CliEnvNm2 = new String[] {""} ;
      H01S92_A267CliEnvNom = new String[] {""} ;
      H01S92_A266CliEnvLin = new byte[1] ;
      H01S92_A252CliCod = new int[1] ;
      H01S92_A723CliEnvTp = new short[1] ;
      H01S92_A396EmprCod = new String[] {""} ;
      H01S93_A10052CliEnvFx = new String[] {""} ;
      H01S93_A10051CliEnvMail = new String[] {""} ;
      H01S93_A689CliEnvAg = new String[] {""} ;
      H01S93_A269CliEnvPrn = new String[] {""} ;
      H01S93_n269CliEnvPrn = new boolean[] {false} ;
      H01S93_A270CliEnvPrv = new short[1] ;
      H01S93_A10775CliEnvCp2 = new String[] {""} ;
      H01S93_A264CliEnvCp = new String[] {""} ;
      H01S93_A268CliEnvPob = new String[] {""} ;
      H01S93_A5530CliEnvDm2 = new String[] {""} ;
      H01S93_A265CliEnvDom = new String[] {""} ;
      H01S93_A5531CliEnvNm2 = new String[] {""} ;
      H01S93_A267CliEnvNom = new String[] {""} ;
      H01S93_A266CliEnvLin = new byte[1] ;
      H01S93_A252CliCod = new int[1] ;
      H01S93_A723CliEnvTp = new short[1] ;
      H01S93_A396EmprCod = new String[] {""} ;
      GXv_int3 = new short[1] ;
      hsh = "" ;
      AV68Station = "" ;
      AV69Emprcod = "" ;
      AV70Emprnom = "" ;
      AV71Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection[1] ;
      AV22Session = httpContext.getWebSession();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.clienvww__default(),
         new Object[] {
             new Object[] {
            H01S92_A10052CliEnvFx, H01S92_A10051CliEnvMail, H01S92_A689CliEnvAg, H01S92_A269CliEnvPrn, H01S92_n269CliEnvPrn, H01S92_A270CliEnvPrv, H01S92_A10775CliEnvCp2, H01S92_A264CliEnvCp, H01S92_A268CliEnvPob, H01S92_A5530CliEnvDm2,
            H01S92_A265CliEnvDom, H01S92_A5531CliEnvNm2, H01S92_A267CliEnvNom, H01S92_A266CliEnvLin, H01S92_A252CliCod, H01S92_A723CliEnvTp, H01S92_A396EmprCod
            }
            , new Object[] {
            H01S93_A10052CliEnvFx, H01S93_A10051CliEnvMail, H01S93_A689CliEnvAg, H01S93_A269CliEnvPrn, H01S93_n269CliEnvPrn, H01S93_A270CliEnvPrv, H01S93_A10775CliEnvCp2, H01S93_A264CliEnvCp, H01S93_A268CliEnvPob, H01S93_A5530CliEnvDm2,
            H01S93_A265CliEnvDom, H01S93_A5531CliEnvNm2, H01S93_A267CliEnvNom, H01S93_A266CliEnvLin, H01S93_A252CliCod, H01S93_A723CliEnvTp, H01S93_A396EmprCod
            }
         }
      );
      AV67Pgmname = "CLIENVWW" ;
      /* GeneXus formulas. */
      AV67Pgmname = "CLIENVWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV30TFCliEnvLin ;
   private byte AV31TFCliEnvLin_To ;
   private byte gxajaxcallmode ;
   private byte A266CliEnvLin ;
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
   private short AV12OrderedBy ;
   private short AV46TFCliEnvPrv ;
   private short AV47TFCliEnvPrv_To ;
   private short AV52TFCliEnvTp ;
   private short AV53TFCliEnvTp_To ;
   private short wbEnd ;
   private short wbStart ;
   private short AV64GridActions ;
   private short A270CliEnvPrv ;
   private short A723CliEnvTp ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int3[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int nGXsfl_37_idx=1 ;
   private int AV28TFCliCod ;
   private int AV29TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int AV61PageToGo ;
   private int AV72GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV62GridCurrentPage ;
   private long AV63GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_37_idx="0001" ;
   private String AV67Pgmname ;
   private String AV26TFEmprCod ;
   private String AV27TFEmprCod_Sel ;
   private String AV32TFCliEnvNom ;
   private String AV33TFCliEnvNom_Sel ;
   private String AV34TFCliEnvNm2 ;
   private String AV35TFCliEnvNm2_Sel ;
   private String AV36TFCliEnvDom ;
   private String AV37TFCliEnvDom_Sel ;
   private String AV38TFCliEnvDm2 ;
   private String AV39TFCliEnvDm2_Sel ;
   private String AV40TFCliEnvPob ;
   private String AV41TFCliEnvPob_Sel ;
   private String AV42TFCliEnvCp ;
   private String AV43TFCliEnvCp_Sel ;
   private String AV44TFCliEnvCp2 ;
   private String AV45TFCliEnvCp2_Sel ;
   private String AV48TFCliEnvPrn ;
   private String AV49TFCliEnvPrn_Sel ;
   private String AV50TFCliEnvAg ;
   private String AV51TFCliEnvAg_Sel ;
   private String AV54TFCliEnvNmt ;
   private String AV55TFCliEnvNmt_Sel ;
   private String AV56TFCliEnvMail ;
   private String AV57TFCliEnvMail_Sel ;
   private String AV58TFCliEnvFx ;
   private String AV59TFCliEnvFx_Sel ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
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
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliEnvLin_Internalname ;
   private String A267CliEnvNom ;
   private String edtCliEnvNom_Internalname ;
   private String A5531CliEnvNm2 ;
   private String edtCliEnvNm2_Internalname ;
   private String A265CliEnvDom ;
   private String edtCliEnvDom_Internalname ;
   private String A5530CliEnvDm2 ;
   private String edtCliEnvDm2_Internalname ;
   private String A268CliEnvPob ;
   private String edtCliEnvPob_Internalname ;
   private String A264CliEnvCp ;
   private String edtCliEnvCp_Internalname ;
   private String A10775CliEnvCp2 ;
   private String edtCliEnvCp2_Internalname ;
   private String edtCliEnvPrv_Internalname ;
   private String A269CliEnvPrn ;
   private String edtCliEnvPrn_Internalname ;
   private String A689CliEnvAg ;
   private String edtCliEnvAg_Internalname ;
   private String edtCliEnvTp_Internalname ;
   private String A693CliEnvNmt ;
   private String edtCliEnvNmt_Internalname ;
   private String A10051CliEnvMail ;
   private String edtCliEnvMail_Internalname ;
   private String A10052CliEnvFx ;
   private String edtCliEnvFx_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV26TFEmprCod ;
   private String lV32TFCliEnvNom ;
   private String lV34TFCliEnvNm2 ;
   private String lV36TFCliEnvDom ;
   private String lV38TFCliEnvDm2 ;
   private String lV40TFCliEnvPob ;
   private String lV42TFCliEnvCp ;
   private String lV44TFCliEnvCp2 ;
   private String lV48TFCliEnvPrn ;
   private String lV50TFCliEnvAg ;
   private String lV56TFCliEnvMail ;
   private String lV58TFCliEnvFx ;
   private String hsh ;
   private String AV68Station ;
   private String AV69Emprcod ;
   private String AV70Emprnom ;
   private String AV71Usurcod ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliEnvLin_Jsonclick ;
   private String edtCliEnvNom_Jsonclick ;
   private String edtCliEnvNm2_Jsonclick ;
   private String edtCliEnvDom_Jsonclick ;
   private String edtCliEnvDm2_Jsonclick ;
   private String edtCliEnvPob_Jsonclick ;
   private String edtCliEnvCp_Jsonclick ;
   private String edtCliEnvCp2_Jsonclick ;
   private String edtCliEnvPrv_Jsonclick ;
   private String edtCliEnvPrn_Jsonclick ;
   private String edtCliEnvAg_Jsonclick ;
   private String edtCliEnvTp_Jsonclick ;
   private String edtCliEnvNmt_Jsonclick ;
   private String edtCliEnvMail_Jsonclick ;
   private String edtCliEnvFx_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n269CliEnvPrn ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV24ManageFiltersXml ;
   private String AV15FilterFullText ;
   private String lV15FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H01S92_A10052CliEnvFx ;
   private String[] H01S92_A10051CliEnvMail ;
   private String[] H01S92_A689CliEnvAg ;
   private String[] H01S92_A269CliEnvPrn ;
   private boolean[] H01S92_n269CliEnvPrn ;
   private short[] H01S92_A270CliEnvPrv ;
   private String[] H01S92_A10775CliEnvCp2 ;
   private String[] H01S92_A264CliEnvCp ;
   private String[] H01S92_A268CliEnvPob ;
   private String[] H01S92_A5530CliEnvDm2 ;
   private String[] H01S92_A265CliEnvDom ;
   private String[] H01S92_A5531CliEnvNm2 ;
   private String[] H01S92_A267CliEnvNom ;
   private byte[] H01S92_A266CliEnvLin ;
   private int[] H01S92_A252CliCod ;
   private short[] H01S92_A723CliEnvTp ;
   private String[] H01S92_A396EmprCod ;
   private String[] H01S93_A10052CliEnvFx ;
   private String[] H01S93_A10051CliEnvMail ;
   private String[] H01S93_A689CliEnvAg ;
   private String[] H01S93_A269CliEnvPrn ;
   private boolean[] H01S93_n269CliEnvPrn ;
   private short[] H01S93_A270CliEnvPrv ;
   private String[] H01S93_A10775CliEnvCp2 ;
   private String[] H01S93_A264CliEnvCp ;
   private String[] H01S93_A268CliEnvPob ;
   private String[] H01S93_A5530CliEnvDm2 ;
   private String[] H01S93_A265CliEnvDom ;
   private String[] H01S93_A5531CliEnvNm2 ;
   private String[] H01S93_A267CliEnvNom ;
   private byte[] H01S93_A266CliEnvLin ;
   private int[] H01S93_A252CliCod ;
   private short[] H01S93_A723CliEnvTp ;
   private String[] H01S93_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV60DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class clienvww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01S92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV27TFEmprCod_Sel ,
                                          String AV26TFEmprCod ,
                                          int AV28TFCliCod ,
                                          int AV29TFCliCod_To ,
                                          byte AV30TFCliEnvLin ,
                                          byte AV31TFCliEnvLin_To ,
                                          String AV33TFCliEnvNom_Sel ,
                                          String AV32TFCliEnvNom ,
                                          String AV35TFCliEnvNm2_Sel ,
                                          String AV34TFCliEnvNm2 ,
                                          String AV37TFCliEnvDom_Sel ,
                                          String AV36TFCliEnvDom ,
                                          String AV39TFCliEnvDm2_Sel ,
                                          String AV38TFCliEnvDm2 ,
                                          String AV41TFCliEnvPob_Sel ,
                                          String AV40TFCliEnvPob ,
                                          String AV43TFCliEnvCp_Sel ,
                                          String AV42TFCliEnvCp ,
                                          String AV45TFCliEnvCp2_Sel ,
                                          String AV44TFCliEnvCp2 ,
                                          short AV46TFCliEnvPrv ,
                                          short AV47TFCliEnvPrv_To ,
                                          String AV49TFCliEnvPrn_Sel ,
                                          String AV48TFCliEnvPrn ,
                                          String AV51TFCliEnvAg_Sel ,
                                          String AV50TFCliEnvAg ,
                                          short AV52TFCliEnvTp ,
                                          short AV53TFCliEnvTp_To ,
                                          String AV57TFCliEnvMail_Sel ,
                                          String AV56TFCliEnvMail ,
                                          String AV59TFCliEnvFx_Sel ,
                                          String AV58TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV55TFCliEnvNmt_Sel ,
                                          String AV54TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[32];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int34[1] = (byte)(1) ;
      }
      if ( ! (0==AV28TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (0==AV29TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (0==AV46TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (0==AV47TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (0==AV52TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (0==AV53TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvLin" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvNm2" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvNm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvDom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvDom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvDm2" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvDm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvPob" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp2" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvPrv" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvAg" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvAg DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvTp" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvTp DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvMail" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvMail DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvFx" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvFx DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H01S93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV27TFEmprCod_Sel ,
                                          String AV26TFEmprCod ,
                                          int AV28TFCliCod ,
                                          int AV29TFCliCod_To ,
                                          byte AV30TFCliEnvLin ,
                                          byte AV31TFCliEnvLin_To ,
                                          String AV33TFCliEnvNom_Sel ,
                                          String AV32TFCliEnvNom ,
                                          String AV35TFCliEnvNm2_Sel ,
                                          String AV34TFCliEnvNm2 ,
                                          String AV37TFCliEnvDom_Sel ,
                                          String AV36TFCliEnvDom ,
                                          String AV39TFCliEnvDm2_Sel ,
                                          String AV38TFCliEnvDm2 ,
                                          String AV41TFCliEnvPob_Sel ,
                                          String AV40TFCliEnvPob ,
                                          String AV43TFCliEnvCp_Sel ,
                                          String AV42TFCliEnvCp ,
                                          String AV45TFCliEnvCp2_Sel ,
                                          String AV44TFCliEnvCp2 ,
                                          short AV46TFCliEnvPrv ,
                                          short AV47TFCliEnvPrv_To ,
                                          String AV49TFCliEnvPrn_Sel ,
                                          String AV48TFCliEnvPrn ,
                                          String AV51TFCliEnvAg_Sel ,
                                          String AV50TFCliEnvAg ,
                                          short AV52TFCliEnvTp ,
                                          short AV53TFCliEnvTp_To ,
                                          String AV57TFCliEnvMail_Sel ,
                                          String AV56TFCliEnvMail ,
                                          String AV59TFCliEnvFx_Sel ,
                                          String AV58TFCliEnvFx ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          byte A266CliEnvLin ,
                                          String A267CliEnvNom ,
                                          String A5531CliEnvNm2 ,
                                          String A265CliEnvDom ,
                                          String A5530CliEnvDm2 ,
                                          String A268CliEnvPob ,
                                          String A264CliEnvCp ,
                                          String A10775CliEnvCp2 ,
                                          short A270CliEnvPrv ,
                                          String A269CliEnvPrn ,
                                          String A689CliEnvAg ,
                                          short A723CliEnvTp ,
                                          String A10051CliEnvMail ,
                                          String A10052CliEnvFx ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          String A693CliEnvNmt ,
                                          String AV55TFCliEnvNmt_Sel ,
                                          String AV54TFCliEnvNmt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[32];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT T1.CliEnvFx, T1.CliEnvMail, T1.CliEnvAg, T2.PrvDsc AS CliEnvPrn, T1.CliEnvPrv AS CliEnvPrv, T1.CliEnvCp2, T1.CliEnvCp, T1.CliEnvPob, T1.CliEnvDm2, T1.CliEnvDom," ;
      scmdbuf += " T1.CliEnvNm2, T1.CliEnvNom, T1.CliEnvLin, T1.CliCod, T1.CliEnvTp, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv)" ;
      if ( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int36[1] = (byte)(1) ;
      }
      if ( ! (0==AV28TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int36[2] = (byte)(1) ;
      }
      if ( ! (0==AV29TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int36[3] = (byte)(1) ;
      }
      if ( ! (0==AV30TFCliEnvLin) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin >= ?)");
      }
      else
      {
         GXv_int36[4] = (byte)(1) ;
      }
      if ( ! (0==AV31TFCliEnvLin_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvLin <= ?)");
      }
      else
      {
         GXv_int36[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFCliEnvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliEnvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNom = ?)");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFCliEnvNm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvNm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFCliEnvNm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvNm2 = ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFCliEnvDom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFCliEnvDom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDom = ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliEnvDm2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvDm2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFCliEnvDm2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvDm2 = ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFCliEnvPob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliEnvPob_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvPob = ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCliEnvCp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCliEnvCp_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp = ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFCliEnvCp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliEnvCp2_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvCp2 = ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! (0==AV46TFCliEnvPrv) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (0==AV47TFCliEnvPrv_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvPrv <= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFCliEnvPrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFCliEnvPrn_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFCliEnvAg)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvAg) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFCliEnvAg_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvAg = ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( ! (0==AV52TFCliEnvTp) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp >= ?)");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (0==AV53TFCliEnvTp_To) )
      {
         addWhere(sWhereString, "(T1.CliEnvTp <= ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFCliEnvMail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFCliEnvMail_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvMail = ?)");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFCliEnvFx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliEnvFx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFCliEnvFx_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliEnvFx = ?)");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvLin" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvNm2" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvNm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvDom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvDom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvDm2" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvDm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvPob" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp2" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvPrv" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvAg" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvAg DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvTp" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvTp DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvMail" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvMail DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliEnvFx" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliEnvFx DESC" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
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
                  return conditional_H01S92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 1 :
                  return conditional_H01S93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01S92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 34);
               ((String[]) buf[10])[0] = rslt.getString(10, 34);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 34);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 34);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 34);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               return;
      }
   }

}

