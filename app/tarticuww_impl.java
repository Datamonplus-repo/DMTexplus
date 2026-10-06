package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticuww_impl extends GXDataArea
{
   public tarticuww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticuww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticuww_impl.class ));
   }

   public tarticuww_impl( int remoteHandle ,
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV138FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV56ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV51ColumnsSelector);
      AV58TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV59TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV67TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV68TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV61TFArtCod = httpContext.GetPar( "TFArtCod") ;
      AV62TFArtCod_Sel = httpContext.GetPar( "TFArtCod_Sel") ;
      AV79TFArtDsc = httpContext.GetPar( "TFArtDsc") ;
      AV80TFArtDsc_Sel = httpContext.GetPar( "TFArtDsc_Sel") ;
      AV73TFTipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TFTipArtCod"))) ;
      AV74TFTipArtCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTipArtCod_To"))) ;
      AV76TFTipArtDsc = httpContext.GetPar( "TFTipArtDsc") ;
      AV77TFTipArtDsc_Sel = httpContext.GetPar( "TFTipArtDsc_Sel") ;
      AV82TFArtPml = (short)(GXutil.lval( httpContext.GetPar( "TFArtPml"))) ;
      AV83TFArtPml_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtPml_To"))) ;
      AV153TFArtGraAca = (short)(GXutil.lval( httpContext.GetPar( "TFArtGraAca"))) ;
      AV154TFArtGraAca_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtGraAca_To"))) ;
      AV100TFArtRen = CommonUtil.decimalVal( httpContext.GetPar( "TFArtRen"), ".") ;
      AV101TFArtRen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFArtRen_To"), ".") ;
      AV94TFArtAcaMin = (short)(GXutil.lval( httpContext.GetPar( "TFArtAcaMin"))) ;
      AV95TFArtAcaMin_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtAcaMin_To"))) ;
      AV171TFArtComer = httpContext.GetPar( "TFArtComer") ;
      AV172TFArtComer_Sel = httpContext.GetPar( "TFArtComer_Sel") ;
      AV183Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV151Acaqui = httpContext.GetPar( "Acaqui") ;
      AV150Velluts = (short)(GXutil.lval( httpContext.GetPar( "Velluts"))) ;
      AV160Ver_p = httpContext.GetPar( "Ver_p") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A759ProDsc = httpContext.GetPar( "ProDsc") ;
      A10412ProAct = httpContext.GetPar( "ProAct") ;
      A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
      AV152EmprCod = httpContext.GetPar( "EmprCod") ;
      AV156Clicodp = (int)(GXutil.lval( httpContext.GetPar( "Clicodp"))) ;
      AV157Artcodp = httpContext.GetPar( "Artcodp") ;
      A586IntPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "IntPreKgm"), ".") ;
      n586IntPreKgm = false ;
      A587IntPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "IntPreMtr"), ".") ;
      n587IntPreMtr = false ;
      A10972Int_cod = (byte)(GXutil.lval( httpContext.GetPar( "Int_cod"))) ;
      A11043Int_Un = httpContext.GetPar( "Int_Un") ;
      A10969Int_Pk = CommonUtil.decimalVal( httpContext.GetPar( "Int_Pk"), ".") ;
      n10969Int_Pk = false ;
      A10970Int_Pm = CommonUtil.decimalVal( httpContext.GetPar( "Int_Pm"), ".") ;
      n10970Int_Pm = false ;
      A4898ArtProCod = httpContext.GetPar( "ArtProCod") ;
      AV159ProCodp = httpContext.GetPar( "ProCodp") ;
      AV175Salayet = (byte)(GXutil.lval( httpContext.GetPar( "Salayet"))) ;
      AV176PLinea = (byte)(GXutil.lval( httpContext.GetPar( "PLinea"))) ;
      AV177Agepunt = (byte)(GXutil.lval( httpContext.GetPar( "Agepunt"))) ;
      AV178EmprDes = httpContext.GetPar( "EmprDes") ;
      AV180AltaArticulos = (byte)(GXutil.lval( httpContext.GetPar( "AltaArticulos"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
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
      pa912( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start912( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tarticuww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACAQUI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV151Acaqui, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVELLUTS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV150Velluts), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVER_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV160Ver_p, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV156Clicodp), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Artcodp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV175Salayet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176PLinea), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAGEPUNT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV177Agepunt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRDES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178EmprDes, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALTAARTICULOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180AltaArticulos), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TARTICUWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV183Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticuww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV138FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV54ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV54ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV129GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV130GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV127DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV127DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV51ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV51ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV56ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV58TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV67TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV68TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD", GXutil.rtrim( AV61TFArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD_SEL", GXutil.rtrim( AV62TFArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC", GXutil.rtrim( AV79TFArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC_SEL", GXutil.rtrim( AV80TFArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV73TFTipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV74TFTipArtCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTDSC", GXutil.rtrim( AV76TFTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTDSC_SEL", GXutil.rtrim( AV77TFTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTPML", GXutil.ltrim( localUtil.ntoc( AV82TFArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTPML_TO", GXutil.ltrim( localUtil.ntoc( AV83TFArtPml_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTGRAACA", GXutil.ltrim( localUtil.ntoc( AV153TFArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTGRAACA_TO", GXutil.ltrim( localUtil.ntoc( AV154TFArtGraAca_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTREN", GXutil.ltrim( localUtil.ntoc( AV100TFArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTREN_TO", GXutil.ltrim( localUtil.ntoc( AV101TFArtRen_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTACAMIN", GXutil.ltrim( localUtil.ntoc( AV94TFArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTACAMIN_TO", GXutil.ltrim( localUtil.ntoc( AV95TFArtAcaMin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOMER", GXutil.rtrim( AV171TFArtComer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOMER_SEL", GXutil.rtrim( AV172TFArtComer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vACAQUI", GXutil.rtrim( AV151Acaqui));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACAQUI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV151Acaqui, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVELLUTS", GXutil.ltrim( localUtil.ntoc( AV150Velluts, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVELLUTS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV150Velluts), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTLOTKGS", GXutil.ltrim( localUtil.ntoc( A4454ArtLotKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTLOTMTS", GXutil.ltrim( localUtil.ntoc( A4453ArtLotMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVER_P", GXutil.rtrim( AV160Ver_p));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVER_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV160Ver_p, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC", GXutil.rtrim( A759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PROACT", GXutil.rtrim( A10412ProAct));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCOD", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV152EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODP", GXutil.ltrim( localUtil.ntoc( AV156Clicodp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV156Clicodp), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCODP", GXutil.rtrim( AV157Artcodp));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Artcodp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "INTPREKGM", GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTPREMTR", GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_COD", GXutil.ltrim( localUtil.ntoc( A10972Int_cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_UN", GXutil.rtrim( A11043Int_Un));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_PK", GXutil.ltrim( localUtil.ntoc( A10969Int_Pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INT_PM", GXutil.ltrim( localUtil.ntoc( A10970Int_Pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTPROCOD", GXutil.rtrim( A4898ArtProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCODP", GXutil.rtrim( AV159ProCodp));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSALAYET", GXutil.ltrim( localUtil.ntoc( AV175Salayet, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV175Salayet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLINEA", GXutil.ltrim( localUtil.ntoc( AV176PLinea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176PLinea), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAGEPUNT", GXutil.ltrim( localUtil.ntoc( AV177Agepunt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAGEPUNT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV177Agepunt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRDES", GXutil.rtrim( AV178EmprDes));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRDES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178EmprDes, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALTAARTICULOS", GXutil.ltrim( localUtil.ntoc( AV180AltaArticulos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALTAARTICULOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180AltaArticulos), "9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
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
         we912( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt912( ) ;
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
      return formatLink("app.tarticuww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TARTICUWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ficha Tecnica (Articulo)", "") ;
   }

   public void wb910( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_912( true) ;
      }
      else
      {
         wb_table1_27_912( false) ;
      }
      return  ;
   }

   public void wb_table1_27_912e( boolean wbgen )
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV129GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV130GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV183Pgmname), GXutil.rtrim( localUtil.format( AV183Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICUWW.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV127DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV127DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV51ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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

   public void start912( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ficha Tecnica (Articulo)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup910( ) ;
   }

   public void ws912( )
   {
      start912( ) ;
      evt912( ) ;
   }

   public void evt912( )
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
                           e11912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18912 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19912 ();
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
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV139GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
                           A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
                           n69ArtDsc = false ;
                           A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
                           n830TipArtDsc = false ;
                           A1148ArtPml = (short)(localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1148ArtPml = false ;
                           A1903ArtGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1903ArtGraAca = false ;
                           A95ArtRen = localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)) ;
                           n95ArtRen = false ;
                           A63ArtAcaMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n63ArtAcaMin = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNPROC");
                              GX_FocusControl = edtavNproc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV148NProc = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NProc), 4, 0));
                           }
                           else
                           {
                              AV148NProc = (short)(localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NProc), 4, 0));
                           }
                           AV146ProCods = httpContext.cgiGet( edtavProcods_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProcods_Internalname, AV146ProCods);
                           AV147ProDscs = httpContext.cgiGet( edtavProdscs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV147ProDscs);
                           AV149ArtProCod = httpContext.cgiGet( edtavArtprocod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
                           A5741ArtComer = httpContext.cgiGet( edtArtComer_Internalname) ;
                           n5741ArtComer = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV138FilterFullText) != 0 )
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

   public void we912( )
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

   public void pa912( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV138FilterFullText ,
                                 byte AV56ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelector ,
                                 int AV58TFCliCod ,
                                 int AV59TFCliCod_To ,
                                 String AV67TFCliNom ,
                                 String AV68TFCliNom_Sel ,
                                 String AV61TFArtCod ,
                                 String AV62TFArtCod_Sel ,
                                 String AV79TFArtDsc ,
                                 String AV80TFArtDsc_Sel ,
                                 short AV73TFTipArtCod ,
                                 short AV74TFTipArtCod_To ,
                                 String AV76TFTipArtDsc ,
                                 String AV77TFTipArtDsc_Sel ,
                                 short AV82TFArtPml ,
                                 short AV83TFArtPml_To ,
                                 short AV153TFArtGraAca ,
                                 short AV154TFArtGraAca_To ,
                                 java.math.BigDecimal AV100TFArtRen ,
                                 java.math.BigDecimal AV101TFArtRen_To ,
                                 short AV94TFArtAcaMin ,
                                 short AV95TFArtAcaMin_To ,
                                 String AV171TFArtComer ,
                                 String AV172TFArtComer_Sel ,
                                 String AV183Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV151Acaqui ,
                                 short AV150Velluts ,
                                 String AV160Ver_p ,
                                 String A758ProCod ,
                                 String A759ProDsc ,
                                 String A10412ProAct ,
                                 byte A831TipColCod ,
                                 byte A583IntCod ,
                                 String AV152EmprCod ,
                                 int AV156Clicodp ,
                                 String AV157Artcodp ,
                                 java.math.BigDecimal A586IntPreKgm ,
                                 java.math.BigDecimal A587IntPreMtr ,
                                 byte A10972Int_cod ,
                                 String A11043Int_Un ,
                                 java.math.BigDecimal A10969Int_Pk ,
                                 java.math.BigDecimal A10970Int_Pm ,
                                 String A4898ArtProCod ,
                                 String AV159ProCodp ,
                                 byte AV175Salayet ,
                                 byte AV176PLinea ,
                                 byte AV177Agepunt ,
                                 String AV178EmprDes ,
                                 byte AV180AltaArticulos )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21912 ();
      GRID_nCurrentRecord = 0 ;
      rf912( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TARTICUWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV183Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticuww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf912( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV183Pgmname = "TARTICUWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV183Pgmname", AV183Pgmname);
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf912( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21912 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
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
         subsflControlProps_452( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV184Tarticuwwds_1_filterfulltext ,
                                              Integer.valueOf(AV185Tarticuwwds_2_tfclicod) ,
                                              Integer.valueOf(AV186Tarticuwwds_3_tfclicod_to) ,
                                              AV188Tarticuwwds_5_tfclinom_sel ,
                                              AV187Tarticuwwds_4_tfclinom ,
                                              AV190Tarticuwwds_7_tfartcod_sel ,
                                              AV189Tarticuwwds_6_tfartcod ,
                                              AV192Tarticuwwds_9_tfartdsc_sel ,
                                              AV191Tarticuwwds_8_tfartdsc ,
                                              Short.valueOf(AV193Tarticuwwds_10_tftipartcod) ,
                                              Short.valueOf(AV194Tarticuwwds_11_tftipartcod_to) ,
                                              AV196Tarticuwwds_13_tftipartdsc_sel ,
                                              AV195Tarticuwwds_12_tftipartdsc ,
                                              Short.valueOf(AV197Tarticuwwds_14_tfartpml) ,
                                              Short.valueOf(AV198Tarticuwwds_15_tfartpml_to) ,
                                              Short.valueOf(AV199Tarticuwwds_16_tfartgraaca) ,
                                              Short.valueOf(AV200Tarticuwwds_17_tfartgraaca_to) ,
                                              AV201Tarticuwwds_18_tfartren ,
                                              AV202Tarticuwwds_19_tfartren_to ,
                                              Short.valueOf(AV203Tarticuwwds_20_tfartacamin) ,
                                              Short.valueOf(AV204Tarticuwwds_21_tfartacamin_to) ,
                                              AV206Tarticuwwds_23_tfartcomer_sel ,
                                              AV205Tarticuwwds_22_tfartcomer ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A65ArtCod ,
                                              A69ArtDsc ,
                                              Short.valueOf(A829TipArtCod) ,
                                              A830TipArtDsc ,
                                              Short.valueOf(A1148ArtPml) ,
                                              Short.valueOf(A1903ArtGraAca) ,
                                              A95ArtRen ,
                                              Short.valueOf(A63ArtAcaMin) ,
                                              A5741ArtComer ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A10045CliAct } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV184Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV184Tarticuwwds_1_filterfulltext), "%", "") ;
         lV187Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV187Tarticuwwds_4_tfclinom), 30, "%") ;
         lV189Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV189Tarticuwwds_6_tfartcod), 16, "%") ;
         lV191Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV191Tarticuwwds_8_tfartdsc), 26, "%") ;
         lV195Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV195Tarticuwwds_12_tftipartdsc), 30, "%") ;
         lV205Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV205Tarticuwwds_22_tfartcomer), 16, "%") ;
         /* Using cursor H00912 */
         pr_default.execute(0, new Object[] {lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, lV184Tarticuwwds_1_filterfulltext, Integer.valueOf(AV185Tarticuwwds_2_tfclicod), Integer.valueOf(AV186Tarticuwwds_3_tfclicod_to), lV187Tarticuwwds_4_tfclinom, AV188Tarticuwwds_5_tfclinom_sel, lV189Tarticuwwds_6_tfartcod, AV190Tarticuwwds_7_tfartcod_sel, lV191Tarticuwwds_8_tfartdsc, AV192Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV193Tarticuwwds_10_tftipartcod), Short.valueOf(AV194Tarticuwwds_11_tftipartcod_to), lV195Tarticuwwds_12_tftipartdsc, AV196Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV197Tarticuwwds_14_tfartpml), Short.valueOf(AV198Tarticuwwds_15_tfartpml_to), Short.valueOf(AV199Tarticuwwds_16_tfartgraaca), Short.valueOf(AV200Tarticuwwds_17_tfartgraaca_to), AV201Tarticuwwds_18_tfartren, AV202Tarticuwwds_19_tfartren_to, Short.valueOf(AV203Tarticuwwds_20_tfartacamin), Short.valueOf(AV204Tarticuwwds_21_tfartacamin_to), lV205Tarticuwwds_22_tfartcomer, AV206Tarticuwwds_23_tfartcomer_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A65ArtCod = H00912_A65ArtCod[0] ;
            A252CliCod = H00912_A252CliCod[0] ;
            A396EmprCod = H00912_A396EmprCod[0] ;
            A10045CliAct = H00912_A10045CliAct[0] ;
            A4453ArtLotMts = H00912_A4453ArtLotMts[0] ;
            n4453ArtLotMts = H00912_n4453ArtLotMts[0] ;
            A4454ArtLotKgs = H00912_A4454ArtLotKgs[0] ;
            n4454ArtLotKgs = H00912_n4454ArtLotKgs[0] ;
            A5741ArtComer = H00912_A5741ArtComer[0] ;
            n5741ArtComer = H00912_n5741ArtComer[0] ;
            A63ArtAcaMin = H00912_A63ArtAcaMin[0] ;
            n63ArtAcaMin = H00912_n63ArtAcaMin[0] ;
            A95ArtRen = H00912_A95ArtRen[0] ;
            n95ArtRen = H00912_n95ArtRen[0] ;
            A1903ArtGraAca = H00912_A1903ArtGraAca[0] ;
            n1903ArtGraAca = H00912_n1903ArtGraAca[0] ;
            A1148ArtPml = H00912_A1148ArtPml[0] ;
            n1148ArtPml = H00912_n1148ArtPml[0] ;
            A830TipArtDsc = H00912_A830TipArtDsc[0] ;
            n830TipArtDsc = H00912_n830TipArtDsc[0] ;
            A829TipArtCod = H00912_A829TipArtCod[0] ;
            A69ArtDsc = H00912_A69ArtDsc[0] ;
            n69ArtDsc = H00912_n69ArtDsc[0] ;
            A279CliNom = H00912_A279CliNom[0] ;
            A10045CliAct = H00912_A10045CliAct[0] ;
            A279CliNom = H00912_A279CliNom[0] ;
            A830TipArtDsc = H00912_A830TipArtDsc[0] ;
            n830TipArtDsc = H00912_n830TipArtDsc[0] ;
            e22912 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb910( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes912( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vACAQUI", GXutil.rtrim( AV151Acaqui));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACAQUI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV151Acaqui, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVELLUTS", GXutil.ltrim( localUtil.ntoc( AV150Velluts, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVELLUTS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV150Velluts), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVER_P", GXutil.rtrim( AV160Ver_p));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVER_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV160Ver_p, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV152EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODP", GXutil.ltrim( localUtil.ntoc( AV156Clicodp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV156Clicodp), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCODP", GXutil.rtrim( AV157Artcodp));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Artcodp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCODP", GXutil.rtrim( AV159ProCodp));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALAYET", GXutil.ltrim( localUtil.ntoc( AV175Salayet, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV175Salayet), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLINEA", GXutil.ltrim( localUtil.ntoc( AV176PLinea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176PLinea), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAGEPUNT", GXutil.ltrim( localUtil.ntoc( AV177Agepunt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAGEPUNT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV177Agepunt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRDES", GXutil.rtrim( AV178EmprDes));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRDES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178EmprDes, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALTAARTICULOS", GXutil.ltrim( localUtil.ntoc( AV180AltaArticulos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALTAARTICULOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180AltaArticulos), "9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(GRID_nFirstRecordOnPage+1) ;
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
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV138FilterFullText, AV56ManageFiltersExecutionStep, AV51ColumnsSelector, AV58TFCliCod, AV59TFCliCod_To, AV67TFCliNom, AV68TFCliNom_Sel, AV61TFArtCod, AV62TFArtCod_Sel, AV79TFArtDsc, AV80TFArtDsc_Sel, AV73TFTipArtCod, AV74TFTipArtCod_To, AV76TFTipArtDsc, AV77TFTipArtDsc_Sel, AV82TFArtPml, AV83TFArtPml_To, AV153TFArtGraAca, AV154TFArtGraAca_To, AV100TFArtRen, AV101TFArtRen_To, AV94TFArtAcaMin, AV95TFArtAcaMin_To, AV171TFArtComer, AV172TFArtComer_Sel, AV183Pgmname, AV13OrderedBy, AV14OrderedDsc, AV151Acaqui, AV150Velluts, AV160Ver_p, A758ProCod, A759ProDsc, A10412ProAct, A831TipColCod, A583IntCod, AV152EmprCod, AV156Clicodp, AV157Artcodp, A586IntPreKgm, A587IntPreMtr, A10972Int_cod, A11043Int_Un, A10969Int_Pk, A10970Int_Pm, A4898ArtProCod, AV159ProCodp, AV175Salayet, AV176PLinea, AV177Agepunt, AV178EmprDes, AV180AltaArticulos) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV183Pgmname = "TARTICUWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV183Pgmname", AV183Pgmname);
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup910( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20912 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV54ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV127DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV51ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV129GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV130GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV138FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138FilterFullText", AV138FilterFullText);
         AV183Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV183Pgmname", AV183Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TARTICUWW");
         AV183Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV183Pgmname", AV183Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV183Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tarticuww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV138FilterFullText) != 0 )
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
      e20912 ();
      if (returnInSub) return;
   }

   public void e20912( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV140Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticuww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV140Station = GXt_char1 ;
      GXv_char2[0] = AV152EmprCod ;
      GXv_char3[0] = AV141EmprNom ;
      GXv_char4[0] = AV142UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV140Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticuww_impl.this.AV152EmprCod = GXv_char2[0] ;
      tarticuww_impl.this.AV141EmprNom = GXv_char3[0] ;
      tarticuww_impl.this.AV142UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152EmprCod", AV152EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV152EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Ficha Tecnica (Articulo)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV127DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV127DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV165Tintutex ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV165Tintutex = GXt_int7 ;
      GXt_int7 = AV166Texfina ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV166Texfina = GXt_int7 ;
      GXt_int7 = AV167FlagHilo ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "HILO", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV167FlagHilo = GXt_int7 ;
      GXt_int7 = AV168vFlagMB ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV168vFlagMB = GXt_int7 ;
      GXt_int7 = AV173Induyco ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV173Induyco = GXt_int7 ;
      GXt_int7 = AV169Tas ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "TAS", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV169Tas = GXt_int7 ;
      GXt_int7 = AV170Sedamil ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV152EmprCod, httpContext.getMessage( "SEDAMI", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV170Sedamil = GXt_int7 ;
      AV175Salayet = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV175Salayet", GXutil.str( AV175Salayet, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV175Salayet), "9")));
      GXt_int7 = AV175Salayet ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV175Salayet = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV175Salayet", GXutil.str( AV175Salayet, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALAYET", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV175Salayet), "9")));
      AV176PLinea = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176PLinea", GXutil.str( AV176PLinea, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176PLinea), "9")));
      GXt_int7 = AV176PLinea ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV176PLinea = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176PLinea", GXutil.str( AV176PLinea, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV176PLinea), "9")));
      GXt_int7 = AV177Agepunt ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AGEPUN", ""), GXv_int8) ;
      tarticuww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV177Agepunt = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV177Agepunt", GXutil.str( AV177Agepunt, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAGEPUNT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV177Agepunt), "9")));
      AV180AltaArticulos = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180AltaArticulos", GXutil.str( AV180AltaArticulos, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALTAARTICULOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180AltaArticulos), "9")));
      GXt_int9 = AV179DupEmp ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DUPEMP", ""), GXv_int10) ;
      tarticuww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV179DupEmp = GXt_int9 ;
      if ( AV179DupEmp > 0 )
      {
         if ( AV179DupEmp < 10 )
         {
            AV178EmprDes = "00" + GXutil.ltrim( GXutil.str( AV179DupEmp, 8, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178EmprDes", AV178EmprDes);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRDES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178EmprDes, "@!"))));
         }
         else
         {
            AV178EmprDes = "0" + GXutil.ltrim( GXutil.str( AV179DupEmp, 8, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178EmprDes", AV178EmprDes);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRDES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178EmprDes, "@!"))));
         }
      }
   }

   public void e21912( )
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
      if ( AV56ManageFiltersExecutionStep == 1 )
      {
         AV56ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ManageFiltersExecutionStep", GXutil.str( AV56ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV56ManageFiltersExecutionStep == 2 )
      {
         AV56ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ManageFiltersExecutionStep", GXutil.str( AV56ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV53Session.getValue("TARTICUWWColumnsSelector"), "") != 0 )
      {
         AV49ColumnsSelectorXML = AV53Session.getValue("TARTICUWWColumnsSelector") ;
         AV51ColumnsSelector.fromxml(AV49ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtPml_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPml_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPml_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtGraAca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraAca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraAca_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtRen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRen_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtAcaMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAcaMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAcaMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavNproc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtComer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV51ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtComer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtComer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV129GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridCurrentPage), 10, 0));
      AV130GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130GridPageCount), 10, 0));
      AV184Tarticuwwds_1_filterfulltext = AV138FilterFullText ;
      AV185Tarticuwwds_2_tfclicod = AV58TFCliCod ;
      AV186Tarticuwwds_3_tfclicod_to = AV59TFCliCod_To ;
      AV187Tarticuwwds_4_tfclinom = AV67TFCliNom ;
      AV188Tarticuwwds_5_tfclinom_sel = AV68TFCliNom_Sel ;
      AV189Tarticuwwds_6_tfartcod = AV61TFArtCod ;
      AV190Tarticuwwds_7_tfartcod_sel = AV62TFArtCod_Sel ;
      AV191Tarticuwwds_8_tfartdsc = AV79TFArtDsc ;
      AV192Tarticuwwds_9_tfartdsc_sel = AV80TFArtDsc_Sel ;
      AV193Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV194Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV195Tarticuwwds_12_tftipartdsc = AV76TFTipArtDsc ;
      AV196Tarticuwwds_13_tftipartdsc_sel = AV77TFTipArtDsc_Sel ;
      AV197Tarticuwwds_14_tfartpml = AV82TFArtPml ;
      AV198Tarticuwwds_15_tfartpml_to = AV83TFArtPml_To ;
      AV199Tarticuwwds_16_tfartgraaca = AV153TFArtGraAca ;
      AV200Tarticuwwds_17_tfartgraaca_to = AV154TFArtGraAca_To ;
      AV201Tarticuwwds_18_tfartren = AV100TFArtRen ;
      AV202Tarticuwwds_19_tfartren_to = AV101TFArtRen_To ;
      AV203Tarticuwwds_20_tfartacamin = AV94TFArtAcaMin ;
      AV204Tarticuwwds_21_tfartacamin_to = AV95TFArtAcaMin_To ;
      AV205Tarticuwwds_22_tfartcomer = AV171TFArtComer ;
      AV206Tarticuwwds_23_tfartcomer_sel = AV172TFArtComer_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ColumnsSelector", AV51ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ManageFiltersData", AV54ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12912( )
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
         AV128PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV128PageToGo) ;
      }
   }

   public void e13912( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14912( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV67TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom", AV67TFCliNom);
            AV68TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom_Sel", AV68TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtCod") == 0 )
         {
            AV61TFArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFArtCod", AV61TFArtCod);
            AV62TFArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFArtCod_Sel", AV62TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtDsc") == 0 )
         {
            AV79TFArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFArtDsc", AV79TFArtDsc);
            AV80TFArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFArtDsc_Sel", AV80TFArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipArtCod") == 0 )
         {
            AV73TFTipArtCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFTipArtCod), 4, 0));
            AV74TFTipArtCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFTipArtCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipArtDsc") == 0 )
         {
            AV76TFTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipArtDsc", AV76TFTipArtDsc);
            AV77TFTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipArtDsc_Sel", AV77TFTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtPml") == 0 )
         {
            AV82TFArtPml = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFArtPml), 4, 0));
            AV83TFArtPml_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFArtPml_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtGraAca") == 0 )
         {
            AV153TFArtGraAca = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153TFArtGraAca), 4, 0));
            AV154TFArtGraAca_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFArtGraAca_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtRen") == 0 )
         {
            AV100TFArtRen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFArtRen", GXutil.ltrimstr( AV100TFArtRen, 6, 2));
            AV101TFArtRen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFArtRen_To", GXutil.ltrimstr( AV101TFArtRen_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtAcaMin") == 0 )
         {
            AV94TFArtAcaMin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFArtAcaMin), 3, 0));
            AV95TFArtAcaMin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFArtAcaMin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtComer") == 0 )
         {
            AV171TFArtComer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV171TFArtComer", AV171TFArtComer);
            AV172TFArtComer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFArtComer_Sel", AV172TFArtComer_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22912( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar Artículo", ""), "fas fa-clone", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fa fa-cog", "", "", "", "", "", "", ""), (short)(0));
      AV155TipArtDsc = A830TipArtDsc ;
      AV148NProc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NProc), 4, 0));
      AV156Clicodp = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156Clicodp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156Clicodp), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV156Clicodp), "ZZZZZ9")));
      AV157Artcodp = A65ArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157Artcodp", AV157Artcodp);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Artcodp, ""))));
      /* Execute user subroutine: 'PRECIOS' */
      S172 ();
      if (returnInSub) return;
      AV161Artfor = (short)(1) ;
      if ( GXutil.strcmp(AV151Acaqui, " ") != 0 )
      {
         /* Execute user subroutine: 'ARTFOR' */
         S182 ();
         if (returnInSub) return;
      }
      if ( AV150Velluts == 1 )
      {
         AV164Ci = "" ;
         if ( ( A4454ArtLotKgs.doubleValue() > 0 ) || ( A4453ArtLotMts.doubleValue() > 0 ) )
         {
            AV164Ci = "*" ;
         }
      }
      AV144ProCod = "" ;
      AV147ProDscs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV147ProDscs);
      AV158ProAct = "" ;
      AV159ProCodp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV159ProCodp", AV159ProCodp);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
      AV149ArtProCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
      if ( GXutil.strcmp(AV160Ver_p, "S") == 0 )
      {
         /* Using cursor H00913 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10045CliAct});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A759ProDsc = H00913_A759ProDsc[0] ;
            A10412ProAct = H00913_A10412ProAct[0] ;
            A758ProCod = H00913_A758ProCod[0] ;
            A759ProDsc = H00913_A759ProDsc[0] ;
            AV146ProCods = A758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, edtavProcods_Internalname, AV146ProCods);
            AV147ProDscs = A759ProDsc ;
            httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV147ProDscs);
            AV158ProAct = A10412ProAct ;
            AV159ProCodp = A758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV159ProCodp", AV159ProCodp);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
            AV149ArtProCod = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
            /* Execute user subroutine: 'ACS' */
            S193 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(45) ;
            }
            if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
            {
               sendrow_452( ) ;
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
            if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
            {
               httpContext.doAjaxLoad(45, GridRow);
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         if ( AV161Artfor == 1 )
         {
            /* Using cursor H00914 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A10045CliAct});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A759ProDsc = H00914_A759ProDsc[0] ;
               A758ProCod = H00914_A758ProCod[0] ;
               A759ProDsc = H00914_A759ProDsc[0] ;
               if ( AV148NProc == 0 )
               {
                  AV159ProCodp = A758ProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV159ProCodp", AV159ProCodp);
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV159ProCodp, ""))));
                  AV149ArtProCod = " " ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
                  /* Execute user subroutine: 'ACS' */
                  S193 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV144ProCod = A758ProCod ;
                  AV145ProDsc = A759ProDsc ;
                  AV146ProCods = A758ProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavProcods_Internalname, AV146ProCods);
                  AV147ProDscs = A759ProDsc ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV147ProDscs);
               }
               AV148NProc = (short)(AV148NProc+1) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NProc), 4, 0));
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(45) ;
            }
            if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
            {
               sendrow_452( ) ;
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
            if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
            {
               httpContext.doAjaxLoad(45, GridRow);
            }
         }
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV139GridActions, 4, 0)) );
   }

   public void e15912( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV49ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV51ColumnsSelector.fromJSonString(AV49ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TARTICUWWColumnsSelector", ((GXutil.strcmp("", AV49ColumnsSelectorXML)==0) ? "" : AV51ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ColumnsSelector", AV51ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ManageFiltersData", AV54ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11912( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S202 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TARTICUWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV183Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV56ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ManageFiltersExecutionStep", GXutil.str( AV56ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TARTICUWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV56ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ManageFiltersExecutionStep", GXutil.str( AV56ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV55ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TARTICUWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tarticuww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV55ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV55ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S202 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV183Pgmname+"GridState", AV55ManageFiltersXml) ;
            AV10GridState.fromxml(AV55ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S212 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ColumnsSelector", AV51ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ManageFiltersData", AV54ManageFiltersData);
   }

   public void e23912( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV139GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV139GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV139GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV139GridActions == 4 )
      {
         /* Execute user subroutine: 'DO DUPLICARARTICULO' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV139GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S262 ();
         if (returnInSub) return;
      }
      AV139GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV139GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ColumnsSelector", AV51ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ManageFiltersData", AV54ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16912( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e17912( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV47ExcelFilename ;
      GXv_char3[0] = AV48ErrorMessage ;
      new app.tarticuwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tarticuww_impl.this.AV47ExcelFilename = GXv_char4[0] ;
      tarticuww_impl.this.AV48ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV47ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV47ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV48ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18912( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tarticuwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19912( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tarticuwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV51ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliCod", "", "Cliente", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliNom", "", "Nombre", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtCod", "", "Artículo", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtDsc", "", "Descripción", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "TipArtCod", "", "Tipo Artículo", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "TipArtDsc", "", "Descripción", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtPml", "", "Pml", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtGraAca", "", "Grm2", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtRen", "", "Rdto", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtAcaMin", "", "Ancho Ac", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&NProc", "", "#", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ProCods", "", "Proceso", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ProDscs", "", "Descripción", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ArtProCod", "", "Acs", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV51ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ArtComer", "", "Artículo Comercial", true, "") ;
      AV51ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV50UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TARTICUWWColumnsSelector", GXv_char4) ;
      tarticuww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV50UserCustomValue)==0) ) )
      {
         AV52ColumnsSelectorAux.fromxml(AV50UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV52ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV51ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV52ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV51ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV54ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TARTICUWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV54ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S202( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV138FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138FilterFullText", AV138FilterFullText);
      AV58TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
      AV59TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
      AV67TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom", AV67TFCliNom);
      AV68TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom_Sel", AV68TFCliNom_Sel);
      AV61TFArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFArtCod", AV61TFArtCod);
      AV62TFArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFArtCod_Sel", AV62TFArtCod_Sel);
      AV79TFArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFArtDsc", AV79TFArtDsc);
      AV80TFArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFArtDsc_Sel", AV80TFArtDsc_Sel);
      AV73TFTipArtCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFTipArtCod), 4, 0));
      AV74TFTipArtCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFTipArtCod_To), 4, 0));
      AV76TFTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipArtDsc", AV76TFTipArtDsc);
      AV77TFTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipArtDsc_Sel", AV77TFTipArtDsc_Sel);
      AV82TFArtPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFArtPml), 4, 0));
      AV83TFArtPml_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFArtPml_To), 4, 0));
      AV153TFArtGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153TFArtGraAca), 4, 0));
      AV154TFArtGraAca_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFArtGraAca_To), 4, 0));
      AV100TFArtRen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFArtRen", GXutil.ltrimstr( AV100TFArtRen, 6, 2));
      AV101TFArtRen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFArtRen_To", GXutil.ltrimstr( AV101TFArtRen_To, 6, 2));
      AV94TFArtAcaMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFArtAcaMin), 3, 0));
      AV95TFArtAcaMin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFArtAcaMin_To), 3, 0));
      AV171TFArtComer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171TFArtComer", AV171TFArtComer);
      AV172TFArtComer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV172TFArtComer_Sel", AV172TFArtComer_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S222( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S232( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S242( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S252( )
   {
      /* 'DO DUPLICARARTICULO' Routine */
      returnInSub = false ;
      if ( ! (0==A252CliCod) && ! (GXutil.strcmp("", A65ArtCod)==0) )
      {
         if ( ( AV175Salayet == 1 ) || ( AV176PLinea == 1 ) )
         {
         }
         else
         {
            if ( ( AV177Agepunt == 1 ) && ! (GXutil.strcmp("", AV178EmprDes)==0) )
            {
            }
            else
            {
               if ( AV180AltaArticulos == 0 )
               {
                  httpContext.popup(formatLink("app.wduser2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliOri","ArtOri"}) , new Object[] {});
               }
               else
               {
               }
            }
         }
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe seleccionar Cliente y Artículo", ""));
      }
   }

   public void S262( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      AV143Window.setAutoresize( 0 );
      AV143Window.setWidth( 1100 );
      AV143Window.setHeight( 600 );
      /* Window Datatype Object Property */
      AV143Window.setUrl( formatLink("app.tarticp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"})  );
      AV143Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV143Window);
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue(AV183Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV183Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV53Session.getValue(AV183Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S212 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S212( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV209GXV1 = 1 ;
      while ( AV209GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV209GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV138FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138FilterFullText", AV138FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV67TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliNom", AV67TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV68TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom_Sel", AV68TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV61TFArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFArtCod", AV61TFArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV62TFArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFArtCod_Sel", AV62TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV79TFArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFArtDsc", AV79TFArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV80TFArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFArtDsc_Sel", AV80TFArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV73TFTipArtCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFTipArtCod), 4, 0));
            AV74TFTipArtCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFTipArtCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV76TFTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipArtDsc", AV76TFTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV77TFTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipArtDsc_Sel", AV77TFTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV82TFArtPml = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFArtPml), 4, 0));
            AV83TFArtPml_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFArtPml_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV153TFArtGraAca = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153TFArtGraAca), 4, 0));
            AV154TFArtGraAca_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFArtGraAca_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV100TFArtRen = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFArtRen", GXutil.ltrimstr( AV100TFArtRen, 6, 2));
            AV101TFArtRen_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFArtRen_To", GXutil.ltrimstr( AV101TFArtRen_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV94TFArtAcaMin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFArtAcaMin), 3, 0));
            AV95TFArtAcaMin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFArtAcaMin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV171TFArtComer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV171TFArtComer", AV171TFArtComer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV172TFArtComer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFArtComer_Sel", AV172TFArtComer_Sel);
         }
         AV209GXV1 = (int)(AV209GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFCliNom_Sel)==0), AV68TFCliNom_Sel, GXv_char4) ;
      tarticuww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFArtCod_Sel)==0), AV62TFArtCod_Sel, GXv_char3) ;
      tarticuww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFArtDsc_Sel)==0), AV80TFArtDsc_Sel, GXv_char2) ;
      tarticuww_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFTipArtDsc_Sel)==0), AV77TFTipArtDsc_Sel, GXv_char19) ;
      tarticuww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV172TFArtComer_Sel)==0), AV172TFArtComer_Sel, GXv_char21) ;
      tarticuww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char16+"|"+GXt_char17+"||"+GXt_char18+"|||||||||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFCliNom)==0), AV67TFCliNom, GXv_char21) ;
      tarticuww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFArtCod)==0), AV61TFArtCod, GXv_char19) ;
      tarticuww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFArtDsc)==0), AV79TFArtDsc, GXv_char4) ;
      tarticuww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFTipArtDsc)==0), AV76TFTipArtDsc, GXv_char3) ;
      tarticuww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV171TFArtComer)==0), AV171TFArtComer, GXv_char2) ;
      tarticuww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV58TFCliCod) ? "" : GXutil.str( AV58TFCliCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char17+"|"+((0==AV73TFTipArtCod) ? "" : GXutil.str( AV73TFTipArtCod, 4, 0))+"|"+GXt_char16+"|"+((0==AV82TFArtPml) ? "" : GXutil.str( AV82TFArtPml, 4, 0))+"|"+((0==AV153TFArtGraAca) ? "" : GXutil.str( AV153TFArtGraAca, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV100TFArtRen)==0) ? "" : GXutil.str( AV100TFArtRen, 6, 2))+"|"+((0==AV94TFArtAcaMin) ? "" : GXutil.str( AV94TFArtAcaMin, 3, 0))+"|||||"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV59TFCliCod_To) ? "" : GXutil.str( AV59TFCliCod_To, 6, 0))+"||||"+((0==AV74TFTipArtCod_To) ? "" : GXutil.str( AV74TFTipArtCod_To, 4, 0))+"||"+((0==AV83TFArtPml_To) ? "" : GXutil.str( AV83TFArtPml_To, 4, 0))+"|"+((0==AV154TFArtGraAca_To) ? "" : GXutil.str( AV154TFArtGraAca_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFArtRen_To)==0) ? "" : GXutil.str( AV101TFArtRen_To, 6, 2))+"|"+((0==AV95TFArtAcaMin_To) ? "" : GXutil.str( AV95TFArtAcaMin_To, 3, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV53Session.getValue(AV183Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV138FilterFullText)==0), (short)(0), AV138FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV58TFCliCod)&&(0==AV59TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV59TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV67TFCliNom)==0), (short)(0), AV67TFCliNom, "", !(GXutil.strcmp("", AV68TFCliNom_Sel)==0), AV68TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTCOD", "", !(GXutil.strcmp("", AV61TFArtCod)==0), (short)(0), AV61TFArtCod, "", !(GXutil.strcmp("", AV62TFArtCod_Sel)==0), AV62TFArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTDSC", "", !(GXutil.strcmp("", AV79TFArtDsc)==0), (short)(0), AV79TFArtDsc, "", !(GXutil.strcmp("", AV80TFArtDsc_Sel)==0), AV80TFArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFTIPARTCOD", "", !((0==AV73TFTipArtCod)&&(0==AV74TFTipArtCod_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFTipArtCod, 4, 0)), GXutil.trim( GXutil.str( AV74TFTipArtCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFTIPARTDSC", "", !(GXutil.strcmp("", AV76TFTipArtDsc)==0), (short)(0), AV76TFTipArtDsc, "", !(GXutil.strcmp("", AV77TFTipArtDsc_Sel)==0), AV77TFTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTPML", "", !((0==AV82TFArtPml)&&(0==AV83TFArtPml_To)), (short)(0), GXutil.trim( GXutil.str( AV82TFArtPml, 4, 0)), GXutil.trim( GXutil.str( AV83TFArtPml_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTGRAACA", "", !((0==AV153TFArtGraAca)&&(0==AV154TFArtGraAca_To)), (short)(0), GXutil.trim( GXutil.str( AV153TFArtGraAca, 4, 0)), GXutil.trim( GXutil.str( AV154TFArtGraAca_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTREN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV100TFArtRen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFArtRen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV100TFArtRen, 6, 2)), GXutil.trim( GXutil.str( AV101TFArtRen_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTACAMIN", "", !((0==AV94TFArtAcaMin)&&(0==AV95TFArtAcaMin_To)), (short)(0), GXutil.trim( GXutil.str( AV94TFArtAcaMin, 3, 0)), GXutil.trim( GXutil.str( AV95TFArtAcaMin_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFARTCOMER", "", !(GXutil.strcmp("", AV171TFArtComer)==0), (short)(0), AV171TFArtComer, "", !(GXutil.strcmp("", AV172TFArtComer_Sel)==0), AV172TFArtComer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV183Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV183Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TARTICU" );
      AV53Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S193( )
   {
      /* 'ACS' Routine */
      returnInSub = false ;
      AV149ArtProCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
      /* Using cursor H00915 */
      pr_default.execute(3, new Object[] {AV152EmprCod, Integer.valueOf(AV156Clicodp), AV157Artcodp, AV159ProCodp});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A758ProCod = H00915_A758ProCod[0] ;
         A65ArtCod = H00915_A65ArtCod[0] ;
         A252CliCod = H00915_A252CliCod[0] ;
         A396EmprCod = H00915_A396EmprCod[0] ;
         A4898ArtProCod = H00915_A4898ArtProCod[0] ;
         AV149ArtProCod = A4898ArtProCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV149ArtProCod);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S182( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      AV161Artfor = (short)(0) ;
      /* Using cursor H00916 */
      pr_default.execute(4, new Object[] {AV152EmprCod, Integer.valueOf(AV156Clicodp), AV157Artcodp, AV151Acaqui});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4898ArtProCod = H00916_A4898ArtProCod[0] ;
         A65ArtCod = H00916_A65ArtCod[0] ;
         A252CliCod = H00916_A252CliCod[0] ;
         A396EmprCod = H00916_A396EmprCod[0] ;
         A758ProCod = H00916_A758ProCod[0] ;
         AV161Artfor = (short)(1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S172( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      AV174PreInt = (byte)(0) ;
      /* Using cursor H00917 */
      pr_default.execute(5, new Object[] {AV152EmprCod, Integer.valueOf(AV156Clicodp), AV157Artcodp});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = H00917_A65ArtCod[0] ;
         A252CliCod = H00917_A252CliCod[0] ;
         A396EmprCod = H00917_A396EmprCod[0] ;
         A587IntPreMtr = H00917_A587IntPreMtr[0] ;
         n587IntPreMtr = H00917_n587IntPreMtr[0] ;
         A586IntPreKgm = H00917_A586IntPreKgm[0] ;
         n586IntPreKgm = H00917_n586IntPreKgm[0] ;
         A583IntCod = H00917_A583IntCod[0] ;
         A831TipColCod = H00917_A831TipColCod[0] ;
         if ( ( A586IntPreKgm.doubleValue() > 0 ) || ( A587IntPreMtr.doubleValue() > 0 ) )
         {
            AV174PreInt = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor H00918 */
      pr_default.execute(6, new Object[] {AV152EmprCod, Integer.valueOf(AV156Clicodp), AV157Artcodp});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A65ArtCod = H00918_A65ArtCod[0] ;
         A252CliCod = H00918_A252CliCod[0] ;
         A396EmprCod = H00918_A396EmprCod[0] ;
         A10970Int_Pm = H00918_A10970Int_Pm[0] ;
         n10970Int_Pm = H00918_n10970Int_Pm[0] ;
         A10969Int_Pk = H00918_A10969Int_Pk[0] ;
         n10969Int_Pk = H00918_n10969Int_Pk[0] ;
         A11043Int_Un = H00918_A11043Int_Un[0] ;
         A10972Int_cod = H00918_A10972Int_cod[0] ;
         if ( ( A10969Int_Pk.doubleValue() > 0 ) || ( A10970Int_Pm.doubleValue() > 0 ) )
         {
            AV174PreInt = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void wb_table1_27_912( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV54ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_912( true) ;
      }
      else
      {
         wb_table2_32_912( false) ;
      }
      return  ;
   }

   public void wb_table2_32_912e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_912e( true) ;
      }
      else
      {
         wb_table1_27_912e( false) ;
      }
   }

   public void wb_table2_32_912( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV138FilterFullText, GXutil.rtrim( localUtil.format( AV138FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TARTICUWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_912e( true) ;
      }
      else
      {
         wb_table2_32_912e( false) ;
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
      pa912( ) ;
      ws912( ) ;
      we912( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116114349", true, true);
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
      httpContext.AddJavascriptSource("tarticuww.js", "?202682116114350", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_45_idx ;
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_45_idx ;
      edtTipArtDsc_Internalname = "TIPARTDSC_"+sGXsfl_45_idx ;
      edtArtPml_Internalname = "ARTPML_"+sGXsfl_45_idx ;
      edtArtGraAca_Internalname = "ARTGRAACA_"+sGXsfl_45_idx ;
      edtArtRen_Internalname = "ARTREN_"+sGXsfl_45_idx ;
      edtArtAcaMin_Internalname = "ARTACAMIN_"+sGXsfl_45_idx ;
      edtavNproc_Internalname = "vNPROC_"+sGXsfl_45_idx ;
      edtavProcods_Internalname = "vPROCODS_"+sGXsfl_45_idx ;
      edtavProdscs_Internalname = "vPRODSCS_"+sGXsfl_45_idx ;
      edtavArtprocod_Internalname = "vARTPROCOD_"+sGXsfl_45_idx ;
      edtArtComer_Internalname = "ARTCOMER_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_fel_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_45_fel_idx ;
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_45_fel_idx ;
      edtTipArtDsc_Internalname = "TIPARTDSC_"+sGXsfl_45_fel_idx ;
      edtArtPml_Internalname = "ARTPML_"+sGXsfl_45_fel_idx ;
      edtArtGraAca_Internalname = "ARTGRAACA_"+sGXsfl_45_fel_idx ;
      edtArtRen_Internalname = "ARTREN_"+sGXsfl_45_fel_idx ;
      edtArtAcaMin_Internalname = "ARTACAMIN_"+sGXsfl_45_fel_idx ;
      edtavNproc_Internalname = "vNPROC_"+sGXsfl_45_fel_idx ;
      edtavProcods_Internalname = "vPROCODS_"+sGXsfl_45_fel_idx ;
      edtavProdscs_Internalname = "vPRODSCS_"+sGXsfl_45_fel_idx ;
      edtavArtprocod_Internalname = "vARTPROCOD_"+sGXsfl_45_fel_idx ;
      edtArtComer_Internalname = "ARTCOMER_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb910( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV139GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV139GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV139GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV139GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtDsc_Internalname,GXutil.rtrim( A69ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtCod_Internalname,GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtDsc_Internalname,GXutil.rtrim( A830TipArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtPml_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtPml_Internalname,GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtPml_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtPml_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtGraAca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtGraAca_Internalname,GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtGraAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtArtGraAca_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtRen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtRen_Internalname,GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A95ArtRen, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtRen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtRen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtAcaMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtAcaMin_Internalname,GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtAcaMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtAcaMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNproc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNproc_Enabled!=0)&&(edtavNproc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNproc_Internalname,GXutil.ltrim( localUtil.ntoc( AV148NProc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNproc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV148NProc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV148NProc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNproc_Enabled!=0)&&(edtavNproc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNproc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNproc_Visible),Integer.valueOf(edtavNproc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavProcods_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProcods_Enabled!=0)&&(edtavProcods_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProcods_Internalname,GXutil.rtrim( AV146ProCods),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProcods_Enabled!=0)&&(edtavProcods_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProcods_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavProcods_Visible),Integer.valueOf(edtavProcods_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavProdscs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProdscs_Enabled!=0)&&(edtavProdscs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProdscs_Internalname,GXutil.rtrim( AV147ProDscs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProdscs_Enabled!=0)&&(edtavProdscs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProdscs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavProdscs_Visible),Integer.valueOf(edtavProdscs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavArtprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavArtprocod_Enabled!=0)&&(edtavArtprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavArtprocod_Internalname,GXutil.rtrim( AV149ArtProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavArtprocod_Enabled!=0)&&(edtavArtprocod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavArtprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavArtprocod_Visible),Integer.valueOf(edtavArtprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtComer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtComer_Internalname,GXutil.rtrim( A5741ArtComer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtComer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtArtComer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes912( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtPml_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pml", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtGraAca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtRen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rdto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtAcaMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho Ac", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNproc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavProcods_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavProdscs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavArtprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtComer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo Comercial", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV139GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A69ArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A830TipArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtPml_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtGraAca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtRen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtAcaMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV148NProc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNproc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNproc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV146ProCods));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProcods_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavProcods_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV147ProDscs));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProdscs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavProdscs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV149ArtProCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavArtprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavArtprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5741ArtComer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtComer_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      edtTipArtDsc_Internalname = "TIPARTDSC" ;
      edtArtPml_Internalname = "ARTPML" ;
      edtArtGraAca_Internalname = "ARTGRAACA" ;
      edtArtRen_Internalname = "ARTREN" ;
      edtArtAcaMin_Internalname = "ARTACAMIN" ;
      edtavNproc_Internalname = "vNPROC" ;
      edtavProcods_Internalname = "vPROCODS" ;
      edtavProdscs_Internalname = "vPRODSCS" ;
      edtavArtprocod_Internalname = "vARTPROCOD" ;
      edtArtComer_Internalname = "ARTCOMER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtArtComer_Jsonclick = "" ;
      edtavArtprocod_Jsonclick = "" ;
      edtavArtprocod_Enabled = 1 ;
      edtavProdscs_Jsonclick = "" ;
      edtavProdscs_Enabled = 1 ;
      edtavProcods_Jsonclick = "" ;
      edtavProcods_Enabled = 1 ;
      edtavNproc_Jsonclick = "" ;
      edtavNproc_Enabled = 1 ;
      edtArtAcaMin_Jsonclick = "" ;
      edtArtRen_Jsonclick = "" ;
      edtArtGraAca_Jsonclick = "" ;
      edtArtPml_Jsonclick = "" ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtCod_Jsonclick = "" ;
      edtArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtArtComer_Visible = -1 ;
      edtavArtprocod_Visible = -1 ;
      edtavProdscs_Visible = -1 ;
      edtavProcods_Visible = -1 ;
      edtavNproc_Visible = -1 ;
      edtArtAcaMin_Visible = -1 ;
      edtArtRen_Visible = -1 ;
      edtArtGraAca_Visible = -1 ;
      edtArtPml_Visible = -1 ;
      edtTipArtDsc_Visible = -1 ;
      edtTipArtCod_Visible = -1 ;
      edtArtDsc_Visible = -1 ;
      edtArtCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TARTICUWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||Dynamic|||||||||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T||T|||||||||T" ;
      Ddo_grid_Filterisrange = "T||||T||T|T|T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|||||Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|||||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|||||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|1|5|6|7|8|9|10|||||11" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:ArtCod|4:ArtDsc|5:TipArtCod|6:TipArtDsc|7:ArtPml|8:ArtGraAca|9:ArtRen|10:ArtAcaMin|11:NProc|12:ProCods|13:ProDscs|14:ArtProCod|15:ArtComer" ;
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
      Form.setCaption( httpContext.getMessage( "Ficha Tecnica (Articulo)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV139GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV139GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'AV129GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV130GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12912',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13912',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14912',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22912',iparms:[{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'A4454ArtLotKgs',fld:'ARTLOTKGS',pic:'ZZZZZ9.99'},{av:'A4453ArtLotMts',fld:'ARTLOTMTS',pic:'ZZZZZ9.99'},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV139GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV148NProc',fld:'vNPROC',pic:'ZZZ9'},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'AV147ProDscs',fld:'vPRODSCS',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV149ArtProCod',fld:'vARTPROCOD',pic:''},{av:'AV146ProCods',fld:'vPROCODS',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15912',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'AV129GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV130GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11912',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'AV129GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV130GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23912',iparms:[{av:'cmbavGridactions'},{av:'AV139GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV139GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'AV129GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV130GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV54ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16912',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17912',iparms:[{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18912',iparms:[{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19912',iparms:[{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV138FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV51ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV67TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV68TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV62TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV79TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV80TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV73TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV74TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV76TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV77TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV82TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV83TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV153TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV154TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV100TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV101TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV94TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV95TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV171TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV172TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV183Pgmname',fld:'vPGMNAME',pic:''},{av:'AV151Acaqui',fld:'vACAQUI',pic:'',hsh:true},{av:'AV150Velluts',fld:'vVELLUTS',pic:'ZZZ9',hsh:true},{av:'AV160Ver_p',fld:'vVER_P',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'AV152EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV156Clicodp',fld:'vCLICODP',pic:'ZZZZZ9',hsh:true},{av:'AV157Artcodp',fld:'vARTCODP',pic:'',hsh:true},{av:'A586IntPreKgm',fld:'INTPREKGM',pic:'ZZZZZZ9.999'},{av:'A587IntPreMtr',fld:'INTPREMTR',pic:'ZZZZZZ9.999'},{av:'A10972Int_cod',fld:'INT_COD',pic:'Z9'},{av:'A11043Int_Un',fld:'INT_UN',pic:''},{av:'A10969Int_Pk',fld:'INT_PK',pic:'ZZZZZZ9.999'},{av:'A10970Int_Pm',fld:'INT_PM',pic:'ZZZZZZ9.999'},{av:'A4898ArtProCod',fld:'ARTPROCOD',pic:''},{av:'AV159ProCodp',fld:'vPROCODP',pic:'',hsh:true},{av:'AV175Salayet',fld:'vSALAYET',pic:'9',hsh:true},{av:'AV176PLinea',fld:'vPLINEA',pic:'9',hsh:true},{av:'AV177Agepunt',fld:'vAGEPUNT',pic:'9',hsh:true},{av:'AV178EmprDes',fld:'vEMPRDES',pic:'@!',hsh:true},{av:'AV180AltaArticulos',fld:'vALTAARTICULOS',pic:'9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Artcomer',iparms:[]");
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
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV138FilterFullText = "" ;
      AV51ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV67TFCliNom = "" ;
      AV68TFCliNom_Sel = "" ;
      AV61TFArtCod = "" ;
      AV62TFArtCod_Sel = "" ;
      AV79TFArtDsc = "" ;
      AV80TFArtDsc_Sel = "" ;
      AV76TFTipArtDsc = "" ;
      AV77TFTipArtDsc_Sel = "" ;
      AV100TFArtRen = DecimalUtil.ZERO ;
      AV101TFArtRen_To = DecimalUtil.ZERO ;
      AV171TFArtComer = "" ;
      AV172TFArtComer_Sel = "" ;
      AV183Pgmname = "" ;
      AV151Acaqui = "" ;
      AV160Ver_p = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A10412ProAct = "" ;
      AV152EmprCod = "" ;
      AV157Artcodp = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A11043Int_Un = "" ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      A4898ArtProCod = "" ;
      AV159ProCodp = "" ;
      AV178EmprDes = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV54ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV127DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4454ArtLotKgs = DecimalUtil.ZERO ;
      A4453ArtLotMts = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      AV146ProCods = "" ;
      AV147ProDscs = "" ;
      AV149ArtProCod = "" ;
      A5741ArtComer = "" ;
      scmdbuf = "" ;
      lV184Tarticuwwds_1_filterfulltext = "" ;
      lV187Tarticuwwds_4_tfclinom = "" ;
      lV189Tarticuwwds_6_tfartcod = "" ;
      lV191Tarticuwwds_8_tfartdsc = "" ;
      lV195Tarticuwwds_12_tftipartdsc = "" ;
      lV205Tarticuwwds_22_tfartcomer = "" ;
      AV184Tarticuwwds_1_filterfulltext = "" ;
      AV188Tarticuwwds_5_tfclinom_sel = "" ;
      AV187Tarticuwwds_4_tfclinom = "" ;
      AV190Tarticuwwds_7_tfartcod_sel = "" ;
      AV189Tarticuwwds_6_tfartcod = "" ;
      AV192Tarticuwwds_9_tfartdsc_sel = "" ;
      AV191Tarticuwwds_8_tfartdsc = "" ;
      AV196Tarticuwwds_13_tftipartdsc_sel = "" ;
      AV195Tarticuwwds_12_tftipartdsc = "" ;
      AV201Tarticuwwds_18_tfartren = DecimalUtil.ZERO ;
      AV202Tarticuwwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV206Tarticuwwds_23_tfartcomer_sel = "" ;
      AV205Tarticuwwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      H00912_A65ArtCod = new String[] {""} ;
      H00912_A252CliCod = new int[1] ;
      H00912_A396EmprCod = new String[] {""} ;
      H00912_A10045CliAct = new String[] {""} ;
      H00912_A4453ArtLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00912_n4453ArtLotMts = new boolean[] {false} ;
      H00912_A4454ArtLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00912_n4454ArtLotKgs = new boolean[] {false} ;
      H00912_A5741ArtComer = new String[] {""} ;
      H00912_n5741ArtComer = new boolean[] {false} ;
      H00912_A63ArtAcaMin = new short[1] ;
      H00912_n63ArtAcaMin = new boolean[] {false} ;
      H00912_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00912_n95ArtRen = new boolean[] {false} ;
      H00912_A1903ArtGraAca = new short[1] ;
      H00912_n1903ArtGraAca = new boolean[] {false} ;
      H00912_A1148ArtPml = new short[1] ;
      H00912_n1148ArtPml = new boolean[] {false} ;
      H00912_A830TipArtDsc = new String[] {""} ;
      H00912_n830TipArtDsc = new boolean[] {false} ;
      H00912_A829TipArtCod = new short[1] ;
      H00912_A69ArtDsc = new String[] {""} ;
      H00912_n69ArtDsc = new boolean[] {false} ;
      H00912_A279CliNom = new String[] {""} ;
      hsh = "" ;
      AV140Station = "" ;
      AV141EmprNom = "" ;
      AV142UsurCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int10 = new int[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV49ColumnsSelectorXML = "" ;
      AV155TipArtDsc = "" ;
      AV164Ci = "" ;
      AV144ProCod = "" ;
      AV158ProAct = "" ;
      H00913_A396EmprCod = new String[] {""} ;
      H00913_A252CliCod = new int[1] ;
      H00913_A65ArtCod = new String[] {""} ;
      H00913_A759ProDsc = new String[] {""} ;
      H00913_A10412ProAct = new String[] {""} ;
      H00913_A758ProCod = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      H00914_A396EmprCod = new String[] {""} ;
      H00914_A252CliCod = new int[1] ;
      H00914_A65ArtCod = new String[] {""} ;
      H00914_A759ProDsc = new String[] {""} ;
      H00914_A758ProCod = new String[] {""} ;
      AV145ProDsc = "" ;
      AV55ManageFiltersXml = "" ;
      AV47ExcelFilename = "" ;
      AV48ErrorMessage = "" ;
      AV50UserCustomValue = "" ;
      AV52ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV143Window = new com.genexus.webpanels.GXWindow();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H00915_A457FasCod = new String[] {""} ;
      H00915_A4897ArtProLin = new short[1] ;
      H00915_A758ProCod = new String[] {""} ;
      H00915_A65ArtCod = new String[] {""} ;
      H00915_A252CliCod = new int[1] ;
      H00915_A396EmprCod = new String[] {""} ;
      H00915_A4898ArtProCod = new String[] {""} ;
      H00916_A457FasCod = new String[] {""} ;
      H00916_A4897ArtProLin = new short[1] ;
      H00916_A4898ArtProCod = new String[] {""} ;
      H00916_A65ArtCod = new String[] {""} ;
      H00916_A252CliCod = new int[1] ;
      H00916_A396EmprCod = new String[] {""} ;
      H00916_A758ProCod = new String[] {""} ;
      H00917_A65ArtCod = new String[] {""} ;
      H00917_A252CliCod = new int[1] ;
      H00917_A396EmprCod = new String[] {""} ;
      H00917_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00917_n587IntPreMtr = new boolean[] {false} ;
      H00917_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00917_n586IntPreKgm = new boolean[] {false} ;
      H00917_A583IntCod = new byte[1] ;
      H00917_A831TipColCod = new byte[1] ;
      H00918_A10966Int_Lin = new short[1] ;
      H00918_A65ArtCod = new String[] {""} ;
      H00918_A252CliCod = new int[1] ;
      H00918_A396EmprCod = new String[] {""} ;
      H00918_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00918_n10970Int_Pm = new boolean[] {false} ;
      H00918_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00918_n10969Int_Pk = new boolean[] {false} ;
      H00918_A11043Int_Un = new String[] {""} ;
      H00918_A10972Int_cod = new byte[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticuww__default(),
         new Object[] {
             new Object[] {
            H00912_A65ArtCod, H00912_A252CliCod, H00912_A396EmprCod, H00912_A10045CliAct, H00912_A4453ArtLotMts, H00912_n4453ArtLotMts, H00912_A4454ArtLotKgs, H00912_n4454ArtLotKgs, H00912_A5741ArtComer, H00912_n5741ArtComer,
            H00912_A63ArtAcaMin, H00912_n63ArtAcaMin, H00912_A95ArtRen, H00912_n95ArtRen, H00912_A1903ArtGraAca, H00912_n1903ArtGraAca, H00912_A1148ArtPml, H00912_n1148ArtPml, H00912_A830TipArtDsc, H00912_n830TipArtDsc,
            H00912_A829TipArtCod, H00912_A69ArtDsc, H00912_n69ArtDsc, H00912_A279CliNom
            }
            , new Object[] {
            H00913_A396EmprCod, H00913_A252CliCod, H00913_A65ArtCod, H00913_A759ProDsc, H00913_A10412ProAct, H00913_A758ProCod
            }
            , new Object[] {
            H00914_A396EmprCod, H00914_A252CliCod, H00914_A65ArtCod, H00914_A759ProDsc, H00914_A758ProCod
            }
            , new Object[] {
            H00915_A457FasCod, H00915_A4897ArtProLin, H00915_A758ProCod, H00915_A65ArtCod, H00915_A252CliCod, H00915_A396EmprCod, H00915_A4898ArtProCod
            }
            , new Object[] {
            H00916_A457FasCod, H00916_A4897ArtProLin, H00916_A4898ArtProCod, H00916_A65ArtCod, H00916_A252CliCod, H00916_A396EmprCod, H00916_A758ProCod
            }
            , new Object[] {
            H00917_A65ArtCod, H00917_A252CliCod, H00917_A396EmprCod, H00917_A587IntPreMtr, H00917_n587IntPreMtr, H00917_A586IntPreKgm, H00917_n586IntPreKgm, H00917_A583IntCod, H00917_A831TipColCod
            }
            , new Object[] {
            H00918_A10966Int_Lin, H00918_A65ArtCod, H00918_A252CliCod, H00918_A396EmprCod, H00918_A10970Int_Pm, H00918_n10970Int_Pm, H00918_A10969Int_Pk, H00918_n10969Int_Pk, H00918_A11043Int_Un, H00918_A10972Int_cod
            }
         }
      );
      AV183Pgmname = "TARTICUWW" ;
      /* GeneXus formulas. */
      AV183Pgmname = "TARTICUWW" ;
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      edtavProcods_Enabled = 0 ;
      edtavProdscs_Enabled = 0 ;
      edtavArtprocod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV56ManageFiltersExecutionStep ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A10972Int_cod ;
   private byte AV175Salayet ;
   private byte AV176PLinea ;
   private byte AV177Agepunt ;
   private byte AV180AltaArticulos ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV165Tintutex ;
   private byte AV166Texfina ;
   private byte AV167FlagHilo ;
   private byte AV168vFlagMB ;
   private byte AV173Induyco ;
   private byte AV169Tas ;
   private byte AV170Sedamil ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV174PreInt ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV73TFTipArtCod ;
   private short AV74TFTipArtCod_To ;
   private short AV82TFArtPml ;
   private short AV83TFArtPml_To ;
   private short AV153TFArtGraAca ;
   private short AV154TFArtGraAca_To ;
   private short AV94TFArtAcaMin ;
   private short AV95TFArtAcaMin_To ;
   private short AV13OrderedBy ;
   private short AV150Velluts ;
   private short wbEnd ;
   private short wbStart ;
   private short AV139GridActions ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV148NProc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV193Tarticuwwds_10_tftipartcod ;
   private short AV194Tarticuwwds_11_tftipartcod_to ;
   private short AV197Tarticuwwds_14_tfartpml ;
   private short AV198Tarticuwwds_15_tfartpml_to ;
   private short AV199Tarticuwwds_16_tfartgraaca ;
   private short AV200Tarticuwwds_17_tfartgraaca_to ;
   private short AV203Tarticuwwds_20_tfartacamin ;
   private short AV204Tarticuwwds_21_tfartacamin_to ;
   private short AV161Artfor ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV58TFCliCod ;
   private int AV59TFCliCod_To ;
   private int AV156Clicodp ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavNproc_Enabled ;
   private int edtavProcods_Enabled ;
   private int edtavProdscs_Enabled ;
   private int edtavArtprocod_Enabled ;
   private int AV185Tarticuwwds_2_tfclicod ;
   private int AV186Tarticuwwds_3_tfclicod_to ;
   private int AV179DupEmp ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtArtCod_Visible ;
   private int edtArtDsc_Visible ;
   private int edtTipArtCod_Visible ;
   private int edtTipArtDsc_Visible ;
   private int edtArtPml_Visible ;
   private int edtArtGraAca_Visible ;
   private int edtArtRen_Visible ;
   private int edtArtAcaMin_Visible ;
   private int edtavNproc_Visible ;
   private int edtavProcods_Visible ;
   private int edtavProdscs_Visible ;
   private int edtavArtprocod_Visible ;
   private int edtArtComer_Visible ;
   private int AV128PageToGo ;
   private int AV209GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV129GridCurrentPage ;
   private long AV130GridPageCount ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal AV100TFArtRen ;
   private java.math.BigDecimal AV101TFArtRen_To ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A10969Int_Pk ;
   private java.math.BigDecimal A10970Int_Pm ;
   private java.math.BigDecimal A4454ArtLotKgs ;
   private java.math.BigDecimal A4453ArtLotMts ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV201Tarticuwwds_18_tfartren ;
   private java.math.BigDecimal AV202Tarticuwwds_19_tfartren_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String AV67TFCliNom ;
   private String AV68TFCliNom_Sel ;
   private String AV61TFArtCod ;
   private String AV62TFArtCod_Sel ;
   private String AV79TFArtDsc ;
   private String AV80TFArtDsc_Sel ;
   private String AV76TFTipArtDsc ;
   private String AV77TFTipArtDsc_Sel ;
   private String AV171TFArtComer ;
   private String AV172TFArtComer_Sel ;
   private String AV183Pgmname ;
   private String AV151Acaqui ;
   private String AV160Ver_p ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A10412ProAct ;
   private String AV152EmprCod ;
   private String AV157Artcodp ;
   private String A11043Int_Un ;
   private String A4898ArtProCod ;
   private String AV159ProCodp ;
   private String AV178EmprDes ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Internalname ;
   private String edtTipArtCod_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Internalname ;
   private String edtArtPml_Internalname ;
   private String edtArtGraAca_Internalname ;
   private String edtArtRen_Internalname ;
   private String edtArtAcaMin_Internalname ;
   private String edtavNproc_Internalname ;
   private String AV146ProCods ;
   private String edtavProcods_Internalname ;
   private String AV147ProDscs ;
   private String edtavProdscs_Internalname ;
   private String AV149ArtProCod ;
   private String edtavArtprocod_Internalname ;
   private String A5741ArtComer ;
   private String edtArtComer_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV187Tarticuwwds_4_tfclinom ;
   private String lV189Tarticuwwds_6_tfartcod ;
   private String lV191Tarticuwwds_8_tfartdsc ;
   private String lV195Tarticuwwds_12_tftipartdsc ;
   private String lV205Tarticuwwds_22_tfartcomer ;
   private String AV188Tarticuwwds_5_tfclinom_sel ;
   private String AV187Tarticuwwds_4_tfclinom ;
   private String AV190Tarticuwwds_7_tfartcod_sel ;
   private String AV189Tarticuwwds_6_tfartcod ;
   private String AV192Tarticuwwds_9_tfartdsc_sel ;
   private String AV191Tarticuwwds_8_tfartdsc ;
   private String AV196Tarticuwwds_13_tftipartdsc_sel ;
   private String AV195Tarticuwwds_12_tftipartdsc ;
   private String AV206Tarticuwwds_23_tfartcomer_sel ;
   private String AV205Tarticuwwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String hsh ;
   private String AV140Station ;
   private String AV141EmprNom ;
   private String AV142UsurCod ;
   private String AV155TipArtDsc ;
   private String AV144ProCod ;
   private String AV158ProAct ;
   private String AV145ProDsc ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Jsonclick ;
   private String edtTipArtCod_Jsonclick ;
   private String edtTipArtDsc_Jsonclick ;
   private String edtArtPml_Jsonclick ;
   private String edtArtGraAca_Jsonclick ;
   private String edtArtRen_Jsonclick ;
   private String edtArtAcaMin_Jsonclick ;
   private String edtavNproc_Jsonclick ;
   private String edtavProcods_Jsonclick ;
   private String edtavProdscs_Jsonclick ;
   private String edtavArtprocod_Jsonclick ;
   private String edtArtComer_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14OrderedDsc ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n10969Int_Pk ;
   private boolean n10970Int_Pm ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n1903ArtGraAca ;
   private boolean n95ArtRen ;
   private boolean n63ArtAcaMin ;
   private boolean n5741ArtComer ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4453ArtLotMts ;
   private boolean n4454ArtLotKgs ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV49ColumnsSelectorXML ;
   private String AV55ManageFiltersXml ;
   private String AV50UserCustomValue ;
   private String AV138FilterFullText ;
   private String lV184Tarticuwwds_1_filterfulltext ;
   private String AV184Tarticuwwds_1_filterfulltext ;
   private String AV164Ci ;
   private String AV47ExcelFilename ;
   private String AV48ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV143Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H00912_A65ArtCod ;
   private int[] H00912_A252CliCod ;
   private String[] H00912_A396EmprCod ;
   private String[] H00912_A10045CliAct ;
   private java.math.BigDecimal[] H00912_A4453ArtLotMts ;
   private boolean[] H00912_n4453ArtLotMts ;
   private java.math.BigDecimal[] H00912_A4454ArtLotKgs ;
   private boolean[] H00912_n4454ArtLotKgs ;
   private String[] H00912_A5741ArtComer ;
   private boolean[] H00912_n5741ArtComer ;
   private short[] H00912_A63ArtAcaMin ;
   private boolean[] H00912_n63ArtAcaMin ;
   private java.math.BigDecimal[] H00912_A95ArtRen ;
   private boolean[] H00912_n95ArtRen ;
   private short[] H00912_A1903ArtGraAca ;
   private boolean[] H00912_n1903ArtGraAca ;
   private short[] H00912_A1148ArtPml ;
   private boolean[] H00912_n1148ArtPml ;
   private String[] H00912_A830TipArtDsc ;
   private boolean[] H00912_n830TipArtDsc ;
   private short[] H00912_A829TipArtCod ;
   private String[] H00912_A69ArtDsc ;
   private boolean[] H00912_n69ArtDsc ;
   private String[] H00912_A279CliNom ;
   private String[] H00913_A396EmprCod ;
   private int[] H00913_A252CliCod ;
   private String[] H00913_A65ArtCod ;
   private String[] H00913_A759ProDsc ;
   private String[] H00913_A10412ProAct ;
   private String[] H00913_A758ProCod ;
   private String[] H00914_A396EmprCod ;
   private int[] H00914_A252CliCod ;
   private String[] H00914_A65ArtCod ;
   private String[] H00914_A759ProDsc ;
   private String[] H00914_A758ProCod ;
   private String[] H00915_A457FasCod ;
   private short[] H00915_A4897ArtProLin ;
   private String[] H00915_A758ProCod ;
   private String[] H00915_A65ArtCod ;
   private int[] H00915_A252CliCod ;
   private String[] H00915_A396EmprCod ;
   private String[] H00915_A4898ArtProCod ;
   private String[] H00916_A457FasCod ;
   private short[] H00916_A4897ArtProLin ;
   private String[] H00916_A4898ArtProCod ;
   private String[] H00916_A65ArtCod ;
   private int[] H00916_A252CliCod ;
   private String[] H00916_A396EmprCod ;
   private String[] H00916_A758ProCod ;
   private String[] H00917_A65ArtCod ;
   private int[] H00917_A252CliCod ;
   private String[] H00917_A396EmprCod ;
   private java.math.BigDecimal[] H00917_A587IntPreMtr ;
   private boolean[] H00917_n587IntPreMtr ;
   private java.math.BigDecimal[] H00917_A586IntPreKgm ;
   private boolean[] H00917_n586IntPreKgm ;
   private byte[] H00917_A583IntCod ;
   private byte[] H00917_A831TipColCod ;
   private short[] H00918_A10966Int_Lin ;
   private String[] H00918_A65ArtCod ;
   private int[] H00918_A252CliCod ;
   private String[] H00918_A396EmprCod ;
   private java.math.BigDecimal[] H00918_A10970Int_Pm ;
   private boolean[] H00918_n10970Int_Pm ;
   private java.math.BigDecimal[] H00918_A10969Int_Pk ;
   private boolean[] H00918_n10969Int_Pk ;
   private String[] H00918_A11043Int_Un ;
   private byte[] H00918_A10972Int_cod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV54ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV52ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV127DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tarticuww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00912( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV184Tarticuwwds_1_filterfulltext ,
                                          int AV185Tarticuwwds_2_tfclicod ,
                                          int AV186Tarticuwwds_3_tfclicod_to ,
                                          String AV188Tarticuwwds_5_tfclinom_sel ,
                                          String AV187Tarticuwwds_4_tfclinom ,
                                          String AV190Tarticuwwds_7_tfartcod_sel ,
                                          String AV189Tarticuwwds_6_tfartcod ,
                                          String AV192Tarticuwwds_9_tfartdsc_sel ,
                                          String AV191Tarticuwwds_8_tfartdsc ,
                                          short AV193Tarticuwwds_10_tftipartcod ,
                                          short AV194Tarticuwwds_11_tftipartcod_to ,
                                          String AV196Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV195Tarticuwwds_12_tftipartdsc ,
                                          short AV197Tarticuwwds_14_tfartpml ,
                                          short AV198Tarticuwwds_15_tfartpml_to ,
                                          short AV199Tarticuwwds_16_tfartgraaca ,
                                          short AV200Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV201Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV202Tarticuwwds_19_tfartren_to ,
                                          short AV203Tarticuwwds_20_tfartacamin ,
                                          short AV204Tarticuwwds_21_tfartacamin_to ,
                                          String AV206Tarticuwwds_23_tfartcomer_sel ,
                                          String AV205Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[33];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T2.CliAct, T1.ArtLotMts, T1.ArtLotKgs, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod," ;
      scmdbuf += " T1.ArtDsc, T2.CliNom FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV184Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
         GXv_int23[1] = (byte)(1) ;
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV185Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV186Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV187Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV189Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV191Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV193Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV194Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV196Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV195Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV196Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV197Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV198Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV199Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV200Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV201Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV202Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV203Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV204Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV206Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV205Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV206Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
      }
      else if ( true )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
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
                  return conditional_H00912(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00912", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00913", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.ProDsc, T1.ProAct, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?) AND (? = 'S') ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00914", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.ProDsc, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?) AND (? = 'S') ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00915", "SELECT FasCod, ArtProLin, ProCod, ArtCod, CliCod, EmprCod, ArtProCod FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00916", "SELECT FasCod, ArtProLin, ArtProCod, ArtCod, CliCod, EmprCod, ProCod FROM TXPArtFor WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ArtProCod = ?) ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00917", "SELECT ArtCod, CliCod, EmprCod, IntPreMtr, IntPreKgm, IntCod, TipColCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00918", "SELECT Int_Lin, ArtCod, CliCod, EmprCod, Int_Pm, Int_Pk, Int_Un, Int_cod FROM TXPINCIN1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

