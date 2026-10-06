package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudoclientereferencia_wc_impl extends GXWebComponent
{
   public almacentejidoencrudoclientereferencia_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoencrudoclientereferencia_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudoclientereferencia_wc_impl.class ));
   }

   public almacentejidoencrudoclientereferencia_wc_impl( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV32PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32PCliente), 6, 0));
               AV33UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33UCliente), 6, 0));
               AV34Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Pfecha", localUtil.format(AV34Pfecha, "99/99/99"));
               AV35UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35UFecha", localUtil.format(AV35UFecha, "99/99/99"));
               AV36AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRef_i", AV36AlbRef_i);
               AV37AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbRef_f", AV37AlbRef_f);
               AV38Albrenti = httpContext.GetPar( "Albrenti") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Albrenti", AV38Albrenti);
               AV39Albrentf = httpContext.GetPar( "Albrentf") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Albrentf", AV39Albrentf);
               AV40TipEntcodi = (short)(GXutil.lval( httpContext.GetPar( "TipEntcodi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntcodi), 4, 0));
               AV41Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod1), 4, 0));
               AV42Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Tipartcod2), 4, 0));
               AV43Estado_a = httpContext.GetPar( "Estado_a") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Estado_a", AV43Estado_a);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV32PCliente),Integer.valueOf(AV33UCliente),AV34Pfecha,AV35UFecha,AV36AlbRef_i,AV37AlbRef_f,AV38Albrenti,AV39Albrentf,Short.valueOf(AV40TipEntcodi),Short.valueOf(AV41Tipartcod1),Short.valueOf(AV42Tipartcod2),AV43Estado_a});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV22ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10ColumnsSelector);
      AV73Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV32PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
      AV33UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
      AV34Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
      AV35UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
      AV36AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
      AV37AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
      AV38Albrenti = httpContext.GetPar( "Albrenti") ;
      AV39Albrentf = httpContext.GetPar( "Albrentf") ;
      AV40TipEntcodi = (short)(GXutil.lval( httpContext.GetPar( "TipEntcodi"))) ;
      AV41Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
      AV42Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
      AV43Estado_a = httpContext.GetPar( "Estado_a") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      AV45Tot_TotUniE = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotUniE"), ".") ;
      AV47Tot_TotPzE = GXutil.lval( httpContext.GetPar( "Tot_TotPzE")) ;
      AV49Tot_TotUniS = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotUniS"), ".") ;
      AV51Tot_TotPzU = GXutil.lval( httpContext.GetPar( "Tot_TotPzU")) ;
      AV53Tot_TotUniSal = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotUniSal"), ".") ;
      AV55Tot_TotPzSal = GXutil.lval( httpContext.GetPar( "Tot_TotPzSal")) ;
      AV57AlmacenTejidoencrudoClienteReferencia_SDTJson = httpContext.GetPar( "AlmacenTejidoencrudoClienteReferencia_SDTJson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DG2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Almacen Tejido en Crudo (Cliente_Referencia)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacentejidoencrudoclientereferencia_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32PCliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33UCliente,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34Pfecha)),GXutil.URLEncode(GXutil.formatDateParm(AV35UFecha)),GXutil.URLEncode(GXutil.rtrim(AV36AlbRef_i)),GXutil.URLEncode(GXutil.rtrim(AV37AlbRef_f)),GXutil.URLEncode(GXutil.rtrim(AV38Albrenti)),GXutil.URLEncode(GXutil.rtrim(AV39Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV40TipEntcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Tipartcod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42Tipartcod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV43Estado_a))}, new String[] {"EmprCod","PCliente","UCliente","Pfecha","UFecha","AlbRef_i","AlbRef_f","Albrenti","Albrentf","TipEntcodi","Tipartcod1","Tipartcod2","Estado_a"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", getSecureSignedToken( sPrefix, AV9AlmacenTejidoencrudoClienteReferencia_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIE", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNISAL", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZSAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", getSecureSignedToken( sPrefix, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoClienteReferencia_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudoclientereferencia_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Almacentejidoencrudoclientereferencia_sdt", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Almacentejidoencrudoclientereferencia_sdt", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Almacentejidoencrudoclientereferencia_sdt", getSecureSignedToken( sPrefix, AV9AlmacenTejidoencrudoClienteReferencia_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV17GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV18GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32PCliente", GXutil.ltrim( localUtil.ntoc( wcpOAV32PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33UCliente", GXutil.ltrim( localUtil.ntoc( wcpOAV33UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Pfecha", localUtil.dtoc( wcpOAV34Pfecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35UFecha", localUtil.dtoc( wcpOAV35UFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36AlbRef_i", GXutil.rtrim( wcpOAV36AlbRef_i));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37AlbRef_f", GXutil.rtrim( wcpOAV37AlbRef_f));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Albrenti", GXutil.rtrim( wcpOAV38Albrenti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Albrentf", GXutil.rtrim( wcpOAV39Albrentf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40TipEntcodi", GXutil.ltrim( localUtil.ntoc( wcpOAV40TipEntcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41Tipartcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV41Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Tipartcod2", GXutil.ltrim( localUtil.ntoc( wcpOAV42Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Estado_a", GXutil.rtrim( wcpOAV43Estado_a));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV22ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCLIENTE", GXutil.ltrim( localUtil.ntoc( AV32PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUCLIENTE", GXutil.ltrim( localUtil.ntoc( AV33UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPFECHA", localUtil.dtoc( AV34Pfecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUFECHA", localUtil.dtoc( AV35UFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_I", GXutil.rtrim( AV36AlbRef_i));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_F", GXutil.rtrim( AV37AlbRef_f));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTI", GXutil.rtrim( AV38Albrenti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTF", GXutil.rtrim( AV39Albrentf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCODI", GXutil.ltrim( localUtil.ntoc( AV40TipEntcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV41Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD2", GXutil.ltrim( localUtil.ntoc( AV42Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTADO_A", GXutil.rtrim( AV43Estado_a));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", getSecureSignedToken( sPrefix, AV9AlmacenTejidoencrudoClienteReferencia_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNIE", GXutil.ltrim( localUtil.ntoc( AV45Tot_TotUniE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIE", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZE", GXutil.ltrim( localUtil.ntoc( AV47Tot_TotPzE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNIS", GXutil.ltrim( localUtil.ntoc( AV49Tot_TotUniS, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZU", GXutil.ltrim( localUtil.ntoc( AV51Tot_TotPzU, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNISAL", GXutil.ltrim( localUtil.ntoc( AV53Tot_TotUniSal, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNISAL", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZSAL", GXutil.ltrim( localUtil.ntoc( AV55Tot_TotPzSal, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZSAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV19GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV19GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", AV57AlmacenTejidoencrudoClienteReferencia_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", getSecureSignedToken( sPrefix, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DG2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "AlmacenTejidoencrudoClienteReferencia_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido en Crudo (Cliente_Referencia)", "") ;
   }

   public void wb2DG0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.almacentejidoencrudoclientereferencia_wc");
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112dg1_client"+"'", TempTags, "", 2, "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_2DG2( true) ;
      }
      else
      {
         wb_table1_25_2DG2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_2DG2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
            AV61GXV1 = nGXsfl_43_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_57_2DG2( true) ;
      }
      else
      {
         wb_table2_57_2DG2( false) ;
      }
      return  ;
   }

   public void wb_table2_57_2DG2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV17GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV18GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV73Pgmname), GXutil.rtrim( localUtil.format( AV73Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV10ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
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
               AV61GXV1 = nGXsfl_43_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2DG2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido en Crudo (Cliente_Referencia)", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup2DG0( ) ;
         }
      }
   }

   public void ws2DG2( )
   {
      start2DG2( ) ;
      evt2DG2( ) ;
   }

   public void evt2DG2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e162DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e172DG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DG0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV61GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) && ( AV61GXV1 > 0 ) )
                           {
                              AV9AlmacenTejidoencrudoClienteReferencia_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e182DG2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e192DG2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e202DG2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2DG0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void we2DG2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DG2( ) ;
         }
      }
   }

   public void pa2DG2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
                                 byte AV22ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ,
                                 String AV73Pgmname ,
                                 String AV16FilterFullText ,
                                 String AV5EmprCod ,
                                 int AV32PCliente ,
                                 int AV33UCliente ,
                                 java.util.Date AV34Pfecha ,
                                 java.util.Date AV35UFecha ,
                                 String AV36AlbRef_i ,
                                 String AV37AlbRef_f ,
                                 String AV38Albrenti ,
                                 String AV39Albrentf ,
                                 short AV40TipEntcodi ,
                                 short AV41Tipartcod1 ,
                                 short AV42Tipartcod2 ,
                                 String AV43Estado_a ,
                                 GXBaseCollection<app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> AV9AlmacenTejidoencrudoClienteReferencia_SDT ,
                                 java.math.BigDecimal AV45Tot_TotUniE ,
                                 long AV47Tot_TotPzE ,
                                 java.math.BigDecimal AV49Tot_TotUniS ,
                                 long AV51Tot_TotPzU ,
                                 java.math.BigDecimal AV53Tot_TotUniSal ,
                                 long AV55Tot_TotPzSal ,
                                 String AV57AlmacenTejidoencrudoClienteReferencia_SDTJson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192DG2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DG2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoClienteReferencia_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudoclientereferencia_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV73Pgmname = "AlmacenTejidoencrudoClienteReferencia_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_totunie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunie_Enabled), 5, 0), true);
      edtavTotvalue_totpze_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpze_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpze_Enabled), 5, 0), true);
      edtavTotvalue_totunis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunis_Enabled), 5, 0), true);
      edtavTotvalue_totpzu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpzu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpzu_Enabled), 5, 0), true);
      edtavTotvalue_totunisal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunisal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunisal_Enabled), 5, 0), true);
      edtavTotvalue_totpzsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpzsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpzsal_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e192DG2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         e202DG2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e202DG2 ();
         }
         wbEnd = (short)(43) ;
         wb2DG0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DG2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", AV9AlmacenTejidoencrudoClienteReferencia_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT", getSecureSignedToken( sPrefix, AV9AlmacenTejidoencrudoClienteReferencia_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNIE", GXutil.ltrim( localUtil.ntoc( AV45Tot_TotUniE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIE", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZE", GXutil.ltrim( localUtil.ntoc( AV47Tot_TotPzE, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNIS", GXutil.ltrim( localUtil.ntoc( AV49Tot_TotUniS, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZU", GXutil.ltrim( localUtil.ntoc( AV51Tot_TotPzU, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUNISAL", GXutil.ltrim( localUtil.ntoc( AV53Tot_TotUniSal, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNISAL", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPZSAL", GXutil.ltrim( localUtil.ntoc( AV55Tot_TotPzSal, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZSAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", AV57AlmacenTejidoencrudoClienteReferencia_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", getSecureSignedToken( sPrefix, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson));
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
      return AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22ManageFiltersExecutionStep, AV10ColumnsSelector, AV73Pgmname, AV16FilterFullText, AV5EmprCod, AV32PCliente, AV33UCliente, AV34Pfecha, AV35UFecha, AV36AlbRef_i, AV37AlbRef_f, AV38Albrenti, AV39Albrentf, AV40TipEntcodi, AV41Tipartcod1, AV42Tipartcod2, AV43Estado_a, AV9AlmacenTejidoencrudoClienteReferencia_SDT, AV45Tot_TotUniE, AV47Tot_TotPzE, AV49Tot_TotUniS, AV51Tot_TotPzU, AV53Tot_TotUniSal, AV55Tot_TotPzSal, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV73Pgmname = "AlmacenTejidoencrudoClienteReferencia_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_totunie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunie_Enabled), 5, 0), true);
      edtavTotvalue_totpze_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpze_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpze_Enabled), 5, 0), true);
      edtavTotvalue_totunis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunis_Enabled), 5, 0), true);
      edtavTotvalue_totpzu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpzu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpzu_Enabled), 5, 0), true);
      edtavTotvalue_totunisal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totunisal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totunisal_Enabled), 5, 0), true);
      edtavTotvalue_totpzsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpzsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpzsal_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182DG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Almacentejidoencrudoclientereferencia_sdt"), AV9AlmacenTejidoencrudoClienteReferencia_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV10ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT"), AV9AlmacenTejidoencrudoClienteReferencia_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV32PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32PCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33UCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Pfecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Pfecha"), 0) ;
         wcpOAV35UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35UFecha"), 0) ;
         wcpOAV36AlbRef_i = httpContext.cgiGet( sPrefix+"wcpOAV36AlbRef_i") ;
         wcpOAV37AlbRef_f = httpContext.cgiGet( sPrefix+"wcpOAV37AlbRef_f") ;
         wcpOAV38Albrenti = httpContext.cgiGet( sPrefix+"wcpOAV38Albrenti") ;
         wcpOAV39Albrentf = httpContext.cgiGet( sPrefix+"wcpOAV39Albrentf") ;
         wcpOAV40TipEntcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40TipEntcodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV41Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Tipartcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Tipartcod2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43Estado_a = httpContext.cgiGet( sPrefix+"wcpOAV43Estado_a") ;
         AV43Estado_a = httpContext.cgiGet( sPrefix+"vESTADO_A") ;
         AV42Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCOD2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40TipEntcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPENTCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39Albrentf = httpContext.cgiGet( sPrefix+"vALBRENTF") ;
         AV38Albrenti = httpContext.cgiGet( sPrefix+"vALBRENTI") ;
         AV37AlbRef_f = httpContext.cgiGet( sPrefix+"vALBREF_F") ;
         AV36AlbRef_i = httpContext.cgiGet( sPrefix+"vALBREF_I") ;
         AV35UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"vUFECHA"), 0) ;
         AV34Pfecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"vPFECHA"), 0) ;
         AV33UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vUCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vPCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_43_fel_idx = 0 ;
         while ( nGXsfl_43_fel_idx < nRC_GXsfl_43 )
         {
            nGXsfl_43_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_fel_idx+1) ;
            sGXsfl_43_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_432( ) ;
            AV61GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) && ( AV61GXV1 > 0 ) )
            {
               AV9AlmacenTejidoencrudoClienteReferencia_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)) );
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
         AV16FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         AV46TotValue_TotUniE = httpContext.cgiGet( edtavTotvalue_totunie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_TotUniE", AV46TotValue_TotUniE);
         AV48TotValue_TotPzE = httpContext.cgiGet( edtavTotvalue_totpze_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_TotPzE", AV48TotValue_TotPzE);
         AV50TotValue_TotUniS = httpContext.cgiGet( edtavTotvalue_totunis_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_TotUniS", AV50TotValue_TotUniS);
         AV52TotValue_TotPzU = httpContext.cgiGet( edtavTotvalue_totpzu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_TotPzU", AV52TotValue_TotPzU);
         AV54TotValue_TotUniSal = httpContext.cgiGet( edtavTotvalue_totunisal_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValue_TotUniSal", AV54TotValue_TotUniSal);
         AV56TotValue_TotPzSal = httpContext.cgiGet( edtavTotvalue_totpzsal_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValue_TotPzSal", AV56TotValue_TotPzSal);
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_43_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         AV61GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_43_idx > 0 )
         {
            AV61GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) && ( AV61GXV1 > 0 ) )
            {
               AV9AlmacenTejidoencrudoClienteReferencia_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)) );
            }
            if ( ( AV61GXV1 > 0 ) && ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) )
            {
               AV9AlmacenTejidoencrudoClienteReferencia_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoClienteReferencia_WC");
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacentejidoencrudoclientereferencia_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182DG2 ();
      if (returnInSub) return;
   }

   public void e182DG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoencrudoclientereferencia_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV6EmprNom = GXv_char3[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV57AlmacenTejidoencrudoClienteReferencia_SDTJson ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = " " ;
      GXv_int7[0] = AV32PCliente ;
      GXv_int8[0] = AV33UCliente ;
      GXv_date9[0] = AV34Pfecha ;
      GXv_date10[0] = AV35UFecha ;
      GXv_char2[0] = AV36AlbRef_i ;
      GXv_char11[0] = AV37AlbRef_f ;
      GXv_char12[0] = AV38Albrenti ;
      GXv_char13[0] = AV39Albrentf ;
      GXv_int14[0] = AV40TipEntcodi ;
      GXv_int15[0] = AV41Tipartcod1 ;
      GXv_int16[0] = AV42Tipartcod2 ;
      GXv_char17[0] = AV43Estado_a ;
      GXv_char18[0] = GXt_char1 ;
      new app.almacentejidoencrudoclientereferencia_prc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char2, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_char18) ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV32PCliente = GXv_int7[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV33UCliente = GXv_int8[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV34Pfecha = GXv_date9[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV35UFecha = GXv_date10[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV36AlbRef_i = GXv_char2[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV37AlbRef_f = GXv_char11[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV38Albrenti = GXv_char12[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV39Albrentf = GXv_char13[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV40TipEntcodi = GXv_int14[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV41Tipartcod1 = GXv_int15[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV42Tipartcod2 = GXv_int16[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV43Estado_a = GXv_char17[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.GXt_char1 = GXv_char18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32PCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33UCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Pfecha", localUtil.format(AV34Pfecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35UFecha", localUtil.format(AV35UFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRef_i", AV36AlbRef_i);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbRef_f", AV37AlbRef_f);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Albrenti", AV38Albrenti);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Albrentf", AV39Albrentf);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntcodi), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod1), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Tipartcod2), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Estado_a", AV43Estado_a);
      AV57AlmacenTejidoencrudoClienteReferencia_SDTJson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57AlmacenTejidoencrudoClienteReferencia_SDTJson", AV57AlmacenTejidoencrudoClienteReferencia_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON", getSecureSignedToken( sPrefix, AV57AlmacenTejidoencrudoClienteReferencia_SDTJson));
      AV9AlmacenTejidoencrudoClienteReferencia_SDT.fromJSonString(AV57AlmacenTejidoencrudoClienteReferencia_SDTJson, null);
      gx_BV43 = true ;
   }

   public void e192DG2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext19[0] = AV27WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext19) ;
      AV27WWPContext = GXv_SdtWWPContext19[0] ;
      if ( AV22ManageFiltersExecutionStep == 1 )
      {
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV22ManageFiltersExecutionStep == 2 )
      {
         AV22ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("AlmacenTejidoencrudoClienteReferencia_WCColumnsSelector"), "") != 0 )
      {
         AV12ColumnsSelectorXML = AV25Session.getValue("AlmacenTejidoencrudoClienteReferencia_WCColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV12ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getInternalname(), "Visible", GXutil.ltrimstr( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV17GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridCurrentPage), 10, 0));
      AV18GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
   }

   public void e132DG2( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e142DG2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202DG2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() )
      {
         AV9AlmacenTejidoencrudoClienteReferencia_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_432( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, GridRow);
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void e152DG2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV12ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV10ColumnsSelector.fromJSonString(AV12ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoClienteReferencia_WCColumnsSelector", ((GXutil.strcmp("", AV12ColumnsSelectorXML)==0) ? "" : AV10ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
   }

   public void e122DG2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoClienteReferencia_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV73Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoClienteReferencia_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char18[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AlmacenTejidoencrudoClienteReferencia_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char18) ;
         almacentejidoencrudoclientereferencia_wc_impl.this.GXt_char1 = GXv_char18[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV19GridState.fromxml(AV23ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19GridState", AV19GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e162DG2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV58websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoClienteReferencia_SDT", ""), AV57AlmacenTejidoencrudoClienteReferencia_SDTJson);
      GXv_char18[0] = AV15ExcelFilename ;
      GXv_char17[0] = AV14ErrorMessage ;
      new app.almacentejidoencrudoclientereferencia_wcexport(remoteHandle, context).execute( GXv_char18, GXv_char17) ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV15ExcelFilename = GXv_char18[0] ;
      almacentejidoencrudoclientereferencia_wc_impl.this.AV14ErrorMessage = GXv_char17[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV14ErrorMessage);
      }
   }

   public void e172DG2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV58websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoClienteReferencia_SDT", ""), AV57AlmacenTejidoencrudoClienteReferencia_SDTJson);
      callWebObject(formatLink("app.almacentejidoencrudoclientereferencia_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__Clicod", "", "Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__CliNom", "", "Nombre", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__Albref", "", "Referencia", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__Albrefdsc", "", "Descripcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__AlbUni", "", "Und", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotUniE", "", "Tot. Und. Ent", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotPzE", "", "Tot. Pzs. Ent.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotUniS", "", "Tot. Und. Uti.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotPzU", "", "Tot. Pzs. Uti.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotUniSal", "", "Saldo Und.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoClienteReferencia_SDT__TotPzSal", "", "Saldo Pzs.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV26UserCustomValue ;
      GXv_char18[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoClienteReferencia_WCColumnsSelector", GXv_char18) ;
      almacentejidoencrudoclientereferencia_wc_impl.this.GXt_char1 = GXv_char18[0] ;
      AV26UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV11ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV11ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV11ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AlmacenTejidoencrudoClienteReferencia_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV16FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV73Pgmname+"GridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV73Pgmname+"GridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV25Session.getValue(AV73Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV19GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV19GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV19GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV74GXV13 = 1 ;
      while ( AV74GXV13 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV13));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         }
         AV74GXV13 = (int)(AV74GXV13+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV19GridState.fromxml(AV25Session.getValue(AV73Pgmname+"GridState"), null, null);
      AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV19GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV16FilterFullText)==0), (short)(0), AV16FilterFullText, "") ;
      AV19GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV32PCliente) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCLIENTE" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32PCliente, 6, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV33UCliente) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UCLIENTE" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV33UCliente, 6, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34Pfecha)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PFECHA" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34Pfecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35UFecha)) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UFECHA" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV35UFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36AlbRef_i)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_I" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36AlbRef_i );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37AlbRef_f)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_F" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37AlbRef_f );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38Albrenti)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTI" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38Albrenti );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV39Albrentf)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTF" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39Albrentf );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV40TipEntcodi) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPENTCODI" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40TipEntcodi, 4, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV41Tipartcod1) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD1" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41Tipartcod1, 4, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (0==AV42Tipartcod2) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD2" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV42Tipartcod2, 4, 0) );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV43Estado_a)==0) )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ESTADO_A" );
         AV20GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43Estado_a );
         AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV20GridStateFilterValue, 0);
      }
      AV19GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV19GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV19GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV45Tot_TotUniE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_TotUniE", GXutil.ltrimstr( AV45Tot_TotUniE, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIE", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99")));
      AV47Tot_TotPzE = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_TotPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Tot_TotPzE), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9")));
      AV49Tot_TotUniS = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_TotUniS", GXutil.ltrimstr( AV49Tot_TotUniS, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99")));
      AV51Tot_TotPzU = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_TotPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tot_TotPzU), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9")));
      AV53Tot_TotUniSal = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Tot_TotUniSal", GXutil.ltrimstr( AV53Tot_TotUniSal, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNISAL", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99")));
      AV55Tot_TotPzSal = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Tot_TotPzSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZSAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV75GXV14 = 1 ;
      while ( AV75GXV14 <= AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() )
      {
         AV44AlmacenTejidoencrudoClienteReferencia_SDTItem = (app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV75GXV14));
         AV45Tot_TotUniE = AV45Tot_TotUniE.add((AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_TotUniE", GXutil.ltrimstr( AV45Tot_TotUniE, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIE", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99")));
         AV47Tot_TotPzE = (long)(AV47Tot_TotPzE+(AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_TotPzE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Tot_TotPzE), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9")));
         AV49Tot_TotUniS = AV49Tot_TotUniS.add((AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_TotUniS", GXutil.ltrimstr( AV49Tot_TotUniS, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNIS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99")));
         AV51Tot_TotPzU = (long)(AV51Tot_TotPzU+(AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_TotPzU", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tot_TotPzU), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9")));
         AV53Tot_TotUniSal = AV53Tot_TotUniSal.add((AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Tot_TotUniSal", GXutil.ltrimstr( AV53Tot_TotUniSal, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUNISAL", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99")));
         AV55Tot_TotPzSal = (long)(AV55Tot_TotPzSal+(AV44AlmacenTejidoencrudoClienteReferencia_SDTItem.getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Tot_TotPzSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPZSAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9")));
         AV75GXV14 = (int)(AV75GXV14+1) ;
      }
      AV46TotValue_TotUniE = localUtil.format( AV45Tot_TotUniE, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_TotUniE", AV46TotValue_TotUniE);
      AV48TotValue_TotPzE = localUtil.format( DecimalUtil.doubleToDec(AV47Tot_TotPzE), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_TotPzE", AV48TotValue_TotPzE);
      AV50TotValue_TotUniS = localUtil.format( AV49Tot_TotUniS, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_TotUniS", AV50TotValue_TotUniS);
      AV52TotValue_TotPzU = localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPzU), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_TotPzU", AV52TotValue_TotPzU);
      AV54TotValue_TotUniSal = localUtil.format( AV53Tot_TotUniSal, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValue_TotUniSal", AV54TotValue_TotUniSal);
      AV56TotValue_TotPzSal = localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPzSal), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValue_TotPzSal", AV56TotValue_TotPzSal);
   }

   public void wb_table2_57_2DG2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totunie_Internalname, httpContext.getMessage( "Tot Value_Tot Uni E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totunie_Internalname, AV46TotValue_TotUniE, GXutil.rtrim( localUtil.format( AV46TotValue_TotUniE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totunie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totunie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpze_Internalname, httpContext.getMessage( "Tot Value_Tot Pz E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpze_Internalname, AV48TotValue_TotPzE, GXutil.rtrim( localUtil.format( AV48TotValue_TotPzE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpze_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpze_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totunis_Internalname, httpContext.getMessage( "Tot Value_Tot Uni S", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totunis_Internalname, AV50TotValue_TotUniS, GXutil.rtrim( localUtil.format( AV50TotValue_TotUniS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totunis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totunis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpzu_Internalname, httpContext.getMessage( "Tot Value_Tot Pz U", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpzu_Internalname, AV52TotValue_TotPzU, GXutil.rtrim( localUtil.format( AV52TotValue_TotPzU, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpzu_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpzu_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totunisal_Internalname, httpContext.getMessage( "Tot Value_Tot Uni Sal", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totunisal_Internalname, AV54TotValue_TotUniSal, GXutil.rtrim( localUtil.format( AV54TotValue_TotUniSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totunisal_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totunisal_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpzsal_Internalname, httpContext.getMessage( "Tot Value_Tot Pz Sal", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpzsal_Internalname, AV56TotValue_TotPzSal, GXutil.rtrim( localUtil.format( AV56TotValue_TotPzSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpzsal_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpzsal_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_57_2DG2e( true) ;
      }
      else
      {
         wb_table2_57_2DG2e( false) ;
      }
   }

   public void wb_table1_25_2DG2( boolean wbgen )
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
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_30_2DG2( true) ;
      }
      else
      {
         wb_table3_30_2DG2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_2DG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_2DG2e( true) ;
      }
      else
      {
         wb_table1_25_2DG2e( false) ;
      }
   }

   public void wb_table3_30_2DG2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV16FilterFullText, GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AlmacenTejidoencrudoClienteReferencia_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_2DG2e( true) ;
      }
      else
      {
         wb_table3_30_2DG2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV32PCliente = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32PCliente), 6, 0));
      AV33UCliente = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33UCliente), 6, 0));
      AV34Pfecha = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Pfecha", localUtil.format(AV34Pfecha, "99/99/99"));
      AV35UFecha = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35UFecha", localUtil.format(AV35UFecha, "99/99/99"));
      AV36AlbRef_i = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRef_i", AV36AlbRef_i);
      AV37AlbRef_f = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbRef_f", AV37AlbRef_f);
      AV38Albrenti = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Albrenti", AV38Albrenti);
      AV39Albrentf = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Albrentf", AV39Albrentf);
      AV40TipEntcodi = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntcodi), 4, 0));
      AV41Tipartcod1 = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod1), 4, 0));
      AV42Tipartcod2 = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Tipartcod2), 4, 0));
      AV43Estado_a = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Estado_a", AV43Estado_a);
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
      pa2DG2( ) ;
      ws2DG2( ) ;
      we2DG2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV32PCliente = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV33UCliente = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV34Pfecha = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV35UFecha = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV36AlbRef_i = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV37AlbRef_f = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV38Albrenti = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV39Albrentf = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV40TipEntcodi = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV41Tipartcod1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV42Tipartcod2 = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV43Estado_a = (String)getParm(obj,12,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DG2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "almacentejidoencrudoclientereferencia_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DG2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV32PCliente = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32PCliente), 6, 0));
         AV33UCliente = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33UCliente), 6, 0));
         AV34Pfecha = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Pfecha", localUtil.format(AV34Pfecha, "99/99/99"));
         AV35UFecha = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35UFecha", localUtil.format(AV35UFecha, "99/99/99"));
         AV36AlbRef_i = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRef_i", AV36AlbRef_i);
         AV37AlbRef_f = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbRef_f", AV37AlbRef_f);
         AV38Albrenti = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Albrenti", AV38Albrenti);
         AV39Albrentf = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Albrentf", AV39Albrentf);
         AV40TipEntcodi = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntcodi), 4, 0));
         AV41Tipartcod1 = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod1), 4, 0));
         AV42Tipartcod2 = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Tipartcod2), 4, 0));
         AV43Estado_a = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Estado_a", AV43Estado_a);
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV32PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32PCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33UCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Pfecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Pfecha"), 0) ;
      wcpOAV35UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35UFecha"), 0) ;
      wcpOAV36AlbRef_i = httpContext.cgiGet( sPrefix+"wcpOAV36AlbRef_i") ;
      wcpOAV37AlbRef_f = httpContext.cgiGet( sPrefix+"wcpOAV37AlbRef_f") ;
      wcpOAV38Albrenti = httpContext.cgiGet( sPrefix+"wcpOAV38Albrenti") ;
      wcpOAV39Albrentf = httpContext.cgiGet( sPrefix+"wcpOAV39Albrentf") ;
      wcpOAV40TipEntcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40TipEntcodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV41Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Tipartcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Tipartcod2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43Estado_a = httpContext.cgiGet( sPrefix+"wcpOAV43Estado_a") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV32PCliente != wcpOAV32PCliente ) || ( AV33UCliente != wcpOAV33UCliente ) || !( GXutil.dateCompare(GXutil.resetTime(AV34Pfecha), GXutil.resetTime(wcpOAV34Pfecha)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV35UFecha), GXutil.resetTime(wcpOAV35UFecha)) ) || ( GXutil.strcmp(AV36AlbRef_i, wcpOAV36AlbRef_i) != 0 ) || ( GXutil.strcmp(AV37AlbRef_f, wcpOAV37AlbRef_f) != 0 ) || ( GXutil.strcmp(AV38Albrenti, wcpOAV38Albrenti) != 0 ) || ( GXutil.strcmp(AV39Albrentf, wcpOAV39Albrentf) != 0 ) || ( AV40TipEntcodi != wcpOAV40TipEntcodi ) || ( AV41Tipartcod1 != wcpOAV41Tipartcod1 ) || ( AV42Tipartcod2 != wcpOAV42Tipartcod2 ) || ( GXutil.strcmp(AV43Estado_a, wcpOAV43Estado_a) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV32PCliente = AV32PCliente ;
      wcpOAV33UCliente = AV33UCliente ;
      wcpOAV34Pfecha = AV34Pfecha ;
      wcpOAV35UFecha = AV35UFecha ;
      wcpOAV36AlbRef_i = AV36AlbRef_i ;
      wcpOAV37AlbRef_f = AV37AlbRef_f ;
      wcpOAV38Albrenti = AV38Albrenti ;
      wcpOAV39Albrentf = AV39Albrentf ;
      wcpOAV40TipEntcodi = AV40TipEntcodi ;
      wcpOAV41Tipartcod1 = AV41Tipartcod1 ;
      wcpOAV42Tipartcod2 = AV42Tipartcod2 ;
      wcpOAV43Estado_a = AV43Estado_a ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV32PCliente = httpContext.cgiGet( sPrefix+"AV32PCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV32PCliente) > 0 )
      {
         AV32PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32PCliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32PCliente), 6, 0));
      }
      else
      {
         AV32PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32PCliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33UCliente = httpContext.cgiGet( sPrefix+"AV33UCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV33UCliente) > 0 )
      {
         AV33UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33UCliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33UCliente), 6, 0));
      }
      else
      {
         AV33UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33UCliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34Pfecha = httpContext.cgiGet( sPrefix+"AV34Pfecha_CTRL") ;
      if ( GXutil.len( sCtrlAV34Pfecha) > 0 )
      {
         AV34Pfecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34Pfecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Pfecha", localUtil.format(AV34Pfecha, "99/99/99"));
      }
      else
      {
         AV34Pfecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34Pfecha_PARM"), 0) ;
      }
      sCtrlAV35UFecha = httpContext.cgiGet( sPrefix+"AV35UFecha_CTRL") ;
      if ( GXutil.len( sCtrlAV35UFecha) > 0 )
      {
         AV35UFecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV35UFecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35UFecha", localUtil.format(AV35UFecha, "99/99/99"));
      }
      else
      {
         AV35UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV35UFecha_PARM"), 0) ;
      }
      sCtrlAV36AlbRef_i = httpContext.cgiGet( sPrefix+"AV36AlbRef_i_CTRL") ;
      if ( GXutil.len( sCtrlAV36AlbRef_i) > 0 )
      {
         AV36AlbRef_i = httpContext.cgiGet( sCtrlAV36AlbRef_i) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRef_i", AV36AlbRef_i);
      }
      else
      {
         AV36AlbRef_i = httpContext.cgiGet( sPrefix+"AV36AlbRef_i_PARM") ;
      }
      sCtrlAV37AlbRef_f = httpContext.cgiGet( sPrefix+"AV37AlbRef_f_CTRL") ;
      if ( GXutil.len( sCtrlAV37AlbRef_f) > 0 )
      {
         AV37AlbRef_f = httpContext.cgiGet( sCtrlAV37AlbRef_f) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbRef_f", AV37AlbRef_f);
      }
      else
      {
         AV37AlbRef_f = httpContext.cgiGet( sPrefix+"AV37AlbRef_f_PARM") ;
      }
      sCtrlAV38Albrenti = httpContext.cgiGet( sPrefix+"AV38Albrenti_CTRL") ;
      if ( GXutil.len( sCtrlAV38Albrenti) > 0 )
      {
         AV38Albrenti = httpContext.cgiGet( sCtrlAV38Albrenti) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Albrenti", AV38Albrenti);
      }
      else
      {
         AV38Albrenti = httpContext.cgiGet( sPrefix+"AV38Albrenti_PARM") ;
      }
      sCtrlAV39Albrentf = httpContext.cgiGet( sPrefix+"AV39Albrentf_CTRL") ;
      if ( GXutil.len( sCtrlAV39Albrentf) > 0 )
      {
         AV39Albrentf = httpContext.cgiGet( sCtrlAV39Albrentf) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Albrentf", AV39Albrentf);
      }
      else
      {
         AV39Albrentf = httpContext.cgiGet( sPrefix+"AV39Albrentf_PARM") ;
      }
      sCtrlAV40TipEntcodi = httpContext.cgiGet( sPrefix+"AV40TipEntcodi_CTRL") ;
      if ( GXutil.len( sCtrlAV40TipEntcodi) > 0 )
      {
         AV40TipEntcodi = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40TipEntcodi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntcodi), 4, 0));
      }
      else
      {
         AV40TipEntcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40TipEntcodi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV41Tipartcod1 = httpContext.cgiGet( sPrefix+"AV41Tipartcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV41Tipartcod1) > 0 )
      {
         AV41Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41Tipartcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Tipartcod1), 4, 0));
      }
      else
      {
         AV41Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41Tipartcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42Tipartcod2 = httpContext.cgiGet( sPrefix+"AV42Tipartcod2_CTRL") ;
      if ( GXutil.len( sCtrlAV42Tipartcod2) > 0 )
      {
         AV42Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42Tipartcod2), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Tipartcod2), 4, 0));
      }
      else
      {
         AV42Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42Tipartcod2_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43Estado_a = httpContext.cgiGet( sPrefix+"AV43Estado_a_CTRL") ;
      if ( GXutil.len( sCtrlAV43Estado_a) > 0 )
      {
         AV43Estado_a = httpContext.cgiGet( sCtrlAV43Estado_a) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Estado_a", AV43Estado_a);
      }
      else
      {
         AV43Estado_a = httpContext.cgiGet( sPrefix+"AV43Estado_a_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa2DG2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws2DG2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32PCliente_PARM", GXutil.ltrim( localUtil.ntoc( AV32PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32PCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32PCliente_CTRL", GXutil.rtrim( sCtrlAV32PCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33UCliente_PARM", GXutil.ltrim( localUtil.ntoc( AV33UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33UCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33UCliente_CTRL", GXutil.rtrim( sCtrlAV33UCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Pfecha_PARM", localUtil.dtoc( AV34Pfecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Pfecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Pfecha_CTRL", GXutil.rtrim( sCtrlAV34Pfecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35UFecha_PARM", localUtil.dtoc( AV35UFecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35UFecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35UFecha_CTRL", GXutil.rtrim( sCtrlAV35UFecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36AlbRef_i_PARM", GXutil.rtrim( AV36AlbRef_i));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36AlbRef_i)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36AlbRef_i_CTRL", GXutil.rtrim( sCtrlAV36AlbRef_i));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37AlbRef_f_PARM", GXutil.rtrim( AV37AlbRef_f));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37AlbRef_f)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37AlbRef_f_CTRL", GXutil.rtrim( sCtrlAV37AlbRef_f));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Albrenti_PARM", GXutil.rtrim( AV38Albrenti));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Albrenti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Albrenti_CTRL", GXutil.rtrim( sCtrlAV38Albrenti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Albrentf_PARM", GXutil.rtrim( AV39Albrentf));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Albrentf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Albrentf_CTRL", GXutil.rtrim( sCtrlAV39Albrentf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40TipEntcodi_PARM", GXutil.ltrim( localUtil.ntoc( AV40TipEntcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40TipEntcodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40TipEntcodi_CTRL", GXutil.rtrim( sCtrlAV40TipEntcodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Tipartcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV41Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41Tipartcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Tipartcod1_CTRL", GXutil.rtrim( sCtrlAV41Tipartcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Tipartcod2_PARM", GXutil.ltrim( localUtil.ntoc( AV42Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Tipartcod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Tipartcod2_CTRL", GXutil.rtrim( sCtrlAV42Tipartcod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Estado_a_PARM", GXutil.rtrim( AV43Estado_a));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Estado_a)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Estado_a_CTRL", GXutil.rtrim( sCtrlAV43Estado_a));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we2DG2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555375", true, true);
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
      httpContext.AddJavascriptSource("almacentejidoencrudoclientereferencia_wc.js", "?20268211555375", false, true);
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
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC_"+sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI_"+sGXsfl_43_idx );
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC_"+sGXsfl_43_fel_idx ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI_"+sGXsfl_43_fel_idx );
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb2DG0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albref()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albrefdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI_" + sGXsfl_43_idx ;
            cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setName( GXCCtl );
            cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setWebtags( "" );
            cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getItemCount() > 0 )
            {
               if ( ( AV61GXV1 > 0 ) && ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni())==0) )
               {
                  ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).setgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getValidValue(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni,cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getInternalname(),GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni()),Integer.valueOf(1),cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getVisible()),Integer.valueOf(cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setValue( GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getInternalname(), "Values", cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunie(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpze()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunis(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzu()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totunisal(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Totpzsal()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible),Integer.valueOf(edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DG2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Und. Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Pzs. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Und. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Pzs. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo Pzs.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnpdf_Internalname = sPrefix+"BTNPDF" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC" ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI" );
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL" ;
      edtavTotvalue_totunie_Internalname = sPrefix+"vTOTVALUE_TOTUNIE" ;
      edtavTotvalue_totpze_Internalname = sPrefix+"vTOTVALUE_TOTPZE" ;
      edtavTotvalue_totunis_Internalname = sPrefix+"vTOTVALUE_TOTUNIS" ;
      edtavTotvalue_totpzu_Internalname = sPrefix+"vTOTVALUE_TOTPZU" ;
      edtavTotvalue_totunisal_Internalname = sPrefix+"vTOTVALUE_TOTUNISAL" ;
      edtavTotvalue_totpzsal_Internalname = sPrefix+"vTOTVALUE_TOTPZSAL" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible = -1 ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setJsonclick( "" );
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setEnabled( 0 );
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setVisible( -1 );
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Jsonclick = "" ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_totpzsal_Jsonclick = "" ;
      edtavTotvalue_totpzsal_Enabled = 1 ;
      edtavTotvalue_totunisal_Jsonclick = "" ;
      edtavTotvalue_totunisal_Enabled = 1 ;
      edtavTotvalue_totpzu_Jsonclick = "" ;
      edtavTotvalue_totpzu_Enabled = 1 ;
      edtavTotvalue_totunis_Jsonclick = "" ;
      edtavTotvalue_totunis_Enabled = 1 ;
      edtavTotvalue_totpze_Jsonclick = "" ;
      edtavTotvalue_totpze_Enabled = 1 ;
      edtavTotvalue_totunie_Jsonclick = "" ;
      edtavTotvalue_totunie_Enabled = 1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible = -1 ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setVisible( -1 );
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled = -1 ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setEnabled( -1 );
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled = -1 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled = -1 ;
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
      Ddo_grid_Columnssortvalues = "||||||||||" ;
      Ddo_grid_Columnids = "0:AlmacenTejidoencrudoClienteReferencia_SDT__Clicod|1:AlmacenTejidoencrudoClienteReferencia_SDT__CliNom|2:AlmacenTejidoencrudoClienteReferencia_SDT__Albref|3:AlmacenTejidoencrudoClienteReferencia_SDT__Albrefdsc|4:AlmacenTejidoencrudoClienteReferencia_SDT__AlbUni|5:AlmacenTejidoencrudoClienteReferencia_SDT__TotUniE|6:AlmacenTejidoencrudoClienteReferencia_SDT__TotPzE|7:AlmacenTejidoencrudoClienteReferencia_SDT__TotUniS|8:AlmacenTejidoencrudoClienteReferencia_SDT__TotPzU|9:AlmacenTejidoencrudoClienteReferencia_SDT__TotUniSal|10:AlmacenTejidoencrudoClienteReferencia_SDT__TotPzSal" ;
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
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI_" + sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setName( GXCCtl );
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setWebtags( "" );
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.getItemCount() > 0 )
      {
         if ( ( AV61GXV1 > 0 ) && ( AV9AlmacenTejidoencrudoClienteReferencia_SDT.size() >= AV61GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem)AV9AlmacenTejidoencrudoClienteReferencia_SDT.elementAt(-1+AV61GXV1)).getgxTv_SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem_Albuni())==0) )
         {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV9AlmacenTejidoencrudoClienteReferencia_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL',prop:'Visible'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV46TotValue_TotUniE',fld:'vTOTVALUE_TOTUNIE',pic:''},{av:'AV48TotValue_TotPzE',fld:'vTOTVALUE_TOTPZE',pic:''},{av:'AV50TotValue_TotUniS',fld:'vTOTVALUE_TOTUNIS',pic:''},{av:'AV52TotValue_TotPzU',fld:'vTOTVALUE_TOTPZU',pic:''},{av:'AV54TotValue_TotUniSal',fld:'vTOTVALUE_TOTUNISAL',pic:''},{av:'AV56TotValue_TotPzSal',fld:'vTOTVALUE_TOTPZSAL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132DG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV9AlmacenTejidoencrudoClienteReferencia_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142DG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV9AlmacenTejidoencrudoClienteReferencia_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202DG2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152DG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV9AlmacenTejidoencrudoClienteReferencia_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL',prop:'Visible'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV46TotValue_TotUniE',fld:'vTOTVALUE_TOTUNIE',pic:''},{av:'AV48TotValue_TotPzE',fld:'vTOTVALUE_TOTPZE',pic:''},{av:'AV50TotValue_TotUniS',fld:'vTOTVALUE_TOTUNIS',pic:''},{av:'AV52TotValue_TotPzU',fld:'vTOTVALUE_TOTPZU',pic:''},{av:'AV54TotValue_TotUniSal',fld:'vTOTVALUE_TOTUNISAL',pic:''},{av:'AV56TotValue_TotPzSal',fld:'vTOTVALUE_TOTPZSAL',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e122DG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV9AlmacenTejidoencrudoClienteReferencia_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__ALBUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTUNISAL',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDT__TOTPZSAL',prop:'Visible'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV45Tot_TotUniE',fld:'vTOT_TOTUNIE',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_TotPzE',fld:'vTOT_TOTPZE',pic:'ZZZZZ9',hsh:true},{av:'AV49Tot_TotUniS',fld:'vTOT_TOTUNIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPzU',fld:'vTOT_TOTPZU',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUniSal',fld:'vTOT_TOTUNISAL',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPzSal',fld:'vTOT_TOTPZSAL',pic:'ZZZZZ9',hsh:true},{av:'AV46TotValue_TotUniE',fld:'vTOTVALUE_TOTUNIE',pic:''},{av:'AV48TotValue_TotPzE',fld:'vTOTVALUE_TOTPZE',pic:''},{av:'AV50TotValue_TotUniS',fld:'vTOTVALUE_TOTUNIS',pic:''},{av:'AV52TotValue_TotPzU',fld:'vTOTVALUE_TOTPZU',pic:''},{av:'AV54TotValue_TotUniSal',fld:'vTOTVALUE_TOTUNISAL',pic:''},{av:'AV56TotValue_TotPzSal',fld:'vTOTVALUE_TOTPZSAL',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e112DG1',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV43Estado_a',fld:'vESTADO_A',pic:''}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV43Estado_a',fld:'vESTADO_A',pic:''},{av:'AV42Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV41Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV40TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV39Albrentf',fld:'vALBRENTF',pic:''},{av:'AV38Albrenti',fld:'vALBRENTI',pic:''},{av:'AV37AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV36AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV35UFecha',fld:'vUFECHA',pic:''},{av:'AV34Pfecha',fld:'vPFECHA',pic:''},{av:'AV33UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV32PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DG2',iparms:[{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e172DG2',iparms:[{av:'AV57AlmacenTejidoencrudoClienteReferencia_SDTJson',fld:'vALMACENTEJIDOENCRUDOCLIENTEREFERENCIA_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV6","{handler:'validv_Gxv6',iparms:[]");
      setEventMetadata("VALIDV_GXV6",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv12',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV34Pfecha = GXutil.nullDate() ;
      wcpOAV35UFecha = GXutil.nullDate() ;
      wcpOAV36AlbRef_i = "" ;
      wcpOAV37AlbRef_f = "" ;
      wcpOAV38Albrenti = "" ;
      wcpOAV39Albrentf = "" ;
      wcpOAV43Estado_a = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV34Pfecha = GXutil.nullDate() ;
      AV35UFecha = GXutil.nullDate() ;
      AV36AlbRef_i = "" ;
      AV37AlbRef_f = "" ;
      AV38Albrenti = "" ;
      AV39Albrentf = "" ;
      AV43Estado_a = "" ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV73Pgmname = "" ;
      AV16FilterFullText = "" ;
      AV9AlmacenTejidoencrudoClienteReferencia_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem>(app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem.class, "AlmacenTejidoencrudoClienteReferencia_SDTItem", "TexplusNET", remoteHandle);
      AV45Tot_TotUniE = DecimalUtil.ZERO ;
      AV49Tot_TotUniS = DecimalUtil.ZERO ;
      AV53Tot_TotUniSal = DecimalUtil.ZERO ;
      AV57AlmacenTejidoencrudoClienteReferencia_SDTJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
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
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV46TotValue_TotUniE = "" ;
      AV48TotValue_TotPzE = "" ;
      AV50TotValue_TotUniS = "" ;
      AV52TotValue_TotPzU = "" ;
      AV54TotValue_TotUniSal = "" ;
      AV56TotValue_TotPzSal = "" ;
      hsh = "" ;
      AV7Station = "" ;
      AV6EmprNom = "" ;
      AV8UsurCod = "" ;
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
      AV27WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext19 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV12ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV58websession = httpContext.getWebSession();
      AV15ExcelFilename = "" ;
      AV14ErrorMessage = "" ;
      GXv_char17 = new String[1] ;
      AV26UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char18 = new String[1] ;
      AV11ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection[1] ;
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV44AlmacenTejidoencrudoClienteReferencia_SDTItem = new app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV32PCliente = "" ;
      sCtrlAV33UCliente = "" ;
      sCtrlAV34Pfecha = "" ;
      sCtrlAV35UFecha = "" ;
      sCtrlAV36AlbRef_i = "" ;
      sCtrlAV37AlbRef_f = "" ;
      sCtrlAV38Albrenti = "" ;
      sCtrlAV39Albrentf = "" ;
      sCtrlAV40TipEntcodi = "" ;
      sCtrlAV41Tipartcod1 = "" ;
      sCtrlAV42Tipartcod2 = "" ;
      sCtrlAV43Estado_a = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV73Pgmname = "AlmacenTejidoencrudoClienteReferencia_WC" ;
      /* GeneXus formulas. */
      AV73Pgmname = "AlmacenTejidoencrudoClienteReferencia_WC" ;
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled = 0 ;
      cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni.setEnabled( 0 );
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled = 0 ;
      edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled = 0 ;
      edtavTotvalue_totunie_Enabled = 0 ;
      edtavTotvalue_totpze_Enabled = 0 ;
      edtavTotvalue_totunis_Enabled = 0 ;
      edtavTotvalue_totpzu_Enabled = 0 ;
      edtavTotvalue_totunisal_Enabled = 0 ;
      edtavTotvalue_totpzsal_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV22ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short wcpOAV40TipEntcodi ;
   private short wcpOAV41Tipartcod1 ;
   private short wcpOAV42Tipartcod2 ;
   private short AV40TipEntcodi ;
   private short AV41Tipartcod1 ;
   private short AV42Tipartcod2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private int wcpOAV32PCliente ;
   private int wcpOAV33UCliente ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV32PCliente ;
   private int AV33UCliente ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV61GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Enabled ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Enabled ;
   private int edtavTotvalue_totunie_Enabled ;
   private int edtavTotvalue_totpze_Enabled ;
   private int edtavTotvalue_totunis_Enabled ;
   private int edtavTotvalue_totpzu_Enabled ;
   private int edtavTotvalue_totunisal_Enabled ;
   private int edtavTotvalue_totpzsal_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Visible ;
   private int edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Visible ;
   private int AV24PageToGo ;
   private int AV74GXV13 ;
   private int AV75GXV14 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV47Tot_TotPzE ;
   private long AV51Tot_TotPzU ;
   private long AV55Tot_TotPzSal ;
   private long AV17GridCurrentPage ;
   private long AV18GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV45Tot_TotUniE ;
   private java.math.BigDecimal AV49Tot_TotUniS ;
   private java.math.BigDecimal AV53Tot_TotUniSal ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV36AlbRef_i ;
   private String wcpOAV37AlbRef_f ;
   private String wcpOAV38Albrenti ;
   private String wcpOAV39Albrentf ;
   private String wcpOAV43Estado_a ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV36AlbRef_i ;
   private String AV37AlbRef_f ;
   private String AV38Albrenti ;
   private String AV39Albrentf ;
   private String AV43Estado_a ;
   private String sGXsfl_43_idx="0001" ;
   private String AV73Pgmname ;
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
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Internalname ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Internalname ;
   private String edtavTotvalue_totunie_Internalname ;
   private String edtavTotvalue_totpze_Internalname ;
   private String edtavTotvalue_totunis_Internalname ;
   private String edtavTotvalue_totpzu_Internalname ;
   private String edtavTotvalue_totunisal_Internalname ;
   private String edtavTotvalue_totpzsal_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String AV7Station ;
   private String AV6EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char17[] ;
   private String GXt_char1 ;
   private String GXv_char18[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_totunie_Jsonclick ;
   private String edtavTotvalue_totpze_Jsonclick ;
   private String edtavTotvalue_totunis_Jsonclick ;
   private String edtavTotvalue_totpzu_Jsonclick ;
   private String edtavTotvalue_totunisal_Jsonclick ;
   private String edtavTotvalue_totpzsal_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV32PCliente ;
   private String sCtrlAV33UCliente ;
   private String sCtrlAV34Pfecha ;
   private String sCtrlAV35UFecha ;
   private String sCtrlAV36AlbRef_i ;
   private String sCtrlAV37AlbRef_f ;
   private String sCtrlAV38Albrenti ;
   private String sCtrlAV39Albrentf ;
   private String sCtrlAV40TipEntcodi ;
   private String sCtrlAV41Tipartcod1 ;
   private String sCtrlAV42Tipartcod2 ;
   private String sCtrlAV43Estado_a ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__clicod_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__clinom_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__albref_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__albrefdsc_Jsonclick ;
   private String GXCCtl ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunie_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpze_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunis_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpzu_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totunisal_Jsonclick ;
   private String edtavAlmacentejidoencrudoclientereferencia_sdt__totpzsal_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV34Pfecha ;
   private java.util.Date wcpOAV35UFecha ;
   private java.util.Date AV34Pfecha ;
   private java.util.Date AV35UFecha ;
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
   private boolean gx_BV43 ;
   private boolean gx_refresh_fired ;
   private String AV57AlmacenTejidoencrudoClienteReferencia_SDTJson ;
   private String AV12ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV26UserCustomValue ;
   private String AV16FilterFullText ;
   private String AV46TotValue_TotUniE ;
   private String AV48TotValue_TotPzE ;
   private String AV50TotValue_TotUniS ;
   private String AV52TotValue_TotPzU ;
   private String AV54TotValue_TotUniSal ;
   private String AV56TotValue_TotPzSal ;
   private String AV15ExcelFilename ;
   private String AV14ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlmacentejidoencrudoclientereferencia_sdt__albuni ;
   private com.genexus.webpanels.WebSession AV58websession ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> AV9AlmacenTejidoencrudoClienteReferencia_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[] ;
   private app.SdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem AV44AlmacenTejidoencrudoClienteReferencia_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV27WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext19[] ;
}

