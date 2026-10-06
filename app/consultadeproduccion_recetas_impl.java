package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_recetas_impl extends GXWebComponent
{
   public consultadeproduccion_recetas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_recetas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_recetas_impl.class ));
   }

   public consultadeproduccion_recetas_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
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
               AV23Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
               AV24BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
               AV25BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodReo", GXutil.str( AV25BarCodReo, 1, 0));
               AV26BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodPar", AV26BarCodPar);
               AV42CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
               AV43CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43CliNom", AV43CliNom);
               AV44PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44PedidoCliente", AV44PedidoCliente);
               AV45BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarSer", AV45BarSer);
               AV46BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarSerDsc", AV46BarSerDsc);
               AV47BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarColNom", AV47BarColNom);
               AV48BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23Emprcod,Integer.valueOf(AV24BarCod),Byte.valueOf(AV25BarCodReo),AV26BarCodPar,Integer.valueOf(AV42CliCod),AV43CliNom,AV44PedidoCliente,AV45BarSer,AV46BarSerDsc,AV47BarColNom,Integer.valueOf(AV48BarColNum)});
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
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
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
      AV58Pgmname = httpContext.GetPar( "Pgmname") ;
      AV24BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV25BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV26BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV37BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV23Emprcod = httpContext.GetPar( "Emprcod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      A6039RecAcab = httpContext.GetPar( "RecAcab") ;
      n6039RecAcab = false ;
      A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
      A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      A9804HreAcab = httpContext.GetPar( "HreAcab") ;
      n9804HreAcab = false ;
      A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19E2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recetas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultadeproduccion_recetas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV26BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV42CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV43CliNom)),GXutil.URLEncode(GXutil.rtrim(AV44PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV45BarSer)),GXutil.URLEncode(GXutil.rtrim(AV46BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV47BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarColNum,6,0))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV37BarAgrEst, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_73, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Emprcod", GXutil.rtrim( wcpOAV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV24BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV25BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26BarCodPar", GXutil.rtrim( wcpOAV26BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV42CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43CliNom", GXutil.rtrim( wcpOAV43CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44PedidoCliente", GXutil.rtrim( wcpOAV44PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45BarSer", GXutil.rtrim( wcpOAV45BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46BarSerDsc", GXutil.rtrim( wcpOAV46BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47BarColNom", GXutil.rtrim( wcpOAV47BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV48BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV58Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGREST", GXutil.rtrim( AV37BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV37BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRENUMCIE", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACAB", GXutil.rtrim( A9804HreAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELINMAQ", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECACAB", GXutil.rtrim( A6039RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm19E2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "ConsultadeProduccion_Recetas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas", "") ;
   }

   public void wb19E0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consultadeproduccion_recetas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablacontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV25BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV25BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV26BarCodPar), GXutil.rtrim( localUtil.format( AV26BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV42CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV43CliNom), GXutil.rtrim( localUtil.format( AV43CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV44PedidoCliente), GXutil.rtrim( localUtil.format( AV44PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV45BarSer), GXutil.rtrim( localUtil.format( AV45BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV46BarSerDsc), GXutil.rtrim( localUtil.format( AV46BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV47BarColNom), GXutil.rtrim( localUtil.format( AV47BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Recetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV48BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Recetas.htm");
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
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-md-6 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol73( ) ;
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_73 = (int)(nGXsfl_73_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 73 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start19E2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recetas", ""), (short)(0)) ;
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
            strup19E0( ) ;
         }
      }
   }

   public void ws19E2( )
   {
      start19E2( ) ;
      evt19E2( ) ;
   }

   public void evt19E2( )
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
                              strup19E0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19E0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19E0( ) ;
                           }
                           nGXsfl_73_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_732( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV38GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GrupodeAcciones), 4, 0));
                           AV13BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
                           AV32RcTxt = httpContext.cgiGet( edtavRctxt_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
                           AV27Historico = httpContext.cgiGet( edtavHistorico_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLINMAQ");
                              GX_FocusControl = edtavReclinmaq_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV29RecLinMaq = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
                           }
                           else
                           {
                              AV29RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRENUMCIE");
                              GX_FocusControl = edtavHrenumcie_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28HreNumCie = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
                           }
                           else
                           {
                              AV28HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECMAQT");
                              GX_FocusControl = edtavRecmaqt_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV30RecMaqt = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
                           }
                           else
                           {
                              AV30RecMaqt = (short)(localUtil.ctol( httpContext.cgiGet( edtavRecmaqt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECMAQA");
                              GX_FocusControl = edtavRecmaqa_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV31Recmaqa = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
                           }
                           else
                           {
                              AV31Recmaqa = (short)(localUtil.ctol( httpContext.cgiGet( edtavRecmaqa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODGRID");
                              GX_FocusControl = edtavBarcodgrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV39BarCodgrid = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
                           }
                           else
                           {
                              AV39BarCodgrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreogrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreogrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOGRID");
                              GX_FocusControl = edtavBarcodreogrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV40BarCodReoGrid = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
                           }
                           else
                           {
                              AV40BarCodReoGrid = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreogrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
                           }
                           AV41BarCodParGrid = httpContext.cgiGet( edtavBarcodpargrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1119E2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1219E2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1319E2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1419E2 ();
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
                                    strup19E0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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

   public void we19E2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19E2( ) ;
         }
      }
   }

   public void pa19E2( )
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
      subsflControlProps_732( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         sendrow_732( ) ;
         nGXsfl_73_idx = ((subGrid_Islastpage==1)&&(nGXsfl_73_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV58Pgmname ,
                                 int AV24BarCod ,
                                 byte AV25BarCodReo ,
                                 String AV26BarCodPar ,
                                 String AV37BarAgrEst ,
                                 String AV23Emprcod ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 short A2804RecLinMaq ,
                                 String A6039RecAcab ,
                                 int A4492HreBarCod ,
                                 byte A4493HreBarReo ,
                                 String A4494HreBarPar ,
                                 byte A4495HreNumCie ,
                                 String A9804HreAcab ,
                                 short A4545HreLinMaq ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1219E2 ();
      GRID_nCurrentRecord = 0 ;
      rf19E2( ) ;
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
      rf19E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV58Pgmname = "ConsultadeProduccion_Recetas" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRctxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRctxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRctxt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavHistorico_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHistorico_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHistorico_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavHrenumcie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrenumcie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrenumcie_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRecmaqt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmaqt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRecmaqa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmaqa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqa_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodgrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodreogrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreogrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreogrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodpargrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpargrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpargrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void rf19E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(73) ;
      /* Execute user event: Refresh */
      e1219E2 ();
      nGXsfl_73_idx = 1 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_732( ) ;
      bGXsfl_73_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_732( ) ;
         e1319E2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_73_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1319E2 ();
         }
         wbEnd = (short)(73) ;
         wb19E0( ) ;
      }
      bGXsfl_73_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV58Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGREST", GXutil.rtrim( AV37BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV37BarAgrEst, "@!"))));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV24BarCod, AV25BarCodReo, AV26BarCodPar, AV37BarAgrEst, AV23Emprcod, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A6039RecAcab, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9804HreAcab, A4545HreLinMaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV58Pgmname = "ConsultadeProduccion_Recetas" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRctxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRctxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRctxt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavHistorico_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHistorico_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHistorico_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavHrenumcie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrenumcie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrenumcie_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRecmaqt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmaqt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavRecmaqa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmaqa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmaqa_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodgrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodreogrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreogrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreogrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarcodpargrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpargrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpargrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup19E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1119E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
         wcpOAV24BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV26BarCodPar") ;
         wcpOAV42CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43CliNom = httpContext.cgiGet( sPrefix+"wcpOAV43CliNom") ;
         wcpOAV44PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV44PedidoCliente") ;
         wcpOAV45BarSer = httpContext.cgiGet( sPrefix+"wcpOAV45BarSer") ;
         wcpOAV46BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV46BarSerDsc") ;
         wcpOAV47BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV47BarColNom") ;
         wcpOAV48BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
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
      e1119E2 ();
      if (returnInSub) return;
   }

   public void e1119E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV51Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_recetas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV51Station = GXt_char1 ;
      GXv_char2[0] = AV23Emprcod ;
      GXv_char3[0] = AV52Emprnom ;
      GXv_char4[0] = AV53Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_recetas_impl.this.AV23Emprcod = GXv_char2[0] ;
      consultadeproduccion_recetas_impl.this.AV52Emprnom = GXv_char3[0] ;
      consultadeproduccion_recetas_impl.this.AV53Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
   }

   public void e1219E2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   private void e1319E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Informe", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      AV34BarCodm = AV24BarCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34BarCodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarCodm), 8, 0));
      AV35Barcodreom = AV25BarCodReo ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodreom", GXutil.str( AV35Barcodreom, 1, 0));
      AV36Barcodparm = AV26BarCodPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodparm", AV36Barcodparm);
      AV33HdMin = (byte)(1) ;
      if ( GXutil.strcmp(AV37BarAgrEst, "S") == 0 )
      {
         new app.pminagr(remoteHandle, context).execute( AV23Emprcod, AV34BarCodm, AV35Barcodreom, AV36Barcodparm) ;
         if ( ( AV24BarCod == AV34BarCodm ) && ( AV25BarCodReo == AV35Barcodreom ) && ( GXutil.strcmp(AV26BarCodPar, AV36Barcodparm) == 0 ) )
         {
            AV33HdMin = (byte)(1) ;
         }
         else
         {
            AV33HdMin = (byte)(0) ;
         }
      }
      AV31Recmaqa = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
      AV30RecMaqt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
      AV29RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
      AV28HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
      AV13BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
      AV32RcTxt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
      AV27Historico = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
      AV39BarCodgrid = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
      AV40BarCodReoGrid = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
      AV41BarCodParGrid = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
      /* Using cursor H019E2 */
      pr_default.execute(0, new Object[] {AV23Emprcod, Integer.valueOf(AV34BarCodm), Byte.valueOf(AV35Barcodreom), AV36Barcodparm});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = H019E2_A6039RecAcab[0] ;
         n6039RecAcab = H019E2_n6039RecAcab[0] ;
         A130BarCodPar = H019E2_A130BarCodPar[0] ;
         A132BarCodReo = H019E2_A132BarCodReo[0] ;
         A129BarCod = H019E2_A129BarCod[0] ;
         A396EmprCod = H019E2_A396EmprCod[0] ;
         A2804RecLinMaq = H019E2_A2804RecLinMaq[0] ;
         AV29RecLinMaq = A2804RecLinMaq ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
         AV13BarNHdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
         AV30RecMaqt = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
         AV28HreNumCie = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
         AV32RcTxt = httpContext.getMessage( "Rc Tint", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
         AV39BarCodgrid = A129BarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
         AV40BarCodReoGrid = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
         AV41BarCodParGrid = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(73) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_732( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
         {
            httpContext.doAjaxLoad(73, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV31Recmaqa = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
      AV30RecMaqt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
      AV29RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
      AV28HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
      AV13BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
      AV32RcTxt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
      AV27Historico = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
      AV39BarCodgrid = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
      AV40BarCodReoGrid = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
      AV41BarCodParGrid = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
      /* Using cursor H019E3 */
      pr_default.execute(1, new Object[] {AV23Emprcod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = H019E3_A6039RecAcab[0] ;
         n6039RecAcab = H019E3_n6039RecAcab[0] ;
         A130BarCodPar = H019E3_A130BarCodPar[0] ;
         A132BarCodReo = H019E3_A132BarCodReo[0] ;
         A129BarCod = H019E3_A129BarCod[0] ;
         A396EmprCod = H019E3_A396EmprCod[0] ;
         A2804RecLinMaq = H019E3_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV29RecLinMaq = A2804RecLinMaq ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
            AV13BarNHdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
            AV31Recmaqa = (short)(1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
            AV28HreNumCie = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
            AV32RcTxt = httpContext.getMessage( "Rc Acab", "") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
            AV39BarCodgrid = A129BarCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
            AV40BarCodReoGrid = A132BarCodReo ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
            AV41BarCodParGrid = A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(73) ;
            }
            if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
            {
               sendrow_732( ) ;
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
               if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
               {
                  GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
               }
            }
            if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
            {
               GRID_nEOF = (byte)(0) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
            GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
            if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
            {
               httpContext.doAjaxLoad(73, GridRow);
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV31Recmaqa = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
      AV30RecMaqt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
      AV29RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
      AV28HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
      AV13BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
      AV32RcTxt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
      AV27Historico = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
      AV39BarCodgrid = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
      AV40BarCodReoGrid = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
      AV41BarCodParGrid = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
      /* Using cursor H019E4 */
      pr_default.execute(2, new Object[] {AV23Emprcod, Integer.valueOf(AV34BarCodm), Byte.valueOf(AV35Barcodreom), AV36Barcodparm});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9804HreAcab = H019E4_A9804HreAcab[0] ;
         n9804HreAcab = H019E4_n9804HreAcab[0] ;
         A4494HreBarPar = H019E4_A4494HreBarPar[0] ;
         A4493HreBarReo = H019E4_A4493HreBarReo[0] ;
         A4492HreBarCod = H019E4_A4492HreBarCod[0] ;
         A396EmprCod = H019E4_A396EmprCod[0] ;
         A4545HreLinMaq = H019E4_A4545HreLinMaq[0] ;
         A4495HreNumCie = H019E4_A4495HreNumCie[0] ;
         AV31Recmaqa = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
         AV30RecMaqt = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
         AV29RecLinMaq = A4545HreLinMaq ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
         AV28HreNumCie = A4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
         AV13BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
         AV32RcTxt = httpContext.getMessage( "Rc Tint", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
         AV27Historico = httpContext.getMessage( "H", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
         AV39BarCodgrid = A4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
         AV40BarCodReoGrid = A4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
         AV41BarCodParGrid = A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(73) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_732( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
         {
            httpContext.doAjaxLoad(73, GridRow);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor H019E5 */
      pr_default.execute(3, new Object[] {AV23Emprcod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9804HreAcab = H019E5_A9804HreAcab[0] ;
         n9804HreAcab = H019E5_n9804HreAcab[0] ;
         A4494HreBarPar = H019E5_A4494HreBarPar[0] ;
         A4493HreBarReo = H019E5_A4493HreBarReo[0] ;
         A4492HreBarCod = H019E5_A4492HreBarCod[0] ;
         A396EmprCod = H019E5_A396EmprCod[0] ;
         A4545HreLinMaq = H019E5_A4545HreLinMaq[0] ;
         A4495HreNumCie = H019E5_A4495HreNumCie[0] ;
         AV32RcTxt = httpContext.getMessage( "Rc Acab", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRctxt_Internalname, AV32RcTxt);
         AV31Recmaqa = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqa_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Recmaqa), 4, 0));
         AV30RecMaqt = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmaqt_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30RecMaqt), 4, 0));
         AV29RecLinMaq = A4545HreLinMaq ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RecLinMaq), 4, 0));
         AV28HreNumCie = A4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HreNumCie), 2, 0));
         AV13BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV13BarNHdr);
         AV27Historico = "H" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHistorico_Internalname, AV27Historico);
         AV39BarCodgrid = A4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarCodgrid), 8, 0));
         AV40BarCodReoGrid = A4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreogrid_Internalname, GXutil.str( AV40BarCodReoGrid, 1, 0));
         AV41BarCodParGrid = A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpargrid_Internalname, AV41BarCodParGrid);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(73) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_732( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
         {
            httpContext.doAjaxLoad(73, GridRow);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV38GrupodeAcciones, 4, 0)) );
   }

   public void e1419E2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV38GrupodeAcciones == 1 )
      {
         /* Execute user subroutine: 'DO INFORME' */
         S132 ();
         if (returnInSub) return;
      }
      AV38GrupodeAcciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GrupodeAcciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV38GrupodeAcciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
   }

   public void S132( )
   {
      /* 'DO INFORME' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctccporhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarCodgrid,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCodReoGrid,1,0)),GXutil.URLEncode(GXutil.rtrim(AV41BarCodParGrid)),GXutil.URLEncode(GXutil.ltrimstr(AV29RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28HreNumCie,2,0))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","Reclinmaq","HreNumCie"}) , new Object[] {"AV23Emprcod","AV39BarCodgrid","AV40BarCodReoGrid","AV41BarCodParGrid","AV29RecLinMaq","AV28HreNumCie"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV58Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV58Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV58Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV58Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV58Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      AV24BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
      AV25BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodReo", GXutil.str( AV25BarCodReo, 1, 0));
      AV26BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodPar", AV26BarCodPar);
      AV42CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
      AV43CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43CliNom", AV43CliNom);
      AV44PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44PedidoCliente", AV44PedidoCliente);
      AV45BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarSer", AV45BarSer);
      AV46BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarSerDsc", AV46BarSerDsc);
      AV47BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarColNom", AV47BarColNom);
      AV48BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
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
      pa19E2( ) ;
      ws19E2( ) ;
      we19E2( ) ;
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
      sCtrlAV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV24BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV25BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV26BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV42CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV43CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV44PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV45BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV46BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV47BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV48BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19E2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consultadeproduccion_recetas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19E2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         AV24BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         AV25BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodReo", GXutil.str( AV25BarCodReo, 1, 0));
         AV26BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodPar", AV26BarCodPar);
         AV42CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
         AV43CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43CliNom", AV43CliNom);
         AV44PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44PedidoCliente", AV44PedidoCliente);
         AV45BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarSer", AV45BarSer);
         AV46BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarSerDsc", AV46BarSerDsc);
         AV47BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarColNom", AV47BarColNom);
         AV48BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
      }
      wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
      wcpOAV24BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV26BarCodPar") ;
      wcpOAV42CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43CliNom = httpContext.cgiGet( sPrefix+"wcpOAV43CliNom") ;
      wcpOAV44PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV44PedidoCliente") ;
      wcpOAV45BarSer = httpContext.cgiGet( sPrefix+"wcpOAV45BarSer") ;
      wcpOAV46BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV46BarSerDsc") ;
      wcpOAV47BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV47BarColNom") ;
      wcpOAV48BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23Emprcod, wcpOAV23Emprcod) != 0 ) || ( AV24BarCod != wcpOAV24BarCod ) || ( AV25BarCodReo != wcpOAV25BarCodReo ) || ( GXutil.strcmp(AV26BarCodPar, wcpOAV26BarCodPar) != 0 ) || ( AV42CliCod != wcpOAV42CliCod ) || ( GXutil.strcmp(AV43CliNom, wcpOAV43CliNom) != 0 ) || ( GXutil.strcmp(AV44PedidoCliente, wcpOAV44PedidoCliente) != 0 ) || ( GXutil.strcmp(AV45BarSer, wcpOAV45BarSer) != 0 ) || ( GXutil.strcmp(AV46BarSerDsc, wcpOAV46BarSerDsc) != 0 ) || ( GXutil.strcmp(AV47BarColNom, wcpOAV47BarColNom) != 0 ) || ( AV48BarColNum != wcpOAV48BarColNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV23Emprcod = AV23Emprcod ;
      wcpOAV24BarCod = AV24BarCod ;
      wcpOAV25BarCodReo = AV25BarCodReo ;
      wcpOAV26BarCodPar = AV26BarCodPar ;
      wcpOAV42CliCod = AV42CliCod ;
      wcpOAV43CliNom = AV43CliNom ;
      wcpOAV44PedidoCliente = AV44PedidoCliente ;
      wcpOAV45BarSer = AV45BarSer ;
      wcpOAV46BarSerDsc = AV46BarSerDsc ;
      wcpOAV47BarColNom = AV47BarColNom ;
      wcpOAV48BarColNum = AV48BarColNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV23Emprcod) > 0 )
      {
         AV23Emprcod = httpContext.cgiGet( sCtrlAV23Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      }
      else
      {
         AV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_PARM") ;
      }
      sCtrlAV24BarCod = httpContext.cgiGet( sPrefix+"AV24BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV24BarCod) > 0 )
      {
         AV24BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
      }
      else
      {
         AV24BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25BarCodReo = httpContext.cgiGet( sPrefix+"AV25BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV25BarCodReo) > 0 )
      {
         AV25BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25BarCodReo", GXutil.str( AV25BarCodReo, 1, 0));
      }
      else
      {
         AV25BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26BarCodPar = httpContext.cgiGet( sPrefix+"AV26BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV26BarCodPar) > 0 )
      {
         AV26BarCodPar = httpContext.cgiGet( sCtrlAV26BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26BarCodPar", AV26BarCodPar);
      }
      else
      {
         AV26BarCodPar = httpContext.cgiGet( sPrefix+"AV26BarCodPar_PARM") ;
      }
      sCtrlAV42CliCod = httpContext.cgiGet( sPrefix+"AV42CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV42CliCod) > 0 )
      {
         AV42CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42CliCod), 6, 0));
      }
      else
      {
         AV42CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43CliNom = httpContext.cgiGet( sPrefix+"AV43CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV43CliNom) > 0 )
      {
         AV43CliNom = httpContext.cgiGet( sCtrlAV43CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43CliNom", AV43CliNom);
      }
      else
      {
         AV43CliNom = httpContext.cgiGet( sPrefix+"AV43CliNom_PARM") ;
      }
      sCtrlAV44PedidoCliente = httpContext.cgiGet( sPrefix+"AV44PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV44PedidoCliente) > 0 )
      {
         AV44PedidoCliente = httpContext.cgiGet( sCtrlAV44PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44PedidoCliente", AV44PedidoCliente);
      }
      else
      {
         AV44PedidoCliente = httpContext.cgiGet( sPrefix+"AV44PedidoCliente_PARM") ;
      }
      sCtrlAV45BarSer = httpContext.cgiGet( sPrefix+"AV45BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV45BarSer) > 0 )
      {
         AV45BarSer = httpContext.cgiGet( sCtrlAV45BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45BarSer", AV45BarSer);
      }
      else
      {
         AV45BarSer = httpContext.cgiGet( sPrefix+"AV45BarSer_PARM") ;
      }
      sCtrlAV46BarSerDsc = httpContext.cgiGet( sPrefix+"AV46BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV46BarSerDsc) > 0 )
      {
         AV46BarSerDsc = httpContext.cgiGet( sCtrlAV46BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46BarSerDsc", AV46BarSerDsc);
      }
      else
      {
         AV46BarSerDsc = httpContext.cgiGet( sPrefix+"AV46BarSerDsc_PARM") ;
      }
      sCtrlAV47BarColNom = httpContext.cgiGet( sPrefix+"AV47BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV47BarColNom) > 0 )
      {
         AV47BarColNom = httpContext.cgiGet( sCtrlAV47BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarColNom", AV47BarColNom);
      }
      else
      {
         AV47BarColNom = httpContext.cgiGet( sPrefix+"AV47BarColNom_PARM") ;
      }
      sCtrlAV48BarColNum = httpContext.cgiGet( sPrefix+"AV48BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV48BarColNum) > 0 )
      {
         AV48BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV48BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarColNum), 6, 0));
      }
      else
      {
         AV48BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV48BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa19E2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19E2( ) ;
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
      ws19E2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_PARM", GXutil.rtrim( AV23Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_CTRL", GXutil.rtrim( sCtrlAV23Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV24BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24BarCod_CTRL", GXutil.rtrim( sCtrlAV24BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV25BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25BarCodReo_CTRL", GXutil.rtrim( sCtrlAV25BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarCodPar_PARM", GXutil.rtrim( AV26BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26BarCodPar_CTRL", GXutil.rtrim( sCtrlAV26BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV42CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CliCod_CTRL", GXutil.rtrim( sCtrlAV42CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43CliNom_PARM", GXutil.rtrim( AV43CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43CliNom_CTRL", GXutil.rtrim( sCtrlAV43CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44PedidoCliente_PARM", GXutil.rtrim( AV44PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV44PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45BarSer_PARM", GXutil.rtrim( AV45BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45BarSer_CTRL", GXutil.rtrim( sCtrlAV45BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46BarSerDsc_PARM", GXutil.rtrim( AV46BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV46BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarColNom_PARM", GXutil.rtrim( AV47BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarColNom_CTRL", GXutil.rtrim( sCtrlAV47BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV48BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarColNum_CTRL", GXutil.rtrim( sCtrlAV48BarColNum));
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
      we19E2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562139", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("consultadeproduccion_recetas.js", "?202682115562139", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_732( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_73_idx );
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR_"+sGXsfl_73_idx ;
      edtavRctxt_Internalname = sPrefix+"vRCTXT_"+sGXsfl_73_idx ;
      edtavHistorico_Internalname = sPrefix+"vHISTORICO_"+sGXsfl_73_idx ;
      edtavReclinmaq_Internalname = sPrefix+"vRECLINMAQ_"+sGXsfl_73_idx ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE_"+sGXsfl_73_idx ;
      edtavRecmaqt_Internalname = sPrefix+"vRECMAQT_"+sGXsfl_73_idx ;
      edtavRecmaqa_Internalname = sPrefix+"vRECMAQA_"+sGXsfl_73_idx ;
      edtavBarcodgrid_Internalname = sPrefix+"vBARCODGRID_"+sGXsfl_73_idx ;
      edtavBarcodreogrid_Internalname = sPrefix+"vBARCODREOGRID_"+sGXsfl_73_idx ;
      edtavBarcodpargrid_Internalname = sPrefix+"vBARCODPARGRID_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_732( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_73_fel_idx );
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR_"+sGXsfl_73_fel_idx ;
      edtavRctxt_Internalname = sPrefix+"vRCTXT_"+sGXsfl_73_fel_idx ;
      edtavHistorico_Internalname = sPrefix+"vHISTORICO_"+sGXsfl_73_fel_idx ;
      edtavReclinmaq_Internalname = sPrefix+"vRECLINMAQ_"+sGXsfl_73_fel_idx ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE_"+sGXsfl_73_fel_idx ;
      edtavRecmaqt_Internalname = sPrefix+"vRECMAQT_"+sGXsfl_73_fel_idx ;
      edtavRecmaqa_Internalname = sPrefix+"vRECMAQA_"+sGXsfl_73_fel_idx ;
      edtavBarcodgrid_Internalname = sPrefix+"vBARCODGRID_"+sGXsfl_73_fel_idx ;
      edtavBarcodreogrid_Internalname = sPrefix+"vBARCODREOGRID_"+sGXsfl_73_fel_idx ;
      edtavBarcodpargrid_Internalname = sPrefix+"vBARCODPARGRID_"+sGXsfl_73_fel_idx ;
   }

   public void sendrow_732( )
   {
      subsflControlProps_732( ) ;
      wb19E0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_73_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_73_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_73_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV38GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV38GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV38GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_73_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV38GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_73_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarnhdr_Enabled!=0)&&(edtavBarnhdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnhdr_Internalname,GXutil.rtrim( AV13BarNHdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarnhdr_Enabled!=0)&&(edtavBarnhdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,75);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRctxt_Enabled!=0)&&(edtavRctxt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRctxt_Internalname,GXutil.rtrim( AV32RcTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRctxt_Enabled!=0)&&(edtavRctxt_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,76);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRctxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRctxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHistorico_Enabled!=0)&&(edtavHistorico_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHistorico_Internalname,GXutil.rtrim( AV27Historico),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHistorico_Enabled!=0)&&(edtavHistorico_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,77);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHistorico_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHistorico_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclinmaq_Enabled!=0)&&(edtavReclinmaq_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclinmaq_Internalname,GXutil.ltrim( localUtil.ntoc( AV29RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavReclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29RecLinMaq), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavReclinmaq_Enabled!=0)&&(edtavReclinmaq_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavReclinmaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavReclinmaq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrenumcie_Enabled!=0)&&(edtavHrenumcie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrenumcie_Internalname,GXutil.ltrim( localUtil.ntoc( AV28HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrenumcie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV28HreNumCie), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrenumcie_Enabled!=0)&&(edtavHrenumcie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrenumcie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrenumcie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecmaqt_Enabled!=0)&&(edtavRecmaqt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecmaqt_Internalname,GXutil.ltrim( localUtil.ntoc( AV30RecMaqt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecmaqt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30RecMaqt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30RecMaqt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavRecmaqt_Enabled!=0)&&(edtavRecmaqt_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecmaqt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecmaqt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecmaqa_Enabled!=0)&&(edtavRecmaqa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecmaqa_Internalname,GXutil.ltrim( localUtil.ntoc( AV31Recmaqa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecmaqa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31Recmaqa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31Recmaqa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavRecmaqa_Enabled!=0)&&(edtavRecmaqa_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecmaqa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecmaqa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodgrid_Enabled!=0)&&(edtavBarcodgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV39BarCodgrid, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39BarCodgrid), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39BarCodgrid), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodgrid_Enabled!=0)&&(edtavBarcodgrid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodreogrid_Enabled!=0)&&(edtavBarcodreogrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreogrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV40BarCodReoGrid, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreogrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40BarCodReoGrid), "9") : localUtil.format( DecimalUtil.doubleToDec(AV40BarCodReoGrid), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodreogrid_Enabled!=0)&&(edtavBarcodreogrid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreogrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodreogrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodpargrid_Enabled!=0)&&(edtavBarcodpargrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'"+sPrefix+"',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpargrid_Internalname,GXutil.rtrim( AV41BarCodParGrid),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcodpargrid_Enabled!=0)&&(edtavBarcodpargrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpargrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodpargrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19E2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_73_idx = ((subGrid_Islastpage==1)&&(nGXsfl_73_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      /* End function sendrow_732 */
   }

   public void startgridcontrol73( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"73\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Num.Cierres receta Hist.Receta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13BarNHdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV32RcTxt));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRctxt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV27Historico));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHistorico_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV29RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavReclinmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrenumcie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV30RecMaqt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecmaqt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31Recmaqa, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecmaqa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39BarCodgrid, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40BarCodReoGrid, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreogrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV41BarCodParGrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpargrid_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      edtavRctxt_Internalname = sPrefix+"vRCTXT" ;
      edtavHistorico_Internalname = sPrefix+"vHISTORICO" ;
      edtavReclinmaq_Internalname = sPrefix+"vRECLINMAQ" ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE" ;
      edtavRecmaqt_Internalname = sPrefix+"vRECMAQT" ;
      edtavRecmaqa_Internalname = sPrefix+"vRECMAQA" ;
      edtavBarcodgrid_Internalname = sPrefix+"vBARCODGRID" ;
      edtavBarcodreogrid_Internalname = sPrefix+"vBARCODREOGRID" ;
      edtavBarcodpargrid_Internalname = sPrefix+"vBARCODPARGRID" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablacontent_Internalname = sPrefix+"TABLACONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      edtavBarcodpargrid_Jsonclick = "" ;
      edtavBarcodpargrid_Visible = 0 ;
      edtavBarcodpargrid_Enabled = 1 ;
      edtavBarcodreogrid_Jsonclick = "" ;
      edtavBarcodreogrid_Visible = 0 ;
      edtavBarcodreogrid_Enabled = 1 ;
      edtavBarcodgrid_Jsonclick = "" ;
      edtavBarcodgrid_Visible = 0 ;
      edtavBarcodgrid_Enabled = 1 ;
      edtavRecmaqa_Jsonclick = "" ;
      edtavRecmaqa_Visible = 0 ;
      edtavRecmaqa_Enabled = 1 ;
      edtavRecmaqt_Jsonclick = "" ;
      edtavRecmaqt_Visible = 0 ;
      edtavRecmaqt_Enabled = 1 ;
      edtavHrenumcie_Jsonclick = "" ;
      edtavHrenumcie_Visible = 0 ;
      edtavHrenumcie_Enabled = 1 ;
      edtavReclinmaq_Jsonclick = "" ;
      edtavReclinmaq_Visible = 0 ;
      edtavReclinmaq_Enabled = 1 ;
      edtavHistorico_Jsonclick = "" ;
      edtavHistorico_Visible = -1 ;
      edtavHistorico_Enabled = 1 ;
      edtavRctxt_Jsonclick = "" ;
      edtavRctxt_Visible = -1 ;
      edtavRctxt_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Visible = -1 ;
      edtavBarnhdr_Enabled = 1 ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Recetas", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_73_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e1319E2',iparms:[{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV38GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV34BarCodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV35Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV36Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV31Recmaqa',fld:'vRECMAQA',pic:'ZZZ9'},{av:'AV30RecMaqt',fld:'vRECMAQT',pic:'ZZZ9'},{av:'AV29RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV28HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV13BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV32RcTxt',fld:'vRCTXT',pic:''},{av:'AV27Historico',fld:'vHISTORICO',pic:''},{av:'AV39BarCodgrid',fld:'vBARCODGRID',pic:'ZZZZZZZ9'},{av:'AV40BarCodReoGrid',fld:'vBARCODREOGRID',pic:'9'},{av:'AV41BarCodParGrid',fld:'vBARCODPARGRID',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e1419E2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV38GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV39BarCodgrid',fld:'vBARCODGRID',pic:'ZZZZZZZ9'},{av:'AV40BarCodReoGrid',fld:'vBARCODREOGRID',pic:'9'},{av:'AV41BarCodParGrid',fld:'vBARCODPARGRID',pic:''},{av:'AV29RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV28HreNumCie',fld:'vHRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV38GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV28HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV29RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV41BarCodParGrid',fld:'vBARCODPARGRID',pic:''},{av:'AV40BarCodReoGrid',fld:'vBARCODREOGRID',pic:'9'},{av:'AV39BarCodgrid',fld:'vBARCODGRID',pic:'ZZZZZZZ9'},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV25BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV26BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9804HreAcab',fld:'HREACAB',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barcodpargrid',iparms:[]");
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
      wcpOAV23Emprcod = "" ;
      wcpOAV26BarCodPar = "" ;
      wcpOAV43CliNom = "" ;
      wcpOAV44PedidoCliente = "" ;
      wcpOAV45BarSer = "" ;
      wcpOAV46BarSerDsc = "" ;
      wcpOAV47BarColNom = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23Emprcod = "" ;
      AV26BarCodPar = "" ;
      AV43CliNom = "" ;
      AV44PedidoCliente = "" ;
      AV45BarSer = "" ;
      AV46BarSerDsc = "" ;
      AV47BarColNom = "" ;
      AV58Pgmname = "" ;
      AV37BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      A4494HreBarPar = "" ;
      A9804HreAcab = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13BarNHdr = "" ;
      AV32RcTxt = "" ;
      AV27Historico = "" ;
      AV41BarCodParGrid = "" ;
      AV51Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV52Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV53Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Barcodparm = "" ;
      scmdbuf = "" ;
      H019E2_A6039RecAcab = new String[] {""} ;
      H019E2_n6039RecAcab = new boolean[] {false} ;
      H019E2_A130BarCodPar = new String[] {""} ;
      H019E2_A132BarCodReo = new byte[1] ;
      H019E2_A129BarCod = new int[1] ;
      H019E2_A396EmprCod = new String[] {""} ;
      H019E2_A2804RecLinMaq = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      H019E3_A6039RecAcab = new String[] {""} ;
      H019E3_n6039RecAcab = new boolean[] {false} ;
      H019E3_A130BarCodPar = new String[] {""} ;
      H019E3_A132BarCodReo = new byte[1] ;
      H019E3_A129BarCod = new int[1] ;
      H019E3_A396EmprCod = new String[] {""} ;
      H019E3_A2804RecLinMaq = new short[1] ;
      H019E4_A9804HreAcab = new String[] {""} ;
      H019E4_n9804HreAcab = new boolean[] {false} ;
      H019E4_A4494HreBarPar = new String[] {""} ;
      H019E4_A4493HreBarReo = new byte[1] ;
      H019E4_A4492HreBarCod = new int[1] ;
      H019E4_A396EmprCod = new String[] {""} ;
      H019E4_A4545HreLinMaq = new short[1] ;
      H019E4_A4495HreNumCie = new byte[1] ;
      H019E5_A9804HreAcab = new String[] {""} ;
      H019E5_n9804HreAcab = new boolean[] {false} ;
      H019E5_A4494HreBarPar = new String[] {""} ;
      H019E5_A4493HreBarReo = new byte[1] ;
      H019E5_A4492HreBarCod = new int[1] ;
      H019E5_A396EmprCod = new String[] {""} ;
      H019E5_A4545HreLinMaq = new short[1] ;
      H019E5_A4495HreNumCie = new byte[1] ;
      AV18Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23Emprcod = "" ;
      sCtrlAV24BarCod = "" ;
      sCtrlAV25BarCodReo = "" ;
      sCtrlAV26BarCodPar = "" ;
      sCtrlAV42CliCod = "" ;
      sCtrlAV43CliNom = "" ;
      sCtrlAV44PedidoCliente = "" ;
      sCtrlAV45BarSer = "" ;
      sCtrlAV46BarSerDsc = "" ;
      sCtrlAV47BarColNom = "" ;
      sCtrlAV48BarColNum = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_recetas__default(),
         new Object[] {
             new Object[] {
            H019E2_A6039RecAcab, H019E2_n6039RecAcab, H019E2_A130BarCodPar, H019E2_A132BarCodReo, H019E2_A129BarCod, H019E2_A396EmprCod, H019E2_A2804RecLinMaq
            }
            , new Object[] {
            H019E3_A6039RecAcab, H019E3_n6039RecAcab, H019E3_A130BarCodPar, H019E3_A132BarCodReo, H019E3_A129BarCod, H019E3_A396EmprCod, H019E3_A2804RecLinMaq
            }
            , new Object[] {
            H019E4_A9804HreAcab, H019E4_n9804HreAcab, H019E4_A4494HreBarPar, H019E4_A4493HreBarReo, H019E4_A4492HreBarCod, H019E4_A396EmprCod, H019E4_A4545HreLinMaq, H019E4_A4495HreNumCie
            }
            , new Object[] {
            H019E5_A9804HreAcab, H019E5_n9804HreAcab, H019E5_A4494HreBarPar, H019E5_A4493HreBarReo, H019E5_A4492HreBarCod, H019E5_A396EmprCod, H019E5_A4545HreLinMaq, H019E5_A4495HreNumCie
            }
         }
      );
      AV58Pgmname = "ConsultadeProduccion_Recetas" ;
      /* GeneXus formulas. */
      AV58Pgmname = "ConsultadeProduccion_Recetas" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarnhdr_Enabled = 0 ;
      edtavRctxt_Enabled = 0 ;
      edtavHistorico_Enabled = 0 ;
      edtavReclinmaq_Enabled = 0 ;
      edtavHrenumcie_Enabled = 0 ;
      edtavRecmaqt_Enabled = 0 ;
      edtavRecmaqa_Enabled = 0 ;
      edtavBarcodgrid_Enabled = 0 ;
      edtavBarcodreogrid_Enabled = 0 ;
      edtavBarcodpargrid_Enabled = 0 ;
   }

   private byte wcpOAV25BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25BarCodReo ;
   private byte A132BarCodReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV28HreNumCie ;
   private byte AV40BarCodReoGrid ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV35Barcodreom ;
   private byte AV33HdMin ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A2804RecLinMaq ;
   private short A4545HreLinMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short AV38GrupodeAcciones ;
   private short AV29RecLinMaq ;
   private short AV30RecMaqt ;
   private short AV31Recmaqa ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV24BarCod ;
   private int wcpOAV42CliCod ;
   private int wcpOAV48BarColNum ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_73 ;
   private int AV24BarCod ;
   private int AV42CliCod ;
   private int AV48BarColNum ;
   private int nGXsfl_73_idx=1 ;
   private int A129BarCod ;
   private int A4492HreBarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int AV39BarCodgrid ;
   private int subGrid_Islastpage ;
   private int edtavBarnhdr_Enabled ;
   private int edtavRctxt_Enabled ;
   private int edtavHistorico_Enabled ;
   private int edtavReclinmaq_Enabled ;
   private int edtavHrenumcie_Enabled ;
   private int edtavRecmaqt_Enabled ;
   private int edtavRecmaqa_Enabled ;
   private int edtavBarcodgrid_Enabled ;
   private int edtavBarcodreogrid_Enabled ;
   private int edtavBarcodpargrid_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV34BarCodm ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavBarnhdr_Visible ;
   private int edtavRctxt_Visible ;
   private int edtavHistorico_Visible ;
   private int edtavReclinmaq_Visible ;
   private int edtavHrenumcie_Visible ;
   private int edtavRecmaqt_Visible ;
   private int edtavRecmaqa_Visible ;
   private int edtavBarcodgrid_Visible ;
   private int edtavBarcodreogrid_Visible ;
   private int edtavBarcodpargrid_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private String wcpOAV23Emprcod ;
   private String wcpOAV26BarCodPar ;
   private String wcpOAV43CliNom ;
   private String wcpOAV44PedidoCliente ;
   private String wcpOAV45BarSer ;
   private String wcpOAV46BarSerDsc ;
   private String wcpOAV47BarColNom ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV23Emprcod ;
   private String AV26BarCodPar ;
   private String AV43CliNom ;
   private String AV44PedidoCliente ;
   private String AV45BarSer ;
   private String AV46BarSerDsc ;
   private String AV47BarColNom ;
   private String sGXsfl_73_idx="0001" ;
   private String AV58Pgmname ;
   private String AV37BarAgrEst ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String A4494HreBarPar ;
   private String A9804HreAcab ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablacontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV13BarNHdr ;
   private String edtavBarnhdr_Internalname ;
   private String AV32RcTxt ;
   private String edtavRctxt_Internalname ;
   private String AV27Historico ;
   private String edtavHistorico_Internalname ;
   private String edtavReclinmaq_Internalname ;
   private String edtavHrenumcie_Internalname ;
   private String edtavRecmaqt_Internalname ;
   private String edtavRecmaqa_Internalname ;
   private String edtavBarcodgrid_Internalname ;
   private String edtavBarcodreogrid_Internalname ;
   private String AV41BarCodParGrid ;
   private String edtavBarcodpargrid_Internalname ;
   private String AV51Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV52Emprnom ;
   private String GXv_char3[] ;
   private String AV53Usurcod ;
   private String GXv_char4[] ;
   private String AV36Barcodparm ;
   private String scmdbuf ;
   private String sCtrlAV23Emprcod ;
   private String sCtrlAV24BarCod ;
   private String sCtrlAV25BarCodReo ;
   private String sCtrlAV26BarCodPar ;
   private String sCtrlAV42CliCod ;
   private String sCtrlAV43CliNom ;
   private String sCtrlAV44PedidoCliente ;
   private String sCtrlAV45BarSer ;
   private String sCtrlAV46BarSerDsc ;
   private String sCtrlAV47BarColNom ;
   private String sCtrlAV48BarColNum ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavRctxt_Jsonclick ;
   private String edtavHistorico_Jsonclick ;
   private String edtavReclinmaq_Jsonclick ;
   private String edtavHrenumcie_Jsonclick ;
   private String edtavRecmaqt_Jsonclick ;
   private String edtavRecmaqa_Jsonclick ;
   private String edtavBarcodgrid_Jsonclick ;
   private String edtavBarcodreogrid_Jsonclick ;
   private String edtavBarcodpargrid_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6039RecAcab ;
   private boolean n9804HreAcab ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H019E2_A6039RecAcab ;
   private boolean[] H019E2_n6039RecAcab ;
   private String[] H019E2_A130BarCodPar ;
   private byte[] H019E2_A132BarCodReo ;
   private int[] H019E2_A129BarCod ;
   private String[] H019E2_A396EmprCod ;
   private short[] H019E2_A2804RecLinMaq ;
   private String[] H019E3_A6039RecAcab ;
   private boolean[] H019E3_n6039RecAcab ;
   private String[] H019E3_A130BarCodPar ;
   private byte[] H019E3_A132BarCodReo ;
   private int[] H019E3_A129BarCod ;
   private String[] H019E3_A396EmprCod ;
   private short[] H019E3_A2804RecLinMaq ;
   private String[] H019E4_A9804HreAcab ;
   private boolean[] H019E4_n9804HreAcab ;
   private String[] H019E4_A4494HreBarPar ;
   private byte[] H019E4_A4493HreBarReo ;
   private int[] H019E4_A4492HreBarCod ;
   private String[] H019E4_A396EmprCod ;
   private short[] H019E4_A4545HreLinMaq ;
   private byte[] H019E4_A4495HreNumCie ;
   private String[] H019E5_A9804HreAcab ;
   private boolean[] H019E5_n9804HreAcab ;
   private String[] H019E5_A4494HreBarPar ;
   private byte[] H019E5_A4493HreBarReo ;
   private int[] H019E5_A4492HreBarCod ;
   private String[] H019E5_A396EmprCod ;
   private short[] H019E5_A4545HreLinMaq ;
   private byte[] H019E5_A4495HreNumCie ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
}

final  class consultadeproduccion_recetas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019E2", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab <> 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019E3", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019E4", "SELECT HreAcab, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLinMaq, HreNumCie FROM TXPHISREM WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreAcab <> 'S') ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019E5", "SELECT HreAcab, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLinMaq, HreNumCie FROM TXPHISREM WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreAcab = 'S') ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

