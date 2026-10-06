package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudodistribucion_wp_impl extends GXDataArea
{
   public almacentejidoencrudodistribucion_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoencrudodistribucion_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudodistribucion_wp_impl.class ));
   }

   public almacentejidoencrudodistribucion_wp_impl( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni = new HTMLChoice();
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
            AV29EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV31PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31PCliente), 6, 0));
               AV32UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32UCliente), 6, 0));
               AV33PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33PFecha", localUtil.format(AV33PFecha, "99/99/99"));
               AV34UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34UFecha", localUtil.format(AV34UFecha, "99/99/99"));
               AV35ALbRef_i = httpContext.GetPar( "ALbRef_i") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35ALbRef_i", AV35ALbRef_i);
               AV36AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRef_f", AV36AlbRef_f);
               AV37Albrenti = httpContext.GetPar( "Albrenti") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Albrenti", AV37Albrenti);
               AV38Albrentf = httpContext.GetPar( "Albrentf") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Albrentf", AV38Albrentf);
               AV39Tipentcodi = (short)(GXutil.lval( httpContext.GetPar( "Tipentcodi"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39Tipentcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Tipentcodi), 4, 0));
               AV40Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tipartcod1), 4, 0));
               AV41Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod2), 4, 0));
               AV42Estado_a = httpContext.GetPar( "Estado_a") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Estado_a", AV42Estado_a);
               AV43AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRecCod), 8, 0));
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV73Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV29EmprCod = httpContext.GetPar( "EmprCod") ;
      AV31PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
      AV32UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
      AV33PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
      AV34UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
      AV35ALbRef_i = httpContext.GetPar( "ALbRef_i") ;
      AV36AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
      AV37Albrenti = httpContext.GetPar( "Albrenti") ;
      AV38Albrentf = httpContext.GetPar( "Albrentf") ;
      AV39Tipentcodi = (short)(GXutil.lval( httpContext.GetPar( "Tipentcodi"))) ;
      AV40Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
      AV41Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
      AV42Estado_a = httpContext.GetPar( "Estado_a") ;
      AV43AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      AV44AlmacenTejidoencrudoDistribucion_SDTJson = httpContext.GetPar( "AlmacenTejidoencrudoDistribucion_SDTJson") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
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
      pa2EA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2EA2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacentejidoencrudodistribucion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV31PCliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32UCliente,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV33PFecha)),GXutil.URLEncode(GXutil.formatDateParm(AV34UFecha)),GXutil.URLEncode(GXutil.rtrim(AV35ALbRef_i)),GXutil.URLEncode(GXutil.rtrim(AV36AlbRef_f)),GXutil.URLEncode(GXutil.rtrim(AV37Albrenti)),GXutil.URLEncode(GXutil.rtrim(AV38Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV39Tipentcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Tipartcod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Tipartcod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV42Estado_a)),GXutil.URLEncode(GXutil.ltrimstr(AV43AlbRecCod,8,0))}, new String[] {"EmprCod","PCliente","UCliente","PFecha","UFecha","ALbRef_i","AlbRef_f","Albrenti","Albrentf","Tipentcodi","Tipartcod1","Tipartcod2","Estado_a","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", getSecureSignedToken( "", AV44AlmacenTejidoencrudoDistribucion_SDTJson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoencrudoDistribucion_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudodistribucion_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Almacentejidoencrudodistribucion_sdt", AV13AlmacenTejidoencrudoDistribucion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Almacentejidoencrudodistribucion_sdt", AV13AlmacenTejidoencrudoDistribucion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPCLIENTE", GXutil.ltrim( localUtil.ntoc( AV31PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUCLIENTE", GXutil.ltrim( localUtil.ntoc( AV32UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPFECHA", localUtil.dtoc( AV33PFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vUFECHA", localUtil.dtoc( AV34UFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREF_I", GXutil.rtrim( AV35ALbRef_i));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREF_F", GXutil.rtrim( AV36AlbRef_f));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRENTI", GXutil.rtrim( AV37Albrenti));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRENTF", GXutil.rtrim( AV38Albrentf));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPENTCODI", GXutil.ltrim( localUtil.ntoc( AV39Tipentcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV40Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD2", GXutil.ltrim( localUtil.ntoc( AV41Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vESTADO_A", GXutil.rtrim( AV42Estado_a));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV43AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV30ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", AV44AlmacenTejidoencrudoDistribucion_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", getSecureSignedToken( "", AV44AlmacenTejidoencrudoDistribucion_SDTJson));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALMACENTEJIDOENCRUDODISTRIBUCION_SDT", AV13AlmacenTejidoencrudoDistribucion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALMACENTEJIDOENCRUDODISTRIBUCION_SDT", AV13AlmacenTejidoencrudoDistribucion_SDT);
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2EA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2EA2( ) ;
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
      return formatLink("app.almacentejidoencrudodistribucion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV31PCliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32UCliente,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV33PFecha)),GXutil.URLEncode(GXutil.formatDateParm(AV34UFecha)),GXutil.URLEncode(GXutil.rtrim(AV35ALbRef_i)),GXutil.URLEncode(GXutil.rtrim(AV36AlbRef_f)),GXutil.URLEncode(GXutil.rtrim(AV37Albrenti)),GXutil.URLEncode(GXutil.rtrim(AV38Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV39Tipentcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40Tipartcod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Tipartcod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV42Estado_a)),GXutil.URLEncode(GXutil.ltrimstr(AV43AlbRecCod,8,0))}, new String[] {"EmprCod","PCliente","UCliente","PFecha","UFecha","ALbRef_i","AlbRef_f","Albrenti","Albrentf","Tipentcodi","Tipartcod1","Tipartcod2","Estado_a","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenTejidoencrudoDistribucion_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido en crudo (Distribucion)", "") ;
   }

   public void wb2EA0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112ea1_client"+"'", TempTags, "", 2, "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_2EA2( true) ;
      }
      else
      {
         wb_table1_25_2EA2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_2EA2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV51GXV1 = nGXsfl_43_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV73Pgmname), GXutil.rtrim( localUtil.format( AV73Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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
               AV51GXV1 = nGXsfl_43_idx ;
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

   public void start2EA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido en crudo (Distribucion)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2EA0( ) ;
   }

   public void ws2EA2( )
   {
      start2EA2( ) ;
      evt2EA2( ) ;
   }

   public void evt2EA2( )
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
                           e122EA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132EA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142EA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152EA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e162EA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e172EA2 ();
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
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV51GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13AlmacenTejidoencrudoDistribucion_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
                           {
                              AV13AlmacenTejidoencrudoDistribucion_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e182EA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e192EA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202EA2 ();
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

   public void we2EA2( )
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

   public void pa2EA2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV73Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV29EmprCod ,
                                 int AV31PCliente ,
                                 int AV32UCliente ,
                                 java.util.Date AV33PFecha ,
                                 java.util.Date AV34UFecha ,
                                 String AV35ALbRef_i ,
                                 String AV36AlbRef_f ,
                                 String AV37Albrenti ,
                                 String AV38Albrentf ,
                                 short AV39Tipentcodi ,
                                 short AV40Tipartcod1 ,
                                 short AV41Tipartcod2 ,
                                 String AV42Estado_a ,
                                 int AV43AlbRecCod ,
                                 String AV44AlmacenTejidoencrudoDistribucion_SDTJson )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192EA2 ();
      GRID_nCurrentRecord = 0 ;
      rf2EA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoencrudoDistribucion_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudodistribucion_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2EA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV73Pgmname = "AlmacenTejidoencrudoDistribucion_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2EA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e192EA2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         e202EA2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e202EA2 ();
         }
         wbEnd = (short)(43) ;
         wb2EA0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2EA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", AV44AlmacenTejidoencrudoDistribucion_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", getSecureSignedToken( "", AV44AlmacenTejidoencrudoDistribucion_SDTJson));
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
      return AV13AlmacenTejidoencrudoDistribucion_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV73Pgmname, AV12FilterFullText, AV29EmprCod, AV31PCliente, AV32UCliente, AV33PFecha, AV34UFecha, AV35ALbRef_i, AV36AlbRef_f, AV37Albrenti, AV38Albrentf, AV39Tipentcodi, AV40Tipartcod1, AV41Tipartcod2, AV42Estado_a, AV43AlbRecCod, AV44AlmacenTejidoencrudoDistribucion_SDTJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV73Pgmname = "AlmacenTejidoencrudoDistribucion_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2EA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182EA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Almacentejidoencrudodistribucion_sdt"), AV13AlmacenTejidoencrudoDistribucion_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALMACENTEJIDOENCRUDODISTRIBUCION_SDT"), AV13AlmacenTejidoencrudoDistribucion_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV43AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42Estado_a = httpContext.cgiGet( "vESTADO_A") ;
         AV41Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPARTCOD2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPARTCOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39Tipentcodi = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPENTCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38Albrentf = httpContext.cgiGet( "vALBRENTF") ;
         AV37Albrenti = httpContext.cgiGet( "vALBRENTI") ;
         AV36AlbRef_f = httpContext.cgiGet( "vALBREF_F") ;
         AV35ALbRef_i = httpContext.cgiGet( "vALBREF_I") ;
         AV34UFecha = localUtil.ctod( httpContext.cgiGet( "vUFECHA"), 0) ;
         AV33PFecha = localUtil.ctod( httpContext.cgiGet( "vPFECHA"), 0) ;
         AV32UCliente = (int)(localUtil.ctol( httpContext.cgiGet( "vUCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31PCliente = (int)(localUtil.ctol( httpContext.cgiGet( "vPCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30ImpCod = httpContext.cgiGet( "vIMPCOD") ;
         AV29EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_43_fel_idx = 0 ;
         while ( nGXsfl_43_fel_idx < nRC_GXsfl_43 )
         {
            nGXsfl_43_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_fel_idx+1) ;
            sGXsfl_43_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_432( ) ;
            AV51GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13AlmacenTejidoencrudoDistribucion_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
            {
               AV13AlmacenTejidoencrudoDistribucion_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)) );
            }
         }
         if ( nGXsfl_43_fel_idx == 0 )
         {
            nGXsfl_43_idx = 1 ;
            sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_432( ) ;
         }
         nGXsfl_43_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12FilterFullText", AV12FilterFullText);
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoencrudoDistribucion_WP");
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacentejidoencrudodistribucion_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182EA2 ();
      if (returnInSub) return;
   }

   public void e182EA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoencrudodistribucion_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV46EmprNom ;
      GXv_char4[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoencrudodistribucion_wp_impl.this.AV29EmprCod = GXv_char2[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV46EmprNom = GXv_char3[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV47UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Almacen Tejido en crudo (Distribucion)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV44AlmacenTejidoencrudoDistribucion_SDTJson ;
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV30ImpCod ;
      GXv_int7[0] = AV31PCliente ;
      GXv_int8[0] = AV32UCliente ;
      GXv_date9[0] = AV33PFecha ;
      GXv_date10[0] = AV34UFecha ;
      GXv_char2[0] = AV35ALbRef_i ;
      GXv_char11[0] = AV36AlbRef_f ;
      GXv_char12[0] = AV37Albrenti ;
      GXv_char13[0] = AV38Albrentf ;
      GXv_int14[0] = AV39Tipentcodi ;
      GXv_int15[0] = AV40Tipartcod1 ;
      GXv_int16[0] = AV41Tipartcod2 ;
      GXv_char17[0] = AV42Estado_a ;
      GXv_int18[0] = AV43AlbRecCod ;
      GXv_char19[0] = GXt_char1 ;
      new app.almacentejidoencrudodistribucion_prc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char2, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_int18, GXv_char19) ;
      almacentejidoencrudodistribucion_wp_impl.this.AV29EmprCod = GXv_char4[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV30ImpCod = GXv_char3[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV31PCliente = GXv_int7[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV32UCliente = GXv_int8[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV33PFecha = GXv_date9[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV34UFecha = GXv_date10[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV35ALbRef_i = GXv_char2[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV36AlbRef_f = GXv_char11[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV37Albrenti = GXv_char12[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV38Albrentf = GXv_char13[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV39Tipentcodi = GXv_int14[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV40Tipartcod1 = GXv_int15[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV41Tipartcod2 = GXv_int16[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV42Estado_a = GXv_char17[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV43AlbRecCod = GXv_int18[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.GXt_char1 = GXv_char19[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30ImpCod", AV30ImpCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV31PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31PCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV32UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32UCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV33PFecha", localUtil.format(AV33PFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV34UFecha", localUtil.format(AV34UFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV35ALbRef_i", AV35ALbRef_i);
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRef_f", AV36AlbRef_f);
      httpContext.ajax_rsp_assign_attri("", false, "AV37Albrenti", AV37Albrenti);
      httpContext.ajax_rsp_assign_attri("", false, "AV38Albrentf", AV38Albrentf);
      httpContext.ajax_rsp_assign_attri("", false, "AV39Tipentcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Tipentcodi), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tipartcod1), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Estado_a", AV42Estado_a);
      httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRecCod), 8, 0));
      AV44AlmacenTejidoencrudoDistribucion_SDTJson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44AlmacenTejidoencrudoDistribucion_SDTJson", AV44AlmacenTejidoencrudoDistribucion_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON", getSecureSignedToken( "", AV44AlmacenTejidoencrudoDistribucion_SDTJson));
      AV13AlmacenTejidoencrudoDistribucion_SDT.fromJSonString(AV44AlmacenTejidoencrudoDistribucion_SDTJson, null);
      gx_BV43 = true ;
   }

   public void e192EA2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext20[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext20) ;
      AV6WWPContext = GXv_SdtWWPContext20[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("AlmacenTejidoencrudoDistribucion_WPColumnsSelector"), "") != 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("AlmacenTejidoencrudoDistribucion_WPColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getInternalname(), "Visible", GXutil.ltrimstr( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e132EA2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e142EA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202EA2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV13AlmacenTejidoencrudoDistribucion_SDT.size() )
      {
         AV13AlmacenTejidoencrudoDistribucion_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_432( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, GridRow);
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void e152EA2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoDistribucion_WPColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122EA2( )
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
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoDistribucion_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV73Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoDistribucion_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char19[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AlmacenTejidoencrudoDistribucion_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char19) ;
         almacentejidoencrudodistribucion_wp_impl.this.GXt_char1 = GXv_char19[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e162EA2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV48websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoDistribucion_SDT", ""), AV44AlmacenTejidoencrudoDistribucion_SDTJson);
      GXv_char19[0] = AV14ExcelFilename ;
      GXv_char17[0] = AV15ErrorMessage ;
      new app.almacentejidoencrudodistribucion_wpexport(remoteHandle, context).execute( GXv_char19, GXv_char17) ;
      almacentejidoencrudodistribucion_wp_impl.this.AV14ExcelFilename = GXv_char19[0] ;
      almacentejidoencrudodistribucion_wp_impl.this.AV15ErrorMessage = GXv_char17[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e172EA2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV48websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoDistribucion_SDT", ""), AV44AlmacenTejidoencrudoDistribucion_SDTJson);
      callWebObject(formatLink("app.almacentejidoencrudodistribucion_wpexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albreccod", "", "N Recepcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albrfen", "", "Fecha Entrada", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albrent2", "", "Nº Albaran", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albruni", "", "Unidad", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albrunient", "", "Unds. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albrpieent", "", "Pzs. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Barnhdr", "", "N Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Barser", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Barcolnom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Barcolnum", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__bartipcol", "", "TC", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__Barpiekil", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__barpiemet", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__barpiepie", "", "Piezas", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albprocod", "", "Albaran", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__albprofch", "", "Fecha", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__BarAlbKgm", "", "Kilos Sal.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__BarAlbMtr", "", "Metros Sal.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, "AlmacenTejidoencrudoDistribucion_SDT__BarAlbPie", "", "Piezas Sal.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char19[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoDistribucion_WPColumnsSelector", GXv_char19) ;
      almacentejidoencrudodistribucion_wp_impl.this.GXt_char1 = GXv_char19[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector21[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector22[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector21, GXv_SdtWWPColumnsSelector22) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector21[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item24[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AlmacenTejidoencrudoDistribucion_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item24) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item24[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV73Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV73Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV73Pgmname+"GridState"), null, null);
      }
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
      AV74GXV23 = 1 ;
      while ( AV74GXV23 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV23));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV74GXV23 = (int)(AV74GXV23+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV73Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      if ( ! (GXutil.strcmp("", AV29EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV29EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31PCliente) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31PCliente, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV32UCliente) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32UCliente, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33PFecha)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PFECHA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV33PFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34UFecha)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UFECHA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34UFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV35ALbRef_i)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_I" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV35ALbRef_i );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36AlbRef_f)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_F" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36AlbRef_f );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37Albrenti)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37Albrenti );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38Albrentf)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38Albrentf );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV39Tipentcodi) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPENTCODI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV39Tipentcodi, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV40Tipartcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40Tipartcod1, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV41Tipartcod2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41Tipartcod2, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42Estado_a)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ESTADO_A" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42Estado_a );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV43AlbRecCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRECCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV43AlbRecCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_25_2EA2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_2EA2( true) ;
      }
      else
      {
         wb_table2_30_2EA2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_2EA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_2EA2e( true) ;
      }
      else
      {
         wb_table1_25_2EA2e( false) ;
      }
   }

   public void wb_table2_30_2EA2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AlmacenTejidoencrudoDistribucion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_2EA2e( true) ;
      }
      else
      {
         wb_table2_30_2EA2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV29EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      AV31PCliente = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31PCliente), 6, 0));
      AV32UCliente = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32UCliente), 6, 0));
      AV33PFecha = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33PFecha", localUtil.format(AV33PFecha, "99/99/99"));
      AV34UFecha = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34UFecha", localUtil.format(AV34UFecha, "99/99/99"));
      AV35ALbRef_i = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35ALbRef_i", AV35ALbRef_i);
      AV36AlbRef_f = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbRef_f", AV36AlbRef_f);
      AV37Albrenti = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Albrenti", AV37Albrenti);
      AV38Albrentf = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Albrentf", AV38Albrentf);
      AV39Tipentcodi = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Tipentcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Tipentcodi), 4, 0));
      AV40Tipartcod1 = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tipartcod1), 4, 0));
      AV41Tipartcod2 = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod2), 4, 0));
      AV42Estado_a = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Estado_a", AV42Estado_a);
      AV43AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43AlbRecCod), 8, 0));
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
      pa2EA2( ) ;
      ws2EA2( ) ;
      we2EA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116154512", true, true);
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
      httpContext.AddJavascriptSource("almacentejidoencrudodistribucion_wp.js", "?202682116154512", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2_"+sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setInternalname( "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI_"+sGXsfl_43_idx );
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2_"+sGXsfl_43_fel_idx ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setInternalname( "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI_"+sGXsfl_43_fel_idx );
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb2EA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname,localUtil.format(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen(), "99/99/99"),localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI_" + sGXsfl_43_idx ;
            cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setName( GXCCtl );
            cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setWebtags( "" );
            cmbavAlmacentejidoencrudodistribucion_sdt__albruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbavAlmacentejidoencrudodistribucion_sdt__albruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getItemCount() > 0 )
            {
               if ( ( AV51GXV1 > 0 ) && ( AV13AlmacenTejidoencrudoDistribucion_SDT.size() >= AV51GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni())==0) )
               {
                  ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getValidValue(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAlmacentejidoencrudodistribucion_sdt__albruni,cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getInternalname(),GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni()),Integer.valueOf(1),cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getVisible()),Integer.valueOf(cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setValue( GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getInternalname(), "Values", cmbavAlmacentejidoencrudodistribucion_sdt__albruni.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname,localUtil.format(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch(), "99/99/99"),localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible),Integer.valueOf(edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2EA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unds. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Sal.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD" ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2" ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setInternalname( "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI" );
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM" ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible = -1 ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setJsonclick( "" );
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setEnabled( 0 );
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setVisible( -1 );
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible = -1 ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setVisible( -1 );
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled = -1 ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setEnabled( -1 );
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled = -1 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:AlmacenTejidoencrudoDistribucion_SDT__Clicod|1:AlmacenTejidoencrudoDistribucion_SDT__CliNom|2:AlmacenTejidoencrudoDistribucion_SDT__albreccod|3:AlmacenTejidoencrudoDistribucion_SDT__albrfen|4:AlmacenTejidoencrudoDistribucion_SDT__albrent2|5:AlmacenTejidoencrudoDistribucion_SDT__albruni|6:AlmacenTejidoencrudoDistribucion_SDT__albrunient|7:AlmacenTejidoencrudoDistribucion_SDT__albrpieent|8:AlmacenTejidoencrudoDistribucion_SDT__Barnhdr|9:AlmacenTejidoencrudoDistribucion_SDT__Barser|10:AlmacenTejidoencrudoDistribucion_SDT__Barcolnom|11:AlmacenTejidoencrudoDistribucion_SDT__Barcolnum|12:AlmacenTejidoencrudoDistribucion_SDT__bartipcol|13:AlmacenTejidoencrudoDistribucion_SDT__Barpiekil|14:AlmacenTejidoencrudoDistribucion_SDT__barpiemet|15:AlmacenTejidoencrudoDistribucion_SDT__barpiepie|16:AlmacenTejidoencrudoDistribucion_SDT__albprocod|17:AlmacenTejidoencrudoDistribucion_SDT__albprofch|18:AlmacenTejidoencrudoDistribucion_SDT__BarAlbKgm|19:AlmacenTejidoencrudoDistribucion_SDT__BarAlbMtr|20:AlmacenTejidoencrudoDistribucion_SDT__BarAlbPie" ;
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
      Form.setCaption( httpContext.getMessage( "Almacen Tejido en crudo (Distribucion)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI_" + sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setName( GXCCtl );
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setWebtags( "" );
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getItemCount() > 0 )
      {
         if ( ( AV51GXV1 > 0 ) && ( AV13AlmacenTejidoencrudoDistribucion_SDT.size() >= AV51GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni())==0) )
         {
            ((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( cmbavAlmacentejidoencrudodistribucion_sdt__albruni.getValidValue(((app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)AV13AlmacenTejidoencrudoDistribucion_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni()) );
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13AlmacenTejidoencrudoDistribucion_SDT',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132EA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13AlmacenTejidoencrudoDistribucion_SDT',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142EA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13AlmacenTejidoencrudoDistribucion_SDT',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202EA2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152EA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13AlmacenTejidoencrudoDistribucion_SDT',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e122EA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13AlmacenTejidoencrudoDistribucion_SDT',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARNHDR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARSER',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEKIL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEMET',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARPIEPIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBKGM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBMTR',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODISTRIBUCION_SDT__BARALBPIE',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e112EA1',iparms:[{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ImpCod',fld:'vIMPCOD',pic:''},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV43AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV42Estado_a',fld:'vESTADO_A',pic:''},{av:'AV41Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV40Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV39Tipentcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV38Albrentf',fld:'vALBRENTF',pic:''},{av:'AV37Albrenti',fld:'vALBRENTI',pic:''},{av:'AV36AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV35ALbRef_i',fld:'vALBREF_I',pic:''},{av:'AV34UFecha',fld:'vUFECHA',pic:''},{av:'AV33PFecha',fld:'vPFECHA',pic:''},{av:'AV32UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV31PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV30ImpCod',fld:'vIMPCOD',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162EA2',iparms:[{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e172EA2',iparms:[{av:'AV44AlmacenTejidoencrudoDistribucion_SDTJson',fld:'vALMACENTEJIDOENCRUDODISTRIBUCION_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV7","{handler:'validv_Gxv7',iparms:[]");
      setEventMetadata("VALIDV_GXV7",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv22',iparms:[]");
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
      wcpOAV29EmprCod = "" ;
      wcpOAV33PFecha = GXutil.nullDate() ;
      wcpOAV34UFecha = GXutil.nullDate() ;
      wcpOAV35ALbRef_i = "" ;
      wcpOAV36AlbRef_f = "" ;
      wcpOAV37Albrenti = "" ;
      wcpOAV38Albrentf = "" ;
      wcpOAV42Estado_a = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV29EmprCod = "" ;
      AV33PFecha = GXutil.nullDate() ;
      AV34UFecha = GXutil.nullDate() ;
      AV35ALbRef_i = "" ;
      AV36AlbRef_f = "" ;
      AV37Albrenti = "" ;
      AV38Albrentf = "" ;
      AV42Estado_a = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV73Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV44AlmacenTejidoencrudoDistribucion_SDTJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13AlmacenTejidoencrudoDistribucion_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem>(app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem.class, "AlmacenTejidoencrudoDistribucion_SDTItem", "TexplusNET", remoteHandle);
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30ImpCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV45Station = "" ;
      AV46EmprNom = "" ;
      AV47UsurCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_int18 = new int[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext20 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV48websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char17 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char19 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector22 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item24 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV73Pgmname = "AlmacenTejidoencrudoDistribucion_WP" ;
      /* GeneXus formulas. */
      AV73Pgmname = "AlmacenTejidoencrudoDistribucion_WP" ;
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled = 0 ;
      cmbavAlmacentejidoencrudodistribucion_sdt__albruni.setEnabled( 0 );
      edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled = 0 ;
      edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV23ManageFiltersExecutionStep ;
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
   private short wcpOAV39Tipentcodi ;
   private short wcpOAV40Tipartcod1 ;
   private short wcpOAV41Tipartcod2 ;
   private short AV39Tipentcodi ;
   private short AV40Tipartcod1 ;
   private short AV41Tipartcod2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private int wcpOAV31PCliente ;
   private int wcpOAV32UCliente ;
   private int wcpOAV43AlbRecCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV31PCliente ;
   private int AV32UCliente ;
   private int AV43AlbRecCod ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV51GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__clicod_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__clinom_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barser_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Enabled ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int18[] ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__clicod_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__clinom_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barser_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Visible ;
   private int edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Visible ;
   private int AV25PageToGo ;
   private int AV74GXV23 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV29EmprCod ;
   private String wcpOAV35ALbRef_i ;
   private String wcpOAV36AlbRef_f ;
   private String wcpOAV37Albrenti ;
   private String wcpOAV38Albrentf ;
   private String wcpOAV42Estado_a ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV29EmprCod ;
   private String AV35ALbRef_i ;
   private String AV36AlbRef_f ;
   private String AV37Albrenti ;
   private String AV38Albrentf ;
   private String AV42Estado_a ;
   private String sGXsfl_43_idx="0001" ;
   private String AV73Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV30ImpCod ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__clicod_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__clinom_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barser_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Internalname ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String AV45Station ;
   private String AV46EmprNom ;
   private String AV47UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char17[] ;
   private String GXt_char1 ;
   private String GXv_char19[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__clicod_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__clinom_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albreccod_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrfen_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrent2_Jsonclick ;
   private String GXCCtl ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrunient_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albrpieent_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barnhdr_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barser_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barcolnom_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barcolnum_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__bartipcol_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiekil_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiemet_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__barpiepie_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albprocod_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__albprofch_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbkgm_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbmtr_Jsonclick ;
   private String edtavAlmacentejidoencrudodistribucion_sdt__baralbpie_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV33PFecha ;
   private java.util.Date wcpOAV34UFecha ;
   private java.util.Date AV33PFecha ;
   private java.util.Date AV34UFecha ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean gx_BV43 ;
   private boolean gx_refresh_fired ;
   private String AV44AlmacenTejidoencrudoDistribucion_SDTJson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlmacentejidoencrudodistribucion_sdt__albruni ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV48websession ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> AV13AlmacenTejidoencrudoDistribucion_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item23 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item24[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext20[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector22[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

