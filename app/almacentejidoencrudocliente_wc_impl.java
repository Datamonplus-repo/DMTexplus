package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoencrudocliente_wc_impl extends GXWebComponent
{
   public almacentejidoencrudocliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoencrudocliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudocliente_wc_impl.class ));
   }

   public almacentejidoencrudocliente_wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV29Albrfen = localUtil.parseDateParm( httpContext.GetPar( "Albrfen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Albrfen", localUtil.format(AV29Albrfen, "99/99/99"));
               AV30Albrfen_to2 = localUtil.parseDateParm( httpContext.GetPar( "Albrfen_to2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albrfen_to2", localUtil.format(AV30Albrfen_to2, "99/99/99"));
               AV31Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Clicod), 6, 0));
               AV32Clicod_to2 = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to2"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod_to2), 6, 0));
               AV33AlbRef = httpContext.GetPar( "AlbRef") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbRef", AV33AlbRef);
               AV34AlbRef_to2 = httpContext.GetPar( "AlbRef_to2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbRef_to2", AV34AlbRef_to2);
               AV35AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbRTartC), 4, 0));
               AV36AlbRTartC_to2 = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC_to2"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbRTartC_to2), 4, 0));
               AV37AlbrEstIN = (byte)(GXutil.lval( httpContext.GetPar( "AlbrEstIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbrEstIN", GXutil.str( AV37AlbrEstIN, 1, 0));
               AV38AlbREntfrom = httpContext.GetPar( "AlbREntfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38AlbREntfrom", AV38AlbREntfrom);
               AV39AlbREntto = httpContext.GetPar( "AlbREntto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39AlbREntto", AV39AlbREntto);
               AV40TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntCod), 4, 0));
               AV41Tipo = httpContext.GetPar( "Tipo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipo", AV41Tipo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,AV29Albrfen,AV30Albrfen_to2,Integer.valueOf(AV31Clicod),Integer.valueOf(AV32Clicod_to2),AV33AlbRef,AV34AlbRef_to2,Short.valueOf(AV35AlbRTartC),Short.valueOf(AV36AlbRTartC_to2),Byte.valueOf(AV37AlbrEstIN),AV38AlbREntfrom,AV39AlbREntto,Short.valueOf(AV40TipEntCod),AV41Tipo});
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
      AV72Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29Albrfen = localUtil.parseDateParm( httpContext.GetPar( "Albrfen")) ;
      AV30Albrfen_to2 = localUtil.parseDateParm( httpContext.GetPar( "Albrfen_to2")) ;
      AV31Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV32Clicod_to2 = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to2"))) ;
      AV33AlbRef = httpContext.GetPar( "AlbRef") ;
      AV34AlbRef_to2 = httpContext.GetPar( "AlbRef_to2") ;
      AV35AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
      AV36AlbRTartC_to2 = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC_to2"))) ;
      AV37AlbrEstIN = (byte)(GXutil.lval( httpContext.GetPar( "AlbrEstIN"))) ;
      AV38AlbREntfrom = httpContext.GetPar( "AlbREntfrom") ;
      AV39AlbREntto = httpContext.GetPar( "AlbREntto") ;
      AV40TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
      AV41Tipo = httpContext.GetPar( "Tipo") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13AlmacenTejidoencrudoCliente_SDT);
      AV49Tot_TotEnt = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotEnt"), ".") ;
      AV51Tot_TotPe = GXutil.lval( httpContext.GetPar( "Tot_TotPe")) ;
      AV53Tot_TotUti = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotUti"), ".") ;
      AV55Tot_TotPu = GXutil.lval( httpContext.GetPar( "Tot_TotPu")) ;
      AV57Tot_SaldoU = CommonUtil.decimalVal( httpContext.GetPar( "Tot_SaldoU"), ".") ;
      AV59Tot_SaldoP = GXutil.lval( httpContext.GetPar( "Tot_SaldoP")) ;
      AV47AlmacenTejidoencrudoCliente_SDTjsonjson = httpContext.GetPar( "AlmacenTejidoencrudoCliente_SDTjsonjson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DH2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Almacen Tejido en crudo (Cliente)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacentejidoencrudocliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV29Albrfen)),GXutil.URLEncode(GXutil.formatDateParm(AV30Albrfen_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV31Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32Clicod_to2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV34AlbRef_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbRTartC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36AlbRTartC_to2,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37AlbrEstIN,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38AlbREntfrom)),GXutil.URLEncode(GXutil.rtrim(AV39AlbREntto)),GXutil.URLEncode(GXutil.ltrimstr(AV40TipEntCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV41Tipo))}, new String[] {"Emprcod","Albrfen","Albrfen_to2","Clicod","Clicod_to2","AlbRef","AlbRef_to2","AlbRTartC","AlbRTartC_to2","AlbrEstIN","AlbREntfrom","AlbREntto","TipEntCod","Tipo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTENT", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUTI", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOU", getSecureSignedToken( sPrefix, localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON", getSecureSignedToken( sPrefix, AV47AlmacenTejidoencrudoCliente_SDTjsonjson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudocliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Almacentejidoencrudocliente_sdt", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Almacentejidoencrudocliente_sdt", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Almacentejidoencrudocliente_sdt", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoCliente_SDT));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Albrfen", localUtil.dtoc( wcpOAV29Albrfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Albrfen_to2", localUtil.dtoc( wcpOAV30Albrfen_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV31Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Clicod_to2", GXutil.ltrim( localUtil.ntoc( wcpOAV32Clicod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33AlbRef", GXutil.rtrim( wcpOAV33AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34AlbRef_to2", GXutil.rtrim( wcpOAV34AlbRef_to2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35AlbRTartC", GXutil.ltrim( localUtil.ntoc( wcpOAV35AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36AlbRTartC_to2", GXutil.ltrim( localUtil.ntoc( wcpOAV36AlbRTartC_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37AlbrEstIN", GXutil.ltrim( localUtil.ntoc( wcpOAV37AlbrEstIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38AlbREntfrom", GXutil.rtrim( wcpOAV38AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39AlbREntto", GXutil.rtrim( wcpOAV39AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40TipEntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV40TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41Tipo", GXutil.rtrim( wcpOAV41Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN", localUtil.dtoc( AV29Albrfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN_TO2", localUtil.dtoc( AV30Albrfen_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV31Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO2", GXutil.ltrim( localUtil.ntoc( AV32Clicod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF", GXutil.rtrim( AV33AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_TO2", GXutil.rtrim( AV34AlbRef_to2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC", GXutil.ltrim( localUtil.ntoc( AV35AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC_TO2", GXutil.ltrim( localUtil.ntoc( AV36AlbRTartC_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRESTIN", GXutil.ltrim( localUtil.ntoc( AV37AlbrEstIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTFROM", GXutil.rtrim( AV38AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTTO", GXutil.rtrim( AV39AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV40TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO", GXutil.rtrim( AV41Tipo));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDT", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDT", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTENT", GXutil.ltrim( localUtil.ntoc( AV49Tot_TotEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTENT", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPE", GXutil.ltrim( localUtil.ntoc( AV51Tot_TotPe, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUTI", GXutil.ltrim( localUtil.ntoc( AV53Tot_TotUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUTI", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPU", GXutil.ltrim( localUtil.ntoc( AV55Tot_TotPu, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDOU", GXutil.ltrim( localUtil.ntoc( AV57Tot_SaldoU, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOU", getSecureSignedToken( sPrefix, localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDOP", GXutil.ltrim( localUtil.ntoc( AV59Tot_SaldoP, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON", AV47AlmacenTejidoencrudoCliente_SDTjsonjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON", getSecureSignedToken( sPrefix, AV47AlmacenTejidoencrudoCliente_SDTjsonjson));
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

   public void renderHtmlCloseForm2DH2( )
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
      return "AlmacenTejidoencrudoCliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido en crudo (Cliente)", "") ;
   }

   public void wb2DH0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.almacentejidoencrudocliente_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112dh1_client"+"'", TempTags, "", 2, "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_2DH2( true) ;
      }
      else
      {
         wb_table1_25_2DH2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_2DH2e( boolean wbgen )
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
            AV63GXV1 = nGXsfl_43_idx ;
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
         wb_table2_54_2DH2( true) ;
      }
      else
      {
         wb_table2_54_2DH2( false) ;
      }
      return  ;
   }

   public void wb_table2_54_2DH2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV72Pgmname), GXutil.rtrim( localUtil.format( AV72Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
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
               AV63GXV1 = nGXsfl_43_idx ;
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

   public void start2DH2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido en crudo (Cliente)", ""), (short)(0)) ;
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
            strup2DH0( ) ;
         }
      }
   }

   public void ws2DH2( )
   {
      start2DH2( ) ;
      evt2DH2( ) ;
   }

   public void evt2DH2( )
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
                              strup2DH0( ) ;
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
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e162DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e172DH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DH0( ) ;
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
                              strup2DH0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV63GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13AlmacenTejidoencrudoCliente_SDT.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
                           {
                              AV13AlmacenTejidoencrudoCliente_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)) );
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
                                       e182DH2 ();
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
                                       e192DH2 ();
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
                                       e202DH2 ();
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
                                    strup2DH0( ) ;
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

   public void we2DH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DH2( ) ;
         }
      }
   }

   public void pa2DH2( )
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
                                 String AV72Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV28Emprcod ,
                                 java.util.Date AV29Albrfen ,
                                 java.util.Date AV30Albrfen_to2 ,
                                 int AV31Clicod ,
                                 int AV32Clicod_to2 ,
                                 String AV33AlbRef ,
                                 String AV34AlbRef_to2 ,
                                 short AV35AlbRTartC ,
                                 short AV36AlbRTartC_to2 ,
                                 byte AV37AlbrEstIN ,
                                 String AV38AlbREntfrom ,
                                 String AV39AlbREntto ,
                                 short AV40TipEntCod ,
                                 String AV41Tipo ,
                                 GXBaseCollection<app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> AV13AlmacenTejidoencrudoCliente_SDT ,
                                 java.math.BigDecimal AV49Tot_TotEnt ,
                                 long AV51Tot_TotPe ,
                                 java.math.BigDecimal AV53Tot_TotUti ,
                                 long AV55Tot_TotPu ,
                                 java.math.BigDecimal AV57Tot_SaldoU ,
                                 long AV59Tot_SaldoP ,
                                 String AV47AlmacenTejidoencrudoCliente_SDTjsonjson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192DH2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacentejidoencrudocliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV72Pgmname = "AlmacenTejidoencrudoCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_totent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totent_Enabled), 5, 0), true);
      edtavTotvalue_totpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpe_Enabled), 5, 0), true);
      edtavTotvalue_totuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totuti_Enabled), 5, 0), true);
      edtavTotvalue_totpu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpu_Enabled), 5, 0), true);
      edtavTotvalue_saldou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldou_Enabled), 5, 0), true);
      edtavTotvalue_saldop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldop_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e192DH2 ();
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
         e202DH2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e202DH2 ();
         }
         wbEnd = (short)(43) ;
         wb2DH0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DH2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDT", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDT", AV13AlmacenTejidoencrudoCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDT", getSecureSignedToken( sPrefix, AV13AlmacenTejidoencrudoCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTENT", GXutil.ltrim( localUtil.ntoc( AV49Tot_TotEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTENT", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPE", GXutil.ltrim( localUtil.ntoc( AV51Tot_TotPe, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTUTI", GXutil.ltrim( localUtil.ntoc( AV53Tot_TotUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUTI", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPU", GXutil.ltrim( localUtil.ntoc( AV55Tot_TotPu, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDOU", GXutil.ltrim( localUtil.ntoc( AV57Tot_SaldoU, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOU", getSecureSignedToken( sPrefix, localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDOP", GXutil.ltrim( localUtil.ntoc( AV59Tot_SaldoP, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON", AV47AlmacenTejidoencrudoCliente_SDTjsonjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON", getSecureSignedToken( sPrefix, AV47AlmacenTejidoencrudoCliente_SDTjsonjson));
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
      return AV13AlmacenTejidoencrudoCliente_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV72Pgmname, AV12FilterFullText, AV28Emprcod, AV29Albrfen, AV30Albrfen_to2, AV31Clicod, AV32Clicod_to2, AV33AlbRef, AV34AlbRef_to2, AV35AlbRTartC, AV36AlbRTartC_to2, AV37AlbrEstIN, AV38AlbREntfrom, AV39AlbREntto, AV40TipEntCod, AV41Tipo, AV13AlmacenTejidoencrudoCliente_SDT, AV49Tot_TotEnt, AV51Tot_TotPe, AV53Tot_TotUti, AV55Tot_TotPu, AV57Tot_SaldoU, AV59Tot_SaldoP, AV47AlmacenTejidoencrudoCliente_SDTjsonjson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV72Pgmname = "AlmacenTejidoencrudoCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvalue_totent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totent_Enabled), 5, 0), true);
      edtavTotvalue_totpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpe_Enabled), 5, 0), true);
      edtavTotvalue_totuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totuti_Enabled), 5, 0), true);
      edtavTotvalue_totpu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpu_Enabled), 5, 0), true);
      edtavTotvalue_saldou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldou_Enabled), 5, 0), true);
      edtavTotvalue_saldop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldop_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182DH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Almacentejidoencrudocliente_sdt"), AV13AlmacenTejidoencrudoCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vALMACENTEJIDOENCRUDOCLIENTE_SDT"), AV13AlmacenTejidoencrudoCliente_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29Albrfen"), 0) ;
         wcpOAV30Albrfen_to2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Albrfen_to2"), 0) ;
         wcpOAV31Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Clicod_to2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV33AlbRef") ;
         wcpOAV34AlbRef_to2 = httpContext.cgiGet( sPrefix+"wcpOAV34AlbRef_to2") ;
         wcpOAV35AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36AlbRTartC_to2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37AlbrEstIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37AlbrEstIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV38AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV38AlbREntfrom") ;
         wcpOAV39AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV39AlbREntto") ;
         wcpOAV40TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV41Tipo = httpContext.cgiGet( sPrefix+"wcpOAV41Tipo") ;
         AV41Tipo = httpContext.cgiGet( sPrefix+"vTIPO") ;
         AV36AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vALBRTARTC_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV35AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vALBRTARTC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39AlbREntto = httpContext.cgiGet( sPrefix+"vALBRENTTO") ;
         AV38AlbREntfrom = httpContext.cgiGet( sPrefix+"vALBRENTFROM") ;
         AV34AlbRef_to2 = httpContext.cgiGet( sPrefix+"vALBREF_TO2") ;
         AV33AlbRef = httpContext.cgiGet( sPrefix+"vALBREF") ;
         AV30Albrfen_to2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"vALBRFEN_TO2"), 0) ;
         AV29Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"vALBRFEN"), 0) ;
         AV32Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
            AV63GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13AlmacenTejidoencrudoCliente_SDT.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
            {
               AV13AlmacenTejidoencrudoCliente_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)) );
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
         AV50TotValue_TotEnt = httpContext.cgiGet( edtavTotvalue_totent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_TotEnt", AV50TotValue_TotEnt);
         AV52TotValue_TotPe = httpContext.cgiGet( edtavTotvalue_totpe_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_TotPe", AV52TotValue_TotPe);
         AV54TotValue_TotUti = httpContext.cgiGet( edtavTotvalue_totuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValue_TotUti", AV54TotValue_TotUti);
         AV56TotValue_TotPu = httpContext.cgiGet( edtavTotvalue_totpu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValue_TotPu", AV56TotValue_TotPu);
         AV58TotValue_SaldoU = httpContext.cgiGet( edtavTotvalue_saldou_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotValue_SaldoU", AV58TotValue_SaldoU);
         AV60TotValue_SaldoP = httpContext.cgiGet( edtavTotvalue_saldop_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TotValue_SaldoP", AV60TotValue_SaldoP);
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_43_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         AV63GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_43_idx > 0 )
         {
            AV63GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13AlmacenTejidoencrudoCliente_SDT.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
            {
               AV13AlmacenTejidoencrudoCliente_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)) );
            }
            if ( ( AV63GXV1 > 0 ) && ( AV13AlmacenTejidoencrudoCliente_SDT.size() >= AV63GXV1 ) )
            {
               AV13AlmacenTejidoencrudoCliente_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlmacenTejidoencrudoCliente_WC");
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacentejidoencrudocliente_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182DH2 ();
      if (returnInSub) return;
   }

   public void e182DH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV44Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoencrudocliente_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoencrudocliente_wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV42EmprNom = GXv_char3[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
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
      GXt_char1 = AV45AlmacenTejidoencrudoCliente_SDTjson ;
      GXv_char4[0] = AV28Emprcod ;
      GXv_char3[0] = " " ;
      GXv_int7[0] = AV31Clicod ;
      GXv_int8[0] = AV32Clicod_to2 ;
      GXv_date9[0] = AV29Albrfen ;
      GXv_date10[0] = AV30Albrfen_to2 ;
      GXv_char2[0] = AV33AlbRef ;
      GXv_char11[0] = AV34AlbRef_to2 ;
      GXv_char12[0] = AV38AlbREntfrom ;
      GXv_char13[0] = AV39AlbREntto ;
      GXv_int14[0] = AV40TipEntCod ;
      GXv_int15[0] = AV35AlbRTartC ;
      GXv_int16[0] = AV36AlbRTartC_to2 ;
      GXv_char17[0] = AV41Tipo ;
      GXv_char18[0] = GXt_char1 ;
      new app.almacentejidoencrudocliente_prc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char2, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_char18) ;
      almacentejidoencrudocliente_wc_impl.this.AV28Emprcod = GXv_char4[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV31Clicod = GXv_int7[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV32Clicod_to2 = GXv_int8[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV29Albrfen = GXv_date9[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV30Albrfen_to2 = GXv_date10[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV33AlbRef = GXv_char2[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV34AlbRef_to2 = GXv_char11[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV38AlbREntfrom = GXv_char12[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV39AlbREntto = GXv_char13[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV40TipEntCod = GXv_int14[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV35AlbRTartC = GXv_int15[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV36AlbRTartC_to2 = GXv_int16[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV41Tipo = GXv_char17[0] ;
      almacentejidoencrudocliente_wc_impl.this.GXt_char1 = GXv_char18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod_to2), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Albrfen", localUtil.format(AV29Albrfen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albrfen_to2", localUtil.format(AV30Albrfen_to2, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbRef", AV33AlbRef);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbRef_to2", AV34AlbRef_to2);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38AlbREntfrom", AV38AlbREntfrom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39AlbREntto", AV39AlbREntto);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntCod), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbRTartC), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbRTartC_to2), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipo", AV41Tipo);
      AV45AlmacenTejidoencrudoCliente_SDTjson = GXt_char1 ;
      AV13AlmacenTejidoencrudoCliente_SDT.fromJSonString(AV45AlmacenTejidoencrudoCliente_SDTjson, null);
      gx_BV43 = true ;
   }

   public void e192DH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext19[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext19) ;
      AV6WWPContext = GXv_SdtWWPContext19[0] ;
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
      if ( GXutil.strcmp(AV20Session.getValue("AlmacenTejidoencrudoCliente_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("AlmacenTejidoencrudoCliente_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavAlmacentejidoencrudocliente_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clicod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__clinom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totent_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpe_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpe_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totuti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totuti_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__totpu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__totpu_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldou_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldou_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavAlmacentejidoencrudocliente_sdt__saldop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlmacentejidoencrudocliente_sdt__saldop_Visible), 5, 0), !bGXsfl_43_Refreshing);
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

   public void e132DH2( )
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

   public void e142DH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e202DH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV13AlmacenTejidoencrudoCliente_SDT.size() )
      {
         AV13AlmacenTejidoencrudoCliente_SDT.currentItem( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)) );
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
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void e152DH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoCliente_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122DH2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoCliente_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV72Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenTejidoencrudoCliente_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char18[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AlmacenTejidoencrudoCliente_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char18) ;
         almacentejidoencrudocliente_wc_impl.this.GXt_char1 = GXv_char18[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV22ManageFiltersXml) ;
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

   public void e162DH2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV46websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoCliente_SDT", ""), AV47AlmacenTejidoencrudoCliente_SDTjsonjson);
      GXv_char18[0] = AV14ExcelFilename ;
      GXv_char17[0] = AV15ErrorMessage ;
      new app.almacentejidoencrudocliente_wcexport(remoteHandle, context).execute( GXv_char18, GXv_char17) ;
      almacentejidoencrudocliente_wc_impl.this.AV14ExcelFilename = GXv_char18[0] ;
      almacentejidoencrudocliente_wc_impl.this.AV15ErrorMessage = GXv_char17[0] ;
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

   public void e172DH2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV46websession.setValue(httpContext.getMessage( "&AlmacenTejidoencrudoCliente_SDT", ""), AV47AlmacenTejidoencrudoCliente_SDTjsonjson);
      callWebObject(formatLink("app.almacentejidoencrudocliente_wcexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__TotEnt", "", "Tot. Und. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__TotPe", "", "Tot. Pzs. Ent.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__TotUti", "", "Tot. Und. Uti.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__TotPu", "", "Tot. Pzs. Uti.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__SaldoU", "", "Saldo Und.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlmacenTejidoencrudoCliente_SDT__SaldoP", "", "Saldo Pzs.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char18[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenTejidoencrudoCliente_WCColumnsSelector", GXv_char18) ;
      almacentejidoencrudocliente_wc_impl.this.GXt_char1 = GXv_char18[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AlmacenTejidoencrudoCliente_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
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
      if ( GXutil.strcmp(AV20Session.getValue(AV72Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV72Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV72Pgmname+"GridState"), null, null);
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
      AV73GXV10 = 1 ;
      while ( AV73GXV10 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV10));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV73GXV10 = (int)(AV73GXV10+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV72Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29Albrfen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRFEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV29Albrfen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Albrfen_to2)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRFEN_TO2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV30Albrfen_to2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV32Clicod_to2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32Clicod_to2, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV33AlbRef)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33AlbRef );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV34AlbRef_to2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF_TO2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV34AlbRef_to2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV35AlbRTartC) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRTARTC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35AlbRTartC, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV36AlbRTartC_to2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRTARTC_TO2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36AlbRTartC_to2, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV37AlbrEstIN) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRESTIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37AlbrEstIN, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38AlbREntfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38AlbREntfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV39AlbREntto)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENTTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39AlbREntto );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV40TipEntCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPENTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40TipEntCod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV41Tipo)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV41Tipo );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV49Tot_TotEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_TotEnt", GXutil.ltrimstr( AV49Tot_TotEnt, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTENT", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99")));
      AV51Tot_TotPe = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_TotPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tot_TotPe), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9")));
      AV53Tot_TotUti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Tot_TotUti", GXutil.ltrimstr( AV53Tot_TotUti, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUTI", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99")));
      AV55Tot_TotPu = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Tot_TotPu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Tot_TotPu), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9")));
      AV57Tot_SaldoU = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tot_SaldoU", GXutil.ltrimstr( AV57Tot_SaldoU, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOU", getSecureSignedToken( sPrefix, localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99")));
      AV59Tot_SaldoP = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Tot_SaldoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Tot_SaldoP), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV74GXV11 = 1 ;
      while ( AV74GXV11 <= AV13AlmacenTejidoencrudoCliente_SDT.size() )
      {
         AV48AlmacenTejidoencrudoCliente_SDTItem = (app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV74GXV11));
         AV49Tot_TotEnt = AV49Tot_TotEnt.add((AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_TotEnt", GXutil.ltrimstr( AV49Tot_TotEnt, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTENT", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99")));
         AV51Tot_TotPe = (long)(AV51Tot_TotPe+(AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_TotPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Tot_TotPe), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9")));
         AV53Tot_TotUti = AV53Tot_TotUti.add((AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Tot_TotUti", GXutil.ltrimstr( AV53Tot_TotUti, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTUTI", getSecureSignedToken( sPrefix, localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99")));
         AV55Tot_TotPu = (long)(AV55Tot_TotPu+(AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Tot_TotPu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Tot_TotPu), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9")));
         AV57Tot_SaldoU = AV57Tot_SaldoU.add((AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Tot_SaldoU", GXutil.ltrimstr( AV57Tot_SaldoU, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOU", getSecureSignedToken( sPrefix, localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99")));
         AV59Tot_SaldoP = (long)(AV59Tot_SaldoP+(AV48AlmacenTejidoencrudoCliente_SDTItem.getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Tot_SaldoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Tot_SaldoP), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9")));
         AV74GXV11 = (int)(AV74GXV11+1) ;
      }
      AV50TotValue_TotEnt = localUtil.format( AV49Tot_TotEnt, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_TotEnt", AV50TotValue_TotEnt);
      AV52TotValue_TotPe = localUtil.format( DecimalUtil.doubleToDec(AV51Tot_TotPe), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_TotPe", AV52TotValue_TotPe);
      AV54TotValue_TotUti = localUtil.format( AV53Tot_TotUti, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValue_TotUti", AV54TotValue_TotUti);
      AV56TotValue_TotPu = localUtil.format( DecimalUtil.doubleToDec(AV55Tot_TotPu), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValue_TotPu", AV56TotValue_TotPu);
      AV58TotValue_SaldoU = localUtil.format( AV57Tot_SaldoU, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotValue_SaldoU", AV58TotValue_SaldoU);
      AV60TotValue_SaldoP = localUtil.format( DecimalUtil.doubleToDec(AV59Tot_SaldoP), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TotValue_SaldoP", AV60TotValue_SaldoP);
   }

   public void wb_table2_54_2DH2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totent_Internalname, httpContext.getMessage( "Tot Value_Tot Ent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totent_Internalname, AV50TotValue_TotEnt, GXutil.rtrim( localUtil.format( AV50TotValue_TotEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpe_Internalname, httpContext.getMessage( "Tot Value_Tot Pe", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpe_Internalname, AV52TotValue_TotPe, GXutil.rtrim( localUtil.format( AV52TotValue_TotPe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpe_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpe_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totuti_Internalname, httpContext.getMessage( "Tot Value_Tot Uti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totuti_Internalname, AV54TotValue_TotUti, GXutil.rtrim( localUtil.format( AV54TotValue_TotUti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpu_Internalname, httpContext.getMessage( "Tot Value_Tot Pu", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpu_Internalname, AV56TotValue_TotPu, GXutil.rtrim( localUtil.format( AV56TotValue_TotPu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpu_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpu_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_saldou_Internalname, httpContext.getMessage( "Tot Value_Saldo U", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_saldou_Internalname, AV58TotValue_SaldoU, GXutil.rtrim( localUtil.format( AV58TotValue_SaldoU, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_saldou_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_saldou_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_saldop_Internalname, httpContext.getMessage( "Tot Value_Saldo P", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_saldop_Internalname, AV60TotValue_SaldoP, GXutil.rtrim( localUtil.format( AV60TotValue_SaldoP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_saldop_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_saldop_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_54_2DH2e( true) ;
      }
      else
      {
         wb_table2_54_2DH2e( false) ;
      }
   }

   public void wb_table1_25_2DH2( boolean wbgen )
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
         wb_table3_30_2DH2( true) ;
      }
      else
      {
         wb_table3_30_2DH2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_2DH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_2DH2e( true) ;
      }
      else
      {
         wb_table1_25_2DH2e( false) ;
      }
   }

   public void wb_table3_30_2DH2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AlmacenTejidoencrudoCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_2DH2e( true) ;
      }
      else
      {
         wb_table3_30_2DH2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29Albrfen = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Albrfen", localUtil.format(AV29Albrfen, "99/99/99"));
      AV30Albrfen_to2 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albrfen_to2", localUtil.format(AV30Albrfen_to2, "99/99/99"));
      AV31Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Clicod), 6, 0));
      AV32Clicod_to2 = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod_to2), 6, 0));
      AV33AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbRef", AV33AlbRef);
      AV34AlbRef_to2 = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbRef_to2", AV34AlbRef_to2);
      AV35AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbRTartC), 4, 0));
      AV36AlbRTartC_to2 = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbRTartC_to2), 4, 0));
      AV37AlbrEstIN = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbrEstIN", GXutil.str( AV37AlbrEstIN, 1, 0));
      AV38AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38AlbREntfrom", AV38AlbREntfrom);
      AV39AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39AlbREntto", AV39AlbREntto);
      AV40TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntCod), 4, 0));
      AV41Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipo", AV41Tipo);
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
      pa2DH2( ) ;
      ws2DH2( ) ;
      we2DH2( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29Albrfen = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30Albrfen_to2 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31Clicod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32Clicod_to2 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34AlbRef_to2 = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV35AlbRTartC = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV36AlbRTartC_to2 = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV37AlbrEstIN = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV38AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV39AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV40TipEntCod = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV41Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DH2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "almacentejidoencrudocliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DH2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29Albrfen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Albrfen", localUtil.format(AV29Albrfen, "99/99/99"));
         AV30Albrfen_to2 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albrfen_to2", localUtil.format(AV30Albrfen_to2, "99/99/99"));
         AV31Clicod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Clicod), 6, 0));
         AV32Clicod_to2 = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod_to2), 6, 0));
         AV33AlbRef = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbRef", AV33AlbRef);
         AV34AlbRef_to2 = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbRef_to2", AV34AlbRef_to2);
         AV35AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbRTartC), 4, 0));
         AV36AlbRTartC_to2 = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbRTartC_to2), 4, 0));
         AV37AlbrEstIN = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbrEstIN", GXutil.str( AV37AlbrEstIN, 1, 0));
         AV38AlbREntfrom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38AlbREntfrom", AV38AlbREntfrom);
         AV39AlbREntto = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39AlbREntto", AV39AlbREntto);
         AV40TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntCod), 4, 0));
         AV41Tipo = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipo", AV41Tipo);
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29Albrfen"), 0) ;
      wcpOAV30Albrfen_to2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Albrfen_to2"), 0) ;
      wcpOAV31Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Clicod_to2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV33AlbRef") ;
      wcpOAV34AlbRef_to2 = httpContext.cgiGet( sPrefix+"wcpOAV34AlbRef_to2") ;
      wcpOAV35AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36AlbRTartC_to2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37AlbrEstIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37AlbrEstIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV38AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV38AlbREntfrom") ;
      wcpOAV39AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV39AlbREntto") ;
      wcpOAV40TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV41Tipo = httpContext.cgiGet( sPrefix+"wcpOAV41Tipo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV29Albrfen), GXutil.resetTime(wcpOAV29Albrfen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV30Albrfen_to2), GXutil.resetTime(wcpOAV30Albrfen_to2)) ) || ( AV31Clicod != wcpOAV31Clicod ) || ( AV32Clicod_to2 != wcpOAV32Clicod_to2 ) || ( GXutil.strcmp(AV33AlbRef, wcpOAV33AlbRef) != 0 ) || ( GXutil.strcmp(AV34AlbRef_to2, wcpOAV34AlbRef_to2) != 0 ) || ( AV35AlbRTartC != wcpOAV35AlbRTartC ) || ( AV36AlbRTartC_to2 != wcpOAV36AlbRTartC_to2 ) || ( AV37AlbrEstIN != wcpOAV37AlbrEstIN ) || ( GXutil.strcmp(AV38AlbREntfrom, wcpOAV38AlbREntfrom) != 0 ) || ( GXutil.strcmp(AV39AlbREntto, wcpOAV39AlbREntto) != 0 ) || ( AV40TipEntCod != wcpOAV40TipEntCod ) || ( GXutil.strcmp(AV41Tipo, wcpOAV41Tipo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29Albrfen = AV29Albrfen ;
      wcpOAV30Albrfen_to2 = AV30Albrfen_to2 ;
      wcpOAV31Clicod = AV31Clicod ;
      wcpOAV32Clicod_to2 = AV32Clicod_to2 ;
      wcpOAV33AlbRef = AV33AlbRef ;
      wcpOAV34AlbRef_to2 = AV34AlbRef_to2 ;
      wcpOAV35AlbRTartC = AV35AlbRTartC ;
      wcpOAV36AlbRTartC_to2 = AV36AlbRTartC_to2 ;
      wcpOAV37AlbrEstIN = AV37AlbrEstIN ;
      wcpOAV38AlbREntfrom = AV38AlbREntfrom ;
      wcpOAV39AlbREntto = AV39AlbREntto ;
      wcpOAV40TipEntCod = AV40TipEntCod ;
      wcpOAV41Tipo = AV41Tipo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV29Albrfen = httpContext.cgiGet( sPrefix+"AV29Albrfen_CTRL") ;
      if ( GXutil.len( sCtrlAV29Albrfen) > 0 )
      {
         AV29Albrfen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV29Albrfen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Albrfen", localUtil.format(AV29Albrfen, "99/99/99"));
      }
      else
      {
         AV29Albrfen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV29Albrfen_PARM"), 0) ;
      }
      sCtrlAV30Albrfen_to2 = httpContext.cgiGet( sPrefix+"AV30Albrfen_to2_CTRL") ;
      if ( GXutil.len( sCtrlAV30Albrfen_to2) > 0 )
      {
         AV30Albrfen_to2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30Albrfen_to2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albrfen_to2", localUtil.format(AV30Albrfen_to2, "99/99/99"));
      }
      else
      {
         AV30Albrfen_to2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30Albrfen_to2_PARM"), 0) ;
      }
      sCtrlAV31Clicod = httpContext.cgiGet( sPrefix+"AV31Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV31Clicod) > 0 )
      {
         AV31Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Clicod), 6, 0));
      }
      else
      {
         AV31Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32Clicod_to2 = httpContext.cgiGet( sPrefix+"AV32Clicod_to2_CTRL") ;
      if ( GXutil.len( sCtrlAV32Clicod_to2) > 0 )
      {
         AV32Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Clicod_to2), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod_to2), 6, 0));
      }
      else
      {
         AV32Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Clicod_to2_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33AlbRef = httpContext.cgiGet( sPrefix+"AV33AlbRef_CTRL") ;
      if ( GXutil.len( sCtrlAV33AlbRef) > 0 )
      {
         AV33AlbRef = httpContext.cgiGet( sCtrlAV33AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbRef", AV33AlbRef);
      }
      else
      {
         AV33AlbRef = httpContext.cgiGet( sPrefix+"AV33AlbRef_PARM") ;
      }
      sCtrlAV34AlbRef_to2 = httpContext.cgiGet( sPrefix+"AV34AlbRef_to2_CTRL") ;
      if ( GXutil.len( sCtrlAV34AlbRef_to2) > 0 )
      {
         AV34AlbRef_to2 = httpContext.cgiGet( sCtrlAV34AlbRef_to2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbRef_to2", AV34AlbRef_to2);
      }
      else
      {
         AV34AlbRef_to2 = httpContext.cgiGet( sPrefix+"AV34AlbRef_to2_PARM") ;
      }
      sCtrlAV35AlbRTartC = httpContext.cgiGet( sPrefix+"AV35AlbRTartC_CTRL") ;
      if ( GXutil.len( sCtrlAV35AlbRTartC) > 0 )
      {
         AV35AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35AlbRTartC), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbRTartC), 4, 0));
      }
      else
      {
         AV35AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35AlbRTartC_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36AlbRTartC_to2 = httpContext.cgiGet( sPrefix+"AV36AlbRTartC_to2_CTRL") ;
      if ( GXutil.len( sCtrlAV36AlbRTartC_to2) > 0 )
      {
         AV36AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36AlbRTartC_to2), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36AlbRTartC_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbRTartC_to2), 4, 0));
      }
      else
      {
         AV36AlbRTartC_to2 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36AlbRTartC_to2_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37AlbrEstIN = httpContext.cgiGet( sPrefix+"AV37AlbrEstIN_CTRL") ;
      if ( GXutil.len( sCtrlAV37AlbrEstIN) > 0 )
      {
         AV37AlbrEstIN = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37AlbrEstIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37AlbrEstIN", GXutil.str( AV37AlbrEstIN, 1, 0));
      }
      else
      {
         AV37AlbrEstIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37AlbrEstIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV38AlbREntfrom = httpContext.cgiGet( sPrefix+"AV38AlbREntfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV38AlbREntfrom) > 0 )
      {
         AV38AlbREntfrom = httpContext.cgiGet( sCtrlAV38AlbREntfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38AlbREntfrom", AV38AlbREntfrom);
      }
      else
      {
         AV38AlbREntfrom = httpContext.cgiGet( sPrefix+"AV38AlbREntfrom_PARM") ;
      }
      sCtrlAV39AlbREntto = httpContext.cgiGet( sPrefix+"AV39AlbREntto_CTRL") ;
      if ( GXutil.len( sCtrlAV39AlbREntto) > 0 )
      {
         AV39AlbREntto = httpContext.cgiGet( sCtrlAV39AlbREntto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39AlbREntto", AV39AlbREntto);
      }
      else
      {
         AV39AlbREntto = httpContext.cgiGet( sPrefix+"AV39AlbREntto_PARM") ;
      }
      sCtrlAV40TipEntCod = httpContext.cgiGet( sPrefix+"AV40TipEntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV40TipEntCod) > 0 )
      {
         AV40TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40TipEntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipEntCod), 4, 0));
      }
      else
      {
         AV40TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40TipEntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV41Tipo = httpContext.cgiGet( sPrefix+"AV41Tipo_CTRL") ;
      if ( GXutil.len( sCtrlAV41Tipo) > 0 )
      {
         AV41Tipo = httpContext.cgiGet( sCtrlAV41Tipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Tipo", AV41Tipo);
      }
      else
      {
         AV41Tipo = httpContext.cgiGet( sPrefix+"AV41Tipo_PARM") ;
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
      pa2DH2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DH2( ) ;
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
      ws2DH2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Albrfen_PARM", localUtil.dtoc( AV29Albrfen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Albrfen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Albrfen_CTRL", GXutil.rtrim( sCtrlAV29Albrfen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Albrfen_to2_PARM", localUtil.dtoc( AV30Albrfen_to2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Albrfen_to2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Albrfen_to2_CTRL", GXutil.rtrim( sCtrlAV30Albrfen_to2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV31Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Clicod_CTRL", GXutil.rtrim( sCtrlAV31Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Clicod_to2_PARM", GXutil.ltrim( localUtil.ntoc( AV32Clicod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Clicod_to2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Clicod_to2_CTRL", GXutil.rtrim( sCtrlAV32Clicod_to2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33AlbRef_PARM", GXutil.rtrim( AV33AlbRef));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33AlbRef)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33AlbRef_CTRL", GXutil.rtrim( sCtrlAV33AlbRef));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34AlbRef_to2_PARM", GXutil.rtrim( AV34AlbRef_to2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34AlbRef_to2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34AlbRef_to2_CTRL", GXutil.rtrim( sCtrlAV34AlbRef_to2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35AlbRTartC_PARM", GXutil.ltrim( localUtil.ntoc( AV35AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35AlbRTartC)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35AlbRTartC_CTRL", GXutil.rtrim( sCtrlAV35AlbRTartC));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36AlbRTartC_to2_PARM", GXutil.ltrim( localUtil.ntoc( AV36AlbRTartC_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36AlbRTartC_to2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36AlbRTartC_to2_CTRL", GXutil.rtrim( sCtrlAV36AlbRTartC_to2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37AlbrEstIN_PARM", GXutil.ltrim( localUtil.ntoc( AV37AlbrEstIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37AlbrEstIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37AlbrEstIN_CTRL", GXutil.rtrim( sCtrlAV37AlbrEstIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38AlbREntfrom_PARM", GXutil.rtrim( AV38AlbREntfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38AlbREntfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38AlbREntfrom_CTRL", GXutil.rtrim( sCtrlAV38AlbREntfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39AlbREntto_PARM", GXutil.rtrim( AV39AlbREntto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39AlbREntto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39AlbREntto_CTRL", GXutil.rtrim( sCtrlAV39AlbREntto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40TipEntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV40TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40TipEntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40TipEntCod_CTRL", GXutil.rtrim( sCtrlAV40TipEntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Tipo_PARM", GXutil.rtrim( AV41Tipo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41Tipo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Tipo_CTRL", GXutil.rtrim( sCtrlAV41Tipo));
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
      we2DH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551952", true, true);
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
      httpContext.AddJavascriptSource("almacentejidoencrudocliente_wc.js", "?202682115551953", false, true);
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
      edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU_"+sGXsfl_43_idx ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU_"+sGXsfl_43_fel_idx ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb2DH0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__clicod_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__clinom_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__totent_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__totent_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__totent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totent_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totpe_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__totpe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totpe_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totuti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__totuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totuti_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totpu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__totpu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totpu_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__saldou_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled!=0) ? localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou(), "ZZZZZ9.99") : localUtil.format( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__saldou_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__saldou_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__saldop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)AV13AlmacenTejidoencrudoCliente_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlmacentejidoencrudocliente_sdt__saldop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__saldop_Visible),Integer.valueOf(edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DH2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Und. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totpe_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Pzs. Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totuti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Und. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__totpu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Pzs. Uti.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__saldou_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Saldo Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlmacentejidoencrudocliente_sdt__saldop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totpe_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totuti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__totpu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__saldou_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlmacentejidoencrudocliente_sdt__saldop_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD" ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM" ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT" ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE" ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI" ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU" ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU" ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname = sPrefix+"ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP" ;
      edtavTotvalue_totent_Internalname = sPrefix+"vTOTVALUE_TOTENT" ;
      edtavTotvalue_totpe_Internalname = sPrefix+"vTOTVALUE_TOTPE" ;
      edtavTotvalue_totuti_Internalname = sPrefix+"vTOTVALUE_TOTUTI" ;
      edtavTotvalue_totpu_Internalname = sPrefix+"vTOTVALUE_TOTPU" ;
      edtavTotvalue_saldou_Internalname = sPrefix+"vTOTVALUE_SALDOU" ;
      edtavTotvalue_saldop_Internalname = sPrefix+"vTOTVALUE_SALDOP" ;
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
      edtavAlmacentejidoencrudocliente_sdt__saldop_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Jsonclick = "" ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_saldop_Jsonclick = "" ;
      edtavTotvalue_saldop_Enabled = 1 ;
      edtavTotvalue_saldou_Jsonclick = "" ;
      edtavTotvalue_saldou_Enabled = 1 ;
      edtavTotvalue_totpu_Jsonclick = "" ;
      edtavTotvalue_totpu_Enabled = 1 ;
      edtavTotvalue_totuti_Jsonclick = "" ;
      edtavTotvalue_totuti_Enabled = 1 ;
      edtavTotvalue_totpe_Jsonclick = "" ;
      edtavTotvalue_totpe_Enabled = 1 ;
      edtavTotvalue_totent_Jsonclick = "" ;
      edtavTotvalue_totent_Enabled = 1 ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Visible = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled = -1 ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled = -1 ;
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
      Ddo_grid_Columnssortvalues = "|||||||" ;
      Ddo_grid_Columnids = "0:AlmacenTejidoencrudoCliente_SDT__Clicod|1:AlmacenTejidoencrudoCliente_SDT__CliNom|2:AlmacenTejidoencrudoCliente_SDT__TotEnt|3:AlmacenTejidoencrudoCliente_SDT__TotPe|4:AlmacenTejidoencrudoCliente_SDT__TotUti|5:AlmacenTejidoencrudoCliente_SDT__TotPu|6:AlmacenTejidoencrudoCliente_SDT__SaldoU|7:AlmacenTejidoencrudoCliente_SDT__SaldoP" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV37AlbrEstIN',fld:'vALBRESTIN',pic:'9'},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV13AlmacenTejidoencrudoCliente_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV50TotValue_TotEnt',fld:'vTOTVALUE_TOTENT',pic:''},{av:'AV52TotValue_TotPe',fld:'vTOTVALUE_TOTPE',pic:''},{av:'AV54TotValue_TotUti',fld:'vTOTVALUE_TOTUTI',pic:''},{av:'AV56TotValue_TotPu',fld:'vTOTVALUE_TOTPU',pic:''},{av:'AV58TotValue_SaldoU',fld:'vTOTVALUE_SALDOU',pic:''},{av:'AV60TotValue_SaldoP',fld:'vTOTVALUE_SALDOP',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132DH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV37AlbrEstIN',fld:'vALBRESTIN',pic:'9'},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV13AlmacenTejidoencrudoCliente_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142DH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV37AlbrEstIN',fld:'vALBRESTIN',pic:'9'},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV13AlmacenTejidoencrudoCliente_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202DH2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152DH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV37AlbrEstIN',fld:'vALBRESTIN',pic:'9'},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV13AlmacenTejidoencrudoCliente_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV50TotValue_TotEnt',fld:'vTOTVALUE_TOTENT',pic:''},{av:'AV52TotValue_TotPe',fld:'vTOTVALUE_TOTPE',pic:''},{av:'AV54TotValue_TotUti',fld:'vTOTVALUE_TOTUTI',pic:''},{av:'AV56TotValue_TotPu',fld:'vTOTVALUE_TOTPU',pic:''},{av:'AV58TotValue_SaldoU',fld:'vTOTVALUE_SALDOU',pic:''},{av:'AV60TotValue_SaldoP',fld:'vTOTVALUE_SALDOP',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e122DH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV37AlbrEstIN',fld:'vALBRESTIN',pic:'9'},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV13AlmacenTejidoencrudoCliente_SDT',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDT',grid:43,pic:'',hsh:true},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__CLINOM',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTENT',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPE',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTUTI',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__TOTPU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOU',prop:'Visible'},{ctrl:'ALMACENTEJIDOENCRUDOCLIENTE_SDT__SALDOP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV49Tot_TotEnt',fld:'vTOT_TOTENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_TotPe',fld:'vTOT_TOTPE',pic:'ZZZZZ9',hsh:true},{av:'AV53Tot_TotUti',fld:'vTOT_TOTUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV55Tot_TotPu',fld:'vTOT_TOTPU',pic:'ZZZZZ9',hsh:true},{av:'AV57Tot_SaldoU',fld:'vTOT_SALDOU',pic:'ZZZZZ9.99',hsh:true},{av:'AV59Tot_SaldoP',fld:'vTOT_SALDOP',pic:'ZZZZZ9',hsh:true},{av:'AV50TotValue_TotEnt',fld:'vTOTVALUE_TOTENT',pic:''},{av:'AV52TotValue_TotPe',fld:'vTOTVALUE_TOTPE',pic:''},{av:'AV54TotValue_TotUti',fld:'vTOTVALUE_TOTUTI',pic:''},{av:'AV56TotValue_TotPu',fld:'vTOTVALUE_TOTPU',pic:''},{av:'AV58TotValue_SaldoU',fld:'vTOTVALUE_SALDOU',pic:''},{av:'AV60TotValue_SaldoP',fld:'vTOTVALUE_SALDOP',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e112DH1',iparms:[{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV41Tipo',fld:'vTIPO',pic:''}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV41Tipo',fld:'vTIPO',pic:''},{av:'AV36AlbRTartC_to2',fld:'vALBRTARTC_TO2',pic:'ZZZ9'},{av:'AV35AlbRTartC',fld:'vALBRTARTC',pic:'ZZZ9'},{av:'AV40TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'AV39AlbREntto',fld:'vALBRENTTO',pic:''},{av:'AV38AlbREntfrom',fld:'vALBRENTFROM',pic:''},{av:'AV34AlbRef_to2',fld:'vALBREF_TO2',pic:''},{av:'AV33AlbRef',fld:'vALBREF',pic:''},{av:'AV30Albrfen_to2',fld:'vALBRFEN_TO2',pic:''},{av:'AV29Albrfen',fld:'vALBRFEN',pic:''},{av:'AV32Clicod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV31Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e162DH2',iparms:[{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e172DH2',iparms:[{av:'AV47AlmacenTejidoencrudoCliente_SDTjsonjson',fld:'vALMACENTEJIDOENCRUDOCLIENTE_SDTJSONJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv9',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV29Albrfen = GXutil.nullDate() ;
      wcpOAV30Albrfen_to2 = GXutil.nullDate() ;
      wcpOAV33AlbRef = "" ;
      wcpOAV34AlbRef_to2 = "" ;
      wcpOAV38AlbREntfrom = "" ;
      wcpOAV39AlbREntto = "" ;
      wcpOAV41Tipo = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV29Albrfen = GXutil.nullDate() ;
      AV30Albrfen_to2 = GXutil.nullDate() ;
      AV33AlbRef = "" ;
      AV34AlbRef_to2 = "" ;
      AV38AlbREntfrom = "" ;
      AV39AlbREntto = "" ;
      AV41Tipo = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV72Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13AlmacenTejidoencrudoCliente_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem>(app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem.class, "AlmacenTejidoencrudoCliente_SDTItem", "TexplusNET", remoteHandle);
      AV49Tot_TotEnt = DecimalUtil.ZERO ;
      AV53Tot_TotUti = DecimalUtil.ZERO ;
      AV57Tot_SaldoU = DecimalUtil.ZERO ;
      AV47AlmacenTejidoencrudoCliente_SDTjsonjson = "" ;
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
      AV50TotValue_TotEnt = "" ;
      AV52TotValue_TotPe = "" ;
      AV54TotValue_TotUti = "" ;
      AV56TotValue_TotPu = "" ;
      AV58TotValue_SaldoU = "" ;
      AV60TotValue_SaldoP = "" ;
      hsh = "" ;
      AV44Station = "" ;
      AV42EmprNom = "" ;
      AV43UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV45AlmacenTejidoencrudoCliente_SDTjson = "" ;
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
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext19 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV46websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char17 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char18 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV48AlmacenTejidoencrudoCliente_SDTItem = new app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29Albrfen = "" ;
      sCtrlAV30Albrfen_to2 = "" ;
      sCtrlAV31Clicod = "" ;
      sCtrlAV32Clicod_to2 = "" ;
      sCtrlAV33AlbRef = "" ;
      sCtrlAV34AlbRef_to2 = "" ;
      sCtrlAV35AlbRTartC = "" ;
      sCtrlAV36AlbRTartC_to2 = "" ;
      sCtrlAV37AlbrEstIN = "" ;
      sCtrlAV38AlbREntfrom = "" ;
      sCtrlAV39AlbREntto = "" ;
      sCtrlAV40TipEntCod = "" ;
      sCtrlAV41Tipo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV72Pgmname = "AlmacenTejidoencrudoCliente_WC" ;
      /* GeneXus formulas. */
      AV72Pgmname = "AlmacenTejidoencrudoCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totent_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled = 0 ;
      edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled = 0 ;
      edtavTotvalue_totent_Enabled = 0 ;
      edtavTotvalue_totpe_Enabled = 0 ;
      edtavTotvalue_totuti_Enabled = 0 ;
      edtavTotvalue_totpu_Enabled = 0 ;
      edtavTotvalue_saldou_Enabled = 0 ;
      edtavTotvalue_saldop_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV37AlbrEstIN ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV37AlbrEstIN ;
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
   private short wcpOAV35AlbRTartC ;
   private short wcpOAV36AlbRTartC_to2 ;
   private short wcpOAV40TipEntCod ;
   private short AV35AlbRTartC ;
   private short AV36AlbRTartC_to2 ;
   private short AV40TipEntCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private int wcpOAV31Clicod ;
   private int wcpOAV32Clicod_to2 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV31Clicod ;
   private int AV32Clicod_to2 ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV63GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavAlmacentejidoencrudocliente_sdt__clicod_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__clinom_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__totent_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__totpe_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__totuti_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__totpu_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__saldou_Enabled ;
   private int edtavAlmacentejidoencrudocliente_sdt__saldop_Enabled ;
   private int edtavTotvalue_totent_Enabled ;
   private int edtavTotvalue_totpe_Enabled ;
   private int edtavTotvalue_totuti_Enabled ;
   private int edtavTotvalue_totpu_Enabled ;
   private int edtavTotvalue_saldou_Enabled ;
   private int edtavTotvalue_saldop_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int edtavAlmacentejidoencrudocliente_sdt__clicod_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__clinom_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__totent_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__totpe_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__totuti_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__totpu_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__saldou_Visible ;
   private int edtavAlmacentejidoencrudocliente_sdt__saldop_Visible ;
   private int AV25PageToGo ;
   private int AV73GXV10 ;
   private int AV74GXV11 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV51Tot_TotPe ;
   private long AV55Tot_TotPu ;
   private long AV59Tot_SaldoP ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV49Tot_TotEnt ;
   private java.math.BigDecimal AV53Tot_TotUti ;
   private java.math.BigDecimal AV57Tot_SaldoU ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV33AlbRef ;
   private String wcpOAV34AlbRef_to2 ;
   private String wcpOAV38AlbREntfrom ;
   private String wcpOAV39AlbREntto ;
   private String wcpOAV41Tipo ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV33AlbRef ;
   private String AV34AlbRef_to2 ;
   private String AV38AlbREntfrom ;
   private String AV39AlbREntto ;
   private String AV41Tipo ;
   private String sGXsfl_43_idx="0001" ;
   private String AV72Pgmname ;
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
   private String edtavAlmacentejidoencrudocliente_sdt__clicod_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__clinom_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__totent_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__totpe_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__totuti_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__totpu_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__saldou_Internalname ;
   private String edtavAlmacentejidoencrudocliente_sdt__saldop_Internalname ;
   private String edtavTotvalue_totent_Internalname ;
   private String edtavTotvalue_totpe_Internalname ;
   private String edtavTotvalue_totuti_Internalname ;
   private String edtavTotvalue_totpu_Internalname ;
   private String edtavTotvalue_saldou_Internalname ;
   private String edtavTotvalue_saldop_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String AV44Station ;
   private String AV42EmprNom ;
   private String AV43UsurCod ;
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
   private String edtavTotvalue_totent_Jsonclick ;
   private String edtavTotvalue_totpe_Jsonclick ;
   private String edtavTotvalue_totuti_Jsonclick ;
   private String edtavTotvalue_totpu_Jsonclick ;
   private String edtavTotvalue_saldou_Jsonclick ;
   private String edtavTotvalue_saldop_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29Albrfen ;
   private String sCtrlAV30Albrfen_to2 ;
   private String sCtrlAV31Clicod ;
   private String sCtrlAV32Clicod_to2 ;
   private String sCtrlAV33AlbRef ;
   private String sCtrlAV34AlbRef_to2 ;
   private String sCtrlAV35AlbRTartC ;
   private String sCtrlAV36AlbRTartC_to2 ;
   private String sCtrlAV37AlbrEstIN ;
   private String sCtrlAV38AlbREntfrom ;
   private String sCtrlAV39AlbREntto ;
   private String sCtrlAV40TipEntCod ;
   private String sCtrlAV41Tipo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAlmacentejidoencrudocliente_sdt__clicod_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__clinom_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__totent_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__totpe_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__totuti_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__totpu_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__saldou_Jsonclick ;
   private String edtavAlmacentejidoencrudocliente_sdt__saldop_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV29Albrfen ;
   private java.util.Date wcpOAV30Albrfen_to2 ;
   private java.util.Date AV29Albrfen ;
   private java.util.Date AV30Albrfen_to2 ;
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
   private String AV47AlmacenTejidoencrudoCliente_SDTjsonjson ;
   private String AV45AlmacenTejidoencrudoCliente_SDTjson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV50TotValue_TotEnt ;
   private String AV52TotValue_TotPe ;
   private String AV54TotValue_TotUti ;
   private String AV56TotValue_TotPu ;
   private String AV58TotValue_SaldoU ;
   private String AV60TotValue_SaldoP ;
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
   private com.genexus.webpanels.WebSession AV46websession ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> AV13AlmacenTejidoencrudoCliente_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext19[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem AV48AlmacenTejidoencrudoCliente_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

