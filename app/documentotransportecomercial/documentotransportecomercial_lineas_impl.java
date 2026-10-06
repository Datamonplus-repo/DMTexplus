package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_lineas_impl extends GXDataArea
{
   public documentotransportecomercial_lineas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_lineas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_lineas_impl.class ));
   }

   public documentotransportecomercial_lineas_impl( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbcompri = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
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
            AV76EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76EmprCod", AV76EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV77AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77AlbComCod), 8, 0));
               AV78CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV78CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod), 6, 0));
               AV79CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV79CliNom", AV79CliNom);
               AV80AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80AlbComFch", localUtil.format(AV80AlbComFch, "99/99/99"));
               AV103AlbComHor = localUtil.parseDTimeParm( httpContext.GetPar( "AlbComHor")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV103AlbComHor", localUtil.ttoc( AV103AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV94AlbComPri = httpContext.GetPar( "AlbComPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV94AlbComPri", AV94AlbComPri);
               AV99AlbComEAT = (byte)(GXutil.lval( httpContext.GetPar( "AlbComEAT"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV99AlbComEAT", GXutil.str( AV99AlbComEAT, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99AlbComEAT), "9")));
               AV100AlbComID = httpContext.GetPar( "AlbComID") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV100AlbComID", AV100AlbComID);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV100AlbComID, ""))));
               AV101Albcomest = (byte)(GXutil.lval( httpContext.GetPar( "Albcomest"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV101Albcomest", GXutil.str( AV101Albcomest, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Albcomest), "9")));
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
      nRC_GXsfl_114 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_114"))) ;
      nGXsfl_114_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_114_idx"))) ;
      sGXsfl_114_idx = httpContext.GetPar( "sGXsfl_114_idx") ;
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
      AV76EmprCod = httpContext.GetPar( "EmprCod") ;
      AV77AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
      AV40TFAlbComLin = (short)(GXutil.lval( httpContext.GetPar( "TFAlbComLin"))) ;
      AV41TFAlbComLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbComLin_To"))) ;
      AV42TFAlbComDsc = httpContext.GetPar( "TFAlbComDsc") ;
      AV43TFAlbComDsc_Sel = httpContext.GetPar( "TFAlbComDsc_Sel") ;
      AV44TFAlbComDc2 = httpContext.GetPar( "TFAlbComDc2") ;
      AV45TFAlbComDc2_Sel = httpContext.GetPar( "TFAlbComDc2_Sel") ;
      AV50TFAlbComCnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComCnt"), ".") ;
      AV51TFAlbComCnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComCnt_To"), ".") ;
      AV48TFAlbUcoDsc = httpContext.GetPar( "TFAlbUcoDsc") ;
      AV49TFAlbUcoDsc_Sel = httpContext.GetPar( "TFAlbUcoDsc_Sel") ;
      AV52TFAlbComPre = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComPre"), ".") ;
      AV53TFAlbComPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComPre_To"), ".") ;
      AV54TFAlbCImpLin = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbCImpLin"), ".") ;
      AV55TFAlbCImpLin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbCImpLin_To"), ".") ;
      AV106Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV97TotAlbCImpLin = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbCImpLin"), ".") ;
      AV99AlbComEAT = (byte)(GXutil.lval( httpContext.GetPar( "AlbComEAT"))) ;
      AV100AlbComID = httpContext.GetPar( "AlbComID") ;
      AV101Albcomest = (byte)(GXutil.lval( httpContext.GetPar( "Albcomest"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
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
      pa25Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start25Z2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV76EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV78CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV79CliNom)),GXutil.URLEncode(GXutil.formatDateParm(AV80AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV103AlbComHor)),GXutil.URLEncode(GXutil.rtrim(AV94AlbComPri)),GXutil.URLEncode(GXutil.ltrimstr(AV99AlbComEAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV100AlbComID)),GXutil.URLEncode(GXutil.ltrimstr(AV101Albcomest,1,0))}, new String[] {"EmprCod","AlbComCod","CliCod","CliNom","AlbComFch","AlbComHor","AlbComPri","AlbComEAT","AlbComID","Albcomest"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBCIMPLIN", getSecureSignedToken( "", localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV100AlbComID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Albcomest), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Lineas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_lineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_114", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_114, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBCOMUNI_DATA", AV81AlbComUni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBCOMUNI_DATA", AV81AlbComUni_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV68GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV69GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV66DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV66DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV76EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMLIN", GXutil.ltrim( localUtil.ntoc( AV40TFAlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMLIN_TO", GXutil.ltrim( localUtil.ntoc( AV41TFAlbComLin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMDSC", GXutil.rtrim( AV42TFAlbComDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMDSC_SEL", GXutil.rtrim( AV43TFAlbComDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMDC2", GXutil.rtrim( AV44TFAlbComDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMDC2_SEL", GXutil.rtrim( AV45TFAlbComDc2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCNT", GXutil.ltrim( localUtil.ntoc( AV50TFAlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCNT_TO", GXutil.ltrim( localUtil.ntoc( AV51TFAlbComCnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBUCODSC", GXutil.rtrim( AV48TFAlbUcoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBUCODSC_SEL", GXutil.rtrim( AV49TFAlbUcoDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMPRE", GXutil.ltrim( localUtil.ntoc( AV52TFAlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMPRE_TO", GXutil.ltrim( localUtil.ntoc( AV53TFAlbComPre_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCIMPLIN", GXutil.ltrim( localUtil.ntoc( AV54TFAlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCIMPLIN_TO", GXutil.ltrim( localUtil.ntoc( AV55TFAlbCImpLin_To, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBCIMPLIN", GXutil.ltrim( localUtil.ntoc( AV97TotAlbCImpLin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBCIMPLIN", getSecureSignedToken( "", localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMEAT", GXutil.ltrim( localUtil.ntoc( AV99AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMID", GXutil.rtrim( AV100AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV100AlbComID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMEST", GXutil.ltrim( localUtil.ntoc( AV101Albcomest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Albcomest), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMLIN_SELECTED", GXutil.ltrim( localUtil.ntoc( AV102AlbComLin_Selected, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMFS", localUtil.ttoc( AV87AlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMHOR", localUtil.ttoc( AV103AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV88Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV92Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPL", GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Cls", GXutil.rtrim( Combo_albcomuni_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Selectedvalue_set", GXutil.rtrim( Combo_albcomuni_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Emptyitem", GXutil.booltostr( Combo_albcomuni_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBCOMUNI_Selectedvalue_get", GXutil.rtrim( Combo_albcomuni_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
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
         we25Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt25Z2( ) ;
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
      return formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV76EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV78CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV79CliNom)),GXutil.URLEncode(GXutil.formatDateParm(AV80AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV103AlbComHor)),GXutil.URLEncode(GXutil.rtrim(AV94AlbComPri)),GXutil.URLEncode(GXutil.ltrimstr(AV99AlbComEAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV100AlbComID)),GXutil.URLEncode(GXutil.ltrimstr(AV101Albcomest,1,0))}, new String[] {"EmprCod","AlbComCod","CliCod","CliNom","AlbComFch","AlbComHor","AlbComPri","AlbComEAT","AlbComID","Albcomest"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Comercial_Lineas_Trn", "") ;
   }

   public void wb25Z0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomcod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV77AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcomcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77AlbComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV77AlbComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV78CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV78CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV78CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV79CliNom), GXutil.rtrim( localUtil.format( AV79CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavAlbcomfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomfch_Internalname, localUtil.format(AV80AlbComFch, "99/99/99"), localUtil.format( AV80AlbComFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbcomfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbcomfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbcompri.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbcompri.getInternalname(), httpContext.getMessage( "Tipo Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbcompri, cmbavAlbcompri.getInternalname(), GXutil.rtrim( AV94AlbComPri), 1, cmbavAlbcompri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbcompri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         cmbavAlbcompri.setValue( GXutil.rtrim( AV94AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomlin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV73AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcomlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73AlbComLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73AlbComLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomlin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomdsc_Internalname, GXutil.rtrim( AV74AlbComDsc), GXutil.rtrim( localUtil.format( AV74AlbComDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomdsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomdc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomdc2_Internalname, httpContext.getMessage( "Descripcion II", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomdc2_Internalname, GXutil.rtrim( AV75AlbComDc2), GXutil.rtrim( localUtil.format( AV75AlbComDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomdc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomdc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomcnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomcnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomcnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV72AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcomcnt_Enabled!=0) ? localUtil.format( AV72AlbComCnt, "ZZZZZ9.99") : localUtil.format( AV72AlbComCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomcnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomcnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbcomuni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_albcomuni_Internalname, httpContext.getMessage( "Und", ""), "", "", lblTextblockcombo_albcomuni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_albcomuni.setProperty("Caption", Combo_albcomuni_Caption);
         ucCombo_albcomuni.setProperty("Cls", Combo_albcomuni_Cls);
         ucCombo_albcomuni.setProperty("EmptyItem", Combo_albcomuni_Emptyitem);
         ucCombo_albcomuni.setProperty("DropDownOptionsData", AV81AlbComUni_Data);
         ucCombo_albcomuni.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albcomuni_Internalname, "COMBO_ALBCOMUNIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcompre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcompre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcompre_Internalname, GXutil.ltrim( localUtil.ntoc( AV95AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcompre_Enabled!=0) ? localUtil.format( AV95AlbComPre, "ZZZZZZ9.999") : localUtil.format( AV95AlbComPre, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcompre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcompre_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcimplin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcimplin_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcimplin_Internalname, GXutil.ltrim( localUtil.ntoc( AV96AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcimplin_Enabled!=0) ? localUtil.format( AV96AlbCImpLin, "ZZZZZZZZZZ9.99") : localUtil.format( AV96AlbCImpLin, "ZZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcimplin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcimplin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_91_25Z2( true) ;
      }
      else
      {
         wb_table1_91_25Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_91_25Z2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashcomunicarat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashcomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashcomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol114( ) ;
      }
      if ( wbEnd == 114 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_114 = (int)(nGXsfl_114_idx-1) ;
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
         wb_table2_125_25Z2( true) ;
      }
      else
      {
         wb_table2_125_25Z2( false) ;
      }
      return  ;
   }

   public void wb_table2_125_25Z2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV68GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV69GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV106Pgmname), GXutil.rtrim( localUtil.format( AV106Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomuni_Internalname, GXutil.ltrim( localUtil.ntoc( AV71AlbComUni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71AlbComUni), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomuni_Jsonclick, 0, "Attribute", "", "", "", "", edtavAlbcomuni_Visible, 1, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV66DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_152_25Z2( true) ;
      }
      else
      {
         wb_table3_152_25Z2( false) ;
      }
      return  ;
   }

   public void wb_table3_152_25Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 114 )
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

   public void start25Z2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Comercial_Lineas_Trn", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup25Z0( ) ;
   }

   public void ws25Z2( )
   {
      start25Z2( ) ;
      evt25Z2( ) ;
   }

   public void evt25Z2( )
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
                           e1125Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1225Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1325Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETE.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1425Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dohashcomunicarat' */
                           e1525Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1625Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBCOMLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1725Z2 ();
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
                                 e1825Z2 ();
                              }
                              dynload_actions( ) ;
                           }
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_114_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1142( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV70GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridActions), 4, 0));
                           A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
                           A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
                           A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
                           A5144AlbUcoDsc = httpContext.cgiGet( edtAlbUcoDsc_Internalname) ;
                           n5144AlbUcoDsc = false ;
                           A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
                           A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtAlbCImpLin_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1925Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2025Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2125Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2225Z2 ();
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

   public void we25Z2( )
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

   public void pa25Z2( )
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
            GX_FocusControl = edtavAlbcomlin_Internalname ;
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
      subsflControlProps_1142( ) ;
      while ( nGXsfl_114_idx <= nRC_GXsfl_114 )
      {
         sendrow_1142( ) ;
         nGXsfl_114_idx = ((subGrid_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV76EmprCod ,
                                 int AV77AlbComCod ,
                                 short AV40TFAlbComLin ,
                                 short AV41TFAlbComLin_To ,
                                 String AV42TFAlbComDsc ,
                                 String AV43TFAlbComDsc_Sel ,
                                 String AV44TFAlbComDc2 ,
                                 String AV45TFAlbComDc2_Sel ,
                                 java.math.BigDecimal AV50TFAlbComCnt ,
                                 java.math.BigDecimal AV51TFAlbComCnt_To ,
                                 String AV48TFAlbUcoDsc ,
                                 String AV49TFAlbUcoDsc_Sel ,
                                 java.math.BigDecimal AV52TFAlbComPre ,
                                 java.math.BigDecimal AV53TFAlbComPre_To ,
                                 java.math.BigDecimal AV54TFAlbCImpLin ,
                                 java.math.BigDecimal AV55TFAlbCImpLin_To ,
                                 String AV106Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV97TotAlbCImpLin ,
                                 byte AV99AlbComEAT ,
                                 String AV100AlbComID ,
                                 byte AV101Albcomest )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2025Z2 ();
      GRID_nCurrentRecord = 0 ;
      rf25Z2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Lineas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_lineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV94AlbComPri = cmbavAlbcompri.getValidValue(AV94AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94AlbComPri", AV94AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbcompri.setValue( GXutil.rtrim( AV94AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf25Z2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV106Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbcomcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomcod_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavAlbcomfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomfch_Enabled), 5, 0), true);
      cmbavAlbcompri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbcompri.getEnabled(), 5, 0), true);
      edtavAlbcimplin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcimplin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcimplin_Enabled), 5, 0), true);
      edtavTotvaluealbcimplin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbcimplin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcimplin_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf25Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(114) ;
      /* Execute user event: Refresh */
      e2025Z2 ();
      nGXsfl_114_idx = 1 ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
      bGXsfl_114_Refreshing = true ;
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
         subsflControlProps_1142( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                              Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                              AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                              AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                              AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                              AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                              AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                              AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                              AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                              AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                              AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                              AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                              AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                              AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                              Short.valueOf(A20AlbComLin) ,
                                              A15AlbComDsc ,
                                              A10806AlbComDc2 ,
                                              A13AlbComCnt ,
                                              A5144AlbUcoDsc ,
                                              A21AlbComPre ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV76EmprCod ,
                                              Integer.valueOf(AV77AlbComCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A14AlbComCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
         lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
         lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
         /* Using cursor H025Z2 */
         pr_default.execute(0, new Object[] {AV76EmprCod, Integer.valueOf(AV77AlbComCod), Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_114_idx = 1 ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4717AlbComUni = H025Z2_A4717AlbComUni[0] ;
            A396EmprCod = H025Z2_A396EmprCod[0] ;
            A14AlbComCod = H025Z2_A14AlbComCod[0] ;
            A5144AlbUcoDsc = H025Z2_A5144AlbUcoDsc[0] ;
            n5144AlbUcoDsc = H025Z2_n5144AlbUcoDsc[0] ;
            A10806AlbComDc2 = H025Z2_A10806AlbComDc2[0] ;
            A15AlbComDsc = H025Z2_A15AlbComDsc[0] ;
            A20AlbComLin = H025Z2_A20AlbComLin[0] ;
            A13AlbComCnt = H025Z2_A13AlbComCnt[0] ;
            A21AlbComPre = H025Z2_A21AlbComPre[0] ;
            A5144AlbUcoDsc = H025Z2_A5144AlbUcoDsc[0] ;
            n5144AlbUcoDsc = H025Z2_n5144AlbUcoDsc[0] ;
            A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
            A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
            e2125Z2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(114) ;
         wb25Z0( ) ;
      }
      bGXsfl_114_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25Z2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBCIMPLIN", GXutil.ltrim( localUtil.ntoc( AV97TotAlbCImpLin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBCIMPLIN", getSecureSignedToken( "", localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99")));
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
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                           Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                           AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                           AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                           AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                           AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                           AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                           AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                           AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                           AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                           AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                           AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                           AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                           AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A15AlbComDsc ,
                                           A10806AlbComDc2 ,
                                           A13AlbComCnt ,
                                           A5144AlbUcoDsc ,
                                           A21AlbComPre ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV76EmprCod ,
                                           Integer.valueOf(AV77AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
      lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
      lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
      /* Using cursor H025Z3 */
      pr_default.execute(1, new Object[] {AV76EmprCod, Integer.valueOf(AV77AlbComCod), Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to});
      GRID_nRecordCount = H025Z3_AGRID_nRecordCount[0] ;
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
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76EmprCod, AV77AlbComCod, AV40TFAlbComLin, AV41TFAlbComLin_To, AV42TFAlbComDsc, AV43TFAlbComDsc_Sel, AV44TFAlbComDc2, AV45TFAlbComDc2_Sel, AV50TFAlbComCnt, AV51TFAlbComCnt_To, AV48TFAlbUcoDsc, AV49TFAlbUcoDsc_Sel, AV52TFAlbComPre, AV53TFAlbComPre_To, AV54TFAlbCImpLin, AV55TFAlbCImpLin_To, AV106Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97TotAlbCImpLin, AV99AlbComEAT, AV100AlbComID, AV101Albcomest) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV106Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbcomcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomcod_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavAlbcomfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomfch_Enabled), 5, 0), true);
      cmbavAlbcompri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbcompri.getEnabled(), 5, 0), true);
      edtavAlbcimplin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcimplin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcimplin_Enabled), 5, 0), true);
      edtavTotvaluealbcimplin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbcimplin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcimplin_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1925Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBCOMUNI_DATA"), AV81AlbComUni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV66DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_114 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_114"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV68GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV69GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Combo_albcomuni_Cls = httpContext.cgiGet( "COMBO_ALBCOMUNI_Cls") ;
         Combo_albcomuni_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBCOMUNI_Selectedvalue_set") ;
         Combo_albcomuni_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBCOMUNI_Emptyitem")) ;
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
         Dvelop_confirmpanel_delete_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Title") ;
         Dvelop_confirmpanel_delete_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext") ;
         Dvelop_confirmpanel_delete_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_delete_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption") ;
         Dvelop_confirmpanel_delete_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_delete_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition") ;
         Dvelop_confirmpanel_delete_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmtype") ;
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
         Dvelop_confirmpanel_delete_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCOMLIN");
            GX_FocusControl = edtavAlbcomlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73AlbComLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComLin), 3, 0));
         }
         else
         {
            AV73AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbcomlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComLin), 3, 0));
         }
         AV74AlbComDsc = httpContext.cgiGet( edtavAlbcomdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74AlbComDsc", AV74AlbComDsc);
         AV75AlbComDc2 = httpContext.cgiGet( edtavAlbcomdc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75AlbComDc2", AV75AlbComDc2);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbcomcnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbcomcnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCOMCNT");
            GX_FocusControl = edtavAlbcomcnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72AlbComCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbComCnt", GXutil.ltrimstr( AV72AlbComCnt, 9, 2));
         }
         else
         {
            AV72AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtavAlbcomcnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbComCnt", GXutil.ltrimstr( AV72AlbComCnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbcompre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbcompre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCOMPRE");
            GX_FocusControl = edtavAlbcompre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95AlbComPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95AlbComPre", GXutil.ltrimstr( AV95AlbComPre, 13, 5));
         }
         else
         {
            AV95AlbComPre = localUtil.ctond( httpContext.cgiGet( edtavAlbcompre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95AlbComPre", GXutil.ltrimstr( AV95AlbComPre, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbcimplin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbcimplin_Internalname)), DecimalUtil.stringToDec("99999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCIMPLIN");
            GX_FocusControl = edtavAlbcimplin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96AlbCImpLin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96AlbCImpLin", GXutil.ltrimstr( AV96AlbCImpLin, 14, 2));
         }
         else
         {
            AV96AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtavAlbcimplin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96AlbCImpLin", GXutil.ltrimstr( AV96AlbCImpLin, 14, 2));
         }
         AV98TotValueAlbCImpLin = httpContext.cgiGet( edtavTotvaluealbcimplin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98TotValueAlbCImpLin", AV98TotValueAlbCImpLin);
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomuni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomuni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCOMUNI");
            GX_FocusControl = edtavAlbcomuni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71AlbComUni = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71AlbComUni", GXutil.str( AV71AlbComUni, 1, 0));
         }
         else
         {
            AV71AlbComUni = (byte)(localUtil.ctol( httpContext.cgiGet( edtavAlbcomuni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71AlbComUni", GXutil.str( AV71AlbComUni, 1, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Lineas");
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransportecomercial\\documentotransportecomercial_lineas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1925Z2 ();
      if (returnInSub) return;
   }

   public void e1925Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV83Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercial_lineas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV83Station = GXt_char1 ;
      GXv_char2[0] = AV76EmprCod ;
      GXv_char3[0] = AV84EmprNom ;
      GXv_char4[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_lineas_impl.this.AV76EmprCod = GXv_char2[0] ;
      documentotransportecomercial_lineas_impl.this.AV84EmprNom = GXv_char3[0] ;
      documentotransportecomercial_lineas_impl.this.AV85UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76EmprCod", AV76EmprCod);
      edtavAlbcomuni_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomuni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomuni_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOALBCOMUNI' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Transporte Comercial_Lineas_Trn", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV66DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV66DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      bttBtnenter_Enabled = ((AV99AlbComEAT==3)||(GXutil.strcmp(AV100AlbComID, " ")!=0)||(AV101Albcomest==2) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashcomunicarat_Enabled = ((AV99AlbComEAT==3)||(GXutil.strcmp(AV100AlbComID, " ")!=0)||(AV101Albcomest==2) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashcomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashcomunicarat_Enabled), 5, 0), true);
   }

   public void e2025Z2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int7 = AV73AlbComLin ;
      GXv_int8[0] = GXt_int7 ;
      new app.documentotransportecomercial.lalcom_prxid(remoteHandle, context).execute( AV76EmprCod, AV77AlbComCod, GXv_int8) ;
      documentotransportecomercial_lineas_impl.this.GXt_int7 = GXv_int8[0] ;
      AV73AlbComLin = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComLin), 3, 0));
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV68GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GridCurrentPage), 10, 0));
      AV69GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
      /*  Sending Event outputs  */
   }

   public void e1125Z2( )
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
         AV67PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV67PageToGo) ;
      }
   }

   public void e1225Z2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1325Z2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComLin") == 0 )
         {
            AV40TFAlbComLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFAlbComLin), 3, 0));
            AV41TFAlbComLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbComLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFAlbComLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComDsc") == 0 )
         {
            AV42TFAlbComDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbComDsc", AV42TFAlbComDsc);
            AV43TFAlbComDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFAlbComDsc_Sel", AV43TFAlbComDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComDc2") == 0 )
         {
            AV44TFAlbComDc2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbComDc2", AV44TFAlbComDc2);
            AV45TFAlbComDc2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbComDc2_Sel", AV45TFAlbComDc2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComCnt") == 0 )
         {
            AV50TFAlbComCnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbComCnt", GXutil.ltrimstr( AV50TFAlbComCnt, 9, 2));
            AV51TFAlbComCnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbComCnt_To", GXutil.ltrimstr( AV51TFAlbComCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbUcoDsc") == 0 )
         {
            AV48TFAlbUcoDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbUcoDsc", AV48TFAlbUcoDsc);
            AV49TFAlbUcoDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbUcoDsc_Sel", AV49TFAlbUcoDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComPre") == 0 )
         {
            AV52TFAlbComPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbComPre", GXutil.ltrimstr( AV52TFAlbComPre, 13, 5));
            AV53TFAlbComPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbComPre_To", GXutil.ltrimstr( AV53TFAlbComPre_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbCImpLin") == 0 )
         {
            AV54TFAlbCImpLin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbCImpLin", GXutil.ltrimstr( AV54TFAlbCImpLin, 14, 2));
            AV55TFAlbCImpLin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbCImpLin_To", GXutil.ltrimstr( AV55TFAlbCImpLin_To, 14, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2125Z2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(114) ;
      }
      sendrow_1142( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_114_Refreshing )
      {
         httpContext.doAjaxLoad(114, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV70GridActions, 4, 0)) );
   }

   public void e2225Z2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV70GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S182 ();
         if (returnInSub) return;
      }
      AV70GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV70GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1425Z2( )
   {
      /* Dvelop_confirmpanel_delete_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_delete_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETE' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1525Z2( )
   {
      /* 'Dohashcomunicarat' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV76EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.documentotransportecomercial.preparoxmldocumentotransportecomercial", new String[] {GXutil.URLEncode(GXutil.rtrim(AV76EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV80AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV87AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV103AlbComHor)),GXutil.URLEncode(GXutil.rtrim(AV94AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV88Cadena)),GXutil.URLEncode(GXutil.rtrim(AV92Hash))}, new String[] {"EmprCod","AlbProcod","AlbComFch","AlbProSys","AlbProSal","ALbProPri","Cadena","Hash"}) , new Object[] {"AV76EmprCod","AV77AlbComCod","AV80AlbComFch","AV87AlbComFs","AV103AlbComHor","AV94AlbComPri","AV88Cadena","AV92Hash"});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      cmbavAlbcompri.setValue( GXutil.rtrim( AV94AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
   }

   public void e1625Z2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV76EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV77AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"}) , new Object[] {});
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

   public void S182( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV99AlbComEAT == 3 ) || ! (GXutil.strcmp("", AV100AlbComID)==0) || ( AV101Albcomest == 2 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡ o Faturada", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV102AlbComLin_Selected = A20AlbComLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102AlbComLin_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102AlbComLin_Selected), 3, 0));
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      new app.documentotransportecomercial.documentotransportecomercial_delete(remoteHandle, context).execute( AV76EmprCod, AV77AlbComCod, AV102AlbComLin_Selected) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV106Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV106Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV106Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV40TFAlbComLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFAlbComLin), 3, 0));
            AV41TFAlbComLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbComLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFAlbComLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV42TFAlbComDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbComDsc", AV42TFAlbComDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV43TFAlbComDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFAlbComDsc_Sel", AV43TFAlbComDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDC2") == 0 )
         {
            AV44TFAlbComDc2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbComDc2", AV44TFAlbComDc2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDC2_SEL") == 0 )
         {
            AV45TFAlbComDc2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbComDc2_Sel", AV45TFAlbComDc2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCNT") == 0 )
         {
            AV50TFAlbComCnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbComCnt", GXutil.ltrimstr( AV50TFAlbComCnt, 9, 2));
            AV51TFAlbComCnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbComCnt_To", GXutil.ltrimstr( AV51TFAlbComCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUCODSC") == 0 )
         {
            AV48TFAlbUcoDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbUcoDsc", AV48TFAlbUcoDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUCODSC_SEL") == 0 )
         {
            AV49TFAlbUcoDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbUcoDsc_Sel", AV49TFAlbUcoDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRE") == 0 )
         {
            AV52TFAlbComPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbComPre", GXutil.ltrimstr( AV52TFAlbComPre, 13, 5));
            AV53TFAlbComPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbComPre_To", GXutil.ltrimstr( AV53TFAlbComPre_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCIMPLIN") == 0 )
         {
            AV54TFAlbCImpLin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbCImpLin", GXutil.ltrimstr( AV54TFAlbCImpLin, 14, 2));
            AV55TFAlbCImpLin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbCImpLin_To", GXutil.ltrimstr( AV55TFAlbCImpLin_To, 14, 2));
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFAlbComDsc_Sel)==0), AV43TFAlbComDsc_Sel, GXv_char4) ;
      documentotransportecomercial_lineas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbComDc2_Sel)==0), AV45TFAlbComDc2_Sel, GXv_char3) ;
      documentotransportecomercial_lineas_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbUcoDsc_Sel)==0), AV49TFAlbUcoDsc_Sel, GXv_char2) ;
      documentotransportecomercial_lineas_impl.this.GXt_char11 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char10+"||"+GXt_char11+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFAlbComDsc)==0), AV42TFAlbComDsc, GXv_char4) ;
      documentotransportecomercial_lineas_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFAlbComDc2)==0), AV44TFAlbComDc2, GXv_char3) ;
      documentotransportecomercial_lineas_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbUcoDsc)==0), AV48TFAlbUcoDsc, GXv_char2) ;
      documentotransportecomercial_lineas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV40TFAlbComLin) ? "" : GXutil.str( AV40TFAlbComLin, 3, 0))+"|"+GXt_char11+"|"+GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbComCnt)==0) ? "" : GXutil.str( AV50TFAlbComCnt, 9, 2))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbComPre)==0) ? "" : GXutil.str( AV52TFAlbComPre, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbCImpLin)==0) ? "" : GXutil.str( AV54TFAlbCImpLin, 14, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV41TFAlbComLin_To) ? "" : GXutil.str( AV41TFAlbComLin_To, 3, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbComCnt_To)==0) ? "" : GXutil.str( AV51TFAlbComCnt_To, 9, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbComPre_To)==0) ? "" : GXutil.str( AV53TFAlbComPre_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbCImpLin_To)==0) ? "" : GXutil.str( AV55TFAlbCImpLin_To, 14, 2)) ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV106Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCOMLIN", "", !((0==AV40TFAlbComLin)&&(0==AV41TFAlbComLin_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFAlbComLin, 3, 0)), GXutil.trim( GXutil.str( AV41TFAlbComLin_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCOMDSC", "", !(GXutil.strcmp("", AV42TFAlbComDsc)==0), (short)(0), AV42TFAlbComDsc, "", !(GXutil.strcmp("", AV43TFAlbComDsc_Sel)==0), AV43TFAlbComDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCOMDC2", "", !(GXutil.strcmp("", AV44TFAlbComDc2)==0), (short)(0), AV44TFAlbComDc2, "", !(GXutil.strcmp("", AV45TFAlbComDc2_Sel)==0), AV45TFAlbComDc2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCOMCNT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbComCnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbComCnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFAlbComCnt, 9, 2)), GXutil.trim( GXutil.str( AV51TFAlbComCnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBUCODSC", "", !(GXutil.strcmp("", AV48TFAlbUcoDsc)==0), (short)(0), AV48TFAlbUcoDsc, "", !(GXutil.strcmp("", AV49TFAlbUcoDsc_Sel)==0), AV49TFAlbUcoDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCOMPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbComPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFAlbComPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFAlbComPre, 13, 5)), GXutil.trim( GXutil.str( AV53TFAlbComPre_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBCIMPLIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbCImpLin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbCImpLin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFAlbCImpLin, 14, 2)), GXutil.trim( GXutil.str( AV55TFAlbCImpLin_To, 14, 2))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV106Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV106Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas_Trn" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV97TotAlbCImpLin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TotAlbCImpLin", GXutil.ltrimstr( AV97TotAlbCImpLin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBCIMPLIN", getSecureSignedToken( "", localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin = AV40TFAlbComLin ;
      AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to = AV41TFAlbComLin_To ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = AV42TFAlbComDsc ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = AV43TFAlbComDsc_Sel ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = AV44TFAlbComDc2 ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = AV45TFAlbComDc2_Sel ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = AV50TFAlbComCnt ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = AV51TFAlbComCnt_To ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = AV48TFAlbUcoDsc ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = AV49TFAlbUcoDsc_Sel ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = AV52TFAlbComPre ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = AV53TFAlbComPre_To ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = AV54TFAlbCImpLin ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = AV55TFAlbCImpLin_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) ,
                                           Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) ,
                                           AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                           AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                           AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                           AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                           AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                           AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                           AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                           AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                           AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                           AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                           AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                           AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A15AlbComDsc ,
                                           A10806AlbComDc2 ,
                                           A13AlbComCnt ,
                                           A5144AlbUcoDsc ,
                                           A21AlbComPre ,
                                           AV76EmprCod ,
                                           Integer.valueOf(AV77AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc), 40, "%") ;
      lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = GXutil.padr( GXutil.rtrim( AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2), 100, "%") ;
      lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = GXutil.padr( GXutil.rtrim( AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc), 8, "%") ;
      /* Using cursor H025Z4 */
      pr_default.execute(2, new Object[] {AV76EmprCod, Integer.valueOf(AV77AlbComCod), Short.valueOf(AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin), Short.valueOf(AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to), lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc, AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel, lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2, AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to, lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc, AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4717AlbComUni = H025Z4_A4717AlbComUni[0] ;
         A14AlbComCod = H025Z4_A14AlbComCod[0] ;
         A396EmprCod = H025Z4_A396EmprCod[0] ;
         A5144AlbUcoDsc = H025Z4_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = H025Z4_n5144AlbUcoDsc[0] ;
         A10806AlbComDc2 = H025Z4_A10806AlbComDc2[0] ;
         A15AlbComDsc = H025Z4_A15AlbComDsc[0] ;
         A20AlbComLin = H025Z4_A20AlbComLin[0] ;
         A13AlbComCnt = H025Z4_A13AlbComCnt[0] ;
         A21AlbComPre = H025Z4_A21AlbComPre[0] ;
         A5144AlbUcoDsc = H025Z4_A5144AlbUcoDsc[0] ;
         n5144AlbUcoDsc = H025Z4_n5144AlbUcoDsc[0] ;
         A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3914AlbCImpL", GXutil.ltrimstr( A3914AlbCImpL, 16, 5));
         A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
         AV97TotAlbCImpLin = A12AlbCImpLin.add(AV97TotAlbCImpLin) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97TotAlbCImpLin", GXutil.ltrimstr( AV97TotAlbCImpLin, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBCIMPLIN", getSecureSignedToken( "", localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV98TotValueAlbCImpLin = localUtil.format( AV97TotAlbCImpLin, "ZZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TotValueAlbCImpLin", AV98TotValueAlbCImpLin);
   }

   public void S112( )
   {
      /* 'LOADCOMBOALBCOMUNI' Routine */
      returnInSub = false ;
      /* Using cursor H025Z5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H025Z5_A396EmprCod[0] ;
         A13772UnidCDsc = H025Z5_A13772UnidCDsc[0] ;
         A848UniCod = H025Z5_A848UniCod[0] ;
         A849UniDsc = H025Z5_A849UniDsc[0] ;
         n849UniDsc = H025Z5_n849UniDsc[0] ;
         AV82Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV82Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A848UniCod, 1, 0)) );
         AV82Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13772UnidCDsc );
         AV81AlbComUni_Data.add(AV82Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_albcomuni_Selectedvalue_set = ((0==AV71AlbComUni) ? "" : GXutil.trim( GXutil.str( AV71AlbComUni, 1, 0))) ;
      ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "SelectedValue_set", Combo_albcomuni_Selectedvalue_set);
   }

   public void e1725Z2( )
   {
      /* Albcomlin_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char4[0] = AV74AlbComDsc ;
      GXv_char3[0] = AV75AlbComDc2 ;
      GXv_decimal13[0] = AV72AlbComCnt ;
      GXv_int14[0] = AV71AlbComUni ;
      GXv_decimal15[0] = AV95AlbComPre ;
      GXv_int8[0] = AV86Lalcom ;
      new app.documentotransportecomercial.documentotransportecomercial_obtengodatos(remoteHandle, context).execute( AV76EmprCod, AV77AlbComCod, AV73AlbComLin, GXv_char4, GXv_char3, GXv_decimal13, GXv_int14, GXv_decimal15, GXv_int8) ;
      documentotransportecomercial_lineas_impl.this.AV74AlbComDsc = GXv_char4[0] ;
      documentotransportecomercial_lineas_impl.this.AV75AlbComDc2 = GXv_char3[0] ;
      documentotransportecomercial_lineas_impl.this.AV72AlbComCnt = GXv_decimal13[0] ;
      documentotransportecomercial_lineas_impl.this.AV71AlbComUni = GXv_int14[0] ;
      documentotransportecomercial_lineas_impl.this.AV95AlbComPre = GXv_decimal15[0] ;
      documentotransportecomercial_lineas_impl.this.AV86Lalcom = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74AlbComDsc", AV74AlbComDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV75AlbComDc2", AV75AlbComDc2);
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbComCnt", GXutil.ltrimstr( AV72AlbComCnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbComUni", GXutil.str( AV71AlbComUni, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV95AlbComPre", GXutil.ltrimstr( AV95AlbComPre, 13, 5));
      AV96AlbCImpLin = GXutil.roundDecimal( AV95AlbComPre.multiply(AV72AlbComCnt), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96AlbCImpLin", GXutil.ltrimstr( AV96AlbCImpLin, 14, 2));
      Combo_albcomuni_Selectedvalue_set = ((0==AV71AlbComUni) ? "" : GXutil.trim( GXutil.str( AV71AlbComUni, 1, 0))) ;
      ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "SelectedValue_set", Combo_albcomuni_Selectedvalue_set);
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1825Z2 ();
      if (returnInSub) return;
   }

   public void e1825Z2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV99AlbComEAT == 3 ) || ( GXutil.strcmp(AV100AlbComID, " ") != 0 ) || ( AV101Albcomest == 2 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada o Faturada", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavAlbcomlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV73AlbComLin == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Falta el numero de Linea", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavAlbcomlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72AlbComCnt)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Falta Cantidad", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavAlbcomcnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV72AlbComCnt.doubleValue() > 0 ) && (0==AV71AlbComUni) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Falta Unidad", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavAlbcomuni_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( (GXutil.strcmp("", AV74AlbComDsc)==0) && (GXutil.strcmp("", AV75AlbComDc2)==0) )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Falta Descripcion", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavAlbcomdsc_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     new app.documentotransportecomercial.documentotransportecomercial_insupd(remoteHandle, context).execute( AV76EmprCod, AV77AlbComCod, AV73AlbComLin, AV74AlbComDsc, AV75AlbComDc2, AV72AlbComCnt, AV71AlbComUni, AV95AlbComPre) ;
                     AV73AlbComLin = (short)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComLin), 3, 0));
                     AV74AlbComDsc = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV74AlbComDsc", AV74AlbComDsc);
                     AV75AlbComDc2 = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV75AlbComDc2", AV75AlbComDc2);
                     AV72AlbComCnt = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV72AlbComCnt", GXutil.ltrimstr( AV72AlbComCnt, 9, 2));
                     AV71AlbComUni = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV71AlbComUni", GXutil.str( AV71AlbComUni, 1, 0));
                     AV95AlbComPre = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV95AlbComPre", GXutil.ltrimstr( AV95AlbComPre, 13, 5));
                     AV96AlbCImpLin = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV96AlbCImpLin", GXutil.ltrimstr( AV96AlbCImpLin, 14, 2));
                     Combo_albcomuni_Selectedvalue_set = ((0==AV71AlbComUni) ? "" : GXutil.trim( GXutil.str( AV71AlbComUni, 1, 0))) ;
                     ucCombo_albcomuni.sendProperty(context, "", false, Combo_albcomuni_Internalname, "SelectedValue_set", Combo_albcomuni_Selectedvalue_set);
                     AV86Lalcom = (short)(0) ;
                     GX_FocusControl = edtavAlbcomdsc_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     httpContext.doAjaxRefresh();
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table3_152_25Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_delete_Internalname, tblTabledvelop_confirmpanel_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_delete.setProperty("Title", Dvelop_confirmpanel_delete_Title);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_delete_Yesbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_delete_Nobuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_delete_Cancelbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_delete_Yesbuttonposition);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmType", Dvelop_confirmpanel_delete_Confirmtype);
         ucDvelop_confirmpanel_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_delete_Internalname, "DVELOP_CONFIRMPANEL_DELETEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_152_25Z2e( true) ;
      }
      else
      {
         wb_table3_152_25Z2e( false) ;
      }
   }

   public void wb_table2_125_25Z2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbcimplin_Internalname, httpContext.getMessage( "Tot Value Alb CImp Lin", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbcimplin_Internalname, AV98TotValueAlbCImpLin, GXutil.rtrim( localUtil.format( AV98TotValueAlbCImpLin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbcimplin_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbcimplin_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Lineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_125_25Z2e( true) ;
      }
      else
      {
         wb_table2_125_25Z2e( false) ;
      }
   }

   public void wb_table1_91_25Z2( boolean wbgen )
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
         wb_table1_91_25Z2e( true) ;
      }
      else
      {
         wb_table1_91_25Z2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV76EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76EmprCod", AV76EmprCod);
      AV77AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77AlbComCod), 8, 0));
      AV78CliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod), 6, 0));
      AV79CliNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79CliNom", AV79CliNom);
      AV80AlbComFch = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80AlbComFch", localUtil.format(AV80AlbComFch, "99/99/99"));
      AV103AlbComHor = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103AlbComHor", localUtil.ttoc( AV103AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV94AlbComPri = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbComPri", AV94AlbComPri);
      AV99AlbComEAT = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99AlbComEAT", GXutil.str( AV99AlbComEAT, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99AlbComEAT), "9")));
      AV100AlbComID = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100AlbComID", AV100AlbComID);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV100AlbComID, ""))));
      AV101Albcomest = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101Albcomest", GXutil.str( AV101Albcomest, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Albcomest), "9")));
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
      pa25Z2( ) ;
      ws25Z2( ) ;
      we25Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145360", true, true);
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
      httpContext.AddJavascriptSource("documentotransportecomercial/documentotransportecomercial_lineas.js", "?202682116145360", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1142( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_114_idx );
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_114_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_114_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_114_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_114_idx ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC_"+sGXsfl_114_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_114_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_114_idx ;
   }

   public void subsflControlProps_fel_1142( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_114_fel_idx );
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_114_fel_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_114_fel_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_114_fel_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_114_fel_idx ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC_"+sGXsfl_114_fel_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_114_fel_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_114_fel_idx ;
   }

   public void sendrow_1142( )
   {
      subsflControlProps_1142( ) ;
      wb25Z0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_114_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_114_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_114_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_114_idx+"',114)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_114_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV70GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV70GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV70GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_114_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV70GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_114_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDsc_Internalname,GXutil.rtrim( A15AlbComDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDc2_Internalname,GXutil.rtrim( A10806AlbComDc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13AlbComCnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbUcoDsc_Internalname,GXutil.rtrim( A5144AlbUcoDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbUcoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPre_Internalname,GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A21AlbComPre, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCImpLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12AlbCImpLin, "ZZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCImpLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes25Z2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_114_idx = ((subGrid_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      /* End function sendrow_1142 */
   }

   public void startgridcontrol114( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"114\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion II", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV70GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A15AlbComDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10806AlbComDc2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5144AlbUcoDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), ".", "")));
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
      edtavAlbcomcod_Internalname = "vALBCOMCOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavAlbcomfch_Internalname = "vALBCOMFCH" ;
      cmbavAlbcompri.setInternalname( "vALBCOMPRI" );
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAlbcomlin_Internalname = "vALBCOMLIN" ;
      edtavAlbcomdsc_Internalname = "vALBCOMDSC" ;
      edtavAlbcomdc2_Internalname = "vALBCOMDC2" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavAlbcomcnt_Internalname = "vALBCOMCNT" ;
      lblTextblockcombo_albcomuni_Internalname = "TEXTBLOCKCOMBO_ALBCOMUNI" ;
      Combo_albcomuni_Internalname = "COMBO_ALBCOMUNI" ;
      divTablesplittedalbcomuni_Internalname = "TABLESPLITTEDALBCOMUNI" ;
      edtavAlbcompre_Internalname = "vALBCOMPRE" ;
      edtavAlbcimplin_Internalname = "vALBCIMPLIN" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashcomunicarat_Internalname = "BTNHASHCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbComLin_Internalname = "ALBCOMLIN" ;
      edtAlbComDsc_Internalname = "ALBCOMDSC" ;
      edtAlbComDc2_Internalname = "ALBCOMDC2" ;
      edtAlbComCnt_Internalname = "ALBCOMCNT" ;
      edtAlbUcoDsc_Internalname = "ALBUCODSC" ;
      edtAlbComPre_Internalname = "ALBCOMPRE" ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN" ;
      edtavTotvaluealbcimplin_Internalname = "vTOTVALUEALBCIMPLIN" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavAlbcomuni_Internalname = "vALBCOMUNI" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_delete_Internalname = "DVELOP_CONFIRMPANEL_DELETE" ;
      tblTabledvelop_confirmpanel_delete_Internalname = "TABLEDVELOP_CONFIRMPANEL_DELETE" ;
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
      edtAlbCImpLin_Jsonclick = "" ;
      edtAlbComPre_Jsonclick = "" ;
      edtAlbUcoDsc_Jsonclick = "" ;
      edtAlbComCnt_Jsonclick = "" ;
      edtAlbComDc2_Jsonclick = "" ;
      edtAlbComDsc_Jsonclick = "" ;
      edtAlbComLin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluealbcimplin_Jsonclick = "" ;
      edtavTotvaluealbcimplin_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAlbcomuni_Jsonclick = "" ;
      edtavAlbcomuni_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnhashcomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      edtavAlbcimplin_Jsonclick = "" ;
      edtavAlbcimplin_Enabled = 1 ;
      edtavAlbcompre_Jsonclick = "" ;
      edtavAlbcompre_Enabled = 1 ;
      edtavAlbcomcnt_Jsonclick = "" ;
      edtavAlbcomcnt_Enabled = 1 ;
      edtavAlbcomdc2_Jsonclick = "" ;
      edtavAlbcomdc2_Enabled = 1 ;
      edtavAlbcomdsc_Jsonclick = "" ;
      edtavAlbcomdsc_Enabled = 1 ;
      edtavAlbcomlin_Jsonclick = "" ;
      edtavAlbcomlin_Enabled = 1 ;
      cmbavAlbcompri.setJsonclick( "" );
      cmbavAlbcompri.setEnabled( 0 );
      edtavAlbcomfch_Jsonclick = "" ;
      edtavAlbcomfch_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavAlbcomcod_Jsonclick = "" ;
      edtavAlbcomcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_delete_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteComercial.DocumentoTransporteComercial_LineasGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic||" ;
      Ddo_grid_Includedatalist = "|T|T||T||" ;
      Ddo_grid_Filterisrange = "T|||T||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|" ;
      Ddo_grid_Columnids = "1:AlbComLin|2:AlbComDsc|3:AlbComDc2|4:AlbComCnt|5:AlbUcoDsc|6:AlbComPre|7:AlbCImpLin" ;
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
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Combo_albcomuni_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albcomuni_Cls = "ExtendedCombo AttributeFL" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Comercial_Lineas_Trn", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbcompri.setName( "vALBCOMPRI" );
      cmbavAlbcompri.setWebtags( "" );
      cmbavAlbcompri.addItem("1", httpContext.getMessage( "GR", ""), (short)(0));
      cmbavAlbcompri.addItem("0", httpContext.getMessage( "GT", ""), (short)(0));
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV94AlbComPri = cmbavAlbcompri.getValidValue(AV94AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94AlbComPri", AV94AlbComPri);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_114_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV70GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV70GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A12AlbCImpLin',fld:'ALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV98TotValueAlbCImpLin',fld:'vTOTVALUEALBCIMPLIN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1125Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1225Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1325Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2125Z2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV70GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2225Z2',iparms:[{av:'cmbavGridactions'},{av:'AV70GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'A20AlbComLin',fld:'ALBCOMLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A12AlbCImpLin',fld:'ALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV70GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV102AlbComLin_Selected',fld:'vALBCOMLIN_SELECTED',pic:'ZZ9'},{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV98TotValueAlbCImpLin',fld:'vTOTVALUEALBCIMPLIN',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE","{handler:'e1425Z2',iparms:[{av:'Dvelop_confirmpanel_delete_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'AV102AlbComLin_Selected',fld:'vALBCOMLIN_SELECTED',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A12AlbCImpLin',fld:'ALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE",",oparms:[{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV98TotValueAlbCImpLin',fld:'vTOTVALUEALBCIMPLIN',pic:''}]}");
      setEventMetadata("'DOHASHCOMUNICARAT'","{handler:'e1525Z2',iparms:[{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV80AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV87AlbComFs',fld:'vALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV103AlbComHor',fld:'vALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'cmbavAlbcompri'},{av:'AV94AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV88Cadena',fld:'vCADENA',pic:''},{av:'AV92Hash',fld:'vHASH',pic:''}]");
      setEventMetadata("'DOHASHCOMUNICARAT'",",oparms:[{av:'AV92Hash',fld:'vHASH',pic:''},{av:'AV88Cadena',fld:'vCADENA',pic:''},{av:'cmbavAlbcompri'},{av:'AV94AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV103AlbComHor',fld:'vALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV87AlbComFs',fld:'vALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV80AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1625Z2',iparms:[{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALBCOMLIN.CONTROLVALUECHANGED","{handler:'e1725Z2',iparms:[{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALBCOMLIN.CONTROLVALUECHANGED",",oparms:[{av:'AV95AlbComPre',fld:'vALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV71AlbComUni',fld:'vALBCOMUNI',pic:'9'},{av:'AV72AlbComCnt',fld:'vALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV75AlbComDc2',fld:'vALBCOMDC2',pic:''},{av:'AV74AlbComDsc',fld:'vALBCOMDSC',pic:''},{av:'AV96AlbCImpLin',fld:'vALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'Combo_albcomuni_Selectedvalue_set',ctrl:'COMBO_ALBCOMUNI',prop:'SelectedValue_set'}]}");
      setEventMetadata("ENTER","{handler:'e1825Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV41TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV42TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV43TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV44TFAlbComDc2',fld:'vTFALBCOMDC2',pic:''},{av:'AV45TFAlbComDc2_Sel',fld:'vTFALBCOMDC2_SEL',pic:''},{av:'AV50TFAlbComCnt',fld:'vTFALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV51TFAlbComCnt_To',fld:'vTFALBCOMCNT_TO',pic:'ZZZZZ9.99'},{av:'AV48TFAlbUcoDsc',fld:'vTFALBUCODSC',pic:''},{av:'AV49TFAlbUcoDsc_Sel',fld:'vTFALBUCODSC_SEL',pic:''},{av:'AV52TFAlbComPre',fld:'vTFALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV53TFAlbComPre_To',fld:'vTFALBCOMPRE_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFAlbCImpLin',fld:'vTFALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'AV55TFAlbCImpLin_To',fld:'vTFALBCIMPLIN_TO',pic:'ZZZZZZZZZZ9.99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV99AlbComEAT',fld:'vALBCOMEAT',pic:'9',hsh:true},{av:'AV100AlbComID',fld:'vALBCOMID',pic:'',hsh:true},{av:'AV101Albcomest',fld:'vALBCOMEST',pic:'9',hsh:true},{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'},{av:'AV72AlbComCnt',fld:'vALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV71AlbComUni',fld:'vALBCOMUNI',pic:'9'},{av:'AV74AlbComDsc',fld:'vALBCOMDSC',pic:''},{av:'AV75AlbComDc2',fld:'vALBCOMDC2',pic:''},{av:'AV95AlbComPre',fld:'vALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A12AlbCImpLin',fld:'ALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV73AlbComLin',fld:'vALBCOMLIN',pic:'ZZ9'},{av:'AV74AlbComDsc',fld:'vALBCOMDSC',pic:''},{av:'AV75AlbComDc2',fld:'vALBCOMDC2',pic:''},{av:'AV72AlbComCnt',fld:'vALBCOMCNT',pic:'ZZZZZ9.99'},{av:'AV71AlbComUni',fld:'vALBCOMUNI',pic:'9'},{av:'AV95AlbComPre',fld:'vALBCOMPRE',pic:'ZZZZZZ9.999'},{av:'AV96AlbCImpLin',fld:'vALBCIMPLIN',pic:'ZZZZZZZZZZ9.99'},{av:'Combo_albcomuni_Selectedvalue_set',ctrl:'COMBO_ALBCOMUNI',prop:'SelectedValue_set'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV97TotAlbCImpLin',fld:'vTOTALBCIMPLIN',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV98TotValueAlbCImpLin',fld:'vTOTVALUEALBCIMPLIN',pic:''}]}");
      setEventMetadata("VALIDV_ALBCOMCOD","{handler:'validv_Albcomcod',iparms:[]");
      setEventMetadata("VALIDV_ALBCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCNT","{handler:'valid_Albcomcnt',iparms:[]");
      setEventMetadata("VALID_ALBCOMCNT",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMPRE","{handler:'valid_Albcompre',iparms:[]");
      setEventMetadata("VALID_ALBCOMPRE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcimplin',iparms:[]");
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
      wcpOAV76EmprCod = "" ;
      wcpOAV79CliNom = "" ;
      wcpOAV80AlbComFch = GXutil.nullDate() ;
      wcpOAV103AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV94AlbComPri = "" ;
      wcpOAV100AlbComID = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_delete_Result = "" ;
      Combo_albcomuni_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV76EmprCod = "" ;
      AV79CliNom = "" ;
      AV80AlbComFch = GXutil.nullDate() ;
      AV103AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV94AlbComPri = "" ;
      AV100AlbComID = "" ;
      AV42TFAlbComDsc = "" ;
      AV43TFAlbComDsc_Sel = "" ;
      AV44TFAlbComDc2 = "" ;
      AV45TFAlbComDc2_Sel = "" ;
      AV50TFAlbComCnt = DecimalUtil.ZERO ;
      AV51TFAlbComCnt_To = DecimalUtil.ZERO ;
      AV48TFAlbUcoDsc = "" ;
      AV49TFAlbUcoDsc_Sel = "" ;
      AV52TFAlbComPre = DecimalUtil.ZERO ;
      AV53TFAlbComPre_To = DecimalUtil.ZERO ;
      AV54TFAlbCImpLin = DecimalUtil.ZERO ;
      AV55TFAlbCImpLin_To = DecimalUtil.ZERO ;
      AV106Pgmname = "" ;
      AV97TotAlbCImpLin = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV81AlbComUni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV66DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV87AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV88Cadena = "" ;
      AV92Hash = "" ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      Combo_albcomuni_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV74AlbComDsc = "" ;
      AV75AlbComDc2 = "" ;
      AV72AlbComCnt = DecimalUtil.ZERO ;
      lblTextblockcombo_albcomuni_Jsonclick = "" ;
      ucCombo_albcomuni = new com.genexus.webpanels.GXUserControl();
      Combo_albcomuni_Caption = "" ;
      AV95AlbComPre = DecimalUtil.ZERO ;
      AV96AlbCImpLin = DecimalUtil.ZERO ;
      lblTbmessage_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashcomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
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
      A15AlbComDsc = "" ;
      A10806AlbComDc2 = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A5144AlbUcoDsc = "" ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = "" ;
      lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = "" ;
      lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = "" ;
      AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel = "" ;
      AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc = "" ;
      AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel = "" ;
      AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 = "" ;
      AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt = DecimalUtil.ZERO ;
      AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to = DecimalUtil.ZERO ;
      AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel = "" ;
      AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc = "" ;
      AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre = DecimalUtil.ZERO ;
      AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to = DecimalUtil.ZERO ;
      AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin = DecimalUtil.ZERO ;
      AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to = DecimalUtil.ZERO ;
      H025Z2_A4717AlbComUni = new byte[1] ;
      H025Z2_A396EmprCod = new String[] {""} ;
      H025Z2_A14AlbComCod = new int[1] ;
      H025Z2_A5144AlbUcoDsc = new String[] {""} ;
      H025Z2_n5144AlbUcoDsc = new boolean[] {false} ;
      H025Z2_A10806AlbComDc2 = new String[] {""} ;
      H025Z2_A15AlbComDsc = new String[] {""} ;
      H025Z2_A20AlbComLin = new short[1] ;
      H025Z2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025Z2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025Z3_AGRID_nRecordCount = new long[1] ;
      AV98TotValueAlbCImpLin = "" ;
      hsh = "" ;
      AV83Station = "" ;
      AV84EmprNom = "" ;
      AV85UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char11 = "" ;
      GXt_char10 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H025Z4_A4717AlbComUni = new byte[1] ;
      H025Z4_A14AlbComCod = new int[1] ;
      H025Z4_A396EmprCod = new String[] {""} ;
      H025Z4_A5144AlbUcoDsc = new String[] {""} ;
      H025Z4_n5144AlbUcoDsc = new boolean[] {false} ;
      H025Z4_A10806AlbComDc2 = new String[] {""} ;
      H025Z4_A15AlbComDsc = new String[] {""} ;
      H025Z4_A20AlbComLin = new short[1] ;
      H025Z4_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025Z4_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025Z5_A396EmprCod = new String[] {""} ;
      H025Z5_A13772UnidCDsc = new String[] {""} ;
      H025Z5_A848UniCod = new byte[1] ;
      H025Z5_A849UniDsc = new String[] {""} ;
      H025Z5_n849UniDsc = new boolean[] {false} ;
      A13772UnidCDsc = "" ;
      A849UniDsc = "" ;
      AV82Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new byte[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas__default(),
         new Object[] {
             new Object[] {
            H025Z2_A4717AlbComUni, H025Z2_A396EmprCod, H025Z2_A14AlbComCod, H025Z2_A5144AlbUcoDsc, H025Z2_n5144AlbUcoDsc, H025Z2_A10806AlbComDc2, H025Z2_A15AlbComDsc, H025Z2_A20AlbComLin, H025Z2_A13AlbComCnt, H025Z2_A21AlbComPre
            }
            , new Object[] {
            H025Z3_AGRID_nRecordCount
            }
            , new Object[] {
            H025Z4_A4717AlbComUni, H025Z4_A14AlbComCod, H025Z4_A396EmprCod, H025Z4_A5144AlbUcoDsc, H025Z4_n5144AlbUcoDsc, H025Z4_A10806AlbComDc2, H025Z4_A15AlbComDsc, H025Z4_A20AlbComLin, H025Z4_A13AlbComCnt, H025Z4_A21AlbComPre
            }
            , new Object[] {
            H025Z5_A396EmprCod, H025Z5_A13772UnidCDsc, H025Z5_A848UniCod, H025Z5_A849UniDsc, H025Z5_n849UniDsc
            }
         }
      );
      AV106Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas" ;
      /* GeneXus formulas. */
      AV106Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Lineas" ;
      Gx_err = (short)(0) ;
      edtavAlbcomcod_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavAlbcomfch_Enabled = 0 ;
      cmbavAlbcompri.setEnabled( 0 );
      edtavAlbcimplin_Enabled = 0 ;
      edtavTotvaluealbcimplin_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV99AlbComEAT ;
   private byte wcpOAV101Albcomest ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV99AlbComEAT ;
   private byte AV101Albcomest ;
   private byte gxajaxcallmode ;
   private byte AV71AlbComUni ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A4717AlbComUni ;
   private byte A848UniCod ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV40TFAlbComLin ;
   private short AV41TFAlbComLin_To ;
   private short AV12OrderedBy ;
   private short AV102AlbComLin_Selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV73AlbComLin ;
   private short AV70GridActions ;
   private short A20AlbComLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ;
   private short AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ;
   private short GXt_int7 ;
   private short AV86Lalcom ;
   private short GXv_int8[] ;
   private int wcpOAV77AlbComCod ;
   private int wcpOAV78CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_114 ;
   private int AV77AlbComCod ;
   private int AV78CliCod ;
   private int nGXsfl_114_idx=1 ;
   private int A14AlbComCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbcomcod_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavAlbcomfch_Enabled ;
   private int edtavAlbcomlin_Enabled ;
   private int edtavAlbcomdsc_Enabled ;
   private int edtavAlbcomdc2_Enabled ;
   private int edtavAlbcomcnt_Enabled ;
   private int edtavAlbcompre_Enabled ;
   private int edtavAlbcimplin_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashcomunicarat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavAlbcomuni_Visible ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluealbcimplin_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV67PageToGo ;
   private int AV121GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV68GridCurrentPage ;
   private long AV69GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV50TFAlbComCnt ;
   private java.math.BigDecimal AV51TFAlbComCnt_To ;
   private java.math.BigDecimal AV52TFAlbComPre ;
   private java.math.BigDecimal AV53TFAlbComPre_To ;
   private java.math.BigDecimal AV54TFAlbCImpLin ;
   private java.math.BigDecimal AV55TFAlbCImpLin_To ;
   private java.math.BigDecimal AV97TotAlbCImpLin ;
   private java.math.BigDecimal A3914AlbCImpL ;
   private java.math.BigDecimal AV72AlbComCnt ;
   private java.math.BigDecimal AV95AlbComPre ;
   private java.math.BigDecimal AV96AlbCImpLin ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A12AlbCImpLin ;
   private java.math.BigDecimal AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ;
   private java.math.BigDecimal AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ;
   private java.math.BigDecimal AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ;
   private java.math.BigDecimal AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ;
   private java.math.BigDecimal AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ;
   private java.math.BigDecimal AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV76EmprCod ;
   private String wcpOAV79CliNom ;
   private String wcpOAV94AlbComPri ;
   private String wcpOAV100AlbComID ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_delete_Result ;
   private String Combo_albcomuni_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV76EmprCod ;
   private String AV79CliNom ;
   private String AV94AlbComPri ;
   private String AV100AlbComID ;
   private String sGXsfl_114_idx="0001" ;
   private String AV42TFAlbComDsc ;
   private String AV43TFAlbComDsc_Sel ;
   private String AV44TFAlbComDc2 ;
   private String AV45TFAlbComDc2_Sel ;
   private String AV48TFAlbUcoDsc ;
   private String AV49TFAlbUcoDsc_Sel ;
   private String AV106Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_albcomuni_Cls ;
   private String Combo_albcomuni_Selectedvalue_set ;
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
   private String Dvelop_confirmpanel_delete_Title ;
   private String Dvelop_confirmpanel_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_delete_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbcomcod_Internalname ;
   private String edtavAlbcomcod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavAlbcomfch_Internalname ;
   private String edtavAlbcomfch_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbcomlin_Internalname ;
   private String TempTags ;
   private String edtavAlbcomlin_Jsonclick ;
   private String edtavAlbcomdsc_Internalname ;
   private String AV74AlbComDsc ;
   private String edtavAlbcomdsc_Jsonclick ;
   private String edtavAlbcomdc2_Internalname ;
   private String AV75AlbComDc2 ;
   private String edtavAlbcomdc2_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavAlbcomcnt_Internalname ;
   private String edtavAlbcomcnt_Jsonclick ;
   private String divTablesplittedalbcomuni_Internalname ;
   private String lblTextblockcombo_albcomuni_Internalname ;
   private String lblTextblockcombo_albcomuni_Jsonclick ;
   private String Combo_albcomuni_Caption ;
   private String Combo_albcomuni_Internalname ;
   private String edtavAlbcompre_Internalname ;
   private String edtavAlbcompre_Jsonclick ;
   private String edtavAlbcimplin_Internalname ;
   private String edtavAlbcimplin_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divTableactions_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashcomunicarat_Internalname ;
   private String bttBtnhashcomunicarat_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavAlbcomuni_Internalname ;
   private String edtavAlbcomuni_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbComLin_Internalname ;
   private String A15AlbComDsc ;
   private String edtAlbComDsc_Internalname ;
   private String A10806AlbComDc2 ;
   private String edtAlbComDc2_Internalname ;
   private String edtAlbComCnt_Internalname ;
   private String A5144AlbUcoDsc ;
   private String edtAlbUcoDsc_Internalname ;
   private String edtAlbComPre_Internalname ;
   private String edtAlbCImpLin_Internalname ;
   private String edtavTotvaluealbcimplin_Internalname ;
   private String scmdbuf ;
   private String lV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ;
   private String lV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ;
   private String lV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ;
   private String AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ;
   private String AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ;
   private String AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ;
   private String AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ;
   private String AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ;
   private String AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ;
   private String hsh ;
   private String AV83Station ;
   private String AV84EmprNom ;
   private String AV85UsurCod ;
   private String GXt_char11 ;
   private String GXt_char10 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A849UniDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluealbcimplin_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_114_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbComLin_Jsonclick ;
   private String edtAlbComDsc_Jsonclick ;
   private String edtAlbComDc2_Jsonclick ;
   private String edtAlbComCnt_Jsonclick ;
   private String edtAlbUcoDsc_Jsonclick ;
   private String edtAlbComPre_Jsonclick ;
   private String edtAlbCImpLin_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV103AlbComHor ;
   private java.util.Date AV103AlbComHor ;
   private java.util.Date AV87AlbComFs ;
   private java.util.Date wcpOAV80AlbComFch ;
   private java.util.Date AV80AlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_albcomuni_Emptyitem ;
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
   private boolean n5144AlbUcoDsc ;
   private boolean bGXsfl_114_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n849UniDsc ;
   private String AV88Cadena ;
   private String AV92Hash ;
   private String AV98TotValueAlbCImpLin ;
   private String A13772UnidCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_albcomuni ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbcompri ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private byte[] H025Z2_A4717AlbComUni ;
   private String[] H025Z2_A396EmprCod ;
   private int[] H025Z2_A14AlbComCod ;
   private String[] H025Z2_A5144AlbUcoDsc ;
   private boolean[] H025Z2_n5144AlbUcoDsc ;
   private String[] H025Z2_A10806AlbComDc2 ;
   private String[] H025Z2_A15AlbComDsc ;
   private short[] H025Z2_A20AlbComLin ;
   private java.math.BigDecimal[] H025Z2_A13AlbComCnt ;
   private java.math.BigDecimal[] H025Z2_A21AlbComPre ;
   private long[] H025Z3_AGRID_nRecordCount ;
   private byte[] H025Z4_A4717AlbComUni ;
   private int[] H025Z4_A14AlbComCod ;
   private String[] H025Z4_A396EmprCod ;
   private String[] H025Z4_A5144AlbUcoDsc ;
   private boolean[] H025Z4_n5144AlbUcoDsc ;
   private String[] H025Z4_A10806AlbComDc2 ;
   private String[] H025Z4_A15AlbComDsc ;
   private short[] H025Z4_A20AlbComLin ;
   private java.math.BigDecimal[] H025Z4_A13AlbComCnt ;
   private java.math.BigDecimal[] H025Z4_A21AlbComPre ;
   private String[] H025Z5_A396EmprCod ;
   private String[] H025Z5_A13772UnidCDsc ;
   private byte[] H025Z5_A848UniCod ;
   private String[] H025Z5_A849UniDsc ;
   private boolean[] H025Z5_n849UniDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV81AlbComUni_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV66DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV82Combo_DataItem ;
}

final  class documentotransportecomercial_lineas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV76EmprCod ,
                                          int AV77AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[21];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T2.UniDsc AS AlbUcoDsc, T1.AlbComDc2, T1.AlbComDsc, T1.AlbComLin, T1.AlbComCnt, T1.AlbComPre" ;
      sFromString = " FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbComCod = ?)");
      if ( ! (0==AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComDc2" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComDc2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComCnt" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.UniDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.UniDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComPre" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComPre DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComCod, T1.AlbComLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H025Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV76EmprCod ,
                                          int AV77AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[16];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbComCod = ?)");
      if ( ! (0==AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H025Z4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin ,
                                          short AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to ,
                                          String AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel ,
                                          String AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc ,
                                          String AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel ,
                                          String AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2 ,
                                          java.math.BigDecimal AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt ,
                                          java.math.BigDecimal AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to ,
                                          String AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel ,
                                          String AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc ,
                                          java.math.BigDecimal AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre ,
                                          java.math.BigDecimal AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to ,
                                          java.math.BigDecimal AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin ,
                                          java.math.BigDecimal AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to ,
                                          short A20AlbComLin ,
                                          String A15AlbComDsc ,
                                          String A10806AlbComDc2 ,
                                          java.math.BigDecimal A13AlbComCnt ,
                                          String A5144AlbUcoDsc ,
                                          java.math.BigDecimal A21AlbComPre ,
                                          String AV76EmprCod ,
                                          int AV77AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[16];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.AlbComUni AS AlbComUni, T1.AlbComCod, T1.EmprCod, T2.UniDsc AS AlbUcoDsc, T1.AlbComDc2, T1.AlbComDsc, T1.AlbComLin, T1.AlbComCnt, T1.AlbComPre FROM (TXPLALCOM" ;
      scmdbuf += " T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbComCod = ?)");
      if ( ! (0==AV107Documentotransportecomercial_documentotransportecomercial_lineasds_1_tfalbcomlin) )
      {
         addWhere(sWhereString, "(T1.AlbComLin >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransportecomercial_documentotransportecomercial_lineasds_2_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(T1.AlbComLin <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Documentotransportecomercial_documentotransportecomercial_lineasds_3_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Documentotransportecomercial_documentotransportecomercial_lineasds_4_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDsc = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) && ( ! (GXutil.strcmp("", AV111Documentotransportecomercial_documentotransportecomercial_lineasds_5_tfalbcomdc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Documentotransportecomercial_documentotransportecomercial_lineasds_6_tfalbcomdc2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComDc2 = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Documentotransportecomercial_documentotransportecomercial_lineasds_7_tfalbcomcnt)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Documentotransportecomercial_documentotransportecomercial_lineasds_8_tfalbcomcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComCnt <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Documentotransportecomercial_documentotransportecomercial_lineasds_9_tfalbucodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Documentotransportecomercial_documentotransportecomercial_lineasds_10_tfalbucodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.UniDsc = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Documentotransportecomercial_documentotransportecomercial_lineasds_11_tfalbcompre)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Documentotransportecomercial_documentotransportecomercial_lineasds_12_tfalbcompre_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPre <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Documentotransportecomercial_documentotransportecomercial_lineasds_13_tfalbcimplin)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Documentotransportecomercial_documentotransportecomercial_lineasds_14_tfalbcimplin_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T1.AlbComPre * CAST(T1.AlbComCnt AS NUMERIC(23,10))), 2) <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbComCod" ;
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
                  return conditional_H025Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() );
            case 1 :
                  return conditional_H025Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() );
            case 2 :
                  return conditional_H025Z4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025Z4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025Z5", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(UniCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( UniDsc, ''))) AS UnidCDsc, UniCod, UniDsc FROM TXPTIPUNI ORDER BY UnidCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               return;
      }
   }

}

