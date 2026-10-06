package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_lineas_wp_impl extends GXDataArea
{
   public tproces_lineas_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproces_lineas_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_lineas_wp_impl.class ));
   }

   public tproces_lineas_wp_impl( int remoteHandle ,
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
            AV51Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Emprcod", AV51Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV52ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52ProCod", AV52ProCod);
               AV53ProDsc = httpContext.GetPar( "ProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53ProDsc", AV53ProDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53ProDsc, ""))));
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
      AV51Emprcod = httpContext.GetPar( "Emprcod") ;
      AV52ProCod = httpContext.GetPar( "ProCod") ;
      AV15TFProNumLin = (short)(GXutil.lval( httpContext.GetPar( "TFProNumLin"))) ;
      AV16TFProNumLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFProNumLin_To"))) ;
      AV17TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV18TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV19TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV20TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV21TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV22TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV23TFFasDec = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec"), ".") ;
      AV24TFFasDec_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasDec_To"), ".") ;
      AV25TFFasPreSal = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal"))) ;
      AV26TFFasPreSal_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPreSal_To"))) ;
      AV27TFFasPrePie = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie"))) ;
      AV28TFFasPrePie_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasPrePie_To"))) ;
      AV29TFFasVelPro = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro"), ".") ;
      AV30TFFasVelPro_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasVelPro_To"), ".") ;
      AV31TFFasNumPas = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas"))) ;
      AV32TFFasNumPas_To = (short)(GXutil.lval( httpContext.GetPar( "TFFasNumPas_To"))) ;
      AV33TFFasActTin = httpContext.GetPar( "TFFasActTin") ;
      AV34TFFasActTin_Sel = httpContext.GetPar( "TFFasActTin_Sel") ;
      AV35TFFasCon = httpContext.GetPar( "TFFasCon") ;
      AV36TFFasCon_Sel = httpContext.GetPar( "TFFasCon_Sel") ;
      AV37TFFasAcab = httpContext.GetPar( "TFFasAcab") ;
      AV38TFFasAcab_Sel = httpContext.GetPar( "TFFasAcab_Sel") ;
      AV39TFFasForMul = httpContext.GetPar( "TFFasForMul") ;
      AV40TFFasForMul_Sel = httpContext.GetPar( "TFFasForMul_Sel") ;
      AV41TFFasConPla = httpContext.GetPar( "TFFasConPla") ;
      AV42TFFasConPla_Sel = httpContext.GetPar( "TFFasConPla_Sel") ;
      AV60Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV53ProDsc = httpContext.GetPar( "ProDsc") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
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
      pa2682( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2682( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tproces_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV51Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV52ProCod)),GXutil.URLEncode(GXutil.rtrim(AV53ProDsc))}, new String[] {"Emprcod","ProCod","ProDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53ProDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TProces_Lineas_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tproces_lineas_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV49FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV49FasCod_Data);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV51Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRONUMLIN", GXutil.ltrim( localUtil.ntoc( AV15TFProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRONUMLIN_TO", GXutil.ltrim( localUtil.ntoc( AV16TFProNumLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV17TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV18TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV19TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV20TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV21TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV22TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC", GXutil.ltrim( localUtil.ntoc( AV23TFFasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDEC_TO", GXutil.ltrim( localUtil.ntoc( AV24TFFasDec_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL", GXutil.ltrim( localUtil.ntoc( AV25TFFasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPRESAL_TO", GXutil.ltrim( localUtil.ntoc( AV26TFFasPreSal_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE", GXutil.ltrim( localUtil.ntoc( AV27TFFasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASPREPIE_TO", GXutil.ltrim( localUtil.ntoc( AV28TFFasPrePie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO", GXutil.ltrim( localUtil.ntoc( AV29TFFasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASVELPRO_TO", GXutil.ltrim( localUtil.ntoc( AV30TFFasVelPro_To, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS", GXutil.ltrim( localUtil.ntoc( AV31TFFasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASNUMPAS_TO", GXutil.ltrim( localUtil.ntoc( AV32TFFasNumPas_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN", GXutil.rtrim( AV33TFFasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACTTIN_SEL", GXutil.rtrim( AV34TFFasActTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON", GXutil.rtrim( AV35TFFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCON_SEL", GXutil.rtrim( AV36TFFasCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB", GXutil.rtrim( AV37TFFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASACAB_SEL", GXutil.rtrim( AV38TFFasAcab_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL", GXutil.rtrim( AV39TFFasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASFORMUL_SEL", GXutil.rtrim( AV40TFFasForMul_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCONPLA", GXutil.rtrim( AV41TFFasConPla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCONPLA_SEL", GXutil.rtrim( AV42TFFasConPla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV57UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV55Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
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
         we2682( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2682( ) ;
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
      return formatLink("app.ficherosbasicos.tproces_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV51Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV52ProCod)),GXutil.URLEncode(GXutil.rtrim(AV53ProDsc))}, new String[] {"Emprcod","ProCod","ProDsc"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TProces_Lineas_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Lineas (Proceso)", "") ;
   }

   public void wb2680( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProcod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProcod_Internalname, GXutil.rtrim( AV52ProCod), GXutil.rtrim( localUtil.format( AV52ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProdsc_Internalname, GXutil.rtrim( AV53ProDsc), GXutil.rtrim( localUtil.format( AV53ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPronumlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPronumlin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPronumlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV54ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPronumlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54ProNumLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV54ProNumLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPronumlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPronumlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV49FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV48FasCod), GXutil.rtrim( localUtil.format( AV48FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavFascod_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV43DDO_TitleSettingsIcons);
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

   public void start2682( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Lineas (Proceso)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2680( ) ;
   }

   public void ws2682( )
   {
      start2682( ) ;
      evt2682( ) ;
   }

   public void evt2682( )
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
                           e112682 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122682 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132682 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e142682 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152682 ();
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
                           AV47GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
                           A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           n602MaqCod = false ;
                           A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
                           n459FasDec = false ;
                           A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n469FasPreSal = false ;
                           A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n468FasPrePie = false ;
                           A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
                           n472FasVelPro = false ;
                           A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n464FasNumPas = false ;
                           A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
                           n456FasActTin = false ;
                           A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
                           n458FasCon = false ;
                           A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
                           n4903FasAcab = false ;
                           A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
                           n4286FasForMul = false ;
                           A4299FasConPla = GXutil.upper( httpContext.cgiGet( edtFasConPla_Internalname)) ;
                           n4299FasConPla = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e162682 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172682 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182682 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192682 ();
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

   public void we2682( )
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

   public void pa2682( )
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
            GX_FocusControl = edtavPronumlin_Internalname ;
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
                                 String AV51Emprcod ,
                                 String AV52ProCod ,
                                 short AV15TFProNumLin ,
                                 short AV16TFProNumLin_To ,
                                 String AV17TFFasCod ,
                                 String AV18TFFasCod_Sel ,
                                 String AV19TFFasDsc ,
                                 String AV20TFFasDsc_Sel ,
                                 String AV21TFMaqCod ,
                                 String AV22TFMaqCod_Sel ,
                                 java.math.BigDecimal AV23TFFasDec ,
                                 java.math.BigDecimal AV24TFFasDec_To ,
                                 short AV25TFFasPreSal ,
                                 short AV26TFFasPreSal_To ,
                                 short AV27TFFasPrePie ,
                                 short AV28TFFasPrePie_To ,
                                 java.math.BigDecimal AV29TFFasVelPro ,
                                 java.math.BigDecimal AV30TFFasVelPro_To ,
                                 short AV31TFFasNumPas ,
                                 short AV32TFFasNumPas_To ,
                                 String AV33TFFasActTin ,
                                 String AV34TFFasActTin_Sel ,
                                 String AV35TFFasCon ,
                                 String AV36TFFasCon_Sel ,
                                 String AV37TFFasAcab ,
                                 String AV38TFFasAcab_Sel ,
                                 String AV39TFFasForMul ,
                                 String AV40TFFasForMul_Sel ,
                                 String AV41TFFasConPla ,
                                 String AV42TFFasConPla_Sel ,
                                 String AV60Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV53ProDsc ,
                                 String A758ProCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172682 ();
      GRID_nCurrentRecord = 0 ;
      rf2682( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TProces_Lineas_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tproces_lineas_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRONUMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMLIN", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), ".", "")));
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
      rf2682( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV60Pgmname = "FicherosBasicos.TProces_Lineas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2682( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      /* Execute user event: Refresh */
      e172682 ();
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
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
         subsflControlProps_622( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                              Short.valueOf(AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                              AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                              AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                              AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                              AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                              AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                              AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                              AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                              AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                              Short.valueOf(AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                              Short.valueOf(AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                              Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                              Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                              AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                              AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                              Short.valueOf(AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                              Short.valueOf(AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                              AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                              AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                              AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                              AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                              AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                              AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                              AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                              AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                              AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                              AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                              Short.valueOf(A774ProNumLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A602MaqCod ,
                                              A459FasDec ,
                                              Short.valueOf(A469FasPreSal) ,
                                              Short.valueOf(A468FasPrePie) ,
                                              A472FasVelPro ,
                                              Short.valueOf(A464FasNumPas) ,
                                              A456FasActTin ,
                                              A458FasCon ,
                                              A4903FasAcab ,
                                              A4286FasForMul ,
                                              A4299FasConPla ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV51Emprcod ,
                                              AV52ProCod ,
                                              A396EmprCod ,
                                              A758ProCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
         lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
         lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
         lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
         lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
         lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
         lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
         lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
         /* Using cursor H02682 */
         pr_default.execute(0, new Object[] {AV51Emprcod, AV52ProCod, Short.valueOf(AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_62_idx = 1 ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02682_A396EmprCod[0] ;
            A758ProCod = H02682_A758ProCod[0] ;
            A4299FasConPla = H02682_A4299FasConPla[0] ;
            n4299FasConPla = H02682_n4299FasConPla[0] ;
            A4286FasForMul = H02682_A4286FasForMul[0] ;
            n4286FasForMul = H02682_n4286FasForMul[0] ;
            A4903FasAcab = H02682_A4903FasAcab[0] ;
            n4903FasAcab = H02682_n4903FasAcab[0] ;
            A458FasCon = H02682_A458FasCon[0] ;
            n458FasCon = H02682_n458FasCon[0] ;
            A456FasActTin = H02682_A456FasActTin[0] ;
            n456FasActTin = H02682_n456FasActTin[0] ;
            A464FasNumPas = H02682_A464FasNumPas[0] ;
            n464FasNumPas = H02682_n464FasNumPas[0] ;
            A472FasVelPro = H02682_A472FasVelPro[0] ;
            n472FasVelPro = H02682_n472FasVelPro[0] ;
            A468FasPrePie = H02682_A468FasPrePie[0] ;
            n468FasPrePie = H02682_n468FasPrePie[0] ;
            A469FasPreSal = H02682_A469FasPreSal[0] ;
            n469FasPreSal = H02682_n469FasPreSal[0] ;
            A459FasDec = H02682_A459FasDec[0] ;
            n459FasDec = H02682_n459FasDec[0] ;
            A602MaqCod = H02682_A602MaqCod[0] ;
            n602MaqCod = H02682_n602MaqCod[0] ;
            A460FasDsc = H02682_A460FasDsc[0] ;
            A457FasCod = H02682_A457FasCod[0] ;
            A774ProNumLin = H02682_A774ProNumLin[0] ;
            A4299FasConPla = H02682_A4299FasConPla[0] ;
            n4299FasConPla = H02682_n4299FasConPla[0] ;
            A4286FasForMul = H02682_A4286FasForMul[0] ;
            n4286FasForMul = H02682_n4286FasForMul[0] ;
            A4903FasAcab = H02682_A4903FasAcab[0] ;
            n4903FasAcab = H02682_n4903FasAcab[0] ;
            A458FasCon = H02682_A458FasCon[0] ;
            n458FasCon = H02682_n458FasCon[0] ;
            A456FasActTin = H02682_A456FasActTin[0] ;
            n456FasActTin = H02682_n456FasActTin[0] ;
            A464FasNumPas = H02682_A464FasNumPas[0] ;
            n464FasNumPas = H02682_n464FasNumPas[0] ;
            A472FasVelPro = H02682_A472FasVelPro[0] ;
            n472FasVelPro = H02682_n472FasVelPro[0] ;
            A468FasPrePie = H02682_A468FasPrePie[0] ;
            n468FasPrePie = H02682_n468FasPrePie[0] ;
            A469FasPreSal = H02682_A469FasPreSal[0] ;
            n469FasPreSal = H02682_n469FasPreSal[0] ;
            A459FasDec = H02682_A459FasDec[0] ;
            n459FasDec = H02682_n459FasDec[0] ;
            A602MaqCod = H02682_A602MaqCod[0] ;
            n602MaqCod = H02682_n602MaqCod[0] ;
            A460FasDsc = H02682_A460FasDsc[0] ;
            e182682 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(62) ;
         wb2680( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2682( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRONUMLIN"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9")));
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
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) ,
                                           Short.valueOf(AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) ,
                                           AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                           AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                           AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                           AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                           AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                           AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                           AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                           AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                           Short.valueOf(AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) ,
                                           Short.valueOf(AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) ,
                                           Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) ,
                                           Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) ,
                                           AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                           AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                           Short.valueOf(AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) ,
                                           Short.valueOf(AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) ,
                                           AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                           AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                           AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                           AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                           AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                           AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                           AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                           AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                           AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                           AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A602MaqCod ,
                                           A459FasDec ,
                                           Short.valueOf(A469FasPreSal) ,
                                           Short.valueOf(A468FasPrePie) ,
                                           A472FasVelPro ,
                                           Short.valueOf(A464FasNumPas) ,
                                           A456FasActTin ,
                                           A458FasCon ,
                                           A4903FasAcab ,
                                           A4286FasForMul ,
                                           A4299FasConPla ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV51Emprcod ,
                                           AV52ProCod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod), 8, "%") ;
      lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc), 28, "%") ;
      lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod), 6, "%") ;
      lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin), 1, "%") ;
      lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon), 1, "%") ;
      lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = GXutil.padr( GXutil.rtrim( AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab), 1, "%") ;
      lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = GXutil.padr( GXutil.rtrim( AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul), 1, "%") ;
      lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = GXutil.padr( GXutil.rtrim( AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla), 1, "%") ;
      /* Using cursor H02683 */
      pr_default.execute(1, new Object[] {AV51Emprcod, AV52ProCod, Short.valueOf(AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin), Short.valueOf(AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to), lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod, AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel, lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc, AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel, lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod, AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel, AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec, AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to, Short.valueOf(AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal), Short.valueOf(AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to), Short.valueOf(AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie), Short.valueOf(AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to), AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro, AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to, Short.valueOf(AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas), Short.valueOf(AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to), lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin, AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel, lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon, AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel, lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab, AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel, lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul, AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel, lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla, AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel});
      GRID_nRecordCount = H02683_AGRID_nRecordCount[0] ;
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
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51Emprcod, AV52ProCod, AV15TFProNumLin, AV16TFProNumLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCod, AV22TFMaqCod_Sel, AV23TFFasDec, AV24TFFasDec_To, AV25TFFasPreSal, AV26TFFasPreSal_To, AV27TFFasPrePie, AV28TFFasPrePie_To, AV29TFFasVelPro, AV30TFFasVelPro_To, AV31TFFasNumPas, AV32TFFasNumPas_To, AV33TFFasActTin, AV34TFFasActTin_Sel, AV35TFFasCon, AV36TFFasCon_Sel, AV37TFFasAcab, AV38TFFasAcab_Sel, AV39TFFasForMul, AV40TFFasForMul_Sel, AV41TFFasConPla, AV42TFFasConPla_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53ProDsc, A758ProCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV60Pgmname = "FicherosBasicos.TProces_Lineas_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcod_Enabled), 5, 0), true);
      edtavProdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2680( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162682 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV49FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV43DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPronumlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPronumlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRONUMLIN");
            GX_FocusControl = edtavPronumlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54ProNumLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54ProNumLin), 4, 0));
         }
         else
         {
            AV54ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavPronumlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54ProNumLin), 4, 0));
         }
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         AV48FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48FasCod", AV48FasCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TProces_Lineas_WP");
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ficherosbasicos\\tproces_lineas_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e162682 ();
      if (returnInSub) return;
   }

   public void e162682( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV55Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tproces_lineas_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Station", AV55Station);
      GXv_char2[0] = AV51Emprcod ;
      GXv_char3[0] = AV56EmprNom ;
      GXv_char4[0] = AV57UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproces_lineas_wp_impl.this.AV51Emprcod = GXv_char2[0] ;
      tproces_lineas_wp_impl.this.AV56EmprNom = GXv_char3[0] ;
      tproces_lineas_wp_impl.this.AV57UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Emprcod", AV51Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV57UsurCod", AV57UsurCod);
      edtavFascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Lineas (Proceso)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV43DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV43DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e172682( )
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
      S152 ();
      if (returnInSub) return;
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      AV46GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridPageCount), 10, 0));
      GXt_int8 = AV54ProNumLin ;
      GXv_int9[0] = GXt_int8 ;
      new app.ficherosbasicos.tproces_prxid(remoteHandle, context).execute( AV51Emprcod, AV52ProCod, GXv_int9) ;
      tproces_lineas_wp_impl.this.GXt_int8 = GXv_int9[0] ;
      AV54ProNumLin = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54ProNumLin), 4, 0));
      AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin = AV15TFProNumLin ;
      AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to = AV16TFProNumLin_To ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = AV17TFFasCod ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = AV18TFFasCod_Sel ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = AV19TFFasDsc ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = AV21TFMaqCod ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = AV22TFMaqCod_Sel ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = AV23TFFasDec ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = AV24TFFasDec_To ;
      AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal = AV25TFFasPreSal ;
      AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to = AV26TFFasPreSal_To ;
      AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie = AV27TFFasPrePie ;
      AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to = AV28TFFasPrePie_To ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = AV29TFFasVelPro ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = AV30TFFasVelPro_To ;
      AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas = AV31TFFasNumPas ;
      AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to = AV32TFFasNumPas_To ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = AV33TFFasActTin ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = AV34TFFasActTin_Sel ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = AV35TFFasCon ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = AV36TFFasCon_Sel ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = AV37TFFasAcab ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = AV38TFFasAcab_Sel ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = AV39TFFasForMul ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = AV40TFFasForMul_Sel ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = AV41TFFasConPla ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = AV42TFFasConPla_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112682( )
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

   public void e122682( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132682( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProNumLin") == 0 )
         {
            AV15TFProNumLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFProNumLin), 4, 0));
            AV16TFProNumLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFProNumLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFProNumLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV17TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFFasCod", AV17TFFasCod);
            AV18TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFFasCod_Sel", AV18TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV19TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFFasDsc", AV19TFFasDsc);
            AV20TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFFasDsc_Sel", AV20TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV21TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFMaqCod", AV21TFMaqCod);
            AV22TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFMaqCod_Sel", AV22TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDec") == 0 )
         {
            AV23TFFasDec = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFFasDec", GXutil.ltrimstr( AV23TFFasDec, 5, 1));
            AV24TFFasDec_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFFasDec_To", GXutil.ltrimstr( AV24TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPreSal") == 0 )
         {
            AV25TFFasPreSal = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFFasPreSal), 4, 0));
            AV26TFFasPreSal_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasPrePie") == 0 )
         {
            AV27TFFasPrePie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFFasPrePie), 4, 0));
            AV28TFFasPrePie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasVelPro") == 0 )
         {
            AV29TFFasVelPro = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFasVelPro", GXutil.ltrimstr( AV29TFFasVelPro, 5, 1));
            AV30TFFasVelPro_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFasVelPro_To", GXutil.ltrimstr( AV30TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasNumPas") == 0 )
         {
            AV31TFFasNumPas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFFasNumPas), 3, 0));
            AV32TFFasNumPas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasActTin") == 0 )
         {
            AV33TFFasActTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFasActTin", AV33TFFasActTin);
            AV34TFFasActTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasActTin_Sel", AV34TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCon") == 0 )
         {
            AV35TFFasCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasCon", AV35TFFasCon);
            AV36TFFasCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasCon_Sel", AV36TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasAcab") == 0 )
         {
            AV37TFFasAcab = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFFasAcab", AV37TFFasAcab);
            AV38TFFasAcab_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFasAcab_Sel", AV38TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasForMul") == 0 )
         {
            AV39TFFasForMul = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFasForMul", AV39TFFasForMul);
            AV40TFFasForMul_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFasForMul_Sel", AV40TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasConPla") == 0 )
         {
            AV41TFFasConPla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFasConPla", AV41TFFasConPla);
            AV42TFFasConPla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasConPla_Sel", AV42TFFasConPla_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e182682( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Renumerar Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV47GridActions, 4, 0)) );
   }

   public void e192682( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV47GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV47GridActions == 2 )
      {
         /* Execute user subroutine: 'DO RENUMERAR' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV47GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S182 ();
         if (returnInSub) return;
      }
      AV47GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV47GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142682( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV48FasCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase NO Valida", ""));
         GX_FocusControl = edtavFascod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV54ProNumLin) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Linea NO Valido", ""));
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_int9[0] = AV54ProNumLin ;
            GXv_char4[0] = AV48FasCod ;
            new app.ficherosbasicos.tproces_lineas_ins(remoteHandle, context).execute( AV51Emprcod, AV52ProCod, GXv_int9, GXv_char4) ;
            tproces_lineas_wp_impl.this.AV54ProNumLin = GXv_int9[0] ;
            tproces_lineas_wp_impl.this.AV48FasCod = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54ProNumLin), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV48FasCod", AV48FasCod);
            AV48FasCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48FasCod", AV48FasCod);
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152682( )
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

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ficherosbasicos.tproces_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A774ProNumLin,4,0))}, new String[] {"Mode","EmprCod","ProCod","ProNumLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO RENUMERAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV51Emprcod ;
      GXv_char3[0] = AV52ProCod ;
      GXv_char2[0] = AV57UsurCod ;
      GXv_char10[0] = AV55Station ;
      new app.prenprd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char10) ;
      tproces_lineas_wp_impl.this.AV51Emprcod = GXv_char4[0] ;
      tproces_lineas_wp_impl.this.AV52ProCod = GXv_char3[0] ;
      tproces_lineas_wp_impl.this.AV57UsurCod = GXv_char2[0] ;
      tproces_lineas_wp_impl.this.AV55Station = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Emprcod", AV51Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52ProCod", AV52ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV57UsurCod", AV57UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV55Station", AV55Station);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ficherosbasicos.tproces_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A774ProNumLin,4,0))}, new String[] {"Mode","EmprCod","ProCod","ProNumLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV60Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV60Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV60Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV15TFProNumLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFProNumLin), 4, 0));
            AV16TFProNumLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFProNumLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFProNumLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV17TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFFasCod", AV17TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV18TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFFasCod_Sel", AV18TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV19TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFFasDsc", AV19TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV20TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFFasDsc_Sel", AV20TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV21TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFMaqCod", AV21TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV22TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFMaqCod_Sel", AV22TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDEC") == 0 )
         {
            AV23TFFasDec = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFFasDec", GXutil.ltrimstr( AV23TFFasDec, 5, 1));
            AV24TFFasDec_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFFasDec_To", GXutil.ltrimstr( AV24TFFasDec_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPRESAL") == 0 )
         {
            AV25TFFasPreSal = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFFasPreSal), 4, 0));
            AV26TFFasPreSal_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasPreSal_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFFasPreSal_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREPIE") == 0 )
         {
            AV27TFFasPrePie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFFasPrePie), 4, 0));
            AV28TFFasPrePie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasPrePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFFasPrePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASVELPRO") == 0 )
         {
            AV29TFFasVelPro = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFasVelPro", GXutil.ltrimstr( AV29TFFasVelPro, 5, 1));
            AV30TFFasVelPro_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFFasVelPro_To", GXutil.ltrimstr( AV30TFFasVelPro_To, 5, 1));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASNUMPAS") == 0 )
         {
            AV31TFFasNumPas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFFasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFFasNumPas), 3, 0));
            AV32TFFasNumPas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFFasNumPas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFFasNumPas_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN") == 0 )
         {
            AV33TFFasActTin = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFFasActTin", AV33TFFasActTin);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACTTIN_SEL") == 0 )
         {
            AV34TFFasActTin_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasActTin_Sel", AV34TFFasActTin_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON") == 0 )
         {
            AV35TFFasCon = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasCon", AV35TFFasCon);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCON_SEL") == 0 )
         {
            AV36TFFasCon_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasCon_Sel", AV36TFFasCon_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB") == 0 )
         {
            AV37TFFasAcab = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFFasAcab", AV37TFFasAcab);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASACAB_SEL") == 0 )
         {
            AV38TFFasAcab_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFasAcab_Sel", AV38TFFasAcab_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV39TFFasForMul = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFasForMul", AV39TFFasForMul);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV40TFFasForMul_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFasForMul_Sel", AV40TFFasForMul_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA") == 0 )
         {
            AV41TFFasConPla = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFasConPla", AV41TFFasConPla);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCONPLA_SEL") == 0 )
         {
            AV42TFFasConPla_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasConPla_Sel", AV42TFFasConPla_Sel);
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char10[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFFasCod_Sel)==0), AV18TFFasCod_Sel, GXv_char10) ;
      tproces_lineas_wp_impl.this.GXt_char1 = GXv_char10[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFFasDsc_Sel)==0), AV20TFFasDsc_Sel, GXv_char4) ;
      tproces_lineas_wp_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFMaqCod_Sel)==0), AV22TFMaqCod_Sel, GXv_char3) ;
      tproces_lineas_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFFasActTin_Sel)==0), AV34TFFasActTin_Sel, GXv_char2) ;
      tproces_lineas_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFFasCon_Sel)==0), AV36TFFasCon_Sel, GXv_char15) ;
      tproces_lineas_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFFasAcab_Sel)==0), AV38TFFasAcab_Sel, GXv_char17) ;
      tproces_lineas_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFFasForMul_Sel)==0), AV40TFFasForMul_Sel, GXv_char19) ;
      tproces_lineas_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFFasConPla_Sel)==0), AV42TFFasConPla_Sel, GXv_char21) ;
      tproces_lineas_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char11+"|"+GXt_char12+"||||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFFasCod)==0), AV17TFFasCod, GXv_char21) ;
      tproces_lineas_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFFasDsc)==0), AV19TFFasDsc, GXv_char19) ;
      tproces_lineas_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFMaqCod)==0), AV21TFMaqCod, GXv_char17) ;
      tproces_lineas_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFFasActTin)==0), AV33TFFasActTin, GXv_char15) ;
      tproces_lineas_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char10[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFFasCon)==0), AV35TFFasCon, GXv_char10) ;
      tproces_lineas_wp_impl.this.GXt_char13 = GXv_char10[0] ;
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFFasAcab)==0), AV37TFFasAcab, GXv_char4) ;
      tproces_lineas_wp_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFFasForMul)==0), AV39TFFasForMul, GXv_char3) ;
      tproces_lineas_wp_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFFasConPla)==0), AV41TFFasConPla, GXv_char2) ;
      tproces_lineas_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFProNumLin) ? "" : GXutil.str( AV15TFProNumLin, 4, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFFasDec)==0) ? "" : GXutil.str( AV23TFFasDec, 5, 1))+"|"+((0==AV25TFFasPreSal) ? "" : GXutil.str( AV25TFFasPreSal, 4, 0))+"|"+((0==AV27TFFasPrePie) ? "" : GXutil.str( AV27TFFasPrePie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFFasVelPro)==0) ? "" : GXutil.str( AV29TFFasVelPro, 5, 1))+"|"+((0==AV31TFFasNumPas) ? "" : GXutil.str( AV31TFFasNumPas, 3, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char11+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFProNumLin_To) ? "" : GXutil.str( AV16TFProNumLin_To, 4, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFFasDec_To)==0) ? "" : GXutil.str( AV24TFFasDec_To, 5, 1))+"|"+((0==AV26TFFasPreSal_To) ? "" : GXutil.str( AV26TFFasPreSal_To, 4, 0))+"|"+((0==AV28TFFasPrePie_To) ? "" : GXutil.str( AV28TFFasPrePie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasVelPro_To)==0) ? "" : GXutil.str( AV30TFFasVelPro_To, 5, 1))+"|"+((0==AV32TFFasNumPas_To) ? "" : GXutil.str( AV32TFFasNumPas_To, 3, 0))+"|||||" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV60Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRONUMLIN", "", !((0==AV15TFProNumLin)&&(0==AV16TFProNumLin_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFProNumLin, 4, 0)), GXutil.trim( GXutil.str( AV16TFProNumLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASCOD", "", !(GXutil.strcmp("", AV17TFFasCod)==0), (short)(0), AV17TFFasCod, "", !(GXutil.strcmp("", AV18TFFasCod_Sel)==0), AV18TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASDSC", "", !(GXutil.strcmp("", AV19TFFasDsc)==0), (short)(0), AV19TFFasDsc, "", !(GXutil.strcmp("", AV20TFFasDsc_Sel)==0), AV20TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFMAQCOD", "", !(GXutil.strcmp("", AV21TFMaqCod)==0), (short)(0), AV21TFMaqCod, "", !(GXutil.strcmp("", AV22TFMaqCod_Sel)==0), AV22TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASDEC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFFasDec)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFFasDec_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFFasDec, 5, 1)), GXutil.trim( GXutil.str( AV24TFFasDec_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASPRESAL", "", !((0==AV25TFFasPreSal)&&(0==AV26TFFasPreSal_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFFasPreSal, 4, 0)), GXutil.trim( GXutil.str( AV26TFFasPreSal_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASPREPIE", "", !((0==AV27TFFasPrePie)&&(0==AV28TFFasPrePie_To)), (short)(0), GXutil.trim( GXutil.str( AV27TFFasPrePie, 4, 0)), GXutil.trim( GXutil.str( AV28TFFasPrePie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASVELPRO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFFasVelPro)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasVelPro_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV29TFFasVelPro, 5, 1)), GXutil.trim( GXutil.str( AV30TFFasVelPro_To, 5, 1))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASNUMPAS", "", !((0==AV31TFFasNumPas)&&(0==AV32TFFasNumPas_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFFasNumPas, 3, 0)), GXutil.trim( GXutil.str( AV32TFFasNumPas_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASACTTIN", "", !(GXutil.strcmp("", AV33TFFasActTin)==0), (short)(0), AV33TFFasActTin, "", !(GXutil.strcmp("", AV34TFFasActTin_Sel)==0), AV34TFFasActTin_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASCON", "", !(GXutil.strcmp("", AV35TFFasCon)==0), (short)(0), AV35TFFasCon, "", !(GXutil.strcmp("", AV36TFFasCon_Sel)==0), AV36TFFasCon_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASACAB", "", !(GXutil.strcmp("", AV37TFFasAcab)==0), (short)(0), AV37TFFasAcab, "", !(GXutil.strcmp("", AV38TFFasAcab_Sel)==0), AV38TFFasAcab_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASFORMUL", "", !(GXutil.strcmp("", AV39TFFasForMul)==0), (short)(0), AV39TFFasForMul, "", !(GXutil.strcmp("", AV40TFFasForMul_Sel)==0), AV40TFFasForMul_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASCONPLA", "", !(GXutil.strcmp("", AV41TFFasConPla)==0), (short)(0), AV41TFFasConPla, "", !(GXutil.strcmp("", AV42TFFasConPla_Sel)==0), AV42TFFasConPla_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV51Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV51Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV52ProCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV52ProCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV53ProDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRODSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53ProDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV60Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FicherosBasicos.TProces_Lineas_TRN" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02684 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14042FasActiva = H02684_A14042FasActiva[0] ;
         A396EmprCod = H02684_A396EmprCod[0] ;
         A13781FasCDsc = H02684_A13781FasCDsc[0] ;
         A457FasCod = H02684_A457FasCod[0] ;
         A460FasDsc = H02684_A460FasDsc[0] ;
         AV50Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV50Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV50Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV49FasCod_Data.add(AV50Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_fascod_Selectedvalue_set = AV48FasCod ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV51Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Emprcod", AV51Emprcod);
      AV52ProCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ProCod", AV52ProCod);
      AV53ProDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ProDsc", AV53ProDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53ProDsc, ""))));
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
      pa2682( ) ;
      ws2682( ) ;
      we2682( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145461", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tproces_lineas_wp.js", "?202682116145461", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_622( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_62_idx );
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_62_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_62_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_62_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_62_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_62_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_62_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_62_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_62_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_62_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_62_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_62_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_62_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_62_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_62_fel_idx );
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_62_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_62_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_62_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_62_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_62_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_62_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_62_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_62_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_62_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_62_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_62_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_62_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_62_fel_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb2680( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
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
               AV47GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV47GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV47GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_62_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV47GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProNumLin_Internalname,GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProNumLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A459FasDec, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A472FasVelPro, "ZZ9.9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasConPla_Internalname,GXutil.rtrim( A4299FasConPla),GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasConPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2682( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Decalage", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tppys", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tpp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vel.(mts/m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pases", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV47GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4299FasConPla));
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
      edtavProcod_Internalname = "vPROCOD" ;
      edtavProdsc_Internalname = "vPRODSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavPronumlin_Internalname = "vPRONUMLIN" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtProNumLin_Internalname = "PRONUMLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasConPla_Internalname = "FASCONPLA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavFascod_Internalname = "vFASCOD" ;
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
      edtFasConPla_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtProNumLin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPronumlin_Jsonclick = "" ;
      edtavPronumlin_Enabled = 1 ;
      edtavProdsc_Jsonclick = "" ;
      edtavProdsc_Enabled = 0 ;
      edtavProcod_Jsonclick = "" ;
      edtavProcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "FicherosBasicos.TProces_Lineas_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T||||||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T||||T|T|T|T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "1:ProNumLin|2:FasCod|3:FasDsc|4:MaqCod|5:FasDec|6:FasPreSal|7:FasPrePie|8:FasVelPro|9:FasNumPas|10:FasActTin|11:FasCon|12:FasAcab|13:FasForMul|14:FasConPla" ;
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
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
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
      Form.setCaption( httpContext.getMessage( " Lineas (Proceso)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_62_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV47GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV47GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112682',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122682',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132682',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182682',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e192682',iparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A774ProNumLin',fld:'PRONUMLIN',pic:'ZZZ9',hsh:true},{av:'AV57UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV55Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV47GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV55Station',fld:'vSTATION',pic:''},{av:'AV57UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e142682',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52ProCod',fld:'vPROCOD',pic:''},{av:'AV15TFProNumLin',fld:'vTFPRONUMLIN',pic:'ZZZ9'},{av:'AV16TFProNumLin_To',fld:'vTFPRONUMLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV22TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV23TFFasDec',fld:'vTFFASDEC',pic:'ZZ9.9'},{av:'AV24TFFasDec_To',fld:'vTFFASDEC_TO',pic:'ZZ9.9'},{av:'AV25TFFasPreSal',fld:'vTFFASPRESAL',pic:'ZZZ9'},{av:'AV26TFFasPreSal_To',fld:'vTFFASPRESAL_TO',pic:'ZZZ9'},{av:'AV27TFFasPrePie',fld:'vTFFASPREPIE',pic:'ZZZ9'},{av:'AV28TFFasPrePie_To',fld:'vTFFASPREPIE_TO',pic:'ZZZ9'},{av:'AV29TFFasVelPro',fld:'vTFFASVELPRO',pic:'ZZ9.9'},{av:'AV30TFFasVelPro_To',fld:'vTFFASVELPRO_TO',pic:'ZZ9.9'},{av:'AV31TFFasNumPas',fld:'vTFFASNUMPAS',pic:'ZZ9'},{av:'AV32TFFasNumPas_To',fld:'vTFFASNUMPAS_TO',pic:'ZZ9'},{av:'AV33TFFasActTin',fld:'vTFFASACTTIN',pic:'@!'},{av:'AV34TFFasActTin_Sel',fld:'vTFFASACTTIN_SEL',pic:'@!'},{av:'AV35TFFasCon',fld:'vTFFASCON',pic:'@!'},{av:'AV36TFFasCon_Sel',fld:'vTFFASCON_SEL',pic:'@!'},{av:'AV37TFFasAcab',fld:'vTFFASACAB',pic:'@!'},{av:'AV38TFFasAcab_Sel',fld:'vTFFASACAB_SEL',pic:'@!'},{av:'AV39TFFasForMul',fld:'vTFFASFORMUL',pic:'@!'},{av:'AV40TFFasForMul_Sel',fld:'vTFFASFORMUL_SEL',pic:'@!'},{av:'AV41TFFasConPla',fld:'vTFFASCONPLA',pic:'@!'},{av:'AV42TFFasConPla_Sel',fld:'vTFFASCONPLA_SEL',pic:'@!'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53ProDsc',fld:'vPRODSC',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'AV48FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV54ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV48FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV54ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV46GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152682',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_PROCOD","{handler:'validv_Procod',iparms:[]");
      setEventMetadata("VALIDV_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fasconpla',iparms:[]");
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
      wcpOAV51Emprcod = "" ;
      wcpOAV52ProCod = "" ;
      wcpOAV53ProDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV51Emprcod = "" ;
      AV52ProCod = "" ;
      AV53ProDsc = "" ;
      AV17TFFasCod = "" ;
      AV18TFFasCod_Sel = "" ;
      AV19TFFasDsc = "" ;
      AV20TFFasDsc_Sel = "" ;
      AV21TFMaqCod = "" ;
      AV22TFMaqCod_Sel = "" ;
      AV23TFFasDec = DecimalUtil.ZERO ;
      AV24TFFasDec_To = DecimalUtil.ZERO ;
      AV29TFFasVelPro = DecimalUtil.ZERO ;
      AV30TFFasVelPro_To = DecimalUtil.ZERO ;
      AV33TFFasActTin = "" ;
      AV34TFFasActTin_Sel = "" ;
      AV35TFFasCon = "" ;
      AV36TFFasCon_Sel = "" ;
      AV37TFFasAcab = "" ;
      AV38TFFasAcab_Sel = "" ;
      AV39TFFasForMul = "" ;
      AV40TFFasForMul_Sel = "" ;
      AV41TFFasConPla = "" ;
      AV42TFFasConPla_Sel = "" ;
      AV60Pgmname = "" ;
      A758ProCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV49FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV43DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV57UsurCod = "" ;
      AV55Station = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV48FasCod = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      scmdbuf = "" ;
      lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = "" ;
      lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = "" ;
      lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = "" ;
      lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = "" ;
      lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = "" ;
      lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = "" ;
      lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = "" ;
      lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = "" ;
      AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel = "" ;
      AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod = "" ;
      AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel = "" ;
      AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc = "" ;
      AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel = "" ;
      AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod = "" ;
      AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec = DecimalUtil.ZERO ;
      AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to = DecimalUtil.ZERO ;
      AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro = DecimalUtil.ZERO ;
      AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to = DecimalUtil.ZERO ;
      AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel = "" ;
      AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin = "" ;
      AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel = "" ;
      AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon = "" ;
      AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel = "" ;
      AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab = "" ;
      AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel = "" ;
      AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul = "" ;
      AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel = "" ;
      AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla = "" ;
      H02682_A396EmprCod = new String[] {""} ;
      H02682_A758ProCod = new String[] {""} ;
      H02682_A4299FasConPla = new String[] {""} ;
      H02682_n4299FasConPla = new boolean[] {false} ;
      H02682_A4286FasForMul = new String[] {""} ;
      H02682_n4286FasForMul = new boolean[] {false} ;
      H02682_A4903FasAcab = new String[] {""} ;
      H02682_n4903FasAcab = new boolean[] {false} ;
      H02682_A458FasCon = new String[] {""} ;
      H02682_n458FasCon = new boolean[] {false} ;
      H02682_A456FasActTin = new String[] {""} ;
      H02682_n456FasActTin = new boolean[] {false} ;
      H02682_A464FasNumPas = new short[1] ;
      H02682_n464FasNumPas = new boolean[] {false} ;
      H02682_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02682_n472FasVelPro = new boolean[] {false} ;
      H02682_A468FasPrePie = new short[1] ;
      H02682_n468FasPrePie = new boolean[] {false} ;
      H02682_A469FasPreSal = new short[1] ;
      H02682_n469FasPreSal = new boolean[] {false} ;
      H02682_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02682_n459FasDec = new boolean[] {false} ;
      H02682_A602MaqCod = new String[] {""} ;
      H02682_n602MaqCod = new boolean[] {false} ;
      H02682_A460FasDsc = new String[] {""} ;
      H02682_A457FasCod = new String[] {""} ;
      H02682_A774ProNumLin = new short[1] ;
      H02683_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV56EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int9 = new short[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char10 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02684_A14042FasActiva = new String[] {""} ;
      H02684_A396EmprCod = new String[] {""} ;
      H02684_A13781FasCDsc = new String[] {""} ;
      H02684_A457FasCod = new String[] {""} ;
      H02684_A460FasDsc = new String[] {""} ;
      A14042FasActiva = "" ;
      A13781FasCDsc = "" ;
      AV50Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_wp__default(),
         new Object[] {
             new Object[] {
            H02682_A396EmprCod, H02682_A758ProCod, H02682_A4299FasConPla, H02682_n4299FasConPla, H02682_A4286FasForMul, H02682_n4286FasForMul, H02682_A4903FasAcab, H02682_n4903FasAcab, H02682_A458FasCon, H02682_n458FasCon,
            H02682_A456FasActTin, H02682_n456FasActTin, H02682_A464FasNumPas, H02682_n464FasNumPas, H02682_A472FasVelPro, H02682_n472FasVelPro, H02682_A468FasPrePie, H02682_n468FasPrePie, H02682_A469FasPreSal, H02682_n469FasPreSal,
            H02682_A459FasDec, H02682_n459FasDec, H02682_A602MaqCod, H02682_n602MaqCod, H02682_A460FasDsc, H02682_A457FasCod, H02682_A774ProNumLin
            }
            , new Object[] {
            H02683_AGRID_nRecordCount
            }
            , new Object[] {
            H02684_A14042FasActiva, H02684_A396EmprCod, H02684_A13781FasCDsc, H02684_A457FasCod, H02684_A460FasDsc
            }
         }
      );
      AV60Pgmname = "FicherosBasicos.TProces_Lineas_WP" ;
      /* GeneXus formulas. */
      AV60Pgmname = "FicherosBasicos.TProces_Lineas_WP" ;
      Gx_err = (short)(0) ;
      edtavProcod_Enabled = 0 ;
      edtavProdsc_Enabled = 0 ;
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
   private short AV15TFProNumLin ;
   private short AV16TFProNumLin_To ;
   private short AV25TFFasPreSal ;
   private short AV26TFFasPreSal_To ;
   private short AV27TFFasPrePie ;
   private short AV28TFFasPrePie_To ;
   private short AV31TFFasNumPas ;
   private short AV32TFFasNumPas_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV54ProNumLin ;
   private short AV47GridActions ;
   private short A774ProNumLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ;
   private short AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ;
   private short AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ;
   private short AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ;
   private short AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ;
   private short AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ;
   private short AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ;
   private short AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_62 ;
   private int nGXsfl_62_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavProcod_Enabled ;
   private int edtavProdsc_Enabled ;
   private int edtavPronumlin_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavFascod_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV44PageToGo ;
   private int AV89GXV1 ;
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
   private java.math.BigDecimal AV23TFFasDec ;
   private java.math.BigDecimal AV24TFFasDec_To ;
   private java.math.BigDecimal AV29TFFasVelPro ;
   private java.math.BigDecimal AV30TFFasVelPro_To ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ;
   private java.math.BigDecimal AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ;
   private java.math.BigDecimal AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ;
   private java.math.BigDecimal AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ;
   private String wcpOAV51Emprcod ;
   private String wcpOAV52ProCod ;
   private String wcpOAV53ProDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Combo_fascod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV51Emprcod ;
   private String AV52ProCod ;
   private String AV53ProDsc ;
   private String sGXsfl_62_idx="0001" ;
   private String AV17TFFasCod ;
   private String AV18TFFasCod_Sel ;
   private String AV19TFFasDsc ;
   private String AV20TFFasDsc_Sel ;
   private String AV21TFMaqCod ;
   private String AV22TFMaqCod_Sel ;
   private String AV33TFFasActTin ;
   private String AV34TFFasActTin_Sel ;
   private String AV35TFFasCon ;
   private String AV36TFFasCon_Sel ;
   private String AV37TFFasAcab ;
   private String AV38TFFasAcab_Sel ;
   private String AV39TFFasForMul ;
   private String AV40TFFasForMul_Sel ;
   private String AV41TFFasConPla ;
   private String AV42TFFasConPla_Sel ;
   private String AV60Pgmname ;
   private String A758ProCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV57UsurCod ;
   private String AV55Station ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavProcod_Internalname ;
   private String edtavProcod_Jsonclick ;
   private String edtavProdsc_Internalname ;
   private String edtavProdsc_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPronumlin_Internalname ;
   private String TempTags ;
   private String edtavPronumlin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtavFascod_Internalname ;
   private String AV48FasCod ;
   private String edtavFascod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtProNumLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String A456FasActTin ;
   private String edtFasActTin_Internalname ;
   private String A458FasCon ;
   private String edtFasCon_Internalname ;
   private String A4903FasAcab ;
   private String edtFasAcab_Internalname ;
   private String A4286FasForMul ;
   private String edtFasForMul_Internalname ;
   private String A4299FasConPla ;
   private String edtFasConPla_Internalname ;
   private String scmdbuf ;
   private String lV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ;
   private String lV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ;
   private String lV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ;
   private String lV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ;
   private String lV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ;
   private String lV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ;
   private String lV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ;
   private String lV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ;
   private String AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ;
   private String AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ;
   private String AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ;
   private String AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ;
   private String AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ;
   private String AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ;
   private String AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ;
   private String AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ;
   private String AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ;
   private String AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ;
   private String AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ;
   private String AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ;
   private String AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ;
   private String AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ;
   private String AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ;
   private String AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ;
   private String hsh ;
   private String AV56EmprNom ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char10[] ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char11 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A14042FasActiva ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtProNumLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasConPla_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_fascod_Emptyitem ;
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
   private boolean n602MaqCod ;
   private boolean n459FasDec ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A13781FasCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02682_A396EmprCod ;
   private String[] H02682_A758ProCod ;
   private String[] H02682_A4299FasConPla ;
   private boolean[] H02682_n4299FasConPla ;
   private String[] H02682_A4286FasForMul ;
   private boolean[] H02682_n4286FasForMul ;
   private String[] H02682_A4903FasAcab ;
   private boolean[] H02682_n4903FasAcab ;
   private String[] H02682_A458FasCon ;
   private boolean[] H02682_n458FasCon ;
   private String[] H02682_A456FasActTin ;
   private boolean[] H02682_n456FasActTin ;
   private short[] H02682_A464FasNumPas ;
   private boolean[] H02682_n464FasNumPas ;
   private java.math.BigDecimal[] H02682_A472FasVelPro ;
   private boolean[] H02682_n472FasVelPro ;
   private short[] H02682_A468FasPrePie ;
   private boolean[] H02682_n468FasPrePie ;
   private short[] H02682_A469FasPreSal ;
   private boolean[] H02682_n469FasPreSal ;
   private java.math.BigDecimal[] H02682_A459FasDec ;
   private boolean[] H02682_n459FasDec ;
   private String[] H02682_A602MaqCod ;
   private boolean[] H02682_n602MaqCod ;
   private String[] H02682_A460FasDsc ;
   private String[] H02682_A457FasCod ;
   private short[] H02682_A774ProNumLin ;
   private long[] H02683_AGRID_nRecordCount ;
   private String[] H02684_A14042FasActiva ;
   private String[] H02684_A396EmprCod ;
   private String[] H02684_A13781FasCDsc ;
   private String[] H02684_A457FasCod ;
   private String[] H02684_A460FasDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49FasCod_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV43DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV50Combo_DataItem ;
}

final  class tproces_lineas_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02682( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV51Emprcod ,
                                          String AV52ProCod ,
                                          String A396EmprCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[35];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ProCod, T2.FasConPla, T2.FasForMul, T2.FasAcab, T2.FasCon, T2.FasActTin, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec, T2.MaqCod," ;
      sSelectString += " T2.FasDsc, T1.FasCod, T1.ProNumLin" ;
      sFromString = " FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      if ( ! (0==AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (0==AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProNumLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProNumLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDec" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDec DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasPreSal" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasPreSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasPrePie" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasPrePie DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasVelPro" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasVelPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasNumPas" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasNumPas DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasActTin" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasActTin DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasCon" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasAcab" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasAcab DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasForMul" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasForMul DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasConPla" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasConPla DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H02683( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin ,
                                          short AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to ,
                                          String AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel ,
                                          String AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod ,
                                          String AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel ,
                                          String AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc ,
                                          String AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel ,
                                          String AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod ,
                                          java.math.BigDecimal AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec ,
                                          java.math.BigDecimal AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to ,
                                          short AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal ,
                                          short AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to ,
                                          short AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie ,
                                          short AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to ,
                                          java.math.BigDecimal AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro ,
                                          java.math.BigDecimal AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to ,
                                          short AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas ,
                                          short AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to ,
                                          String AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel ,
                                          String AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin ,
                                          String AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel ,
                                          String AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon ,
                                          String AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel ,
                                          String AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab ,
                                          String AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel ,
                                          String AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul ,
                                          String AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel ,
                                          String AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A459FasDec ,
                                          short A469FasPreSal ,
                                          short A468FasPrePie ,
                                          java.math.BigDecimal A472FasVelPro ,
                                          short A464FasNumPas ,
                                          String A456FasActTin ,
                                          String A458FasCon ,
                                          String A4903FasAcab ,
                                          String A4286FasForMul ,
                                          String A4299FasConPla ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV51Emprcod ,
                                          String AV52ProCod ,
                                          String A396EmprCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[30];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      if ( ! (0==AV61Ficherosbasicos_tproces_lineas_wpds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (0==AV62Ficherosbasicos_tproces_lineas_wpds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_lineas_wpds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_lineas_wpds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_lineas_wpds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_lineas_wpds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_lineas_wpds_7_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_lineas_wpds_8_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqCod = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Ficherosbasicos_tproces_lineas_wpds_9_tffasdec)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Ficherosbasicos_tproces_lineas_wpds_10_tffasdec_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasDec <= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV71Ficherosbasicos_tproces_lineas_wpds_11_tffaspresal) )
      {
         addWhere(sWhereString, "(T2.FasPreSal >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV72Ficherosbasicos_tproces_lineas_wpds_12_tffaspresal_to) )
      {
         addWhere(sWhereString, "(T2.FasPreSal <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_tproces_lineas_wpds_13_tffasprepie) )
      {
         addWhere(sWhereString, "(T2.FasPrePie >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tproces_lineas_wpds_14_tffasprepie_to) )
      {
         addWhere(sWhereString, "(T2.FasPrePie <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ficherosbasicos_tproces_lineas_wpds_15_tffasvelpro)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ficherosbasicos_tproces_lineas_wpds_16_tffasvelpro_to)==0) )
      {
         addWhere(sWhereString, "(T2.FasVelPro <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV77Ficherosbasicos_tproces_lineas_wpds_17_tffasnumpas) )
      {
         addWhere(sWhereString, "(T2.FasNumPas >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Ficherosbasicos_tproces_lineas_wpds_18_tffasnumpas_to) )
      {
         addWhere(sWhereString, "(T2.FasNumPas <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_tproces_lineas_wpds_19_tffasacttin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasActTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_tproces_lineas_wpds_20_tffasacttin_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasActTin = ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tproces_lineas_wpds_21_tffascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tproces_lineas_wpds_22_tffascon_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCon = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) && ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tproces_lineas_wpds_23_tffasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Ficherosbasicos_tproces_lineas_wpds_24_tffasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasAcab = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV85Ficherosbasicos_tproces_lineas_wpds_25_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Ficherosbasicos_tproces_lineas_wpds_26_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) && ( ! (GXutil.strcmp("", AV87Ficherosbasicos_tproces_lineas_wpds_27_tffasconpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasConPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ficherosbasicos_tproces_lineas_wpds_28_tffasconpla_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasConPla = ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
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
                  return conditional_H02682(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
            case 1 :
                  return conditional_H02683(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02682", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02683", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02684", "SELECT FasActiva, EmprCod, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc FROM TXPFASPRO WHERE FasActiva = 'S' ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 28);
               ((String[]) buf[25])[0] = rslt.getString(15, 8);
               ((short[]) buf[26])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               return;
      }
   }

}

