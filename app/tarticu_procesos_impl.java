package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_procesos_impl extends GXDataArea
{
   public tarticu_procesos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticu_procesos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_procesos_impl.class ));
   }

   public tarticu_procesos_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavProact = UIFactory.getCheckbox(this);
      cmbavGridactions = new HTMLChoice();
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
            AV58Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58Emprcod", AV58Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV59CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59CliCod), "ZZZZZ9")));
               AV66CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66CliNom", AV66CliNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66CliNom, ""))));
               AV60ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60ArtCod", AV60ArtCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60ArtCod, ""))));
               AV61ArtDsc = httpContext.GetPar( "ArtDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61ArtDsc", AV61ArtDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ArtDsc, ""))));
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
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
      AV58Emprcod = httpContext.GetPar( "Emprcod") ;
      AV59CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV60ArtCod = httpContext.GetPar( "ArtCod") ;
      AV43TFProCod = httpContext.GetPar( "TFProCod") ;
      AV44TFProCod_Sel = httpContext.GetPar( "TFProCod_Sel") ;
      AV45TFProDsc = httpContext.GetPar( "TFProDsc") ;
      AV46TFProDsc_Sel = httpContext.GetPar( "TFProDsc_Sel") ;
      AV47TFProUserA = httpContext.GetPar( "TFProUserA") ;
      AV48TFProUserA_Sel = httpContext.GetPar( "TFProUserA_Sel") ;
      AV49TFProFecA = localUtil.parseDTimeParm( httpContext.GetPar( "TFProFecA")) ;
      AV51TFProUserM = httpContext.GetPar( "TFProUserM") ;
      AV52TFProUserM_Sel = httpContext.GetPar( "TFProUserM_Sel") ;
      AV53TFProFecM = localUtil.parseDTimeParm( httpContext.GetPar( "TFProFecM")) ;
      AV72Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66CliNom = httpContext.GetPar( "CliNom") ;
      AV61ArtDsc = httpContext.GetPar( "ArtDsc") ;
      AV64ProAct = httpContext.GetPar( "ProAct") ;
      AV62usurcod = httpContext.GetPar( "usurcod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
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
      pa2662( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2662( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tarticu_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV59CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66CliNom)),GXutil.URLEncode(GXutil.rtrim(AV60ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV61ArtDsc))}, new String[] {"Emprcod","CliCod","CliNom","ArtCod","ArtDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ArtDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_Procesos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticu_procesos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_70, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROCOD_DATA", AV56ProCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROCOD_DATA", AV56ProCod_Data);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD", GXutil.rtrim( AV43TFProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD_SEL", GXutil.rtrim( AV44TFProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC", GXutil.rtrim( AV45TFProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC_SEL", GXutil.rtrim( AV46TFProDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROUSERA", GXutil.rtrim( AV47TFProUserA));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROUSERA_SEL", GXutil.rtrim( AV48TFProUserA_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFECA", localUtil.ttoc( AV49TFProFecA, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROUSERM", GXutil.rtrim( AV51TFProUserM));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROUSERM_SEL", GXutil.rtrim( AV52TFProUserM_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFECM", localUtil.ttoc( AV53TFProFecM, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV62usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Width", GXutil.rtrim( Dvpanel_informaciongeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Autowidth", GXutil.booltostr( Dvpanel_informaciongeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Autoheight", GXutil.booltostr( Dvpanel_informaciongeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Cls", GXutil.rtrim( Dvpanel_informaciongeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Title", GXutil.rtrim( Dvpanel_informaciongeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Collapsible", GXutil.booltostr( Dvpanel_informaciongeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Collapsed", GXutil.booltostr( Dvpanel_informaciongeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_informaciongeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Iconposition", GXutil.rtrim( Dvpanel_informaciongeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_INFORMACIONGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_informaciongeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Cls", GXutil.rtrim( Combo_procod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Selectedvalue_set", GXutil.rtrim( Combo_procod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Emptyitem", GXutil.booltostr( Combo_procod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROCOD_Selectedvalue_get", GXutil.rtrim( Combo_procod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
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
         we2662( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2662( ) ;
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
      return formatLink("app.tarticu_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV59CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66CliNom)),GXutil.URLEncode(GXutil.rtrim(AV60ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV61ArtDsc))}, new String[] {"Emprcod","CliCod","CliNom","ArtCod","ArtDsc"})  ;
   }

   public String getPgmname( )
   {
      return "Tarticu_Procesos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Proceso", "") ;
   }

   public void wb2660( )
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
         /* User Defined Control */
         ucDvpanel_informaciongeneral.setProperty("Width", Dvpanel_informaciongeneral_Width);
         ucDvpanel_informaciongeneral.setProperty("AutoWidth", Dvpanel_informaciongeneral_Autowidth);
         ucDvpanel_informaciongeneral.setProperty("AutoHeight", Dvpanel_informaciongeneral_Autoheight);
         ucDvpanel_informaciongeneral.setProperty("Cls", Dvpanel_informaciongeneral_Cls);
         ucDvpanel_informaciongeneral.setProperty("Title", Dvpanel_informaciongeneral_Title);
         ucDvpanel_informaciongeneral.setProperty("Collapsible", Dvpanel_informaciongeneral_Collapsible);
         ucDvpanel_informaciongeneral.setProperty("Collapsed", Dvpanel_informaciongeneral_Collapsed);
         ucDvpanel_informaciongeneral.setProperty("ShowCollapseIcon", Dvpanel_informaciongeneral_Showcollapseicon);
         ucDvpanel_informaciongeneral.setProperty("IconPosition", Dvpanel_informaciongeneral_Iconposition);
         ucDvpanel_informaciongeneral.setProperty("AutoScroll", Dvpanel_informaciongeneral_Autoscroll);
         ucDvpanel_informaciongeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_informaciongeneral_Internalname, "DVPANEL_INFORMACIONGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_INFORMACIONGENERALContainer"+"InformacionGeneral"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divInformaciongeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV59CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV59CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV66CliNom), GXutil.rtrim( localUtil.format( AV66CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV60ArtCod), GXutil.rtrim( localUtil.format( AV60ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtdsc_Internalname, GXutil.rtrim( AV61ArtDsc), GXutil.rtrim( localUtil.format( AV61ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_procod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockcombo_procod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_procod.setProperty("Caption", Combo_procod_Caption);
         ucCombo_procod.setProperty("Cls", Combo_procod_Cls);
         ucCombo_procod.setProperty("EmptyItem", Combo_procod_Emptyitem);
         ucCombo_procod.setProperty("DropDownOptionsData", AV56ProCod_Data);
         ucCombo_procod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_procod_Internalname, "COMBO_PROCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProact_cell_Internalname, 1, 0, "px", 0, "px", divProact_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkavProact.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavProact.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavProact.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavProact.getInternalname(), AV64ProAct, "", httpContext.getMessage( "Activo?", ""), chkavProact.getVisible(), chkavProact.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(51, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,51);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112661_client"+"'", TempTags, "", 2, "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         startgridcontrol70( ) ;
      }
      if ( wbEnd == 70 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_70 = (int)(nGXsfl_70_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV72Pgmname), GXutil.rtrim( localUtil.format( AV72Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV55ProCod), GXutil.rtrim( localUtil.format( AV55ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavProcod_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_93_2662( true) ;
      }
      else
      {
         wb_table1_93_2662( false) ;
      }
      return  ;
   }

   public void wb_table1_93_2662e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_profecaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_profecaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_profecaauxdate_Internalname, localUtil.format(AV50DDO_ProFecAAuxDate, "99/99/99"), localUtil.format( AV50DDO_ProFecAAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_profecaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_profecaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Tarticu_Procesos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_profecmauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_profecmauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_profecmauxdate_Internalname, localUtil.format(AV54DDO_ProFecMAuxDate, "99/99/99"), localUtil.format( AV54DDO_ProFecMAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_profecmauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_profecmauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Tarticu_Procesos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 70 )
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

   public void start2662( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Proceso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2660( ) ;
   }

   public void ws2662( )
   {
      start2662( ) ;
      evt2662( ) ;
   }

   public void evt2662( )
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
                           e122662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152662 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162662 ();
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
                           nGXsfl_70_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_702( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
                           A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
                           A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname), 0) ;
                           A10555ProUserM = httpContext.cgiGet( edtProUserM_Internalname) ;
                           A10556ProFecM = localUtil.ctot( httpContext.cgiGet( edtProFecM_Internalname), 0) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e172662 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e182662 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192662 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202662 ();
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

   public void we2662( )
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

   public void pa2662( )
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
            GX_FocusControl = chkavProact.getInternalname() ;
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
      subsflControlProps_702( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         sendrow_702( ) ;
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV58Emprcod ,
                                 int AV59CliCod ,
                                 String AV60ArtCod ,
                                 String AV43TFProCod ,
                                 String AV44TFProCod_Sel ,
                                 String AV45TFProDsc ,
                                 String AV46TFProDsc_Sel ,
                                 String AV47TFProUserA ,
                                 String AV48TFProUserA_Sel ,
                                 java.util.Date AV49TFProFecA ,
                                 String AV51TFProUserM ,
                                 String AV52TFProUserM_Sel ,
                                 java.util.Date AV53TFProFecM ,
                                 String AV72Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV66CliNom ,
                                 String AV61ArtDsc ,
                                 String AV64ProAct ,
                                 String AV62usurcod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182662 ();
      GRID_nCurrentRecord = 0 ;
      rf2662( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_Procesos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticu_procesos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV64ProAct = ((GXutil.strcmp(GXutil.rtrim( AV64ProAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64ProAct", AV64ProAct);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2662( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV72Pgmname = "Tarticu_Procesos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2662( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(70) ;
      /* Execute user event: Refresh */
      e182662 ();
      nGXsfl_70_idx = 1 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      bGXsfl_70_Refreshing = true ;
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
         subsflControlProps_702( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV74Tarticu_procesosds_2_tfprocod_sel ,
                                              AV73Tarticu_procesosds_1_tfprocod ,
                                              AV76Tarticu_procesosds_4_tfprodsc_sel ,
                                              AV75Tarticu_procesosds_3_tfprodsc ,
                                              AV78Tarticu_procesosds_6_tfprousera_sel ,
                                              AV77Tarticu_procesosds_5_tfprousera ,
                                              AV79Tarticu_procesosds_7_tfprofeca ,
                                              AV81Tarticu_procesosds_9_tfprouserm_sel ,
                                              AV80Tarticu_procesosds_8_tfprouserm ,
                                              AV82Tarticu_procesosds_10_tfprofecm ,
                                              A758ProCod ,
                                              A759ProDsc ,
                                              A10553ProUserA ,
                                              A10554ProFecA ,
                                              A10555ProUserM ,
                                              A10556ProFecM ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV58Emprcod ,
                                              Integer.valueOf(AV59CliCod) ,
                                              AV60ArtCod ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A65ArtCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV73Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV73Tarticu_procesosds_1_tfprocod), 8, "%") ;
         lV75Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV75Tarticu_procesosds_3_tfprodsc), 40, "%") ;
         lV77Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV77Tarticu_procesosds_5_tfprousera), 10, "%") ;
         lV80Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV80Tarticu_procesosds_8_tfprouserm), 10, "%") ;
         /* Using cursor H02662 */
         pr_default.execute(0, new Object[] {AV58Emprcod, Integer.valueOf(AV59CliCod), AV60ArtCod, lV73Tarticu_procesosds_1_tfprocod, AV74Tarticu_procesosds_2_tfprocod_sel, lV75Tarticu_procesosds_3_tfprodsc, AV76Tarticu_procesosds_4_tfprodsc_sel, lV77Tarticu_procesosds_5_tfprousera, AV78Tarticu_procesosds_6_tfprousera_sel, AV79Tarticu_procesosds_7_tfprofeca, lV80Tarticu_procesosds_8_tfprouserm, AV81Tarticu_procesosds_9_tfprouserm_sel, AV82Tarticu_procesosds_10_tfprofecm, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_70_idx = 1 ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02662_A396EmprCod[0] ;
            A252CliCod = H02662_A252CliCod[0] ;
            A65ArtCod = H02662_A65ArtCod[0] ;
            A10556ProFecM = H02662_A10556ProFecM[0] ;
            A10555ProUserM = H02662_A10555ProUserM[0] ;
            A10554ProFecA = H02662_A10554ProFecA[0] ;
            A10553ProUserA = H02662_A10553ProUserA[0] ;
            A759ProDsc = H02662_A759ProDsc[0] ;
            A758ProCod = H02662_A758ProCod[0] ;
            A759ProDsc = H02662_A759ProDsc[0] ;
            e192662 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(70) ;
         wb2660( ) ;
      }
      bGXsfl_70_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2662( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV62usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62usurcod, "@!"))));
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
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV74Tarticu_procesosds_2_tfprocod_sel ,
                                           AV73Tarticu_procesosds_1_tfprocod ,
                                           AV76Tarticu_procesosds_4_tfprodsc_sel ,
                                           AV75Tarticu_procesosds_3_tfprodsc ,
                                           AV78Tarticu_procesosds_6_tfprousera_sel ,
                                           AV77Tarticu_procesosds_5_tfprousera ,
                                           AV79Tarticu_procesosds_7_tfprofeca ,
                                           AV81Tarticu_procesosds_9_tfprouserm_sel ,
                                           AV80Tarticu_procesosds_8_tfprouserm ,
                                           AV82Tarticu_procesosds_10_tfprofecm ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A10553ProUserA ,
                                           A10554ProFecA ,
                                           A10555ProUserM ,
                                           A10556ProFecM ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV58Emprcod ,
                                           Integer.valueOf(AV59CliCod) ,
                                           AV60ArtCod ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV73Tarticu_procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV73Tarticu_procesosds_1_tfprocod), 8, "%") ;
      lV75Tarticu_procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV75Tarticu_procesosds_3_tfprodsc), 40, "%") ;
      lV77Tarticu_procesosds_5_tfprousera = GXutil.padr( GXutil.rtrim( AV77Tarticu_procesosds_5_tfprousera), 10, "%") ;
      lV80Tarticu_procesosds_8_tfprouserm = GXutil.padr( GXutil.rtrim( AV80Tarticu_procesosds_8_tfprouserm), 10, "%") ;
      /* Using cursor H02663 */
      pr_default.execute(1, new Object[] {AV58Emprcod, Integer.valueOf(AV59CliCod), AV60ArtCod, lV73Tarticu_procesosds_1_tfprocod, AV74Tarticu_procesosds_2_tfprocod_sel, lV75Tarticu_procesosds_3_tfprodsc, AV76Tarticu_procesosds_4_tfprodsc_sel, lV77Tarticu_procesosds_5_tfprousera, AV78Tarticu_procesosds_6_tfprousera_sel, AV79Tarticu_procesosds_7_tfprofeca, lV80Tarticu_procesosds_8_tfprouserm, AV81Tarticu_procesosds_9_tfprouserm_sel, AV82Tarticu_procesosds_10_tfprofecm});
      GRID_nRecordCount = H02663_AGRID_nRecordCount[0] ;
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
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV59CliCod, AV60ArtCod, AV43TFProCod, AV44TFProCod_Sel, AV45TFProDsc, AV46TFProDsc_Sel, AV47TFProUserA, AV48TFProUserA_Sel, AV49TFProFecA, AV51TFProUserM, AV52TFProUserM_Sel, AV53TFProFecM, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliNom, AV61ArtDsc, AV64ProAct, AV62usurcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV72Pgmname = "Tarticu_Procesos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2660( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172662 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROCOD_DATA"), AV56ProCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_informaciongeneral_Width = httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Width") ;
         Dvpanel_informaciongeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Autowidth")) ;
         Dvpanel_informaciongeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Autoheight")) ;
         Dvpanel_informaciongeneral_Cls = httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Cls") ;
         Dvpanel_informaciongeneral_Title = httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Title") ;
         Dvpanel_informaciongeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Collapsible")) ;
         Dvpanel_informaciongeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Collapsed")) ;
         Dvpanel_informaciongeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Showcollapseicon")) ;
         Dvpanel_informaciongeneral_Iconposition = httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Iconposition") ;
         Dvpanel_informaciongeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_INFORMACIONGENERAL_Autoscroll")) ;
         Combo_procod_Cls = httpContext.cgiGet( "COMBO_PROCOD_Cls") ;
         Combo_procod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROCOD_Selectedvalue_set") ;
         Combo_procod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROCOD_Emptyitem")) ;
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
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
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV64ProAct = ((GXutil.strcmp(httpContext.cgiGet( chkavProact.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64ProAct", AV64ProAct);
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Pgmname", AV72Pgmname);
         AV55ProCod = httpContext.cgiGet( edtavProcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ProCod", AV55ProCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_profecaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PROFECAAUXDATE");
            GX_FocusControl = edtavDdo_profecaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50DDO_ProFecAAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50DDO_ProFecAAuxDate", localUtil.format(AV50DDO_ProFecAAuxDate, "99/99/99"));
         }
         else
         {
            AV50DDO_ProFecAAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_profecaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50DDO_ProFecAAuxDate", localUtil.format(AV50DDO_ProFecAAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_profecmauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PROFECMAUXDATE");
            GX_FocusControl = edtavDdo_profecmauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_ProFecMAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_ProFecMAuxDate", localUtil.format(AV54DDO_ProFecMAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_ProFecMAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_profecmauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_ProFecMAuxDate", localUtil.format(AV54DDO_ProFecMAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_70_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         if ( nGXsfl_70_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
            A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname)) ;
            A10555ProUserM = httpContext.cgiGet( edtProUserM_Internalname) ;
            A10556ProFecM = localUtil.ctot( httpContext.cgiGet( edtProFecM_Internalname)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_Procesos");
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Pgmname", AV72Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tarticu_procesos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172662 ();
      if (returnInSub) return;
   }

   public void e172662( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV65Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticu_procesos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65Station = GXt_char1 ;
      GXv_char2[0] = AV58Emprcod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV62usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticu_procesos_impl.this.AV58Emprcod = GXv_char2[0] ;
      tarticu_procesos_impl.this.AV63EmprNom = GXv_char3[0] ;
      tarticu_procesos_impl.this.AV62usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Emprcod", AV58Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV62usurcod", AV62usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62usurcod, "@!"))));
      edtavProcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Proceso", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e182662( )
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
      S162 ();
      if (returnInSub) return;
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      AV73Tarticu_procesosds_1_tfprocod = AV43TFProCod ;
      AV74Tarticu_procesosds_2_tfprocod_sel = AV44TFProCod_Sel ;
      AV75Tarticu_procesosds_3_tfprodsc = AV45TFProDsc ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = AV46TFProDsc_Sel ;
      AV77Tarticu_procesosds_5_tfprousera = AV47TFProUserA ;
      AV78Tarticu_procesosds_6_tfprousera_sel = AV48TFProUserA_Sel ;
      AV79Tarticu_procesosds_7_tfprofeca = AV49TFProFecA ;
      AV80Tarticu_procesosds_8_tfprouserm = AV51TFProUserM ;
      AV81Tarticu_procesosds_9_tfprouserm_sel = AV52TFProUserM_Sel ;
      AV82Tarticu_procesosds_10_tfprofecm = AV53TFProFecM ;
      /*  Sending Event outputs  */
   }

   public void e122662( )
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

   public void e132662( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142662( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProCod") == 0 )
         {
            AV43TFProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFProCod", AV43TFProCod);
            AV44TFProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFProCod_Sel", AV44TFProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProDsc") == 0 )
         {
            AV45TFProDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFProDsc", AV45TFProDsc);
            AV46TFProDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProDsc_Sel", AV46TFProDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProUserA") == 0 )
         {
            AV47TFProUserA = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProUserA", AV47TFProUserA);
            AV48TFProUserA_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFProUserA_Sel", AV48TFProUserA_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProFecA") == 0 )
         {
            AV49TFProFecA = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFProFecA", localUtil.ttoc( AV49TFProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProUserM") == 0 )
         {
            AV51TFProUserM = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFProUserM", AV51TFProUserM);
            AV52TFProUserM_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProUserM_Sel", AV52TFProUserM_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProFecM") == 0 )
         {
            AV53TFProFecM = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProFecM", localUtil.ttoc( AV53TFProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e192662( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(70) ;
      }
      sendrow_702( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_70_Refreshing )
      {
         httpContext.doAjaxLoad(70, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
   }

   public void e202662( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV42GridActions == 1 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S182 ();
         if (returnInSub) return;
      }
      AV42GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e152662( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e162662( )
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

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tarticu_parametros", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV59CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66CliNom)),GXutil.URLEncode(GXutil.rtrim(AV60ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc))}, new String[] {"Emprcod","CliCod","CliNom","ArtCod","ProCod","ProDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A252CliCod ;
      GXv_char3[0] = A65ArtCod ;
      GXv_char2[0] = A758ProCod ;
      GXv_char9[0] = httpContext.getMessage( "PRO", "") ;
      new app.pborrser(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char9) ;
      tarticu_procesos_impl.this.A396EmprCod = GXv_char4[0] ;
      tarticu_procesos_impl.this.A252CliCod = GXv_int8[0] ;
      tarticu_procesos_impl.this.A65ArtCod = GXv_char3[0] ;
      tarticu_procesos_impl.this.A758ProCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      callWebObject(formatLink("app.tarticu_procesos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod","ProCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      GXv_char9[0] = AV55ProCod ;
      GXv_char4[0] = AV64ProAct ;
      GXv_char3[0] = AV69Var_Messages ;
      new app.tarticu_procesos_ins(remoteHandle, context).execute( AV58Emprcod, AV59CliCod, AV60ArtCod, AV62usurcod, GXv_char9, GXv_char4, GXv_char3) ;
      tarticu_procesos_impl.this.AV55ProCod = GXv_char9[0] ;
      tarticu_procesos_impl.this.AV64ProAct = GXv_char4[0] ;
      tarticu_procesos_impl.this.AV69Var_Messages = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ProCod", AV55ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV64ProAct", AV64ProAct);
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV72Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV72Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV72Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV43TFProCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFProCod", AV43TFProCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV44TFProCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFProCod_Sel", AV44TFProCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV45TFProDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFProDsc", AV45TFProDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV46TFProDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProDsc_Sel", AV46TFProDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERA") == 0 )
         {
            AV47TFProUserA = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProUserA", AV47TFProUserA);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERA_SEL") == 0 )
         {
            AV48TFProUserA_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFProUserA_Sel", AV48TFProUserA_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFECA") == 0 )
         {
            AV49TFProFecA = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFProFecA", localUtil.ttoc( AV49TFProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV50DDO_ProFecAAuxDate = GXutil.resetTime(AV49TFProFecA) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50DDO_ProFecAAuxDate", localUtil.format(AV50DDO_ProFecAAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERM") == 0 )
         {
            AV51TFProUserM = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFProUserM", AV51TFProUserM);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROUSERM_SEL") == 0 )
         {
            AV52TFProUserM_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProUserM_Sel", AV52TFProUserM_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFECM") == 0 )
         {
            AV53TFProFecM = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProFecM", localUtil.ttoc( AV53TFProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV54DDO_ProFecMAuxDate = GXutil.resetTime(AV53TFProFecM) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_ProFecMAuxDate", localUtil.format(AV54DDO_ProFecMAuxDate, "99/99/99"));
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char9[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFProCod_Sel)==0), AV44TFProCod_Sel, GXv_char9) ;
      tarticu_procesos_impl.this.GXt_char1 = GXv_char9[0] ;
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFProDsc_Sel)==0), AV46TFProDsc_Sel, GXv_char4) ;
      tarticu_procesos_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFProUserA_Sel)==0), AV48TFProUserA_Sel, GXv_char3) ;
      tarticu_procesos_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char12 = "" ;
      GXv_char2[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFProUserM_Sel)==0), AV52TFProUserM_Sel, GXv_char2) ;
      tarticu_procesos_impl.this.GXt_char12 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char10+"|"+GXt_char11+"||"+GXt_char12+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char9[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFProCod)==0), AV43TFProCod, GXv_char9) ;
      tarticu_procesos_impl.this.GXt_char12 = GXv_char9[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFProDsc)==0), AV45TFProDsc, GXv_char4) ;
      tarticu_procesos_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFProUserA)==0), AV47TFProUserA, GXv_char3) ;
      tarticu_procesos_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFProUserM)==0), AV51TFProUserM, GXv_char2) ;
      tarticu_procesos_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char11+"|"+GXt_char10+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV49TFProFecA) ? "" : localUtil.dtoc( AV50DDO_ProFecAAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV53TFProFecM) ? "" : localUtil.dtoc( AV54DDO_ProFecMAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV72Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPROCOD", "", !(GXutil.strcmp("", AV43TFProCod)==0), (short)(0), AV43TFProCod, "", !(GXutil.strcmp("", AV44TFProCod_Sel)==0), AV44TFProCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRODSC", "", !(GXutil.strcmp("", AV45TFProDsc)==0), (short)(0), AV45TFProDsc, "", !(GXutil.strcmp("", AV46TFProDsc_Sel)==0), AV46TFProDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPROUSERA", "", !(GXutil.strcmp("", AV47TFProUserA)==0), (short)(0), AV47TFProUserA, "", !(GXutil.strcmp("", AV48TFProUserA_Sel)==0), AV48TFProUserA_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPROFECA", "", !GXutil.dateCompare(GXutil.nullDate(), AV49TFProFecA), (short)(0), GXutil.trim( localUtil.ttoc( AV49TFProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPROUSERM", "", !(GXutil.strcmp("", AV51TFProUserM)==0), (short)(0), AV51TFProUserM, "", !(GXutil.strcmp("", AV52TFProUserM_Sel)==0), AV52TFProUserM_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPROFECM", "", !GXutil.dateCompare(GXutil.nullDate(), AV53TFProFecM), (short)(0), GXutil.trim( localUtil.ttoc( AV53TFProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV58Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV58Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV59CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV59CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60ArtCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60ArtCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61ArtDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61ArtDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV72Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Tarticu_Procesos_Trn" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV58Emprcod, httpContext.getMessage( "ELIOT", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkavProact.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkavProact.getInternalname(), "Visible", GXutil.ltrimstr( chkavProact.getVisible(), 5, 0), true);
         divProact_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divProact_cell_Internalname, "Class", divProact_cell_Class, true);
      }
      else
      {
         chkavProact.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkavProact.getInternalname(), "Visible", GXutil.ltrimstr( chkavProact.getVisible(), 5, 0), true);
         divProact_cell_Class = "col-xs-12 col-sm-2" ;
         httpContext.ajax_rsp_assign_prop("", false, divProact_cell_Internalname, "Class", divProact_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02664 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14284ProEst = H02664_A14284ProEst[0] ;
         A396EmprCod = H02664_A396EmprCod[0] ;
         A13771ProCDsc = H02664_A13771ProCDsc[0] ;
         A758ProCod = H02664_A758ProCod[0] ;
         A759ProDsc = H02664_A759ProDsc[0] ;
         AV57Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV57Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A758ProCod );
         AV57Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13771ProCDsc );
         AV56ProCod_Data.add(AV57Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_procod_Selectedvalue_set = AV55ProCod ;
      ucCombo_procod.sendProperty(context, "", false, Combo_procod_Internalname, "SelectedValue_set", Combo_procod_Selectedvalue_set);
   }

   public void wb_table1_93_2662( boolean wbgen )
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
         wb_table1_93_2662e( true) ;
      }
      else
      {
         wb_table1_93_2662e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV58Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Emprcod", AV58Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58Emprcod, "@!"))));
      AV59CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59CliCod), "ZZZZZ9")));
      AV66CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66CliNom", AV66CliNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66CliNom, ""))));
      AV60ArtCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60ArtCod", AV60ArtCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60ArtCod, ""))));
      AV61ArtDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61ArtDsc", AV61ArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61ArtDsc, ""))));
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
      pa2662( ) ;
      ws2662( ) ;
      we2662( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614558", true, true);
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
      httpContext.AddJavascriptSource("tarticu_procesos.js", "?20268211614559", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_702( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_70_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_70_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_70_idx ;
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_70_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_70_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_70_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_702( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_70_fel_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_70_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_70_fel_idx ;
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_70_fel_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_70_fel_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_70_fel_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_70_fel_idx ;
   }

   public void sendrow_702( )
   {
      subsflControlProps_702( ) ;
      wb2660( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_70_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_70_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_70_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV42GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_70_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserA_Internalname,GXutil.rtrim( A10553ProUserA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecA_Internalname,localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10554ProFecA, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserM_Internalname,GXutil.rtrim( A10555ProUserM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecM_Internalname,localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10556ProFecM, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2662( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      /* End function sendrow_702 */
   }

   public void startgridcontrol70( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"70\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Alta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10553ProUserA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10555ProUserM));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtdsc_Internalname = "vARTDSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divInformaciongeneral_Internalname = "INFORMACIONGENERAL" ;
      Dvpanel_informaciongeneral_Internalname = "DVPANEL_INFORMACIONGENERAL" ;
      lblTextblockcombo_procod_Internalname = "TEXTBLOCKCOMBO_PROCOD" ;
      Combo_procod_Internalname = "COMBO_PROCOD" ;
      divTablesplittedprocod_Internalname = "TABLESPLITTEDPROCOD" ;
      chkavProact.setInternalname( "vPROACT" );
      divProact_cell_Internalname = "PROACT_CELL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProUserA_Internalname = "PROUSERA" ;
      edtProFecA_Internalname = "PROFECA" ;
      edtProUserM_Internalname = "PROUSERM" ;
      edtProFecM_Internalname = "PROFECM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavProcod_Internalname = "vPROCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_profecaauxdate_Internalname = "vDDO_PROFECAAUXDATE" ;
      divDdo_profecaauxdates_Internalname = "DDO_PROFECAAUXDATES" ;
      edtavDdo_profecmauxdate_Internalname = "vDDO_PROFECMAUXDATE" ;
      divDdo_profecmauxdates_Internalname = "DDO_PROFECMAUXDATES" ;
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
      edtProFecM_Jsonclick = "" ;
      edtProUserM_Jsonclick = "" ;
      edtProFecA_Jsonclick = "" ;
      edtProUserA_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_profecmauxdate_Jsonclick = "" ;
      edtavDdo_profecaauxdate_Jsonclick = "" ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavProact.setEnabled( 1 );
      chkavProact.setVisible( 1 );
      divProact_cell_Class = "col-xs-12 col-sm-2" ;
      edtavArtdsc_Jsonclick = "" ;
      edtavArtdsc_Enabled = 0 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Alta;Alta;Modificacion;Modificacion" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma el Proceso?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "Tarticu_ProcesosGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic||Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Date|Character|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:ProCod|2:ProDsc|3:ProUserA|4:ProFecA|5:ProUserM|6:ProFecM" ;
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
      Combo_procod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_procod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_informaciongeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_informaciongeneral_Iconposition = "Right" ;
      Dvpanel_informaciongeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_informaciongeneral_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_informaciongeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_informaciongeneral_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_informaciongeneral_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_informaciongeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_informaciongeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_informaciongeneral_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Proceso", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavProact.setName( "vPROACT" );
      chkavProact.setWebtags( "" );
      chkavProact.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavProact.getInternalname(), "TitleCaption", chkavProact.getCaption(), true);
      chkavProact.setCheckedValue( "N" );
      AV64ProAct = ((GXutil.strcmp(GXutil.rtrim( AV64ProAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64ProAct", AV64ProAct);
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_70_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142662',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192662',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e202662',iparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e112661',iparms:[{av:'AV55ProCod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e152662',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV60ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV44TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV45TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV46TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV47TFProUserA',fld:'vTFPROUSERA',pic:''},{av:'AV48TFProUserA_Sel',fld:'vTFPROUSERA_SEL',pic:''},{av:'AV49TFProFecA',fld:'vTFPROFECA',pic:'99/99/99 99:99'},{av:'AV51TFProUserM',fld:'vTFPROUSERM',pic:''},{av:'AV52TFProUserM_Sel',fld:'vTFPROUSERM_SEL',pic:''},{av:'AV53TFProFecM',fld:'vTFPROFECM',pic:'99/99/99 99:99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV61ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV62usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV55ProCod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV64ProAct',fld:'vPROACT',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162662',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_ARTCOD","{handler:'validv_Artcod',iparms:[]");
      setEventMetadata("VALIDV_ARTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_PROACT","{handler:'validv_Proact',iparms:[]");
      setEventMetadata("VALIDV_PROACT",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profecm',iparms:[]");
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
      wcpOAV58Emprcod = "" ;
      wcpOAV66CliNom = "" ;
      wcpOAV60ArtCod = "" ;
      wcpOAV61ArtDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Combo_procod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV58Emprcod = "" ;
      AV66CliNom = "" ;
      AV60ArtCod = "" ;
      AV61ArtDsc = "" ;
      AV43TFProCod = "" ;
      AV44TFProCod_Sel = "" ;
      AV45TFProDsc = "" ;
      AV46TFProDsc_Sel = "" ;
      AV47TFProUserA = "" ;
      AV48TFProUserA_Sel = "" ;
      AV49TFProFecA = GXutil.resetTime( GXutil.nullDate() );
      AV51TFProUserM = "" ;
      AV52TFProUserM_Sel = "" ;
      AV53TFProFecM = GXutil.resetTime( GXutil.nullDate() );
      AV72Pgmname = "" ;
      AV64ProAct = "" ;
      AV62usurcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV56ProCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      Combo_procod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_informaciongeneral = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_procod_Jsonclick = "" ;
      ucCombo_procod = new com.genexus.webpanels.GXUserControl();
      Combo_procod_Caption = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV55ProCod = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV50DDO_ProFecAAuxDate = GXutil.nullDate() ;
      AV54DDO_ProFecMAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV73Tarticu_procesosds_1_tfprocod = "" ;
      lV75Tarticu_procesosds_3_tfprodsc = "" ;
      lV77Tarticu_procesosds_5_tfprousera = "" ;
      lV80Tarticu_procesosds_8_tfprouserm = "" ;
      AV74Tarticu_procesosds_2_tfprocod_sel = "" ;
      AV73Tarticu_procesosds_1_tfprocod = "" ;
      AV76Tarticu_procesosds_4_tfprodsc_sel = "" ;
      AV75Tarticu_procesosds_3_tfprodsc = "" ;
      AV78Tarticu_procesosds_6_tfprousera_sel = "" ;
      AV77Tarticu_procesosds_5_tfprousera = "" ;
      AV79Tarticu_procesosds_7_tfprofeca = GXutil.resetTime( GXutil.nullDate() );
      AV81Tarticu_procesosds_9_tfprouserm_sel = "" ;
      AV80Tarticu_procesosds_8_tfprouserm = "" ;
      AV82Tarticu_procesosds_10_tfprofecm = GXutil.resetTime( GXutil.nullDate() );
      H02662_A396EmprCod = new String[] {""} ;
      H02662_A252CliCod = new int[1] ;
      H02662_A65ArtCod = new String[] {""} ;
      H02662_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      H02662_A10555ProUserM = new String[] {""} ;
      H02662_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      H02662_A10553ProUserA = new String[] {""} ;
      H02662_A759ProDsc = new String[] {""} ;
      H02662_A758ProCod = new String[] {""} ;
      H02663_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV65Station = "" ;
      AV63EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new int[1] ;
      AV69Var_Messages = "" ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char9 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02664_A14284ProEst = new String[] {""} ;
      H02664_A396EmprCod = new String[] {""} ;
      H02664_A13771ProCDsc = new String[] {""} ;
      H02664_A758ProCod = new String[] {""} ;
      H02664_A759ProDsc = new String[] {""} ;
      A14284ProEst = "" ;
      A13771ProCDsc = "" ;
      AV57Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos__default(),
         new Object[] {
             new Object[] {
            H02662_A396EmprCod, H02662_A252CliCod, H02662_A65ArtCod, H02662_A10556ProFecM, H02662_A10555ProUserM, H02662_A10554ProFecA, H02662_A10553ProUserA, H02662_A759ProDsc, H02662_A758ProCod
            }
            , new Object[] {
            H02663_AGRID_nRecordCount
            }
            , new Object[] {
            H02664_A14284ProEst, H02664_A396EmprCod, H02664_A13771ProCDsc, H02664_A758ProCod, H02664_A759ProDsc
            }
         }
      );
      AV72Pgmname = "Tarticu_Procesos" ;
      /* GeneXus formulas. */
      AV72Pgmname = "Tarticu_Procesos" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavArtcod_Enabled = 0 ;
      edtavArtdsc_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV59CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_70 ;
   private int AV59CliCod ;
   private int nGXsfl_70_idx=1 ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtdsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavProcod_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV39PageToGo ;
   private int GXv_int8[] ;
   private int AV83GXV1 ;
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
   private String wcpOAV58Emprcod ;
   private String wcpOAV66CliNom ;
   private String wcpOAV60ArtCod ;
   private String wcpOAV61ArtDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Combo_procod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV58Emprcod ;
   private String AV66CliNom ;
   private String AV60ArtCod ;
   private String AV61ArtDsc ;
   private String sGXsfl_70_idx="0001" ;
   private String AV43TFProCod ;
   private String AV44TFProCod_Sel ;
   private String AV45TFProDsc ;
   private String AV46TFProDsc_Sel ;
   private String AV47TFProUserA ;
   private String AV48TFProUserA_Sel ;
   private String AV51TFProUserM ;
   private String AV52TFProUserM_Sel ;
   private String AV72Pgmname ;
   private String AV64ProAct ;
   private String AV62usurcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String Dvpanel_informaciongeneral_Width ;
   private String Dvpanel_informaciongeneral_Cls ;
   private String Dvpanel_informaciongeneral_Title ;
   private String Dvpanel_informaciongeneral_Iconposition ;
   private String Combo_procod_Cls ;
   private String Combo_procod_Selectedvalue_set ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_informaciongeneral_Internalname ;
   private String divInformaciongeneral_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtdsc_Internalname ;
   private String edtavArtdsc_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedprocod_Internalname ;
   private String lblTextblockcombo_procod_Internalname ;
   private String lblTextblockcombo_procod_Jsonclick ;
   private String Combo_procod_Caption ;
   private String Combo_procod_Internalname ;
   private String divProact_cell_Internalname ;
   private String divProact_cell_Class ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavProcod_Internalname ;
   private String AV55ProCod ;
   private String edtavProcod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_profecaauxdates_Internalname ;
   private String edtavDdo_profecaauxdate_Internalname ;
   private String edtavDdo_profecaauxdate_Jsonclick ;
   private String divDdo_profecmauxdates_Internalname ;
   private String edtavDdo_profecmauxdate_Internalname ;
   private String edtavDdo_profecmauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Internalname ;
   private String A10553ProUserA ;
   private String edtProUserA_Internalname ;
   private String edtProFecA_Internalname ;
   private String A10555ProUserM ;
   private String edtProUserM_Internalname ;
   private String edtProFecM_Internalname ;
   private String scmdbuf ;
   private String lV73Tarticu_procesosds_1_tfprocod ;
   private String lV75Tarticu_procesosds_3_tfprodsc ;
   private String lV77Tarticu_procesosds_5_tfprousera ;
   private String lV80Tarticu_procesosds_8_tfprouserm ;
   private String AV74Tarticu_procesosds_2_tfprocod_sel ;
   private String AV73Tarticu_procesosds_1_tfprocod ;
   private String AV76Tarticu_procesosds_4_tfprodsc_sel ;
   private String AV75Tarticu_procesosds_3_tfprodsc ;
   private String AV78Tarticu_procesosds_6_tfprousera_sel ;
   private String AV77Tarticu_procesosds_5_tfprousera ;
   private String AV81Tarticu_procesosds_9_tfprouserm_sel ;
   private String AV80Tarticu_procesosds_8_tfprouserm ;
   private String hsh ;
   private String AV65Station ;
   private String AV63EmprNom ;
   private String GXt_char12 ;
   private String GXv_char9[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A14284ProEst ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtProUserA_Jsonclick ;
   private String edtProFecA_Jsonclick ;
   private String edtProUserM_Jsonclick ;
   private String edtProFecM_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV49TFProFecA ;
   private java.util.Date AV53TFProFecM ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date AV79Tarticu_procesosds_7_tfprofeca ;
   private java.util.Date AV82Tarticu_procesosds_10_tfprofecm ;
   private java.util.Date AV50DDO_ProFecAAuxDate ;
   private java.util.Date AV54DDO_ProFecMAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_informaciongeneral_Autowidth ;
   private boolean Dvpanel_informaciongeneral_Autoheight ;
   private boolean Dvpanel_informaciongeneral_Collapsible ;
   private boolean Dvpanel_informaciongeneral_Collapsed ;
   private boolean Dvpanel_informaciongeneral_Showcollapseicon ;
   private boolean Dvpanel_informaciongeneral_Autoscroll ;
   private boolean Combo_procod_Emptyitem ;
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
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV69Var_Messages ;
   private String A13771ProCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_informaciongeneral ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_procod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavProact ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02662_A396EmprCod ;
   private int[] H02662_A252CliCod ;
   private String[] H02662_A65ArtCod ;
   private java.util.Date[] H02662_A10556ProFecM ;
   private String[] H02662_A10555ProUserM ;
   private java.util.Date[] H02662_A10554ProFecA ;
   private String[] H02662_A10553ProUserA ;
   private String[] H02662_A759ProDsc ;
   private String[] H02662_A758ProCod ;
   private long[] H02663_AGRID_nRecordCount ;
   private String[] H02664_A14284ProEst ;
   private String[] H02664_A396EmprCod ;
   private String[] H02664_A13771ProCDsc ;
   private String[] H02664_A758ProCod ;
   private String[] H02664_A759ProDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV56ProCod_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV57Combo_DataItem ;
}

final  class tarticu_procesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02662( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV73Tarticu_procesosds_1_tfprocod ,
                                          String AV76Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV75Tarticu_procesosds_3_tfprodsc ,
                                          String AV78Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV77Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV79Tarticu_procesosds_7_tfprofeca ,
                                          String AV81Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV80Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV82Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV58Emprcod ,
                                          int AV59CliCod ,
                                          String AV60ArtCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[18];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProFecM, T1.ProUserM, T1.ProFecA, T1.ProUserA, T2.ProDsc, T1.ProCod" ;
      sFromString = " FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV74Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV80Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProCod" ;
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
         sOrderString += " ORDER BY T2.ProDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ProDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProUserA" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProUserA DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProFecA" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProFecA DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProUserM" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProUserM DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProFecM" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProFecM DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H02663( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Tarticu_procesosds_2_tfprocod_sel ,
                                          String AV73Tarticu_procesosds_1_tfprocod ,
                                          String AV76Tarticu_procesosds_4_tfprodsc_sel ,
                                          String AV75Tarticu_procesosds_3_tfprodsc ,
                                          String AV78Tarticu_procesosds_6_tfprousera_sel ,
                                          String AV77Tarticu_procesosds_5_tfprousera ,
                                          java.util.Date AV79Tarticu_procesosds_7_tfprofeca ,
                                          String AV81Tarticu_procesosds_9_tfprouserm_sel ,
                                          String AV80Tarticu_procesosds_8_tfprouserm ,
                                          java.util.Date AV82Tarticu_procesosds_10_tfprofecm ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A10553ProUserA ,
                                          java.util.Date A10554ProFecA ,
                                          String A10555ProUserM ,
                                          java.util.Date A10556ProFecM ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV58Emprcod ,
                                          int AV59CliCod ,
                                          String AV60ArtCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[13];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?)");
      if ( (GXutil.strcmp("", AV74Tarticu_procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tarticu_procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tarticu_procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tarticu_procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tarticu_procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tarticu_procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_procesosds_6_tfprousera_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_procesosds_5_tfprousera)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_procesosds_6_tfprousera_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserA = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Tarticu_procesosds_7_tfprofeca) )
      {
         addWhere(sWhereString, "(T1.ProFecA >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tarticu_procesosds_9_tfprouserm_sel)==0) && ( ! (GXutil.strcmp("", AV80Tarticu_procesosds_8_tfprouserm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProUserM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tarticu_procesosds_9_tfprouserm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProUserM = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Tarticu_procesosds_10_tfprofecm) )
      {
         addWhere(sWhereString, "(T1.ProFecM >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H02662(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] );
            case 1 :
                  return conditional_H02663(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02662", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02663", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02664", "SELECT ProEst, EmprCod, RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, ProCod, ProDsc FROM TXPPROCES WHERE ProEst = 'A' ORDER BY ProCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 10);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], false);
               }
               return;
      }
   }

}

