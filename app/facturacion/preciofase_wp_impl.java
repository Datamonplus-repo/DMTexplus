package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preciofase_wp_impl extends GXDataArea
{
   public preciofase_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public preciofase_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciofase_wp_impl.class ));
   }

   public preciofase_wp_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavFaspreu = UIFactory.getCheckbox(this);
      chkavFasprekgf = UIFactory.getCheckbox(this);
      chkavFaskgsent = UIFactory.getCheckbox(this);
      chkavFasactiva = UIFactory.getCheckbox(this);
      cmbavGridactions = new HTMLChoice();
      chkFasPreU = UIFactory.getCheckbox(this);
      chkFasPreKgF = UIFactory.getCheckbox(this);
      chkFasKgsEnt = UIFactory.getCheckbox(this);
      chkFasActiva = UIFactory.getCheckbox(this);
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
            AV5emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
               AV7CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7CliNom", AV7CliNom);
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
      nRC_GXsfl_105 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_105"))) ;
      nGXsfl_105_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_105_idx"))) ;
      sGXsfl_105_idx = httpContext.GetPar( "sGXsfl_105_idx") ;
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
      AV5emprcod = httpContext.GetPar( "emprcod") ;
      AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV26TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV27TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV28TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV29TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV30TFFasPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreMtr"), ".") ;
      AV31TFFasPreMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreMtr_To"), ".") ;
      AV32TFFasPreMt2 = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreMt2"), ".") ;
      AV33TFFasPreMt2_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreMt2_To"), ".") ;
      AV34TFFasPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreKgm"), ".") ;
      AV35TFFasPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasPreKgm_To"), ".") ;
      AV36TFFasPreFAc = localUtil.parseDateParm( httpContext.GetPar( "TFFasPreFAc")) ;
      AV38TFFasPreU_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFFasPreU_Sel"))) ;
      AV39TFFasPreKgF_Sel = httpContext.GetPar( "TFFasPreKgF_Sel") ;
      AV40TFFasKgsEnt_Sel = httpContext.GetPar( "TFFasKgsEnt_Sel") ;
      AV41TFFasKgsMn = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgsMn"), ".") ;
      AV42TFFasKgsMn_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgsMn_To"), ".") ;
      AV61Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV16OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV17FasPreU = (byte)(GXutil.lval( httpContext.GetPar( "FasPreU"))) ;
      AV18FasPreKgF = httpContext.GetPar( "FasPreKgF") ;
      AV19FasKgsEnt = httpContext.GetPar( "FasKgsEnt") ;
      AV56FasActiva = httpContext.GetPar( "FasActiva") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
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
      pa2B22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2B22( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.preciofase_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7CliNom))}, new String[] {"emprcod","CliCod","CliNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioFase_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV61Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\preciofase_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_105", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_105, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV45GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV46GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV43DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV43DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV26TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV27TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV28TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV29TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREMTR", GXutil.ltrim( localUtil.ntoc( AV30TFFasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREMTR_TO", GXutil.ltrim( localUtil.ntoc( AV31TFFasPreMtr_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREMT2", GXutil.ltrim( localUtil.ntoc( AV32TFFasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREMT2_TO", GXutil.ltrim( localUtil.ntoc( AV33TFFasPreMt2_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREKGM", GXutil.ltrim( localUtil.ntoc( AV34TFFasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV35TFFasPreKgm_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREFAC", localUtil.dtoc( AV36TFFasPreFAc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREU_SEL", GXutil.ltrim( localUtil.ntoc( AV38TFFasPreU_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREKGF_SEL", GXutil.rtrim( AV39TFFasPreKgF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASKGSENT_SEL", GXutil.rtrim( AV40TFFasKgsEnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASKGSMN", GXutil.ltrim( localUtil.ntoc( AV41TFFasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASKGSMN_TO", GXutil.ltrim( localUtil.ntoc( AV42TFFasKgsMn_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV15OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV16OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD_SELECTED", GXutil.rtrim( AV57Fascod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASPRO", GXutil.ltrim( localUtil.ntoc( AV58faspro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Title", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_USERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_useraction1_Result));
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
         we2B22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2B22( ) ;
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
      return formatLink("app.facturacion.preciofase_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7CliNom))}, new String[] {"emprcod","CliCod","CliNom"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioFase_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Precio Fase ", "") ;
   }

   public void wb2B20( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV7CliNom), GXutil.rtrim( localUtil.format( AV7CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "Copiar", ""), bttBtncopiar_Jsonclick, 5, httpContext.getMessage( "Copiar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fase", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV21FasCod), GXutil.rtrim( localUtil.format( AV21FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction2_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV55FasDsc), GXutil.rtrim( localUtil.format( AV55FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaspremtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaspremtr_Internalname, httpContext.getMessage( "Precio Mt", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaspremtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV22FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaspremtr_Enabled!=0) ? localUtil.format( AV22FasPreMtr, "ZZZZZZ9.999") : localUtil.format( AV22FasPreMtr, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaspremtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaspremtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaspremt2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaspremt2_Internalname, httpContext.getMessage( "Precio Mt 2", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaspremt2_Internalname, GXutil.ltrim( localUtil.ntoc( AV23FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaspremt2_Enabled!=0) ? localUtil.format( AV23FasPreMt2, "ZZZZZZ9.99999") : localUtil.format( AV23FasPreMt2, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaspremt2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaspremt2_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasprekgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasprekgm_Internalname, httpContext.getMessage( "Precio Kg", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV24FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFasprekgm_Enabled!=0) ? localUtil.format( AV24FasPreKgm, "ZZZZZZ9.999") : localUtil.format( AV24FasPreKgm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasprekgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFaspreu.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFaspreu.getInternalname(), httpContext.getMessage( "Precio Unico p/Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFaspreu.getInternalname(), GXutil.str( AV17FasPreU, 1, 0), "", httpContext.getMessage( "Precio Unico p/Fase", ""), 1, chkavFaspreu.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(61, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFasprekgf.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFasprekgf.getInternalname(), httpContext.getMessage( "Facturar Precio Kilo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFasprekgf.getInternalname(), AV18FasPreKgF, "", httpContext.getMessage( "Facturar Precio Kilo?", ""), 1, chkavFasprekgf.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(65, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,65);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFaskgsent.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFaskgsent.getInternalname(), httpContext.getMessage( "Facturar por Kilos Entrada?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFaskgsent.getInternalname(), AV19FasKgsEnt, "", httpContext.getMessage( "Facturar por Kilos Entrada?", ""), 1, chkavFaskgsent.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(69, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,69);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaskgsmn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaskgsmn_Internalname, httpContext.getMessage( "Kgs Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaskgsmn_Internalname, GXutil.ltrim( localUtil.ntoc( AV20FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaskgsmn_Enabled!=0) ? localUtil.format( AV20FasKgsMn, "ZZZZZ9.99") : localUtil.format( AV20FasKgsMn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaskgsmn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaskgsmn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasprefac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasprefac_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFasprefac_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasprefac_Internalname, localUtil.format(AV54FasPreFAc, "99/99/99"), localUtil.format( AV54FasPreFAc, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasprefac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasprefac_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFasprefac_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFasprefac_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFasactiva.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFasactiva.getInternalname(), httpContext.getMessage( "Activa?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFasactiva.getInternalname(), AV56FasActiva, "", httpContext.getMessage( "Activa?", ""), 1, chkavFasactiva.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(81, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,81);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiar_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioFase_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextmessage_Internalname, lblTextmessage_Caption, "", "", lblTextmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\PrecioFase_WP.htm");
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
         startgridcontrol105( ) ;
      }
      if ( wbEnd == 105 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_105 = (int)(nGXsfl_105_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV45GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV46GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV61Pgmname), GXutil.rtrim( localUtil.format( AV61Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioFase_WP.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV43DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrefas_Internalname, GXutil.ltrim( localUtil.ntoc( AV52prefas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52prefas), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrefas_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrefas_Visible, 1, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         wb_table1_133_2B22( true) ;
      }
      else
      {
         wb_table1_133_2B22( false) ;
      }
      return  ;
   }

   public void wb_table1_133_2B22e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_fasprefacauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_105_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_fasprefacauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_fasprefacauxdate_Internalname, localUtil.format(AV37DDO_FasPreFAcAuxDate, "99/99/99"), localUtil.format( AV37DDO_FasPreFAcAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_fasprefacauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_fasprefacauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\PrecioFase_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 105 )
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

   public void start2B22( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Precio Fase ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2B20( ) ;
   }

   public void ws2B22( )
   {
      start2B22( ) ;
      evt2B22( ) ;
   }

   public void evt2B22( )
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
                           e112B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_USERACTION1.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiar' */
                           e162B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e172B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCopiar' */
                           e182B22 ();
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
                                 e192B22 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VFASCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202B22 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FASCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FASCOD.CLICK") == 0 ) )
                        {
                           nGXsfl_105_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1052( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV53GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActions), 4, 0));
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
                           n467FasPreMtr = false ;
                           A12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)) ;
                           n12576FasPreMt2 = false ;
                           A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
                           n466FasPreKgm = false ;
                           A4385FasPreFAc = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtFasPreFAc_Internalname), 0)) ;
                           n4385FasPreFAc = false ;
                           A10882FasPreU = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0)) ;
                           n10882FasPreU = false ;
                           A12577FasPreKgF = ((GXutil.strcmp(httpContext.cgiGet( chkFasPreKgF.getInternalname()), "S")==0) ? "S" : "N") ;
                           n12577FasPreKgF = false ;
                           A13587FasKgsEnt = ((GXutil.strcmp(httpContext.cgiGet( chkFasKgsEnt.getInternalname()), "S")==0) ? "S" : "N") ;
                           n13587FasKgsEnt = false ;
                           A12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)) ;
                           n12704FasKgsMn = false ;
                           A14042FasActiva = ((GXutil.strcmp(httpContext.cgiGet( chkFasActiva.getInternalname()), "S")==0) ? "S" : "N") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e212B22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e222B22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232B22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242B22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FASCOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252B22 ();
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

   public void we2B22( )
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

   public void pa2B22( )
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
            GX_FocusControl = edtavFascod_Internalname ;
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
      subsflControlProps_1052( ) ;
      while ( nGXsfl_105_idx <= nRC_GXsfl_105 )
      {
         sendrow_1052( ) ;
         nGXsfl_105_idx = ((subGrid_Islastpage==1)&&(nGXsfl_105_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5emprcod ,
                                 int AV6CliCod ,
                                 String AV26TFFasCod ,
                                 String AV27TFFasCod_Sel ,
                                 String AV28TFFasDsc ,
                                 String AV29TFFasDsc_Sel ,
                                 java.math.BigDecimal AV30TFFasPreMtr ,
                                 java.math.BigDecimal AV31TFFasPreMtr_To ,
                                 java.math.BigDecimal AV32TFFasPreMt2 ,
                                 java.math.BigDecimal AV33TFFasPreMt2_To ,
                                 java.math.BigDecimal AV34TFFasPreKgm ,
                                 java.math.BigDecimal AV35TFFasPreKgm_To ,
                                 java.util.Date AV36TFFasPreFAc ,
                                 byte AV38TFFasPreU_Sel ,
                                 String AV39TFFasPreKgF_Sel ,
                                 String AV40TFFasKgsEnt_Sel ,
                                 java.math.BigDecimal AV41TFFasKgsMn ,
                                 java.math.BigDecimal AV42TFFasKgsMn_To ,
                                 String AV61Pgmname ,
                                 short AV15OrderedBy ,
                                 boolean AV16OrderedDsc ,
                                 byte AV17FasPreU ,
                                 String AV18FasPreKgF ,
                                 String AV19FasKgsEnt ,
                                 String AV56FasActiva )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222B22 ();
      GRID_nCurrentRecord = 0 ;
      rf2B22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioFase_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV61Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\preciofase_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
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
      AV17FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV17FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
      AV18FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( AV18FasPreKgF), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
      AV19FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( AV19FasKgsEnt), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
      AV56FasActiva = ((GXutil.strcmp(GXutil.rtrim( AV56FasActiva), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56FasActiva", AV56FasActiva);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2B22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV61Pgmname = "Facturacion.PrecioFase_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Pgmname", AV61Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavFasprefac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasprefac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasprefac_Enabled), 5, 0), true);
      chkavFasactiva.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavFasactiva.getInternalname(), "Enabled", GXutil.ltrimstr( chkavFasactiva.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2B22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(105) ;
      /* Execute user event: Refresh */
      e222B22 ();
      nGXsfl_105_idx = 1 ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1052( ) ;
      bGXsfl_105_Refreshing = true ;
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
         subsflControlProps_1052( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV63Facturacion_preciofase_wpds_2_tffascod_sel ,
                                              AV62Facturacion_preciofase_wpds_1_tffascod ,
                                              AV65Facturacion_preciofase_wpds_4_tffasdsc_sel ,
                                              AV64Facturacion_preciofase_wpds_3_tffasdsc ,
                                              AV66Facturacion_preciofase_wpds_5_tffaspremtr ,
                                              AV67Facturacion_preciofase_wpds_6_tffaspremtr_to ,
                                              AV68Facturacion_preciofase_wpds_7_tffaspremt2 ,
                                              AV69Facturacion_preciofase_wpds_8_tffaspremt2_to ,
                                              AV70Facturacion_preciofase_wpds_9_tffasprekgm ,
                                              AV71Facturacion_preciofase_wpds_10_tffasprekgm_to ,
                                              AV72Facturacion_preciofase_wpds_11_tffasprefac ,
                                              Byte.valueOf(AV73Facturacion_preciofase_wpds_12_tffaspreu_sel) ,
                                              AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel ,
                                              AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel ,
                                              AV76Facturacion_preciofase_wpds_15_tffaskgsmn ,
                                              AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A467FasPreMtr ,
                                              A12576FasPreMt2 ,
                                              A466FasPreKgm ,
                                              A4385FasPreFAc ,
                                              Byte.valueOf(A10882FasPreU) ,
                                              A12577FasPreKgF ,
                                              A13587FasKgsEnt ,
                                              A12704FasKgsMn ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) ,
                                              AV5emprcod ,
                                              Integer.valueOf(AV6CliCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV62Facturacion_preciofase_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV62Facturacion_preciofase_wpds_1_tffascod), 8, "%") ;
         lV64Facturacion_preciofase_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV64Facturacion_preciofase_wpds_3_tffasdsc), 28, "%") ;
         /* Using cursor H02B22 */
         pr_default.execute(0, new Object[] {AV5emprcod, Integer.valueOf(AV6CliCod), lV62Facturacion_preciofase_wpds_1_tffascod, AV63Facturacion_preciofase_wpds_2_tffascod_sel, lV64Facturacion_preciofase_wpds_3_tffasdsc, AV65Facturacion_preciofase_wpds_4_tffasdsc_sel, AV66Facturacion_preciofase_wpds_5_tffaspremtr, AV67Facturacion_preciofase_wpds_6_tffaspremtr_to, AV68Facturacion_preciofase_wpds_7_tffaspremt2, AV69Facturacion_preciofase_wpds_8_tffaspremt2_to, AV70Facturacion_preciofase_wpds_9_tffasprekgm, AV71Facturacion_preciofase_wpds_10_tffasprekgm_to, AV72Facturacion_preciofase_wpds_11_tffasprefac, AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel, AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel, AV76Facturacion_preciofase_wpds_15_tffaskgsmn, AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_105_idx = 1 ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A252CliCod = H02B22_A252CliCod[0] ;
            A396EmprCod = H02B22_A396EmprCod[0] ;
            A14042FasActiva = H02B22_A14042FasActiva[0] ;
            A12704FasKgsMn = H02B22_A12704FasKgsMn[0] ;
            n12704FasKgsMn = H02B22_n12704FasKgsMn[0] ;
            A13587FasKgsEnt = H02B22_A13587FasKgsEnt[0] ;
            n13587FasKgsEnt = H02B22_n13587FasKgsEnt[0] ;
            A12577FasPreKgF = H02B22_A12577FasPreKgF[0] ;
            n12577FasPreKgF = H02B22_n12577FasPreKgF[0] ;
            A10882FasPreU = H02B22_A10882FasPreU[0] ;
            n10882FasPreU = H02B22_n10882FasPreU[0] ;
            A4385FasPreFAc = H02B22_A4385FasPreFAc[0] ;
            n4385FasPreFAc = H02B22_n4385FasPreFAc[0] ;
            A466FasPreKgm = H02B22_A466FasPreKgm[0] ;
            n466FasPreKgm = H02B22_n466FasPreKgm[0] ;
            A12576FasPreMt2 = H02B22_A12576FasPreMt2[0] ;
            n12576FasPreMt2 = H02B22_n12576FasPreMt2[0] ;
            A467FasPreMtr = H02B22_A467FasPreMtr[0] ;
            n467FasPreMtr = H02B22_n467FasPreMtr[0] ;
            A460FasDsc = H02B22_A460FasDsc[0] ;
            A457FasCod = H02B22_A457FasCod[0] ;
            A14042FasActiva = H02B22_A14042FasActiva[0] ;
            A460FasDsc = H02B22_A460FasDsc[0] ;
            e232B22 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(105) ;
         wb2B20( ) ;
      }
      bGXsfl_105_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2B22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD"+"_"+sGXsfl_105_idx, getSecureSignedToken( sGXsfl_105_idx, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
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
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Facturacion_preciofase_wpds_2_tffascod_sel ,
                                           AV62Facturacion_preciofase_wpds_1_tffascod ,
                                           AV65Facturacion_preciofase_wpds_4_tffasdsc_sel ,
                                           AV64Facturacion_preciofase_wpds_3_tffasdsc ,
                                           AV66Facturacion_preciofase_wpds_5_tffaspremtr ,
                                           AV67Facturacion_preciofase_wpds_6_tffaspremtr_to ,
                                           AV68Facturacion_preciofase_wpds_7_tffaspremt2 ,
                                           AV69Facturacion_preciofase_wpds_8_tffaspremt2_to ,
                                           AV70Facturacion_preciofase_wpds_9_tffasprekgm ,
                                           AV71Facturacion_preciofase_wpds_10_tffasprekgm_to ,
                                           AV72Facturacion_preciofase_wpds_11_tffasprefac ,
                                           Byte.valueOf(AV73Facturacion_preciofase_wpds_12_tffaspreu_sel) ,
                                           AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel ,
                                           AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel ,
                                           AV76Facturacion_preciofase_wpds_15_tffaskgsmn ,
                                           AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A467FasPreMtr ,
                                           A12576FasPreMt2 ,
                                           A466FasPreKgm ,
                                           A4385FasPreFAc ,
                                           Byte.valueOf(A10882FasPreU) ,
                                           A12577FasPreKgF ,
                                           A13587FasKgsEnt ,
                                           A12704FasKgsMn ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV5emprcod ,
                                           Integer.valueOf(AV6CliCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV62Facturacion_preciofase_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV62Facturacion_preciofase_wpds_1_tffascod), 8, "%") ;
      lV64Facturacion_preciofase_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV64Facturacion_preciofase_wpds_3_tffasdsc), 28, "%") ;
      /* Using cursor H02B23 */
      pr_default.execute(1, new Object[] {AV5emprcod, Integer.valueOf(AV6CliCod), lV62Facturacion_preciofase_wpds_1_tffascod, AV63Facturacion_preciofase_wpds_2_tffascod_sel, lV64Facturacion_preciofase_wpds_3_tffasdsc, AV65Facturacion_preciofase_wpds_4_tffasdsc_sel, AV66Facturacion_preciofase_wpds_5_tffaspremtr, AV67Facturacion_preciofase_wpds_6_tffaspremtr_to, AV68Facturacion_preciofase_wpds_7_tffaspremt2, AV69Facturacion_preciofase_wpds_8_tffaspremt2_to, AV70Facturacion_preciofase_wpds_9_tffasprekgm, AV71Facturacion_preciofase_wpds_10_tffasprekgm_to, AV72Facturacion_preciofase_wpds_11_tffasprefac, AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel, AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel, AV76Facturacion_preciofase_wpds_15_tffaskgsmn, AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to});
      GRID_nRecordCount = H02B23_AGRID_nRecordCount[0] ;
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
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5emprcod, AV6CliCod, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV30TFFasPreMtr, AV31TFFasPreMtr_To, AV32TFFasPreMt2, AV33TFFasPreMt2_To, AV34TFFasPreKgm, AV35TFFasPreKgm_To, AV36TFFasPreFAc, AV38TFFasPreU_Sel, AV39TFFasPreKgF_Sel, AV40TFFasKgsEnt_Sel, AV41TFFasKgsMn, AV42TFFasKgsMn_To, AV61Pgmname, AV15OrderedBy, AV16OrderedDsc, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV56FasActiva) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV61Pgmname = "Facturacion.PrecioFase_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Pgmname", AV61Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavFasprefac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasprefac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasprefac_Enabled), 5, 0), true);
      chkavFasactiva.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavFasactiva.getInternalname(), "Enabled", GXutil.ltrimstr( chkavFasactiva.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2B20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e212B22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV43DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_105 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_105"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV46GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_useraction1_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Title") ;
         Dvelop_confirmpanel_useraction1_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Confirmationtext") ;
         Dvelop_confirmpanel_useraction1_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Yesbuttoncaption") ;
         Dvelop_confirmpanel_useraction1_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Nobuttoncaption") ;
         Dvelop_confirmpanel_useraction1_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_useraction1_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Yesbuttonposition") ;
         Dvelop_confirmpanel_useraction1_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Confirmtype") ;
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
         Dvelop_confirmpanel_useraction1_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_USERACTION1_Result") ;
         /* Read variables values. */
         AV21FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod", AV21FasCod);
         AV55FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55FasDsc", AV55FasDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaspremtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaspremtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASPREMTR");
            GX_FocusControl = edtavFaspremtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22FasPreMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22FasPreMtr", GXutil.ltrimstr( AV22FasPreMtr, 13, 5));
         }
         else
         {
            AV22FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtavFaspremtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22FasPreMtr", GXutil.ltrimstr( AV22FasPreMtr, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaspremt2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaspremt2_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASPREMT2");
            GX_FocusControl = edtavFaspremt2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23FasPreMt2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
         }
         else
         {
            AV23FasPreMt2 = localUtil.ctond( httpContext.cgiGet( edtavFaspremt2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFasprekgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFasprekgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASPREKGM");
            GX_FocusControl = edtavFasprekgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24FasPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
         }
         else
         {
            AV24FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtavFasprekgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavFaspreu.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavFaspreu.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASPREU");
            GX_FocusControl = chkavFaspreu.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17FasPreU = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
         }
         else
         {
            AV17FasPreU = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavFaspreu.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
         }
         AV18FasPreKgF = ((GXutil.strcmp(httpContext.cgiGet( chkavFasprekgf.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
         AV19FasKgsEnt = ((GXutil.strcmp(httpContext.cgiGet( chkavFaskgsent.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaskgsmn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaskgsmn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASKGSMN");
            GX_FocusControl = edtavFaskgsmn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20FasKgsMn = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
         }
         else
         {
            AV20FasKgsMn = localUtil.ctond( httpContext.cgiGet( edtavFaskgsmn_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFasprefac_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFASPREFAC");
            GX_FocusControl = edtavFasprefac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54FasPreFAc = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
         }
         else
         {
            AV54FasPreFAc = localUtil.ctod( httpContext.cgiGet( edtavFasprefac_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
         }
         AV56FasActiva = ((GXutil.strcmp(httpContext.cgiGet( chkavFasactiva.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56FasActiva", AV56FasActiva);
         AV61Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Pgmname", AV61Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrefas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrefas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREFAS");
            GX_FocusControl = edtavPrefas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52prefas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
         }
         else
         {
            AV52prefas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavPrefas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_fasprefacauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FASPREFACAUXDATE");
            GX_FocusControl = edtavDdo_fasprefacauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37DDO_FasPreFAcAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37DDO_FasPreFAcAuxDate", localUtil.format(AV37DDO_FasPreFAcAuxDate, "99/99/99"));
         }
         else
         {
            AV37DDO_FasPreFAcAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_fasprefacauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37DDO_FasPreFAcAuxDate", localUtil.format(AV37DDO_FasPreFAcAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_105_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
         if ( nGXsfl_105_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV53GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActions), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
            n467FasPreMtr = false ;
            A12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)) ;
            n12576FasPreMt2 = false ;
            A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
            n466FasPreKgm = false ;
            A4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( edtFasPreFAc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4385FasPreFAc = false ;
            A10882FasPreU = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0)) ;
            n10882FasPreU = false ;
            A12577FasPreKgF = ((GXutil.strcmp(httpContext.cgiGet( chkFasPreKgF.getInternalname()), "S")==0) ? "S" : "N") ;
            n12577FasPreKgF = false ;
            A13587FasKgsEnt = ((GXutil.strcmp(httpContext.cgiGet( chkFasKgsEnt.getInternalname()), "S")==0) ? "S" : "N") ;
            n13587FasKgsEnt = false ;
            A12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)) ;
            n12704FasKgsMn = false ;
            A14042FasActiva = ((GXutil.strcmp(httpContext.cgiGet( chkFasActiva.getInternalname()), "S")==0) ? "S" : "N") ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PrecioFase_WP");
         AV61Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Pgmname", AV61Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV61Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\preciofase_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e212B22 ();
      if (returnInSub) return;
   }

   public void e212B22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV49Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      preciofase_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Station = GXt_char1 ;
      GXv_char2[0] = AV5emprcod ;
      GXv_char3[0] = AV50EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV49Station, GXv_char2, GXv_char3, GXv_char4) ;
      preciofase_wp_impl.this.AV5emprcod = GXv_char2[0] ;
      preciofase_wp_impl.this.AV50EmprNom = GXv_char3[0] ;
      preciofase_wp_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      edtavPrefas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrefas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrefas_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Precio Fase ", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV15OrderedBy < 1 )
      {
         AV15OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV43DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV43DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e222B22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      AV46GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_105_Refreshing);
      edtFasCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Columnheaderclass", edtFasCod_Columnheaderclass, !bGXsfl_105_Refreshing);
      edtFasDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Columnheaderclass", edtFasDsc_Columnheaderclass, !bGXsfl_105_Refreshing);
      edtFasPreMtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Columnheaderclass", edtFasPreMtr_Columnheaderclass, !bGXsfl_105_Refreshing);
      edtFasPreMt2_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMt2_Internalname, "Columnheaderclass", edtFasPreMt2_Columnheaderclass, !bGXsfl_105_Refreshing);
      edtFasPreKgm_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Columnheaderclass", edtFasPreKgm_Columnheaderclass, !bGXsfl_105_Refreshing);
      edtFasPreFAc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Columnheaderclass", edtFasPreFAc_Columnheaderclass, !bGXsfl_105_Refreshing);
      chkFasPreU.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "Columnheaderclass", chkFasPreU.getColumnHeaderClass(), !bGXsfl_105_Refreshing);
      chkFasPreKgF.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "Columnheaderclass", chkFasPreKgF.getColumnHeaderClass(), !bGXsfl_105_Refreshing);
      chkFasKgsEnt.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "Columnheaderclass", chkFasKgsEnt.getColumnHeaderClass(), !bGXsfl_105_Refreshing);
      edtFasKgsMn_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgsMn_Internalname, "Columnheaderclass", edtFasKgsMn_Columnheaderclass, !bGXsfl_105_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction2_Internalname});
      AV62Facturacion_preciofase_wpds_1_tffascod = AV26TFFasCod ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = AV27TFFasCod_Sel ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = AV28TFFasDsc ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = AV30TFFasPreMtr ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = AV31TFFasPreMtr_To ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = AV32TFFasPreMt2 ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = AV33TFFasPreMt2_To ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = AV34TFFasPreKgm ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = AV35TFFasPreKgm_To ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = AV36TFFasPreFAc ;
      AV73Facturacion_preciofase_wpds_12_tffaspreu_sel = AV38TFFasPreU_Sel ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = AV39TFFasPreKgF_Sel ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = AV40TFFasKgsEnt_Sel ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = AV41TFFasKgsMn ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = AV42TFFasKgsMn_To ;
      /*  Sending Event outputs  */
   }

   public void e112B22( )
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
         AV44PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV44PageToGo) ;
      }
   }

   public void e122B22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132B22( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV15OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         AV16OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedDsc", AV16OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV26TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasCod", AV26TFFasCod);
            AV27TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasCod_Sel", AV27TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV28TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasDsc", AV28TFFasDsc);
            AV29TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFasDsc_Sel", AV29TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreMtr") == 0 )
         {
            AV30TFFasPreMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFasPreMtr", GXutil.ltrimstr( AV30TFFasPreMtr, 13, 5));
            AV31TFFasPreMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFasPreMtr_To", GXutil.ltrimstr( AV31TFFasPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreMt2") == 0 )
         {
            AV32TFFasPreMt2 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFasPreMt2", GXutil.ltrimstr( AV32TFFasPreMt2, 13, 5));
            AV33TFFasPreMt2_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFasPreMt2_To", GXutil.ltrimstr( AV33TFFasPreMt2_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreKgm") == 0 )
         {
            AV34TFFasPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasPreKgm", GXutil.ltrimstr( AV34TFFasPreKgm, 13, 5));
            AV35TFFasPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasPreKgm_To", GXutil.ltrimstr( AV35TFFasPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreFAc") == 0 )
         {
            AV36TFFasPreFAc = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasPreFAc", localUtil.format(AV36TFFasPreFAc, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreU") == 0 )
         {
            AV38TFFasPreU_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFasPreU_Sel", GXutil.str( AV38TFFasPreU_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreKgF") == 0 )
         {
            AV39TFFasPreKgF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFasPreKgF_Sel", AV39TFFasPreKgF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasKgsEnt") == 0 )
         {
            AV40TFFasKgsEnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFasKgsEnt_Sel", AV40TFFasKgsEnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasKgsMn") == 0 )
         {
            AV41TFFasKgsMn = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFasKgsMn", GXutil.ltrimstr( AV41TFFasKgsMn, 9, 2));
            AV42TFFasKgsMn_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasKgsMn_To", GXutil.ltrimstr( AV42TFFasKgsMn_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e232B22( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtFasCod_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtFasDsc_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtFasPreMtr_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtFasPreMt2_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtFasPreKgm_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtFasPreFAc_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      chkFasPreU.setColumnClass( ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      chkFasPreKgF.setColumnClass( ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      chkFasKgsEnt.setColumnClass( ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      edtFasKgsMn_Columnclass = ((GXutil.strcmp(A14042FasActiva, httpContext.getMessage( "N", ""))==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(105) ;
      }
      sendrow_1052( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_105_Refreshing )
      {
         httpContext.doAjaxLoad(105, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV53GridActions, 4, 0)) );
   }

   public void e242B22( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV53GridActions == 1 )
      {
         /* Execute user subroutine: 'DO USERACTION1' */
         S152 ();
         if (returnInSub) return;
      }
      AV53GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV53GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142B22( )
   {
      /* Dvelop_confirmpanel_useraction1_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_useraction1_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION USERACTION1' */
         S162 ();
         if (returnInSub) return;
      }
   }

   public void e152B22( )
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

   public void e162B22( )
   {
      /* 'DoLimpiar' Routine */
      returnInSub = false ;
      AV21FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod", AV21FasCod);
      AV55FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FasDsc", AV55FasDsc);
      AV19FasKgsEnt = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
      AV20FasKgsMn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
      AV18FasPreKgF = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
      AV24FasPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
      AV23FasPreMt2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
      AV17FasPreU = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
      AV52prefas = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
      AV54FasPreFAc = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e172B22( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfasproprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.rtrim(AV21FasCod)),GXutil.URLEncode(GXutil.rtrim(AV55FasDsc))}, new String[] {"InOutEmprCod","InOutFasCod","InOutFasDsc"}) , new Object[] {"AV5emprcod","AV21FasCod","AV55FasDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e182B22( )
   {
      /* 'DoCopiar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.copiarpreciosfase", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0))}, new String[] {"Emprcod","ClicodOrigen"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV15OrderedBy, 4, 0))+":"+(AV16OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO USERACTION1' Routine */
      returnInSub = false ;
      AV57Fascod_Selected = A457FasCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Fascod_Selected", AV57Fascod_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_USERACTION1Container", "Confirm", "", new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'DO ACTION USERACTION1' Routine */
      returnInSub = false ;
      new app.facturacion.preciofase_del(remoteHandle, context).execute( AV5emprcod, AV6CliCod, AV57Fascod_Selected) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV61Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV61Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV25Session.getValue(AV61Pgmname+"GridState"), null, null);
      }
      AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
      AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedDsc", AV16OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV26TFFasCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasCod", AV26TFFasCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV27TFFasCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasCod_Sel", AV27TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV28TFFasDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasDsc", AV28TFFasDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV29TFFasDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFasDsc_Sel", AV29TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREMTR") == 0 )
         {
            AV30TFFasPreMtr = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFasPreMtr", GXutil.ltrimstr( AV30TFFasPreMtr, 13, 5));
            AV31TFFasPreMtr_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFasPreMtr_To", GXutil.ltrimstr( AV31TFFasPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREMT2") == 0 )
         {
            AV32TFFasPreMt2 = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFasPreMt2", GXutil.ltrimstr( AV32TFFasPreMt2, 13, 5));
            AV33TFFasPreMt2_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFasPreMt2_To", GXutil.ltrimstr( AV33TFFasPreMt2_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREKGM") == 0 )
         {
            AV34TFFasPreKgm = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasPreKgm", GXutil.ltrimstr( AV34TFFasPreKgm, 13, 5));
            AV35TFFasPreKgm_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasPreKgm_To", GXutil.ltrimstr( AV35TFFasPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREFAC") == 0 )
         {
            AV36TFFasPreFAc = localUtil.ctod( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasPreFAc", localUtil.format(AV36TFFasPreFAc, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREU_SEL") == 0 )
         {
            AV38TFFasPreU_Sel = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFasPreU_Sel", GXutil.str( AV38TFFasPreU_Sel, 1, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREKGF_SEL") == 0 )
         {
            AV39TFFasPreKgF_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFasPreKgF_Sel", AV39TFFasPreKgF_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGSENT_SEL") == 0 )
         {
            AV40TFFasKgsEnt_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFasKgsEnt_Sel", AV40TFFasKgsEnt_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGSMN") == 0 )
         {
            AV41TFFasKgsMn = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFasKgsMn", GXutil.ltrimstr( AV41TFFasKgsMn, 9, 2));
            AV42TFFasKgsMn_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasKgsMn_To", GXutil.ltrimstr( AV42TFFasKgsMn_To, 9, 2));
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFFasCod_Sel)==0), AV27TFFasCod_Sel, GXv_char4) ;
      preciofase_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFFasDsc_Sel)==0), AV29TFFasDsc_Sel, GXv_char3) ;
      preciofase_wp_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFFasPreKgF_Sel)==0), AV39TFFasPreKgF_Sel, GXv_char2) ;
      preciofase_wp_impl.this.GXt_char9 = GXv_char2[0] ;
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFFasKgsEnt_Sel)==0), AV40TFFasKgsEnt_Sel, GXv_char11) ;
      preciofase_wp_impl.this.GXt_char10 = GXv_char11[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char8+"|||||"+((0==AV38TFFasPreU_Sel) ? "" : GXutil.str( AV38TFFasPreU_Sel, 1, 0))+"|"+GXt_char9+"|"+GXt_char10+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char10 = "" ;
      GXv_char11[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFFasCod)==0), AV26TFFasCod, GXv_char11) ;
      preciofase_wp_impl.this.GXt_char10 = GXv_char11[0] ;
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFasDsc)==0), AV28TFFasDsc, GXv_char4) ;
      preciofase_wp_impl.this.GXt_char9 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char10+"|"+GXt_char9+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasPreMtr)==0) ? "" : GXutil.str( AV30TFFasPreMtr, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFFasPreMt2)==0) ? "" : GXutil.str( AV32TFFasPreMt2, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFasPreKgm)==0) ? "" : GXutil.str( AV34TFFasPreKgm, 13, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFFasPreFAc)) ? "" : localUtil.dtoc( AV36TFFasPreFAc, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFFasKgsMn)==0) ? "" : GXutil.str( AV41TFFasKgsMn, 9, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFFasPreMtr_To)==0) ? "" : GXutil.str( AV31TFFasPreMtr_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFFasPreMt2_To)==0) ? "" : GXutil.str( AV33TFFasPreMt2_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFasPreKgm_To)==0) ? "" : GXutil.str( AV35TFFasPreKgm_To, 13, 5))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFFasKgsMn_To)==0) ? "" : GXutil.str( AV42TFFasKgsMn_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV13GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV13GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV13GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV25Session.getValue(AV61Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV15OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV16OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASCOD", "", !(GXutil.strcmp("", AV26TFFasCod)==0), (short)(0), AV26TFFasCod, "", !(GXutil.strcmp("", AV27TFFasCod_Sel)==0), AV27TFFasCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASDSC", "", !(GXutil.strcmp("", AV28TFFasDsc)==0), (short)(0), AV28TFFasDsc, "", !(GXutil.strcmp("", AV29TFFasDsc_Sel)==0), AV29TFFasDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasPreMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFFasPreMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFFasPreMtr, 13, 5)), GXutil.trim( GXutil.str( AV31TFFasPreMtr_To, 13, 5))) ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREMT2", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFFasPreMt2)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFFasPreMt2_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFFasPreMt2, 13, 5)), GXutil.trim( GXutil.str( AV33TFFasPreMt2_To, 13, 5))) ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFasPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFasPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFFasPreKgm, 13, 5)), GXutil.trim( GXutil.str( AV35TFFasPreKgm_To, 13, 5))) ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREFAC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFFasPreFAc)), (short)(0), GXutil.trim( localUtil.dtoc( AV36TFFasPreFAc, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREU_SEL", "", !(0==AV38TFFasPreU_Sel), (short)(0), GXutil.trim( GXutil.str( AV38TFFasPreU_Sel, 1, 0)), "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASPREKGF_SEL", "", !(GXutil.strcmp("", AV39TFFasPreKgF_Sel)==0), (short)(0), AV39TFFasPreKgF_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASKGSENT_SEL", "", !(GXutil.strcmp("", AV40TFFasKgsEnt_Sel)==0), (short)(0), AV40TFFasKgsEnt_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFFASKGSMN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFFasKgsMn)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFFasKgsMn_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFFasKgsMn, 9, 2)), GXutil.trim( GXutil.str( AV42TFFasKgsMn_To, 9, 2))) ;
      AV13GridState = GXv_SdtWWPGridState12[0] ;
      AV13GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV13GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV61Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV11TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV61Pgmname );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.PrecioFase_TRN" );
      AV25Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e192B22 ();
      if (returnInSub) return;
   }

   public void e192B22( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTextmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
      if ( (GXutil.strcmp("", AV21FasCod)==0) )
      {
         GX_FocusControl = edtavFascod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTextmessage_Caption = httpContext.getMessage( "Codgio no Valido", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
      }
      else
      {
         if ( ( GXutil.strcmp(AV56FasActiva, "N") == 0 ) && ( AV52prefas == 0 ) )
         {
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            if ( AV58faspro == 0 )
            {
               lblTextmessage_Caption = httpContext.getMessage( "Fase INEXISTENTE", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
            }
            else
            {
               lblTextmessage_Caption = httpContext.getMessage( "Fase INACTIVA", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
            }
         }
         else
         {
            new app.facturacion.preciofase_ins_upd(remoteHandle, context).execute( AV5emprcod, AV6CliCod, AV21FasCod, AV22FasPreMtr, AV24FasPreKgm, AV23FasPreMt2, AV17FasPreU, AV18FasPreKgF, AV19FasKgsEnt, AV20FasKgsMn, GXutil.today( )) ;
            AV21FasCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod", AV21FasCod);
            AV55FasDsc = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55FasDsc", AV55FasDsc);
            AV19FasKgsEnt = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
            AV20FasKgsMn = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
            AV18FasPreKgF = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
            AV24FasPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
            AV23FasPreMt2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
            AV17FasPreU = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
            AV52prefas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
            AV54FasPreFAc = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            lblTextmessage_Caption = " " ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void e202B22( )
   {
      /* Fascod_Isvalid Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV21FasCod)==0) )
      {
         lblTextmessage_Caption = " " ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
         GXv_decimal13[0] = AV22FasPreMtr ;
         GXv_decimal14[0] = AV24FasPreKgm ;
         GXv_decimal15[0] = AV23FasPreMt2 ;
         GXv_int16[0] = AV17FasPreU ;
         GXv_char11[0] = AV18FasPreKgF ;
         GXv_char4[0] = AV19FasKgsEnt ;
         GXv_decimal17[0] = AV20FasKgsMn ;
         GXv_date18[0] = AV54FasPreFAc ;
         GXv_int19[0] = AV52prefas ;
         GXv_char3[0] = AV56FasActiva ;
         GXv_int20[0] = AV58faspro ;
         new app.facturacion.preciofase_get(remoteHandle, context).execute( AV5emprcod, AV6CliCod, AV21FasCod, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_int16, GXv_char11, GXv_char4, GXv_decimal17, GXv_date18, GXv_int19, GXv_char3, GXv_int20) ;
         preciofase_wp_impl.this.AV22FasPreMtr = GXv_decimal13[0] ;
         preciofase_wp_impl.this.AV24FasPreKgm = GXv_decimal14[0] ;
         preciofase_wp_impl.this.AV23FasPreMt2 = GXv_decimal15[0] ;
         preciofase_wp_impl.this.AV17FasPreU = GXv_int16[0] ;
         preciofase_wp_impl.this.AV18FasPreKgF = GXv_char11[0] ;
         preciofase_wp_impl.this.AV19FasKgsEnt = GXv_char4[0] ;
         preciofase_wp_impl.this.AV20FasKgsMn = GXv_decimal17[0] ;
         preciofase_wp_impl.this.AV54FasPreFAc = GXv_date18[0] ;
         preciofase_wp_impl.this.AV52prefas = (byte)((byte)(GXv_int19[0])) ;
         preciofase_wp_impl.this.AV56FasActiva = GXv_char3[0] ;
         preciofase_wp_impl.this.AV58faspro = GXv_int20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22FasPreMtr", GXutil.ltrimstr( AV22FasPreMtr, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
         httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
         httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV56FasActiva", AV56FasActiva);
         httpContext.ajax_rsp_assign_attri("", false, "AV58faspro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58faspro), 4, 0));
         GXt_char10 = AV55FasDsc ;
         GXv_char11[0] = GXt_char10 ;
         new app.pfasdsc(remoteHandle, context).execute( AV5emprcod, AV21FasCod, GXv_char11) ;
         preciofase_wp_impl.this.GXt_char10 = GXv_char11[0] ;
         AV55FasDsc = GXt_char10 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55FasDsc", AV55FasDsc);
         if ( ( AV52prefas == 0 ) && ( GXutil.strcmp(AV56FasActiva, "N") == 0 ) )
         {
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            if ( AV58faspro == 0 )
            {
               lblTextmessage_Caption = httpContext.getMessage( "Fase INEXISTENTE", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
            }
            else
            {
               lblTextmessage_Caption = httpContext.getMessage( "Fase INACTIVA", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTextmessage_Internalname, "Caption", lblTextmessage_Caption, true);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e252B22( )
   {
      /* FasCod_Click Routine */
      returnInSub = false ;
      AV21FasCod = A457FasCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FasCod", AV21FasCod);
      GXv_decimal17[0] = AV22FasPreMtr ;
      GXv_decimal15[0] = AV24FasPreKgm ;
      GXv_decimal14[0] = AV23FasPreMt2 ;
      GXv_int16[0] = AV17FasPreU ;
      GXv_char11[0] = AV18FasPreKgF ;
      GXv_char4[0] = AV19FasKgsEnt ;
      GXv_decimal13[0] = AV20FasKgsMn ;
      GXv_date18[0] = AV54FasPreFAc ;
      GXv_int20[0] = AV52prefas ;
      GXv_char3[0] = AV56FasActiva ;
      GXv_int19[0] = AV58faspro ;
      new app.facturacion.preciofase_get(remoteHandle, context).execute( AV5emprcod, AV6CliCod, AV21FasCod, GXv_decimal17, GXv_decimal15, GXv_decimal14, GXv_int16, GXv_char11, GXv_char4, GXv_decimal13, GXv_date18, GXv_int20, GXv_char3, GXv_int19) ;
      preciofase_wp_impl.this.AV22FasPreMtr = GXv_decimal17[0] ;
      preciofase_wp_impl.this.AV24FasPreKgm = GXv_decimal15[0] ;
      preciofase_wp_impl.this.AV23FasPreMt2 = GXv_decimal14[0] ;
      preciofase_wp_impl.this.AV17FasPreU = GXv_int16[0] ;
      preciofase_wp_impl.this.AV18FasPreKgF = GXv_char11[0] ;
      preciofase_wp_impl.this.AV19FasKgsEnt = GXv_char4[0] ;
      preciofase_wp_impl.this.AV20FasKgsMn = GXv_decimal13[0] ;
      preciofase_wp_impl.this.AV54FasPreFAc = GXv_date18[0] ;
      preciofase_wp_impl.this.AV52prefas = (byte)((byte)(GXv_int20[0])) ;
      preciofase_wp_impl.this.AV56FasActiva = GXv_char3[0] ;
      preciofase_wp_impl.this.AV58faspro = GXv_int19[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FasPreMtr", GXutil.ltrimstr( AV22FasPreMtr, 13, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV24FasPreKgm", GXutil.ltrimstr( AV24FasPreKgm, 13, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV23FasPreMt2", GXutil.ltrimstr( AV23FasPreMt2, 13, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
      httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
      httpContext.ajax_rsp_assign_attri("", false, "AV20FasKgsMn", GXutil.ltrimstr( AV20FasKgsMn, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV54FasPreFAc", localUtil.format(AV54FasPreFAc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV52prefas", GXutil.str( AV52prefas, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV56FasActiva", AV56FasActiva);
      httpContext.ajax_rsp_assign_attri("", false, "AV58faspro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58faspro), 4, 0));
      GXt_char10 = AV55FasDsc ;
      GXv_char11[0] = GXt_char10 ;
      new app.pfasdsc(remoteHandle, context).execute( AV5emprcod, AV21FasCod, GXv_char11) ;
      preciofase_wp_impl.this.GXt_char10 = GXv_char11[0] ;
      AV55FasDsc = GXt_char10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FasDsc", AV55FasDsc);
      GX_FocusControl = edtavFaspremtr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void wb_table1_133_2B22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_useraction1_Internalname, tblTabledvelop_confirmpanel_useraction1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_useraction1.setProperty("Title", Dvelop_confirmpanel_useraction1_Title);
         ucDvelop_confirmpanel_useraction1.setProperty("ConfirmationText", Dvelop_confirmpanel_useraction1_Confirmationtext);
         ucDvelop_confirmpanel_useraction1.setProperty("YesButtonCaption", Dvelop_confirmpanel_useraction1_Yesbuttoncaption);
         ucDvelop_confirmpanel_useraction1.setProperty("NoButtonCaption", Dvelop_confirmpanel_useraction1_Nobuttoncaption);
         ucDvelop_confirmpanel_useraction1.setProperty("CancelButtonCaption", Dvelop_confirmpanel_useraction1_Cancelbuttoncaption);
         ucDvelop_confirmpanel_useraction1.setProperty("YesButtonPosition", Dvelop_confirmpanel_useraction1_Yesbuttonposition);
         ucDvelop_confirmpanel_useraction1.setProperty("ConfirmType", Dvelop_confirmpanel_useraction1_Confirmtype);
         ucDvelop_confirmpanel_useraction1.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_useraction1_Internalname, "DVELOP_CONFIRMPANEL_USERACTION1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_USERACTION1Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_133_2B22e( true) ;
      }
      else
      {
         wb_table1_133_2B22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5emprcod", AV5emprcod);
      AV6CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9")));
      AV7CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliNom", AV7CliNom);
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
      pa2B22( ) ;
      ws2B22( ) ;
      we2B22( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151817", true, true);
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
      httpContext.AddJavascriptSource("facturacion/preciofase_wp.js", "?202682116151817", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1052( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_105_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_105_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_105_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_105_idx ;
      edtFasPreMt2_Internalname = "FASPREMT2_"+sGXsfl_105_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_105_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_105_idx ;
      chkFasPreU.setInternalname( "FASPREU_"+sGXsfl_105_idx );
      chkFasPreKgF.setInternalname( "FASPREKGF_"+sGXsfl_105_idx );
      chkFasKgsEnt.setInternalname( "FASKGSENT_"+sGXsfl_105_idx );
      edtFasKgsMn_Internalname = "FASKGSMN_"+sGXsfl_105_idx ;
      chkFasActiva.setInternalname( "FASACTIVA_"+sGXsfl_105_idx );
   }

   public void subsflControlProps_fel_1052( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_105_fel_idx );
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_105_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_105_fel_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_105_fel_idx ;
      edtFasPreMt2_Internalname = "FASPREMT2_"+sGXsfl_105_fel_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_105_fel_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_105_fel_idx ;
      chkFasPreU.setInternalname( "FASPREU_"+sGXsfl_105_fel_idx );
      chkFasPreKgF.setInternalname( "FASPREKGF_"+sGXsfl_105_fel_idx );
      chkFasKgsEnt.setInternalname( "FASKGSENT_"+sGXsfl_105_fel_idx );
      edtFasKgsMn_Internalname = "FASKGSMN_"+sGXsfl_105_fel_idx ;
      chkFasActiva.setInternalname( "FASACTIVA_"+sGXsfl_105_fel_idx );
   }

   public void sendrow_1052( )
   {
      subsflControlProps_1052( ) ;
      wb2B20( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_105_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_105_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_105_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_105_idx+"',105)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_105_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV53GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV53GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV53GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_105_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV53GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_105_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+"EFASCOD.CLICK."+sGXsfl_105_idx+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtFasCod_Columnclass,edtFasCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasDsc_Columnclass,edtFasDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A467FasPreMtr, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasPreMtr_Columnclass,edtFasPreMtr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMt2_Internalname,GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12576FasPreMt2, "ZZZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMt2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasPreMt2_Columnclass,edtFasPreMt2_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A466FasPreKgm, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasPreKgm_Columnclass,edtFasPreKgm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreFAc_Internalname,localUtil.format(A4385FasPreFAc, "99/99/99"),localUtil.format( A4385FasPreFAc, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreFAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasPreFAc_Columnclass,edtFasPreFAc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FASPREU_" + sGXsfl_105_idx ;
         chkFasPreU.setName( GXCCtl );
         chkFasPreU.setWebtags( "" );
         chkFasPreU.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "TitleCaption", chkFasPreU.getCaption(), !bGXsfl_105_Refreshing);
         chkFasPreU.setCheckedValue( "0" );
         A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         n10882FasPreU = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreU.getInternalname(),GXutil.str( A10882FasPreU, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(0),"1","",StyleString,ClassString,chkFasPreU.getColumnClass(),chkFasPreU.getColumnHeaderClass(),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FASPREKGF_" + sGXsfl_105_idx ;
         chkFasPreKgF.setName( GXCCtl );
         chkFasPreKgF.setWebtags( "" );
         chkFasPreKgF.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "TitleCaption", chkFasPreKgF.getCaption(), !bGXsfl_105_Refreshing);
         chkFasPreKgF.setCheckedValue( "N" );
         A12577FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( A12577FasPreKgF), "S")==0) ? "S" : "N") ;
         n12577FasPreKgF = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreKgF.getInternalname(),A12577FasPreKgF,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,chkFasPreKgF.getColumnClass(),chkFasPreKgF.getColumnHeaderClass(),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FASKGSENT_" + sGXsfl_105_idx ;
         chkFasKgsEnt.setName( GXCCtl );
         chkFasKgsEnt.setWebtags( "" );
         chkFasKgsEnt.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "TitleCaption", chkFasKgsEnt.getCaption(), !bGXsfl_105_Refreshing);
         chkFasKgsEnt.setCheckedValue( "N" );
         A13587FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( A13587FasKgsEnt), "S")==0) ? "S" : "N") ;
         n13587FasKgsEnt = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasKgsEnt.getInternalname(),A13587FasKgsEnt,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,chkFasKgsEnt.getColumnClass(),chkFasKgsEnt.getColumnHeaderClass(),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgsMn_Internalname,GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12704FasKgsMn, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasKgsMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasKgsMn_Columnclass,edtFasKgsMn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FASACTIVA_" + sGXsfl_105_idx ;
         chkFasActiva.setName( GXCCtl );
         chkFasActiva.setWebtags( "" );
         chkFasActiva.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "TitleCaption", chkFasActiva.getCaption(), !bGXsfl_105_Refreshing);
         chkFasActiva.setCheckedValue( "N" );
         A14042FasActiva = ((GXutil.strcmp(GXutil.rtrim( A14042FasActiva), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasActiva.getInternalname(),A14042FasActiva,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashes2B22( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_105_idx = ((subGrid_Islastpage==1)&&(nGXsfl_105_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
      }
      /* End function sendrow_1052 */
   }

   public void startgridcontrol105( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"105\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mt", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mt (2)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço unico p/Fase?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fatura KG", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Faturar Kg Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Minimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activa?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasPreMtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasPreMtr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasPreMt2_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasPreMt2_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasPreKgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasPreKgm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4385FasPreFAc, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasPreFAc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasPreFAc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkFasPreU.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkFasPreU.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12577FasPreKgF));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkFasPreKgF.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkFasPreKgF.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13587FasKgsEnt));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkFasKgsEnt.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkFasKgsEnt.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasKgsMn_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasKgsMn_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14042FasActiva));
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
      bttBtncopiar_Internalname = "BTNCOPIAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavFascod_Internalname = "vFASCOD" ;
      imgUseraction2_Internalname = "USERACTION2" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavFaspremtr_Internalname = "vFASPREMTR" ;
      edtavFaspremt2_Internalname = "vFASPREMT2" ;
      edtavFasprekgm_Internalname = "vFASPREKGM" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      chkavFaspreu.setInternalname( "vFASPREU" );
      chkavFasprekgf.setInternalname( "vFASPREKGF" );
      chkavFaskgsent.setInternalname( "vFASKGSENT" );
      edtavFaskgsmn_Internalname = "vFASKGSMN" ;
      edtavFasprefac_Internalname = "vFASPREFAC" ;
      chkavFasactiva.setInternalname( "vFASACTIVA" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnlimpiar_Internalname = "BTNLIMPIAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTextmessage_Internalname = "TEXTMESSAGE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasPreMt2_Internalname = "FASPREMT2" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasPreFAc_Internalname = "FASPREFAC" ;
      chkFasPreU.setInternalname( "FASPREU" );
      chkFasPreKgF.setInternalname( "FASPREKGF" );
      chkFasKgsEnt.setInternalname( "FASKGSENT" );
      edtFasKgsMn_Internalname = "FASKGSMN" ;
      chkFasActiva.setInternalname( "FASACTIVA" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtavPrefas_Internalname = "vPREFAS" ;
      Dvelop_confirmpanel_useraction1_Internalname = "DVELOP_CONFIRMPANEL_USERACTION1" ;
      tblTabledvelop_confirmpanel_useraction1_Internalname = "TABLEDVELOP_CONFIRMPANEL_USERACTION1" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_fasprefacauxdate_Internalname = "vDDO_FASPREFACAUXDATE" ;
      divDdo_fasprefacauxdates_Internalname = "DDO_FASPREFACAUXDATES" ;
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
      chkFasActiva.setCaption( "" );
      edtFasKgsMn_Jsonclick = "" ;
      edtFasKgsMn_Columnclass = "WWColumn hidden-xs" ;
      chkFasKgsEnt.setCaption( "" );
      chkFasKgsEnt.setColumnClass( "WWColumn hidden-xs" );
      chkFasPreKgF.setCaption( "" );
      chkFasPreKgF.setColumnClass( "WWColumn hidden-xs" );
      chkFasPreU.setCaption( "" );
      chkFasPreU.setColumnClass( "WWColumn hidden-xs" );
      edtFasPreFAc_Jsonclick = "" ;
      edtFasPreFAc_Columnclass = "WWColumn hidden-xs" ;
      edtFasPreKgm_Jsonclick = "" ;
      edtFasPreKgm_Columnclass = "WWColumn hidden-xs" ;
      edtFasPreMt2_Jsonclick = "" ;
      edtFasPreMt2_Columnclass = "WWColumn hidden-xs" ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasPreMtr_Columnclass = "WWColumn" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Columnclass = "WWColumn hidden-xs" ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Columnclass = "WWColumn hidden-xs" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtFasKgsMn_Columnheaderclass = "" ;
      chkFasKgsEnt.setColumnHeaderClass( "" );
      chkFasPreKgF.setColumnHeaderClass( "" );
      chkFasPreU.setColumnHeaderClass( "" );
      edtFasPreFAc_Columnheaderclass = "" ;
      edtFasPreKgm_Columnheaderclass = "" ;
      edtFasPreMt2_Columnheaderclass = "" ;
      edtFasPreMtr_Columnheaderclass = "" ;
      edtFasDsc_Columnheaderclass = "" ;
      edtFasCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_fasprefacauxdate_Jsonclick = "" ;
      edtavPrefas_Jsonclick = "" ;
      edtavPrefas_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTextmessage_Caption = "" ;
      chkavFasactiva.setEnabled( 1 );
      edtavFasprefac_Jsonclick = "" ;
      edtavFasprefac_Enabled = 1 ;
      edtavFaskgsmn_Jsonclick = "" ;
      edtavFaskgsmn_Enabled = 1 ;
      chkavFaskgsent.setEnabled( 1 );
      chkavFasprekgf.setEnabled( 1 );
      chkavFaspreu.setEnabled( 1 );
      edtavFasprekgm_Jsonclick = "" ;
      edtavFasprekgm_Enabled = 1 ;
      edtavFaspremt2_Jsonclick = "" ;
      edtavFaspremt2_Enabled = 1 ;
      edtavFaspremtr_Jsonclick = "" ;
      edtavFaspremtr_Enabled = 1 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Precio;Precio;Precio;;;;;;" ;
      Dvelop_confirmpanel_useraction1_Confirmtype = "1" ;
      Dvelop_confirmpanel_useraction1_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_useraction1_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_useraction1_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_useraction1_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_useraction1_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_useraction1_Title = "" ;
      Ddo_grid_Datalistproc = "Facturacion.PrecioFase_WPGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||1:WWP_TSChecked,2:WWP_TSUnChecked|S:WWP_TSChecked,N:WWP_TSUnChecked|S:WWP_TSChecked,N:WWP_TSUnChecked|" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||FixedValues|FixedValues|FixedValues|" ;
      Ddo_grid_Includedatalist = "T|T|||||T|T|T|" ;
      Ddo_grid_Filterisrange = "||T|T|T|||||T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Date||||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T||||T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:FasCod|2:FasDsc|3:FasPreMtr|4:FasPreMt2|5:FasPreKgm|6:FasPreFAc|7:FasPreU|8:FasPreKgF|9:FasKgsEnt|10:FasKgsMn" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Precio Fase ", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavFaspreu.setName( "vFASPREU" );
      chkavFaspreu.setWebtags( "" );
      chkavFaspreu.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFaspreu.getInternalname(), "TitleCaption", chkavFaspreu.getCaption(), true);
      chkavFaspreu.setCheckedValue( "0" );
      AV17FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV17FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasPreU", GXutil.str( AV17FasPreU, 1, 0));
      chkavFasprekgf.setName( "vFASPREKGF" );
      chkavFasprekgf.setWebtags( "" );
      chkavFasprekgf.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFasprekgf.getInternalname(), "TitleCaption", chkavFasprekgf.getCaption(), true);
      chkavFasprekgf.setCheckedValue( "N" );
      AV18FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( AV18FasPreKgF), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FasPreKgF", AV18FasPreKgF);
      chkavFaskgsent.setName( "vFASKGSENT" );
      chkavFaskgsent.setWebtags( "" );
      chkavFaskgsent.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFaskgsent.getInternalname(), "TitleCaption", chkavFaskgsent.getCaption(), true);
      chkavFaskgsent.setCheckedValue( "N" );
      AV19FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( AV19FasKgsEnt), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FasKgsEnt", AV19FasKgsEnt);
      chkavFasactiva.setName( "vFASACTIVA" );
      chkavFasactiva.setWebtags( "" );
      chkavFasactiva.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFasactiva.getInternalname(), "TitleCaption", chkavFasactiva.getCaption(), true);
      chkavFasactiva.setCheckedValue( "N" );
      AV56FasActiva = ((GXutil.strcmp(GXutil.rtrim( AV56FasActiva), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56FasActiva", AV56FasActiva);
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_105_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV53GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV53GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActions), 4, 0));
      }
      GXCCtl = "FASPREU_" + sGXsfl_105_idx ;
      chkFasPreU.setName( GXCCtl );
      chkFasPreU.setWebtags( "" );
      chkFasPreU.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "TitleCaption", chkFasPreU.getCaption(), !bGXsfl_105_Refreshing);
      chkFasPreU.setCheckedValue( "0" );
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      GXCCtl = "FASPREKGF_" + sGXsfl_105_idx ;
      chkFasPreKgF.setName( GXCCtl );
      chkFasPreKgF.setWebtags( "" );
      chkFasPreKgF.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "TitleCaption", chkFasPreKgF.getCaption(), !bGXsfl_105_Refreshing);
      chkFasPreKgF.setCheckedValue( "N" );
      A12577FasPreKgF = ((GXutil.strcmp(GXutil.rtrim( A12577FasPreKgF), "S")==0) ? "S" : "N") ;
      n12577FasPreKgF = false ;
      GXCCtl = "FASKGSENT_" + sGXsfl_105_idx ;
      chkFasKgsEnt.setName( GXCCtl );
      chkFasKgsEnt.setWebtags( "" );
      chkFasKgsEnt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "TitleCaption", chkFasKgsEnt.getCaption(), !bGXsfl_105_Refreshing);
      chkFasKgsEnt.setCheckedValue( "N" );
      A13587FasKgsEnt = ((GXutil.strcmp(GXutil.rtrim( A13587FasKgsEnt), "S")==0) ? "S" : "N") ;
      n13587FasKgsEnt = false ;
      GXCCtl = "FASACTIVA_" + sGXsfl_105_idx ;
      chkFasActiva.setName( GXCCtl );
      chkFasActiva.setWebtags( "" );
      chkFasActiva.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasActiva.getInternalname(), "TitleCaption", chkFasActiva.getCaption(), !bGXsfl_105_Refreshing);
      chkFasActiva.setCheckedValue( "N" );
      A14042FasActiva = ((GXutil.strcmp(GXutil.rtrim( A14042FasActiva), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e232B22',iparms:[{av:'A14042FasActiva',fld:'FASACTIVA',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV53GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtFasCod_Columnclass',ctrl:'FASCOD',prop:'Columnclass'},{av:'edtFasDsc_Columnclass',ctrl:'FASDSC',prop:'Columnclass'},{av:'edtFasPreMtr_Columnclass',ctrl:'FASPREMTR',prop:'Columnclass'},{av:'edtFasPreMt2_Columnclass',ctrl:'FASPREMT2',prop:'Columnclass'},{av:'edtFasPreKgm_Columnclass',ctrl:'FASPREKGM',prop:'Columnclass'},{av:'edtFasPreFAc_Columnclass',ctrl:'FASPREFAC',prop:'Columnclass'},{av:'chkFasPreU.getColumnClass()',ctrl:'FASPREU',prop:'Columnclass'},{av:'chkFasPreKgF.getColumnClass()',ctrl:'FASPREKGF',prop:'Columnclass'},{av:'chkFasKgsEnt.getColumnClass()',ctrl:'FASKGSENT',prop:'Columnclass'},{av:'edtFasKgsMn_Columnclass',ctrl:'FASKGSMN',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e242B22',iparms:[{av:'cmbavGridactions'},{av:'AV53GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV53GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV57Fascod_Selected',fld:'vFASCOD_SELECTED',pic:'@!'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_USERACTION1.CLOSE","{handler:'e142B22',iparms:[{av:'Dvelop_confirmpanel_useraction1_Result',ctrl:'DVELOP_CONFIRMPANEL_USERACTION1',prop:'Result'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV57Fascod_Selected',fld:'vFASCOD_SELECTED',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_USERACTION1.CLOSE",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152B22',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOLIMPIAR'","{handler:'e162B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''}]");
      setEventMetadata("'DOLIMPIAR'",",oparms:[{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV55FasDsc',fld:'vFASDSC',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV20FasKgsMn',fld:'vFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV24FasPreKgm',fld:'vFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV23FasPreMt2',fld:'vFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV52prefas',fld:'vPREFAS',pic:'9'},{av:'AV54FasPreFAc',fld:'vFASPREFAC',pic:''},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e172B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV55FasDsc',fld:'vFASDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[{av:'AV55FasDsc',fld:'vFASDSC',pic:''},{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCOPIAR'","{handler:'e182B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''}]");
      setEventMetadata("'DOCOPIAR'",",oparms:[{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("ENTER","{handler:'e192B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV52prefas',fld:'vPREFAS',pic:'9'},{av:'AV58faspro',fld:'vFASPRO',pic:'ZZZ9'},{av:'AV22FasPreMtr',fld:'vFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV24FasPreKgm',fld:'vFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV23FasPreMt2',fld:'vFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV20FasKgsMn',fld:'vFASKGSMN',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTextmessage_Caption',ctrl:'TEXTMESSAGE',prop:'Caption'},{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV55FasDsc',fld:'vFASDSC',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV20FasKgsMn',fld:'vFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV24FasPreKgm',fld:'vFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV23FasPreMt2',fld:'vFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV52prefas',fld:'vPREFAS',pic:'9'},{av:'AV54FasPreFAc',fld:'vFASPREFAC',pic:''},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("VFASCOD.ISVALID","{handler:'e202B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'}]");
      setEventMetadata("VFASCOD.ISVALID",",oparms:[{av:'lblTextmessage_Caption',ctrl:'TEXTMESSAGE',prop:'Caption'},{av:'AV58faspro',fld:'vFASPRO',pic:'ZZZ9'},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'AV52prefas',fld:'vPREFAS',pic:'9'},{av:'AV54FasPreFAc',fld:'vFASPREFAC',pic:''},{av:'AV20FasKgsMn',fld:'vFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV23FasPreMt2',fld:'vFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV24FasPreKgm',fld:'vFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV22FasPreMtr',fld:'vFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV55FasDsc',fld:'vFASDSC',pic:''},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("FASCOD.CLICK","{handler:'e252B22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasPreMtr',fld:'vTFFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV31TFFasPreMtr_To',fld:'vTFFASPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFFasPreMt2',fld:'vTFFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV33TFFasPreMt2_To',fld:'vTFFASPREMT2_TO',pic:'ZZZZZZ9.99999'},{av:'AV34TFFasPreKgm',fld:'vTFFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV35TFFasPreKgm_To',fld:'vTFFASPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFFasPreFAc',fld:'vTFFASPREFAC',pic:''},{av:'AV38TFFasPreU_Sel',fld:'vTFFASPREU_SEL',pic:'9'},{av:'AV39TFFasPreKgF_Sel',fld:'vTFFASPREKGF_SEL',pic:''},{av:'AV40TFFasKgsEnt_Sel',fld:'vTFFASKGSENT_SEL',pic:''},{av:'AV41TFFasKgsMn',fld:'vTFFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV42TFFasKgsMn_To',fld:'vTFFASKGSMN_TO',pic:'ZZZZZ9.99'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("FASCOD.CLICK",",oparms:[{av:'AV21FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV58faspro',fld:'vFASPRO',pic:'ZZZ9'},{av:'AV56FasActiva',fld:'vFASACTIVA',pic:''},{av:'AV52prefas',fld:'vPREFAS',pic:'9'},{av:'AV54FasPreFAc',fld:'vFASPREFAC',pic:''},{av:'AV20FasKgsMn',fld:'vFASKGSMN',pic:'ZZZZZ9.99'},{av:'AV19FasKgsEnt',fld:'vFASKGSENT',pic:''},{av:'AV18FasPreKgF',fld:'vFASPREKGF',pic:''},{av:'AV17FasPreU',fld:'vFASPREU',pic:'9'},{av:'AV23FasPreMt2',fld:'vFASPREMT2',pic:'ZZZZZZ9.99999'},{av:'AV24FasPreKgm',fld:'vFASPREKGM',pic:'ZZZZZZ9.999'},{av:'AV22FasPreMtr',fld:'vFASPREMTR',pic:'ZZZZZZ9.999'},{av:'AV55FasDsc',fld:'vFASDSC',pic:''},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtFasPreMtr_Columnheaderclass',ctrl:'FASPREMTR',prop:'Columnheaderclass'},{av:'edtFasPreMt2_Columnheaderclass',ctrl:'FASPREMT2',prop:'Columnheaderclass'},{av:'edtFasPreKgm_Columnheaderclass',ctrl:'FASPREKGM',prop:'Columnheaderclass'},{av:'edtFasPreFAc_Columnheaderclass',ctrl:'FASPREFAC',prop:'Columnheaderclass'},{av:'chkFasPreU.getColumnHeaderClass()',ctrl:'FASPREU',prop:'Columnheaderclass'},{av:'chkFasPreKgF.getColumnHeaderClass()',ctrl:'FASPREKGF',prop:'Columnheaderclass'},{av:'chkFasKgsEnt.getColumnHeaderClass()',ctrl:'FASKGSENT',prop:'Columnheaderclass'},{av:'edtFasKgsMn_Columnheaderclass',ctrl:'FASKGSMN',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fasactiva',iparms:[]");
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
      wcpOAV5emprcod = "" ;
      wcpOAV7CliNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_useraction1_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5emprcod = "" ;
      AV7CliNom = "" ;
      AV26TFFasCod = "" ;
      AV27TFFasCod_Sel = "" ;
      AV28TFFasDsc = "" ;
      AV29TFFasDsc_Sel = "" ;
      AV30TFFasPreMtr = DecimalUtil.ZERO ;
      AV31TFFasPreMtr_To = DecimalUtil.ZERO ;
      AV32TFFasPreMt2 = DecimalUtil.ZERO ;
      AV33TFFasPreMt2_To = DecimalUtil.ZERO ;
      AV34TFFasPreKgm = DecimalUtil.ZERO ;
      AV35TFFasPreKgm_To = DecimalUtil.ZERO ;
      AV36TFFasPreFAc = GXutil.nullDate() ;
      AV39TFFasPreKgF_Sel = "" ;
      AV40TFFasKgsEnt_Sel = "" ;
      AV41TFFasKgsMn = DecimalUtil.ZERO ;
      AV42TFFasKgsMn_To = DecimalUtil.ZERO ;
      AV61Pgmname = "" ;
      AV18FasPreKgF = "" ;
      AV19FasKgsEnt = "" ;
      AV56FasActiva = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV43DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV57Fascod_Selected = "" ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncopiar_Jsonclick = "" ;
      AV21FasCod = "" ;
      imgUseraction2_gximage = "" ;
      sImgUrl = "" ;
      imgUseraction2_Jsonclick = "" ;
      AV55FasDsc = "" ;
      AV22FasPreMtr = DecimalUtil.ZERO ;
      AV23FasPreMt2 = DecimalUtil.ZERO ;
      AV24FasPreKgm = DecimalUtil.ZERO ;
      AV20FasKgsMn = DecimalUtil.ZERO ;
      AV54FasPreFAc = GXutil.nullDate() ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnlimpiar_Jsonclick = "" ;
      lblTextmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV37DDO_FasPreFAcAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A12577FasPreKgF = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A14042FasActiva = "" ;
      scmdbuf = "" ;
      lV62Facturacion_preciofase_wpds_1_tffascod = "" ;
      lV64Facturacion_preciofase_wpds_3_tffasdsc = "" ;
      AV63Facturacion_preciofase_wpds_2_tffascod_sel = "" ;
      AV62Facturacion_preciofase_wpds_1_tffascod = "" ;
      AV65Facturacion_preciofase_wpds_4_tffasdsc_sel = "" ;
      AV64Facturacion_preciofase_wpds_3_tffasdsc = "" ;
      AV66Facturacion_preciofase_wpds_5_tffaspremtr = DecimalUtil.ZERO ;
      AV67Facturacion_preciofase_wpds_6_tffaspremtr_to = DecimalUtil.ZERO ;
      AV68Facturacion_preciofase_wpds_7_tffaspremt2 = DecimalUtil.ZERO ;
      AV69Facturacion_preciofase_wpds_8_tffaspremt2_to = DecimalUtil.ZERO ;
      AV70Facturacion_preciofase_wpds_9_tffasprekgm = DecimalUtil.ZERO ;
      AV71Facturacion_preciofase_wpds_10_tffasprekgm_to = DecimalUtil.ZERO ;
      AV72Facturacion_preciofase_wpds_11_tffasprefac = GXutil.nullDate() ;
      AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel = "" ;
      AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel = "" ;
      AV76Facturacion_preciofase_wpds_15_tffaskgsmn = DecimalUtil.ZERO ;
      AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      H02B22_A252CliCod = new int[1] ;
      H02B22_A396EmprCod = new String[] {""} ;
      H02B22_A14042FasActiva = new String[] {""} ;
      H02B22_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B22_n12704FasKgsMn = new boolean[] {false} ;
      H02B22_A13587FasKgsEnt = new String[] {""} ;
      H02B22_n13587FasKgsEnt = new boolean[] {false} ;
      H02B22_A12577FasPreKgF = new String[] {""} ;
      H02B22_n12577FasPreKgF = new boolean[] {false} ;
      H02B22_A10882FasPreU = new byte[1] ;
      H02B22_n10882FasPreU = new boolean[] {false} ;
      H02B22_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      H02B22_n4385FasPreFAc = new boolean[] {false} ;
      H02B22_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B22_n466FasPreKgm = new boolean[] {false} ;
      H02B22_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B22_n12576FasPreMt2 = new boolean[] {false} ;
      H02B22_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B22_n467FasPreMtr = new boolean[] {false} ;
      H02B22_A460FasDsc = new String[] {""} ;
      H02B22_A457FasCod = new String[] {""} ;
      H02B23_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV49Station = "" ;
      AV50EmprNom = "" ;
      AV51UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV25Session = httpContext.getWebSession();
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char8 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char9 = "" ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_int20 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXt_char10 = "" ;
      GXv_char11 = new String[1] ;
      ucDvelop_confirmpanel_useraction1 = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_wp__default(),
         new Object[] {
             new Object[] {
            H02B22_A252CliCod, H02B22_A396EmprCod, H02B22_A14042FasActiva, H02B22_A12704FasKgsMn, H02B22_n12704FasKgsMn, H02B22_A13587FasKgsEnt, H02B22_n13587FasKgsEnt, H02B22_A12577FasPreKgF, H02B22_n12577FasPreKgF, H02B22_A10882FasPreU,
            H02B22_n10882FasPreU, H02B22_A4385FasPreFAc, H02B22_n4385FasPreFAc, H02B22_A466FasPreKgm, H02B22_n466FasPreKgm, H02B22_A12576FasPreMt2, H02B22_n12576FasPreMt2, H02B22_A467FasPreMtr, H02B22_n467FasPreMtr, H02B22_A460FasDsc,
            H02B22_A457FasCod
            }
            , new Object[] {
            H02B23_AGRID_nRecordCount
            }
         }
      );
      AV61Pgmname = "Facturacion.PrecioFase_WP" ;
      /* GeneXus formulas. */
      AV61Pgmname = "Facturacion.PrecioFase_WP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavFasprefac_Enabled = 0 ;
      chkavFasactiva.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV38TFFasPreU_Sel ;
   private byte AV17FasPreU ;
   private byte gxajaxcallmode ;
   private byte AV52prefas ;
   private byte A10882FasPreU ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV73Facturacion_preciofase_wpds_12_tffaspreu_sel ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV15OrderedBy ;
   private short AV58faspro ;
   private short wbEnd ;
   private short wbStart ;
   private short AV53GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private short GXv_int19[] ;
   private int wcpOAV6CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_105 ;
   private int AV6CliCod ;
   private int nGXsfl_105_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavFaspremtr_Enabled ;
   private int edtavFaspremt2_Enabled ;
   private int edtavFasprekgm_Enabled ;
   private int edtavFaskgsmn_Enabled ;
   private int edtavFasprefac_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrefas_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A252CliCod ;
   private int AV44PageToGo ;
   private int AV78GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV45GridCurrentPage ;
   private long AV46GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV30TFFasPreMtr ;
   private java.math.BigDecimal AV31TFFasPreMtr_To ;
   private java.math.BigDecimal AV32TFFasPreMt2 ;
   private java.math.BigDecimal AV33TFFasPreMt2_To ;
   private java.math.BigDecimal AV34TFFasPreKgm ;
   private java.math.BigDecimal AV35TFFasPreKgm_To ;
   private java.math.BigDecimal AV41TFFasKgsMn ;
   private java.math.BigDecimal AV42TFFasKgsMn_To ;
   private java.math.BigDecimal AV22FasPreMtr ;
   private java.math.BigDecimal AV23FasPreMt2 ;
   private java.math.BigDecimal AV24FasPreKgm ;
   private java.math.BigDecimal AV20FasKgsMn ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal AV66Facturacion_preciofase_wpds_5_tffaspremtr ;
   private java.math.BigDecimal AV67Facturacion_preciofase_wpds_6_tffaspremtr_to ;
   private java.math.BigDecimal AV68Facturacion_preciofase_wpds_7_tffaspremt2 ;
   private java.math.BigDecimal AV69Facturacion_preciofase_wpds_8_tffaspremt2_to ;
   private java.math.BigDecimal AV70Facturacion_preciofase_wpds_9_tffasprekgm ;
   private java.math.BigDecimal AV71Facturacion_preciofase_wpds_10_tffasprekgm_to ;
   private java.math.BigDecimal AV76Facturacion_preciofase_wpds_15_tffaskgsmn ;
   private java.math.BigDecimal AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV5emprcod ;
   private String wcpOAV7CliNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_useraction1_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5emprcod ;
   private String AV7CliNom ;
   private String sGXsfl_105_idx="0001" ;
   private String AV26TFFasCod ;
   private String AV27TFFasCod_Sel ;
   private String AV28TFFasDsc ;
   private String AV29TFFasDsc_Sel ;
   private String AV39TFFasPreKgF_Sel ;
   private String AV40TFFasKgsEnt_Sel ;
   private String AV61Pgmname ;
   private String AV18FasPreKgF ;
   private String AV19FasKgsEnt ;
   private String AV56FasActiva ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV57Fascod_Selected ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_useraction1_Title ;
   private String Dvelop_confirmpanel_useraction1_Confirmationtext ;
   private String Dvelop_confirmpanel_useraction1_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_useraction1_Nobuttoncaption ;
   private String Dvelop_confirmpanel_useraction1_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_useraction1_Yesbuttonposition ;
   private String Dvelop_confirmpanel_useraction1_Confirmtype ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncopiar_Internalname ;
   private String bttBtncopiar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavFascod_Internalname ;
   private String AV21FasCod ;
   private String edtavFascod_Jsonclick ;
   private String imgUseraction2_gximage ;
   private String sImgUrl ;
   private String imgUseraction2_Internalname ;
   private String imgUseraction2_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String AV55FasDsc ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavFaspremtr_Internalname ;
   private String edtavFaspremtr_Jsonclick ;
   private String edtavFaspremt2_Internalname ;
   private String edtavFaspremt2_Jsonclick ;
   private String edtavFasprekgm_Internalname ;
   private String edtavFasprekgm_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavFaskgsmn_Internalname ;
   private String edtavFaskgsmn_Jsonclick ;
   private String edtavFasprefac_Internalname ;
   private String edtavFasprefac_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnlimpiar_Internalname ;
   private String bttBtnlimpiar_Jsonclick ;
   private String lblTextmessage_Internalname ;
   private String lblTextmessage_Caption ;
   private String lblTextmessage_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavPrefas_Internalname ;
   private String edtavPrefas_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_fasprefacauxdates_Internalname ;
   private String edtavDdo_fasprefacauxdate_Internalname ;
   private String edtavDdo_fasprefacauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasPreMt2_Internalname ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasPreFAc_Internalname ;
   private String A12577FasPreKgF ;
   private String A13587FasKgsEnt ;
   private String edtFasKgsMn_Internalname ;
   private String A14042FasActiva ;
   private String scmdbuf ;
   private String lV62Facturacion_preciofase_wpds_1_tffascod ;
   private String lV64Facturacion_preciofase_wpds_3_tffasdsc ;
   private String AV63Facturacion_preciofase_wpds_2_tffascod_sel ;
   private String AV62Facturacion_preciofase_wpds_1_tffascod ;
   private String AV65Facturacion_preciofase_wpds_4_tffasdsc_sel ;
   private String AV64Facturacion_preciofase_wpds_3_tffasdsc ;
   private String AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel ;
   private String AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV49Station ;
   private String AV50EmprNom ;
   private String AV51UsurCod ;
   private String edtFasCod_Columnheaderclass ;
   private String edtFasDsc_Columnheaderclass ;
   private String edtFasPreMtr_Columnheaderclass ;
   private String edtFasPreMt2_Columnheaderclass ;
   private String edtFasPreKgm_Columnheaderclass ;
   private String edtFasPreFAc_Columnheaderclass ;
   private String edtFasKgsMn_Columnheaderclass ;
   private String edtFasCod_Columnclass ;
   private String edtFasDsc_Columnclass ;
   private String edtFasPreMtr_Columnclass ;
   private String edtFasPreMt2_Columnclass ;
   private String edtFasPreKgm_Columnclass ;
   private String edtFasPreFAc_Columnclass ;
   private String edtFasKgsMn_Columnclass ;
   private String GXt_char1 ;
   private String GXt_char8 ;
   private String GXv_char2[] ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXt_char10 ;
   private String GXv_char11[] ;
   private String tblTabledvelop_confirmpanel_useraction1_Internalname ;
   private String Dvelop_confirmpanel_useraction1_Internalname ;
   private String sGXsfl_105_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasPreMt2_Jsonclick ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasPreFAc_Jsonclick ;
   private String edtFasKgsMn_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV36TFFasPreFAc ;
   private java.util.Date AV54FasPreFAc ;
   private java.util.Date AV37DDO_FasPreFAcAuxDate ;
   private java.util.Date A4385FasPreFAc ;
   private java.util.Date AV72Facturacion_preciofase_wpds_11_tffasprefac ;
   private java.util.Date GXv_date18[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean n467FasPreMtr ;
   private boolean n12576FasPreMt2 ;
   private boolean n466FasPreKgm ;
   private boolean n4385FasPreFAc ;
   private boolean n10882FasPreU ;
   private boolean n12577FasPreKgF ;
   private boolean n13587FasKgsEnt ;
   private boolean n12704FasKgsMn ;
   private boolean bGXsfl_105_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_useraction1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavFaspreu ;
   private ICheckbox chkavFasprekgf ;
   private ICheckbox chkavFaskgsent ;
   private ICheckbox chkavFasactiva ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkFasPreU ;
   private ICheckbox chkFasPreKgF ;
   private ICheckbox chkFasKgsEnt ;
   private ICheckbox chkFasActiva ;
   private IDataStoreProvider pr_default ;
   private int[] H02B22_A252CliCod ;
   private String[] H02B22_A396EmprCod ;
   private String[] H02B22_A14042FasActiva ;
   private java.math.BigDecimal[] H02B22_A12704FasKgsMn ;
   private boolean[] H02B22_n12704FasKgsMn ;
   private String[] H02B22_A13587FasKgsEnt ;
   private boolean[] H02B22_n13587FasKgsEnt ;
   private String[] H02B22_A12577FasPreKgF ;
   private boolean[] H02B22_n12577FasPreKgF ;
   private byte[] H02B22_A10882FasPreU ;
   private boolean[] H02B22_n10882FasPreU ;
   private java.util.Date[] H02B22_A4385FasPreFAc ;
   private boolean[] H02B22_n4385FasPreFAc ;
   private java.math.BigDecimal[] H02B22_A466FasPreKgm ;
   private boolean[] H02B22_n466FasPreKgm ;
   private java.math.BigDecimal[] H02B22_A12576FasPreMt2 ;
   private boolean[] H02B22_n12576FasPreMt2 ;
   private java.math.BigDecimal[] H02B22_A467FasPreMtr ;
   private boolean[] H02B22_n467FasPreMtr ;
   private String[] H02B22_A460FasDsc ;
   private String[] H02B22_A457FasCod ;
   private long[] H02B23_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV43DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class preciofase_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02B22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Facturacion_preciofase_wpds_2_tffascod_sel ,
                                          String AV62Facturacion_preciofase_wpds_1_tffascod ,
                                          String AV65Facturacion_preciofase_wpds_4_tffasdsc_sel ,
                                          String AV64Facturacion_preciofase_wpds_3_tffasdsc ,
                                          java.math.BigDecimal AV66Facturacion_preciofase_wpds_5_tffaspremtr ,
                                          java.math.BigDecimal AV67Facturacion_preciofase_wpds_6_tffaspremtr_to ,
                                          java.math.BigDecimal AV68Facturacion_preciofase_wpds_7_tffaspremt2 ,
                                          java.math.BigDecimal AV69Facturacion_preciofase_wpds_8_tffaspremt2_to ,
                                          java.math.BigDecimal AV70Facturacion_preciofase_wpds_9_tffasprekgm ,
                                          java.math.BigDecimal AV71Facturacion_preciofase_wpds_10_tffasprekgm_to ,
                                          java.util.Date AV72Facturacion_preciofase_wpds_11_tffasprefac ,
                                          byte AV73Facturacion_preciofase_wpds_12_tffaspreu_sel ,
                                          String AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel ,
                                          String AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel ,
                                          java.math.BigDecimal AV76Facturacion_preciofase_wpds_15_tffaskgsmn ,
                                          java.math.BigDecimal AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A467FasPreMtr ,
                                          java.math.BigDecimal A12576FasPreMt2 ,
                                          java.math.BigDecimal A466FasPreKgm ,
                                          java.util.Date A4385FasPreFAc ,
                                          byte A10882FasPreU ,
                                          String A12577FasPreKgF ,
                                          String A13587FasKgsEnt ,
                                          java.math.BigDecimal A12704FasKgsMn ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV5emprcod ,
                                          int AV6CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[22];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.CliCod, T1.EmprCod, T2.FasActiva, T1.FasKgsMn, T1.FasKgsEnt, T1.FasPreKgF, T1.FasPreU, T1.FasPreFAc, T1.FasPreKgm, T1.FasPreMt2, T1.FasPreMtr, T2.FasDsc, T1.FasCod" ;
      sFromString = " FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( (GXutil.strcmp("", AV63Facturacion_preciofase_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_preciofase_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_preciofase_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Facturacion_preciofase_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Facturacion_preciofase_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Facturacion_preciofase_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Facturacion_preciofase_wpds_5_tffaspremtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr >= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Facturacion_preciofase_wpds_6_tffaspremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr <= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Facturacion_preciofase_wpds_7_tffaspremt2)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Facturacion_preciofase_wpds_8_tffaspremt2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Facturacion_preciofase_wpds_9_tffasprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_preciofase_wpds_10_tffasprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Facturacion_preciofase_wpds_11_tffasprefac)) )
      {
         addWhere(sWhereString, "(T1.FasPreFAc >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( AV73Facturacion_preciofase_wpds_12_tffaspreu_sel == 1 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 1)");
      }
      if ( AV73Facturacion_preciofase_wpds_12_tffaspreu_sel == 2 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 0)");
      }
      if ( ! (GXutil.strcmp("", AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgF = ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsEnt = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Facturacion_preciofase_wpds_15_tffaskgsmn)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn >= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn <= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( AV15OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreMtr" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreMtr DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreMt2" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreMt2 DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreKgm" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreKgm DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreFAc" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreFAc DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreU" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreU DESC" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasPreKgF" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasPreKgF DESC" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasKgsEnt" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasKgsEnt DESC" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasKgsMn" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasKgsMn DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H02B23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Facturacion_preciofase_wpds_2_tffascod_sel ,
                                          String AV62Facturacion_preciofase_wpds_1_tffascod ,
                                          String AV65Facturacion_preciofase_wpds_4_tffasdsc_sel ,
                                          String AV64Facturacion_preciofase_wpds_3_tffasdsc ,
                                          java.math.BigDecimal AV66Facturacion_preciofase_wpds_5_tffaspremtr ,
                                          java.math.BigDecimal AV67Facturacion_preciofase_wpds_6_tffaspremtr_to ,
                                          java.math.BigDecimal AV68Facturacion_preciofase_wpds_7_tffaspremt2 ,
                                          java.math.BigDecimal AV69Facturacion_preciofase_wpds_8_tffaspremt2_to ,
                                          java.math.BigDecimal AV70Facturacion_preciofase_wpds_9_tffasprekgm ,
                                          java.math.BigDecimal AV71Facturacion_preciofase_wpds_10_tffasprekgm_to ,
                                          java.util.Date AV72Facturacion_preciofase_wpds_11_tffasprefac ,
                                          byte AV73Facturacion_preciofase_wpds_12_tffaspreu_sel ,
                                          String AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel ,
                                          String AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel ,
                                          java.math.BigDecimal AV76Facturacion_preciofase_wpds_15_tffaskgsmn ,
                                          java.math.BigDecimal AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A467FasPreMtr ,
                                          java.math.BigDecimal A12576FasPreMt2 ,
                                          java.math.BigDecimal A466FasPreKgm ,
                                          java.util.Date A4385FasPreFAc ,
                                          byte A10882FasPreU ,
                                          String A12577FasPreKgF ,
                                          String A13587FasKgsEnt ,
                                          java.math.BigDecimal A12704FasKgsMn ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV5emprcod ,
                                          int AV6CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[17];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( (GXutil.strcmp("", AV63Facturacion_preciofase_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_preciofase_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_preciofase_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Facturacion_preciofase_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Facturacion_preciofase_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Facturacion_preciofase_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Facturacion_preciofase_wpds_5_tffaspremtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Facturacion_preciofase_wpds_6_tffaspremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Facturacion_preciofase_wpds_7_tffaspremt2)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Facturacion_preciofase_wpds_8_tffaspremt2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Facturacion_preciofase_wpds_9_tffasprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_preciofase_wpds_10_tffasprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Facturacion_preciofase_wpds_11_tffasprefac)) )
      {
         addWhere(sWhereString, "(T1.FasPreFAc >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( AV73Facturacion_preciofase_wpds_12_tffaspreu_sel == 1 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 1)");
      }
      if ( AV73Facturacion_preciofase_wpds_12_tffaspreu_sel == 2 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 0)");
      }
      if ( ! (GXutil.strcmp("", AV74Facturacion_preciofase_wpds_13_tffasprekgf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgF = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_preciofase_wpds_14_tffaskgsent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsEnt = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Facturacion_preciofase_wpds_15_tffaskgsmn)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn >= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Facturacion_preciofase_wpds_16_tffaskgsmn_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn <= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV15OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H02B22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() );
            case 1 :
                  return conditional_H02B23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02B22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02B23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 28);
               ((String[]) buf[20])[0] = rslt.getString(13, 8);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 28);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               return;
      }
   }

}

