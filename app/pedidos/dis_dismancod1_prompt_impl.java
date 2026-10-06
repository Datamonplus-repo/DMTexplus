package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis_dismancod1_prompt_impl extends GXDataArea
{
   public dis_dismancod1_prompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public dis_dismancod1_prompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_dismancod1_prompt_impl.class ));
   }

   public dis_dismancod1_prompt_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            A396EmprCod = gxfirstwebparm ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               AV10In_PMDColNum = (int)(GXutil.lval( httpContext.GetPar( "In_PMDColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10In_PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10In_PMDColNum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_PMDCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10In_PMDColNum), "ZZZZZ9")));
               AV6PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PMDCod), 4, 0));
               AV7PMDDsc = httpContext.GetPar( "PMDDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7PMDDsc", AV7PMDDsc);
               AV8PmdColCli = httpContext.GetPar( "PmdColCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8PmdColCli", AV8PmdColCli);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOLCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PmdColCli, ""))));
               AV9Out_PMDColNum = (int)(GXutil.lval( httpContext.GetPar( "Out_PMDColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Out_PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Out_PMDColNum), 6, 0));
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV20FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV25TFPMDCod = (short)(GXutil.lval( httpContext.GetPar( "TFPMDCod"))) ;
      AV26TFPMDCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPMDCod_To"))) ;
      AV27TFPMDDsc = httpContext.GetPar( "TFPMDDsc") ;
      AV28TFPMDDsc_Sel = httpContext.GetPar( "TFPMDDsc_Sel") ;
      AV29TFPMDColNum = (int)(GXutil.lval( httpContext.GetPar( "TFPMDColNum"))) ;
      AV30TFPMDColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMDColNum_To"))) ;
      AV31TFPMDColCli = httpContext.GetPar( "TFPMDColCli") ;
      AV32TFPMDColCli_Sel = httpContext.GetPar( "TFPMDColCli_Sel") ;
      AV33TFPMDConCod = (int)(GXutil.lval( httpContext.GetPar( "TFPMDConCod"))) ;
      AV34TFPMDConCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMDConCod_To"))) ;
      AV35TFPMDColNom = httpContext.GetPar( "TFPMDColNom") ;
      AV36TFPMDColNom_Sel = httpContext.GetPar( "TFPMDColNom_Sel") ;
      AV37TFPMDPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreKgm"), ".") ;
      AV38TFPMDPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreKgm_To"), ".") ;
      AV39TFPMDEntKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDEntKgm"), ".") ;
      AV40TFPMDEntKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDEntKgm_To"), ".") ;
      AV41TFPMDDtoTin = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoTin"), ".") ;
      AV42TFPMDDtoTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoTin_To"), ".") ;
      AV43TFPMDDtoAca = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoAca"), ".") ;
      AV44TFPMDDtoAca_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoAca_To"), ".") ;
      AV45TFPMDPreUni = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreUni"), ".") ;
      AV46TFPMDPreUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreUni_To"), ".") ;
      AV47TFPMDValFch = localUtil.parseDateParm( httpContext.GetPar( "TFPMDValFch")) ;
      AV51TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV52TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV60Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV10In_PMDColNum = (int)(GXutil.lval( httpContext.GetPar( "In_PMDColNum"))) ;
      AV8PmdColCli = httpContext.GetPar( "PmdColCli") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
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
      pa1YO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1YO2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.dis_dismancod1_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10In_PMDColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6PMDCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV7PMDDsc)),GXutil.URLEncode(GXutil.rtrim(AV8PmdColCli)),GXutil.URLEncode(GXutil.ltrimstr(AV9Out_PMDColNum,6,0))}, new String[] {"EmprCod","CliCod","In_PMDColNum","PMDCod","PMDDsc","PmdColCli","Out_PMDColNum"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOLCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PmdColCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_PMDCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10In_PMDColNum), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisManCod1_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis_dismancod1_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV55GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV56GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV53DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV53DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOD", GXutil.ltrim( localUtil.ntoc( AV25TFPMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV26TFPMDCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDSC", GXutil.rtrim( AV27TFPMDDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDSC_SEL", GXutil.rtrim( AV28TFPMDDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNUM", GXutil.ltrim( localUtil.ntoc( AV29TFPMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV30TFPMDColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLCLI", GXutil.rtrim( AV31TFPMDColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLCLI_SEL", GXutil.rtrim( AV32TFPMDColCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCONCOD", GXutil.ltrim( localUtil.ntoc( AV33TFPMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCONCOD_TO", GXutil.ltrim( localUtil.ntoc( AV34TFPMDConCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNOM", GXutil.rtrim( AV35TFPMDColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNOM_SEL", GXutil.rtrim( AV36TFPMDColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREKGM", GXutil.ltrim( localUtil.ntoc( AV37TFPMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV38TFPMDPreKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDENTKGM", GXutil.ltrim( localUtil.ntoc( AV39TFPMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDENTKGM_TO", GXutil.ltrim( localUtil.ntoc( AV40TFPMDEntKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOTIN", GXutil.ltrim( localUtil.ntoc( AV41TFPMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOTIN_TO", GXutil.ltrim( localUtil.ntoc( AV42TFPMDDtoTin_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOACA", GXutil.ltrim( localUtil.ntoc( AV43TFPMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOACA_TO", GXutil.ltrim( localUtil.ntoc( AV44TFPMDDtoAca_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREUNI", GXutil.ltrim( localUtil.ntoc( AV45TFPMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREUNI_TO", GXutil.ltrim( localUtil.ntoc( AV46TFPMDPreUni_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDVALFCH", localUtil.dtoc( AV47TFPMDValFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV51TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV52TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV19OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOLCLI", GXutil.rtrim( AV8PmdColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOLCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PmdColCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIN_PMDCOLNUM", GXutil.ltrim( localUtil.ntoc( AV10In_PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_PMDCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10In_PMDColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOD", GXutil.ltrim( localUtil.ntoc( AV6PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDDSC", GXutil.rtrim( AV7PMDDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUT_PMDCOLNUM", GXutil.ltrim( localUtil.ntoc( AV9Out_PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
         we1YO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1YO2( ) ;
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
      return formatLink("app.pedidos.dis_dismancod1_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10In_PMDColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6PMDCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV7PMDDsc)),GXutil.URLEncode(GXutil.rtrim(AV8PmdColCli)),GXutil.URLEncode(GXutil.ltrimstr(AV9Out_PMDColNum,6,0))}, new String[] {"EmprCod","CliCod","In_PMDColNum","PMDCod","PMDDsc","PmdColCli","Out_PMDColNum"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.Dis_DisManCod1_Prompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Programas Tinte Cliente Moda21", "") ;
   }

   public void wb1YO0( )
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
         wb_table1_12_1YO2( true) ;
      }
      else
      {
         wb_table1_12_1YO2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_1YO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol30( ) ;
      }
      if ( wbEnd == 30 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_30 = (int)(nGXsfl_30_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV55GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV56GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\Dis_DisManCod1_Prompt.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV53DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pmdvalfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_30_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pmdvalfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pmdvalfchauxdate_Internalname, localUtil.format(AV49DDO_PMDValFchAuxDate, "99/99/99"), localUtil.format( AV49DDO_PMDValFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pmdvalfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis_DisManCod1_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pmdvalfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis_DisManCod1_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 30 )
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

   public void start1YO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Programas Tinte Cliente Moda21", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1YO0( ) ;
   }

   public void ws1YO2( )
   {
      start1YO2( ) ;
      evt1YO2( ) ;
   }

   public void evt1YO2( )
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
                           e111YO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121YO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131YO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141YO2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_30_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_302( ) ;
                           AV57Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV57Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A8392PMDDsc = httpContext.cgiGet( edtPMDDsc_Internalname) ;
                           n8392PMDDsc = false ;
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
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151YO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161YO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171YO2 ();
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
                                       e181YO2 ();
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

   public void we1YO2( )
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

   public void pa1YO2( )
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
      subsflControlProps_302( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         sendrow_302( ) ;
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A252CliCod ,
                                 byte AV24ManageFiltersExecutionStep ,
                                 String AV20FilterFullText ,
                                 short AV25TFPMDCod ,
                                 short AV26TFPMDCod_To ,
                                 String AV27TFPMDDsc ,
                                 String AV28TFPMDDsc_Sel ,
                                 int AV29TFPMDColNum ,
                                 int AV30TFPMDColNum_To ,
                                 String AV31TFPMDColCli ,
                                 String AV32TFPMDColCli_Sel ,
                                 int AV33TFPMDConCod ,
                                 int AV34TFPMDConCod_To ,
                                 String AV35TFPMDColNom ,
                                 String AV36TFPMDColNom_Sel ,
                                 java.math.BigDecimal AV37TFPMDPreKgm ,
                                 java.math.BigDecimal AV38TFPMDPreKgm_To ,
                                 java.math.BigDecimal AV39TFPMDEntKgm ,
                                 java.math.BigDecimal AV40TFPMDEntKgm_To ,
                                 java.math.BigDecimal AV41TFPMDDtoTin ,
                                 java.math.BigDecimal AV42TFPMDDtoTin_To ,
                                 java.math.BigDecimal AV43TFPMDDtoAca ,
                                 java.math.BigDecimal AV44TFPMDDtoAca_To ,
                                 java.math.BigDecimal AV45TFPMDPreUni ,
                                 java.math.BigDecimal AV46TFPMDPreUni_To ,
                                 java.util.Date AV47TFPMDValFch ,
                                 int AV51TFCliCod ,
                                 int AV52TFCliCod_To ,
                                 String AV60Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 int AV10In_PMDColNum ,
                                 String AV8PmdColCli )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161YO2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisManCod1_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis_dismancod1_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOD", GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), ".", "")));
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1YO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV60Pgmname = "Pedidos.Dis_DisManCod1_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod) ,
                                           Short.valueOf(AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) ,
                                           AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                           AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                           Integer.valueOf(AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) ,
                                           Integer.valueOf(AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) ,
                                           AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                           AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                           Integer.valueOf(AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) ,
                                           Integer.valueOf(AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) ,
                                           AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                           AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                           AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                           AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                           AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                           AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                           AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                           AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                           AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                           AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                           AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                           Integer.valueOf(AV89Pedidos_dis_dismancod1_promptds_25_tfclicod) ,
                                           Integer.valueOf(AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to) ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                           A8394PMDColNom ,
                                           AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                           AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = GXutil.padr( GXutil.rtrim( AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc), 30, "%") ;
      lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli), 13, "%") ;
      /* Using cursor H01YO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod), Short.valueOf(AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to), lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc, AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel, Integer.valueOf(AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum), Integer.valueOf(AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to), lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli, AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel, Integer.valueOf(AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod), Integer.valueOf(AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to), AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm, AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to, AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm, AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to, AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin, AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to, AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca, AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to, AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni, AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to, AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch, Integer.valueOf(AV89Pedidos_dis_dismancod1_promptds_25_tfclicod), Integer.valueOf(AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8399PMDValFch = H01YO2_A8399PMDValFch[0] ;
         A8532PMDPreUni = H01YO2_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = H01YO2_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = H01YO2_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = H01YO2_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = H01YO2_A8395PMDPreKgm[0] ;
         A8530PMDColCli = H01YO2_A8530PMDColCli[0] ;
         A8393PMDColNum = H01YO2_A8393PMDColNum[0] ;
         A8392PMDDsc = H01YO2_A8392PMDDsc[0] ;
         n8392PMDDsc = H01YO2_n8392PMDDsc[0] ;
         A8391PMDCod = H01YO2_A8391PMDCod[0] ;
         A8531PMDConCod = H01YO2_A8531PMDConCod[0] ;
         A8392PMDDsc = H01YO2_A8392PMDDsc[0] ;
         n8392PMDDsc = H01YO2_n8392PMDDsc[0] ;
         GXt_char1 = A8394PMDColNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
         dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
         A8394PMDColNom = GXt_char1 ;
         if ( (GXutil.strcmp("", AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A8391PMDCod, 4, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8392PMDDsc) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8393PMDColNum, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8530PMDColCli) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8531PMDConCod, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8395PMDPreKgm, 9, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8396PMDEntKgm, 9, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8397PMDDtoTin, 6, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8398PMDDtoAca, 6, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8532PMDPreUni, 14, 5) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel) == 0 ) ) )
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

   public void rf1YO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(30) ;
      /* Execute user event: Refresh */
      e161YO2 ();
      nGXsfl_30_idx = 1 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_302( ) ;
      bGXsfl_30_Refreshing = true ;
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
         subsflControlProps_302( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod) ,
                                              Short.valueOf(AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) ,
                                              AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                              AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                              Integer.valueOf(AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) ,
                                              Integer.valueOf(AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) ,
                                              AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                              AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                              Integer.valueOf(AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) ,
                                              Integer.valueOf(AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) ,
                                              AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                              AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                              AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                              AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                              AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                              AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                              AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                              AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                              AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                              AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                              AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                              Integer.valueOf(AV89Pedidos_dis_dismancod1_promptds_25_tfclicod) ,
                                              Integer.valueOf(AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to) ,
                                              Short.valueOf(A8391PMDCod) ,
                                              A8392PMDDsc ,
                                              Integer.valueOf(A8393PMDColNum) ,
                                              A8530PMDColCli ,
                                              Integer.valueOf(A8531PMDConCod) ,
                                              A8395PMDPreKgm ,
                                              A8396PMDEntKgm ,
                                              A8397PMDDtoTin ,
                                              A8398PMDDtoAca ,
                                              A8532PMDPreUni ,
                                              A8399PMDValFch ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                              A8394PMDColNom ,
                                              AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                              AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = GXutil.padr( GXutil.rtrim( AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc), 30, "%") ;
         lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli), 13, "%") ;
         /* Using cursor H01YO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod), Short.valueOf(AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to), lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc, AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel, Integer.valueOf(AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum), Integer.valueOf(AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to), lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli, AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel, Integer.valueOf(AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod), Integer.valueOf(AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to), AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm, AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to, AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm, AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to, AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin, AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to, AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca, AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to, AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni, AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to, AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch, Integer.valueOf(AV89Pedidos_dis_dismancod1_promptds_25_tfclicod), Integer.valueOf(AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to)});
         nGXsfl_30_idx = 1 ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A8399PMDValFch = H01YO3_A8399PMDValFch[0] ;
            A8532PMDPreUni = H01YO3_A8532PMDPreUni[0] ;
            A8398PMDDtoAca = H01YO3_A8398PMDDtoAca[0] ;
            A8397PMDDtoTin = H01YO3_A8397PMDDtoTin[0] ;
            A8396PMDEntKgm = H01YO3_A8396PMDEntKgm[0] ;
            A8395PMDPreKgm = H01YO3_A8395PMDPreKgm[0] ;
            A8530PMDColCli = H01YO3_A8530PMDColCli[0] ;
            A8393PMDColNum = H01YO3_A8393PMDColNum[0] ;
            A8392PMDDsc = H01YO3_A8392PMDDsc[0] ;
            n8392PMDDsc = H01YO3_n8392PMDDsc[0] ;
            A8391PMDCod = H01YO3_A8391PMDCod[0] ;
            A8531PMDConCod = H01YO3_A8531PMDConCod[0] ;
            A8392PMDDsc = H01YO3_A8392PMDDsc[0] ;
            n8392PMDDsc = H01YO3_n8392PMDDsc[0] ;
            GXt_char1 = A8394PMDColNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
            dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
            A8394PMDColNom = GXt_char1 ;
            if ( (GXutil.strcmp("", AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A8391PMDCod, 4, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8392PMDDsc) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8393PMDColNum, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8530PMDColCli) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8531PMDConCod, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8395PMDPreKgm, 9, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8396PMDEntKgm, 9, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8397PMDDtoTin, 6, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8398PMDDtoAca, 6, 2) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8532PMDPreUni, 14, 5) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel) == 0 ) ) )
                  {
                     e171YO2 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(30) ;
         wb1YO0( ) ;
      }
      bGXsfl_30_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOD"+"_"+sGXsfl_30_idx, getSecureSignedToken( sGXsfl_30_idx, localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOLNUM"+"_"+sGXsfl_30_idx, getSecureSignedToken( sGXsfl_30_idx, localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOLCLI", GXutil.rtrim( AV8PmdColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOLCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PmdColCli, ""))));
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
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A252CliCod, AV24ManageFiltersExecutionStep, AV20FilterFullText, AV25TFPMDCod, AV26TFPMDCod_To, AV27TFPMDDsc, AV28TFPMDDsc_Sel, AV29TFPMDColNum, AV30TFPMDColNum_To, AV31TFPMDColCli, AV32TFPMDColCli_Sel, AV33TFPMDConCod, AV34TFPMDConCod_To, AV35TFPMDColNom, AV36TFPMDColNom_Sel, AV37TFPMDPreKgm, AV38TFPMDPreKgm_To, AV39TFPMDEntKgm, AV40TFPMDEntKgm_To, AV41TFPMDDtoTin, AV42TFPMDDtoTin_To, AV43TFPMDDtoAca, AV44TFPMDDtoAca_To, AV45TFPMDPreUni, AV46TFPMDPreUni_To, AV47TFPMDValFch, AV51TFCliCod, AV52TFCliCod_To, AV60Pgmname, AV18OrderedBy, AV19OrderedDsc, AV10In_PMDColNum, AV8PmdColCli) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV60Pgmname = "Pedidos.Dis_DisManCod1_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151YO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV53DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV55GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV56GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
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
         AV20FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pmdvalfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMDVALFCHAUXDATE");
            GX_FocusControl = edtavDdo_pmdvalfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49DDO_PMDValFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49DDO_PMDValFchAuxDate", localUtil.format(AV49DDO_PMDValFchAuxDate, "99/99/99"));
         }
         else
         {
            AV49DDO_PMDValFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pmdvalfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49DDO_PMDValFchAuxDate", localUtil.format(AV49DDO_PMDValFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Dis_DisManCod1_Prompt");
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\dis_dismancod1_prompt:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e151YO2 ();
      if (returnInSub) return;
   }

   public void e151YO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29TFPMDColNum = AV10In_PMDColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPMDColNum), 6, 0));
      AV30TFPMDColNum_To = AV10In_PMDColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPMDColNum_To), 6, 0));
      GXt_char1 = AV61Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Station = GXt_char1 ;
      GXv_char2[0] = AV62Emprcod ;
      GXv_char3[0] = AV63Emprnom ;
      GXv_char4[0] = AV64Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char2, GXv_char3, GXv_char4) ;
      dis_dismancod1_prompt_impl.this.AV62Emprcod = GXv_char2[0] ;
      dis_dismancod1_prompt_impl.this.AV63Emprnom = GXv_char3[0] ;
      dis_dismancod1_prompt_impl.this.AV64Usurcod = GXv_char4[0] ;
      divUnnamedtable1_Height = 500 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      if ( GXutil.strcmp(AV13HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Programas Tinte Cliente Moda21", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV53DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV53DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161YO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV12WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV24ManageFiltersExecutionStep == 1 )
      {
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV24ManageFiltersExecutionStep == 2 )
      {
         AV24ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV55GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridCurrentPage), 10, 0));
      AV56GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridPageCount), 10, 0));
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV20FilterFullText ;
      AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV25TFPMDCod ;
      AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV26TFPMDCod_To ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV27TFPMDDsc ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV28TFPMDDsc_Sel ;
      AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV29TFPMDColNum ;
      AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV30TFPMDColNum_To ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV31TFPMDColCli ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV32TFPMDColCli_Sel ;
      AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV33TFPMDConCod ;
      AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV34TFPMDConCod_To ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV35TFPMDColNom ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV36TFPMDColNom_Sel ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV37TFPMDPreKgm ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV38TFPMDPreKgm_To ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV39TFPMDEntKgm ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV40TFPMDEntKgm_To ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV41TFPMDDtoTin ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV42TFPMDDtoTin_To ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV43TFPMDDtoAca ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV44TFPMDDtoAca_To ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV45TFPMDPreUni ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV46TFPMDPreUni_To ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV47TFPMDValFch ;
      AV89Pedidos_dis_dismancod1_promptds_25_tfclicod = AV51TFCliCod ;
      AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV52TFCliCod_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16GridState", AV16GridState);
   }

   public void e121YO2( )
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
         AV54PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV54PageToGo) ;
      }
   }

   public void e131YO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141YO2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDCod") == 0 )
         {
            AV25TFPMDCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFPMDCod), 4, 0));
            AV26TFPMDCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPMDCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDDsc") == 0 )
         {
            AV27TFPMDDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDDsc", AV27TFPMDDsc);
            AV28TFPMDDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDDsc_Sel", AV28TFPMDDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColNum") == 0 )
         {
            AV29TFPMDColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPMDColNum), 6, 0));
            AV30TFPMDColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPMDColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColCli") == 0 )
         {
            AV31TFPMDColCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPMDColCli", AV31TFPMDColCli);
            AV32TFPMDColCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPMDColCli_Sel", AV32TFPMDColCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDConCod") == 0 )
         {
            AV33TFPMDConCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPMDConCod), 6, 0));
            AV34TFPMDConCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPMDConCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPMDConCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColNom") == 0 )
         {
            AV35TFPMDColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPMDColNom", AV35TFPMDColNom);
            AV36TFPMDColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPMDColNom_Sel", AV36TFPMDColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDPreKgm") == 0 )
         {
            AV37TFPMDPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPMDPreKgm", GXutil.ltrimstr( AV37TFPMDPreKgm, 9, 2));
            AV38TFPMDPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPMDPreKgm_To", GXutil.ltrimstr( AV38TFPMDPreKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDEntKgm") == 0 )
         {
            AV39TFPMDEntKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPMDEntKgm", GXutil.ltrimstr( AV39TFPMDEntKgm, 9, 2));
            AV40TFPMDEntKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPMDEntKgm_To", GXutil.ltrimstr( AV40TFPMDEntKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDDtoTin") == 0 )
         {
            AV41TFPMDDtoTin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPMDDtoTin", GXutil.ltrimstr( AV41TFPMDDtoTin, 6, 2));
            AV42TFPMDDtoTin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPMDDtoTin_To", GXutil.ltrimstr( AV42TFPMDDtoTin_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDDtoAca") == 0 )
         {
            AV43TFPMDDtoAca = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPMDDtoAca", GXutil.ltrimstr( AV43TFPMDDtoAca, 6, 2));
            AV44TFPMDDtoAca_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMDDtoAca_To", GXutil.ltrimstr( AV44TFPMDDtoAca_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDPreUni") == 0 )
         {
            AV45TFPMDPreUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMDPreUni", GXutil.ltrimstr( AV45TFPMDPreUni, 14, 5));
            AV46TFPMDPreUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDPreUni_To", GXutil.ltrimstr( AV46TFPMDPreUni_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDValFch") == 0 )
         {
            AV47TFPMDValFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDValFch", localUtil.format(AV47TFPMDValFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV51TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFCliCod), 6, 0));
            AV52TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliCod_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171YO2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV57Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV57Select);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(30) ;
         }
         sendrow_302( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_30_Refreshing )
      {
         httpContext.doAjaxLoad(30, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e111YO2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis_DisManCod1_PromptFilters")),GXutil.URLEncode(GXutil.rtrim(AV60Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis_DisManCod1_PromptFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Pedidos.Dis_DisManCod1_PromptFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV16GridState.fromxml(AV23ManageFiltersXml, null, null);
            AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
            AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19OrderedDsc", AV19OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Pedidos.Dis_DisManCod1_PromptFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV20FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
      AV25TFPMDCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFPMDCod), 4, 0));
      AV26TFPMDCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPMDCod_To), 4, 0));
      AV27TFPMDDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDDsc", AV27TFPMDDsc);
      AV28TFPMDDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDDsc_Sel", AV28TFPMDDsc_Sel);
      AV29TFPMDColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPMDColNum), 6, 0));
      AV30TFPMDColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPMDColNum_To), 6, 0));
      AV31TFPMDColCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPMDColCli", AV31TFPMDColCli);
      AV32TFPMDColCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFPMDColCli_Sel", AV32TFPMDColCli_Sel);
      AV33TFPMDConCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFPMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPMDConCod), 6, 0));
      AV34TFPMDConCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFPMDConCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPMDConCod_To), 6, 0));
      AV35TFPMDColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFPMDColNom", AV35TFPMDColNom);
      AV36TFPMDColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFPMDColNom_Sel", AV36TFPMDColNom_Sel);
      AV37TFPMDPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFPMDPreKgm", GXutil.ltrimstr( AV37TFPMDPreKgm, 9, 2));
      AV38TFPMDPreKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPMDPreKgm_To", GXutil.ltrimstr( AV38TFPMDPreKgm_To, 9, 2));
      AV39TFPMDEntKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPMDEntKgm", GXutil.ltrimstr( AV39TFPMDEntKgm, 9, 2));
      AV40TFPMDEntKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPMDEntKgm_To", GXutil.ltrimstr( AV40TFPMDEntKgm_To, 9, 2));
      AV41TFPMDDtoTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFPMDDtoTin", GXutil.ltrimstr( AV41TFPMDDtoTin, 6, 2));
      AV42TFPMDDtoTin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFPMDDtoTin_To", GXutil.ltrimstr( AV42TFPMDDtoTin_To, 6, 2));
      AV43TFPMDDtoAca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPMDDtoAca", GXutil.ltrimstr( AV43TFPMDDtoAca, 6, 2));
      AV44TFPMDDtoAca_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMDDtoAca_To", GXutil.ltrimstr( AV44TFPMDDtoAca_To, 6, 2));
      AV45TFPMDPreUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMDPreUni", GXutil.ltrimstr( AV45TFPMDPreUni, 14, 5));
      AV46TFPMDPreUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDPreUni_To", GXutil.ltrimstr( AV46TFPMDPreUni_To, 14, 5));
      AV47TFPMDValFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDValFch", localUtil.format(AV47TFPMDValFch, "99/99/99"));
      AV51TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFCliCod), 6, 0));
      AV52TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliCod_To), 6, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV60Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV60Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV21Session.getValue(AV60Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOD") == 0 )
         {
            AV25TFPMDCod = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFPMDCod), 4, 0));
            AV26TFPMDCod_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPMDCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC") == 0 )
         {
            AV27TFPMDDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDDsc", AV27TFPMDDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC_SEL") == 0 )
         {
            AV28TFPMDDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDDsc_Sel", AV28TFPMDDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNUM") == 0 )
         {
            AV29TFPMDColNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPMDColNum), 6, 0));
            AV30TFPMDColNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPMDColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI") == 0 )
         {
            AV31TFPMDColCli = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPMDColCli", AV31TFPMDColCli);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI_SEL") == 0 )
         {
            AV32TFPMDColCli_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPMDColCli_Sel", AV32TFPMDColCli_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCONCOD") == 0 )
         {
            AV33TFPMDConCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPMDConCod), 6, 0));
            AV34TFPMDConCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPMDConCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPMDConCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM") == 0 )
         {
            AV35TFPMDColNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPMDColNom", AV35TFPMDColNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM_SEL") == 0 )
         {
            AV36TFPMDColNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPMDColNom_Sel", AV36TFPMDColNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREKGM") == 0 )
         {
            AV37TFPMDPreKgm = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPMDPreKgm", GXutil.ltrimstr( AV37TFPMDPreKgm, 9, 2));
            AV38TFPMDPreKgm_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPMDPreKgm_To", GXutil.ltrimstr( AV38TFPMDPreKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDENTKGM") == 0 )
         {
            AV39TFPMDEntKgm = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPMDEntKgm", GXutil.ltrimstr( AV39TFPMDEntKgm, 9, 2));
            AV40TFPMDEntKgm_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPMDEntKgm_To", GXutil.ltrimstr( AV40TFPMDEntKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOTIN") == 0 )
         {
            AV41TFPMDDtoTin = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPMDDtoTin", GXutil.ltrimstr( AV41TFPMDDtoTin, 6, 2));
            AV42TFPMDDtoTin_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPMDDtoTin_To", GXutil.ltrimstr( AV42TFPMDDtoTin_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOACA") == 0 )
         {
            AV43TFPMDDtoAca = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPMDDtoAca", GXutil.ltrimstr( AV43TFPMDDtoAca, 6, 2));
            AV44TFPMDDtoAca_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMDDtoAca_To", GXutil.ltrimstr( AV44TFPMDDtoAca_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREUNI") == 0 )
         {
            AV45TFPMDPreUni = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMDPreUni", GXutil.ltrimstr( AV45TFPMDPreUni, 14, 5));
            AV46TFPMDPreUni_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDPreUni_To", GXutil.ltrimstr( AV46TFPMDPreUni_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDVALFCH") == 0 )
         {
            AV47TFPMDValFch = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDValFch", localUtil.format(AV47TFPMDValFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV51TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFCliCod), 6, 0));
            AV52TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFCliCod_To), 6, 0));
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPMDDsc_Sel)==0), AV28TFPMDDsc_Sel, GXv_char4) ;
      dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPMDColCli_Sel)==0), AV32TFPMDColCli_Sel, GXv_char3) ;
      dis_dismancod1_prompt_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPMDColNom_Sel)==0), AV36TFPMDColNom_Sel, GXv_char2) ;
      dis_dismancod1_prompt_impl.this.GXt_char11 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char10+"||"+GXt_char11+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPMDDsc)==0), AV27TFPMDDsc, GXv_char4) ;
      dis_dismancod1_prompt_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPMDColCli)==0), AV31TFPMDColCli, GXv_char3) ;
      dis_dismancod1_prompt_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPMDColNom)==0), AV35TFPMDColNom, GXv_char2) ;
      dis_dismancod1_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV25TFPMDCod) ? "" : GXutil.str( AV25TFPMDCod, 4, 0))+"|"+GXt_char11+"|"+((0==AV29TFPMDColNum) ? "" : GXutil.str( AV29TFPMDColNum, 6, 0))+"|"+GXt_char10+"|"+((0==AV33TFPMDConCod) ? "" : GXutil.str( AV33TFPMDConCod, 6, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPMDPreKgm)==0) ? "" : GXutil.str( AV37TFPMDPreKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPMDEntKgm)==0) ? "" : GXutil.str( AV39TFPMDEntKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPMDDtoTin)==0) ? "" : GXutil.str( AV41TFPMDDtoTin, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPMDDtoAca)==0) ? "" : GXutil.str( AV43TFPMDDtoAca, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPMDPreUni)==0) ? "" : GXutil.str( AV45TFPMDPreUni, 14, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47TFPMDValFch)) ? "" : localUtil.dtoc( AV47TFPMDValFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV51TFCliCod) ? "" : GXutil.str( AV51TFCliCod, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV26TFPMDCod_To) ? "" : GXutil.str( AV26TFPMDCod_To, 4, 0))+"||"+((0==AV30TFPMDColNum_To) ? "" : GXutil.str( AV30TFPMDColNum_To, 6, 0))+"||"+((0==AV34TFPMDConCod_To) ? "" : GXutil.str( AV34TFPMDConCod_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPMDPreKgm_To)==0) ? "" : GXutil.str( AV38TFPMDPreKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPMDEntKgm_To)==0) ? "" : GXutil.str( AV40TFPMDEntKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPMDDtoTin_To)==0) ? "" : GXutil.str( AV42TFPMDDtoTin_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPMDDtoAca_To)==0) ? "" : GXutil.str( AV44TFPMDDtoAca_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPMDPreUni_To)==0) ? "" : GXutil.str( AV46TFPMDPreUni_To, 14, 5))+"||"+((0==AV52TFCliCod_To) ? "" : GXutil.str( AV52TFCliCod_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV21Session.getValue(AV60Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV20FilterFullText)==0), (short)(0), AV20FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDCOD", "", !((0==AV25TFPMDCod)&&(0==AV26TFPMDCod_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFPMDCod, 4, 0)), GXutil.trim( GXutil.str( AV26TFPMDCod_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDDSC", "", !(GXutil.strcmp("", AV27TFPMDDsc)==0), (short)(0), AV27TFPMDDsc, "", !(GXutil.strcmp("", AV28TFPMDDsc_Sel)==0), AV28TFPMDDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDCOLNUM", "", !((0==AV29TFPMDColNum)&&(0==AV30TFPMDColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFPMDColNum, 6, 0)), GXutil.trim( GXutil.str( AV30TFPMDColNum_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDCOLCLI", "", !(GXutil.strcmp("", AV31TFPMDColCli)==0), (short)(0), AV31TFPMDColCli, "", !(GXutil.strcmp("", AV32TFPMDColCli_Sel)==0), AV32TFPMDColCli_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDCONCOD", "", !((0==AV33TFPMDConCod)&&(0==AV34TFPMDConCod_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFPMDConCod, 6, 0)), GXutil.trim( GXutil.str( AV34TFPMDConCod_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDCOLNOM", "", !(GXutil.strcmp("", AV35TFPMDColNom)==0), (short)(0), AV35TFPMDColNom, "", !(GXutil.strcmp("", AV36TFPMDColNom_Sel)==0), AV36TFPMDColNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPMDPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPMDPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFPMDPreKgm, 9, 2)), GXutil.trim( GXutil.str( AV38TFPMDPreKgm_To, 9, 2))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDENTKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPMDEntKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPMDEntKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFPMDEntKgm, 9, 2)), GXutil.trim( GXutil.str( AV40TFPMDEntKgm_To, 9, 2))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDDTOTIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPMDDtoTin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPMDDtoTin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFPMDDtoTin, 6, 2)), GXutil.trim( GXutil.str( AV42TFPMDDtoTin_To, 6, 2))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDDTOACA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPMDDtoAca)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPMDDtoAca_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFPMDDtoAca, 6, 2)), GXutil.trim( GXutil.str( AV44TFPMDDtoAca_To, 6, 2))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDPREUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPMDPreUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPMDPreUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV45TFPMDPreUni, 14, 5)), GXutil.trim( GXutil.str( AV46TFPMDPreUni_To, 14, 5))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPMDVALFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47TFPMDValFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV47TFPMDValFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFCLICOD", "", !((0==AV51TFCliCod)&&(0==AV52TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV52TFCliCod_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState12[0] ;
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV60Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.ProgramasTinteClienteModa21" );
      AV21Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e181YO2 ();
      if (returnInSub) return;
   }

   public void e181YO2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV6PMDCod = A8391PMDCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PMDCod), 4, 0));
      AV7PMDDsc = A8392PMDDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PMDDsc", AV7PMDDsc);
      AV9Out_PMDColNum = A8393PMDColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Out_PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Out_PMDColNum), 6, 0));
      httpContext.setWebReturnParms(new Object[] {Short.valueOf(AV6PMDCod),AV7PMDDsc,AV8PmdColCli,Integer.valueOf(AV9Out_PMDColNum)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6PMDCod","AV7PMDDsc","AV8PmdColCli","AV9Out_PMDColNum"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table1_12_1YO2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_17_1YO2( true) ;
      }
      else
      {
         wb_table2_17_1YO2( false) ;
      }
      return  ;
   }

   public void wb_table2_17_1YO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_1YO2e( true) ;
      }
      else
      {
         wb_table1_12_1YO2e( false) ;
      }
   }

   public void wb_table2_17_1YO2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_30_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV20FilterFullText, GXutil.rtrim( localUtil.format( AV20FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Pedidos\\Dis_DisManCod1_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_17_1YO2e( true) ;
      }
      else
      {
         wb_table2_17_1YO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      A252CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AV10In_PMDColNum = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10In_PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10In_PMDColNum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_PMDCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10In_PMDColNum), "ZZZZZ9")));
      AV6PMDCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PMDCod), 4, 0));
      AV7PMDDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PMDDsc", AV7PMDDsc);
      AV8PmdColCli = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8PmdColCli", AV8PmdColCli);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOLCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PmdColCli, ""))));
      AV9Out_PMDColNum = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Out_PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Out_PMDColNum), 6, 0));
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
      pa1YO2( ) ;
      ws1YO2( ) ;
      we1YO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142229", true, true);
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
      httpContext.AddJavascriptSource("pedidos/dis_dismancod1_prompt.js", "?202682116142230", false, true);
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

   public void subsflControlProps_302( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_30_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_30_idx ;
      edtPMDCod_Internalname = "PMDCOD_"+sGXsfl_30_idx ;
      edtPMDDsc_Internalname = "PMDDSC_"+sGXsfl_30_idx ;
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_30_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_30_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_30_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_30_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_30_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_30_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_30_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_30_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_30_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_30_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_302( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_30_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_30_fel_idx ;
      edtPMDCod_Internalname = "PMDCOD_"+sGXsfl_30_fel_idx ;
      edtPMDDsc_Internalname = "PMDDSC_"+sGXsfl_30_fel_idx ;
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_30_fel_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_30_fel_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_30_fel_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_30_fel_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_30_fel_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_30_fel_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_30_fel_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_30_fel_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_30_fel_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_30_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_30_fel_idx ;
   }

   public void sendrow_302( )
   {
      subsflControlProps_302( ) ;
      wb1YO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_30_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_30_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 31,'',false,'"+sGXsfl_30_idx+"',30)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV57Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,31);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_30_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDsc_Internalname,GXutil.rtrim( A8392PMDDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColCli_Internalname,GXutil.rtrim( A8530PMDColCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDConCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDConCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNom_Internalname,GXutil.rtrim( A8394PMDColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDEntKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 ")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDEntKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8397PMDDtoTin, "ZZ9.99 ")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoAca_Internalname,GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8398PMDDtoAca, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDValFch_Internalname,localUtil.format(A8399PMDValFch, "99/99/99"),localUtil.format( A8399PMDValFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDValFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      /* End function sendrow_302 */
   }

   public void startgridcontrol30( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"30\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Prog.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgms. previstos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgms Entrados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dto. Tin.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dto. Aca.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Unico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV57Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8392PMDDsc));
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
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtPMDCod_Internalname = "PMDCOD" ;
      edtPMDDsc_Internalname = "PMDDSC" ;
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
      edtCliCod_Internalname = "CLICOD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtCliCod_Jsonclick = "" ;
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
      edtPMDDsc_Jsonclick = "" ;
      edtPMDCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_pmdvalfchauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable1_Height = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "Pedidos.Dis_DisManCod1_PromptGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic||Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "|T||T||T|||||||" ;
      Ddo_grid_Filterisrange = "T||T||T||T|T|T|T|T||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Date|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6||7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "2:PMDCod|3:PMDDsc|4:PMDColNum|5:PMDColCli|6:PMDConCod|7:PMDColNom|8:PMDPreKgm|9:PMDEntKgm|10:PMDDtoTin|11:PMDDtoAca|12:PMDPreUni|13:PMDValFch|14:CliCod" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Programas Tinte Cliente Moda21", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10In_PMDColNum',fld:'vIN_PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV55GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV56GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121YO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10In_PMDColNum',fld:'vIN_PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131YO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10In_PMDColNum',fld:'vIN_PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141YO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10In_PMDColNum',fld:'vIN_PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171YO2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV57Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111YO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10In_PMDColNum',fld:'vIN_PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25TFPMDCod',fld:'vTFPMDCOD',pic:'ZZZ9'},{av:'AV26TFPMDCod_To',fld:'vTFPMDCOD_TO',pic:'ZZZ9'},{av:'AV27TFPMDDsc',fld:'vTFPMDDSC',pic:''},{av:'AV28TFPMDDsc_Sel',fld:'vTFPMDDSC_SEL',pic:''},{av:'AV29TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV30TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV32TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV33TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV34TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV35TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV36TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV37TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV38TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV39TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV40TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV41TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV42TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV43TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV44TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV45TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV46TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV47TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV51TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV52TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV55GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV56GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e181YO2',iparms:[{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'A8392PMDDsc',fld:'PMDDSC',pic:''},{av:'A8393PMDColNum',fld:'PMDCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV8PmdColCli',fld:'vPMDCOLCLI',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV6PMDCod',fld:'vPMDCOD',pic:'ZZZ9'},{av:'AV7PMDDsc',fld:'vPMDDSC',pic:''},{av:'AV9Out_PMDColNum',fld:'vOUT_PMDCOLNUM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDCOD","{handler:'valid_Pmdcod',iparms:[]");
      setEventMetadata("VALID_PMDCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDDSC","{handler:'valid_Pmddsc',iparms:[]");
      setEventMetadata("VALID_PMDDSC",",oparms:[]}");
      setEventMetadata("VALID_PMDCOLNUM","{handler:'valid_Pmdcolnum',iparms:[]");
      setEventMetadata("VALID_PMDCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_PMDCOLCLI","{handler:'valid_Pmdcolcli',iparms:[]");
      setEventMetadata("VALID_PMDCOLCLI",",oparms:[]}");
      setEventMetadata("VALID_PMDCONCOD","{handler:'valid_Pmdconcod',iparms:[]");
      setEventMetadata("VALID_PMDCONCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDCOLNOM","{handler:'valid_Pmdcolnom',iparms:[]");
      setEventMetadata("VALID_PMDCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_PMDPREKGM","{handler:'valid_Pmdprekgm',iparms:[]");
      setEventMetadata("VALID_PMDPREKGM",",oparms:[]}");
      setEventMetadata("VALID_PMDENTKGM","{handler:'valid_Pmdentkgm',iparms:[]");
      setEventMetadata("VALID_PMDENTKGM",",oparms:[]}");
      setEventMetadata("VALID_PMDDTOTIN","{handler:'valid_Pmddtotin',iparms:[]");
      setEventMetadata("VALID_PMDDTOTIN",",oparms:[]}");
      setEventMetadata("VALID_PMDDTOACA","{handler:'valid_Pmddtoaca',iparms:[]");
      setEventMetadata("VALID_PMDDTOACA",",oparms:[]}");
      setEventMetadata("VALID_PMDPREUNI","{handler:'valid_Pmdpreuni',iparms:[]");
      setEventMetadata("VALID_PMDPREUNI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOAV8PmdColCli = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV7PMDDsc = "" ;
      AV8PmdColCli = "" ;
      AV20FilterFullText = "" ;
      AV27TFPMDDsc = "" ;
      AV28TFPMDDsc_Sel = "" ;
      AV31TFPMDColCli = "" ;
      AV32TFPMDColCli_Sel = "" ;
      AV35TFPMDColNom = "" ;
      AV36TFPMDColNom_Sel = "" ;
      AV37TFPMDPreKgm = DecimalUtil.ZERO ;
      AV38TFPMDPreKgm_To = DecimalUtil.ZERO ;
      AV39TFPMDEntKgm = DecimalUtil.ZERO ;
      AV40TFPMDEntKgm_To = DecimalUtil.ZERO ;
      AV41TFPMDDtoTin = DecimalUtil.ZERO ;
      AV42TFPMDDtoTin_To = DecimalUtil.ZERO ;
      AV43TFPMDDtoAca = DecimalUtil.ZERO ;
      AV44TFPMDDtoAca_To = DecimalUtil.ZERO ;
      AV45TFPMDPreUni = DecimalUtil.ZERO ;
      AV46TFPMDPreUni_To = DecimalUtil.ZERO ;
      AV47TFPMDValFch = GXutil.nullDate() ;
      AV60Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV53DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV49DDO_PMDValFchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV57Select = "" ;
      A8392PMDDsc = "" ;
      A8530PMDColCli = "" ;
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = "" ;
      AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = "" ;
      AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = "" ;
      AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = "" ;
      AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = "" ;
      AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = "" ;
      AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = "" ;
      AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = DecimalUtil.ZERO ;
      AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = DecimalUtil.ZERO ;
      AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = DecimalUtil.ZERO ;
      AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = DecimalUtil.ZERO ;
      AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = DecimalUtil.ZERO ;
      AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = DecimalUtil.ZERO ;
      AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = DecimalUtil.ZERO ;
      AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = DecimalUtil.ZERO ;
      AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = DecimalUtil.ZERO ;
      AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = DecimalUtil.ZERO ;
      AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV65Pedidos_dis_dismancod1_promptds_1_filterfulltext = "" ;
      lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc = "" ;
      lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = "" ;
      H01YO2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01YO2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO2_A8530PMDColCli = new String[] {""} ;
      H01YO2_A8393PMDColNum = new int[1] ;
      H01YO2_A8392PMDDsc = new String[] {""} ;
      H01YO2_n8392PMDDsc = new boolean[] {false} ;
      H01YO2_A8391PMDCod = new short[1] ;
      H01YO2_A396EmprCod = new String[] {""} ;
      H01YO2_A252CliCod = new int[1] ;
      H01YO2_A8531PMDConCod = new int[1] ;
      H01YO3_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01YO3_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO3_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO3_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO3_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO3_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YO3_A8530PMDColCli = new String[] {""} ;
      H01YO3_A8393PMDColNum = new int[1] ;
      H01YO3_A8392PMDDsc = new String[] {""} ;
      H01YO3_n8392PMDDsc = new boolean[] {false} ;
      H01YO3_A8391PMDCod = new short[1] ;
      H01YO3_A396EmprCod = new String[] {""} ;
      H01YO3_A252CliCod = new int[1] ;
      H01YO3_A8531PMDConCod = new int[1] ;
      hsh = "" ;
      AV61Station = "" ;
      AV62Emprcod = "" ;
      AV63Emprnom = "" ;
      AV64Usurcod = "" ;
      AV13HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = new GXBaseCollection[1] ;
      AV21Session = httpContext.getWebSession();
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_dismancod1_prompt__default(),
         new Object[] {
             new Object[] {
            H01YO2_A8399PMDValFch, H01YO2_A8532PMDPreUni, H01YO2_A8398PMDDtoAca, H01YO2_A8397PMDDtoTin, H01YO2_A8396PMDEntKgm, H01YO2_A8395PMDPreKgm, H01YO2_A8530PMDColCli, H01YO2_A8393PMDColNum, H01YO2_A8392PMDDsc, H01YO2_n8392PMDDsc,
            H01YO2_A8391PMDCod, H01YO2_A396EmprCod, H01YO2_A252CliCod, H01YO2_A8531PMDConCod
            }
            , new Object[] {
            H01YO3_A8399PMDValFch, H01YO3_A8532PMDPreUni, H01YO3_A8398PMDDtoAca, H01YO3_A8397PMDDtoTin, H01YO3_A8396PMDEntKgm, H01YO3_A8395PMDPreKgm, H01YO3_A8530PMDColCli, H01YO3_A8393PMDColNum, H01YO3_A8392PMDDsc, H01YO3_n8392PMDDsc,
            H01YO3_A8391PMDCod, H01YO3_A396EmprCod, H01YO3_A252CliCod, H01YO3_A8531PMDConCod
            }
         }
      );
      AV60Pgmname = "Pedidos.Dis_DisManCod1_Prompt" ;
      /* GeneXus formulas. */
      AV60Pgmname = "Pedidos.Dis_DisManCod1_Prompt" ;
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV24ManageFiltersExecutionStep ;
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
   private short AV6PMDCod ;
   private short AV25TFPMDCod ;
   private short AV26TFPMDCod_To ;
   private short AV18OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A8391PMDCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod ;
   private short AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ;
   private int wcpOA252CliCod ;
   private int wcpOAV10In_PMDColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_30 ;
   private int A252CliCod ;
   private int AV10In_PMDColNum ;
   private int AV9Out_PMDColNum ;
   private int nGXsfl_30_idx=1 ;
   private int AV29TFPMDColNum ;
   private int AV30TFPMDColNum_To ;
   private int AV33TFPMDConCod ;
   private int AV34TFPMDConCod_To ;
   private int AV51TFCliCod ;
   private int AV52TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable1_Height ;
   private int edtavPgmname_Enabled ;
   private int A8393PMDColNum ;
   private int A8531PMDConCod ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ;
   private int AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ;
   private int AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ;
   private int AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ;
   private int AV89Pedidos_dis_dismancod1_promptds_25_tfclicod ;
   private int AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to ;
   private int AV54PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV55GridCurrentPage ;
   private long AV56GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV37TFPMDPreKgm ;
   private java.math.BigDecimal AV38TFPMDPreKgm_To ;
   private java.math.BigDecimal AV39TFPMDEntKgm ;
   private java.math.BigDecimal AV40TFPMDEntKgm_To ;
   private java.math.BigDecimal AV41TFPMDDtoTin ;
   private java.math.BigDecimal AV42TFPMDDtoTin_To ;
   private java.math.BigDecimal AV43TFPMDDtoAca ;
   private java.math.BigDecimal AV44TFPMDDtoAca_To ;
   private java.math.BigDecimal AV45TFPMDPreUni ;
   private java.math.BigDecimal AV46TFPMDPreUni_To ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ;
   private java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ;
   private java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ;
   private java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ;
   private java.math.BigDecimal AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ;
   private java.math.BigDecimal AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ;
   private java.math.BigDecimal AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ;
   private java.math.BigDecimal AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ;
   private java.math.BigDecimal AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ;
   private java.math.BigDecimal AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ;
   private String wcpOA396EmprCod ;
   private String wcpOAV8PmdColCli ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV7PMDDsc ;
   private String AV8PmdColCli ;
   private String sGXsfl_30_idx="0001" ;
   private String AV27TFPMDDsc ;
   private String AV28TFPMDDsc_Sel ;
   private String AV31TFPMDColCli ;
   private String AV32TFPMDColCli_Sel ;
   private String AV35TFPMDColNom ;
   private String AV36TFPMDColNom_Sel ;
   private String AV60Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_pmdvalfchauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_pmdvalfchauxdate_Internalname ;
   private String edtavDdo_pmdvalfchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV57Select ;
   private String edtavSelect_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtPMDCod_Internalname ;
   private String A8392PMDDsc ;
   private String edtPMDDsc_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ;
   private String AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ;
   private String AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ;
   private String AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ;
   private String AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ;
   private String AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ;
   private String scmdbuf ;
   private String lV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ;
   private String lV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ;
   private String hsh ;
   private String AV61Station ;
   private String AV62Emprcod ;
   private String AV63Emprnom ;
   private String AV64Usurcod ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_30_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtPMDCod_Jsonclick ;
   private String edtPMDDsc_Jsonclick ;
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
   private String edtCliCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV47TFPMDValFch ;
   private java.util.Date AV49DDO_PMDValFchAuxDate ;
   private java.util.Date A8399PMDValFch ;
   private java.util.Date AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n8392PMDDsc ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV23ManageFiltersXml ;
   private String AV20FilterFullText ;
   private String AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ;
   private String lV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01YO2_A8399PMDValFch ;
   private java.math.BigDecimal[] H01YO2_A8532PMDPreUni ;
   private java.math.BigDecimal[] H01YO2_A8398PMDDtoAca ;
   private java.math.BigDecimal[] H01YO2_A8397PMDDtoTin ;
   private java.math.BigDecimal[] H01YO2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] H01YO2_A8395PMDPreKgm ;
   private String[] H01YO2_A8530PMDColCli ;
   private int[] H01YO2_A8393PMDColNum ;
   private String[] H01YO2_A8392PMDDsc ;
   private boolean[] H01YO2_n8392PMDDsc ;
   private short[] H01YO2_A8391PMDCod ;
   private String[] H01YO2_A396EmprCod ;
   private int[] H01YO2_A252CliCod ;
   private int[] H01YO2_A8531PMDConCod ;
   private java.util.Date[] H01YO3_A8399PMDValFch ;
   private java.math.BigDecimal[] H01YO3_A8532PMDPreUni ;
   private java.math.BigDecimal[] H01YO3_A8398PMDDtoAca ;
   private java.math.BigDecimal[] H01YO3_A8397PMDDtoTin ;
   private java.math.BigDecimal[] H01YO3_A8396PMDEntKgm ;
   private java.math.BigDecimal[] H01YO3_A8395PMDPreKgm ;
   private String[] H01YO3_A8530PMDColCli ;
   private int[] H01YO3_A8393PMDColNum ;
   private String[] H01YO3_A8392PMDDsc ;
   private boolean[] H01YO3_n8392PMDDsc ;
   private short[] H01YO3_A8391PMDCod ;
   private String[] H01YO3_A396EmprCod ;
   private int[] H01YO3_A252CliCod ;
   private int[] H01YO3_A8531PMDConCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV53DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class dis_dismancod1_prompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01YO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod ,
                                          short AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ,
                                          String AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                          String AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                          int AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ,
                                          int AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ,
                                          String AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                          String AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                          int AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ,
                                          int AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ,
                                          java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                          java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                          java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                          java.math.BigDecimal AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                          java.math.BigDecimal AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                          java.math.BigDecimal AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                          java.math.BigDecimal AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                          java.util.Date AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                          int AV89Pedidos_dis_dismancod1_promptds_25_tfclicod ,
                                          int AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A252CliCod ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                          String A8394PMDColNom ,
                                          String AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                          String AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[25];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T1.PMDColCli, T1.PMDColNum, T2.PMDDsc, T1.PMDCod, T1.EmprCod, T1.CliCod," ;
      scmdbuf += " T1.PMDConCod FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( ! (0==AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (0==AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(T1.PMDColNum >= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(T1.PMDColNum <= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDConCod <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (0==AV89Pedidos_dis_dismancod1_promptds_25_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod, T1.PMDColNum" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PMDDsc" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PMDDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDColNum" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDColNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDColCli" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDColCli DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDConCod" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDConCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDPreKgm" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDPreKgm DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDEntKgm" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDEntKgm DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDDtoTin" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDDtoTin DESC" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDDtoAca" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDDtoAca DESC" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDPreUni" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDPreUni DESC" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDValFch" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDValFch DESC" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01YO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod ,
                                          short AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ,
                                          String AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                          String AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                          int AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ,
                                          int AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ,
                                          String AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                          String AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                          int AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ,
                                          int AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ,
                                          java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                          java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                          java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                          java.math.BigDecimal AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                          java.math.BigDecimal AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                          java.math.BigDecimal AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                          java.math.BigDecimal AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                          java.util.Date AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                          int AV89Pedidos_dis_dismancod1_promptds_25_tfclicod ,
                                          int AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A252CliCod ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV65Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                          String A8394PMDColNom ,
                                          String AV77Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                          String AV76Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[25];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T1.PMDColCli, T1.PMDColNum, T2.PMDDsc, T1.PMDCod, T1.EmprCod, T1.CliCod," ;
      scmdbuf += " T1.PMDConCod FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      if ( ! (0==AV66Pedidos_dis_dismancod1_promptds_2_tfpmdcod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (0==AV67Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Pedidos_dis_dismancod1_promptds_4_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (0==AV70Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(T1.PMDColNum >= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(T1.PMDColNum <= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDConCod <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_dis_dismancod1_promptds_18_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (0==AV89Pedidos_dis_dismancod1_promptds_25_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis_dismancod1_promptds_26_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod, T1.PMDColNum" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PMDDsc" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PMDDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDColNum" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDColNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDColCli" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDColCli DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDConCod" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDConCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDPreKgm" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDPreKgm DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDEntKgm" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDEntKgm DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDDtoTin" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDDtoTin DESC" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDDtoAca" ;
      }
      else if ( ( AV18OrderedBy == 10 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDDtoAca DESC" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDPreUni" ;
      }
      else if ( ( AV18OrderedBy == 11 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDPreUni DESC" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDValFch" ;
      }
      else if ( ( AV18OrderedBy == 12 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDValFch DESC" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV18OrderedBy == 13 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H01YO2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H01YO3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
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
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
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
      }
   }

}

