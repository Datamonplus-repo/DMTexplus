package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_opciones_impl extends GXDataArea
{
   public entradaensayolaboratorio_opciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorio_opciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_opciones_impl.class ));
   }

   public entradaensayolaboratorio_opciones_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeaccionesgrid = new HTMLChoice();
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbLb_Estado = new HTMLChoice();
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
            AV88Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV89Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
               AV96Lb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_Rb"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV96Lb_Rb", GXutil.ltrimstr( AV96Lb_Rb, 7, 2));
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
      nRC_GXsfl_61 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_61"))) ;
      nGXsfl_61_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_61_idx"))) ;
      sGXsfl_61_idx = httpContext.GetPar( "sGXsfl_61_idx") ;
      chkavSeleccionar.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_61_Refreshing);
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
      AV88Emprcod = httpContext.GetPar( "Emprcod") ;
      AV89Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV26TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV27TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV48TFLb_numop = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop"))) ;
      AV49TFLb_numop_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop_To"))) ;
      AV28TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV32TFLb_HoraEn = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_HoraEn"))) ;
      AV36TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      AV40TFLb_HoraR = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_HoraR"))) ;
      AV60TFLb_FecNoa1 = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FecNoa1")) ;
      AV74TFLb_hhnoa1 = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_hhnoa1"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV133TFLb_Estado_Sels);
      AV131WModa21 = GXutil.strtobool( httpContext.GetPar( "WModa21")) ;
      AV104WEns017 = GXutil.strtobool( httpContext.GetPar( "WEns017")) ;
      AV136Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV96Lb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_Rb"), ".") ;
      chkavSeleccionar.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_61_Refreshing);
      AV107F_Cformu = (short)(GXutil.lval( httpContext.GetPar( "F_Cformu"))) ;
      AV110ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      AV109Fornumcol = (int)(GXutil.lval( httpContext.GetPar( "Fornumcol"))) ;
      Gx_msg = httpContext.GetPar( "Gx_msg") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV105Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV106Col_Lb_opcion);
      AV93moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV102Ens017 = (short)(GXutil.lval( httpContext.GetPar( "Ens017"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
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
      pa1UL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1UL2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorio_opciones", new String[] {GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb))}, new String[] {"Emprcod","Lb_numero","Lb_Rb"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWMODA21", getSecureSignedToken( "", AV131WModa21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWENS017", getSecureSignedToken( "", AV104WEns017));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORULTUTI", getSecureSignedToken( "", AV110ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENS017", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Ens017), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Opciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV136Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_opciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_61", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_61, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV84DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV84DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_OPCION", GXutil.rtrim( AV26TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_OPCION_SEL", GXutil.rtrim( AV27TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMOP", GXutil.ltrim( localUtil.ntoc( AV48TFLb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMOP_TO", GXutil.ltrim( localUtil.ntoc( AV49TFLb_numop_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_FECHAEN", localUtil.dtoc( AV28TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_HORAEN", localUtil.ttoc( AV32TFLb_HoraEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_FECHAR", localUtil.dtoc( AV36TFLb_FechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_HORAR", localUtil.ttoc( AV40TFLb_HoraR, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_FECNOA1", localUtil.dtoc( AV60TFLb_FecNoa1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_HHNOA1", localUtil.ttoc( AV74TFLb_hhnoa1, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFLB_ESTADO_SELS", AV133TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFLB_ESTADO_SELS", AV133TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vWMODA21", AV131WModa21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWMODA21", getSecureSignedToken( "", AV131WModa21));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vWENS017", AV104WEns017);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWENS017", getSecureSignedToken( "", AV104WEns017));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV88Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_RB", GXutil.ltrim( localUtil.ntoc( AV96Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORULTUTI", localUtil.dtoc( AV110ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORULTUTI", getSecureSignedToken( "", AV110ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV109Fornumcol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_LB_NUMERO", AV105Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_LB_NUMERO", AV105Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_LB_OPCION", AV106Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_LB_OPCION", AV106Col_Lb_opcion);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV93moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV90Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_OPCION", GXutil.rtrim( AV98Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMOP", GXutil.ltrim( localUtil.ntoc( AV99Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPCION_OLD", GXutil.rtrim( AV100Opcion_old));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV92UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMFORM", GXutil.ltrim( localUtil.ntoc( AV114Numform, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RGB", GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENS017", GXutil.ltrim( localUtil.ntoc( AV102Ens017, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENS017", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Ens017), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV128i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Title", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Title", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Result", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECCIONAR_Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_copiaropcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CREAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_crearopcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Result", GXutil.rtrim( Dvelop_confirmpanel_anularnoaceptacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Result", GXutil.rtrim( Dvelop_confirmpanel_envioopciontxp_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_LIBERAROPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_liberaropcion_Result));
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
         we1UL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1UL2( ) ;
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
      return formatLink("app.gestionlaboratorio.entradaensayolaboratorio_opciones", new String[] {GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb))}, new String[] {"Emprcod","Lb_numero","Lb_Rb"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayoLaboratorio_Opciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ensayos, Opciones", "") ;
   }

   public void wb1UL0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_numero_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( AV89Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV89Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV89Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablerightheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_30_1UL2( true) ;
      }
      else
      {
         wb_table1_30_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table1_30_1UL2e( boolean wbgen )
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol61( ) ;
      }
      if ( wbEnd == 61 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_61 = (int)(nGXsfl_61_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV136Pgmname), GXutil.rtrim( localUtil.format( AV136Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV84DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_92_1UL2( true) ;
      }
      else
      {
         wb_table2_92_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table2_92_1UL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_97_1UL2( true) ;
      }
      else
      {
         wb_table3_97_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table3_97_1UL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_102_1UL2( true) ;
      }
      else
      {
         wb_table4_102_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table4_102_1UL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_107_1UL2( true) ;
      }
      else
      {
         wb_table5_107_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table5_107_1UL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_112_1UL2( true) ;
      }
      else
      {
         wb_table6_112_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table6_112_1UL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_117_1UL2( true) ;
      }
      else
      {
         wb_table7_117_1UL2( false) ;
      }
      return  ;
   }

   public void wb_table7_117_1UL2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV30DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV30DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_horaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_horaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_horaenauxdate_Internalname, localUtil.format(AV34DDO_Lb_HoraEnAuxDate, "99/99/99"), localUtil.format( AV34DDO_Lb_HoraEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_horaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_horaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV38DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV38DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_horarauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_horarauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_horarauxdate_Internalname, localUtil.format(AV42DDO_Lb_HoraRAuxDate, "99/99/99"), localUtil.format( AV42DDO_Lb_HoraRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_horarauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_horarauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname, localUtil.format(AV62DDO_Lb_FecNoa1AuxDate, "99/99/99"), localUtil.format( AV62DDO_Lb_FecNoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_hhnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname, localUtil.format(AV76DDO_Lb_hhnoa1AuxDate, "99/99/99"), localUtil.format( AV76DDO_Lb_hhnoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_hhnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 61 )
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

   public void start1UL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ensayos, Opciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1UL0( ) ;
   }

   public void ws1UL2( )
   {
      start1UL2( ) ;
      evt1UL2( ) ;
   }

   public void evt1UL2( )
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
                           e111UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_COPIAROPCION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CREAROPCION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_LIBERAROPCION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORENUMERAROPCIONES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoRenumerarOpciones' */
                           e181UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIOOPCIONTXP'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEnvioOpcionTxp' */
                           e191UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONTROLOPCIONES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoControlOpciones' */
                           e201UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e211UL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
                           AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
                           AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
                           AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
                           AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
                           AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
                           AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
                           AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
                           AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
                           AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
                           AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 26), "VGRUPODEACCIONESGRID.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 26), "VGRUPODEACCIONESGRID.CLICK") == 0 ) )
                        {
                           nGXsfl_61_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_612( ) ;
                           cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
                           cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
                           AV94GrupodeAccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94GrupodeAccionesGrid), 4, 0));
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5568Lb_HoraEn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           A5564Lb_HoraR = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraR_Internalname), 0)) ;
                           A6461Lb_FecNoa1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FecNoa1_Internalname), 0)) ;
                           A10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhnoa1_Internalname), 0)) ;
                           AV115Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                              GX_FocusControl = edtavF_cformu_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV107F_Cformu = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
                           }
                           else
                           {
                              AV107F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
                           }
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e221UL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e231UL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241UL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONESGRID.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251UL2 ();
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

   public void we1UL2( )
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

   public void pa1UL2( )
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
            GX_FocusControl = edtavLbrb_Internalname ;
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
      subsflControlProps_612( ) ;
      while ( nGXsfl_61_idx <= nRC_GXsfl_61 )
      {
         sendrow_612( ) ;
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV88Emprcod ,
                                 int AV89Lb_numero ,
                                 String AV26TFLb_opcion ,
                                 String AV27TFLb_opcion_Sel ,
                                 byte AV48TFLb_numop ,
                                 byte AV49TFLb_numop_To ,
                                 java.util.Date AV28TFLb_FechaEn ,
                                 java.util.Date AV32TFLb_HoraEn ,
                                 java.util.Date AV36TFLb_FechaR ,
                                 java.util.Date AV40TFLb_HoraR ,
                                 java.util.Date AV60TFLb_FecNoa1 ,
                                 java.util.Date AV74TFLb_hhnoa1 ,
                                 GXSimpleCollection<Byte> AV133TFLb_Estado_Sels ,
                                 boolean AV131WModa21 ,
                                 boolean AV104WEns017 ,
                                 String AV136Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV96Lb_Rb ,
                                 short AV107F_Cformu ,
                                 java.util.Date AV110ForUltUti ,
                                 int AV109Fornumcol ,
                                 String Gx_msg ,
                                 GXSimpleCollection<Integer> AV105Col_Lb_numero ,
                                 GXSimpleCollection<String> AV106Col_Lb_opcion ,
                                 short AV93moda21 ,
                                 short AV102Ens017 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231UL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1UL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Opciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV136Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_opciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_FECNOA1", getSecureSignedToken( "", A6461Lb_FecNoa1));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FECNOA1", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_ESTADO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ESTADO", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
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
      rf1UL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV136Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Opciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136Pgmname", AV136Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1UL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(61) ;
      /* Execute user event: Refresh */
      e231UL2 ();
      nGXsfl_61_idx = 1 ;
      sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_612( ) ;
      bGXsfl_61_Refreshing = true ;
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
         subsflControlProps_612( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels ,
                                              AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel ,
                                              AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ,
                                              Byte.valueOf(AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop) ,
                                              Byte.valueOf(AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to) ,
                                              AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen ,
                                              AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen ,
                                              AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar ,
                                              AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar ,
                                              AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 ,
                                              AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 ,
                                              Integer.valueOf(AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels.size()) ,
                                              A5555Lb_opcion ,
                                              Byte.valueOf(A5718Lb_numop) ,
                                              A5567Lb_FechaEn ,
                                              A5568Lb_HoraEn ,
                                              A5563Lb_FechaR ,
                                              A5564Lb_HoraR ,
                                              A6461Lb_FecNoa1 ,
                                              A10082Lb_hhnoa1 ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV88Emprcod ,
                                              Integer.valueOf(AV89Lb_numero) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A5532Lb_numero) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion), 1, "%") ;
         /* Using cursor H01UL2 */
         pr_default.execute(0, new Object[] {AV88Emprcod, Integer.valueOf(AV89Lb_numero), lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion, AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel, Byte.valueOf(AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop), Byte.valueOf(AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to), AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen, AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen, AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar, AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar, AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1, AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_61_idx = 1 ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01UL2_A396EmprCod[0] ;
            A5532Lb_numero = H01UL2_A5532Lb_numero[0] ;
            A5599Lb_RGB = H01UL2_A5599Lb_RGB[0] ;
            A5565Lb_CosteE = H01UL2_A5565Lb_CosteE[0] ;
            A831TipColCod = H01UL2_A831TipColCod[0] ;
            n831TipColCod = H01UL2_n831TipColCod[0] ;
            A5537Lb_ColNum = H01UL2_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01UL2_A5536Lb_ColNom[0] ;
            A5533Lb_ArtCod = H01UL2_A5533Lb_ArtCod[0] ;
            A279CliNom = H01UL2_A279CliNom[0] ;
            A252CliCod = H01UL2_A252CliCod[0] ;
            A5566Lb_Estado = H01UL2_A5566Lb_Estado[0] ;
            A10082Lb_hhnoa1 = H01UL2_A10082Lb_hhnoa1[0] ;
            A6461Lb_FecNoa1 = H01UL2_A6461Lb_FecNoa1[0] ;
            A5564Lb_HoraR = H01UL2_A5564Lb_HoraR[0] ;
            A5563Lb_FechaR = H01UL2_A5563Lb_FechaR[0] ;
            A5568Lb_HoraEn = H01UL2_A5568Lb_HoraEn[0] ;
            A5567Lb_FechaEn = H01UL2_A5567Lb_FechaEn[0] ;
            A5718Lb_numop = H01UL2_A5718Lb_numop[0] ;
            A5555Lb_opcion = H01UL2_A5555Lb_opcion[0] ;
            A5599Lb_RGB = H01UL2_A5599Lb_RGB[0] ;
            A831TipColCod = H01UL2_A831TipColCod[0] ;
            n831TipColCod = H01UL2_n831TipColCod[0] ;
            A5537Lb_ColNum = H01UL2_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01UL2_A5536Lb_ColNom[0] ;
            A5533Lb_ArtCod = H01UL2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01UL2_A252CliCod[0] ;
            A279CliNom = H01UL2_A279CliNom[0] ;
            e241UL2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(61) ;
         wb1UL0( ) ;
      }
      bGXsfl_61_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1UL2( )
   {
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vWMODA21", AV131WModa21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWMODA21", getSecureSignedToken( "", AV131WModa21));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vWENS017", AV104WEns017);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWENS017", getSecureSignedToken( "", AV104WEns017));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORULTUTI", localUtil.dtoc( AV110ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORULTUTI", getSecureSignedToken( "", AV110ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_FECNOA1"+"_"+sGXsfl_61_idx, getSecureSignedToken( sGXsfl_61_idx, A6461Lb_FecNoa1));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV93moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_ESTADO"+"_"+sGXsfl_61_idx, getSecureSignedToken( sGXsfl_61_idx, localUtil.format( DecimalUtil.doubleToDec(A5566Lb_Estado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENS017", GXutil.ltrim( localUtil.ntoc( AV102Ens017, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENS017", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Ens017), "ZZZ9")));
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
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels ,
                                           AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel ,
                                           AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ,
                                           Byte.valueOf(AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop) ,
                                           Byte.valueOf(AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to) ,
                                           AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen ,
                                           AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen ,
                                           AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar ,
                                           AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar ,
                                           AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 ,
                                           AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 ,
                                           Integer.valueOf(AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels.size()) ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV88Emprcod ,
                                           Integer.valueOf(AV89Lb_numero) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion), 1, "%") ;
      /* Using cursor H01UL3 */
      pr_default.execute(1, new Object[] {AV88Emprcod, Integer.valueOf(AV89Lb_numero), lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion, AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel, Byte.valueOf(AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop), Byte.valueOf(AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to), AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen, AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen, AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar, AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar, AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1, AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1});
      GRID_nRecordCount = H01UL3_AGRID_nRecordCount[0] ;
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
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Emprcod, AV89Lb_numero, AV26TFLb_opcion, AV27TFLb_opcion_Sel, AV48TFLb_numop, AV49TFLb_numop_To, AV28TFLb_FechaEn, AV32TFLb_HoraEn, AV36TFLb_FechaR, AV40TFLb_HoraR, AV60TFLb_FecNoa1, AV74TFLb_hhnoa1, AV133TFLb_Estado_Sels, AV131WModa21, AV104WEns017, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV96Lb_Rb, AV107F_Cformu, AV110ForUltUti, AV109Fornumcol, Gx_msg, AV105Col_Lb_numero, AV106Col_Lb_opcion, AV93moda21, AV102Ens017) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV136Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Opciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136Pgmname", AV136Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1UL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221UL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV84DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_LB_OPCION"), AV106Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_LB_NUMERO"), AV105Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_61 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_61"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV128i = (short)(localUtil.ctol( httpContext.cgiGet( "vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV102Ens017 = (short)(localUtil.ctol( httpContext.cgiGet( "vENS017"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_copiaropcion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Title") ;
         Dvelop_confirmpanel_copiaropcion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Confirmationtext") ;
         Dvelop_confirmpanel_copiaropcion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_copiaropcion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_copiaropcion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_copiaropcion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_copiaropcion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_crearopcion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Title") ;
         Dvelop_confirmpanel_crearopcion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Confirmationtext") ;
         Dvelop_confirmpanel_crearopcion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_crearopcion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_crearopcion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_crearopcion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_crearopcion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Confirmtype") ;
         Dvelop_confirmpanel_anularnoaceptacion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Title") ;
         Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Confirmationtext") ;
         Dvelop_confirmpanel_anularnoaceptacion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_anularnoaceptacion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Nobuttoncaption") ;
         Dvelop_confirmpanel_anularnoaceptacion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_anularnoaceptacion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Yesbuttonposition") ;
         Dvelop_confirmpanel_anularnoaceptacion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Confirmtype") ;
         Dvelop_confirmpanel_envioopciontxp_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Title") ;
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Confirmationtext") ;
         Dvelop_confirmpanel_envioopciontxp_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Yesbuttoncaption") ;
         Dvelop_confirmpanel_envioopciontxp_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Nobuttoncaption") ;
         Dvelop_confirmpanel_envioopciontxp_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_envioopciontxp_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Yesbuttonposition") ;
         Dvelop_confirmpanel_envioopciontxp_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Confirmtype") ;
         Dvelop_confirmpanel_liberaropcion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Title") ;
         Dvelop_confirmpanel_liberaropcion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Confirmationtext") ;
         Dvelop_confirmpanel_liberaropcion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_liberaropcion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_liberaropcion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_liberaropcion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_liberaropcion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_copiaropcion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIAROPCION_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_crearopcion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CREAROPCION_Result") ;
         Dvelop_confirmpanel_anularnoaceptacion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION_Result") ;
         Dvelop_confirmpanel_envioopciontxp_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP_Result") ;
         Dvelop_confirmpanel_liberaropcion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_LIBERAROPCION_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLbrb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLbrb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLBRB");
            GX_FocusControl = edtavLbrb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97LbRb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97LbRb", GXutil.ltrimstr( AV97LbRb, 7, 2));
         }
         else
         {
            AV97LbRb = localUtil.ctond( httpContext.cgiGet( edtavLbrb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97LbRb", GXutil.ltrimstr( AV97LbRb, 7, 2));
         }
         AV136Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV136Pgmname", AV136Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_Lb_FechaEnAuxDate", localUtil.format(AV30DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30DDO_Lb_FechaEnAuxDate", localUtil.format(AV30DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_horaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HORAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_horaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_Lb_HoraEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_Lb_HoraEnAuxDate", localUtil.format(AV34DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_Lb_HoraEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_horaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_Lb_HoraEnAuxDate", localUtil.format(AV34DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_Lb_FechaRAuxDate", localUtil.format(AV38DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_Lb_FechaRAuxDate", localUtil.format(AV38DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_horarauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HORARAUXDATE");
            GX_FocusControl = edtavDdo_lb_horarauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DDO_Lb_HoraRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_Lb_HoraRAuxDate", localUtil.format(AV42DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_Lb_HoraRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_horarauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_Lb_HoraRAuxDate", localUtil.format(AV42DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_fecnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_Lb_FecNoa1AuxDate", localUtil.format(AV62DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV62DDO_Lb_FecNoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_Lb_FecNoa1AuxDate", localUtil.format(AV62DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HHNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_hhnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_Lb_hhnoa1AuxDate", localUtil.format(AV76DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV76DDO_Lb_hhnoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_Lb_hhnoa1AuxDate", localUtil.format(AV76DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_61_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         if ( nGXsfl_61_idx > 0 )
         {
            cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
            cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
            AV94GrupodeAccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94GrupodeAccionesGrid), 4, 0));
            A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
            A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5567Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( edtLb_FechaEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A5568Lb_HoraEn = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraEn_Internalname))) ;
            A5563Lb_FechaR = localUtil.ctod( httpContext.cgiGet( edtLb_FechaR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A5564Lb_HoraR = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraR_Internalname))) ;
            A6461Lb_FecNoa1 = localUtil.ctod( httpContext.cgiGet( edtLb_FecNoa1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhnoa1_Internalname))) ;
            AV115Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
            cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
            cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
            A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
               GX_FocusControl = edtavF_cformu_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV107F_Cformu = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
            }
            else
            {
               AV107F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
            A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
            A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n831TipColCod = false ;
            A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Opciones");
         AV136Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV136Pgmname", AV136Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV136Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorio_opciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e221UL2 ();
      if (returnInSub) return;
   }

   public void e221UL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV90Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV90Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Station", AV90Station);
      GXv_char2[0] = AV88Emprcod ;
      GXv_char3[0] = AV91EmprNom ;
      GXv_char4[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char2[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV91EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV92UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
      GXt_int5 = AV95RbSimulacion ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV88Emprcod, httpContext.getMessage( "RBSIMU", ""), GXv_int6) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95RbSimulacion = (short)(GXt_int5) ;
      AV97LbRb = ((0==AV95RbSimulacion) ? DecimalUtil.stringToDec("15.00") : DecimalUtil.doubleToDec(AV95RbSimulacion/ (double) (100))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97LbRb", GXutil.ltrimstr( AV97LbRb, 7, 2));
      GXt_int7 = (byte)(AV93moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV88Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_int7 = GXv_int8[0] ;
      AV93moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93moda21), "ZZZ9")));
      GXt_int7 = (byte)(AV102Ens017) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV88Emprcod, httpContext.getMessage( "ENS017", ""), GXv_int8) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_int7 = GXv_int8[0] ;
      AV102Ens017 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Ens017", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102Ens017), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENS017", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102Ens017), "ZZZ9")));
      AV104WEns017 = ((0==AV102Ens017) ? false : true) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104WEns017", AV104WEns017);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWENS017", getSecureSignedToken( "", AV104WEns017));
      AV131WModa21 = ((0==AV93moda21) ? false : true) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131WModa21", AV131WModa21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWMODA21", getSecureSignedToken( "", AV131WModa21));
      GXt_char1 = AV90Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_char1 = GXv_char4[0] ;
      AV90Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Station", AV90Station);
      GXv_char4[0] = AV88Emprcod ;
      GXv_char3[0] = AV91EmprNom ;
      GXv_char2[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV91EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV92UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Ensayos, Opciones", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV84DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV84DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
   }

   public void e231UL2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = AV26TFLb_opcion ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = AV27TFLb_opcion_Sel ;
      AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop = AV48TFLb_numop ;
      AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to = AV49TFLb_numop_To ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = AV28TFLb_FechaEn ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = AV32TFLb_HoraEn ;
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = AV36TFLb_FechaR ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = AV40TFLb_HoraR ;
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = AV60TFLb_FecNoa1 ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = AV74TFLb_hhnoa1 ;
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = AV133TFLb_Estado_Sels ;
      /*  Sending Event outputs  */
   }

   public void e111UL2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV26TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLb_opcion", AV26TFLb_opcion);
            AV27TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFLb_opcion_Sel", AV27TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numop") == 0 )
         {
            AV48TFLb_numop = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFLb_numop), 2, 0));
            AV49TFLb_numop_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV28TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLb_FechaEn", localUtil.format(AV28TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_HoraEn") == 0 )
         {
            AV32TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLb_HoraEn", localUtil.ttoc( AV32TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV36TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLb_FechaR", localUtil.format(AV36TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_HoraR") == 0 )
         {
            AV40TFLb_HoraR = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_HoraR", localUtil.ttoc( AV40TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FecNoa1") == 0 )
         {
            AV60TFLb_FecNoa1 = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFLb_FecNoa1", localUtil.format(AV60TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_hhnoa1") == 0 )
         {
            AV74TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLb_hhnoa1", localUtil.ttoc( AV74TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV132TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFLb_Estado_SelsJson", AV132TFLb_Estado_SelsJson);
            AV133TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV132TFLb_Estado_SelsJson, "\"", ""), null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV133TFLb_Estado_Sels", AV133TFLb_Estado_Sels);
   }

   private void e241UL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeaccionesgrid.removeAllItems();
      cmbavGrupodeaccionesgrid.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeaccionesgrid.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Copiar Opcion", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Ficha Ensayo", ""), "fa fa-hand-holding", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Lab Dip (Rb)", ""), "fa fa-hand-holding", "", "", "", "", "", "", ""), (short)(0));
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A252CliCod ;
      GXv_char3[0] = A5533Lb_ArtCod ;
      GXv_char2[0] = A5536Lb_ColNom ;
      GXv_int12[0] = A5537Lb_ColNum ;
      GXv_int8[0] = A831TipColCod ;
      GXv_int13[0] = (byte)(AV107F_Cformu) ;
      GXv_date14[0] = AV110ForUltUti ;
      GXv_int15[0] = AV109Fornumcol ;
      GXv_char16[0] = Gx_msg ;
      new app.pens011(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int12, GXv_int8, GXv_int13, GXv_date14, GXv_int15, GXv_char16) ;
      entradaensayolaboratorio_opciones_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.A252CliCod = GXv_int6[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5533Lb_ArtCod = GXv_char3[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5536Lb_ColNom = GXv_char2[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5537Lb_ColNum = GXv_int12[0] ;
      entradaensayolaboratorio_opciones_impl.this.A831TipColCod = GXv_int8[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV107F_Cformu = GXv_int13[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV110ForUltUti = GXv_date14[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV109Fornumcol = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.Gx_msg = GXv_char16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV110ForUltUti", localUtil.format(AV110ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORULTUTI", getSecureSignedToken( "", AV110ForUltUti));
      httpContext.ajax_rsp_assign_attri("", false, "AV109Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Fornumcol), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      if ( ( A5566Lb_Estado == 2 ) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
      {
         chkavSeleccionar.setVisible( 1 );
      }
      else
      {
         chkavSeleccionar.setVisible( 0 );
      }
      AV115Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
      AV128i = (short)(1) ;
      while ( AV128i <= AV105Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV105Col_Lb_numero.elementAt(-1+AV128i)).intValue() == AV89Lb_numero ) && ( GXutil.strcmp((String)AV106Col_Lb_opcion.elementAt(-1+AV128i), A5555Lb_opcion) == 0 ) )
         {
            AV115Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
            if (true) break;
         }
         AV128i = (short)(AV128i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(61) ;
      }
      sendrow_612( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_61_Refreshing )
      {
         httpContext.doAjaxLoad(61, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0)) );
   }

   public void e251UL2( )
   {
      /* Grupodeaccionesgrid_Click Routine */
      returnInSub = false ;
      if ( AV94GrupodeAccionesGrid == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV94GrupodeAccionesGrid == 2 )
      {
         /* Execute user subroutine: 'DO COPIAROPCION' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV94GrupodeAccionesGrid == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV94GrupodeAccionesGrid == 4 )
      {
         /* Execute user subroutine: 'DO FICHAENSAYO' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV94GrupodeAccionesGrid == 5 )
      {
         /* Execute user subroutine: 'DO LABDIP' */
         S212 ();
         if (returnInSub) return;
      }
      AV94GrupodeAccionesGrid = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94GrupodeAccionesGrid), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Values", cmbavGrupodeaccionesgrid.ToJavascriptSource(), true);
   }

   public void e121UL2( )
   {
      /* Dvelop_confirmpanel_copiaropcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_copiaropcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION COPIAROPCION' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e131UL2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141UL2( )
   {
      /* Dvelop_confirmpanel_crearopcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_crearopcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CREAROPCION' */
         S242 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e181UL2( )
   {
      /* 'DoRenumerarOpciones' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      new app.gestionlaboratorio.prens003(remoteHandle, context).execute( GXv_char16, GXv_int15) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.doAjaxRefresh();
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Realizado", ""));
      /*  Sending Event outputs  */
   }

   public void e151UL2( )
   {
      /* Dvelop_confirmpanel_anularnoaceptacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_anularnoaceptacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANULARNOACEPTACION' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV105Col_Lb_numero", AV105Col_Lb_numero);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV106Col_Lb_opcion", AV106Col_Lb_opcion);
   }

   public void e191UL2( )
   {
      /* 'DoEnvioOpcionTxp' Routine */
      returnInSub = false ;
      if ( (0==AV107F_Cformu) )
      {
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo ", "")+GXutil.trim( GXutil.str( AV89Lb_numero, 8, 0))+httpContext.getMessage( " , Opcion ", "")+GXutil.trim( A5555Lb_opcion)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "NO existe en Colorteca.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Creara el COLOR:", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Cliente ", "")+GXutil.trim( A279CliNom)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Color ", "")+GXutil.trim( A5536Lb_ColNom)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( A5537Lb_ColNum, 6, 0))+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
      }
      else
      {
         GXv_char16[0] = AV88Emprcod ;
         GXv_int15[0] = AV109Fornumcol ;
         GXv_int12[0] = AV114Numform ;
         new app.pfornumcol(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int12) ;
         entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV109Fornumcol = GXv_int15[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV114Numform = (short)((short)(GXv_int12[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV109Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Fornumcol), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV114Numform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114Numform), 4, 0));
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = httpContext.getMessage( "Ha seleccionado Actualizar en Produccion", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Este Nº Ensayo ", "")+GXutil.trim( GXutil.str( AV89Lb_numero, 8, 0))+httpContext.getMessage( " , Opcion ", "")+GXutil.trim( A5555Lb_opcion)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "EXISTE en Colorteca.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Se eliminaran: COLORANTES y PRODUCTOS(#)", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         Dvelop_confirmpanel_envioopciontxp_Confirmationtext = Dvelop_confirmpanel_envioopciontxp_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
         ucDvelop_confirmpanel_envioopciontxp.sendProperty(context, "", false, Dvelop_confirmpanel_envioopciontxp_Internalname, "ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
      }
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXPContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e161UL2( )
   {
      /* Dvelop_confirmpanel_envioopciontxp_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_envioopciontxp_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENVIOOPCIONTXP' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e171UL2( )
   {
      /* Dvelop_confirmpanel_liberaropcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_liberaropcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION LIBERAROPCION' */
         S272 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e201UL2( )
   {
      /* 'DoControlOpciones' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = AV92UsurCod ;
      GXv_char3[0] = AV90Station ;
      new app.gestionlaboratorio.pctrlopcion(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV92UsurCod = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV90Station = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV90Station", AV90Station);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Realizado", ""));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e211UL2( )
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

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( AV131WModa21 ) )
      {
         bttBtnanularnoaceptacion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnanularnoaceptacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnanularnoaceptacion_Visible), 5, 0), true);
      }
      if ( ! ( AV131WModa21 ) )
      {
         bttBtnenvioopciontxp_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnenvioopciontxp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenvioopciontxp_Visible), 5, 0), true);
      }
      if ( ! ( AV104WEns017 ) )
      {
         bttBtnliberaropcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnliberaropcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnliberaropcion_Visible), 5, 0), true);
      }
   }

   public void S172( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(A5555Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb))}, new String[] {"Mode","EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO COPIAROPCION' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", A5555Lb_opcion)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Opcion para copiar¡", ""));
      }
      else
      {
         Dvelop_confirmpanel_copiaropcion_Confirmationtext = httpContext.getMessage( "Ha seleccionado la opcion ", "")+GXutil.trim( A5555Lb_opcion)+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_copiaropcion.sendProperty(context, "", false, Dvelop_confirmpanel_copiaropcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_copiaropcion_Confirmationtext);
         Dvelop_confirmpanel_copiaropcion_Confirmationtext = Dvelop_confirmpanel_copiaropcion_Confirmationtext+httpContext.getMessage( "Desea crear la copia?", "") ;
         ucDvelop_confirmpanel_copiaropcion.sendProperty(context, "", false, Dvelop_confirmpanel_copiaropcion_Internalname, "ConfirmationText", Dvelop_confirmpanel_copiaropcion_Confirmationtext);
         AV149Emprcod_selected = A396EmprCod ;
         AV150Lb_numero_selected = A5532Lb_numero ;
         AV151Lb_opcion_selected = A5555Lb_opcion ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_COPIAROPCIONContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S222( )
   {
      /* 'DO ACTION COPIAROPCION' Routine */
      returnInSub = false ;
      AV100Opcion_old = A5555Lb_opcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Opcion_old", AV100Opcion_old);
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = AV100Opcion_old ;
      GXv_char3[0] = AV98Lb_opcion ;
      GXv_int13[0] = AV99Lb_numop ;
      new app.gestionlaboratorio.pens002(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV100Opcion_old = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char3[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV99Lb_numop = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Opcion_old", AV100Opcion_old);
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Lb_numop), 2, 0));
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = AV98Lb_opcion ;
      GXv_int13[0] = AV99Lb_numop ;
      GXv_char3[0] = AV100Opcion_old ;
      new app.gestionlaboratorio.pens014(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_int13, GXv_char3) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV99Lb_numop = GXv_int13[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV100Opcion_old = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Lb_numop), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Opcion_old", AV100Opcion_old);
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = A5555Lb_opcion ;
      GXv_char3[0] = AV98Lb_opcion ;
      new app.pens013(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5555Lb_opcion = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = A5532Lb_numero ;
      GXv_char4[0] = AV98Lb_opcion ;
      new app.gestionlaboratorio.pens038(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5532Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV98Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb))}, new String[] {"Mode","EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar la opcion ", "")+A5555Lb_opcion+" ?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV149Emprcod_selected = A396EmprCod ;
      AV150Lb_numero_selected = A5532Lb_numero ;
      AV151Lb_opcion_selected = A5555Lb_opcion ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S232( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char16[0] = A396EmprCod ;
      GXv_int15[0] = A5532Lb_numero ;
      GXv_char4[0] = A5555Lb_opcion ;
      new app.gestionlaboratorio.pens005(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4) ;
      entradaensayolaboratorio_opciones_impl.this.A396EmprCod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5532Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5555Lb_opcion = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      GXv_char16[0] = A396EmprCod ;
      GXv_int15[0] = A5532Lb_numero ;
      new app.gestionlaboratorio.pens1005(remoteHandle, context).execute( GXv_char16, GXv_int15) ;
      entradaensayolaboratorio_opciones_impl.this.A396EmprCod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5532Lb_numero = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      new app.pcommit(remoteHandle, context).execute( ) ;
      GXv_char16[0] = A396EmprCod ;
      GXv_int15[0] = A5532Lb_numero ;
      new app.gestionlaboratorio.pdbgl04(remoteHandle, context).execute( GXv_char16, GXv_int15) ;
      entradaensayolaboratorio_opciones_impl.this.A396EmprCod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5532Lb_numero = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO FICHAENSAYO' Routine */
      returnInSub = false ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Opcion tiene Fecha NO Aceptacion¡¡¡", ""));
      }
      else
      {
         if ( AV93moda21 == 1 )
         {
            httpContext.popup(formatLink("app.gestionlaboratorio.rens22m", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(A5555Lb_opcion)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Output"}) , new Object[] {"A396EmprCod","A5532Lb_numero","A5555Lb_opcion",""});
            httpContext.doAjaxRefresh();
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato NO definido", ""));
         }
      }
   }

   public void S212( )
   {
      /* 'DO LABDIP' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = A5532Lb_numero ;
      GXv_char4[0] = A5555Lb_opcion ;
      GXv_decimal17[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int12[0] = (int)(DecimalUtil.decToDouble(AV97LbRb)) ;
      GXv_char3[0] = " " ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
      new app.gestionlaboratorio.pens003x(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_decimal17, GXv_int12, GXv_char3, GXv_decimal18) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5532Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5555Lb_opcion = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV97LbRb = DecimalUtil.doubleToDec(GXv_int12[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV97LbRb", GXutil.ltrimstr( AV97LbRb, 7, 2));
      httpContext.popup(formatLink("app.gestionlaboratorio.pprc261", new String[] {GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(A5555Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV97LbRb)),GXutil.URLEncode(GXutil.rtrim(AV90Station))}, new String[] {"EmprCod","Lb_rb","Lb_numero","Lb_opcion","Lb_rb","Workstat"}) , new Object[] {"AV88Emprcod","AV96Lb_Rb","A5532Lb_numero","A5555Lb_opcion","AV97LbRb","AV90Station"});
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO ACTION CREAROPCION' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = AV100Opcion_old ;
      GXv_char3[0] = AV98Lb_opcion ;
      GXv_int13[0] = AV99Lb_numop ;
      new app.gestionlaboratorio.pens002(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV100Opcion_old = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char3[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV99Lb_numop = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Opcion_old", AV100Opcion_old);
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Lb_numop), 2, 0));
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = AV98Lb_opcion ;
      GXv_int13[0] = AV99Lb_numop ;
      GXv_char3[0] = AV100Opcion_old ;
      new app.gestionlaboratorio.pens014(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_int13, GXv_char3) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV98Lb_opcion = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV99Lb_numop = GXv_int13[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV100Opcion_old = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_opcion", AV98Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Lb_numop), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Opcion_old", AV100Opcion_old);
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV98Lb_opcion))}, new String[] {"EmprCod","Lb_numero","Lb_opcion"}) , new Object[] {"AV88Emprcod","AV89Lb_numero","AV98Lb_opcion"});
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV88Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV89Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV98Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV96Lb_Rb))}, new String[] {"Mode","EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO ACTION ANULARNOACEPTACION' Routine */
      returnInSub = false ;
      AV128i = (short)(1) ;
      while ( AV128i <= AV105Col_Lb_numero.size() )
      {
         AV112IN_Lb_opcion = (String)AV106Col_Lb_opcion.elementAt(-1+AV128i) ;
         GXv_char16[0] = AV88Emprcod ;
         GXv_int15[0] = AV89Lb_numero ;
         GXv_char4[0] = AV112IN_Lb_opcion ;
         GXv_char3[0] = AV92UsurCod ;
         GXv_char2[0] = AV90Station ;
         new app.putlb04(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_char2) ;
         entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV112IN_Lb_opcion = GXv_char4[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV92UsurCod = GXv_char3[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV90Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV90Station", AV90Station);
         AV108Fecha_no = GXutil.nullDate() ;
         GXv_char16[0] = AV88Emprcod ;
         GXv_int15[0] = AV89Lb_numero ;
         GXv_char4[0] = " " ;
         GXv_date14[0] = AV108Fecha_no ;
         GXv_int12[0] = A252CliCod ;
         new app.gestionlaboratorio.pregcor9(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_date14, GXv_int12) ;
         entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
         entradaensayolaboratorio_opciones_impl.this.AV108Fecha_no = GXv_date14[0] ;
         entradaensayolaboratorio_opciones_impl.this.A252CliCod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
         AV128i = (short)(AV128i+1) ;
      }
      AV105Col_Lb_numero.clear();
      AV106Col_Lb_opcion.clear();
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO ACTION ENVIOOPCIONTXP' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = A5536Lb_ColNom ;
      GXv_int12[0] = A5537Lb_ColNum ;
      new app.pens09c(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_int12) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5536Lb_ColNom = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5537Lb_ColNum = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = A5555Lb_opcion ;
      GXv_date14[0] = A5563Lb_FechaR ;
      GXv_decimal18[0] = A5565Lb_CosteE ;
      GXv_int19[0] = A5599Lb_RGB ;
      GXv_int13[0] = (byte)(AV107F_Cformu) ;
      GXv_int8[0] = (byte)(0) ;
      GXv_int20[0] = (byte)(0) ;
      GXv_int12[0] = A5537Lb_ColNum ;
      GXv_char3[0] = httpContext.getMessage( "S", "") ;
      new app.gestionlaboratorio.pens009(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_date14, GXv_decimal18, GXv_int19, GXv_int13, GXv_int8, GXv_int20, GXv_int12, GXv_char3) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5555Lb_opcion = GXv_char4[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5563Lb_FechaR = GXv_date14[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5565Lb_CosteE = GXv_decimal18[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5599Lb_RGB = GXv_int19[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV107F_Cformu = GXv_int13[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5537Lb_ColNum = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A5599Lb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5599Lb_RGB), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107F_Cformu), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO ACTION LIBERAROPCION' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV88Emprcod ;
      GXv_int15[0] = AV89Lb_numero ;
      GXv_char4[0] = A5555Lb_opcion ;
      new app.putlb01(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4) ;
      entradaensayolaboratorio_opciones_impl.this.AV88Emprcod = GXv_char16[0] ;
      entradaensayolaboratorio_opciones_impl.this.AV89Lb_numero = GXv_int15[0] ;
      entradaensayolaboratorio_opciones_impl.this.A5555Lb_opcion = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV136Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV136Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV136Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV152GXV1 = 1 ;
      while ( AV152GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV152GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV26TFLb_opcion = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLb_opcion", AV26TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV27TFLb_opcion_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFLb_opcion_Sel", AV27TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV48TFLb_numop = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFLb_numop), 2, 0));
            AV49TFLb_numop_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV28TFLb_FechaEn = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLb_FechaEn", localUtil.format(AV28TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAEN") == 0 )
         {
            AV32TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLb_HoraEn", localUtil.ttoc( AV32TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV34DDO_Lb_HoraEnAuxDate = GXutil.resetTime(AV32TFLb_HoraEn) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_Lb_HoraEnAuxDate", localUtil.format(AV34DDO_Lb_HoraEnAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV36TFLb_FechaR = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLb_FechaR", localUtil.format(AV36TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAR") == 0 )
         {
            AV40TFLb_HoraR = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_HoraR", localUtil.ttoc( AV40TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV42DDO_Lb_HoraRAuxDate = GXutil.resetTime(AV40TFLb_HoraR) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_Lb_HoraRAuxDate", localUtil.format(AV42DDO_Lb_HoraRAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV60TFLb_FecNoa1 = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFLb_FecNoa1", localUtil.format(AV60TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV74TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLb_hhnoa1", localUtil.ttoc( AV74TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV76DDO_Lb_hhnoa1AuxDate = GXutil.resetTime(AV74TFLb_hhnoa1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_Lb_hhnoa1AuxDate", localUtil.format(AV76DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV132TFLb_Estado_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFLb_Estado_SelsJson", AV132TFLb_Estado_SelsJson);
            AV133TFLb_Estado_Sels.fromJSonString(AV132TFLb_Estado_SelsJson, null);
         }
         AV152GXV1 = (int)(AV152GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFLb_opcion_Sel)==0), AV27TFLb_opcion_Sel, GXv_char16) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_char1 = GXv_char16[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||||||||"+((AV133TFLb_Estado_Sels.size()==0) ? "" : AV132TFLb_Estado_SelsJson) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFLb_opcion)==0), AV26TFLb_opcion, GXv_char16) ;
      entradaensayolaboratorio_opciones_impl.this.GXt_char1 = GXv_char16[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+((0==AV48TFLb_numop) ? "" : GXutil.str( AV48TFLb_numop, 2, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFLb_FechaEn)) ? "" : localUtil.dtoc( AV28TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV32TFLb_HoraEn) ? "" : localUtil.dtoc( AV34DDO_Lb_HoraEnAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFLb_FechaR)) ? "" : localUtil.dtoc( AV36TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV40TFLb_HoraR) ? "" : localUtil.dtoc( AV42DDO_Lb_HoraRAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLb_FecNoa1)) ? "" : localUtil.dtoc( AV60TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV74TFLb_hhnoa1) ? "" : localUtil.dtoc( AV76DDO_Lb_hhnoa1AuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV49TFLb_numop_To) ? "" : GXutil.str( AV49TFLb_numop_To, 2, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
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
      AV10GridState.fromxml(AV22Session.getValue(AV136Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_OPCION", "", !(GXutil.strcmp("", AV26TFLb_opcion)==0), (short)(0), AV26TFLb_opcion, "", !(GXutil.strcmp("", AV27TFLb_opcion_Sel)==0), AV27TFLb_opcion_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_NUMOP", "", !((0==AV48TFLb_numop)&&(0==AV49TFLb_numop_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFLb_numop, 2, 0)), GXutil.trim( GXutil.str( AV49TFLb_numop_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_HORAEN", "", !GXutil.dateCompare(GXutil.nullDate(), AV32TFLb_HoraEn), (short)(0), GXutil.trim( localUtil.ttoc( AV32TFLb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV36TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_HORAR", "", !GXutil.dateCompare(GXutil.nullDate(), AV40TFLb_HoraR), (short)(0), GXutil.trim( localUtil.ttoc( AV40TFLb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_FECNOA1", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLb_FecNoa1)), (short)(0), GXutil.trim( localUtil.dtoc( AV60TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_HHNOA1", "", !GXutil.dateCompare(GXutil.nullDate(), AV74TFLb_hhnoa1), (short)(0), GXutil.trim( localUtil.ttoc( AV74TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLB_ESTADO_SEL", "", !(AV133TFLb_Estado_Sels.size()==0), (short)(0), AV133TFLb_Estado_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      if ( ! (GXutil.strcmp("", AV88Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV88Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV89Lb_numero) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV89Lb_numero, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Lb_Rb)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_RB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV96Lb_Rb, 7, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV136Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV136Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV88Emprcod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         chkavSeleccionar.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_61_Refreshing);
      }
   }

   public void S282( )
   {
      /* 'DO LIBERAROPCIONCERRADAMANUAL' Routine */
      returnInSub = false ;
      if ( ( A5566Lb_Estado == 3 ) && ( AV102Ens017 == 1 ) )
      {
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La opcion debe de estar con Estado = 3", ""));
      }
   }

   public void wb_table7_117_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_liberaropcion_Internalname, tblTabledvelop_confirmpanel_liberaropcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_liberaropcion.setProperty("Title", Dvelop_confirmpanel_liberaropcion_Title);
         ucDvelop_confirmpanel_liberaropcion.setProperty("ConfirmationText", Dvelop_confirmpanel_liberaropcion_Confirmationtext);
         ucDvelop_confirmpanel_liberaropcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_liberaropcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_liberaropcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_liberaropcion_Nobuttoncaption);
         ucDvelop_confirmpanel_liberaropcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_liberaropcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_liberaropcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_liberaropcion_Yesbuttonposition);
         ucDvelop_confirmpanel_liberaropcion.setProperty("ConfirmType", Dvelop_confirmpanel_liberaropcion_Confirmtype);
         ucDvelop_confirmpanel_liberaropcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_liberaropcion_Internalname, "DVELOP_CONFIRMPANEL_LIBERAROPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_LIBERAROPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_117_1UL2e( true) ;
      }
      else
      {
         wb_table7_117_1UL2e( false) ;
      }
   }

   public void wb_table6_112_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_envioopciontxp_Internalname, tblTabledvelop_confirmpanel_envioopciontxp_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_envioopciontxp.setProperty("Title", Dvelop_confirmpanel_envioopciontxp_Title);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("ConfirmationText", Dvelop_confirmpanel_envioopciontxp_Confirmationtext);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("YesButtonCaption", Dvelop_confirmpanel_envioopciontxp_Yesbuttoncaption);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("NoButtonCaption", Dvelop_confirmpanel_envioopciontxp_Nobuttoncaption);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("CancelButtonCaption", Dvelop_confirmpanel_envioopciontxp_Cancelbuttoncaption);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("YesButtonPosition", Dvelop_confirmpanel_envioopciontxp_Yesbuttonposition);
         ucDvelop_confirmpanel_envioopciontxp.setProperty("ConfirmType", Dvelop_confirmpanel_envioopciontxp_Confirmtype);
         ucDvelop_confirmpanel_envioopciontxp.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_envioopciontxp_Internalname, "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXPContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENVIOOPCIONTXPContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_112_1UL2e( true) ;
      }
      else
      {
         wb_table6_112_1UL2e( false) ;
      }
   }

   public void wb_table5_107_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_anularnoaceptacion_Internalname, tblTabledvelop_confirmpanel_anularnoaceptacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("Title", Dvelop_confirmpanel_anularnoaceptacion_Title);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("ConfirmationText", Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_anularnoaceptacion_Yesbuttoncaption);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_anularnoaceptacion_Nobuttoncaption);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_anularnoaceptacion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_anularnoaceptacion_Yesbuttonposition);
         ucDvelop_confirmpanel_anularnoaceptacion.setProperty("ConfirmType", Dvelop_confirmpanel_anularnoaceptacion_Confirmtype);
         ucDvelop_confirmpanel_anularnoaceptacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_anularnoaceptacion_Internalname, "DVELOP_CONFIRMPANEL_ANULARNOACEPTACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ANULARNOACEPTACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_107_1UL2e( true) ;
      }
      else
      {
         wb_table5_107_1UL2e( false) ;
      }
   }

   public void wb_table4_102_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_crearopcion_Internalname, tblTabledvelop_confirmpanel_crearopcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_crearopcion.setProperty("Title", Dvelop_confirmpanel_crearopcion_Title);
         ucDvelop_confirmpanel_crearopcion.setProperty("ConfirmationText", Dvelop_confirmpanel_crearopcion_Confirmationtext);
         ucDvelop_confirmpanel_crearopcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_crearopcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_crearopcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_crearopcion_Nobuttoncaption);
         ucDvelop_confirmpanel_crearopcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_crearopcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_crearopcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_crearopcion_Yesbuttonposition);
         ucDvelop_confirmpanel_crearopcion.setProperty("ConfirmType", Dvelop_confirmpanel_crearopcion_Confirmtype);
         ucDvelop_confirmpanel_crearopcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_crearopcion_Internalname, "DVELOP_CONFIRMPANEL_CREAROPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CREAROPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_102_1UL2e( true) ;
      }
      else
      {
         wb_table4_102_1UL2e( false) ;
      }
   }

   public void wb_table3_97_1UL2( boolean wbgen )
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
         wb_table3_97_1UL2e( true) ;
      }
      else
      {
         wb_table3_97_1UL2e( false) ;
      }
   }

   public void wb_table2_92_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_copiaropcion_Internalname, tblTabledvelop_confirmpanel_copiaropcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_copiaropcion.setProperty("Title", Dvelop_confirmpanel_copiaropcion_Title);
         ucDvelop_confirmpanel_copiaropcion.setProperty("ConfirmationText", Dvelop_confirmpanel_copiaropcion_Confirmationtext);
         ucDvelop_confirmpanel_copiaropcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_copiaropcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_copiaropcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_copiaropcion_Nobuttoncaption);
         ucDvelop_confirmpanel_copiaropcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_copiaropcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_copiaropcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_copiaropcion_Yesbuttonposition);
         ucDvelop_confirmpanel_copiaropcion.setProperty("ConfirmType", Dvelop_confirmpanel_copiaropcion_Confirmtype);
         ucDvelop_confirmpanel_copiaropcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_copiaropcion_Internalname, "DVELOP_CONFIRMPANEL_COPIAROPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_COPIAROPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_92_1UL2e( true) ;
      }
      else
      {
         wb_table2_92_1UL2e( false) ;
      }
   }

   public void wb_table1_30_1UL2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedactiongroup_grupodeacciones_Internalname, tblTablemergedactiongroup_grupodeacciones_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearopcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Crear Opcion", ""), bttBtncrearopcion_Jsonclick, 7, httpContext.getMessage( "Crear Opcion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e261ul1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrenumeraropciones_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Re-numerar Opciones", ""), bttBtnrenumeraropciones_Jsonclick, 5, httpContext.getMessage( "Re-numerar Opciones", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORENUMERAROPCIONES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnanularnoaceptacion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Anular Reprovaçao", ""), bttBtnanularnoaceptacion_Jsonclick, 7, httpContext.getMessage( "Anular Reprovaçao", ""), "", StyleString, ClassString, bttBtnanularnoaceptacion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e271ul1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenvioopciontxp_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Envio Opção TXP Provisória", ""), bttBtnenvioopciontxp_Jsonclick, 5, httpContext.getMessage( "Envio Opção TXP Provisória", ""), "", StyleString, ClassString, bttBtnenvioopciontxp_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOENVIOOPCIONTXP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnliberaropcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Liberar Opçao Fechada Manual", ""), bttBtnliberaropcion_Jsonclick, 7, httpContext.getMessage( "Liberar Opçao Fechada Manual", ""), "", StyleString, ClassString, bttBtnliberaropcion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e281ul1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncontrolopciones_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Ctrl Opciones", ""), bttBtncontrolopciones_Jsonclick, 5, httpContext.getMessage( "Ctrl Opciones", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONTROLOPCIONES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablelbrb_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklbrb_Internalname, httpContext.getMessage( "Rb (Lab Dip)", ""), "", "", lblTextblocklbrb_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLbrb_Internalname, httpContext.getMessage( "Lb Rb", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLbrb_Internalname, GXutil.ltrim( localUtil.ntoc( AV97LbRb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLbrb_Enabled!=0) ? localUtil.format( AV97LbRb, "ZZZ9.99") : localUtil.format( AV97LbRb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLbrb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLbrb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Opciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_30_1UL2e( true) ;
      }
      else
      {
         wb_table1_30_1UL2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV88Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Emprcod", AV88Emprcod);
      AV89Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Lb_numero), 8, 0));
      AV96Lb_Rb = (java.math.BigDecimal)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Lb_Rb", GXutil.ltrimstr( AV96Lb_Rb, 7, 2));
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
      pa1UL2( ) ;
      ws1UL2( ) ;
      we1UL2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614596", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorio_opciones.js", "?20268211614596", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_612( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_61_idx );
      edtLb_opcion_Internalname = "LB_OPCION_"+sGXsfl_61_idx ;
      edtLb_numop_Internalname = "LB_NUMOP_"+sGXsfl_61_idx ;
      edtLb_FechaEn_Internalname = "LB_FECHAEN_"+sGXsfl_61_idx ;
      edtLb_HoraEn_Internalname = "LB_HORAEN_"+sGXsfl_61_idx ;
      edtLb_FechaR_Internalname = "LB_FECHAR_"+sGXsfl_61_idx ;
      edtLb_HoraR_Internalname = "LB_HORAR_"+sGXsfl_61_idx ;
      edtLb_FecNoa1_Internalname = "LB_FECNOA1_"+sGXsfl_61_idx ;
      edtLb_hhnoa1_Internalname = "LB_HHNOA1_"+sGXsfl_61_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_61_idx );
      cmbLb_Estado.setInternalname( "LB_ESTADO_"+sGXsfl_61_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_61_idx ;
      edtavF_cformu_Internalname = "vF_CFORMU_"+sGXsfl_61_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_61_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_61_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_61_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_61_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_61_idx ;
      edtLb_CosteE_Internalname = "LB_COSTEE_"+sGXsfl_61_idx ;
   }

   public void subsflControlProps_fel_612( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_61_fel_idx );
      edtLb_opcion_Internalname = "LB_OPCION_"+sGXsfl_61_fel_idx ;
      edtLb_numop_Internalname = "LB_NUMOP_"+sGXsfl_61_fel_idx ;
      edtLb_FechaEn_Internalname = "LB_FECHAEN_"+sGXsfl_61_fel_idx ;
      edtLb_HoraEn_Internalname = "LB_HORAEN_"+sGXsfl_61_fel_idx ;
      edtLb_FechaR_Internalname = "LB_FECHAR_"+sGXsfl_61_fel_idx ;
      edtLb_HoraR_Internalname = "LB_HORAR_"+sGXsfl_61_fel_idx ;
      edtLb_FecNoa1_Internalname = "LB_FECNOA1_"+sGXsfl_61_fel_idx ;
      edtLb_hhnoa1_Internalname = "LB_HHNOA1_"+sGXsfl_61_fel_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_61_fel_idx );
      cmbLb_Estado.setInternalname( "LB_ESTADO_"+sGXsfl_61_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_61_fel_idx ;
      edtavF_cformu_Internalname = "vF_CFORMU_"+sGXsfl_61_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_61_fel_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_61_fel_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_61_fel_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_61_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_61_fel_idx ;
      edtLb_CosteE_Internalname = "LB_COSTEE_"+sGXsfl_61_fel_idx ;
   }

   public void sendrow_612( )
   {
      subsflControlProps_612( ) ;
      wb1UL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_61_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_61_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_61_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         if ( ( cmbavGrupodeaccionesgrid.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_61_idx ;
            cmbavGrupodeaccionesgrid.setName( GXCCtl );
            cmbavGrupodeaccionesgrid.setWebtags( "" );
            if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
            {
               AV94GrupodeAccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94GrupodeAccionesGrid), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeaccionesgrid,cmbavGrupodeaccionesgrid.getInternalname(),GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0)),Integer.valueOf(1),cmbavGrupodeaccionesgrid.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONESGRID.CLICK."+sGXsfl_61_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Values", cmbavGrupodeaccionesgrid.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_HoraEn_Internalname,localUtil.ttoc( A5568Lb_HoraEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5568Lb_HoraEn, "99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_HoraEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_HoraR_Internalname,localUtil.ttoc( A5564Lb_HoraR, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5564Lb_HoraR, "99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_HoraR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FecNoa1_Internalname,localUtil.format(A6461Lb_FecNoa1, "99/99/99"),localUtil.format( A6461Lb_FecNoa1, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_FecNoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_hhnoa1_Internalname,localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10082Lb_hhnoa1, "99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_hhnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_61_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_61_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         AV115Seleccionar = GXutil.strtobool( GXutil.booltostr( AV115Seleccionar)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV115Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_61_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            cmbLb_Estado.addItem("3", httpContext.getMessage( "Aprobacion Interna", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( AV107F_Cformu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107F_Cformu), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV107F_Cformu), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavF_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteE_Internalname,GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1UL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      /* End function sendrow_612 */
   }

   public void startgridcontrol61( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"61\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cformu", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Opcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV94GrupodeAccionesGrid, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5567Lb_FechaEn, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5568Lb_HoraEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5563Lb_FechaR, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5564Lb_HoraR, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV115Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5566Lb_Estado, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV107F_Cformu, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5536Lb_ColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), ".", "")));
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
      edtavLb_numero_Internalname = "vLB_NUMERO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtncrearopcion_Internalname = "BTNCREAROPCION" ;
      bttBtnrenumeraropciones_Internalname = "BTNRENUMERAROPCIONES" ;
      bttBtnanularnoaceptacion_Internalname = "BTNANULARNOACEPTACION" ;
      bttBtnenvioopciontxp_Internalname = "BTNENVIOOPCIONTXP" ;
      bttBtnliberaropcion_Internalname = "BTNLIBERAROPCION" ;
      bttBtncontrolopciones_Internalname = "BTNCONTROLOPCIONES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      lblTextblocklbrb_Internalname = "TEXTBLOCKLBRB" ;
      edtavLbrb_Internalname = "vLBRB" ;
      divUnnamedtablelbrb_Internalname = "UNNAMEDTABLELBRB" ;
      tblTablemergedactiongroup_grupodeacciones_Internalname = "TABLEMERGEDACTIONGROUP_GRUPODEACCIONES" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID" );
      edtLb_opcion_Internalname = "LB_OPCION" ;
      edtLb_numop_Internalname = "LB_NUMOP" ;
      edtLb_FechaEn_Internalname = "LB_FECHAEN" ;
      edtLb_HoraEn_Internalname = "LB_HORAEN" ;
      edtLb_FechaR_Internalname = "LB_FECHAR" ;
      edtLb_HoraR_Internalname = "LB_HORAR" ;
      edtLb_FecNoa1_Internalname = "LB_FECNOA1" ;
      edtLb_hhnoa1_Internalname = "LB_HHNOA1" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      cmbLb_Estado.setInternalname( "LB_ESTADO" );
      edtCliCod_Internalname = "CLICOD" ;
      edtavF_cformu_Internalname = "vF_CFORMU" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD" ;
      edtLb_ColNom_Internalname = "LB_COLNOM" ;
      edtLb_ColNum_Internalname = "LB_COLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtLb_CosteE_Internalname = "LB_COSTEE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_copiaropcion_Internalname = "DVELOP_CONFIRMPANEL_COPIAROPCION" ;
      tblTabledvelop_confirmpanel_copiaropcion_Internalname = "TABLEDVELOP_CONFIRMPANEL_COPIAROPCION" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_crearopcion_Internalname = "DVELOP_CONFIRMPANEL_CREAROPCION" ;
      tblTabledvelop_confirmpanel_crearopcion_Internalname = "TABLEDVELOP_CONFIRMPANEL_CREAROPCION" ;
      Dvelop_confirmpanel_anularnoaceptacion_Internalname = "DVELOP_CONFIRMPANEL_ANULARNOACEPTACION" ;
      tblTabledvelop_confirmpanel_anularnoaceptacion_Internalname = "TABLEDVELOP_CONFIRMPANEL_ANULARNOACEPTACION" ;
      Dvelop_confirmpanel_envioopciontxp_Internalname = "DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP" ;
      tblTabledvelop_confirmpanel_envioopciontxp_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENVIOOPCIONTXP" ;
      Dvelop_confirmpanel_liberaropcion_Internalname = "DVELOP_CONFIRMPANEL_LIBERAROPCION" ;
      tblTabledvelop_confirmpanel_liberaropcion_Internalname = "TABLEDVELOP_CONFIRMPANEL_LIBERAROPCION" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lb_fechaenauxdate_Internalname = "vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = "DDO_LB_FECHAENAUXDATES" ;
      edtavDdo_lb_horaenauxdate_Internalname = "vDDO_LB_HORAENAUXDATE" ;
      divDdo_lb_horaenauxdates_Internalname = "DDO_LB_HORAENAUXDATES" ;
      edtavDdo_lb_fecharauxdate_Internalname = "vDDO_LB_FECHARAUXDATE" ;
      divDdo_lb_fecharauxdates_Internalname = "DDO_LB_FECHARAUXDATES" ;
      edtavDdo_lb_horarauxdate_Internalname = "vDDO_LB_HORARAUXDATE" ;
      divDdo_lb_horarauxdates_Internalname = "DDO_LB_HORARAUXDATES" ;
      edtavDdo_lb_fecnoa1auxdate_Internalname = "vDDO_LB_FECNOA1AUXDATE" ;
      divDdo_lb_fecnoa1auxdates_Internalname = "DDO_LB_FECNOA1AUXDATES" ;
      edtavDdo_lb_hhnoa1auxdate_Internalname = "vDDO_LB_HHNOA1AUXDATE" ;
      divDdo_lb_hhnoa1auxdates_Internalname = "DDO_LB_HHNOA1AUXDATES" ;
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
      edtLb_CosteE_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtavF_cformu_Jsonclick = "" ;
      edtavF_cformu_Visible = 0 ;
      edtavF_cformu_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      cmbLb_Estado.setJsonclick( "" );
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      edtLb_hhnoa1_Jsonclick = "" ;
      edtLb_FecNoa1_Jsonclick = "" ;
      edtLb_HoraR_Jsonclick = "" ;
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_HoraEn_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_numop_Jsonclick = "" ;
      edtLb_opcion_Jsonclick = "" ;
      cmbavGrupodeaccionesgrid.setJsonclick( "" );
      cmbavGrupodeaccionesgrid.setVisible( -1 );
      cmbavGrupodeaccionesgrid.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavLbrb_Jsonclick = "" ;
      edtavLbrb_Enabled = 1 ;
      bttBtnliberaropcion_Visible = 1 ;
      bttBtnenvioopciontxp_Visible = 1 ;
      bttBtnanularnoaceptacion_Visible = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_hhnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_fecnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_horarauxdate_Jsonclick = "" ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_horaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_numero_Jsonclick = "" ;
      edtavLb_numero_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Envio;Envio;Recepcion;Recepcion;No Aceptacion;No Aceptacion;No Aceptacion;;;;;;;;;" ;
      Dvelop_confirmpanel_liberaropcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_liberaropcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_liberaropcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_liberaropcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_liberaropcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_liberaropcion_Confirmationtext = "¿Confirma la Liberacion?" ;
      Dvelop_confirmpanel_liberaropcion_Title = "" ;
      Dvelop_confirmpanel_envioopciontxp_Confirmtype = "1" ;
      Dvelop_confirmpanel_envioopciontxp_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_envioopciontxp_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_envioopciontxp_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_envioopciontxp_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_envioopciontxp_Confirmationtext = "¿Envio a TXP?" ;
      Dvelop_confirmpanel_envioopciontxp_Title = "" ;
      Dvelop_confirmpanel_anularnoaceptacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_anularnoaceptacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_anularnoaceptacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_anularnoaceptacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_anularnoaceptacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext = "¿Anular Reprovaçao?" ;
      Dvelop_confirmpanel_anularnoaceptacion_Title = "" ;
      Dvelop_confirmpanel_crearopcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_crearopcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_crearopcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_crearopcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_crearopcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_crearopcion_Confirmationtext = "¿Crear Opcion?" ;
      Dvelop_confirmpanel_crearopcion_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Confirma la Eliminacion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_copiaropcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_copiaropcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_copiaropcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_copiaropcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_copiaropcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_copiaropcion_Confirmationtext = "¿Desea copiar la Opcion?" ;
      Dvelop_confirmpanel_copiaropcion_Title = "" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EntradaEnsayoLaboratorio_OpcionesGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||0:Pendiente,1:Enviado,2:Recepcionado,3:Aprobacion Interna" ;
      Ddo_grid_Allowmultipleselection = "||||||||T" ;
      Ddo_grid_Datalisttype = "Dynamic||||||||FixedValues" ;
      Ddo_grid_Includedatalist = "T||||||||T" ;
      Ddo_grid_Filterisrange = "|T|||||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Date|Date|Date|Date|Date|Date|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "1:Lb_opcion|2:Lb_numop|3:Lb_FechaEn|4:Lb_HoraEn|5:Lb_FechaR|6:Lb_HoraR|7:Lb_FecNoa1|8:Lb_hhnoa1|10:Lb_Estado" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ensayos, Opciones", "") );
      chkavSeleccionar.setVisible( -1 );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_61_idx ;
      cmbavGrupodeaccionesgrid.setName( GXCCtl );
      cmbavGrupodeaccionesgrid.setWebtags( "" );
      if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
      {
         AV94GrupodeAccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV94GrupodeAccionesGrid, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94GrupodeAccionesGrid), 4, 0));
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_61_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_61_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      AV115Seleccionar = GXutil.strtobool( GXutil.booltostr( AV115Seleccionar)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV115Seleccionar);
      GXCCtl = "LB_ESTADO_" + sGXsfl_61_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      cmbLb_Estado.addItem("3", httpContext.getMessage( "Aprobacion Interna", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
      {
         A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111UL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241UL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'cmbLb_Estado'},{av:'A5566Lb_Estado',fld:'LB_ESTADO',pic:'9',hsh:true},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV94GrupodeAccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV115Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK","{handler:'e251UL2',iparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV94GrupodeAccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:'',hsh:true},{av:'AV97LbRb',fld:'vLBRB',pic:'ZZZ9.99'},{av:'AV90Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV94GrupodeAccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_copiaropcion_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_COPIAROPCION',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV97LbRb',fld:'vLBRB',pic:'ZZZ9.99'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90Station',fld:'vSTATION',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_COPIAROPCION.CLOSE","{handler:'e121UL2',iparms:[{av:'Dvelop_confirmpanel_copiaropcion_Result',ctrl:'DVELOP_CONFIRMPANEL_COPIAROPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'AV98Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV99Lb_numop',fld:'vLB_NUMOP',pic:'Z9'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_COPIAROPCION.CLOSE",",oparms:[{av:'AV100Opcion_old',fld:'vOPCION_OLD',pic:'@!'},{av:'AV99Lb_numop',fld:'vLB_NUMOP',pic:'Z9'},{av:'AV98Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e131UL2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOCREAROPCION'","{handler:'e261UL1',iparms:[]");
      setEventMetadata("'DOCREAROPCION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREAROPCION.CLOSE","{handler:'e141UL2',iparms:[{av:'Dvelop_confirmpanel_crearopcion_Result',ctrl:'DVELOP_CONFIRMPANEL_CREAROPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV100Opcion_old',fld:'vOPCION_OLD',pic:'@!'},{av:'AV98Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV99Lb_numop',fld:'vLB_NUMOP',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREAROPCION.CLOSE",",oparms:[{av:'AV99Lb_numop',fld:'vLB_NUMOP',pic:'Z9'},{av:'AV98Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV100Opcion_old',fld:'vOPCION_OLD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DORENUMERAROPCIONES'","{handler:'e181UL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DORENUMERAROPCIONES'",",oparms:[{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOANULARNOACEPTACION'","{handler:'e271UL1',iparms:[{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''}]");
      setEventMetadata("'DOANULARNOACEPTACION'",",oparms:[{av:'Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ANULARNOACEPTACION',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANULARNOACEPTACION.CLOSE","{handler:'e151UL2',iparms:[{av:'Dvelop_confirmpanel_anularnoaceptacion_Result',ctrl:'DVELOP_CONFIRMPANEL_ANULARNOACEPTACION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV90Station',fld:'vSTATION',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANULARNOACEPTACION.CLOSE",",oparms:[{av:'AV90Station',fld:'vSTATION',pic:''},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOENVIOOPCIONTXP'","{handler:'e191UL2',iparms:[{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV114Numform',fld:'vNUMFORM',pic:'ZZZ9'}]");
      setEventMetadata("'DOENVIOOPCIONTXP'",",oparms:[{av:'AV114Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_envioopciontxp_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP.CLOSE","{handler:'e161UL2',iparms:[{av:'Dvelop_confirmpanel_envioopciontxp_Result',ctrl:'DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENVIOOPCIONTXP.CLOSE",",oparms:[{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOLIBERAROPCION'","{handler:'e281UL1',iparms:[{av:'cmbLb_Estado'},{av:'A5566Lb_Estado',fld:'LB_ESTADO',pic:'9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'}]");
      setEventMetadata("'DOLIBERAROPCION'",",oparms:[{av:'Dvelop_confirmpanel_liberaropcion_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_LIBERAROPCION',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_LIBERAROPCION.CLOSE","{handler:'e171UL2',iparms:[{av:'Dvelop_confirmpanel_liberaropcion_Result',ctrl:'DVELOP_CONFIRMPANEL_LIBERAROPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_LIBERAROPCION.CLOSE",",oparms:[{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOCONTROLOPCIONES'","{handler:'e201UL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV90Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'DOCONTROLOPCIONES'",",oparms:[{av:'AV90Station',fld:'vSTATION',pic:''},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e211UL2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV107F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV110ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV109Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV105Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV106Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV93moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV102Ens017',fld:'vENS017',pic:'ZZZ9',hsh:true},{av:'AV26TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV27TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV48TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV49TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV28TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV32TFLb_HoraEn',fld:'vTFLB_HORAEN',pic:'99:99'},{av:'AV36TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV40TFLb_HoraR',fld:'vTFLB_HORAR',pic:'99:99'},{av:'AV60TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV74TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV133TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV131WModa21',fld:'vWMODA21',pic:'',hsh:true},{av:'AV104WEns017',fld:'vWENS017',pic:'',hsh:true},{av:'AV136Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV96Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{ctrl:'BTNANULARNOACEPTACION',prop:'Visible'},{ctrl:'BTNENVIOOPCIONTXP',prop:'Visible'},{ctrl:'BTNLIBERAROPCION',prop:'Visible'}]}");
      setEventMetadata("VALIDV_LB_NUMERO","{handler:'validv_Lb_numero',iparms:[]");
      setEventMetadata("VALIDV_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_costee',iparms:[]");
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
      wcpOAV88Emprcod = "" ;
      wcpOAV96Lb_Rb = DecimalUtil.ZERO ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_copiaropcion_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_crearopcion_Result = "" ;
      Dvelop_confirmpanel_anularnoaceptacion_Result = "" ;
      Dvelop_confirmpanel_envioopciontxp_Result = "" ;
      Dvelop_confirmpanel_liberaropcion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV88Emprcod = "" ;
      AV96Lb_Rb = DecimalUtil.ZERO ;
      AV26TFLb_opcion = "" ;
      AV27TFLb_opcion_Sel = "" ;
      AV28TFLb_FechaEn = GXutil.nullDate() ;
      AV32TFLb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV36TFLb_FechaR = GXutil.nullDate() ;
      AV40TFLb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV60TFLb_FecNoa1 = GXutil.nullDate() ;
      AV74TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV133TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV136Pgmname = "" ;
      AV110ForUltUti = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV105Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV106Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV84DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV90Station = "" ;
      AV98Lb_opcion = "" ;
      AV100Opcion_old = "" ;
      AV92UsurCod = "" ;
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
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV30DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV34DDO_Lb_HoraEnAuxDate = GXutil.nullDate() ;
      AV38DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
      AV42DDO_Lb_HoraRAuxDate = GXutil.nullDate() ;
      AV62DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
      AV76DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = "" ;
      AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel = "" ;
      AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen = GXutil.nullDate() ;
      AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen = GXutil.resetTime( GXutil.nullDate() );
      AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar = GXutil.nullDate() ;
      AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar = GXutil.resetTime( GXutil.nullDate() );
      AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 = GXutil.nullDate() ;
      AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      A5555Lb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion = "" ;
      H01UL2_A396EmprCod = new String[] {""} ;
      H01UL2_A5532Lb_numero = new int[1] ;
      H01UL2_A5599Lb_RGB = new long[1] ;
      H01UL2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01UL2_A831TipColCod = new byte[1] ;
      H01UL2_n831TipColCod = new boolean[] {false} ;
      H01UL2_A5537Lb_ColNum = new int[1] ;
      H01UL2_A5536Lb_ColNom = new String[] {""} ;
      H01UL2_A5533Lb_ArtCod = new String[] {""} ;
      H01UL2_A279CliNom = new String[] {""} ;
      H01UL2_A252CliCod = new int[1] ;
      H01UL2_A5566Lb_Estado = new byte[1] ;
      H01UL2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01UL2_A5718Lb_numop = new byte[1] ;
      H01UL2_A5555Lb_opcion = new String[] {""} ;
      H01UL3_AGRID_nRecordCount = new long[1] ;
      AV97LbRb = DecimalUtil.ZERO ;
      hsh = "" ;
      AV91EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV132TFLb_Estado_SelsJson = "" ;
      GXv_int6 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_envioopciontxp = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_copiaropcion = new com.genexus.webpanels.GXUserControl();
      AV149Emprcod_selected = "" ;
      AV151Lb_opcion_selected = "" ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      AV112IN_Lb_opcion = "" ;
      GXv_char2 = new String[1] ;
      AV108Fecha_no = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_int19 = new long[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char16 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_liberaropcion = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_anularnoaceptacion = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_crearopcion = new com.genexus.webpanels.GXUserControl();
      bttBtncrearopcion_Jsonclick = "" ;
      bttBtnrenumeraropciones_Jsonclick = "" ;
      bttBtnanularnoaceptacion_Jsonclick = "" ;
      bttBtnenvioopciontxp_Jsonclick = "" ;
      bttBtnliberaropcion_Jsonclick = "" ;
      bttBtncontrolopciones_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTextblocklbrb_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_opciones__default(),
         new Object[] {
             new Object[] {
            H01UL2_A396EmprCod, H01UL2_A5532Lb_numero, H01UL2_A5599Lb_RGB, H01UL2_A5565Lb_CosteE, H01UL2_A831TipColCod, H01UL2_n831TipColCod, H01UL2_A5537Lb_ColNum, H01UL2_A5536Lb_ColNom, H01UL2_A5533Lb_ArtCod, H01UL2_A279CliNom,
            H01UL2_A252CliCod, H01UL2_A5566Lb_Estado, H01UL2_A10082Lb_hhnoa1, H01UL2_A6461Lb_FecNoa1, H01UL2_A5564Lb_HoraR, H01UL2_A5563Lb_FechaR, H01UL2_A5568Lb_HoraEn, H01UL2_A5567Lb_FechaEn, H01UL2_A5718Lb_numop, H01UL2_A5555Lb_opcion
            }
            , new Object[] {
            H01UL3_AGRID_nRecordCount
            }
         }
      );
      AV136Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Opciones" ;
      /* GeneXus formulas. */
      AV136Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Opciones" ;
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      edtavF_cformu_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV48TFLb_numop ;
   private byte AV49TFLb_numop_To ;
   private byte gxajaxcallmode ;
   private byte AV99Lb_numop ;
   private byte AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop ;
   private byte AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int13[] ;
   private byte GXv_int8[] ;
   private byte GXv_int20[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV107F_Cformu ;
   private short AV93moda21 ;
   private short AV102Ens017 ;
   private short AV114Numform ;
   private short AV128i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV94GrupodeAccionesGrid ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV95RbSimulacion ;
   private int wcpOAV89Lb_numero ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_61 ;
   private int AV89Lb_numero ;
   private int nGXsfl_61_idx=1 ;
   private int AV109Fornumcol ;
   private int A5532Lb_numero ;
   private int edtavLb_numero_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int subGrid_Islastpage ;
   private int edtavF_cformu_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels_size ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int bttBtnanularnoaceptacion_Visible ;
   private int bttBtnenvioopciontxp_Visible ;
   private int bttBtnliberaropcion_Visible ;
   private int AV150Lb_numero_selected ;
   private int GXv_int12[] ;
   private int GXv_int15[] ;
   private int AV152GXV1 ;
   private int edtavLbrb_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavF_cformu_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A5599Lb_RGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int19[] ;
   private java.math.BigDecimal wcpOAV96Lb_Rb ;
   private java.math.BigDecimal AV96Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV97LbRb ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String wcpOAV88Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_copiaropcion_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_crearopcion_Result ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Result ;
   private String Dvelop_confirmpanel_envioopciontxp_Result ;
   private String Dvelop_confirmpanel_liberaropcion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV88Emprcod ;
   private String sGXsfl_61_idx="0001" ;
   private String AV26TFLb_opcion ;
   private String AV27TFLb_opcion_Sel ;
   private String AV136Pgmname ;
   private String Gx_msg ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV90Station ;
   private String AV98Lb_opcion ;
   private String AV100Opcion_old ;
   private String AV92UsurCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_copiaropcion_Title ;
   private String Dvelop_confirmpanel_copiaropcion_Confirmationtext ;
   private String Dvelop_confirmpanel_copiaropcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_copiaropcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_copiaropcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_copiaropcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_copiaropcion_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_crearopcion_Title ;
   private String Dvelop_confirmpanel_crearopcion_Confirmationtext ;
   private String Dvelop_confirmpanel_crearopcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_crearopcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_crearopcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_crearopcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_crearopcion_Confirmtype ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Title ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Confirmationtext ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Confirmtype ;
   private String Dvelop_confirmpanel_envioopciontxp_Title ;
   private String Dvelop_confirmpanel_envioopciontxp_Confirmationtext ;
   private String Dvelop_confirmpanel_envioopciontxp_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciontxp_Nobuttoncaption ;
   private String Dvelop_confirmpanel_envioopciontxp_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_envioopciontxp_Yesbuttonposition ;
   private String Dvelop_confirmpanel_envioopciontxp_Confirmtype ;
   private String Dvelop_confirmpanel_liberaropcion_Title ;
   private String Dvelop_confirmpanel_liberaropcion_Confirmationtext ;
   private String Dvelop_confirmpanel_liberaropcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_liberaropcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_liberaropcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_liberaropcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_liberaropcion_Confirmtype ;
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
   private String edtavLb_numero_Internalname ;
   private String edtavLb_numero_Jsonclick ;
   private String divTablerightheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lb_fechaenauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_lb_fechaenauxdate_Internalname ;
   private String edtavDdo_lb_fechaenauxdate_Jsonclick ;
   private String divDdo_lb_horaenauxdates_Internalname ;
   private String edtavDdo_lb_horaenauxdate_Internalname ;
   private String edtavDdo_lb_horaenauxdate_Jsonclick ;
   private String divDdo_lb_fecharauxdates_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Internalname ;
   private String edtavDdo_lb_fecharauxdate_Jsonclick ;
   private String divDdo_lb_horarauxdates_Internalname ;
   private String edtavDdo_lb_horarauxdate_Internalname ;
   private String edtavDdo_lb_horarauxdate_Jsonclick ;
   private String divDdo_lb_fecnoa1auxdates_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Jsonclick ;
   private String divDdo_lb_hhnoa1auxdates_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ;
   private String AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_numop_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_HoraEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String edtLb_HoraR_Internalname ;
   private String edtLb_FecNoa1_Internalname ;
   private String edtLb_hhnoa1_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtavF_cformu_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String edtLb_CosteE_Internalname ;
   private String edtavLbrb_Internalname ;
   private String scmdbuf ;
   private String lV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ;
   private String hsh ;
   private String AV91EmprNom ;
   private String Dvelop_confirmpanel_envioopciontxp_Internalname ;
   private String bttBtnanularnoaceptacion_Internalname ;
   private String bttBtnenvioopciontxp_Internalname ;
   private String bttBtnliberaropcion_Internalname ;
   private String Dvelop_confirmpanel_copiaropcion_Internalname ;
   private String AV149Emprcod_selected ;
   private String AV151Lb_opcion_selected ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV112IN_Lb_opcion ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char16[] ;
   private String tblTabledvelop_confirmpanel_liberaropcion_Internalname ;
   private String Dvelop_confirmpanel_liberaropcion_Internalname ;
   private String tblTabledvelop_confirmpanel_envioopciontxp_Internalname ;
   private String tblTabledvelop_confirmpanel_anularnoaceptacion_Internalname ;
   private String Dvelop_confirmpanel_anularnoaceptacion_Internalname ;
   private String tblTabledvelop_confirmpanel_crearopcion_Internalname ;
   private String Dvelop_confirmpanel_crearopcion_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_copiaropcion_Internalname ;
   private String tblTablemergedactiongroup_grupodeacciones_Internalname ;
   private String bttBtncrearopcion_Internalname ;
   private String bttBtncrearopcion_Jsonclick ;
   private String bttBtnrenumeraropciones_Internalname ;
   private String bttBtnrenumeraropciones_Jsonclick ;
   private String bttBtnanularnoaceptacion_Jsonclick ;
   private String bttBtnenvioopciontxp_Jsonclick ;
   private String bttBtnliberaropcion_Jsonclick ;
   private String bttBtncontrolopciones_Internalname ;
   private String bttBtncontrolopciones_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtablelbrb_Internalname ;
   private String lblTextblocklbrb_Internalname ;
   private String lblTextblocklbrb_Jsonclick ;
   private String edtavLbrb_Jsonclick ;
   private String sGXsfl_61_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_numop_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_HoraEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtLb_HoraR_Jsonclick ;
   private String edtLb_FecNoa1_Jsonclick ;
   private String edtLb_hhnoa1_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtavF_cformu_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtLb_CosteE_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV32TFLb_HoraEn ;
   private java.util.Date AV40TFLb_HoraR ;
   private java.util.Date AV74TFLb_hhnoa1 ;
   private java.util.Date AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen ;
   private java.util.Date AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar ;
   private java.util.Date AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV28TFLb_FechaEn ;
   private java.util.Date AV36TFLb_FechaR ;
   private java.util.Date AV60TFLb_FecNoa1 ;
   private java.util.Date AV110ForUltUti ;
   private java.util.Date AV30DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV34DDO_Lb_HoraEnAuxDate ;
   private java.util.Date AV38DDO_Lb_FechaRAuxDate ;
   private java.util.Date AV42DDO_Lb_HoraRAuxDate ;
   private java.util.Date AV62DDO_Lb_FecNoa1AuxDate ;
   private java.util.Date AV76DDO_Lb_hhnoa1AuxDate ;
   private java.util.Date AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen ;
   private java.util.Date AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar ;
   private java.util.Date AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV108Fecha_no ;
   private java.util.Date GXv_date14[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_61_Refreshing=false ;
   private boolean AV131WModa21 ;
   private boolean AV104WEns017 ;
   private boolean AV13OrderedDsc ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV115Seleccionar ;
   private boolean n831TipColCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV132TFLb_Estado_SelsJson ;
   private GXSimpleCollection<Byte> AV133TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels ;
   private GXSimpleCollection<Integer> AV105Col_Lb_numero ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_envioopciontxp ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_copiaropcion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_liberaropcion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anularnoaceptacion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_crearopcion ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeaccionesgrid ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbLb_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H01UL2_A396EmprCod ;
   private int[] H01UL2_A5532Lb_numero ;
   private long[] H01UL2_A5599Lb_RGB ;
   private java.math.BigDecimal[] H01UL2_A5565Lb_CosteE ;
   private byte[] H01UL2_A831TipColCod ;
   private boolean[] H01UL2_n831TipColCod ;
   private int[] H01UL2_A5537Lb_ColNum ;
   private String[] H01UL2_A5536Lb_ColNom ;
   private String[] H01UL2_A5533Lb_ArtCod ;
   private String[] H01UL2_A279CliNom ;
   private int[] H01UL2_A252CliCod ;
   private byte[] H01UL2_A5566Lb_Estado ;
   private java.util.Date[] H01UL2_A10082Lb_hhnoa1 ;
   private java.util.Date[] H01UL2_A6461Lb_FecNoa1 ;
   private java.util.Date[] H01UL2_A5564Lb_HoraR ;
   private java.util.Date[] H01UL2_A5563Lb_FechaR ;
   private java.util.Date[] H01UL2_A5568Lb_HoraEn ;
   private java.util.Date[] H01UL2_A5567Lb_FechaEn ;
   private byte[] H01UL2_A5718Lb_numop ;
   private String[] H01UL2_A5555Lb_opcion ;
   private long[] H01UL3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV106Col_Lb_opcion ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV84DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class entradaensayolaboratorio_opciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01UL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels ,
                                          String AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel ,
                                          String AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ,
                                          byte AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop ,
                                          byte AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to ,
                                          java.util.Date AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen ,
                                          java.util.Date AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen ,
                                          java.util.Date AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar ,
                                          java.util.Date AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar ,
                                          java.util.Date AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 ,
                                          java.util.Date AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 ,
                                          int AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels_size ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88Emprcod ,
                                          int AV89Lb_numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[17];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.Lb_numero, T2.Lb_RGB, T1.Lb_CosteE, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ColNom, T2.Lb_ArtCod, T3.CliNom, T2.CliCod, T1.Lb_Estado, T1.Lb_hhnoa1, T1.Lb_FecNoa1," ;
      sSelectString += " T1.Lb_HoraR, T1.Lb_FechaR, T1.Lb_HoraEn, T1.Lb_FechaEn, T1.Lb_numop, T1.Lb_opcion" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (0==AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_HoraEn" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_HoraEn DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_HoraR" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_HoraR DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FecNoa1" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FecNoa1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_hhnoa1" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_hhnoa1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H01UL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels ,
                                          String AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel ,
                                          String AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion ,
                                          byte AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop ,
                                          byte AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to ,
                                          java.util.Date AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen ,
                                          java.util.Date AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen ,
                                          java.util.Date AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar ,
                                          java.util.Date AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar ,
                                          java.util.Date AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1 ,
                                          java.util.Date AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1 ,
                                          int AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels_size ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88Emprcod ,
                                          int AV89Lb_numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[12];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV137Gestionlaboratorio_entradaensayolaboratorio_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Gestionlaboratorio_entradaensayolaboratorio_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV139Gestionlaboratorio_entradaensayolaboratorio_opcionesds_3_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV140Gestionlaboratorio_entradaensayolaboratorio_opcionesds_4_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Gestionlaboratorio_entradaensayolaboratorio_opcionesds_5_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV142Gestionlaboratorio_entradaensayolaboratorio_opcionesds_6_tflb_horaen) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Gestionlaboratorio_entradaensayolaboratorio_opcionesds_7_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV144Gestionlaboratorio_entradaensayolaboratorio_opcionesds_8_tflb_horar) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Gestionlaboratorio_entradaensayolaboratorio_opcionesds_9_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV146Gestionlaboratorio_entradaensayolaboratorio_opcionesds_10_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV147Gestionlaboratorio_entradaensayolaboratorio_opcionesds_11_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H01UL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
            case 1 :
                  return conditional_H01UL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01UL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(12));
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
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
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], true);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[21], true);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               return;
      }
   }

}

