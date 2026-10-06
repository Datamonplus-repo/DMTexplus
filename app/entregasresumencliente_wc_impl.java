package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entregasresumencliente_wc_impl extends GXWebComponent
{
   public entregasresumencliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entregasresumencliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entregasresumencliente_wc_impl.class ));
   }

   public entregasresumencliente_wc_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV41Prio = httpContext.GetPar( "Prio") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Prio", AV41Prio);
               AV43Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod), 6, 0));
               AV44Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Clicod_to), 6, 0));
               AV6AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbProFch", localUtil.format(AV6AlbProFch, "99/99/99"));
               AV7AlbProFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch_To")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbProFch_To", localUtil.format(AV7AlbProFch_To, "99/99/99"));
               AV12BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
               AV13BarSer_To = httpContext.GetPar( "BarSer_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
               AV45AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbEncCli", AV45AlbEncCli);
               AV47AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbEncCli_to", AV47AlbEncCli_to);
               AV8BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
               AV9BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
               AV10BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
               AV11BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarColNum_To), 6, 0));
               AV73Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Barestreo", GXutil.str( AV73Barestreo, 1, 0));
               AV74Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Barestreoi", GXutil.str( AV74Barestreoi, 1, 0));
               AV75barestreof = (byte)(GXutil.lval( httpContext.GetPar( "barestreof"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75barestreof", GXutil.str( AV75barestreof, 1, 0));
               AV76TipDisCod = httpContext.GetPar( "TipDisCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipDisCod", AV76TipDisCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV41Prio,Integer.valueOf(AV43Clicod),Integer.valueOf(AV44Clicod_to),AV6AlbProFch,AV7AlbProFch_To,AV12BarSer,AV13BarSer_To,AV45AlbEncCli,AV47AlbEncCli_to,AV8BarColNom,AV9BarColNom_To,Integer.valueOf(AV10BarColNum),Integer.valueOf(AV11BarColNum_To),Byte.valueOf(AV73Barestreo),Byte.valueOf(AV74Barestreoi),Byte.valueOf(AV75barestreof),AV76TipDisCod});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV41Prio = httpContext.GetPar( "Prio") ;
      AV6AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV7AlbProFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch_To")) ;
      AV8BarColNom = httpContext.GetPar( "BarColNom") ;
      AV9BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
      AV10BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV11BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
      AV12BarSer = httpContext.GetPar( "BarSer") ;
      AV13BarSer_To = httpContext.GetPar( "BarSer_To") ;
      AV43Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV44Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV73Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
      AV74Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
      AV75barestreof = (byte)(GXutil.lval( httpContext.GetPar( "barestreof"))) ;
      AV76TipDisCod = httpContext.GetPar( "TipDisCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23SDTEntregasResumenClientes);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28ColumnsSelector);
      AV87Pgmname = httpContext.GetPar( "Pgmname") ;
      AV53TotTotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotTotKgs"), ".") ;
      AV55TotTotMts = CommonUtil.decimalVal( httpContext.GetPar( "TotTotMts"), ".") ;
      AV67TotTotPzs = GXutil.lval( httpContext.GetPar( "TotTotPzs")) ;
      AV57TotalKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotalKilos"), ".") ;
      AV58TotalMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotalMetros"), ".") ;
      AV59TotalPzs = (int)(GXutil.lval( httpContext.GetPar( "TotalPzs"))) ;
      AV42ImpCod = httpContext.GetPar( "ImpCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1QB2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Entregas Resumen de Cliente", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entregasresumencliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV41Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV43Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV6AlbProFch)),GXutil.URLEncode(GXutil.formatDateParm(AV7AlbProFch_To)),GXutil.URLEncode(GXutil.rtrim(AV12BarSer)),GXutil.URLEncode(GXutil.rtrim(AV13BarSer_To)),GXutil.URLEncode(GXutil.rtrim(AV45AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV47AlbEncCli_to)),GXutil.URLEncode(GXutil.rtrim(AV8BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV9BarColNom_To)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarColNum_To,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV73Barestreo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74Barestreoi,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV75barestreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV76TipDisCod))}, new String[] {"Emprcod","Prio","Clicod","Clicod_to","AlbProFch","AlbProFch_To","BarSer","BarSer_To","AlbEncCli","AlbEncCli_to","BarColNom","BarColNom_To","BarColNum","BarColNum_To","Barestreo","Barestreoi","barestreof","TipDisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTENTREGASRESUMENCLIENTES", getSecureSignedToken( sPrefix, AV23SDTEntregasResumenClientes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTKGS", getSecureSignedToken( sPrefix, localUtil.format( AV53TotTotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTMTS", getSecureSignedToken( sPrefix, localUtil.format( AV55TotTotMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67TotTotPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV57TotalKilos, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV58TotalMetros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59TotalPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42ImpCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtentregasresumenclientes", AV23SDTEntregasResumenClientes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtentregasresumenclientes", AV23SDTEntregasResumenClientes);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Sdtentregasresumenclientes", getSecureSignedToken( sPrefix, AV23SDTEntregasResumenClientes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV33GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV34GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41Prio", GXutil.rtrim( wcpOAV41Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV43Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV44Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6AlbProFch", localUtil.dtoc( wcpOAV6AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7AlbProFch_To", localUtil.dtoc( wcpOAV7AlbProFch_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarSer", GXutil.rtrim( wcpOAV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarSer_To", GXutil.rtrim( wcpOAV13BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45AlbEncCli", GXutil.rtrim( wcpOAV45AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47AlbEncCli_to", GXutil.rtrim( wcpOAV47AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarColNom", GXutil.rtrim( wcpOAV8BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarColNom_To", GXutil.rtrim( wcpOAV9BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV10BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarColNum_To", GXutil.ltrim( localUtil.ntoc( wcpOAV11BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73Barestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV73Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74Barestreoi", GXutil.ltrim( localUtil.ntoc( wcpOAV74Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75barestreof", GXutil.ltrim( localUtil.ntoc( wcpOAV75barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV76TipDisCod", GXutil.rtrim( wcpOAV76TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRIO", GXutil.rtrim( AV41Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV6AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH_TO", localUtil.dtoc( AV7AlbProFch_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV8BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV9BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV10BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV11BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV12BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV13BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV43Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV44Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREO", GXutil.ltrim( localUtil.ntoc( AV73Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOI", GXutil.ltrim( localUtil.ntoc( AV74Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOF", GXutil.ltrim( localUtil.ntoc( AV75barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDISCOD", GXutil.rtrim( AV76TipDisCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTENTREGASRESUMENCLIENTES", AV23SDTEntregasResumenClientes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTENTREGASRESUMENCLIENTES", AV23SDTEntregasResumenClientes);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTENTREGASRESUMENCLIENTES", getSecureSignedToken( sPrefix, AV23SDTEntregasResumenClientes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV87Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTKGS", GXutil.ltrim( localUtil.ntoc( AV53TotTotKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTKGS", getSecureSignedToken( sPrefix, localUtil.format( AV53TotTotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTMTS", GXutil.ltrim( localUtil.ntoc( AV55TotTotMts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTMTS", getSecureSignedToken( sPrefix, localUtil.format( AV55TotTotMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTPZS", GXutil.ltrim( localUtil.ntoc( AV67TotTotPzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67TotTotPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOS", GXutil.ltrim( localUtil.ntoc( AV57TotalKilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV57TotalKilos, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROS", GXutil.ltrim( localUtil.ntoc( AV58TotalMetros, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV58TotalMetros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALPZS", GXutil.ltrim( localUtil.ntoc( AV59TotalPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59TotalPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV42ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI", GXutil.rtrim( AV45AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI_TO", GXutil.rtrim( AV47AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFUENTE", GXutil.ltrim( localUtil.ntoc( AV46Fuente, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST1", GXutil.rtrim( AV49BarMaqEst1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST2", GXutil.rtrim( AV50BarMaqEst2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIE", GXutil.rtrim( AV48Serie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV51clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD2", GXutil.ltrim( localUtil.ntoc( AV52clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm1QB2( )
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
      return "EntregasResumenCliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entregas Resumen de Cliente", "") ;
   }

   public void wb1QB0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.entregasresumencliente_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTbl_gridlineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV79GXV1 = nGXsfl_36_idx ;
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
         wb_table1_44_1QB2( true) ;
      }
      else
      {
         wb_table1_44_1QB2( false) ;
      }
      return  ;
   }

   public void wb_table1_44_1QB2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV33GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV34GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV28ColumnsSelector);
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
      if ( wbEnd == 36 )
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
               AV79GXV1 = nGXsfl_36_idx ;
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

   public void start1QB2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Entregas Resumen de Cliente", ""), (short)(0)) ;
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
            strup1QB0( ) ;
         }
      }
   }

   public void ws1QB2( )
   {
      start1QB2( ) ;
      evt1QB2( ) ;
   }

   public void evt1QB2( )
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
                              strup1QB0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e151QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161QB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1QB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
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
                              strup1QB0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           AV79GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV23SDTEntregasResumenClientes.size() >= AV79GXV1 ) && ( AV79GXV1 > 0 ) )
                           {
                              AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
                              AV36TotKgs = localUtil.ctond( httpContext.cgiGet( edtavTotkgs_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotkgs_Internalname, GXutil.ltrimstr( AV36TotKgs, 10, 2));
                              AV37TotMts = localUtil.ctond( httpContext.cgiGet( edtavTotmts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotmts_Internalname, GXutil.ltrimstr( AV37TotMts, 10, 2));
                              AV38TotPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtavTotpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotpzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TotPzs), 6, 0));
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
                                       GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171QB2 ();
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
                                       GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181QB2 ();
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
                                       GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191QB2 ();
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
                                    strup1QB0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
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

   public void we1QB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1QB2( ) ;
         }
      }
   }

   public void pa1QB2( )
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
            GX_FocusControl = edtavTotvaluetotkgs_Internalname ;
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 String AV41Prio ,
                                 java.util.Date AV6AlbProFch ,
                                 java.util.Date AV7AlbProFch_To ,
                                 String AV8BarColNom ,
                                 String AV9BarColNom_To ,
                                 int AV10BarColNum ,
                                 int AV11BarColNum_To ,
                                 String AV12BarSer ,
                                 String AV13BarSer_To ,
                                 int AV43Clicod ,
                                 int AV44Clicod_to ,
                                 byte AV73Barestreo ,
                                 byte AV74Barestreoi ,
                                 byte AV75barestreof ,
                                 String AV76TipDisCod ,
                                 GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV23SDTEntregasResumenClientes ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ,
                                 String AV87Pgmname ,
                                 java.math.BigDecimal AV53TotTotKgs ,
                                 java.math.BigDecimal AV55TotTotMts ,
                                 long AV67TotTotPzs ,
                                 java.math.BigDecimal AV57TotalKilos ,
                                 java.math.BigDecimal AV58TotalMetros ,
                                 int AV59TotalPzs ,
                                 String AV42ImpCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181QB2 ();
      GRID_nCurrentRecord = 0 ;
      rf1QB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      rf1QB2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV87Pgmname = "EntregasResumenCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtentregasresumenclientes__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavSdtentregasresumenclientes__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmts_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotpzs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluetotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotkgs_Enabled), 5, 0), true);
      edtavTotvaluetotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotmts_Enabled), 5, 0), true);
      edtavTotvaluetotpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotpzs_Enabled), 5, 0), true);
   }

   public void rf1QB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e181QB2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
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
         subsflControlProps_362( ) ;
         e191QB2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e191QB2 ();
         }
         wbEnd = (short)(36) ;
         wb1QB0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1QB2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTENTREGASRESUMENCLIENTES", AV23SDTEntregasResumenClientes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTENTREGASRESUMENCLIENTES", AV23SDTEntregasResumenClientes);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTENTREGASRESUMENCLIENTES", getSecureSignedToken( sPrefix, AV23SDTEntregasResumenClientes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV87Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTKGS", GXutil.ltrim( localUtil.ntoc( AV53TotTotKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTKGS", getSecureSignedToken( sPrefix, localUtil.format( AV53TotTotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTMTS", GXutil.ltrim( localUtil.ntoc( AV55TotTotMts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTMTS", getSecureSignedToken( sPrefix, localUtil.format( AV55TotTotMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTOTPZS", GXutil.ltrim( localUtil.ntoc( AV67TotTotPzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67TotTotPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALKILOS", GXutil.ltrim( localUtil.ntoc( AV57TotalKilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV57TotalKilos, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALMETROS", GXutil.ltrim( localUtil.ntoc( AV58TotalMetros, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV58TotalMetros, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALPZS", GXutil.ltrim( localUtil.ntoc( AV59TotalPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59TotalPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV42ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42ImpCod, ""))));
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
      return AV23SDTEntregasResumenClientes.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV87Pgmname = "EntregasResumenCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtentregasresumenclientes__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavSdtentregasresumenclientes__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmts_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotpzs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluetotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotkgs_Enabled), 5, 0), true);
      edtavTotvaluetotmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotmts_Enabled), 5, 0), true);
      edtavTotvaluetotpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluetotpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluetotpzs_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1QB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171QB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtentregasresumenclientes"), AV23SDTEntregasResumenClientes);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV31DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV28ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTENTREGASRESUMENCLIENTES"), AV23SDTEntregasResumenClientes);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV34GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV41Prio = httpContext.cgiGet( sPrefix+"wcpOAV41Prio") ;
         wcpOAV43Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6AlbProFch"), 0) ;
         wcpOAV7AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7AlbProFch_To"), 0) ;
         wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
         wcpOAV13BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV13BarSer_To") ;
         wcpOAV45AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV45AlbEncCli") ;
         wcpOAV47AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV47AlbEncCli_to") ;
         wcpOAV8BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV8BarColNom") ;
         wcpOAV9BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV9BarColNom_To") ;
         wcpOAV10BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV74Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV75barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV76TipDisCod = httpContext.cgiGet( sPrefix+"wcpOAV76TipDisCod") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
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
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_36_fel_idx = 0 ;
         while ( nGXsfl_36_fel_idx < nRC_GXsfl_36 )
         {
            nGXsfl_36_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_fel_idx+1) ;
            sGXsfl_36_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_362( ) ;
            AV79GXV1 = (int)(nGXsfl_36_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV23SDTEntregasResumenClientes.size() >= AV79GXV1 ) && ( AV79GXV1 > 0 ) )
            {
               AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
               AV36TotKgs = localUtil.ctond( httpContext.cgiGet( edtavTotkgs_Internalname)) ;
               AV37TotMts = localUtil.ctond( httpContext.cgiGet( edtavTotmts_Internalname)) ;
               AV38TotPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtavTotpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
         }
         if ( nGXsfl_36_fel_idx == 0 )
         {
            nGXsfl_36_idx = 1 ;
            sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_362( ) ;
         }
         nGXsfl_36_fel_idx = 1 ;
         /* Read variables values. */
         AV54TotValueTotKgs = httpContext.cgiGet( edtavTotvaluetotkgs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTotKgs", AV54TotValueTotKgs);
         AV56TotValueTotMts = httpContext.cgiGet( edtavTotvaluetotmts_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValueTotMts", AV56TotValueTotMts);
         AV68TotValueTotPzs = httpContext.cgiGet( edtavTotvaluetotpzs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValueTotPzs", AV68TotValueTotPzs);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e171QB2 ();
      if (returnInSub) return;
   }

   public void e171QB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV82Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entregasresumencliente_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV83Emprnom ;
      GXv_char4[0] = AV84Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char2, GXv_char3, GXv_char4) ;
      entregasresumencliente_wc_impl.this.AV5Emprcod = GXv_char2[0] ;
      entregasresumencliente_wc_impl.this.AV83Emprnom = GXv_char3[0] ;
      entregasresumencliente_wc_impl.this.AV84Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV31DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV31DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181QB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTEntregasResumenCliente7 = AV61SDTEntregasResumenClientes_load ;
      GXv_objcol_SdtSDTEntregasResumenCliente8[0] = GXt_objcol_SdtSDTEntregasResumenCliente7 ;
      new app.dpentregasresumencliente(remoteHandle, context).execute( AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, GXv_objcol_SdtSDTEntregasResumenCliente8) ;
      GXt_objcol_SdtSDTEntregasResumenCliente7 = GXv_objcol_SdtSDTEntregasResumenCliente8[0] ;
      AV61SDTEntregasResumenClientes_load = GXt_objcol_SdtSDTEntregasResumenCliente7 ;
      AV85GXV4 = 1 ;
      while ( AV85GXV4 <= AV61SDTEntregasResumenClientes_load.size() )
      {
         AV62SDTEntregasResumenClientes_row = (app.SdtSDTEntregasResumenCliente)((app.SdtSDTEntregasResumenCliente)AV61SDTEntregasResumenClientes_load.elementAt(-1+AV85GXV4));
         AV86GXV5 = 1 ;
         while ( AV86GXV5 <= AV62SDTEntregasResumenClientes_row.getgxTv_SdtSDTEntregasResumenCliente_Level1().size() )
         {
            AV63SDTEntregasResumentClientes_Level1 = (app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente_Level1Item)AV62SDTEntregasResumenClientes_row.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+AV86GXV5));
            if ( ( AV63SDTEntregasResumentClientes_Level1.getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs().doubleValue() > 0 ) && ( AV63SDTEntregasResumentClientes_Level1.getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts().doubleValue() > 0 ) && ( AV63SDTEntregasResumentClientes_Level1.getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs() > 0 ) )
            {
               AV23SDTEntregasResumenClientes.add(AV62SDTEntregasResumenClientes_row, 0);
               gx_BV36 = true ;
            }
            AV86GXV5 = (int)(AV86GXV5+1) ;
         }
         AV85GXV4 = (int)(AV85GXV4+1) ;
      }
      GXv_SdtWWPContext9[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV17WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV30Session.getValue("EntregasResumenCliente_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV30Session.getValue("EntregasResumenCliente_WCColumnsSelector") ;
         AV28ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavSdtentregasresumenclientes__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clicod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavSdtentregasresumenclientes__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtentregasresumenclientes__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtentregasresumenclientes__clinom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotkgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotkgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgs_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotmts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotmts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmts_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotpzs_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV33GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridCurrentPage), 10, 0));
      AV34GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV39WebSession.getValue("EntregasResumenCliente"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV39WebSession.remove("EntregasResumenCliente");
         AV40ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV40ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV40ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23SDTEntregasResumenClientes", AV23SDTEntregasResumenClientes);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV40ProgressIndicator", AV40ProgressIndicator);
   }

   public void e111QB2( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e121QB2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e191QB2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV23SDTEntregasResumenClientes.size() )
      {
         AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
         AV36TotKgs = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotkgs_Internalname, GXutil.ltrimstr( AV36TotKgs, 10, 2));
         AV37TotMts = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotmts_Internalname, GXutil.ltrimstr( AV37TotMts, 10, 2));
         AV38TotPzs = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotpzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TotPzs), 6, 0));
         AV57TotalKilos = AV57TotalKilos.add(AV36TotKgs) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotalKilos", GXutil.ltrimstr( AV57TotalKilos, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV57TotalKilos, "ZZZZZZ9.99")));
         AV58TotalMetros = AV58TotalMetros.add(AV37TotMts) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotalMetros", GXutil.ltrimstr( AV58TotalMetros, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV58TotalMetros, "ZZZZZZ9.99")));
         AV59TotalPzs = (int)(AV59TotalPzs+AV38TotPzs) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotalPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TotalPzs), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59TotalPzs), "ZZZZZ9")));
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S162 ();
         if (returnInSub) return;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e131QB2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV26ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV28ColumnsSelector.fromJSonString(AV26ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "EntregasResumenCliente_WCColumnsSelector", ((GXutil.strcmp("", AV26ColumnsSelectorXML)==0) ? "" : AV28ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      if ( gx_BV36 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23SDTEntregasResumenClientes", AV23SDTEntregasResumenClientes);
         nGXsfl_36_bak_idx = nGXsfl_36_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV41Prio, AV6AlbProFch, AV7AlbProFch_To, AV8BarColNom, AV9BarColNom_To, AV10BarColNum, AV11BarColNum_To, AV12BarSer, AV13BarSer_To, AV43Clicod, AV44Clicod_to, AV73Barestreo, AV74Barestreoi, AV75barestreof, AV76TipDisCod, AV23SDTEntregasResumenClientes, AV28ColumnsSelector, AV87Pgmname, AV53TotTotKgs, AV55TotTotMts, AV67TotTotPzs, AV57TotalKilos, AV58TotalMetros, AV59TotalPzs, AV42ImpCod, sPrefix) ;
         nGXsfl_36_idx = nGXsfl_36_bak_idx ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV40ProgressIndicator", AV40ProgressIndicator);
   }

   public void e141QB2( )
   {
      AV79GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV79GXV1 > 0 ) && ( AV23SDTEntregasResumenClientes.size() >= AV79GXV1 ) )
      {
         AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV39WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch", localUtil.dtoc( AV6AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV39WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch_to", localUtil.dtoc( AV7AlbProFch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV24ExcelFilename ;
      GXv_char3[0] = AV25ErrorMessage ;
      new app.entregasresumencliente_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      entregasresumencliente_wc_impl.this.AV24ExcelFilename = GXv_char4[0] ;
      entregasresumencliente_wc_impl.this.AV25ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV24ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV25ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e151QB2( )
   {
      AV79GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV79GXV1 > 0 ) && ( AV23SDTEntregasResumenClientes.size() >= AV79GXV1 ) )
      {
         AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S112 ();
         if (returnInSub) return;
         Innewwindow1_Target = formatLink("app.entregasresumencliente_wcexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /* Execute user subroutine: 'INICIALIZAVARIABLES' */
      S172 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.ral0004", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV42ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV41Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV43Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV6AlbProFch)),GXutil.URLEncode(GXutil.formatDateParm(AV7AlbProFch_To)),GXutil.URLEncode(GXutil.rtrim(AV12BarSer)),GXutil.URLEncode(GXutil.rtrim(AV13BarSer_To)),GXutil.URLEncode(GXutil.rtrim(AV45AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV47AlbEncCli_to)),GXutil.URLEncode(GXutil.ltrimstr(AV46Fuente,2,0)),GXutil.URLEncode(GXutil.rtrim(AV49BarMaqEst1)),GXutil.URLEncode(GXutil.rtrim(AV50BarMaqEst2)),GXutil.URLEncode(GXutil.rtrim(AV48Serie)),GXutil.URLEncode(GXutil.ltrimstr(AV51clicod1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52clicod2,6,0))}, new String[] {"EmprCod","ImpCod","Prio","PCliCod","UCliCod","PFecha","UFecha","PBarSer","UBarSer","PDisNum","UDisNum","Fuente","BarMaqEst1","BarMaqEst2","Serie","clicod1","clicod2"}) , new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e161QB2( )
   {
      AV79GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV79GXV1 > 0 ) && ( AV23SDTEntregasResumenClientes.size() >= AV79GXV1 ) )
      {
         AV23SDTEntregasResumenClientes.currentItem( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV39WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch", localUtil.dtoc( AV6AlbProFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV39WebSession.setValue("InformeAlbaranesProduccionWC_ALbProfch_to", localUtil.dtoc( AV7AlbProFch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.entregasresumencliente_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      AV72i = 1 ;
      while ( AV72i <= ((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().size() )
      {
         AV36TotKgs = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+AV72i)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotkgs_Internalname, GXutil.ltrimstr( AV36TotKgs, 10, 2));
         AV37TotMts = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+AV72i)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotmts_Internalname, GXutil.ltrimstr( AV37TotMts, 10, 2));
         AV38TotPzs = ((app.SdtSDTEntregasResumenCliente_Level1Item)((app.SdtSDTEntregasResumenCliente)(AV23SDTEntregasResumenClientes.currentItem())).getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+AV72i)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotpzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TotPzs), 6, 0));
         AV72i = (int)(AV72i+1) ;
      }
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV28ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTEntregasResumenClientes__Clicod", "", "Cliente", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTEntregasResumenClientes__CliNom", "", "Nombre", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&TotKgs", "", "Total Qgs", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&TotMts", "", "Total Mts", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&TotPzs", "", "Total Pcas", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV27UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "EntregasResumenCliente_WCColumnsSelector", GXv_char4) ;
      entregasresumencliente_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV29ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV29ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV29ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( AV23SDTEntregasResumenClientes.size() > 0 )
      {
         AV39WebSession.setValue("SDTEntregasResumenClientes", AV23SDTEntregasResumenClientes.toJSonString(false));
      }
      if ( GXutil.strcmp(AV30Session.getValue(AV87Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV87Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV30Session.getValue(AV87Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV21GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV21GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV21GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV30Session.getValue(AV87Pgmname+"GridState"), null, null);
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      AV21GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV21GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV53TotTotKgs = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotTotKgs", GXutil.ltrimstr( AV53TotTotKgs, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTKGS", getSecureSignedToken( sPrefix, localUtil.format( AV53TotTotKgs, "ZZZZZZ9.99")));
      AV55TotTotMts = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotTotMts", GXutil.ltrimstr( AV55TotTotMts, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTMTS", getSecureSignedToken( sPrefix, localUtil.format( AV55TotTotMts, "ZZZZZZ9.99")));
      AV67TotTotPzs = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TotTotPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TotTotPzs), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTOTPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67TotTotPzs), "ZZZZZ9")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV54TotValueTotKgs = localUtil.format( AV53TotTotKgs, "ZZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTotKgs", AV54TotValueTotKgs);
         AV56TotValueTotMts = localUtil.format( AV55TotTotMts, "ZZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValueTotMts", AV56TotValueTotMts);
         AV68TotValueTotPzs = localUtil.format( DecimalUtil.doubleToDec(AV67TotTotPzs), "ZZZZZ9") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValueTotPzs", AV68TotValueTotPzs);
      }
      AV54TotValueTotKgs = localUtil.format( AV57TotalKilos, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTotKgs", AV54TotValueTotKgs);
      AV56TotValueTotMts = localUtil.format( AV58TotalMetros, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotValueTotMts", AV56TotValueTotMts);
      AV68TotValueTotPzs = localUtil.format( DecimalUtil.doubleToDec(AV59TotalPzs), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValueTotPzs", AV68TotValueTotPzs);
   }

   public void S172( )
   {
      /* 'INICIALIZAVARIABLES' Routine */
      returnInSub = false ;
      AV46Fuente = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Fuente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Fuente), 2, 0));
      AV49BarMaqEst1 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarMaqEst1", AV49BarMaqEst1);
      AV50BarMaqEst2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarMaqEst2", AV50BarMaqEst2);
      AV48Serie = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Serie", AV48Serie);
      AV51clicod1 = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51clicod1), 6, 0));
      AV52clicod2 = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52clicod2), 6, 0));
   }

   public void wb_table1_44_1QB2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluetotkgs_Internalname, httpContext.getMessage( "Tot Value Tot Kgs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluetotkgs_Internalname, AV54TotValueTotKgs, GXutil.rtrim( localUtil.format( AV54TotValueTotKgs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluetotkgs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluetotkgs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluetotmts_Internalname, httpContext.getMessage( "Tot Value Tot Mts", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluetotmts_Internalname, AV56TotValueTotMts, GXutil.rtrim( localUtil.format( AV56TotValueTotMts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluetotmts_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluetotmts_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluetotpzs_Internalname, httpContext.getMessage( "Tot Value Tot Pzs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluetotpzs_Internalname, AV68TotValueTotPzs, GXutil.rtrim( localUtil.format( AV68TotValueTotPzs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluetotpzs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluetotpzs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntregasResumenCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_44_1QB2e( true) ;
      }
      else
      {
         wb_table1_44_1QB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV41Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Prio", AV41Prio);
      AV43Clicod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod), 6, 0));
      AV44Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Clicod_to), 6, 0));
      AV6AlbProFch = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbProFch", localUtil.format(AV6AlbProFch, "99/99/99"));
      AV7AlbProFch_To = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbProFch_To", localUtil.format(AV7AlbProFch_To, "99/99/99"));
      AV12BarSer = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
      AV13BarSer_To = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
      AV45AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbEncCli", AV45AlbEncCli);
      AV47AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbEncCli_to", AV47AlbEncCli_to);
      AV8BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
      AV9BarColNom_To = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
      AV10BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
      AV11BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarColNum_To), 6, 0));
      AV73Barestreo = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Barestreo", GXutil.str( AV73Barestreo, 1, 0));
      AV74Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Barestreoi", GXutil.str( AV74Barestreoi, 1, 0));
      AV75barestreof = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75barestreof", GXutil.str( AV75barestreof, 1, 0));
      AV76TipDisCod = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipDisCod", AV76TipDisCod);
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
      pa1QB2( ) ;
      ws1QB2( ) ;
      we1QB2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV41Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV43Clicod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV44Clicod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6AlbProFch = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7AlbProFch_To = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV12BarSer = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV13BarSer_To = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV45AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV47AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV8BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV9BarColNom_To = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV10BarColNum = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV11BarColNum_To = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV73Barestreo = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV74Barestreoi = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV75barestreof = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV76TipDisCod = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1QB2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "entregasresumencliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1QB2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV41Prio = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Prio", AV41Prio);
         AV43Clicod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod), 6, 0));
         AV44Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Clicod_to), 6, 0));
         AV6AlbProFch = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbProFch", localUtil.format(AV6AlbProFch, "99/99/99"));
         AV7AlbProFch_To = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbProFch_To", localUtil.format(AV7AlbProFch_To, "99/99/99"));
         AV12BarSer = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
         AV13BarSer_To = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
         AV45AlbEncCli = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbEncCli", AV45AlbEncCli);
         AV47AlbEncCli_to = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbEncCli_to", AV47AlbEncCli_to);
         AV8BarColNom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
         AV9BarColNom_To = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
         AV10BarColNum = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
         AV11BarColNum_To = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarColNum_To), 6, 0));
         AV73Barestreo = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Barestreo", GXutil.str( AV73Barestreo, 1, 0));
         AV74Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Barestreoi", GXutil.str( AV74Barestreoi, 1, 0));
         AV75barestreof = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75barestreof", GXutil.str( AV75barestreof, 1, 0));
         AV76TipDisCod = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipDisCod", AV76TipDisCod);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV41Prio = httpContext.cgiGet( sPrefix+"wcpOAV41Prio") ;
      wcpOAV43Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV44Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6AlbProFch"), 0) ;
      wcpOAV7AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7AlbProFch_To"), 0) ;
      wcpOAV12BarSer = httpContext.cgiGet( sPrefix+"wcpOAV12BarSer") ;
      wcpOAV13BarSer_To = httpContext.cgiGet( sPrefix+"wcpOAV13BarSer_To") ;
      wcpOAV45AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV45AlbEncCli") ;
      wcpOAV47AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV47AlbEncCli_to") ;
      wcpOAV8BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV8BarColNom") ;
      wcpOAV9BarColNom_To = httpContext.cgiGet( sPrefix+"wcpOAV9BarColNom_To") ;
      wcpOAV10BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11BarColNum_To"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV74Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV75barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV76TipDisCod = httpContext.cgiGet( sPrefix+"wcpOAV76TipDisCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV41Prio, wcpOAV41Prio) != 0 ) || ( AV43Clicod != wcpOAV43Clicod ) || ( AV44Clicod_to != wcpOAV44Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV6AlbProFch), GXutil.resetTime(wcpOAV6AlbProFch)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV7AlbProFch_To), GXutil.resetTime(wcpOAV7AlbProFch_To)) ) || ( GXutil.strcmp(AV12BarSer, wcpOAV12BarSer) != 0 ) || ( GXutil.strcmp(AV13BarSer_To, wcpOAV13BarSer_To) != 0 ) || ( GXutil.strcmp(AV45AlbEncCli, wcpOAV45AlbEncCli) != 0 ) || ( GXutil.strcmp(AV47AlbEncCli_to, wcpOAV47AlbEncCli_to) != 0 ) || ( GXutil.strcmp(AV8BarColNom, wcpOAV8BarColNom) != 0 ) || ( GXutil.strcmp(AV9BarColNom_To, wcpOAV9BarColNom_To) != 0 ) || ( AV10BarColNum != wcpOAV10BarColNum ) || ( AV11BarColNum_To != wcpOAV11BarColNum_To ) || ( AV73Barestreo != wcpOAV73Barestreo ) || ( AV74Barestreoi != wcpOAV74Barestreoi ) || ( AV75barestreof != wcpOAV75barestreof ) || ( GXutil.strcmp(AV76TipDisCod, wcpOAV76TipDisCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV41Prio = AV41Prio ;
      wcpOAV43Clicod = AV43Clicod ;
      wcpOAV44Clicod_to = AV44Clicod_to ;
      wcpOAV6AlbProFch = AV6AlbProFch ;
      wcpOAV7AlbProFch_To = AV7AlbProFch_To ;
      wcpOAV12BarSer = AV12BarSer ;
      wcpOAV13BarSer_To = AV13BarSer_To ;
      wcpOAV45AlbEncCli = AV45AlbEncCli ;
      wcpOAV47AlbEncCli_to = AV47AlbEncCli_to ;
      wcpOAV8BarColNom = AV8BarColNom ;
      wcpOAV9BarColNom_To = AV9BarColNom_To ;
      wcpOAV10BarColNum = AV10BarColNum ;
      wcpOAV11BarColNum_To = AV11BarColNum_To ;
      wcpOAV73Barestreo = AV73Barestreo ;
      wcpOAV74Barestreoi = AV74Barestreoi ;
      wcpOAV75barestreof = AV75barestreof ;
      wcpOAV76TipDisCod = AV76TipDisCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV41Prio = httpContext.cgiGet( sPrefix+"AV41Prio_CTRL") ;
      if ( GXutil.len( sCtrlAV41Prio) > 0 )
      {
         AV41Prio = httpContext.cgiGet( sCtrlAV41Prio) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Prio", AV41Prio);
      }
      else
      {
         AV41Prio = httpContext.cgiGet( sPrefix+"AV41Prio_PARM") ;
      }
      sCtrlAV43Clicod = httpContext.cgiGet( sPrefix+"AV43Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV43Clicod) > 0 )
      {
         AV43Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Clicod), 6, 0));
      }
      else
      {
         AV43Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44Clicod_to = httpContext.cgiGet( sPrefix+"AV44Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV44Clicod_to) > 0 )
      {
         AV44Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV44Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Clicod_to), 6, 0));
      }
      else
      {
         AV44Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV44Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6AlbProFch = httpContext.cgiGet( sPrefix+"AV6AlbProFch_CTRL") ;
      if ( GXutil.len( sCtrlAV6AlbProFch) > 0 )
      {
         AV6AlbProFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6AlbProFch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbProFch", localUtil.format(AV6AlbProFch, "99/99/99"));
      }
      else
      {
         AV6AlbProFch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6AlbProFch_PARM"), 0) ;
      }
      sCtrlAV7AlbProFch_To = httpContext.cgiGet( sPrefix+"AV7AlbProFch_To_CTRL") ;
      if ( GXutil.len( sCtrlAV7AlbProFch_To) > 0 )
      {
         AV7AlbProFch_To = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7AlbProFch_To), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbProFch_To", localUtil.format(AV7AlbProFch_To, "99/99/99"));
      }
      else
      {
         AV7AlbProFch_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7AlbProFch_To_PARM"), 0) ;
      }
      sCtrlAV12BarSer = httpContext.cgiGet( sPrefix+"AV12BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarSer) > 0 )
      {
         AV12BarSer = httpContext.cgiGet( sCtrlAV12BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSer", AV12BarSer);
      }
      else
      {
         AV12BarSer = httpContext.cgiGet( sPrefix+"AV12BarSer_PARM") ;
      }
      sCtrlAV13BarSer_To = httpContext.cgiGet( sPrefix+"AV13BarSer_To_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarSer_To) > 0 )
      {
         AV13BarSer_To = httpContext.cgiGet( sCtrlAV13BarSer_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSer_To", AV13BarSer_To);
      }
      else
      {
         AV13BarSer_To = httpContext.cgiGet( sPrefix+"AV13BarSer_To_PARM") ;
      }
      sCtrlAV45AlbEncCli = httpContext.cgiGet( sPrefix+"AV45AlbEncCli_CTRL") ;
      if ( GXutil.len( sCtrlAV45AlbEncCli) > 0 )
      {
         AV45AlbEncCli = httpContext.cgiGet( sCtrlAV45AlbEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbEncCli", AV45AlbEncCli);
      }
      else
      {
         AV45AlbEncCli = httpContext.cgiGet( sPrefix+"AV45AlbEncCli_PARM") ;
      }
      sCtrlAV47AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV47AlbEncCli_to_CTRL") ;
      if ( GXutil.len( sCtrlAV47AlbEncCli_to) > 0 )
      {
         AV47AlbEncCli_to = httpContext.cgiGet( sCtrlAV47AlbEncCli_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbEncCli_to", AV47AlbEncCli_to);
      }
      else
      {
         AV47AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV47AlbEncCli_to_PARM") ;
      }
      sCtrlAV8BarColNom = httpContext.cgiGet( sPrefix+"AV8BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarColNom) > 0 )
      {
         AV8BarColNom = httpContext.cgiGet( sCtrlAV8BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNom", AV8BarColNom);
      }
      else
      {
         AV8BarColNom = httpContext.cgiGet( sPrefix+"AV8BarColNom_PARM") ;
      }
      sCtrlAV9BarColNom_To = httpContext.cgiGet( sPrefix+"AV9BarColNom_To_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarColNom_To) > 0 )
      {
         AV9BarColNom_To = httpContext.cgiGet( sCtrlAV9BarColNom_To) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarColNom_To", AV9BarColNom_To);
      }
      else
      {
         AV9BarColNom_To = httpContext.cgiGet( sPrefix+"AV9BarColNom_To_PARM") ;
      }
      sCtrlAV10BarColNum = httpContext.cgiGet( sPrefix+"AV10BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarColNum) > 0 )
      {
         AV10BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarColNum), 6, 0));
      }
      else
      {
         AV10BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarColNum_To = httpContext.cgiGet( sPrefix+"AV11BarColNum_To_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarColNum_To) > 0 )
      {
         AV11BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11BarColNum_To), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarColNum_To), 6, 0));
      }
      else
      {
         AV11BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11BarColNum_To_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73Barestreo = httpContext.cgiGet( sPrefix+"AV73Barestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV73Barestreo) > 0 )
      {
         AV73Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV73Barestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Barestreo", GXutil.str( AV73Barestreo, 1, 0));
      }
      else
      {
         AV73Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV73Barestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV74Barestreoi = httpContext.cgiGet( sPrefix+"AV74Barestreoi_CTRL") ;
      if ( GXutil.len( sCtrlAV74Barestreoi) > 0 )
      {
         AV74Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV74Barestreoi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Barestreoi", GXutil.str( AV74Barestreoi, 1, 0));
      }
      else
      {
         AV74Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV74Barestreoi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV75barestreof = httpContext.cgiGet( sPrefix+"AV75barestreof_CTRL") ;
      if ( GXutil.len( sCtrlAV75barestreof) > 0 )
      {
         AV75barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV75barestreof), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75barestreof", GXutil.str( AV75barestreof, 1, 0));
      }
      else
      {
         AV75barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV75barestreof_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV76TipDisCod = httpContext.cgiGet( sPrefix+"AV76TipDisCod_CTRL") ;
      if ( GXutil.len( sCtrlAV76TipDisCod) > 0 )
      {
         AV76TipDisCod = httpContext.cgiGet( sCtrlAV76TipDisCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipDisCod", AV76TipDisCod);
      }
      else
      {
         AV76TipDisCod = httpContext.cgiGet( sPrefix+"AV76TipDisCod_PARM") ;
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
      pa1QB2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1QB2( ) ;
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
      ws1QB2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Prio_PARM", GXutil.rtrim( AV41Prio));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41Prio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Prio_CTRL", GXutil.rtrim( sCtrlAV41Prio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV43Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Clicod_CTRL", GXutil.rtrim( sCtrlAV43Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV44Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44Clicod_to_CTRL", GXutil.rtrim( sCtrlAV44Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbProFch_PARM", localUtil.dtoc( AV6AlbProFch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6AlbProFch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbProFch_CTRL", GXutil.rtrim( sCtrlAV6AlbProFch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbProFch_To_PARM", localUtil.dtoc( AV7AlbProFch_To, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7AlbProFch_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbProFch_To_CTRL", GXutil.rtrim( sCtrlAV7AlbProFch_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_PARM", GXutil.rtrim( AV12BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSer_CTRL", GXutil.rtrim( sCtrlAV12BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSer_To_PARM", GXutil.rtrim( AV13BarSer_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarSer_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSer_To_CTRL", GXutil.rtrim( sCtrlAV13BarSer_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45AlbEncCli_PARM", GXutil.rtrim( AV45AlbEncCli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45AlbEncCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45AlbEncCli_CTRL", GXutil.rtrim( sCtrlAV45AlbEncCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbEncCli_to_PARM", GXutil.rtrim( AV47AlbEncCli_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47AlbEncCli_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbEncCli_to_CTRL", GXutil.rtrim( sCtrlAV47AlbEncCli_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNom_PARM", GXutil.rtrim( AV8BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNom_CTRL", GXutil.rtrim( sCtrlAV8BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNom_To_PARM", GXutil.rtrim( AV9BarColNom_To));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarColNom_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarColNom_To_CTRL", GXutil.rtrim( sCtrlAV9BarColNom_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV10BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarColNum_CTRL", GXutil.rtrim( sCtrlAV10BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarColNum_To_PARM", GXutil.ltrim( localUtil.ntoc( AV11BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarColNum_To)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarColNum_To_CTRL", GXutil.rtrim( sCtrlAV11BarColNum_To));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73Barestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV73Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73Barestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73Barestreo_CTRL", GXutil.rtrim( sCtrlAV73Barestreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74Barestreoi_PARM", GXutil.ltrim( localUtil.ntoc( AV74Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74Barestreoi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74Barestreoi_CTRL", GXutil.rtrim( sCtrlAV74Barestreoi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75barestreof_PARM", GXutil.ltrim( localUtil.ntoc( AV75barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75barestreof)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75barestreof_CTRL", GXutil.rtrim( sCtrlAV75barestreof));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76TipDisCod_PARM", GXutil.rtrim( AV76TipDisCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV76TipDisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76TipDisCod_CTRL", GXutil.rtrim( sCtrlAV76TipDisCod));
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
      we1QB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555392", true, true);
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
      httpContext.AddJavascriptSource("entregasresumencliente_wc.js", "?202682115555393", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_362( )
   {
      edtavSdtentregasresumenclientes__clicod_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLICOD_"+sGXsfl_36_idx ;
      edtavSdtentregasresumenclientes__clinom_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLINOM_"+sGXsfl_36_idx ;
      edtavTotkgs_Internalname = sPrefix+"vTOTKGS_"+sGXsfl_36_idx ;
      edtavTotmts_Internalname = sPrefix+"vTOTMTS_"+sGXsfl_36_idx ;
      edtavTotpzs_Internalname = sPrefix+"vTOTPZS_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavSdtentregasresumenclientes__clicod_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLICOD_"+sGXsfl_36_fel_idx ;
      edtavSdtentregasresumenclientes__clinom_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLINOM_"+sGXsfl_36_fel_idx ;
      edtavTotkgs_Internalname = sPrefix+"vTOTKGS_"+sGXsfl_36_fel_idx ;
      edtavTotmts_Internalname = sPrefix+"vTOTMTS_"+sGXsfl_36_fel_idx ;
      edtavTotpzs_Internalname = sPrefix+"vTOTPZS_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb1QB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtentregasresumenclientes__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtentregasresumenclientes__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)).getgxTv_SdtSDTEntregasResumenCliente_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtentregasresumenclientes__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)).getgxTv_SdtSDTEntregasResumenCliente_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)).getgxTv_SdtSDTEntregasResumenCliente_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtentregasresumenclientes__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtentregasresumenclientes__clicod_Visible),Integer.valueOf(edtavSdtentregasresumenclientes__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtentregasresumenclientes__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtentregasresumenclientes__clinom_Internalname,GXutil.rtrim( ((app.SdtSDTEntregasResumenCliente)AV23SDTEntregasResumenClientes.elementAt(-1+AV79GXV1)).getgxTv_SdtSDTEntregasResumenCliente_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtentregasresumenclientes__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtentregasresumenclientes__clinom_Visible),Integer.valueOf(edtavSdtentregasresumenclientes__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTotkgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTotkgs_Internalname,GXutil.ltrim( localUtil.ntoc( AV36TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTotkgs_Enabled!=0) ? localUtil.format( AV36TotKgs, "ZZZZZZ9.99") : localUtil.format( AV36TotKgs, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTotkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTotkgs_Visible),Integer.valueOf(edtavTotkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTotmts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTotmts_Internalname,GXutil.ltrim( localUtil.ntoc( AV37TotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTotmts_Enabled!=0) ? localUtil.format( AV37TotMts, "ZZZZZZ9.99") : localUtil.format( AV37TotMts, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTotmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTotmts_Visible),Integer.valueOf(edtavTotmts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTotpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTotpzs_Internalname,GXutil.ltrim( localUtil.ntoc( AV38TotPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTotpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38TotPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38TotPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTotpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTotpzs_Visible),Integer.valueOf(edtavTotpzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1QB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtentregasresumenclientes__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtentregasresumenclientes__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTotkgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Qgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTotmts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTotpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Pcas", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtentregasresumenclientes__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtentregasresumenclientes__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtentregasresumenclientes__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtentregasresumenclientes__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36TotKgs, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTotkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTotkgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37TotMts, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTotmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTotmts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38TotPzs, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTotpzs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTotpzs_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSdtentregasresumenclientes__clicod_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLICOD" ;
      edtavSdtentregasresumenclientes__clinom_Internalname = sPrefix+"SDTENTREGASRESUMENCLIENTES__CLINOM" ;
      edtavTotkgs_Internalname = sPrefix+"vTOTKGS" ;
      edtavTotmts_Internalname = sPrefix+"vTOTMTS" ;
      edtavTotpzs_Internalname = sPrefix+"vTOTPZS" ;
      edtavTotvaluetotkgs_Internalname = sPrefix+"vTOTVALUETOTKGS" ;
      edtavTotvaluetotmts_Internalname = sPrefix+"vTOTVALUETOTMTS" ;
      edtavTotvaluetotpzs_Internalname = sPrefix+"vTOTVALUETOTPZS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTbl_gridlineas_Internalname = sPrefix+"TBL_GRIDLINEAS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtavTotpzs_Jsonclick = "" ;
      edtavTotpzs_Enabled = 0 ;
      edtavTotmts_Jsonclick = "" ;
      edtavTotmts_Enabled = 0 ;
      edtavTotkgs_Jsonclick = "" ;
      edtavTotkgs_Enabled = 0 ;
      edtavSdtentregasresumenclientes__clinom_Jsonclick = "" ;
      edtavSdtentregasresumenclientes__clinom_Enabled = 0 ;
      edtavSdtentregasresumenclientes__clinom_Visible = -1 ;
      edtavSdtentregasresumenclientes__clicod_Jsonclick = "" ;
      edtavSdtentregasresumenclientes__clicod_Enabled = 0 ;
      edtavSdtentregasresumenclientes__clicod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluetotpzs_Jsonclick = "" ;
      edtavTotvaluetotpzs_Enabled = 1 ;
      edtavTotvaluetotmts_Jsonclick = "" ;
      edtavTotvaluetotmts_Enabled = 1 ;
      edtavTotvaluetotkgs_Jsonclick = "" ;
      edtavTotvaluetotkgs_Enabled = 1 ;
      edtavTotpzs_Visible = -1 ;
      edtavTotmts_Visible = -1 ;
      edtavTotkgs_Visible = -1 ;
      edtavSdtentregasresumenclientes__clinom_Visible = -1 ;
      edtavSdtentregasresumenclientes__clicod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavSdtentregasresumenclientes__clinom_Enabled = -1 ;
      edtavSdtentregasresumenclientes__clicod_Enabled = -1 ;
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
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||" ;
      Ddo_grid_Columnids = "0:SDTEntregasResumenClientes__Clicod|1:SDTEntregasResumenClientes__CliNom|2:TotKgs|3:TotMts|4:TotPzs" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTENTREGASRESUMENCLIENTES__CLICOD',prop:'Visible'},{ctrl:'SDTENTREGASRESUMENCLIENTES__CLINOM',prop:'Visible'},{av:'edtavTotkgs_Visible',ctrl:'vTOTKGS',prop:'Visible'},{av:'edtavTotmts_Visible',ctrl:'vTOTMTS',prop:'Visible'},{av:'edtavTotpzs_Visible',ctrl:'vTOTPZS',prop:'Visible'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV36TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV37TotMts',fld:'vTOTMTS',pic:'ZZZZZZ9.99'},{av:'AV38TotPzs',fld:'vTOTPZS',pic:'ZZZZZ9'},{av:'AV54TotValueTotKgs',fld:'vTOTVALUETOTKGS',pic:''},{av:'AV56TotValueTotMts',fld:'vTOTVALUETOTMTS',pic:''},{av:'AV68TotValueTotPzs',fld:'vTOTVALUETOTPZS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111QB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121QB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191QB2',iparms:[{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV36TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV37TotMts',fld:'vTOTMTS',pic:'ZZZZZZ9.99'},{av:'AV38TotPzs',fld:'vTOTPZS',pic:'ZZZZZ9'},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV54TotValueTotKgs',fld:'vTOTVALUETOTKGS',pic:''},{av:'AV56TotValueTotMts',fld:'vTOTVALUETOTMTS',pic:''},{av:'AV68TotValueTotPzs',fld:'vTOTVALUETOTPZS',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131QB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{ctrl:'SDTENTREGASRESUMENCLIENTES__CLICOD',prop:'Visible'},{ctrl:'SDTENTREGASRESUMENCLIENTES__CLINOM',prop:'Visible'},{av:'edtavTotkgs_Visible',ctrl:'vTOTKGS',prop:'Visible'},{av:'edtavTotmts_Visible',ctrl:'vTOTMTS',prop:'Visible'},{av:'edtavTotpzs_Visible',ctrl:'vTOTPZS',prop:'Visible'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV36TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV37TotMts',fld:'vTOTMTS',pic:'ZZZZZZ9.99'},{av:'AV38TotPzs',fld:'vTOTPZS',pic:'ZZZZZ9'},{av:'AV54TotValueTotKgs',fld:'vTOTVALUETOTKGS',pic:''},{av:'AV56TotValueTotMts',fld:'vTOTVALUETOTMTS',pic:''},{av:'AV68TotValueTotPzs',fld:'vTOTVALUETOTPZS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141QB2',iparms:[{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e151QB2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV45AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV47AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV46Fuente',fld:'vFUENTE',pic:'Z9'},{av:'AV49BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV50BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV48Serie',fld:'vSERIE',pic:''},{av:'AV51clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV52clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'},{av:'AV46Fuente',fld:'vFUENTE',pic:'Z9'},{av:'AV49BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV50BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV48Serie',fld:'vSERIE',pic:''},{av:'AV51clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV52clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161QB2',iparms:[{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Prio',fld:'vPRIO',pic:'9'},{av:'AV6AlbProFch',fld:'vALBPROFCH',pic:''},{av:'AV7AlbProFch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV8BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV9BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV10BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV11BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV12BarSer',fld:'vBARSER',pic:''},{av:'AV13BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV43Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV44Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV73Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV74Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV75barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV76TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV23SDTEntregasResumenClientes',fld:'vSDTENTREGASRESUMENCLIENTES',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV53TotTotKgs',fld:'vTOTTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV55TotTotMts',fld:'vTOTTOTMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV67TotTotPzs',fld:'vTOTTOTPZS',pic:'ZZZZZ9',hsh:true},{av:'AV57TotalKilos',fld:'vTOTALKILOS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV58TotalMetros',fld:'vTOTALMETROS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV59TotalPzs',fld:'vTOTALPZS',pic:'ZZZZZ9',hsh:true},{av:'AV42ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("NULL","{handler:'validv_Totpzs',iparms:[]");
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
      wcpOAV41Prio = "" ;
      wcpOAV6AlbProFch = GXutil.nullDate() ;
      wcpOAV7AlbProFch_To = GXutil.nullDate() ;
      wcpOAV12BarSer = "" ;
      wcpOAV13BarSer_To = "" ;
      wcpOAV45AlbEncCli = "" ;
      wcpOAV47AlbEncCli_to = "" ;
      wcpOAV8BarColNom = "" ;
      wcpOAV9BarColNom_To = "" ;
      wcpOAV76TipDisCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV41Prio = "" ;
      AV6AlbProFch = GXutil.nullDate() ;
      AV7AlbProFch_To = GXutil.nullDate() ;
      AV12BarSer = "" ;
      AV13BarSer_To = "" ;
      AV45AlbEncCli = "" ;
      AV47AlbEncCli_to = "" ;
      AV8BarColNom = "" ;
      AV9BarColNom_To = "" ;
      AV76TipDisCod = "" ;
      AV23SDTEntregasResumenClientes = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      AV28ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV87Pgmname = "" ;
      AV53TotTotKgs = DecimalUtil.ZERO ;
      AV55TotTotMts = DecimalUtil.ZERO ;
      AV57TotalKilos = DecimalUtil.ZERO ;
      AV58TotalMetros = DecimalUtil.ZERO ;
      AV42ImpCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV31DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV49BarMaqEst1 = "" ;
      AV50BarMaqEst2 = "" ;
      AV48Serie = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV36TotKgs = DecimalUtil.ZERO ;
      AV37TotMts = DecimalUtil.ZERO ;
      AV54TotValueTotKgs = "" ;
      AV56TotValueTotMts = "" ;
      AV68TotValueTotPzs = "" ;
      AV82Station = "" ;
      GXv_char2 = new String[1] ;
      AV83Emprnom = "" ;
      AV84Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV61SDTEntregasResumenClientes_load = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTEntregasResumenCliente7 = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTEntregasResumenCliente8 = new GXBaseCollection[1] ;
      AV62SDTEntregasResumenClientes_row = new app.SdtSDTEntregasResumenCliente(remoteHandle, context);
      AV63SDTEntregasResumentClientes_Level1 = new app.SdtSDTEntregasResumenCliente_Level1Item(remoteHandle, context);
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV39WebSession = httpContext.getWebSession();
      AV40ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ExcelFilename = "" ;
      AV25ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV27UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV29ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV41Prio = "" ;
      sCtrlAV43Clicod = "" ;
      sCtrlAV44Clicod_to = "" ;
      sCtrlAV6AlbProFch = "" ;
      sCtrlAV7AlbProFch_To = "" ;
      sCtrlAV12BarSer = "" ;
      sCtrlAV13BarSer_To = "" ;
      sCtrlAV45AlbEncCli = "" ;
      sCtrlAV47AlbEncCli_to = "" ;
      sCtrlAV8BarColNom = "" ;
      sCtrlAV9BarColNom_To = "" ;
      sCtrlAV10BarColNum = "" ;
      sCtrlAV11BarColNum_To = "" ;
      sCtrlAV73Barestreo = "" ;
      sCtrlAV74Barestreoi = "" ;
      sCtrlAV75barestreof = "" ;
      sCtrlAV76TipDisCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV87Pgmname = "EntregasResumenCliente_WC" ;
      /* GeneXus formulas. */
      AV87Pgmname = "EntregasResumenCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtentregasresumenclientes__clicod_Enabled = 0 ;
      edtavSdtentregasresumenclientes__clinom_Enabled = 0 ;
      edtavTotkgs_Enabled = 0 ;
      edtavTotmts_Enabled = 0 ;
      edtavTotpzs_Enabled = 0 ;
      edtavTotvaluetotkgs_Enabled = 0 ;
      edtavTotvaluetotmts_Enabled = 0 ;
      edtavTotvaluetotpzs_Enabled = 0 ;
   }

   private byte wcpOAV73Barestreo ;
   private byte wcpOAV74Barestreoi ;
   private byte wcpOAV75barestreof ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV73Barestreo ;
   private byte AV74Barestreoi ;
   private byte AV75barestreof ;
   private byte AV46Fuente ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV43Clicod ;
   private int wcpOAV44Clicod_to ;
   private int wcpOAV10BarColNum ;
   private int wcpOAV11BarColNum_To ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int AV43Clicod ;
   private int AV44Clicod_to ;
   private int AV10BarColNum ;
   private int AV11BarColNum_To ;
   private int nGXsfl_36_idx=1 ;
   private int AV59TotalPzs ;
   private int AV51clicod1 ;
   private int AV52clicod2 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV79GXV1 ;
   private int AV38TotPzs ;
   private int subGrid_Islastpage ;
   private int edtavSdtentregasresumenclientes__clicod_Enabled ;
   private int edtavSdtentregasresumenclientes__clinom_Enabled ;
   private int edtavTotkgs_Enabled ;
   private int edtavTotmts_Enabled ;
   private int edtavTotpzs_Enabled ;
   private int edtavTotvaluetotkgs_Enabled ;
   private int edtavTotvaluetotmts_Enabled ;
   private int edtavTotvaluetotpzs_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_36_fel_idx=1 ;
   private int AV85GXV4 ;
   private int AV86GXV5 ;
   private int edtavSdtentregasresumenclientes__clicod_Visible ;
   private int edtavSdtentregasresumenclientes__clinom_Visible ;
   private int edtavTotkgs_Visible ;
   private int edtavTotmts_Visible ;
   private int edtavTotpzs_Visible ;
   private int AV32PageToGo ;
   private int nGXsfl_36_bak_idx=1 ;
   private int AV72i ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV67TotTotPzs ;
   private long AV33GridCurrentPage ;
   private long AV34GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV53TotTotKgs ;
   private java.math.BigDecimal AV55TotTotMts ;
   private java.math.BigDecimal AV57TotalKilos ;
   private java.math.BigDecimal AV58TotalMetros ;
   private java.math.BigDecimal AV36TotKgs ;
   private java.math.BigDecimal AV37TotMts ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV41Prio ;
   private String wcpOAV12BarSer ;
   private String wcpOAV13BarSer_To ;
   private String wcpOAV45AlbEncCli ;
   private String wcpOAV47AlbEncCli_to ;
   private String wcpOAV8BarColNom ;
   private String wcpOAV9BarColNom_To ;
   private String wcpOAV76TipDisCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV41Prio ;
   private String AV12BarSer ;
   private String AV13BarSer_To ;
   private String AV45AlbEncCli ;
   private String AV47AlbEncCli_to ;
   private String AV8BarColNom ;
   private String AV9BarColNom_To ;
   private String AV76TipDisCod ;
   private String sGXsfl_36_idx="0001" ;
   private String AV87Pgmname ;
   private String AV42ImpCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV49BarMaqEst1 ;
   private String AV50BarMaqEst2 ;
   private String AV48Serie ;
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
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divTbl_gridlineas_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluetotkgs_Internalname ;
   private String edtavTotkgs_Internalname ;
   private String edtavTotmts_Internalname ;
   private String edtavTotpzs_Internalname ;
   private String edtavSdtentregasresumenclientes__clicod_Internalname ;
   private String edtavSdtentregasresumenclientes__clinom_Internalname ;
   private String edtavTotvaluetotmts_Internalname ;
   private String edtavTotvaluetotpzs_Internalname ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String AV82Station ;
   private String GXv_char2[] ;
   private String AV83Emprnom ;
   private String AV84Usurcod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluetotkgs_Jsonclick ;
   private String edtavTotvaluetotmts_Jsonclick ;
   private String edtavTotvaluetotpzs_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV41Prio ;
   private String sCtrlAV43Clicod ;
   private String sCtrlAV44Clicod_to ;
   private String sCtrlAV6AlbProFch ;
   private String sCtrlAV7AlbProFch_To ;
   private String sCtrlAV12BarSer ;
   private String sCtrlAV13BarSer_To ;
   private String sCtrlAV45AlbEncCli ;
   private String sCtrlAV47AlbEncCli_to ;
   private String sCtrlAV8BarColNom ;
   private String sCtrlAV9BarColNom_To ;
   private String sCtrlAV10BarColNum ;
   private String sCtrlAV11BarColNum_To ;
   private String sCtrlAV73Barestreo ;
   private String sCtrlAV74Barestreoi ;
   private String sCtrlAV75barestreof ;
   private String sCtrlAV76TipDisCod ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtentregasresumenclientes__clicod_Jsonclick ;
   private String edtavSdtentregasresumenclientes__clinom_Jsonclick ;
   private String edtavTotkgs_Jsonclick ;
   private String edtavTotmts_Jsonclick ;
   private String edtavTotpzs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV6AlbProFch ;
   private java.util.Date wcpOAV7AlbProFch_To ;
   private java.util.Date AV6AlbProFch ;
   private java.util.Date AV7AlbProFch_To ;
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
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV36 ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV54TotValueTotKgs ;
   private String AV56TotValueTotMts ;
   private String AV68TotValueTotPzs ;
   private String AV24ExcelFilename ;
   private String AV25ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private com.genexus.webpanels.WebSession AV39WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV40ProgressIndicator ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV23SDTEntregasResumenClientes ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV61SDTEntregasResumenClientes_load ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> GXt_objcol_SdtSDTEntregasResumenCliente7 ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> GXv_objcol_SdtSDTEntregasResumenCliente8[] ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.SdtSDTEntregasResumenCliente AV62SDTEntregasResumenClientes_row ;
   private app.SdtSDTEntregasResumenCliente_Level1Item AV63SDTEntregasResumentClientes_Level1 ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV31DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

