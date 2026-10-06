package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudodetalle_wc_impl extends GXWebComponent
{
   public almacentejidoencrudodetalle_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoencrudodetalle_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudodetalle_wc_impl.class ));
   }

   public almacentejidoencrudodetalle_wc_impl( int remoteHandle ,
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
      cmbavAlmacentejidoencrudodetalle_sdt__albruni = new HTMLChoice();
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
               AV43EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
               AV42PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PCliente), 6, 0));
               AV44UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44UCliente), 6, 0));
               AV45PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PFecha", localUtil.format(AV45PFecha, "99/99/99"));
               AV46UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46UFecha", localUtil.format(AV46UFecha, "99/99/99"));
               AV47AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbRef_i", AV47AlbRef_i);
               AV48AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbRef_f", AV48AlbRef_f);
               AV49Estado_a = httpContext.GetPar( "Estado_a") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Estado_a", AV49Estado_a);
               AV50Albrenti = httpContext.GetPar( "Albrenti") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Albrenti", AV50Albrenti);
               AV51Albrentf = httpContext.GetPar( "Albrentf") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Albrentf", AV51Albrentf);
               AV52TipENtcodi = (short)(GXutil.lval( httpContext.GetPar( "TipENtcodi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TipENtcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TipENtcodi), 4, 0));
               AV53Procodi = (short)(GXutil.lval( httpContext.GetPar( "Procodi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Procodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Procodi), 4, 0));
               AV54Procodf = (short)(GXutil.lval( httpContext.GetPar( "Procodf"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Procodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Procodf), 4, 0));
               AV55trnCodi = (short)(GXutil.lval( httpContext.GetPar( "trnCodi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55trnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55trnCodi), 4, 0));
               AV56TrnCodf = (short)(GXutil.lval( httpContext.GetPar( "TrnCodf"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TrnCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TrnCodf), 4, 0));
               AV57Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Tipartcod1), 4, 0));
               AV58Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Tipartcod2), 4, 0));
               AV59Unidad = httpContext.GetPar( "Unidad") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Unidad", AV59Unidad);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV43EmprCod,Integer.valueOf(AV42PCliente),Integer.valueOf(AV44UCliente),AV45PFecha,AV46UFecha,AV47AlbRef_i,AV48AlbRef_f,AV49Estado_a,AV50Albrenti,AV51Albrentf,Short.valueOf(AV52TipENtcodi),Short.valueOf(AV53Procodi),Short.valueOf(AV54Procodf),Short.valueOf(AV55trnCodi),Short.valueOf(AV56TrnCodf),Short.valueOf(AV57Tipartcod1),Short.valueOf(AV58Tipartcod2),AV59Unidad});
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV87Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV43EmprCod = httpContext.GetPar( "EmprCod") ;
      AV42PCliente = (int)(GXutil.lval( httpContext.GetPar( "PCliente"))) ;
      AV44UCliente = (int)(GXutil.lval( httpContext.GetPar( "UCliente"))) ;
      AV45PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
      AV46UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
      AV47AlbRef_i = httpContext.GetPar( "AlbRef_i") ;
      AV48AlbRef_f = httpContext.GetPar( "AlbRef_f") ;
      AV49Estado_a = httpContext.GetPar( "Estado_a") ;
      AV50Albrenti = httpContext.GetPar( "Albrenti") ;
      AV51Albrentf = httpContext.GetPar( "Albrentf") ;
      AV52TipENtcodi = (short)(GXutil.lval( httpContext.GetPar( "TipENtcodi"))) ;
      AV53Procodi = (short)(GXutil.lval( httpContext.GetPar( "Procodi"))) ;
      AV54Procodf = (short)(GXutil.lval( httpContext.GetPar( "Procodf"))) ;
      AV55trnCodi = (short)(GXutil.lval( httpContext.GetPar( "trnCodi"))) ;
      AV56TrnCodf = (short)(GXutil.lval( httpContext.GetPar( "TrnCodf"))) ;
      AV57Tipartcod1 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod1"))) ;
      AV58Tipartcod2 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod2"))) ;
      AV59Unidad = httpContext.GetPar( "Unidad") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13AlmacenTejidoencrudoDetalle_SDT);
      AV30Tot_albrunient = CommonUtil.decimalVal( httpContext.GetPar( "Tot_albrunient"), ".") ;
      AV32Tot_albrpieent = GXutil.lval( httpContext.GetPar( "Tot_albrpieent")) ;
      AV34Tot_albruniuti = CommonUtil.decimalVal( httpContext.GetPar( "Tot_albruniuti"), ".") ;
      AV36Tot_albrpieuti = GXutil.lval( httpContext.GetPar( "Tot_albrpieuti")) ;
      AV38Tot_albrunidis = CommonUtil.decimalVal( httpContext.GetPar( "Tot_albrunidis"), ".") ;
      AV40Tot_albrpiedis = GXutil.lval( httpContext.GetPar( "Tot_albrpiedis")) ;
      AV60AlmacenTejidoencrudoDetalle_SDTJson = httpContext.GetPar( "AlmacenTejidoencrudoDetalle_SDTJson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Almacen Tejido en crudo (Detalle)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacentejidoencrudodetalle_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV42PCliente,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44UCliente,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV45PFecha)),GXutil.URLEncode(GXutil.formatDateParm(AV46UFecha)),GXutil.URLEncode(GXutil.rtrim(AV47AlbRef_i)),GXutil.URLEncode(GXutil.rtrim(AV48AlbRef_f)),GXutil.URLEncode(GXutil.rtrim(AV49Estado_a)),GXutil.URLEncode(GXutil.rtrim(AV50Albrenti)),GXutil.URLEncode(GXutil.rtrim(AV51Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV52TipENtcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53Procodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54Procodf,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55trnCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56TrnCodf,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57Tipartcod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58Tipartcod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV59Unidad))}, new String[] {"EmprCod","PCliente","UCliente","PFecha","UFecha","AlbRef_i","AlbRef_f","Estado_a","Albrenti","Albrentf","TipENtcodi","Procodi","Procodf","trnCodi","TrnCodf","Tipartcod1","Tipartcod2","Unidad"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoDetalle_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIENT", getSecureSignedToken( sPrefix, localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIUTI", getSecureSignedToken( sPrefix, localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEUTI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIDIS", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEDIS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDTJSON", getSecureSignedToken( sPrefix, AV60AlmacenTejidoencrudoDetalle_SDTJson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoDetalle_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudodetalle_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Almacentejidoencrudodetalle_sdt", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Almacentejidoencrudodetalle_sdt", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Almacentejidoencrudodetalle_sdt", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoDetalle_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43EmprCod", GXutil.rtrim( wcpOAV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42PCliente", GXutil.ltrim( localUtil.ntoc( wcpOAV42PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44UCliente", GXutil.ltrim( localUtil.ntoc( wcpOAV44UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45PFecha", localUtil.dtoc( wcpOAV45PFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46UFecha", localUtil.dtoc( wcpOAV46UFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47AlbRef_i", GXutil.rtrim( wcpOAV47AlbRef_i));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48AlbRef_f", GXutil.rtrim( wcpOAV48AlbRef_f));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49Estado_a", GXutil.rtrim( wcpOAV49Estado_a));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50Albrenti", GXutil.rtrim( wcpOAV50Albrenti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51Albrentf", GXutil.rtrim( wcpOAV51Albrentf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52TipENtcodi", GXutil.ltrim( localUtil.ntoc( wcpOAV52TipENtcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53Procodi", GXutil.ltrim( localUtil.ntoc( wcpOAV53Procodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54Procodf", GXutil.ltrim( localUtil.ntoc( wcpOAV54Procodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55trnCodi", GXutil.ltrim( localUtil.ntoc( wcpOAV55trnCodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56TrnCodf", GXutil.ltrim( localUtil.ntoc( wcpOAV56TrnCodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57Tipartcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV57Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Tipartcod2", GXutil.ltrim( localUtil.ntoc( wcpOAV58Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Unidad", GXutil.rtrim( wcpOAV59Unidad));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCLIENTE", GXutil.ltrim( localUtil.ntoc( AV42PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUCLIENTE", GXutil.ltrim( localUtil.ntoc( AV44UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPFECHA", localUtil.dtoc( AV45PFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUFECHA", localUtil.dtoc( AV46UFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_I", GXutil.rtrim( AV47AlbRef_i));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_F", GXutil.rtrim( AV48AlbRef_f));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTADO_A", GXutil.rtrim( AV49Estado_a));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTI", GXutil.rtrim( AV50Albrenti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTF", GXutil.rtrim( AV51Albrentf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCODI", GXutil.ltrim( localUtil.ntoc( AV52TipENtcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCODI", GXutil.ltrim( localUtil.ntoc( AV53Procodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCODF", GXutil.ltrim( localUtil.ntoc( AV54Procodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRNCODI", GXutil.ltrim( localUtil.ntoc( AV55trnCodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTRNCODF", GXutil.ltrim( localUtil.ntoc( AV56TrnCodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV57Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD2", GXutil.ltrim( localUtil.ntoc( AV58Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUNIDAD", GXutil.rtrim( AV59Unidad));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDT", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDT", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoDetalle_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV30Tot_albrunient, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIENT", getSecureSignedToken( sPrefix, localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV32Tot_albrpieent, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV34Tot_albruniuti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIUTI", getSecureSignedToken( sPrefix, localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV36Tot_albrpieuti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEUTI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV38Tot_albrunidis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIDIS", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV40Tot_albrpiedis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEDIS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDTJSON", AV60AlmacenTejidoencrudoDetalle_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDTJSON", getSecureSignedToken( sPrefix, AV60AlmacenTejidoencrudoDetalle_SDTJson));
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

   public void renderHtmlCloseForm2DI2( )
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
      return "AlmacenTejidoencrudoDetalle_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido en crudo (Detalle)", "") ;
   }

   public void wb2DI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.almacentejidoencrudodetalle_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112di1_client"+"'", TempTags, "", 2, "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_2DI2( true) ;
      }
      else
      {
         wb_table1_25_2DI2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_2DI2e( boolean wbgen )
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
            AV67GXV1 = nGXsfl_43_idx ;
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
         wb_table2_65_2DI2( true) ;
      }
      else
      {
         wb_table2_65_2DI2( false) ;
      }
      return  ;
   }

   public void wb_table2_65_2DI2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV87Pgmname), GXutil.rtrim( localUtil.format( AV87Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
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
               AV67GXV1 = nGXsfl_43_idx ;
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

   public void start2DI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido en crudo (Detalle)", ""), (short)(0)) ;
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
            strup2DI0( ) ;
         }
      }
   }

   public void ws2DI2( )
   {
      start2DI2( ) ;
      evt2DI2( ) ;
   }

   public void evt2DI2( )
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
                              strup2DI0( ) ;
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
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e162DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e172DI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DI0( ) ;
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
                              strup2DI0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV67GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13AlmacenTejidoencrudoDetalle_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
                           {
                              AV13AlmacenTejidoencrudoDetalle_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)) );
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
                                       e182DI2 ();
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
                                       e192DI2 ();
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
                                       e202DI2 ();
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
                                    strup2DI0( ) ;
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

   public void we2DI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DI2( ) ;
         }
      }
   }

   public void pa2DI2( )
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
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV87Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV43EmprCod ,
                                 int AV42PCliente ,
                                 int AV44UCliente ,
                                 java.util.Date AV45PFecha ,
                                 java.util.Date AV46UFecha ,
                                 String AV47AlbRef_i ,
                                 String AV48AlbRef_f ,
                                 String AV49Estado_a ,
                                 String AV50Albrenti ,
                                 String AV51Albrentf ,
                                 short AV52TipENtcodi ,
                                 short AV53Procodi ,
                                 short AV54Procodf ,
                                 short AV55trnCodi ,
                                 short AV56TrnCodf ,
                                 short AV57Tipartcod1 ,
                                 short AV58Tipartcod2 ,
                                 String AV59Unidad ,
                                 GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> AV13AlmacenTejidoencrudoDetalle_SDT ,
                                 java.math.BigDecimal AV30Tot_albrunient ,
                                 long AV32Tot_albrpieent ,
                                 java.math.BigDecimal AV34Tot_albruniuti ,
                                 long AV36Tot_albrpieuti ,
                                 java.math.BigDecimal AV38Tot_albrunidis ,
                                 long AV40Tot_albrpiedis ,
                                 String AV60AlmacenTejidoencrudoDetalle_SDTJson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192DI2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DI2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoDetalle_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudodetalle_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV87Pgmname = "AlmacenTejidoencrudoDetalle_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87Pgmname", AV87Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudodetalle_sdt__albruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrunient_Enabled), 5, 0), true);
      edtavTotvalue_albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpieent_Enabled), 5, 0), true);
      edtavTotvalue_albruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albruniuti_Enabled), 5, 0), true);
      edtavTotvalue_albrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpieuti_Enabled), 5, 0), true);
      edtavTotvalue_albrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrunidis_Enabled), 5, 0), true);
      edtavTotvalue_albrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpiedis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e192DI2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_432( ) ;
         e202DI2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e202DI2 ();
         }
         wbEnd = (short)(43) ;
         wb2DI0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DI2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDT", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDT", AV13AlmacenTejidoencrudoDetalle_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoDetalle_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV30Tot_albrunient, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIENT", getSecureSignedToken( sPrefix, localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV32Tot_albrpieent, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV34Tot_albruniuti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIUTI", getSecureSignedToken( sPrefix, localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV36Tot_albrpieuti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEUTI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV38Tot_albrunidis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIDIS", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV40Tot_albrpiedis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEDIS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDTJSON", AV60AlmacenTejidoencrudoDetalle_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDTJSON", getSecureSignedToken( sPrefix, AV60AlmacenTejidoencrudoDetalle_SDTJson));
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
      return AV13AlmacenTejidoencrudoDetalle_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV87Pgmname, AV12FilterFullText, AV43EmprCod, AV42PCliente, AV44UCliente, AV45PFecha, AV46UFecha, AV47AlbRef_i, AV48AlbRef_f, AV49Estado_a, AV50Albrenti, AV51Albrentf, AV52TipENtcodi, AV53Procodi, AV54Procodf, AV55trnCodi, AV56TrnCodf, AV57Tipartcod1, AV58Tipartcod2, AV59Unidad, AV13AlmacenTejidoencrudoDetalle_SDT, AV30Tot_albrunient, AV32Tot_albrpieent, AV34Tot_albruniuti, AV36Tot_albrpieuti, AV38Tot_albrunidis, AV40Tot_albrpiedis, AV60AlmacenTejidoencrudoDetalle_SDTJson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV87Pgmname = "AlmacenTejidoencrudoDetalle_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87Pgmname", AV87Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudodetalle_sdt__albruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_albrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrunient_Enabled), 5, 0), true);
      edtavTotvalue_albrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpieent_Enabled), 5, 0), true);
      edtavTotvalue_albruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albruniuti_Enabled), 5, 0), true);
      edtavTotvalue_albrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpieuti_Enabled), 5, 0), true);
      edtavTotvalue_albrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrunidis_Enabled), 5, 0), true);
      edtavTotvalue_albrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_albrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albrpiedis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182DI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Almacentejidoencrudodetalle_sdt"), AV13AlmacenTejidoencrudoDetalle_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vALMACENTEJIDOENCRUDODETALLE_SDT"), AV13AlmacenTejidoencrudoDetalle_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV43EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV43EmprCod") ;
         wcpOAV42PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42PCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44UCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV45PFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV45PFecha"), 0) ;
         wcpOAV46UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV46UFecha"), 0) ;
         wcpOAV47AlbRef_i = httpContext.cgiGet( sPrefix+"wcpOAV47AlbRef_i") ;
         wcpOAV48AlbRef_f = httpContext.cgiGet( sPrefix+"wcpOAV48AlbRef_f") ;
         wcpOAV49Estado_a = httpContext.cgiGet( sPrefix+"wcpOAV49Estado_a") ;
         wcpOAV50Albrenti = httpContext.cgiGet( sPrefix+"wcpOAV50Albrenti") ;
         wcpOAV51Albrentf = httpContext.cgiGet( sPrefix+"wcpOAV51Albrentf") ;
         wcpOAV52TipENtcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52TipENtcodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV53Procodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Procodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV54Procodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54Procodf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV55trnCodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55trnCodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV56TrnCodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56TrnCodf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Tipartcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Tipartcod2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59Unidad = httpContext.cgiGet( sPrefix+"wcpOAV59Unidad") ;
         AV59Unidad = httpContext.cgiGet( sPrefix+"vUNIDAD") ;
         AV58Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCOD2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV57Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCOD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56TrnCodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTRNCODF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV55trnCodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTRNCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54Procodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vPROCODF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53Procodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vPROCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52TipENtcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPENTCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51Albrentf = httpContext.cgiGet( sPrefix+"vALBRENTF") ;
         AV50Albrenti = httpContext.cgiGet( sPrefix+"vALBRENTI") ;
         AV49Estado_a = httpContext.cgiGet( sPrefix+"vESTADO_A") ;
         AV48AlbRef_f = httpContext.cgiGet( sPrefix+"vALBREF_F") ;
         AV47AlbRef_i = httpContext.cgiGet( sPrefix+"vALBREF_I") ;
         AV46UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"vUFECHA"), 0) ;
         AV45PFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"vPFECHA"), 0) ;
         AV44UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vUCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vPCLIENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
            AV67GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13AlmacenTejidoencrudoDetalle_SDT.size() >= AV67GXV1 ) && ( AV67GXV1 > 0 ) )
            {
               AV13AlmacenTejidoencrudoDetalle_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)) );
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
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV31TotValue_albrunient = httpContext.cgiGet( edtavTotvalue_albrunient_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TotValue_albrunient", AV31TotValue_albrunient);
         AV33TotValue_albrpieent = httpContext.cgiGet( edtavTotvalue_albrpieent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TotValue_albrpieent", AV33TotValue_albrpieent);
         AV35TotValue_albruniuti = httpContext.cgiGet( edtavTotvalue_albruniuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TotValue_albruniuti", AV35TotValue_albruniuti);
         AV37TotValue_albrpieuti = httpContext.cgiGet( edtavTotvalue_albrpieuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TotValue_albrpieuti", AV37TotValue_albrpieuti);
         AV39TotValue_albrunidis = httpContext.cgiGet( edtavTotvalue_albrunidis_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TotValue_albrunidis", AV39TotValue_albrunidis);
         AV41TotValue_albrpiedis = httpContext.cgiGet( edtavTotvalue_albrpiedis_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_albrpiedis", AV41TotValue_albrpiedis);
         AV87Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87Pgmname", AV87Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoDetalle_WC");
         AV87Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87Pgmname", AV87Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacentejidoencrudodetalle_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182DI2 ();
      if (returnInSub) return;
   }

   public void e182DI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV61Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoencrudodetalle_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Station = GXt_char1 ;
      GXv_char2[0] = AV43EmprCod ;
      GXv_char3[0] = AV62EmprNom ;
      GXv_char4[0] = AV63UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoencrudodetalle_wc_impl.this.AV43EmprCod = GXv_char2[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV62EmprNom = GXv_char3[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV63UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV60AlmacenTejidoencrudoDetalle_SDTJson ;
      GXv_char4[0] = AV43EmprCod ;
      GXv_char3[0] = " " ;
      GXv_int7[0] = AV42PCliente ;
      GXv_int8[0] = AV44UCliente ;
      GXv_date9[0] = AV45PFecha ;
      GXv_date10[0] = AV46UFecha ;
      GXv_char2[0] = AV47AlbRef_i ;
      GXv_char11[0] = AV48AlbRef_f ;
      GXv_char12[0] = AV49Estado_a ;
      GXv_char13[0] = AV50Albrenti ;
      GXv_char14[0] = AV51Albrentf ;
      GXv_int15[0] = AV52TipENtcodi ;
      GXv_int16[0] = AV53Procodi ;
      GXv_int17[0] = AV54Procodf ;
      GXv_int18[0] = AV55trnCodi ;
      GXv_int19[0] = AV56TrnCodf ;
      GXv_int20[0] = AV57Tipartcod1 ;
      GXv_int21[0] = AV58Tipartcod2 ;
      GXv_char22[0] = AV59Unidad ;
      GXv_char23[0] = GXt_char1 ;
      new app.almacentejidoencrudodetalle_prc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char2, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_char22, GXv_char23) ;
      almacentejidoencrudodetalle_wc_impl.this.AV43EmprCod = GXv_char4[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV42PCliente = GXv_int7[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV44UCliente = GXv_int8[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV45PFecha = GXv_date9[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV46UFecha = GXv_date10[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV47AlbRef_i = GXv_char2[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV48AlbRef_f = GXv_char11[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV49Estado_a = GXv_char12[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV50Albrenti = GXv_char13[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV51Albrentf = GXv_char14[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV52TipENtcodi = GXv_int15[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV53Procodi = GXv_int16[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV54Procodf = GXv_int17[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV55trnCodi = GXv_int18[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV56TrnCodf = GXv_int19[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV57Tipartcod1 = GXv_int20[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV58Tipartcod2 = GXv_int21[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV59Unidad = GXv_char22[0] ;
      almacentejidoencrudodetalle_wc_impl.this.GXt_char1 = GXv_char23[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44UCliente), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PFecha", localUtil.format(AV45PFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46UFecha", localUtil.format(AV46UFecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbRef_i", AV47AlbRef_i);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbRef_f", AV48AlbRef_f);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Estado_a", AV49Estado_a);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Albrenti", AV50Albrenti);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Albrentf", AV51Albrentf);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TipENtcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TipENtcodi), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Procodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Procodi), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Procodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Procodf), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55trnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55trnCodi), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TrnCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TrnCodf), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Tipartcod1), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Tipartcod2), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Unidad", AV59Unidad);
      AV60AlmacenTejidoencrudoDetalle_SDTJson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AlmacenTejidoencrudoDetalle_SDTJson", AV60AlmacenTejidoencrudoDetalle_SDTJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDODETALLE_SDTJSON", getSecureSignedToken( sPrefix, AV60AlmacenTejidoencrudoDetalle_SDTJson));
      AV13AlmacenTejidoencrudoDetalle_SDT.fromJSonString(AV60AlmacenTejidoencrudoDetalle_SDTJson, null);
      gx_BV43 = true ;
   }

   public void e192DI2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext24[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext24) ;
      AV6WWPContext = GXv_SdtWWPContext24[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("AlmacenTejidoencrudoDetalle_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albref_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albref_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudodetalle_sdt__albruni.getInternalname(), "Visible", GXutil.ltrimstr( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e132DI2( )
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

   public void e142DI2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202DI2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV13AlmacenTejidoencrudoDetalle_SDT.size() )
      {
         AV13AlmacenTejidoencrudoDetalle_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)) );
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
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void e152DI2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoDetalle_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DI2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoDetalle_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV87Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoDetalle_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char23[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AlmacenTejidoencrudoDetalle_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char23) ;
         almacentejidoencrudodetalle_wc_impl.this.GXt_char1 = GXv_char23[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e162DI2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV64websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoDetalle_SDT", ""), AV60AlmacenTejidoencrudoDetalle_SDTJson);
      GXv_char23[0] = AV14ExcelFilename ;
      GXv_char22[0] = AV15ErrorMessage ;
      new app.almacentejidoencrudodetalle_wcexport(remoteHandle, context).execute( GXv_char23, GXv_char22) ;
      almacentejidoencrudodetalle_wc_impl.this.AV14ExcelFilename = GXv_char23[0] ;
      almacentejidoencrudodetalle_wc_impl.this.AV15ErrorMessage = GXv_char22[0] ;
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

   public void e172DI2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV64websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoDetalle_SDT", ""), AV60AlmacenTejidoencrudoDetalle_SDTJson);
      callWebObject(formatLink("app.almacentejidoencrudodetalle_wcexportcsv", new String[] {}, new String[] {}) );
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
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albref", "", "Referencia", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrefdsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albreccod", "", "N Recepcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrfen", "", "Fecha Entrada", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrent2", "", "Nº Albaran", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albruni", "", "Unidad", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrunient", "", "Unds. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrpieent", "", "Pzs. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albruniuti", "", "Unds. Uti.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrpieuti", "", "Pzs. Uti.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrunidis", "", "Unds. Disp.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrpiedis", "", "Pzs. Disp.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__ProceCod", "", "Procedencia", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__Procenom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__trncod", "", "Transportista", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__trnnom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXv_SdtWWPColumnsSelector25[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, "AlmacenTejidoencrudoDetalle_SDT__albrloc", "", "Localizacion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector25[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char23[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoDetalle_WCColumnsSelector", GXv_char23) ;
      almacentejidoencrudodetalle_wc_impl.this.GXt_char1 = GXv_char23[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector25[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector26[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector25, GXv_SdtWWPColumnsSelector26) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector25[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector26[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item28[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AlmacenTejidoencrudoDetalle_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item28) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item28[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV87Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV87Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV87Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV88GXV21 = 1 ;
      while ( AV88GXV21 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV21));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV88GXV21 = (int)(AV88GXV21+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV87Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      if ( ! (GXutil.strcmp("", AV43EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV42PCliente) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV42PCliente, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV44UCliente) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV44UCliente, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45PFecha)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PFECHA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV45PFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46UFecha)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UFECHA" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV46UFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47AlbRef_i)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_I" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47AlbRef_i );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV48AlbRef_f)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_F" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48AlbRef_f );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV49Estado_a)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ESTADO_A" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV49Estado_a );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV50Albrenti)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50Albrenti );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV51Albrentf)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV51Albrentf );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52TipENtcodi) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPENTCODI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52TipENtcodi, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV53Procodi) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCODI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV53Procodi, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54Procodf) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCODF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54Procodf, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV55trnCodi) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TRNCODI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55trnCodi, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV56TrnCodf) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TRNCODF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56TrnCodf, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57Tipartcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57Tipartcod1, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58Tipartcod2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58Tipartcod2, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59Unidad)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&UNIDAD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59Unidad );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV30Tot_albrunient = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Tot_albrunient", GXutil.ltrimstr( AV30Tot_albrunient, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIENT", getSecureSignedToken( sPrefix, localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99")));
      AV32Tot_albrpieent = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tot_albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Tot_albrpieent), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9")));
      AV34Tot_albruniuti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Tot_albruniuti", GXutil.ltrimstr( AV34Tot_albruniuti, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIUTI", getSecureSignedToken( sPrefix, localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99")));
      AV36Tot_albrpieuti = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tot_albrpieuti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEUTI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9")));
      AV38Tot_albrunidis = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Tot_albrunidis", GXutil.ltrimstr( AV38Tot_albrunidis, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIDIS", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99")));
      AV40Tot_albrpiedis = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEDIS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV89GXV22 = 1 ;
      while ( AV89GXV22 <= AV13AlmacenTejidoencrudoDetalle_SDT.size() )
      {
         AV29AlmacenTejidoencrudoDetalle_SDTItem = (app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV89GXV22));
         AV30Tot_albrunient = AV30Tot_albrunient.add((AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Tot_albrunient", GXutil.ltrimstr( AV30Tot_albrunient, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIENT", getSecureSignedToken( sPrefix, localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99")));
         AV32Tot_albrpieent = (long)(AV32Tot_albrpieent+(AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tot_albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Tot_albrpieent), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEENT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9")));
         AV34Tot_albruniuti = AV34Tot_albruniuti.add((AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Tot_albruniuti", GXutil.ltrimstr( AV34Tot_albruniuti, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIUTI", getSecureSignedToken( sPrefix, localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99")));
         AV36Tot_albrpieuti = (long)(AV36Tot_albrpieuti+(AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tot_albrpieuti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEUTI", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9")));
         AV38Tot_albrunidis = AV38Tot_albrunidis.add((AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Tot_albrunidis", GXutil.ltrimstr( AV38Tot_albrunidis, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRUNIDIS", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99")));
         AV40Tot_albrpiedis = (long)(AV40Tot_albrpiedis+(AV29AlmacenTejidoencrudoDetalle_SDTItem.getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_albrpiedis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_ALBRPIEDIS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9")));
         AV89GXV22 = (int)(AV89GXV22+1) ;
      }
      AV31TotValue_albrunient = localUtil.format( AV30Tot_albrunient, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TotValue_albrunient", AV31TotValue_albrunient);
      AV33TotValue_albrpieent = localUtil.format( DecimalUtil.doubleToDec(AV32Tot_albrpieent), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TotValue_albrpieent", AV33TotValue_albrpieent);
      AV35TotValue_albruniuti = localUtil.format( AV34Tot_albruniuti, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TotValue_albruniuti", AV35TotValue_albruniuti);
      AV37TotValue_albrpieuti = localUtil.format( DecimalUtil.doubleToDec(AV36Tot_albrpieuti), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TotValue_albrpieuti", AV37TotValue_albrpieuti);
      AV39TotValue_albrunidis = localUtil.format( AV38Tot_albrunidis, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TotValue_albrunidis", AV39TotValue_albrunidis);
      AV41TotValue_albrpiedis = localUtil.format( DecimalUtil.doubleToDec(AV40Tot_albrpiedis), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_albrpiedis", AV41TotValue_albrpiedis);
   }

   public void wb_table2_65_2DI2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albrunient_Internalname, httpContext.getMessage( "Tot Value_albrunient", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albrunient_Internalname, AV31TotValue_albrunient, GXutil.rtrim( localUtil.format( AV31TotValue_albrunient, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albrunient_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albrunient_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albrpieent_Internalname, httpContext.getMessage( "Tot Value_albrpieent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albrpieent_Internalname, AV33TotValue_albrpieent, GXutil.rtrim( localUtil.format( AV33TotValue_albrpieent, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albrpieent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albrpieent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albruniuti_Internalname, httpContext.getMessage( "Tot Value_albruniuti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albruniuti_Internalname, AV35TotValue_albruniuti, GXutil.rtrim( localUtil.format( AV35TotValue_albruniuti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albruniuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albruniuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albrpieuti_Internalname, httpContext.getMessage( "Tot Value_albrpieuti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albrpieuti_Internalname, AV37TotValue_albrpieuti, GXutil.rtrim( localUtil.format( AV37TotValue_albrpieuti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albrpieuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albrpieuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albrunidis_Internalname, httpContext.getMessage( "Tot Value_albrunidis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albrunidis_Internalname, AV39TotValue_albrunidis, GXutil.rtrim( localUtil.format( AV39TotValue_albrunidis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albrunidis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albrunidis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albrpiedis_Internalname, httpContext.getMessage( "Tot Value_albrpiedis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albrpiedis_Internalname, AV41TotValue_albrpiedis, GXutil.rtrim( localUtil.format( AV41TotValue_albrpiedis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albrpiedis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albrpiedis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_65_2DI2e( true) ;
      }
      else
      {
         wb_table2_65_2DI2e( false) ;
      }
   }

   public void wb_table1_25_2DI2( boolean wbgen )
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
         wb_table3_30_2DI2( true) ;
      }
      else
      {
         wb_table3_30_2DI2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_2DI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_2DI2e( true) ;
      }
      else
      {
         wb_table1_25_2DI2e( false) ;
      }
   }

   public void wb_table3_30_2DI2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AlmacenTejidoencrudoDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_2DI2e( true) ;
      }
      else
      {
         wb_table3_30_2DI2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV43EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      AV42PCliente = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PCliente), 6, 0));
      AV44UCliente = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44UCliente), 6, 0));
      AV45PFecha = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PFecha", localUtil.format(AV45PFecha, "99/99/99"));
      AV46UFecha = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46UFecha", localUtil.format(AV46UFecha, "99/99/99"));
      AV47AlbRef_i = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbRef_i", AV47AlbRef_i);
      AV48AlbRef_f = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbRef_f", AV48AlbRef_f);
      AV49Estado_a = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Estado_a", AV49Estado_a);
      AV50Albrenti = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Albrenti", AV50Albrenti);
      AV51Albrentf = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Albrentf", AV51Albrentf);
      AV52TipENtcodi = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TipENtcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TipENtcodi), 4, 0));
      AV53Procodi = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Procodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Procodi), 4, 0));
      AV54Procodf = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Procodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Procodf), 4, 0));
      AV55trnCodi = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55trnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55trnCodi), 4, 0));
      AV56TrnCodf = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TrnCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TrnCodf), 4, 0));
      AV57Tipartcod1 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Tipartcod1), 4, 0));
      AV58Tipartcod2 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Tipartcod2), 4, 0));
      AV59Unidad = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Unidad", AV59Unidad);
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
      pa2DI2( ) ;
      ws2DI2( ) ;
      we2DI2( ) ;
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
      sCtrlAV43EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV42PCliente = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV44UCliente = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV45PFecha = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV46UFecha = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV47AlbRef_i = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV48AlbRef_f = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV49Estado_a = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV50Albrenti = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV51Albrentf = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV52TipENtcodi = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV53Procodi = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV54Procodf = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV55trnCodi = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV56TrnCodf = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV57Tipartcod1 = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV58Tipartcod2 = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV59Unidad = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "almacentejidoencrudodetalle_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV43EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
         AV42PCliente = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PCliente), 6, 0));
         AV44UCliente = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44UCliente), 6, 0));
         AV45PFecha = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PFecha", localUtil.format(AV45PFecha, "99/99/99"));
         AV46UFecha = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46UFecha", localUtil.format(AV46UFecha, "99/99/99"));
         AV47AlbRef_i = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbRef_i", AV47AlbRef_i);
         AV48AlbRef_f = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbRef_f", AV48AlbRef_f);
         AV49Estado_a = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Estado_a", AV49Estado_a);
         AV50Albrenti = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Albrenti", AV50Albrenti);
         AV51Albrentf = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Albrentf", AV51Albrentf);
         AV52TipENtcodi = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TipENtcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TipENtcodi), 4, 0));
         AV53Procodi = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Procodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Procodi), 4, 0));
         AV54Procodf = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Procodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Procodf), 4, 0));
         AV55trnCodi = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55trnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55trnCodi), 4, 0));
         AV56TrnCodf = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TrnCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TrnCodf), 4, 0));
         AV57Tipartcod1 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Tipartcod1), 4, 0));
         AV58Tipartcod2 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Tipartcod2), 4, 0));
         AV59Unidad = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Unidad", AV59Unidad);
      }
      wcpOAV43EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV43EmprCod") ;
      wcpOAV42PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42PCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44UCliente"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV45PFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV45PFecha"), 0) ;
      wcpOAV46UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV46UFecha"), 0) ;
      wcpOAV47AlbRef_i = httpContext.cgiGet( sPrefix+"wcpOAV47AlbRef_i") ;
      wcpOAV48AlbRef_f = httpContext.cgiGet( sPrefix+"wcpOAV48AlbRef_f") ;
      wcpOAV49Estado_a = httpContext.cgiGet( sPrefix+"wcpOAV49Estado_a") ;
      wcpOAV50Albrenti = httpContext.cgiGet( sPrefix+"wcpOAV50Albrenti") ;
      wcpOAV51Albrentf = httpContext.cgiGet( sPrefix+"wcpOAV51Albrentf") ;
      wcpOAV52TipENtcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52TipENtcodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV53Procodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53Procodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV54Procodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54Procodf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV55trnCodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55trnCodi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV56TrnCodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56TrnCodf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Tipartcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Tipartcod2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59Unidad = httpContext.cgiGet( sPrefix+"wcpOAV59Unidad") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV43EmprCod, wcpOAV43EmprCod) != 0 ) || ( AV42PCliente != wcpOAV42PCliente ) || ( AV44UCliente != wcpOAV44UCliente ) || !( GXutil.dateCompare(GXutil.resetTime(AV45PFecha), GXutil.resetTime(wcpOAV45PFecha)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV46UFecha), GXutil.resetTime(wcpOAV46UFecha)) ) || ( GXutil.strcmp(AV47AlbRef_i, wcpOAV47AlbRef_i) != 0 ) || ( GXutil.strcmp(AV48AlbRef_f, wcpOAV48AlbRef_f) != 0 ) || ( GXutil.strcmp(AV49Estado_a, wcpOAV49Estado_a) != 0 ) || ( GXutil.strcmp(AV50Albrenti, wcpOAV50Albrenti) != 0 ) || ( GXutil.strcmp(AV51Albrentf, wcpOAV51Albrentf) != 0 ) || ( AV52TipENtcodi != wcpOAV52TipENtcodi ) || ( AV53Procodi != wcpOAV53Procodi ) || ( AV54Procodf != wcpOAV54Procodf ) || ( AV55trnCodi != wcpOAV55trnCodi ) || ( AV56TrnCodf != wcpOAV56TrnCodf ) || ( AV57Tipartcod1 != wcpOAV57Tipartcod1 ) || ( AV58Tipartcod2 != wcpOAV58Tipartcod2 ) || ( GXutil.strcmp(AV59Unidad, wcpOAV59Unidad) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV43EmprCod = AV43EmprCod ;
      wcpOAV42PCliente = AV42PCliente ;
      wcpOAV44UCliente = AV44UCliente ;
      wcpOAV45PFecha = AV45PFecha ;
      wcpOAV46UFecha = AV46UFecha ;
      wcpOAV47AlbRef_i = AV47AlbRef_i ;
      wcpOAV48AlbRef_f = AV48AlbRef_f ;
      wcpOAV49Estado_a = AV49Estado_a ;
      wcpOAV50Albrenti = AV50Albrenti ;
      wcpOAV51Albrentf = AV51Albrentf ;
      wcpOAV52TipENtcodi = AV52TipENtcodi ;
      wcpOAV53Procodi = AV53Procodi ;
      wcpOAV54Procodf = AV54Procodf ;
      wcpOAV55trnCodi = AV55trnCodi ;
      wcpOAV56TrnCodf = AV56TrnCodf ;
      wcpOAV57Tipartcod1 = AV57Tipartcod1 ;
      wcpOAV58Tipartcod2 = AV58Tipartcod2 ;
      wcpOAV59Unidad = AV59Unidad ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV43EmprCod = httpContext.cgiGet( sPrefix+"AV43EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV43EmprCod) > 0 )
      {
         AV43EmprCod = httpContext.cgiGet( sCtrlAV43EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      }
      else
      {
         AV43EmprCod = httpContext.cgiGet( sPrefix+"AV43EmprCod_PARM") ;
      }
      sCtrlAV42PCliente = httpContext.cgiGet( sPrefix+"AV42PCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV42PCliente) > 0 )
      {
         AV42PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42PCliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PCliente), 6, 0));
      }
      else
      {
         AV42PCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42PCliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44UCliente = httpContext.cgiGet( sPrefix+"AV44UCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV44UCliente) > 0 )
      {
         AV44UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44UCliente), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44UCliente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44UCliente), 6, 0));
      }
      else
      {
         AV44UCliente = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44UCliente_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV45PFecha = httpContext.cgiGet( sPrefix+"AV45PFecha_CTRL") ;
      if ( GXutil.len( sCtrlAV45PFecha) > 0 )
      {
         AV45PFecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV45PFecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PFecha", localUtil.format(AV45PFecha, "99/99/99"));
      }
      else
      {
         AV45PFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV45PFecha_PARM"), 0) ;
      }
      sCtrlAV46UFecha = httpContext.cgiGet( sPrefix+"AV46UFecha_CTRL") ;
      if ( GXutil.len( sCtrlAV46UFecha) > 0 )
      {
         AV46UFecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV46UFecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46UFecha", localUtil.format(AV46UFecha, "99/99/99"));
      }
      else
      {
         AV46UFecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV46UFecha_PARM"), 0) ;
      }
      sCtrlAV47AlbRef_i = httpContext.cgiGet( sPrefix+"AV47AlbRef_i_CTRL") ;
      if ( GXutil.len( sCtrlAV47AlbRef_i) > 0 )
      {
         AV47AlbRef_i = httpContext.cgiGet( sCtrlAV47AlbRef_i) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbRef_i", AV47AlbRef_i);
      }
      else
      {
         AV47AlbRef_i = httpContext.cgiGet( sPrefix+"AV47AlbRef_i_PARM") ;
      }
      sCtrlAV48AlbRef_f = httpContext.cgiGet( sPrefix+"AV48AlbRef_f_CTRL") ;
      if ( GXutil.len( sCtrlAV48AlbRef_f) > 0 )
      {
         AV48AlbRef_f = httpContext.cgiGet( sCtrlAV48AlbRef_f) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbRef_f", AV48AlbRef_f);
      }
      else
      {
         AV48AlbRef_f = httpContext.cgiGet( sPrefix+"AV48AlbRef_f_PARM") ;
      }
      sCtrlAV49Estado_a = httpContext.cgiGet( sPrefix+"AV49Estado_a_CTRL") ;
      if ( GXutil.len( sCtrlAV49Estado_a) > 0 )
      {
         AV49Estado_a = httpContext.cgiGet( sCtrlAV49Estado_a) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Estado_a", AV49Estado_a);
      }
      else
      {
         AV49Estado_a = httpContext.cgiGet( sPrefix+"AV49Estado_a_PARM") ;
      }
      sCtrlAV50Albrenti = httpContext.cgiGet( sPrefix+"AV50Albrenti_CTRL") ;
      if ( GXutil.len( sCtrlAV50Albrenti) > 0 )
      {
         AV50Albrenti = httpContext.cgiGet( sCtrlAV50Albrenti) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Albrenti", AV50Albrenti);
      }
      else
      {
         AV50Albrenti = httpContext.cgiGet( sPrefix+"AV50Albrenti_PARM") ;
      }
      sCtrlAV51Albrentf = httpContext.cgiGet( sPrefix+"AV51Albrentf_CTRL") ;
      if ( GXutil.len( sCtrlAV51Albrentf) > 0 )
      {
         AV51Albrentf = httpContext.cgiGet( sCtrlAV51Albrentf) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Albrentf", AV51Albrentf);
      }
      else
      {
         AV51Albrentf = httpContext.cgiGet( sPrefix+"AV51Albrentf_PARM") ;
      }
      sCtrlAV52TipENtcodi = httpContext.cgiGet( sPrefix+"AV52TipENtcodi_CTRL") ;
      if ( GXutil.len( sCtrlAV52TipENtcodi) > 0 )
      {
         AV52TipENtcodi = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV52TipENtcodi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TipENtcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TipENtcodi), 4, 0));
      }
      else
      {
         AV52TipENtcodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV52TipENtcodi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV53Procodi = httpContext.cgiGet( sPrefix+"AV53Procodi_CTRL") ;
      if ( GXutil.len( sCtrlAV53Procodi) > 0 )
      {
         AV53Procodi = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53Procodi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Procodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Procodi), 4, 0));
      }
      else
      {
         AV53Procodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53Procodi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV54Procodf = httpContext.cgiGet( sPrefix+"AV54Procodf_CTRL") ;
      if ( GXutil.len( sCtrlAV54Procodf) > 0 )
      {
         AV54Procodf = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54Procodf), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Procodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Procodf), 4, 0));
      }
      else
      {
         AV54Procodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54Procodf_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV55trnCodi = httpContext.cgiGet( sPrefix+"AV55trnCodi_CTRL") ;
      if ( GXutil.len( sCtrlAV55trnCodi) > 0 )
      {
         AV55trnCodi = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55trnCodi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55trnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55trnCodi), 4, 0));
      }
      else
      {
         AV55trnCodi = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55trnCodi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV56TrnCodf = httpContext.cgiGet( sPrefix+"AV56TrnCodf_CTRL") ;
      if ( GXutil.len( sCtrlAV56TrnCodf) > 0 )
      {
         AV56TrnCodf = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56TrnCodf), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TrnCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TrnCodf), 4, 0));
      }
      else
      {
         AV56TrnCodf = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56TrnCodf_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57Tipartcod1 = httpContext.cgiGet( sPrefix+"AV57Tipartcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV57Tipartcod1) > 0 )
      {
         AV57Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57Tipartcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tipartcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Tipartcod1), 4, 0));
      }
      else
      {
         AV57Tipartcod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57Tipartcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58Tipartcod2 = httpContext.cgiGet( sPrefix+"AV58Tipartcod2_CTRL") ;
      if ( GXutil.len( sCtrlAV58Tipartcod2) > 0 )
      {
         AV58Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58Tipartcod2), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Tipartcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Tipartcod2), 4, 0));
      }
      else
      {
         AV58Tipartcod2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58Tipartcod2_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59Unidad = httpContext.cgiGet( sPrefix+"AV59Unidad_CTRL") ;
      if ( GXutil.len( sCtrlAV59Unidad) > 0 )
      {
         AV59Unidad = httpContext.cgiGet( sCtrlAV59Unidad) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Unidad", AV59Unidad);
      }
      else
      {
         AV59Unidad = httpContext.cgiGet( sPrefix+"AV59Unidad_PARM") ;
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
      pa2DI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DI2( ) ;
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
      ws2DI2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43EmprCod_PARM", GXutil.rtrim( AV43EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43EmprCod_CTRL", GXutil.rtrim( sCtrlAV43EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42PCliente_PARM", GXutil.ltrim( localUtil.ntoc( AV42PCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42PCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42PCliente_CTRL", GXutil.rtrim( sCtrlAV42PCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44UCliente_PARM", GXutil.ltrim( localUtil.ntoc( AV44UCliente, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44UCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44UCliente_CTRL", GXutil.rtrim( sCtrlAV44UCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45PFecha_PARM", localUtil.dtoc( AV45PFecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45PFecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45PFecha_CTRL", GXutil.rtrim( sCtrlAV45PFecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46UFecha_PARM", localUtil.dtoc( AV46UFecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46UFecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46UFecha_CTRL", GXutil.rtrim( sCtrlAV46UFecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbRef_i_PARM", GXutil.rtrim( AV47AlbRef_i));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47AlbRef_i)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbRef_i_CTRL", GXutil.rtrim( sCtrlAV47AlbRef_i));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48AlbRef_f_PARM", GXutil.rtrim( AV48AlbRef_f));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48AlbRef_f)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48AlbRef_f_CTRL", GXutil.rtrim( sCtrlAV48AlbRef_f));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Estado_a_PARM", GXutil.rtrim( AV49Estado_a));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49Estado_a)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Estado_a_CTRL", GXutil.rtrim( sCtrlAV49Estado_a));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Albrenti_PARM", GXutil.rtrim( AV50Albrenti));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50Albrenti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Albrenti_CTRL", GXutil.rtrim( sCtrlAV50Albrenti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Albrentf_PARM", GXutil.rtrim( AV51Albrentf));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51Albrentf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Albrentf_CTRL", GXutil.rtrim( sCtrlAV51Albrentf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52TipENtcodi_PARM", GXutil.ltrim( localUtil.ntoc( AV52TipENtcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52TipENtcodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52TipENtcodi_CTRL", GXutil.rtrim( sCtrlAV52TipENtcodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Procodi_PARM", GXutil.ltrim( localUtil.ntoc( AV53Procodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53Procodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53Procodi_CTRL", GXutil.rtrim( sCtrlAV53Procodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54Procodf_PARM", GXutil.ltrim( localUtil.ntoc( AV54Procodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54Procodf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54Procodf_CTRL", GXutil.rtrim( sCtrlAV54Procodf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55trnCodi_PARM", GXutil.ltrim( localUtil.ntoc( AV55trnCodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55trnCodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55trnCodi_CTRL", GXutil.rtrim( sCtrlAV55trnCodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56TrnCodf_PARM", GXutil.ltrim( localUtil.ntoc( AV56TrnCodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56TrnCodf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56TrnCodf_CTRL", GXutil.rtrim( sCtrlAV56TrnCodf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Tipartcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV57Tipartcod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57Tipartcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Tipartcod1_CTRL", GXutil.rtrim( sCtrlAV57Tipartcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Tipartcod2_PARM", GXutil.ltrim( localUtil.ntoc( AV58Tipartcod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Tipartcod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Tipartcod2_CTRL", GXutil.rtrim( sCtrlAV58Tipartcod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Unidad_PARM", GXutil.rtrim( AV59Unidad));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Unidad)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Unidad_CTRL", GXutil.rtrim( sCtrlAV59Unidad));
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
      we2DI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115545553", true, true);
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
      httpContext.AddJavascriptSource("almacentejidoencrudodetalle_wc.js", "?202682115545554", false, true);
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
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2_"+sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI_"+sGXsfl_43_idx );
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2_"+sGXsfl_43_fel_idx ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI_"+sGXsfl_43_fel_idx );
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb2DI0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albref_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albref_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albref_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albreccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname,localUtil.format(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen(), "99/99/99"),localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrfen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrent2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavAlmacentejidoencrudodetalle_sdt__albruni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI_" + sGXsfl_43_idx ;
            cmbavAlmacentejidoencrudodetalle_sdt__albruni.setName( GXCCtl );
            cmbavAlmacentejidoencrudodetalle_sdt__albruni.setWebtags( "" );
            cmbavAlmacentejidoencrudodetalle_sdt__albruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbavAlmacentejidoencrudodetalle_sdt__albruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getItemCount() > 0 )
            {
               if ( ( AV67GXV1 > 0 ) && ( AV13AlmacenTejidoencrudoDetalle_SDT.size() >= AV67GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni())==0) )
               {
                  ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).setgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getValidValue(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAlmacentejidoencrudodetalle_sdt__albruni,cmbavAlmacentejidoencrudodetalle_sdt__albruni.getInternalname(),GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni()),Integer.valueOf(1),cmbavAlmacentejidoencrudodetalle_sdt__albruni.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavAlmacentejidoencrudodetalle_sdt__albruni.getVisible()),Integer.valueOf(cmbavAlmacentejidoencrudodetalle_sdt__albruni.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAlmacentejidoencrudodetalle_sdt__albruni.setValue( GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAlmacentejidoencrudodetalle_sdt__albruni.getInternalname(), "Values", cmbavAlmacentejidoencrudodetalle_sdt__albruni.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrunient_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__procecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__procenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtavAlmacentejidoencrudodetalle_sdt__trncod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__trnnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudodetalle_sdt__albrloc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible),Integer.valueOf(edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2DI2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albref_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavAlmacentejidoencrudodetalle_sdt__albruni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unds. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unds. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unds. Disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs. Disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procedencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albref_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD" ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM" ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC" ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2" ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setInternalname( sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI" );
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT" ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS" ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD" ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM" ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD" ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname = sPrefix+"ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC" ;
      edtavTotvalue_albrunient_Internalname = sPrefix+"vTOTVALUE_ALBRUNIENT" ;
      edtavTotvalue_albrpieent_Internalname = sPrefix+"vTOTVALUE_ALBRPIEENT" ;
      edtavTotvalue_albruniuti_Internalname = sPrefix+"vTOTVALUE_ALBRUNIUTI" ;
      edtavTotvalue_albrpieuti_Internalname = sPrefix+"vTOTVALUE_ALBRPIEUTI" ;
      edtavTotvalue_albrunidis_Internalname = sPrefix+"vTOTVALUE_ALBRUNIDIS" ;
      edtavTotvalue_albrpiedis_Internalname = sPrefix+"vTOTVALUE_ALBRPIEDIS" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible = -1 ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setJsonclick( "" );
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setEnabled( 0 );
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setVisible( -1 );
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Jsonclick = "" ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_albrpiedis_Jsonclick = "" ;
      edtavTotvalue_albrpiedis_Enabled = 1 ;
      edtavTotvalue_albrunidis_Jsonclick = "" ;
      edtavTotvalue_albrunidis_Enabled = 1 ;
      edtavTotvalue_albrpieuti_Jsonclick = "" ;
      edtavTotvalue_albrpieuti_Enabled = 1 ;
      edtavTotvalue_albruniuti_Jsonclick = "" ;
      edtavTotvalue_albruniuti_Enabled = 1 ;
      edtavTotvalue_albrpieent_Jsonclick = "" ;
      edtavTotvalue_albrpieent_Enabled = 1 ;
      edtavTotvalue_albrunient_Jsonclick = "" ;
      edtavTotvalue_albrunient_Enabled = 1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible = -1 ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setVisible( -1 );
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled = -1 ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setEnabled( -1 );
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled = -1 ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled = -1 ;
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
      Ddo_grid_Columnssortvalues = "||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:AlmacenTejidoencrudoDetalle_SDT__Clicod|1:AlmacenTejidoencrudoDetalle_SDT__CliNom|2:AlmacenTejidoencrudoDetalle_SDT__albref|3:AlmacenTejidoencrudoDetalle_SDT__albrefdsc|4:AlmacenTejidoencrudoDetalle_SDT__albreccod|5:AlmacenTejidoencrudoDetalle_SDT__albrfen|6:AlmacenTejidoencrudoDetalle_SDT__albrent2|7:AlmacenTejidoencrudoDetalle_SDT__albruni|8:AlmacenTejidoencrudoDetalle_SDT__albrunient|9:AlmacenTejidoencrudoDetalle_SDT__albrpieent|10:AlmacenTejidoencrudoDetalle_SDT__albruniuti|11:AlmacenTejidoencrudoDetalle_SDT__albrpieuti|12:AlmacenTejidoencrudoDetalle_SDT__albrunidis|13:AlmacenTejidoencrudoDetalle_SDT__albrpiedis|14:AlmacenTejidoencrudoDetalle_SDT__ProceCod|15:AlmacenTejidoencrudoDetalle_SDT__Procenom|16:AlmacenTejidoencrudoDetalle_SDT__trncod|17:AlmacenTejidoencrudoDetalle_SDT__trnnom|18:AlmacenTejidoencrudoDetalle_SDT__albrloc" ;
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
      GXCCtl = "ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI_" + sGXsfl_43_idx ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setName( GXCCtl );
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setWebtags( "" );
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavAlmacentejidoencrudodetalle_sdt__albruni.getItemCount() > 0 )
      {
         if ( ( AV67GXV1 > 0 ) && ( AV13AlmacenTejidoencrudoDetalle_SDT.size() >= AV67GXV1 ) && (GXutil.strcmp("", ((app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem)AV13AlmacenTejidoencrudoDetalle_SDT.elementAt(-1+AV67GXV1)).getgxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni())==0) )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV13AlmacenTejidoencrudoDetalle_SDT',fld:'vALMACENTEJIDOENCRUDODETALLE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV31TotValue_albrunient',fld:'vTOTVALUE_ALBRUNIENT',pic:''},{av:'AV33TotValue_albrpieent',fld:'vTOTVALUE_ALBRPIEENT',pic:''},{av:'AV35TotValue_albruniuti',fld:'vTOTVALUE_ALBRUNIUTI',pic:''},{av:'AV37TotValue_albrpieuti',fld:'vTOTVALUE_ALBRPIEUTI',pic:''},{av:'AV39TotValue_albrunidis',fld:'vTOTVALUE_ALBRUNIDIS',pic:''},{av:'AV41TotValue_albrpiedis',fld:'vTOTVALUE_ALBRPIEDIS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132DI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV13AlmacenTejidoencrudoDetalle_SDT',fld:'vALMACENTEJIDOENCRUDODETALLE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142DI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV13AlmacenTejidoencrudoDetalle_SDT',fld:'vALMACENTEJIDOENCRUDODETALLE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202DI2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152DI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV13AlmacenTejidoencrudoDetalle_SDT',fld:'vALMACENTEJIDOENCRUDODETALLE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV31TotValue_albrunient',fld:'vTOTVALUE_ALBRUNIENT',pic:''},{av:'AV33TotValue_albrpieent',fld:'vTOTVALUE_ALBRPIEENT',pic:''},{av:'AV35TotValue_albruniuti',fld:'vTOTVALUE_ALBRUNIUTI',pic:''},{av:'AV37TotValue_albrpieuti',fld:'vTOTVALUE_ALBRPIEUTI',pic:''},{av:'AV39TotValue_albrunidis',fld:'vTOTVALUE_ALBRUNIDIS',pic:''},{av:'AV41TotValue_albrpiedis',fld:'vTOTVALUE_ALBRPIEDIS',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e122DI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV13AlmacenTejidoencrudoDetalle_SDT',fld:'vALMACENTEJIDOENCRUDODETALLE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREF',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBREFDSC',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRECCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRFEN',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRENT2',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRUNIDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRPIEDIS',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCECOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__PROCENOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNCOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__TRNNOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDODETALLE_SDT__ALBRLOC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30Tot_albrunient',fld:'vTOT_ALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV32Tot_albrpieent',fld:'vTOT_ALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV34Tot_albruniuti',fld:'vTOT_ALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV36Tot_albrpieuti',fld:'vTOT_ALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV38Tot_albrunidis',fld:'vTOT_ALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV40Tot_albrpiedis',fld:'vTOT_ALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV31TotValue_albrunient',fld:'vTOTVALUE_ALBRUNIENT',pic:''},{av:'AV33TotValue_albrpieent',fld:'vTOTVALUE_ALBRPIEENT',pic:''},{av:'AV35TotValue_albruniuti',fld:'vTOTVALUE_ALBRUNIUTI',pic:''},{av:'AV37TotValue_albrpieuti',fld:'vTOTVALUE_ALBRPIEUTI',pic:''},{av:'AV39TotValue_albrunidis',fld:'vTOTVALUE_ALBRUNIDIS',pic:''},{av:'AV41TotValue_albrpiedis',fld:'vTOTVALUE_ALBRPIEDIS',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e112DI1',iparms:[{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV59Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV58Tipartcod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV57Tipartcod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV56TrnCodf',fld:'vTRNCODF',pic:'ZZZ9'},{av:'AV55trnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV54Procodf',fld:'vPROCODF',pic:'ZZZ9'},{av:'AV53Procodi',fld:'vPROCODI',pic:'ZZZ9'},{av:'AV52TipENtcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV51Albrentf',fld:'vALBRENTF',pic:''},{av:'AV50Albrenti',fld:'vALBRENTI',pic:''},{av:'AV49Estado_a',fld:'vESTADO_A',pic:''},{av:'AV48AlbRef_f',fld:'vALBREF_F',pic:''},{av:'AV47AlbRef_i',fld:'vALBREF_I',pic:''},{av:'AV46UFecha',fld:'vUFECHA',pic:''},{av:'AV45PFecha',fld:'vPFECHA',pic:''},{av:'AV44UCliente',fld:'vUCLIENTE',pic:'ZZZZZ9'},{av:'AV42PCliente',fld:'vPCLIENTE',pic:'ZZZZZ9'},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DI2',iparms:[{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e172DI2',iparms:[{av:'AV60AlmacenTejidoencrudoDetalle_SDTJson',fld:'vALMACENTEJIDOENCRUDODETALLE_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV9","{handler:'validv_Gxv9',iparms:[]");
      setEventMetadata("VALIDV_GXV9",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv20',iparms:[]");
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
      wcpOAV43EmprCod = "" ;
      wcpOAV45PFecha = GXutil.nullDate() ;
      wcpOAV46UFecha = GXutil.nullDate() ;
      wcpOAV47AlbRef_i = "" ;
      wcpOAV48AlbRef_f = "" ;
      wcpOAV49Estado_a = "" ;
      wcpOAV50Albrenti = "" ;
      wcpOAV51Albrentf = "" ;
      wcpOAV59Unidad = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV43EmprCod = "" ;
      AV45PFecha = GXutil.nullDate() ;
      AV46UFecha = GXutil.nullDate() ;
      AV47AlbRef_i = "" ;
      AV48AlbRef_f = "" ;
      AV49Estado_a = "" ;
      AV50Albrenti = "" ;
      AV51Albrentf = "" ;
      AV59Unidad = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV87Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13AlmacenTejidoencrudoDetalle_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem>(app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem.class, "AlmacenTejidoencrudoDetalle_SDTItem", "TexplusNET", remoteHandle);
      AV30Tot_albrunient = DecimalUtil.ZERO ;
      AV34Tot_albruniuti = DecimalUtil.ZERO ;
      AV38Tot_albrunidis = DecimalUtil.ZERO ;
      AV60AlmacenTejidoencrudoDetalle_SDTJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      AV31TotValue_albrunient = "" ;
      AV33TotValue_albrpieent = "" ;
      AV35TotValue_albruniuti = "" ;
      AV37TotValue_albrpieuti = "" ;
      AV39TotValue_albrunidis = "" ;
      AV41TotValue_albrpiedis = "" ;
      hsh = "" ;
      AV61Station = "" ;
      AV62EmprNom = "" ;
      AV63UsurCod = "" ;
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
      GXv_char14 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_int21 = new short[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext24 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV64websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char22 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char23 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector25 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector26 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState29 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV29AlmacenTejidoencrudoDetalle_SDTItem = new app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV43EmprCod = "" ;
      sCtrlAV42PCliente = "" ;
      sCtrlAV44UCliente = "" ;
      sCtrlAV45PFecha = "" ;
      sCtrlAV46UFecha = "" ;
      sCtrlAV47AlbRef_i = "" ;
      sCtrlAV48AlbRef_f = "" ;
      sCtrlAV49Estado_a = "" ;
      sCtrlAV50Albrenti = "" ;
      sCtrlAV51Albrentf = "" ;
      sCtrlAV52TipENtcodi = "" ;
      sCtrlAV53Procodi = "" ;
      sCtrlAV54Procodf = "" ;
      sCtrlAV55trnCodi = "" ;
      sCtrlAV56TrnCodf = "" ;
      sCtrlAV57Tipartcod1 = "" ;
      sCtrlAV58Tipartcod2 = "" ;
      sCtrlAV59Unidad = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV87Pgmname = "AlmacenTejidoencrudoDetalle_WC" ;
      /* GeneXus formulas. */
      AV87Pgmname = "AlmacenTejidoencrudoDetalle_WC" ;
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled = 0 ;
      cmbavAlmacentejidoencrudodetalle_sdt__albruni.setEnabled( 0 );
      edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled = 0 ;
      edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled = 0 ;
      edtavTotvalue_albrunient_Enabled = 0 ;
      edtavTotvalue_albrpieent_Enabled = 0 ;
      edtavTotvalue_albruniuti_Enabled = 0 ;
      edtavTotvalue_albrpieuti_Enabled = 0 ;
      edtavTotvalue_albrunidis_Enabled = 0 ;
      edtavTotvalue_albrpiedis_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV23ManageFiltersExecutionStep ;
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
   private short wcpOAV52TipENtcodi ;
   private short wcpOAV53Procodi ;
   private short wcpOAV54Procodf ;
   private short wcpOAV55trnCodi ;
   private short wcpOAV56TrnCodf ;
   private short wcpOAV57Tipartcod1 ;
   private short wcpOAV58Tipartcod2 ;
   private short AV52TipENtcodi ;
   private short AV53Procodi ;
   private short AV54Procodf ;
   private short AV55trnCodi ;
   private short AV56TrnCodf ;
   private short AV57Tipartcod1 ;
   private short AV58Tipartcod2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private short GXv_int21[] ;
   private int wcpOAV42PCliente ;
   private int wcpOAV44UCliente ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV42PCliente ;
   private int AV44UCliente ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV67GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavAlmacentejidoencrudodetalle_sdt__clicod_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__clinom_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albref_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albreccod_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrfen_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrent2_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrunient_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__procecod_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__procenom_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__trncod_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__trnnom_Enabled ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrloc_Enabled ;
   private int edtavTotvalue_albrunient_Enabled ;
   private int edtavTotvalue_albrpieent_Enabled ;
   private int edtavTotvalue_albruniuti_Enabled ;
   private int edtavTotvalue_albrpieuti_Enabled ;
   private int edtavTotvalue_albrunidis_Enabled ;
   private int edtavTotvalue_albrpiedis_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int edtavAlmacentejidoencrudodetalle_sdt__clicod_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__clinom_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albref_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albreccod_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrfen_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrent2_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrunient_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__procecod_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__procenom_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__trncod_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__trnnom_Visible ;
   private int edtavAlmacentejidoencrudodetalle_sdt__albrloc_Visible ;
   private int AV25PageToGo ;
   private int AV88GXV21 ;
   private int AV89GXV22 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV32Tot_albrpieent ;
   private long AV36Tot_albrpieuti ;
   private long AV40Tot_albrpiedis ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV30Tot_albrunient ;
   private java.math.BigDecimal AV34Tot_albruniuti ;
   private java.math.BigDecimal AV38Tot_albrunidis ;
   private String wcpOAV43EmprCod ;
   private String wcpOAV47AlbRef_i ;
   private String wcpOAV48AlbRef_f ;
   private String wcpOAV49Estado_a ;
   private String wcpOAV50Albrenti ;
   private String wcpOAV51Albrentf ;
   private String wcpOAV59Unidad ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV43EmprCod ;
   private String AV47AlbRef_i ;
   private String AV48AlbRef_f ;
   private String AV49Estado_a ;
   private String AV50Albrenti ;
   private String AV51Albrentf ;
   private String AV59Unidad ;
   private String sGXsfl_43_idx="0001" ;
   private String AV87Pgmname ;
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
   private String edtavAlmacentejidoencrudodetalle_sdt__clicod_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__clinom_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albref_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albreccod_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrfen_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrent2_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrunient_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__procecod_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__procenom_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__trncod_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__trnnom_Internalname ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrloc_Internalname ;
   private String edtavTotvalue_albrunient_Internalname ;
   private String edtavTotvalue_albrpieent_Internalname ;
   private String edtavTotvalue_albruniuti_Internalname ;
   private String edtavTotvalue_albrpieuti_Internalname ;
   private String edtavTotvalue_albrunidis_Internalname ;
   private String edtavTotvalue_albrpiedis_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String AV61Station ;
   private String AV62EmprNom ;
   private String AV63UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char22[] ;
   private String GXt_char1 ;
   private String GXv_char23[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_albrunient_Jsonclick ;
   private String edtavTotvalue_albrpieent_Jsonclick ;
   private String edtavTotvalue_albruniuti_Jsonclick ;
   private String edtavTotvalue_albrpieuti_Jsonclick ;
   private String edtavTotvalue_albrunidis_Jsonclick ;
   private String edtavTotvalue_albrpiedis_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV43EmprCod ;
   private String sCtrlAV42PCliente ;
   private String sCtrlAV44UCliente ;
   private String sCtrlAV45PFecha ;
   private String sCtrlAV46UFecha ;
   private String sCtrlAV47AlbRef_i ;
   private String sCtrlAV48AlbRef_f ;
   private String sCtrlAV49Estado_a ;
   private String sCtrlAV50Albrenti ;
   private String sCtrlAV51Albrentf ;
   private String sCtrlAV52TipENtcodi ;
   private String sCtrlAV53Procodi ;
   private String sCtrlAV54Procodf ;
   private String sCtrlAV55trnCodi ;
   private String sCtrlAV56TrnCodf ;
   private String sCtrlAV57Tipartcod1 ;
   private String sCtrlAV58Tipartcod2 ;
   private String sCtrlAV59Unidad ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAlmacentejidoencrudodetalle_sdt__clicod_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__clinom_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albref_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrefdsc_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albreccod_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrfen_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrent2_Jsonclick ;
   private String GXCCtl ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrunient_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpieent_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albruniuti_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpieuti_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrunidis_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrpiedis_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__procecod_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__procenom_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__trncod_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__trnnom_Jsonclick ;
   private String edtavAlmacentejidoencrudodetalle_sdt__albrloc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV45PFecha ;
   private java.util.Date wcpOAV46UFecha ;
   private java.util.Date AV45PFecha ;
   private java.util.Date AV46UFecha ;
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
   private String AV60AlmacenTejidoencrudoDetalle_SDTJson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV31TotValue_albrunient ;
   private String AV33TotValue_albrpieent ;
   private String AV35TotValue_albruniuti ;
   private String AV37TotValue_albrpieuti ;
   private String AV39TotValue_albrunidis ;
   private String AV41TotValue_albrpiedis ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlmacentejidoencrudodetalle_sdt__albruni ;
   private com.genexus.webpanels.WebSession AV64websession ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> AV13AlmacenTejidoencrudoDetalle_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item27 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item28[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext24[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState29[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem AV29AlmacenTejidoencrudoDetalle_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector25[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector26[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

