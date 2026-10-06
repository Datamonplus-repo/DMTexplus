package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_7_impl extends GXDataArea
{
   public documentotransporteproveedor_7_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproveedor_7_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_7_impl.class ));
   }

   public documentotransporteproveedor_7_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbpround = new HTMLChoice();
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbAlbProUnd = new HTMLChoice();
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
            AV5Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProID), 8, 0));
               AV55AlbProPrvID = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55AlbProPrvID), 6, 0));
               AV46AlbProStAT = (byte)(GXutil.lval( httpContext.GetPar( "AlbProStAT"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46AlbProStAT", GXutil.str( AV46AlbProStAT, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46AlbProStAT), "9")));
               AV7ALbProIDAT = httpContext.GetPar( "ALbProIDAT") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ALbProIDAT", AV7ALbProIDAT);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ALbProIDAT, ""))));
               AV8AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProSys", localUtil.ttoc( AV8AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSYS", getSecureSignedToken( "", localUtil.format( AV8AlbProSys, "99/99/99 99:99")));
               AV9AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProDate", localUtil.format(AV9AlbProDate, "99/99/99"));
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
      nRC_GXsfl_107 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_107"))) ;
      nGXsfl_107_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_107_idx"))) ;
      sGXsfl_107_idx = httpContext.GetPar( "sGXsfl_107_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
      AV20TFAlbProLinea = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProLinea"))) ;
      AV21TFAlbProLinea_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProLinea_To"))) ;
      AV22TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV23TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV24TFAlbProDsc = httpContext.GetPar( "TFAlbProDsc") ;
      AV25TFAlbProDsc_Sel = httpContext.GetPar( "TFAlbProDsc_Sel") ;
      AV26TFAlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbProCnt"), ".") ;
      AV27TFAlbProCnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbProCnt_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV29TFAlbProUnd_Sels);
      AV30TFAlbProCajas = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProCajas"))) ;
      AV31TFAlbProCajas_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProCajas_To"))) ;
      AV70TFAlbProLote = httpContext.GetPar( "TFAlbProLote") ;
      AV71TFAlbProLote_Sel = httpContext.GetPar( "TFAlbProLote_Sel") ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV46AlbProStAT = (byte)(GXutil.lval( httpContext.GetPar( "AlbProStAT"))) ;
      AV7ALbProIDAT = httpContext.GetPar( "ALbProIDAT") ;
      AV43Station = httpContext.GetPar( "Station") ;
      AV8AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
      AV66albprosal = localUtil.parseDTimeParm( httpContext.GetPar( "albprosal")) ;
      AV56Cadena = httpContext.GetPar( "Cadena") ;
      AV60Hash = httpContext.GetPar( "Hash") ;
      AV69Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV63DevCant = (short)(GXutil.lval( httpContext.GetPar( "DevCant"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
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
      pa29V2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29V2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.documentotransporteproveedor_7", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55AlbProPrvID,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46AlbProStAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7ALbProIDAT)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProDate))}, new String[] {"Emprcod","AlbProID","AlbProPrvID","AlbProStAT","ALbProIDAT","AlbProSys","AlbProDate"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSAL", getSecureSignedToken( "", localUtil.format( AV66albprosal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63DevCant), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ALbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSYS", getSecureSignedToken( "", localUtil.format( AV8AlbProSys, "99/99/99 99:99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_7");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_7:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_107", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_107, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV51PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV51PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV34GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV35GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLINEA", GXutil.ltrim( localUtil.ntoc( AV20TFAlbProLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLINEA_TO", GXutil.ltrim( localUtil.ntoc( AV21TFAlbProLinea_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV22TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV23TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODSC", GXutil.rtrim( AV24TFAlbProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODSC_SEL", GXutil.rtrim( AV25TFAlbProDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCNT", GXutil.ltrim( localUtil.ntoc( AV26TFAlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCNT_TO", GXutil.ltrim( localUtil.ntoc( AV27TFAlbProCnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROUND_SELS", AV29TFAlbProUnd_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROUND_SELS", AV29TFAlbProUnd_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCAJAS", GXutil.ltrim( localUtil.ntoc( AV30TFAlbProCajas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCAJAS_TO", GXutil.ltrim( localUtil.ntoc( AV31TFAlbProCajas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLOTE", GXutil.rtrim( AV70TFAlbProLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLOTE_SEL", GXutil.rtrim( AV71TFAlbProLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSTAT", GXutil.ltrim( localUtil.ntoc( AV46AlbProStAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46AlbProStAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROIDAT", GXutil.rtrim( AV7ALbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ALbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPRODATE", localUtil.dtoc( AV9AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV45UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV43Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSYS", localUtil.ttoc( AV8AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSYS", getSecureSignedToken( "", localUtil.format( AV8AlbProSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSAL", localUtil.ttoc( AV66albprosal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSAL", getSecureSignedToken( "", localUtil.format( AV66albprosal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV56Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV60Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV53prdnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCNTOLD", GXutil.ltrim( localUtil.ntoc( AV47AlbProCntold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRCANT", AV62Msg_errcant);
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUMOLD", GXutil.rtrim( AV49prdnumold));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV69Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCANT", GXutil.ltrim( localUtil.ntoc( AV63DevCant, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63DevCant), "ZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
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
         we29V2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29V2( ) ;
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
      return formatLink("app.stocksquimicos.documentotransporteproveedor_7", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55AlbProPrvID,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46AlbProStAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7ALbProIDAT)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProDate))}, new String[] {"Emprcod","AlbProID","AlbProPrvID","AlbProStAT","ALbProIDAT","AlbProSys","AlbProDate"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.DocumentoTransporteProveedor_7" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Proveedor", "") ;
   }

   public void wb29V0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproid_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6AlbProID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6AlbProID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproprvid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproprvid_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproprvid_Internalname, GXutil.ltrim( localUtil.ntoc( AV55AlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproprvid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55AlbProPrvID), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55AlbProPrvID), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproprvid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproprvid_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprolinea_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprolinea_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprolinea_Internalname, GXutil.ltrim( localUtil.ntoc( AV36AlbProLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprolinea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36AlbProLinea), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36AlbProLinea), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprolinea_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprolinea_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV51PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprodsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprodsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprodsc_Internalname, GXutil.rtrim( AV38AlbProDsc), GXutil.rtrim( localUtil.format( AV38AlbProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprodsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprodsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocnt_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV39AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocnt_Enabled!=0) ? localUtil.format( AV39AlbProCnt, "ZZZZZ9.99") : localUtil.format( AV39AlbProCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbpround.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbpround.getInternalname(), httpContext.getMessage( "Un.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbpround, cmbavAlbpround.getInternalname(), GXutil.rtrim( AV40AlbProUnd), 1, cmbavAlbpround.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbpround.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproobslin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproobslin_Internalname, httpContext.getMessage( "Observaciones", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproobslin_Internalname, GXutil.rtrim( AV42AlbProObsLin), GXutil.rtrim( localUtil.format( AV42AlbProObsLin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproobslin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproobslin_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocajas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocajas_Internalname, httpContext.getMessage( "Embalaje", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocajas_Internalname, GXutil.ltrim( localUtil.ntoc( AV41AlbProCajas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocajas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41AlbProCajas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41AlbProCajas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocajas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocajas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprolote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprolote_Internalname, httpContext.getMessage( "Lote", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprolote_Internalname, GXutil.rtrim( AV67AlbProLote), GXutil.rtrim( localUtil.format( AV67AlbProLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprolote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprolote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV72Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV72Prompt)==0)&&(GXutil.strcmp("", AV76Prompt_GXI)==0))||!(GXutil.strcmp("", AV72Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV72Prompt)==0) ? AV76Prompt_GXI : httpContext.getResourceRelative(AV72Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1129v1_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV72Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLalpro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLalpro_Internalname, httpContext.getMessage( "Lalpro", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLalpro_Internalname, GXutil.ltrim( localUtil.ntoc( AV50Lalpro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLalpro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50Lalpro), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50Lalpro), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLalpro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLalpro_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         wb_table1_81_29V2( true) ;
      }
      else
      {
         wb_table1_81_29V2( false) ;
      }
      return  ;
   }

   public void wb_table1_81_29V2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashcomunicarat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashcomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashcomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol107( ) ;
      }
      if ( wbEnd == 107 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_107 = (int)(nGXsfl_107_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV34GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV35GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV37PrdNum), GXutil.rtrim( localUtil.format( AV37PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_7.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_133_29V2( true) ;
      }
      else
      {
         wb_table2_133_29V2( false) ;
      }
      return  ;
   }

   public void wb_table2_133_29V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 107 )
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

   public void start29V2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29V0( ) ;
   }

   public void ws29V2( )
   {
      start29V2( ) ;
      evt29V2( ) ;
   }

   public void evt29V2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_PRDNUM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1229V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1329V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1429V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1529V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1629V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dohashcomunicarat' */
                           e1729V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1829V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROLINEA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1929V2 ();
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
                                 e2029V2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_107_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1072( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV64GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActionGroup1), 4, 0));
                           A13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A13448AlbProDsc = httpContext.cgiGet( edtAlbProDsc_Internalname) ;
                           n13448AlbProDsc = false ;
                           A13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)) ;
                           n13443AlbProCnt = false ;
                           cmbAlbProUnd.setName( cmbAlbProUnd.getInternalname() );
                           cmbAlbProUnd.setValue( httpContext.cgiGet( cmbAlbProUnd.getInternalname()) );
                           A13444AlbProUnd = httpContext.cgiGet( cmbAlbProUnd.getInternalname()) ;
                           n13444AlbProUnd = false ;
                           A13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13449AlbProCaja = false ;
                           A14401AlbProLote = httpContext.cgiGet( edtAlbProLote_Internalname) ;
                           n14401AlbProLote = false ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2129V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2229V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2329V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2429V2 ();
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

   public void we29V2( )
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

   public void pa29V2( )
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
            GX_FocusControl = edtavAlbprolinea_Internalname ;
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
      subsflControlProps_1072( ) ;
      while ( nGXsfl_107_idx <= nRC_GXsfl_107 )
      {
         sendrow_1072( ) ;
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6AlbProID ,
                                 short AV20TFAlbProLinea ,
                                 short AV21TFAlbProLinea_To ,
                                 String AV22TFPrdNum ,
                                 String AV23TFPrdNum_Sel ,
                                 String AV24TFAlbProDsc ,
                                 String AV25TFAlbProDsc_Sel ,
                                 java.math.BigDecimal AV26TFAlbProCnt ,
                                 java.math.BigDecimal AV27TFAlbProCnt_To ,
                                 GXSimpleCollection<String> AV29TFAlbProUnd_Sels ,
                                 short AV30TFAlbProCajas ,
                                 short AV31TFAlbProCajas_To ,
                                 String AV70TFAlbProLote ,
                                 String AV71TFAlbProLote_Sel ,
                                 String AV75Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 byte AV46AlbProStAT ,
                                 String AV7ALbProIDAT ,
                                 String AV43Station ,
                                 java.util.Date AV8AlbProSys ,
                                 java.util.Date AV66albprosal ,
                                 String AV56Cadena ,
                                 String AV60Hash ,
                                 short AV69Moda21 ,
                                 short AV63DevCant )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2229V2 ();
      GRID_nCurrentRecord = 0 ;
      rf29V2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_7");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_7:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
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
      if ( cmbavAlbpround.getItemCount() > 0 )
      {
         AV40AlbProUnd = cmbavAlbpround.getValidValue(AV40AlbProUnd) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29V2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_7" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbproid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      edtavAlbproprvid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproprvid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproprvid_Enabled), 5, 0), true);
      edtavLalpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLalpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLalpro_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29V2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(107) ;
      /* Execute user event: Refresh */
      e2229V2 ();
      nGXsfl_107_idx = 1 ;
      sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1072( ) ;
      bGXsfl_107_Refreshing = true ;
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
         subsflControlProps_1072( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A13444AlbProUnd ,
                                              AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                              Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) ,
                                              Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) ,
                                              AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                              AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                              AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                              AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                              AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                              AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                              Integer.valueOf(AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels.size()) ,
                                              Short.valueOf(AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) ,
                                              Short.valueOf(AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) ,
                                              AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                              AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                              Short.valueOf(A13442AlbProLine) ,
                                              A719PrdNum ,
                                              A13448AlbProDsc ,
                                              A13443AlbProCnt ,
                                              Short.valueOf(A13449AlbProCaja) ,
                                              A14401AlbProLote ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6AlbProID) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A13418AlbProID) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT
                                              }
         });
         lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum), 6, "%") ;
         lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc), 60, "%") ;
         lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote), 26, "%") ;
         /* Using cursor H029V2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6AlbProID), Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea), Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to), lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum, AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel, lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc, AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel, AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt, AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to, Short.valueOf(AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas), Short.valueOf(AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to), lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote, AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_107_idx = 1 ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13418AlbProID = H029V2_A13418AlbProID[0] ;
            A396EmprCod = H029V2_A396EmprCod[0] ;
            A14401AlbProLote = H029V2_A14401AlbProLote[0] ;
            n14401AlbProLote = H029V2_n14401AlbProLote[0] ;
            A13449AlbProCaja = H029V2_A13449AlbProCaja[0] ;
            n13449AlbProCaja = H029V2_n13449AlbProCaja[0] ;
            A13444AlbProUnd = H029V2_A13444AlbProUnd[0] ;
            n13444AlbProUnd = H029V2_n13444AlbProUnd[0] ;
            A13443AlbProCnt = H029V2_A13443AlbProCnt[0] ;
            n13443AlbProCnt = H029V2_n13443AlbProCnt[0] ;
            A13448AlbProDsc = H029V2_A13448AlbProDsc[0] ;
            n13448AlbProDsc = H029V2_n13448AlbProDsc[0] ;
            A719PrdNum = H029V2_A719PrdNum[0] ;
            A13442AlbProLine = H029V2_A13442AlbProLine[0] ;
            e2329V2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(107) ;
         wb29V0( ) ;
      }
      bGXsfl_107_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29V2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROID"+"_"+sGXsfl_107_idx, getSecureSignedToken( sGXsfl_107_idx, localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV43Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSAL", localUtil.ttoc( AV66albprosal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSAL", getSecureSignedToken( "", localUtil.format( AV66albprosal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV56Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCADENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56Cadena, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV60Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV69Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCANT", GXutil.ltrim( localUtil.ntoc( AV63DevCant, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63DevCant), "ZZZ9")));
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
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) ,
                                           AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                           AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                           AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                           AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                           AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                           AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) ,
                                           AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                           AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           A14401AlbProLote ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6AlbProID) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A13418AlbProID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum), 6, "%") ;
      lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc), 60, "%") ;
      lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote), 26, "%") ;
      /* Using cursor H029V3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6AlbProID), Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea), Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to), lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum, AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel, lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc, AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel, AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt, AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to, Short.valueOf(AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas), Short.valueOf(AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to), lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote, AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel});
      GRID_nRecordCount = H029V3_AGRID_nRecordCount[0] ;
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
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6AlbProID, AV20TFAlbProLinea, AV21TFAlbProLinea_To, AV22TFPrdNum, AV23TFPrdNum_Sel, AV24TFAlbProDsc, AV25TFAlbProDsc_Sel, AV26TFAlbProCnt, AV27TFAlbProCnt_To, AV29TFAlbProUnd_Sels, AV30TFAlbProCajas, AV31TFAlbProCajas_To, AV70TFAlbProLote, AV71TFAlbProLote_Sel, AV75Pgmname, AV17OrderedBy, AV18OrderedDsc, AV46AlbProStAT, AV7ALbProIDAT, AV43Station, AV8AlbProSys, AV66albprosal, AV56Cadena, AV60Hash, AV69Moda21, AV63DevCant) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_7" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbproid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      edtavAlbproprvid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproprvid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproprvid_Enabled), 5, 0), true);
      edtavLalpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLalpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLalpro_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29V0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2129V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV32DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV51PrdNum_Data);
         /* Read saved values. */
         nRC_GXsfl_107 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_107"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV35GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV5Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
         Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprolinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprolinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROLINEA");
            GX_FocusControl = edtavAlbprolinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36AlbProLinea = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProLinea), 4, 0));
         }
         else
         {
            AV36AlbProLinea = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbprolinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProLinea), 4, 0));
         }
         AV38AlbProDsc = httpContext.cgiGet( edtavAlbprodsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlbProDsc", AV38AlbProDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbprocnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbprocnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCNT");
            GX_FocusControl = edtavAlbprocnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39AlbProCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
         }
         else
         {
            AV39AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtavAlbprocnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
         }
         cmbavAlbpround.setName( cmbavAlbpround.getInternalname() );
         cmbavAlbpround.setValue( httpContext.cgiGet( cmbavAlbpround.getInternalname()) );
         AV40AlbProUnd = httpContext.cgiGet( cmbavAlbpround.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
         AV42AlbProObsLin = httpContext.cgiGet( edtavAlbproobslin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProObsLin", AV42AlbProObsLin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocajas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocajas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCAJAS");
            GX_FocusControl = edtavAlbprocajas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41AlbProCajas = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCajas), 4, 0));
         }
         else
         {
            AV41AlbProCajas = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbprocajas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCajas), 4, 0));
         }
         AV67AlbProLote = httpContext.cgiGet( edtavAlbprolote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67AlbProLote", AV67AlbProLote);
         AV72Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLalpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLalpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLALPRO");
            GX_FocusControl = edtavLalpro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50Lalpro = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Lalpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Lalpro), 4, 0));
         }
         else
         {
            AV50Lalpro = (short)(localUtil.ctol( httpContext.cgiGet( edtavLalpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Lalpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Lalpro), 4, 0));
         }
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
         AV37PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_7");
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\documentotransporteproveedor_7:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2129V2 ();
      if (returnInSub) return;
   }

   public void e2129V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransporteproveedor_7_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Station", AV43Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_7_impl.this.AV5Emprcod = GXv_char2[0] ;
      documentotransporteproveedor_7_impl.this.AV44EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_7_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV45UsurCod", AV45UsurCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavPrdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      bttBtnenter_Enabled = ((AV46AlbProStAT==3)||(GXutil.strcmp(AV7ALbProIDAT, " ")!=0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashcomunicarat_Enabled = ((AV46AlbProStAT==3)||(GXutil.strcmp(AV7ALbProIDAT, " ")!=0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashcomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashcomunicarat_Enabled), 5, 0), true);
      GXt_int7 = (byte)(AV63DevCant) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "DEVPRO", ""), GXv_int8) ;
      documentotransporteproveedor_7_impl.this.GXt_int7 = GXv_int8[0] ;
      AV63DevCant = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63DevCant", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63DevCant), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63DevCant), "ZZZ9")));
      GXt_int7 = (byte)(AV69Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      documentotransporteproveedor_7_impl.this.GXt_int7 = GXv_int8[0] ;
      AV69Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69Moda21), "ZZZ9")));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV72Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV72Prompt)==0) ? AV76Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV72Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV72Prompt), true);
      AV76Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV72Prompt)==0) ? AV76Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV72Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV72Prompt), true);
   }

   public void e2229V2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int9 = AV36AlbProLinea ;
      GXv_int10[0] = GXt_int9 ;
      new app.documentotransportecomercial.lalpro_prxid(remoteHandle, context).execute( AV5Emprcod, AV6AlbProID, GXv_int10) ;
      documentotransporteproveedor_7_impl.this.GXt_int9 = GXv_int10[0] ;
      AV36AlbProLinea = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProLinea), 4, 0));
      AV41AlbProCajas = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCajas), 4, 0));
      AV40AlbProUnd = "Kg" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
      GXv_SdtWWPContext11[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV11WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV34GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridCurrentPage), 10, 0));
      AV35GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridPageCount), 10, 0));
      AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea = AV20TFAlbProLinea ;
      AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to = AV21TFAlbProLinea_To ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = AV22TFPrdNum ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = AV24TFAlbProDsc ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = AV25TFAlbProDsc_Sel ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = AV26TFAlbProCnt ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = AV27TFAlbProCnt_To ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = AV29TFAlbProUnd_Sels ;
      AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas = AV30TFAlbProCajas ;
      AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to = AV31TFAlbProCajas_To ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = AV70TFAlbProLote ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = AV71TFAlbProLote_Sel ;
      /*  Sending Event outputs  */
      cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
   }

   public void e1329V2( )
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
         AV33PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV33PageToGo) ;
      }
   }

   public void e1429V2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1529V2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProLinea") == 0 )
         {
            AV20TFAlbProLinea = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAlbProLinea), 4, 0));
            AV21TFAlbProLinea_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAlbProLinea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFAlbProLinea_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV22TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPrdNum", AV22TFPrdNum);
            AV23TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPrdNum_Sel", AV23TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProDsc") == 0 )
         {
            AV24TFAlbProDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAlbProDsc", AV24TFAlbProDsc);
            AV25TFAlbProDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAlbProDsc_Sel", AV25TFAlbProDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCnt") == 0 )
         {
            AV26TFAlbProCnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbProCnt", GXutil.ltrimstr( AV26TFAlbProCnt, 9, 2));
            AV27TFAlbProCnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProCnt_To", GXutil.ltrimstr( AV27TFAlbProCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProUnd") == 0 )
         {
            AV28TFAlbProUnd_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProUnd_SelsJson", AV28TFAlbProUnd_SelsJson);
            AV29TFAlbProUnd_Sels.fromJSonString(AV28TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCajas") == 0 )
         {
            AV30TFAlbProCajas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAlbProCajas), 4, 0));
            AV31TFAlbProCajas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProCajas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFAlbProCajas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProLote") == 0 )
         {
            AV70TFAlbProLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbProLote", AV70TFAlbProLote);
            AV71TFAlbProLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbProLote_Sel", AV71TFAlbProLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV29TFAlbProUnd_Sels", AV29TFAlbProUnd_Sels);
   }

   private void e2329V2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "GX_BtnDelete", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(107) ;
      }
      sendrow_1072( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_107_Refreshing )
      {
         httpContext.doAjaxLoad(107, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0)) );
   }

   public void e2429V2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV64GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      AV64GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
      cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
   }

   public void e1629V2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
   }

   public void e1729V2( )
   {
      /* 'Dohashcomunicarat' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV7ALbProIDAT, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + AV7ALbProIDAT ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( AV46AlbProStAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.stocksquimicos.preparoxmldocumentoproveedorat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProDate)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV66albprosal)),GXutil.URLEncode(GXutil.rtrim(AV56Cadena)),GXutil.URLEncode(GXutil.rtrim(AV60Hash))}, new String[] {"EmprCod","AlbProID","AlbProSys","AlbProDate","AlbProSal","Cadena","Hash"}) , new Object[] {});
            httpContext.setWebReturnParms(new Object[] {});
            httpContext.setWebReturnParmsMetadata(new Object[] {});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void e1829V2( )
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

   public void e1229V2( )
   {
      /* Combo_prdnum_Onoptionclicked Routine */
      returnInSub = false ;
      AV37PrdNum = Combo_prdnum_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
      if ( ( AV50Lalpro == 0 ) && ! (GXutil.strcmp("", AV37PrdNum)==0) )
      {
         new app.stocksquimicos.get_datosproduc(remoteHandle, context).execute( AV5Emprcod, AV37PrdNum, AV53prdnom, AV67AlbProLote) ;
         GXt_char1 = AV53prdnom ;
         GXv_char4[0] = AV5Emprcod ;
         GXv_char3[0] = AV37PrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         documentotransporteproveedor_7_impl.this.AV5Emprcod = GXv_char4[0] ;
         documentotransporteproveedor_7_impl.this.AV37PrdNum = GXv_char3[0] ;
         documentotransporteproveedor_7_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
         AV53prdnom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53prdnom", AV53prdnom);
         AV38AlbProDsc = AV53prdnom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlbProDsc", AV38AlbProDsc);
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV46AlbProStAT == 3 ) || ( GXutil.strcmp(AV7ALbProIDAT, " ") != 0 ) )
      {
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada a AT", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV91Emprcod_selected = A396EmprCod ;
         AV92Albproid_selected = A13418AlbProID ;
         AV93Albprolinea_selected = A13442AlbProLine ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.stocksquimicos.documentotransporteproveedor_del(remoteHandle, context).execute( AV5Emprcod, AV6AlbProID, A13442AlbProLine) ;
      if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
      {
         GXv_char4[0] = AV5Emprcod ;
         GXv_char3[0] = "DLT" ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int12[0] = AV6AlbProID ;
         GXv_date13[0] = AV9AlbProDate ;
         GXv_char14[0] = "P" ;
         GXv_int10[0] = A13442AlbProLine ;
         GXv_int15[0] = AV55AlbProPrvID ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char18[0] = AV67AlbProLote ;
         GXv_char19[0] = AV45UsurCod ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int12, GXv_date13, GXv_char14, GXv_int10, GXv_int15, GXv_decimal16, GXv_decimal17, GXv_char18, GXv_char19) ;
         documentotransporteproveedor_7_impl.this.AV5Emprcod = GXv_char4[0] ;
         documentotransporteproveedor_7_impl.this.A719PrdNum = GXv_char2[0] ;
         documentotransporteproveedor_7_impl.this.AV6AlbProID = GXv_int12[0] ;
         documentotransporteproveedor_7_impl.this.AV9AlbProDate = GXv_date13[0] ;
         documentotransporteproveedor_7_impl.this.A13442AlbProLine = GXv_int10[0] ;
         documentotransporteproveedor_7_impl.this.AV55AlbProPrvID = GXv_int15[0] ;
         documentotransporteproveedor_7_impl.this.AV67AlbProLote = GXv_char18[0] ;
         documentotransporteproveedor_7_impl.this.AV45UsurCod = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProDate", localUtil.format(AV9AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55AlbProPrvID), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67AlbProLote", AV67AlbProLote);
         httpContext.ajax_rsp_assign_attri("", false, "AV45UsurCod", AV45UsurCod);
      }
      AV65Inc_obs = httpContext.getMessage( "DLT", "") + httpContext.getMessage( ",Linea ", "") + GXutil.trim( GXutil.str( A13442AlbProLine, 4, 0)) + httpContext.getMessage( " Producto ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( AV38AlbProDsc) + " " + GXutil.trim( GXutil.str( AV39AlbProCnt, 9, 2)) ;
      new app.pctrinc(remoteHandle, context).execute( AV5Emprcod, AV75Pgmname, AV45UsurCod, AV43Station, AV65Inc_obs, AV6AlbProID, (byte)(0), " ") ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV19Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLINEA") == 0 )
         {
            AV20TFAlbProLinea = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAlbProLinea), 4, 0));
            AV21TFAlbProLinea_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAlbProLinea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFAlbProLinea_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV22TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPrdNum", AV22TFPrdNum);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV23TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPrdNum_Sel", AV23TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC") == 0 )
         {
            AV24TFAlbProDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAlbProDsc", AV24TFAlbProDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC_SEL") == 0 )
         {
            AV25TFAlbProDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAlbProDsc_Sel", AV25TFAlbProDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCNT") == 0 )
         {
            AV26TFAlbProCnt = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbProCnt", GXutil.ltrimstr( AV26TFAlbProCnt, 9, 2));
            AV27TFAlbProCnt_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProCnt_To", GXutil.ltrimstr( AV27TFAlbProCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROUND_SEL") == 0 )
         {
            AV28TFAlbProUnd_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProUnd_SelsJson", AV28TFAlbProUnd_SelsJson);
            AV29TFAlbProUnd_Sels.fromJSonString(AV28TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCAJAS") == 0 )
         {
            AV30TFAlbProCajas = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAlbProCajas), 4, 0));
            AV31TFAlbProCajas_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProCajas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFAlbProCajas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLOTE") == 0 )
         {
            AV70TFAlbProLote = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbProLote", AV70TFAlbProLote);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLOTE_SEL") == 0 )
         {
            AV71TFAlbProLote_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbProLote_Sel", AV71TFAlbProLote_Sel);
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char19[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFPrdNum_Sel)==0), AV23TFPrdNum_Sel, GXv_char19) ;
      documentotransporteproveedor_7_impl.this.GXt_char1 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char18[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFAlbProDsc_Sel)==0), AV25TFAlbProDsc_Sel, GXv_char18) ;
      documentotransporteproveedor_7_impl.this.GXt_char20 = GXv_char18[0] ;
      GXt_char21 = "" ;
      GXv_char14[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV29TFAlbProUnd_Sels.size()==0), AV28TFAlbProUnd_SelsJson, GXv_char14) ;
      documentotransporteproveedor_7_impl.this.GXt_char21 = GXv_char14[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFAlbProLote_Sel)==0), AV71TFAlbProLote_Sel, GXv_char4) ;
      documentotransporteproveedor_7_impl.this.GXt_char22 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char20+"||"+GXt_char21+"||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char19[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFPrdNum)==0), AV22TFPrdNum, GXv_char19) ;
      documentotransporteproveedor_7_impl.this.GXt_char22 = GXv_char19[0] ;
      GXt_char21 = "" ;
      GXv_char18[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFAlbProDsc)==0), AV24TFAlbProDsc, GXv_char18) ;
      documentotransporteproveedor_7_impl.this.GXt_char21 = GXv_char18[0] ;
      GXt_char20 = "" ;
      GXv_char14[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFAlbProLote)==0), AV70TFAlbProLote, GXv_char14) ;
      documentotransporteproveedor_7_impl.this.GXt_char20 = GXv_char14[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV20TFAlbProLinea) ? "" : GXutil.str( AV20TFAlbProLinea, 4, 0))+"|"+GXt_char22+"|"+GXt_char21+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFAlbProCnt)==0) ? "" : GXutil.str( AV26TFAlbProCnt, 9, 2))+"||"+((0==AV30TFAlbProCajas) ? "" : GXutil.str( AV30TFAlbProCajas, 4, 0))+"|"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV21TFAlbProLinea_To) ? "" : GXutil.str( AV21TFAlbProLinea_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFAlbProCnt_To)==0) ? "" : GXutil.str( AV27TFAlbProCnt_To, 9, 2))+"||"+((0==AV31TFAlbProCajas_To) ? "" : GXutil.str( AV31TFAlbProCajas_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV19Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROLINEA", "", !((0==AV20TFAlbProLinea)&&(0==AV21TFAlbProLinea_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFAlbProLinea, 4, 0)), GXutil.trim( GXutil.str( AV21TFAlbProLinea_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFPRDNUM", "", !(GXutil.strcmp("", AV22TFPrdNum)==0), (short)(0), AV22TFPrdNum, "", !(GXutil.strcmp("", AV23TFPrdNum_Sel)==0), AV23TFPrdNum_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPRODSC", "", !(GXutil.strcmp("", AV24TFAlbProDsc)==0), (short)(0), AV24TFAlbProDsc, "", !(GXutil.strcmp("", AV25TFAlbProDsc_Sel)==0), AV25TFAlbProDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROCNT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFAlbProCnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFAlbProCnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV26TFAlbProCnt, 9, 2)), GXutil.trim( GXutil.str( AV27TFAlbProCnt_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROUND_SEL", "", !(AV29TFAlbProUnd_Sels.size()==0), (short)(0), AV29TFAlbProUnd_Sels.toJSonString(false), "") ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROCAJAS", "", !((0==AV30TFAlbProCajas)&&(0==AV31TFAlbProCajas_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFAlbProCajas, 4, 0)), GXutil.trim( GXutil.str( AV31TFAlbProCajas_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROLOTE", "", !(GXutil.strcmp("", AV70TFAlbProLote)==0), (short)(0), AV70TFAlbProLote, "", !(GXutil.strcmp("", AV71TFAlbProLote_Sel)==0), AV71TFAlbProLote_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState23[0] ;
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.DocumentoTransporteProveedor_2" );
      AV19Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      AV51PrdNum_Data.clear();
      /* Using cursor H029V4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV55AlbProPrvID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = H029V4_A795PrvNum[0] ;
         A396EmprCod = H029V4_A396EmprCod[0] ;
         A856ValCod = H029V4_A856ValCod[0] ;
         A13747PrdCDsc = H029V4_A13747PrdCDsc[0] ;
         A719PrdNum = H029V4_A719PrdNum[0] ;
         A718PrdNom = H029V4_A718PrdNom[0] ;
         AV52Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV52Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV52Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV51PrdNum_Data.add(AV52Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV51PrdNum_Data.sort("Title");
      Combo_prdnum_Selectedvalue_set = AV37PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void e1929V2( )
   {
      /* Albprolinea_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char19[0] = AV37PrdNum ;
      GXv_char18[0] = AV38AlbProDsc ;
      GXv_decimal17[0] = AV39AlbProCnt ;
      GXv_char14[0] = AV40AlbProUnd ;
      GXv_int10[0] = AV41AlbProCajas ;
      GXv_char4[0] = AV42AlbProObsLin ;
      GXv_decimal16[0] = AV47AlbProCntold ;
      GXv_char3[0] = AV48AlbProDscold ;
      GXv_char2[0] = AV49prdnumold ;
      GXv_char24[0] = AV67AlbProLote ;
      GXv_int25[0] = AV50Lalpro ;
      new app.stocksquimicos.documentotransporteproveedor_obtengodatos(remoteHandle, context).execute( AV5Emprcod, AV6AlbProID, AV36AlbProLinea, GXv_char19, GXv_char18, GXv_decimal17, GXv_char14, GXv_int10, GXv_char4, GXv_decimal16, GXv_char3, GXv_char2, GXv_char24, GXv_int25) ;
      documentotransporteproveedor_7_impl.this.AV37PrdNum = GXv_char19[0] ;
      documentotransporteproveedor_7_impl.this.AV38AlbProDsc = GXv_char18[0] ;
      documentotransporteproveedor_7_impl.this.AV39AlbProCnt = GXv_decimal17[0] ;
      documentotransporteproveedor_7_impl.this.AV40AlbProUnd = GXv_char14[0] ;
      documentotransporteproveedor_7_impl.this.AV41AlbProCajas = GXv_int10[0] ;
      documentotransporteproveedor_7_impl.this.AV42AlbProObsLin = GXv_char4[0] ;
      documentotransporteproveedor_7_impl.this.AV47AlbProCntold = GXv_decimal16[0] ;
      documentotransporteproveedor_7_impl.this.AV48AlbProDscold = GXv_char3[0] ;
      documentotransporteproveedor_7_impl.this.AV49prdnumold = GXv_char2[0] ;
      documentotransporteproveedor_7_impl.this.AV67AlbProLote = GXv_char24[0] ;
      documentotransporteproveedor_7_impl.this.AV50Lalpro = GXv_int25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV38AlbProDsc", AV38AlbProDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCajas), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProObsLin", AV42AlbProObsLin);
      httpContext.ajax_rsp_assign_attri("", false, "AV47AlbProCntold", GXutil.ltrimstr( AV47AlbProCntold, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV49prdnumold", AV49prdnumold);
      httpContext.ajax_rsp_assign_attri("", false, "AV67AlbProLote", AV67AlbProLote);
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lalpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Lalpro), 4, 0));
      Combo_prdnum_Selectedvalue_set = AV37PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      /*  Sending Event outputs  */
      cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e2029V2 ();
      if (returnInSub) return;
   }

   public void e2029V2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV46AlbProStAT == 3 ) || ( GXutil.strcmp(AV7ALbProIDAT, " ") != 0 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavAlbprolinea_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV36AlbProLinea) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Linea no valida", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavAlbprolinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV40AlbProUnd)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Falta Unidad", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = cmbavAlbpround.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39AlbProCnt)==0) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Falta Cantidad", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = cmbavAlbpround.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXv_char24[0] = AV5Emprcod ;
                  GXv_char19[0] = AV37PrdNum ;
                  GXv_decimal17[0] = AV39AlbProCnt ;
                  GXv_decimal16[0] = AV47AlbProCntold ;
                  GXv_char18[0] = AV62Msg_errcant ;
                  new app.pexctrlproducto(remoteHandle, context).execute( GXv_char24, GXv_char19, GXv_decimal17, GXv_decimal16, GXv_char18) ;
                  documentotransporteproveedor_7_impl.this.AV5Emprcod = GXv_char24[0] ;
                  documentotransporteproveedor_7_impl.this.AV37PrdNum = GXv_char19[0] ;
                  documentotransporteproveedor_7_impl.this.AV39AlbProCnt = GXv_decimal17[0] ;
                  documentotransporteproveedor_7_impl.this.AV47AlbProCntold = GXv_decimal16[0] ;
                  documentotransporteproveedor_7_impl.this.AV62Msg_errcant = GXv_char18[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
                  httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV47AlbProCntold", GXutil.ltrimstr( AV47AlbProCntold, 9, 2));
                  httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_errcant", AV62Msg_errcant);
                  if ( ( GXutil.strcmp(AV62Msg_errcant, " ") != 0 ) && ( AV39AlbProCnt.doubleValue() > 0 ) )
                  {
                     lblTbmessage_Caption = AV62Msg_errcant ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavAlbprocnt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV37PrdNum, AV49prdnumold) != 0 ) && ! (GXutil.strcmp("", AV49prdnumold)==0) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "NO se puede modificar el Producto", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavPrdnum_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( (GXutil.strcmp("", AV38AlbProDsc)==0) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "NO hay Descripcion", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavAlbprodsc_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           AV58ok = "S" ;
                           if ( ( AV69Moda21 == 1 ) && ( GXutil.strcmp(AV67AlbProLote, " ") != 0 ) )
                           {
                              GXv_char24[0] = AV58ok ;
                              new app.plotectrl(remoteHandle, context).execute( AV5Emprcod, AV37PrdNum, AV67AlbProLote, GXv_char24) ;
                              documentotransporteproveedor_7_impl.this.AV58ok = GXv_char24[0] ;
                           }
                           if ( ( AV69Moda21 == 1 ) && ( GXutil.strcmp(AV58ok, "N") == 0 ) )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Nao Existe LOTE ¡¡¡", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              GX_FocusControl = edtavAlbprolote_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              new app.stocksquimicos.documentotransporteproveedor_ins_udp(remoteHandle, context).execute( AV5Emprcod, AV6AlbProID, AV36AlbProLinea, AV37PrdNum, AV38AlbProDsc, AV39AlbProCnt, AV40AlbProUnd, AV41AlbProCajas, AV42AlbProObsLin, AV67AlbProLote) ;
                              Gx_mode = ((AV50Lalpro==0) ? "INS" : "UPD") ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                              if ( ( GXutil.strcmp(AV37PrdNum, " ") != 0 ) && ( AV63DevCant == 1 ) )
                              {
                                 GXv_char24[0] = AV5Emprcod ;
                                 GXv_char19[0] = Gx_mode ;
                                 GXv_char18[0] = AV37PrdNum ;
                                 GXv_int15[0] = AV6AlbProID ;
                                 GXv_date13[0] = AV9AlbProDate ;
                                 GXv_char14[0] = "P" ;
                                 GXv_int25[0] = AV36AlbProLinea ;
                                 GXv_int12[0] = AV55AlbProPrvID ;
                                 GXv_decimal17[0] = AV39AlbProCnt ;
                                 GXv_decimal16[0] = AV47AlbProCntold ;
                                 GXv_char4[0] = AV67AlbProLote ;
                                 GXv_char3[0] = AV45UsurCod ;
                                 new app.pdevcalpro(remoteHandle, context).execute( GXv_char24, GXv_char19, GXv_char18, GXv_int15, GXv_date13, GXv_char14, GXv_int25, GXv_int12, GXv_decimal17, GXv_decimal16, GXv_char4, GXv_char3) ;
                                 documentotransporteproveedor_7_impl.this.AV5Emprcod = GXv_char24[0] ;
                                 documentotransporteproveedor_7_impl.this.Gx_mode = GXv_char19[0] ;
                                 documentotransporteproveedor_7_impl.this.AV37PrdNum = GXv_char18[0] ;
                                 documentotransporteproveedor_7_impl.this.AV6AlbProID = GXv_int15[0] ;
                                 documentotransporteproveedor_7_impl.this.AV9AlbProDate = GXv_date13[0] ;
                                 documentotransporteproveedor_7_impl.this.AV36AlbProLinea = GXv_int25[0] ;
                                 documentotransporteproveedor_7_impl.this.AV55AlbProPrvID = GXv_int12[0] ;
                                 documentotransporteproveedor_7_impl.this.AV39AlbProCnt = GXv_decimal17[0] ;
                                 documentotransporteproveedor_7_impl.this.AV47AlbProCntold = GXv_decimal16[0] ;
                                 documentotransporteproveedor_7_impl.this.AV67AlbProLote = GXv_char4[0] ;
                                 documentotransporteproveedor_7_impl.this.AV45UsurCod = GXv_char3[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProID), 8, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProDate", localUtil.format(AV9AlbProDate, "99/99/99"));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProLinea), 4, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55AlbProPrvID), 6, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV47AlbProCntold", GXutil.ltrimstr( AV47AlbProCntold, 9, 2));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV67AlbProLote", AV67AlbProLote);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV45UsurCod", AV45UsurCod);
                              }
                              AV65Inc_obs = Gx_mode + httpContext.getMessage( ",Linea ", "") + GXutil.trim( GXutil.str( AV36AlbProLinea, 4, 0)) + " " + GXutil.trim( AV38AlbProDsc) + httpContext.getMessage( " Cant old/new", "") + GXutil.trim( GXutil.str( AV47AlbProCntold, 9, 2)) + "/" + GXutil.trim( GXutil.str( AV39AlbProCnt, 9, 2)) ;
                              new app.pctrinc(remoteHandle, context).execute( AV5Emprcod, AV75Pgmname, AV45UsurCod, AV43Station, AV65Inc_obs, AV6AlbProID, (byte)(0), " ") ;
                              AV36AlbProLinea = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProLinea), 4, 0));
                              AV37PrdNum = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV37PrdNum", AV37PrdNum);
                              AV38AlbProDsc = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV38AlbProDsc", AV38AlbProDsc);
                              AV39AlbProCnt = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProCnt", GXutil.ltrimstr( AV39AlbProCnt, 9, 2));
                              AV40AlbProUnd = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
                              AV41AlbProCajas = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV41AlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbProCajas), 4, 0));
                              AV42AlbProObsLin = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProObsLin", AV42AlbProObsLin);
                              AV47AlbProCntold = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV47AlbProCntold", GXutil.ltrimstr( AV47AlbProCntold, 9, 2));
                              AV48AlbProDscold = "" ;
                              AV49prdnumold = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV49prdnumold", AV49prdnumold);
                              AV50Lalpro = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV50Lalpro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Lalpro), 4, 0));
                              AV67AlbProLote = "" ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV67AlbProLote", AV67AlbProLote);
                              Combo_prdnum_Selectedvalue_set = AV37PrdNum ;
                              ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                              httpContext.doAjaxRefresh();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
      cmbavAlbpround.setValue( GXutil.rtrim( AV40AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpround.getInternalname(), "Values", cmbavAlbpround.ToJavascriptSource(), true);
   }

   public void wb_table2_133_29V2( boolean wbgen )
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
         wb_table2_133_29V2e( true) ;
      }
      else
      {
         wb_table2_133_29V2e( false) ;
      }
   }

   public void wb_table1_81_29V2( boolean wbgen )
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
         wb_table1_81_29V2e( true) ;
      }
      else
      {
         wb_table1_81_29V2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      AV6AlbProID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProID), 8, 0));
      AV55AlbProPrvID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55AlbProPrvID), 6, 0));
      AV46AlbProStAT = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46AlbProStAT", GXutil.str( AV46AlbProStAT, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSTAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46AlbProStAT), "9")));
      AV7ALbProIDAT = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ALbProIDAT", AV7ALbProIDAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7ALbProIDAT, ""))));
      AV8AlbProSys = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProSys", localUtil.ttoc( AV8AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROSYS", getSecureSignedToken( "", localUtil.format( AV8AlbProSys, "99/99/99 99:99")));
      AV9AlbProDate = (java.util.Date)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProDate", localUtil.format(AV9AlbProDate, "99/99/99"));
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
      pa29V2( ) ;
      ws29V2( ) ;
      we29V2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151573", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/documentotransporteproveedor_7.js", "?202682116151574", false, true);
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

   public void subsflControlProps_1072( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_107_idx );
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_107_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_107_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_107_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_107_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_107_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_107_idx ;
      edtAlbProLote_Internalname = "ALBPROLOTE_"+sGXsfl_107_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_107_idx ;
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_107_idx ;
   }

   public void subsflControlProps_fel_1072( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_107_fel_idx );
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_107_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_107_fel_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_107_fel_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_107_fel_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_107_fel_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_107_fel_idx ;
      edtAlbProLote_Internalname = "ALBPROLOTE_"+sGXsfl_107_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_107_fel_idx ;
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_107_fel_idx ;
   }

   public void sendrow_1072( )
   {
      subsflControlProps_1072( ) ;
      wb29V0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_107_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_107_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_107_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_107_idx+"',107)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_107_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV64GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_107_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_107_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProLine_Internalname,GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProLine_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDsc_Internalname,GXutil.rtrim( A13448AlbProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13443AlbProCnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProUnd.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROUND_" + sGXsfl_107_idx ;
            cmbAlbProUnd.setName( GXCCtl );
            cmbAlbProUnd.setWebtags( "" );
            cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
            cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
            cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
            cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
            cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
            if ( cmbAlbProUnd.getItemCount() > 0 )
            {
               A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
               n13444AlbProUnd = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProUnd,cmbAlbProUnd.getInternalname(),GXutil.rtrim( A13444AlbProUnd),Integer.valueOf(1),cmbAlbProUnd.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), !bGXsfl_107_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCaja_Internalname,GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCaja_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProLote_Internalname,GXutil.rtrim( A14401AlbProLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProID_Internalname,GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29V2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      /* End function sendrow_1072 */
   }

   public void startgridcontrol107( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"107\">") ;
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
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Embalaje", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13448AlbProDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13444AlbProUnd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14401AlbProLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
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
      edtavAlbproid_Internalname = "vALBPROID" ;
      edtavAlbproprvid_Internalname = "vALBPROPRVID" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavAlbprolinea_Internalname = "vALBPROLINEA" ;
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtavAlbprodsc_Internalname = "vALBPRODSC" ;
      edtavAlbprocnt_Internalname = "vALBPROCNT" ;
      cmbavAlbpround.setInternalname( "vALBPROUND" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavAlbproobslin_Internalname = "vALBPROOBSLIN" ;
      edtavAlbprocajas_Internalname = "vALBPROCAJAS" ;
      edtavAlbprolote_Internalname = "vALBPROLOTE" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtavLalpro_Internalname = "vLALPRO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashcomunicarat_Internalname = "BTNHASHCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtAlbProLine_Internalname = "ALBPROLINE" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtAlbProDsc_Internalname = "ALBPRODSC" ;
      edtAlbProCnt_Internalname = "ALBPROCNT" ;
      cmbAlbProUnd.setInternalname( "ALBPROUND" );
      edtAlbProCaja_Internalname = "ALBPROCAJA" ;
      edtAlbProLote_Internalname = "ALBPROLOTE" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProID_Internalname = "ALBPROID" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtAlbProID_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtAlbProLote_Jsonclick = "" ;
      edtAlbProCaja_Jsonclick = "" ;
      cmbAlbProUnd.setJsonclick( "" );
      edtAlbProCnt_Jsonclick = "" ;
      edtAlbProDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtAlbProLine_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnhashcomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      edtavLalpro_Jsonclick = "" ;
      edtavLalpro_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavAlbprolote_Jsonclick = "" ;
      edtavAlbprolote_Enabled = 1 ;
      edtavAlbprocajas_Jsonclick = "" ;
      edtavAlbprocajas_Enabled = 1 ;
      edtavAlbproobslin_Jsonclick = "" ;
      edtavAlbproobslin_Enabled = 1 ;
      cmbavAlbpround.setJsonclick( "" );
      cmbavAlbpround.setEnabled( 1 );
      edtavAlbprocnt_Jsonclick = "" ;
      edtavAlbprocnt_Enabled = 1 ;
      edtavAlbprodsc_Jsonclick = "" ;
      edtavAlbprodsc_Enabled = 1 ;
      Combo_prdnum_Caption = "" ;
      edtavAlbprolinea_Jsonclick = "" ;
      edtavAlbprolinea_Enabled = 1 ;
      edtavAlbproprvid_Jsonclick = "" ;
      edtavAlbproprvid_Enabled = 0 ;
      edtavAlbproid_Jsonclick = "" ;
      edtavAlbproid_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "StocksQuimicos.DocumentoTransporteProveedor_7GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||kg:kilos,lt:litros,mt:metros,und:unidades,:n/a||" ;
      Ddo_grid_Allowmultipleselection = "||||T||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T||T" ;
      Ddo_grid_Filterisrange = "T|||T||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric||Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "1:AlbProLinea|2:PrdNum|3:AlbProDsc|4:AlbProCnt|5:AlbProUnd|6:AlbProCajas|7:AlbProLote" ;
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
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbpround.setName( "vALBPROUND" );
      cmbavAlbpround.setWebtags( "" );
      cmbavAlbpround.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbavAlbpround.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbavAlbpround.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbavAlbpround.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbavAlbpround.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbavAlbpround.getItemCount() > 0 )
      {
         AV40AlbProUnd = cmbavAlbpround.getValidValue(AV40AlbProUnd) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProUnd", AV40AlbProUnd);
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_107_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV64GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV64GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridActionGroup1), 4, 0));
      }
      GXCCtl = "ALBPROUND_" + sGXsfl_107_idx ;
      cmbAlbProUnd.setName( GXCCtl );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
         n13444AlbProUnd = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1329V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1429V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1529V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV28TFAlbProUnd_SelsJson',fld:'vTFALBPROUND_SELSJSON',pic:''},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2329V2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV64GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2429V2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV64GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV64GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1629V2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV9AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV55AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV38AlbProDsc',fld:'vALBPRODSC',pic:''},{av:'AV39AlbProCnt',fld:'vALBPROCNT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''},{av:'AV55AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9'},{av:'AV9AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOHASHCOMUNICARAT'","{handler:'e1729V2',iparms:[{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV9AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true}]");
      setEventMetadata("'DOHASHCOMUNICARAT'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1829V2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED","{handler:'e1229V2',iparms:[{av:'Combo_prdnum_Selectedvalue_get',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_get'},{av:'AV50Lalpro',fld:'vLALPRO',pic:'ZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53prdnom',fld:'vPRDNOM',pic:''},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''}]");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED",",oparms:[{av:'AV37PrdNum',fld:'vPRDNUM',pic:''},{av:'AV53prdnom',fld:'vPRDNOM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38AlbProDsc',fld:'vALBPRODSC',pic:''}]}");
      setEventMetadata("VALBPROLINEA.CONTROLVALUECHANGED","{handler:'e1929V2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'}]");
      setEventMetadata("VALBPROLINEA.CONTROLVALUECHANGED",",oparms:[{av:'AV50Lalpro',fld:'vLALPRO',pic:'ZZZ9'},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''},{av:'AV49prdnumold',fld:'vPRDNUMOLD',pic:''},{av:'AV47AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV42AlbProObsLin',fld:'vALBPROOBSLIN',pic:''},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV39AlbProCnt',fld:'vALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV38AlbProDsc',fld:'vALBPRODSC',pic:''},{av:'AV37PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'}]}");
      setEventMetadata("ENTER","{handler:'e2029V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV20TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV21TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV22TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV23TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV24TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV25TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV26TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV27TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV30TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV31TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV70TFAlbProLote',fld:'vTFALBPROLOTE',pic:''},{av:'AV71TFAlbProLote_Sel',fld:'vTFALBPROLOTE_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbProStAT',fld:'vALBPROSTAT',pic:'9',hsh:true},{av:'AV7ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV8AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV66albprosal',fld:'vALBPROSAL',pic:'99/99/99 99:99',hsh:true},{av:'AV56Cadena',fld:'vCADENA',pic:'',hsh:true},{av:'AV60Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV69Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV63DevCant',fld:'vDEVCANT',pic:'ZZZ9',hsh:true},{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV39AlbProCnt',fld:'vALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV37PrdNum',fld:'vPRDNUM',pic:''},{av:'AV47AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV62Msg_errcant',fld:'vMSG_ERRCANT',pic:''},{av:'AV49prdnumold',fld:'vPRDNUMOLD',pic:''},{av:'AV38AlbProDsc',fld:'vALBPRODSC',pic:''},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'AV42AlbProObsLin',fld:'vALBPROOBSLIN',pic:''},{av:'AV50Lalpro',fld:'vLALPRO',pic:'ZZZ9'},{av:'AV9AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV55AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV62Msg_errcant',fld:'vMSG_ERRCANT',pic:''},{av:'AV47AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV39AlbProCnt',fld:'vALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV37PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''},{av:'AV55AlbProPrvID',fld:'vALBPROPRVID',pic:'ZZZZZ9'},{av:'AV36AlbProLinea',fld:'vALBPROLINEA',pic:'ZZZ9'},{av:'AV9AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV6AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV38AlbProDsc',fld:'vALBPRODSC',pic:''},{av:'cmbavAlbpround'},{av:'AV40AlbProUnd',fld:'vALBPROUND',pic:''},{av:'AV41AlbProCajas',fld:'vALBPROCAJAS',pic:'ZZZ9'},{av:'AV42AlbProObsLin',fld:'vALBPROOBSLIN',pic:''},{av:'AV49prdnumold',fld:'vPRDNUMOLD',pic:''},{av:'AV50Lalpro',fld:'vLALPRO',pic:'ZZZ9'},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e1129V1',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37PrdNum',fld:'vPRDNUM',pic:''},{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV67AlbProLote',fld:'vALBPROLOTE',pic:''}]}");
      setEventMetadata("VALIDV_ALBPROID","{handler:'validv_Albproid',iparms:[]");
      setEventMetadata("VALIDV_ALBPROID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albproid',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV7ALbProIDAT = "" ;
      wcpOAV8AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV9AlbProDate = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5Emprcod = "" ;
      AV7ALbProIDAT = "" ;
      AV8AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV9AlbProDate = GXutil.nullDate() ;
      AV22TFPrdNum = "" ;
      AV23TFPrdNum_Sel = "" ;
      AV24TFAlbProDsc = "" ;
      AV25TFAlbProDsc_Sel = "" ;
      AV26TFAlbProCnt = DecimalUtil.ZERO ;
      AV27TFAlbProCnt_To = DecimalUtil.ZERO ;
      AV29TFAlbProUnd_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70TFAlbProLote = "" ;
      AV71TFAlbProLote_Sel = "" ;
      AV75Pgmname = "" ;
      AV43Station = "" ;
      AV66albprosal = GXutil.resetTime( GXutil.nullDate() );
      AV56Cadena = "" ;
      AV60Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV32DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV51PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV45UsurCod = "" ;
      AV53prdnom = "" ;
      AV47AlbProCntold = DecimalUtil.ZERO ;
      AV62Msg_errcant = "" ;
      AV49prdnumold = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
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
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      AV38AlbProDsc = "" ;
      AV39AlbProCnt = DecimalUtil.ZERO ;
      AV40AlbProUnd = "" ;
      AV42AlbProObsLin = "" ;
      AV67AlbProLote = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV72Prompt = "" ;
      AV76Prompt_GXI = "" ;
      sImgUrl = "" ;
      lblTbmessage_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashcomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV37PrdNum = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13444AlbProUnd = "" ;
      A14401AlbProLote = "" ;
      A396EmprCod = "" ;
      AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = "" ;
      lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = "" ;
      lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = "" ;
      AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel = "" ;
      AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum = "" ;
      AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel = "" ;
      AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc = "" ;
      AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt = DecimalUtil.ZERO ;
      AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to = DecimalUtil.ZERO ;
      AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel = "" ;
      AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote = "" ;
      H029V2_A13418AlbProID = new int[1] ;
      H029V2_A396EmprCod = new String[] {""} ;
      H029V2_A14401AlbProLote = new String[] {""} ;
      H029V2_n14401AlbProLote = new boolean[] {false} ;
      H029V2_A13449AlbProCaja = new short[1] ;
      H029V2_n13449AlbProCaja = new boolean[] {false} ;
      H029V2_A13444AlbProUnd = new String[] {""} ;
      H029V2_n13444AlbProUnd = new boolean[] {false} ;
      H029V2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029V2_n13443AlbProCnt = new boolean[] {false} ;
      H029V2_A13448AlbProDsc = new String[] {""} ;
      H029V2_n13448AlbProDsc = new boolean[] {false} ;
      H029V2_A719PrdNum = new String[] {""} ;
      H029V2_A13442AlbProLine = new short[1] ;
      H029V3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV44EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28TFAlbProUnd_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV91Emprcod_selected = "" ;
      AV65Inc_obs = "" ;
      AV19Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char22 = "" ;
      GXt_char21 = "" ;
      GXt_char20 = "" ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      H029V4_A795PrvNum = new int[1] ;
      H029V4_A396EmprCod = new String[] {""} ;
      H029V4_A856ValCod = new byte[1] ;
      H029V4_A13747PrdCDsc = new String[] {""} ;
      H029V4_A719PrdNum = new String[] {""} ;
      H029V4_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A718PrdNom = "" ;
      AV52Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_int10 = new short[1] ;
      AV48AlbProDscold = "" ;
      GXv_char2 = new String[1] ;
      AV58ok = "" ;
      Gx_mode = "" ;
      GXv_char24 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_char14 = new String[1] ;
      GXv_int25 = new short[1] ;
      GXv_int12 = new int[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_7__default(),
         new Object[] {
             new Object[] {
            H029V2_A13418AlbProID, H029V2_A396EmprCod, H029V2_A14401AlbProLote, H029V2_n14401AlbProLote, H029V2_A13449AlbProCaja, H029V2_n13449AlbProCaja, H029V2_A13444AlbProUnd, H029V2_n13444AlbProUnd, H029V2_A13443AlbProCnt, H029V2_n13443AlbProCnt,
            H029V2_A13448AlbProDsc, H029V2_n13448AlbProDsc, H029V2_A719PrdNum, H029V2_A13442AlbProLine
            }
            , new Object[] {
            H029V3_AGRID_nRecordCount
            }
            , new Object[] {
            H029V4_A795PrvNum, H029V4_A396EmprCod, H029V4_A856ValCod, H029V4_A13747PrdCDsc, H029V4_A719PrdNum, H029V4_A718PrdNom
            }
         }
      );
      AV75Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_7" ;
      /* GeneXus formulas. */
      AV75Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_7" ;
      Gx_err = (short)(0) ;
      edtavAlbproid_Enabled = 0 ;
      edtavAlbproprvid_Enabled = 0 ;
      edtavLalpro_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV46AlbProStAT ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV46AlbProStAT ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte A856ValCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV20TFAlbProLinea ;
   private short AV21TFAlbProLinea_To ;
   private short AV30TFAlbProCajas ;
   private short AV31TFAlbProCajas_To ;
   private short AV17OrderedBy ;
   private short AV69Moda21 ;
   private short AV63DevCant ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36AlbProLinea ;
   private short AV41AlbProCajas ;
   private short AV50Lalpro ;
   private short AV64GridActionGroup1 ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ;
   private short AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ;
   private short AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ;
   private short AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ;
   private short GXt_int9 ;
   private short AV93Albprolinea_selected ;
   private short GXv_int10[] ;
   private short GXv_int25[] ;
   private int wcpOAV6AlbProID ;
   private int wcpOAV55AlbProPrvID ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_107 ;
   private int AV6AlbProID ;
   private int AV55AlbProPrvID ;
   private int nGXsfl_107_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbproid_Enabled ;
   private int edtavAlbproprvid_Enabled ;
   private int edtavAlbprolinea_Enabled ;
   private int edtavAlbprodsc_Enabled ;
   private int edtavAlbprocnt_Enabled ;
   private int edtavAlbproobslin_Enabled ;
   private int edtavAlbprocajas_Enabled ;
   private int edtavAlbprolote_Enabled ;
   private int edtavLalpro_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashcomunicarat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Visible ;
   private int A13418AlbProID ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ;
   private int AV33PageToGo ;
   private int AV92Albproid_selected ;
   private int AV94GXV1 ;
   private int A795PrvNum ;
   private int GXv_int15[] ;
   private int GXv_int12[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV34GridCurrentPage ;
   private long AV35GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV26TFAlbProCnt ;
   private java.math.BigDecimal AV27TFAlbProCnt_To ;
   private java.math.BigDecimal AV47AlbProCntold ;
   private java.math.BigDecimal AV39AlbProCnt ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ;
   private java.math.BigDecimal AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV7ALbProIDAT ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5Emprcod ;
   private String AV7ALbProIDAT ;
   private String sGXsfl_107_idx="0001" ;
   private String AV22TFPrdNum ;
   private String AV23TFPrdNum_Sel ;
   private String AV24TFAlbProDsc ;
   private String AV25TFAlbProDsc_Sel ;
   private String AV70TFAlbProLote ;
   private String AV71TFAlbProLote_Sel ;
   private String AV75Pgmname ;
   private String AV43Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV45UsurCod ;
   private String AV53prdnom ;
   private String AV49prdnumold ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Selectedvalue_set ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavAlbproid_Internalname ;
   private String edtavAlbproid_Jsonclick ;
   private String edtavAlbproprvid_Internalname ;
   private String edtavAlbproprvid_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprolinea_Internalname ;
   private String TempTags ;
   private String edtavAlbprolinea_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String edtavAlbprodsc_Internalname ;
   private String AV38AlbProDsc ;
   private String edtavAlbprodsc_Jsonclick ;
   private String edtavAlbprocnt_Internalname ;
   private String edtavAlbprocnt_Jsonclick ;
   private String AV40AlbProUnd ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbproobslin_Internalname ;
   private String AV42AlbProObsLin ;
   private String edtavAlbproobslin_Jsonclick ;
   private String edtavAlbprocajas_Internalname ;
   private String edtavAlbprocajas_Jsonclick ;
   private String edtavAlbprolote_Internalname ;
   private String AV67AlbProLote ;
   private String edtavAlbprolote_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String ClassString ;
   private String imgavPrompt_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtavLalpro_Internalname ;
   private String edtavLalpro_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashcomunicarat_Internalname ;
   private String bttBtnhashcomunicarat_Jsonclick ;
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
   private String edtavPrdnum_Internalname ;
   private String AV37PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProLine_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A13448AlbProDsc ;
   private String edtAlbProDsc_Internalname ;
   private String edtAlbProCnt_Internalname ;
   private String A13444AlbProUnd ;
   private String edtAlbProCaja_Internalname ;
   private String A14401AlbProLote ;
   private String edtAlbProLote_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbProID_Internalname ;
   private String scmdbuf ;
   private String lV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ;
   private String lV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ;
   private String lV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ;
   private String AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ;
   private String AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ;
   private String AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ;
   private String AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ;
   private String AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ;
   private String AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ;
   private String hsh ;
   private String AV44EmprNom ;
   private String Gx_msg ;
   private String AV91Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char22 ;
   private String GXt_char21 ;
   private String GXt_char20 ;
   private String A718PrdNom ;
   private String AV48AlbProDscold ;
   private String GXv_char2[] ;
   private String AV58ok ;
   private String Gx_mode ;
   private String GXv_char24[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char14[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_107_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbProLine_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtAlbProDsc_Jsonclick ;
   private String edtAlbProCnt_Jsonclick ;
   private String edtAlbProCaja_Jsonclick ;
   private String edtAlbProLote_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProID_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8AlbProSys ;
   private java.util.Date AV8AlbProSys ;
   private java.util.Date AV66albprosal ;
   private java.util.Date wcpOAV9AlbProDate ;
   private java.util.Date AV9AlbProDate ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean AV72Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13448AlbProDsc ;
   private boolean n13443AlbProCnt ;
   private boolean n13444AlbProUnd ;
   private boolean n13449AlbProCaja ;
   private boolean n14401AlbProLote ;
   private boolean bGXsfl_107_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV28TFAlbProUnd_SelsJson ;
   private String AV56Cadena ;
   private String AV60Hash ;
   private String AV62Msg_errcant ;
   private String AV76Prompt_GXI ;
   private String AV65Inc_obs ;
   private String A13747PrdCDsc ;
   private String AV72Prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ;
   private HTMLChoice cmbavAlbpround ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbProUnd ;
   private IDataStoreProvider pr_default ;
   private int[] H029V2_A13418AlbProID ;
   private String[] H029V2_A396EmprCod ;
   private String[] H029V2_A14401AlbProLote ;
   private boolean[] H029V2_n14401AlbProLote ;
   private short[] H029V2_A13449AlbProCaja ;
   private boolean[] H029V2_n13449AlbProCaja ;
   private String[] H029V2_A13444AlbProUnd ;
   private boolean[] H029V2_n13444AlbProUnd ;
   private java.math.BigDecimal[] H029V2_A13443AlbProCnt ;
   private boolean[] H029V2_n13443AlbProCnt ;
   private String[] H029V2_A13448AlbProDsc ;
   private boolean[] H029V2_n13448AlbProDsc ;
   private String[] H029V2_A719PrdNum ;
   private short[] H029V2_A13442AlbProLine ;
   private long[] H029V3_AGRID_nRecordCount ;
   private int[] H029V4_A795PrvNum ;
   private String[] H029V4_A396EmprCod ;
   private byte[] H029V4_A856ValCod ;
   private String[] H029V4_A13747PrdCDsc ;
   private String[] H029V4_A719PrdNum ;
   private String[] H029V4_A718PrdNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV29TFAlbProUnd_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51PrdNum_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV32DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV52Combo_DataItem ;
}

final  class documentotransporteproveedor_7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                          short AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ,
                                          short AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                          String AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                          int AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ,
                                          short AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ,
                                          short AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ,
                                          String AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                          String AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A14401AlbProLote ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6AlbProID ,
                                          String A396EmprCod ,
                                          int A13418AlbProID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[19];
      Object[] GXv_Object27 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " AlbProID, EmprCod, AlbProLote, AlbProCaja, AlbProUnd, AlbProCnt, AlbProDsc, PrdNum, AlbProLine" ;
      sFromString = " FROM TXPLALPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProID = ?)");
      if ( ! (0==AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProLote = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( AV17OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, AlbProID, AlbProLine" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProLine" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProLine DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProDsc" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProCnt" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProCnt DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProUnd" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProUnd DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProCaja" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProCaja DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProLote" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, AlbProID, AlbProLine" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H029V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels ,
                                          short AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea ,
                                          short AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum ,
                                          String AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to ,
                                          int AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size ,
                                          short AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas ,
                                          short AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to ,
                                          String AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel ,
                                          String AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          String A14401AlbProLote ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6AlbProID ,
                                          String A396EmprCod ,
                                          int A13418AlbProID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[14];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProID = ?)");
      if ( ! (0==AV77Stocksquimicos_documentotransporteproveedor_7ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_documentotransporteproveedor_7ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_7ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_7ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_7ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_documentotransporteproveedor_7ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Stocksquimicos_documentotransporteproveedor_7ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_documentotransporteproveedor_7ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Stocksquimicos_documentotransporteproveedor_7ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV86Stocksquimicos_documentotransporteproveedor_7ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Stocksquimicos_documentotransporteproveedor_7ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_documentotransporteproveedor_7ds_12_tfalbprolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_documentotransporteproveedor_7ds_13_tfalbprolote_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProLote = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV17OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H029V2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
            case 1 :
                  return conditional_H029V3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029V4", "SELECT PrvNum, EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE (ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C') AND (PrvNum = ?) ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

