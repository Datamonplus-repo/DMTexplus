package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_defecto_impl extends GXWebComponent
{
   public mant_defecto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_defecto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_defecto_impl.class ));
   }

   public mant_defecto_impl( int remoteHandle ,
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
               AV14EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14EmprCod", AV14EmprCod);
               AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
               AV6ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod", AV6ArtCod);
               AV18ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
               AV31TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipMaqCodJSON", AV31TipMaqCodJSON);
               AV16FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FechaInicio", localUtil.format(AV16FechaInicio, "99/99/99"));
               AV15FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FechaFin", localUtil.format(AV15FechaFin, "99/99/99"));
               AV23MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod", AV23MaqCod);
               AV25MTknUsu = httpContext.GetPar( "MTknUsu") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MTknUsu", AV25MTknUsu);
               AV24MTkn = httpContext.GetPar( "MTkn") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MTkn", AV24MTkn);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV14EmprCod,Integer.valueOf(AV7CliCod),AV6ArtCod,Integer.valueOf(AV18ForColNum),AV31TipMaqCodJSON,AV16FechaInicio,AV15FechaFin,AV23MaqCod,AV25MTknUsu,AV24MTkn});
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DT2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "MAnt_Defecto", "")) ;
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
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant_defecto", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV6ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV31TipMaqCodJSON)),GXutil.URLEncode(GXutil.formatDateParm(AV16FechaInicio)),GXutil.URLEncode(GXutil.formatDateParm(AV15FechaFin)),GXutil.URLEncode(GXutil.rtrim(AV23MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV25MTknUsu)),GXutil.URLEncode(GXutil.rtrim(AV24MTkn))}, new String[] {"EmprCod","CliCod","ArtCod","ForColNum","TipMaqCodJSON","FechaInicio","FechaFin","MaqCod","MTknUsu","MTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Defecto");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_defecto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV13Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV13Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV27Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV27Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV19ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV19ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV21ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV21ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV17FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV17FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV20ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV20ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14EmprCod", GXutil.rtrim( wcpOAV14EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ArtCod", GXutil.rtrim( wcpOAV6ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31TipMaqCodJSON", wcpOAV31TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16FechaInicio", localUtil.dtoc( wcpOAV16FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15FechaFin", localUtil.dtoc( wcpOAV15FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23MaqCod", GXutil.rtrim( wcpOAV23MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25MTknUsu", GXutil.rtrim( wcpOAV25MTknUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24MTkn", wcpOAV24MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALORRECIBIDOVARIABLE", AV33ValorRecibidoVariable);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVARIABLE", AV35Variable);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTIPMAQCODS", AV32TipMaqCodS);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTIPMAQCODS", AV32TipMaqCodS);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTPARAMETROS", AV5sdtParametros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTPARAMETROS", AV5sdtParametros);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV14EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV6ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIO", localUtil.dtoc( AV16FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV15FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKNUSU", GXutil.rtrim( AV25MTknUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMTKN", AV24MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMAQCODJSON", AV31TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV23MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Objectcall", GXutil.rtrim( Defecto_query_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Allowchangeaxesorder", GXutil.booltostr( Defecto_query_Allowchangeaxesorder));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Objectcall", GXutil.rtrim( Defecto_query_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Class", GXutil.rtrim( Defecto_query_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Allowselection", GXutil.booltostr( Defecto_query_Allowselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Type", GXutil.rtrim( Defecto_query_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Paging", GXutil.booltostr( Defecto_query_Paging));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEFECTO_QUERY_Pagesize", GXutil.ltrim( localUtil.ntoc( Defecto_query_Pagesize, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2DT2( )
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
      return "AnticipacionErrores.MAnt_Defecto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAnt_Defecto", "") ;
   }

   public void wb2DT0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.anticipacionerrores.mant_defecto");
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Defecto_query", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDefecto_query.setProperty("Elements", AV13Elements);
         ucDefecto_query.setProperty("AllowElementsOrderChange", Defecto_query_Allowchangeaxesorder);
         ucDefecto_query.setProperty("Parameters", AV27Parameters);
         ucDefecto_query.setProperty("AllowSelection", Defecto_query_Allowselection);
         ucDefecto_query.setProperty("Type", Defecto_query_Type);
         ucDefecto_query.setProperty("Title", Defecto_query_Title);
         ucDefecto_query.setProperty("Paging", Defecto_query_Paging);
         ucDefecto_query.setProperty("PageSize", Defecto_query_Pagesize);
         ucDefecto_query.setProperty("ItemClickData", AV19ItemClickData);
         ucDefecto_query.setProperty("ItemDoubleClickData", AV21ItemDoubleClickData);
         ucDefecto_query.setProperty("DragAndDropData", AV11DragAndDropData);
         ucDefecto_query.setProperty("FilterChangedData", AV17FilterChangedData);
         ucDefecto_query.setProperty("ItemExpandData", AV22ItemExpandData);
         ucDefecto_query.setProperty("ItemCollapseData", AV20ItemCollapseData);
         ucDefecto_query.render(context, "queryviewer", Defecto_query_Internalname, sPrefix+"DEFECTO_QUERYContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV42Pgmname), GXutil.rtrim( localUtil.format( AV42Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Defecto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "", "", "", lblTextblock1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Defecto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2DT2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "MAnt_Defecto", ""), (short)(0)) ;
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
            strup2DT0( ) ;
         }
      }
   }

   public void ws2DT2( )
   {
      start2DT2( ) ;
      evt2DT2( ) ;
   }

   public void evt2DT2( )
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
                              strup2DT0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DEFECTO_QUERY.ITEMCLICK") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e122DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESHGRID") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e142DT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DT0( ) ;
                           }
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
                              strup2DT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2DT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DT2( ) ;
         }
      }
   }

   public void pa2DT2( )
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
      rf2DT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV42Pgmname = "AnticipacionErrores.MAnt_Defecto" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Pgmname", AV42Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e142DT2 ();
         wb2DT0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2DT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
   }

   public void before_start_formulas( )
   {
      AV42Pgmname = "AnticipacionErrores.MAnt_Defecto" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Pgmname", AV42Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e122DT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV13Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV27Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV19ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV21ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV11DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV17FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV22ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV20ItemCollapseData);
         /* Read saved values. */
         wcpOAV14EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV14EmprCod") ;
         wcpOAV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV6ArtCod") ;
         wcpOAV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV31TipMaqCodJSON") ;
         wcpOAV16FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV16FechaInicio"), 0) ;
         wcpOAV15FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15FechaFin"), 0) ;
         wcpOAV23MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod") ;
         wcpOAV25MTknUsu = httpContext.cgiGet( sPrefix+"wcpOAV25MTknUsu") ;
         wcpOAV24MTkn = httpContext.cgiGet( sPrefix+"wcpOAV24MTkn") ;
         Defecto_query_Objectcall = httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Objectcall") ;
         Defecto_query_Allowchangeaxesorder = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Allowchangeaxesorder")) ;
         Defecto_query_Objectcall = httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Objectcall") ;
         Defecto_query_Class = httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Class") ;
         Defecto_query_Allowselection = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Allowselection")) ;
         Defecto_query_Type = httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Type") ;
         Defecto_query_Paging = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Paging")) ;
         Defecto_query_Pagesize = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DEFECTO_QUERY_Pagesize"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Pgmname", AV42Pgmname);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Defecto");
         AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Pgmname", AV42Pgmname);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42Pgmname, ""))));
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mant_defecto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e122DT2 ();
      if (returnInSub) return;
   }

   public void e122DT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV30TipMaqCodCollection.fromJSonString(AV31TipMaqCodJSON, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Ingresando con filtros DEFECTO para Empresa=%1, Cliente=%2, Articulo:%3, Color=%4, Tipo Maquinas:%5, Fechas:%6-%7.", ""), AV14EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0), AV6ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0), AV30TipMaqCodCollection.toJSonString(false), localUtil.dtoc( AV16FechaInicio, 0, "-"), localUtil.dtoc( AV15FechaFin, 0, "-"), "", ""), AV42Pgmname) ;
      AV29sdtMTok.fromJSonString(AV36WebSession.getValue("TexplusNET_Token"), null);
      if ( ! ( ( GXutil.strcmp(AV29sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), AV25MTknUsu) == 0 ) || ( GXutil.strcmp(AV29sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV24MTkn) == 0 ) ) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "DEFECTO token no coincide .. Web Session token>%1", ""), AV29sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV42Pgmname) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "no coincide TOKEN", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      AV5sdtParametros.setgxTv_SdtsdtParametros_Emprcod( AV14EmprCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Clicod( AV7CliCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Artcod( AV6ArtCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( AV18ForColNum );
      AV32TipMaqCodS = AV30TipMaqCodCollection ;
      AV5sdtParametros.setgxTv_SdtsdtParametros_Maqcod( AV23MaqCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV16FechaInicio );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV15FechaFin );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( AV25MTknUsu );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Mtkn( AV24MTkn );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "por start &sdtParametros:%1, tipomaquinas:%2.", ""), AV5sdtParametros.toJSonString(false, true), AV32TipMaqCodS.toJSonString(false), "", "", "", "", "", "", ""), AV42Pgmname) ;
      /* Execute user subroutine: 'CARGA QUERY' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mant_defecto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV14EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      mant_defecto_impl.this.AV14EmprCod = GXv_char2[0] ;
      mant_defecto_impl.this.AV38EmprNom = GXv_char3[0] ;
      mant_defecto_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14EmprCod", AV14EmprCod);
   }

   public void e132DT2( )
   {
      /* GlobalEvents_Refreshgrid Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Variable, "MAnt_Filtrado") == 0 )
      {
         AV5sdtParametros.fromJSonString(AV33ValorRecibidoVariable, null);
         AV32TipMaqCodS.clear();
         AV32TipMaqCodS.add(AV5sdtParametros.getgxTv_SdtsdtParametros_Tipmaqcod(), 0);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Llegan datos:%1, %2, tipomaquinas:%3.", ""), AV35Variable, AV5sdtParametros.toJSonString(false, true), AV32TipMaqCodS.toJSonString(false), "", "", "", "", "", ""), AV42Pgmname) ;
         /* Execute user subroutine: 'CARGA QUERY' */
         S112 ();
         if (returnInSub) return;
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado_TabDefecto",AV33ValorRecibidoVariable}, true);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5sdtParametros", AV5sdtParametros);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32TipMaqCodS", AV32TipMaqCodS);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Elements", AV13Elements);
   }

   public void e112DT2( )
   {
      /* Defecto_query_Itemclick Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'OBTENER CONTEXTO CELDA CLICK' */
      S122 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV5sdtParametros.getgxTv_SdtsdtParametros_Maqcod())==0) )
      {
         AV33ValorRecibidoVariable = AV5sdtParametros.toJSonString(false, true) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ValorRecibidoVariable", AV33ValorRecibidoVariable);
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Defecto",AV33ValorRecibidoVariable}, true);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Contexto no encontrado", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5sdtParametros", AV5sdtParametros);
   }

   public void S112( )
   {
      /* 'CARGA QUERY' Routine */
      returnInSub = false ;
      AV13Elements.clear();
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefColNom" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Color", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMaqDsc" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Maquina", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefTipMDs" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Tipo Maquina", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefDefDsc" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Defecto", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefCatDsc" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Categoria", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefCliNom" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Cliente", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Columns" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefArtDsc" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Articulo", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Columns" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefKilReo" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Kilos Reoperados", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "Z,ZZZ,ZZZ,ZZZ,ZZ9.99", "") );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefPorc" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Porcentaje", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "Z99.99", "") );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMetReo" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Metros Reoperados", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "Z,ZZZ,ZZZ,ZZZ,ZZ9.99", "") );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMetPor" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "M. Porc", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "Z99.99", "") );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefId" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefId", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefEmprCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefEmprCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefCliCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefCliCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefArtCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefArtCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefUsu" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefUsu", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefTkn" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefTkn", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefTipMCo" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefTipMCo", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMaqCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefMaqCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefColCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefColCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefColNum" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefColNum", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefArtCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefArtCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefCatCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefCatCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefDefCod" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefDefCod", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefKilTot" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefKilTot", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefKilPro" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefKilPro", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMetTot" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefMetTot", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      AV12Element = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Name( "MDefMetPro" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "MDefMetPro", "") );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
      AV12Element.setgxTv_SdtQueryViewerElements_Element_Visible( "Never" );
      AV12Element.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "No" );
      AV13Elements.add(AV12Element, 0);
      Defecto_query_Class = "QueryViewer" ;
      ucDefecto_query.sendProperty(context, sPrefix, false, Defecto_query_Internalname, "Class", Defecto_query_Class);
      Defecto_query_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "AnticipacionErrores\\MAnt_Defecto_Dp")+"\", \""+GXutil.encodeJSON( AV5sdtParametros.getgxTv_SdtsdtParametros_Emprcod())+"\", \""+GXutil.encodeJSON( GXutil.str( AV5sdtParametros.getgxTv_SdtsdtParametros_Clicod(), 6, 0))+"\", \""+GXutil.encodeJSON( AV5sdtParametros.getgxTv_SdtsdtParametros_Artcod())+"\", \""+GXutil.encodeJSON( GXutil.str( AV5sdtParametros.getgxTv_SdtsdtParametros_Forcolnum(), 6, 0))+"\", \""+GXutil.encodeJSON( AV32TipMaqCodS.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV5sdtParametros.getgxTv_SdtsdtParametros_Maqcod())+"\", \""+GXutil.encodeJSON( localUtil.dtoc( AV5sdtParametros.getgxTv_SdtsdtParametros_Fechainicio(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"\", \""+GXutil.encodeJSON( localUtil.dtoc( AV5sdtParametros.getgxTv_SdtsdtParametros_Fechafin(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"\", \""+GXutil.encodeJSON( AV5sdtParametros.getgxTv_SdtsdtParametros_Mtknusu())+"\", \""+GXutil.encodeJSON( AV5sdtParametros.getgxTv_SdtsdtParametros_Mtkn())+"\" ]" ;
      ucDefecto_query.sendProperty(context, sPrefix, false, Defecto_query_Internalname, "Object", Defecto_query_Objectcall);
   }

   public void S122( )
   {
      /* 'OBTENER CONTEXTO CELDA CLICK' Routine */
      returnInSub = false ;
      AV8DataPosicion.clear();
      AV8DataPosicion = AV19ItemClickData.getgxTv_SdtQueryViewerItemClickData_Context() ;
      AV5sdtParametros = (app.anticipacionerrores.SdtsdtParametros)new app.anticipacionerrores.SdtsdtParametros(remoteHandle, context);
      AV5sdtParametros.setgxTv_SdtsdtParametros_Emprcod( AV14EmprCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Clicod( AV7CliCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Artcod( AV6ArtCod );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV16FechaInicio );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV15FechaFin );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( AV25MTknUsu );
      AV5sdtParametros.setgxTv_SdtsdtParametros_Mtkn( AV24MTkn );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Datos de la posicion DATA =%1,", AV8DataPosicion.toJSonString(false), "", "", "", "", "", "", "", ""), AV42Pgmname) ;
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV8DataPosicion.size() )
      {
         AV9DataPosicionElemento = (app.SdtQueryViewerItemClickData_Element)((app.SdtQueryViewerItemClickData_Element)AV8DataPosicion.elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Name(), httpContext.getMessage( "MDefColNum", "")) == 0 )
         {
            AV5sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( 0 );
            if ( AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() == 1 )
            {
               AV44GXV2 = 1 ;
               while ( AV44GXV2 <= AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() )
               {
                  AV34Values = (String)AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().elementAt(-1+AV44GXV2) ;
                  AV5sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( (int)(GXutil.lval( AV34Values)) );
                  if (true) break;
                  AV44GXV2 = (int)(AV44GXV2+1) ;
               }
            }
         }
         else if ( GXutil.strcmp(AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Name(), httpContext.getMessage( "MDefTipMCo", "")) == 0 )
         {
            AV5sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( " " );
            if ( AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() == 1 )
            {
               AV45GXV3 = 1 ;
               while ( AV45GXV3 <= AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() )
               {
                  AV34Values = (String)AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().elementAt(-1+AV45GXV3) ;
                  AV5sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( AV34Values );
                  if (true) break;
                  AV45GXV3 = (int)(AV45GXV3+1) ;
               }
            }
         }
         else if ( GXutil.strcmp(AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Name(), httpContext.getMessage( "MDefMaqCod", "")) == 0 )
         {
            AV5sdtParametros.setgxTv_SdtsdtParametros_Maqcod( " " );
            if ( AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() == 1 )
            {
               AV46GXV4 = 1 ;
               while ( AV46GXV4 <= AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() )
               {
                  AV34Values = (String)AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().elementAt(-1+AV46GXV4) ;
                  AV5sdtParametros.setgxTv_SdtsdtParametros_Maqcod( AV34Values );
                  if (true) break;
                  AV46GXV4 = (int)(AV46GXV4+1) ;
               }
            }
         }
         else if ( GXutil.strcmp(AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Name(), httpContext.getMessage( "MDefCatCod", "")) == 0 )
         {
            AV5sdtParametros.setgxTv_SdtsdtParametros_Catcod( (short)(0) );
            if ( AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() == 1 )
            {
               AV47GXV5 = 1 ;
               while ( AV47GXV5 <= AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() )
               {
                  AV34Values = (String)AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().elementAt(-1+AV47GXV5) ;
                  AV5sdtParametros.setgxTv_SdtsdtParametros_Catcod( (short)(GXutil.lval( AV34Values)) );
                  if (true) break;
                  AV47GXV5 = (int)(AV47GXV5+1) ;
               }
            }
         }
         else if ( GXutil.strcmp(AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Name(), httpContext.getMessage( "MDefDefCod", "")) == 0 )
         {
            AV5sdtParametros.setgxTv_SdtsdtParametros_Defcod( (short)(0) );
            if ( AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() == 1 )
            {
               AV48GXV6 = 1 ;
               while ( AV48GXV6 <= AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().size() )
               {
                  AV34Values = (String)AV9DataPosicionElemento.getgxTv_SdtQueryViewerItemClickData_Element_Values().elementAt(-1+AV48GXV6) ;
                  AV5sdtParametros.setgxTv_SdtsdtParametros_Defcod( (short)(GXutil.lval( AV34Values)) );
                  if (true) break;
                  AV48GXV6 = (int)(AV48GXV6+1) ;
               }
            }
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Datos de la posicion FORMATEADA =%1,", AV5sdtParametros.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV42Pgmname) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e142DT2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV14EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14EmprCod", AV14EmprCod);
      AV7CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      AV6ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod", AV6ArtCod);
      AV18ForColNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
      AV31TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipMaqCodJSON", AV31TipMaqCodJSON);
      AV16FechaInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FechaInicio", localUtil.format(AV16FechaInicio, "99/99/99"));
      AV15FechaFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FechaFin", localUtil.format(AV15FechaFin, "99/99/99"));
      AV23MaqCod = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod", AV23MaqCod);
      AV25MTknUsu = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MTknUsu", AV25MTknUsu);
      AV24MTkn = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MTkn", AV24MTkn);
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
      pa2DT2( ) ;
      ws2DT2( ) ;
      we2DT2( ) ;
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
      sCtrlAV14EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV7CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV18ForColNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV31TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV16FechaInicio = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV15FechaFin = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV23MaqCod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV25MTknUsu = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV24MTkn = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "anticipacionerrores\\mant_defecto", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV14EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14EmprCod", AV14EmprCod);
         AV7CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         AV6ArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod", AV6ArtCod);
         AV18ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
         AV31TipMaqCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipMaqCodJSON", AV31TipMaqCodJSON);
         AV16FechaInicio = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FechaInicio", localUtil.format(AV16FechaInicio, "99/99/99"));
         AV15FechaFin = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FechaFin", localUtil.format(AV15FechaFin, "99/99/99"));
         AV23MaqCod = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod", AV23MaqCod);
         AV25MTknUsu = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MTknUsu", AV25MTknUsu);
         AV24MTkn = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MTkn", AV24MTkn);
      }
      wcpOAV14EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV14EmprCod") ;
      wcpOAV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV6ArtCod") ;
      wcpOAV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV31TipMaqCodJSON") ;
      wcpOAV16FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV16FechaInicio"), 0) ;
      wcpOAV15FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15FechaFin"), 0) ;
      wcpOAV23MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod") ;
      wcpOAV25MTknUsu = httpContext.cgiGet( sPrefix+"wcpOAV25MTknUsu") ;
      wcpOAV24MTkn = httpContext.cgiGet( sPrefix+"wcpOAV24MTkn") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV14EmprCod, wcpOAV14EmprCod) != 0 ) || ( AV7CliCod != wcpOAV7CliCod ) || ( GXutil.strcmp(AV6ArtCod, wcpOAV6ArtCod) != 0 ) || ( AV18ForColNum != wcpOAV18ForColNum ) || ( GXutil.strcmp(AV31TipMaqCodJSON, wcpOAV31TipMaqCodJSON) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV16FechaInicio), GXutil.resetTime(wcpOAV16FechaInicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV15FechaFin), GXutil.resetTime(wcpOAV15FechaFin)) ) || ( GXutil.strcmp(AV23MaqCod, wcpOAV23MaqCod) != 0 ) || ( GXutil.strcmp(AV25MTknUsu, wcpOAV25MTknUsu) != 0 ) || ( GXutil.strcmp(AV24MTkn, wcpOAV24MTkn) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV14EmprCod = AV14EmprCod ;
      wcpOAV7CliCod = AV7CliCod ;
      wcpOAV6ArtCod = AV6ArtCod ;
      wcpOAV18ForColNum = AV18ForColNum ;
      wcpOAV31TipMaqCodJSON = AV31TipMaqCodJSON ;
      wcpOAV16FechaInicio = AV16FechaInicio ;
      wcpOAV15FechaFin = AV15FechaFin ;
      wcpOAV23MaqCod = AV23MaqCod ;
      wcpOAV25MTknUsu = AV25MTknUsu ;
      wcpOAV24MTkn = AV24MTkn ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV14EmprCod = httpContext.cgiGet( sPrefix+"AV14EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV14EmprCod) > 0 )
      {
         AV14EmprCod = httpContext.cgiGet( sCtrlAV14EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14EmprCod", AV14EmprCod);
      }
      else
      {
         AV14EmprCod = httpContext.cgiGet( sPrefix+"AV14EmprCod_PARM") ;
      }
      sCtrlAV7CliCod = httpContext.cgiGet( sPrefix+"AV7CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV7CliCod) > 0 )
      {
         AV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      }
      else
      {
         AV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6ArtCod = httpContext.cgiGet( sPrefix+"AV6ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6ArtCod) > 0 )
      {
         AV6ArtCod = httpContext.cgiGet( sCtrlAV6ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod", AV6ArtCod);
      }
      else
      {
         AV6ArtCod = httpContext.cgiGet( sPrefix+"AV6ArtCod_PARM") ;
      }
      sCtrlAV18ForColNum = httpContext.cgiGet( sPrefix+"AV18ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV18ForColNum) > 0 )
      {
         AV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
      }
      else
      {
         AV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV31TipMaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV31TipMaqCodJSON) > 0 )
      {
         AV31TipMaqCodJSON = httpContext.cgiGet( sCtrlAV31TipMaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipMaqCodJSON", AV31TipMaqCodJSON);
      }
      else
      {
         AV31TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV31TipMaqCodJSON_PARM") ;
      }
      sCtrlAV16FechaInicio = httpContext.cgiGet( sPrefix+"AV16FechaInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV16FechaInicio) > 0 )
      {
         AV16FechaInicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV16FechaInicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FechaInicio", localUtil.format(AV16FechaInicio, "99/99/99"));
      }
      else
      {
         AV16FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV16FechaInicio_PARM"), 0) ;
      }
      sCtrlAV15FechaFin = httpContext.cgiGet( sPrefix+"AV15FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV15FechaFin) > 0 )
      {
         AV15FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV15FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FechaFin", localUtil.format(AV15FechaFin, "99/99/99"));
      }
      else
      {
         AV15FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV15FechaFin_PARM"), 0) ;
      }
      sCtrlAV23MaqCod = httpContext.cgiGet( sPrefix+"AV23MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV23MaqCod) > 0 )
      {
         AV23MaqCod = httpContext.cgiGet( sCtrlAV23MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod", AV23MaqCod);
      }
      else
      {
         AV23MaqCod = httpContext.cgiGet( sPrefix+"AV23MaqCod_PARM") ;
      }
      sCtrlAV25MTknUsu = httpContext.cgiGet( sPrefix+"AV25MTknUsu_CTRL") ;
      if ( GXutil.len( sCtrlAV25MTknUsu) > 0 )
      {
         AV25MTknUsu = httpContext.cgiGet( sCtrlAV25MTknUsu) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MTknUsu", AV25MTknUsu);
      }
      else
      {
         AV25MTknUsu = httpContext.cgiGet( sPrefix+"AV25MTknUsu_PARM") ;
      }
      sCtrlAV24MTkn = httpContext.cgiGet( sPrefix+"AV24MTkn_CTRL") ;
      if ( GXutil.len( sCtrlAV24MTkn) > 0 )
      {
         AV24MTkn = httpContext.cgiGet( sCtrlAV24MTkn) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MTkn", AV24MTkn);
      }
      else
      {
         AV24MTkn = httpContext.cgiGet( sPrefix+"AV24MTkn_PARM") ;
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
      pa2DT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DT2( ) ;
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
      ws2DT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14EmprCod_PARM", GXutil.rtrim( AV14EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14EmprCod_CTRL", GXutil.rtrim( sCtrlAV14EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7CliCod_CTRL", GXutil.rtrim( sCtrlAV7CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArtCod_PARM", GXutil.rtrim( AV6ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArtCod_CTRL", GXutil.rtrim( sCtrlAV6ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNum_CTRL", GXutil.rtrim( sCtrlAV18ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipMaqCodJSON_PARM", AV31TipMaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31TipMaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipMaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV31TipMaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16FechaInicio_PARM", localUtil.dtoc( AV16FechaInicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16FechaInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16FechaInicio_CTRL", GXutil.rtrim( sCtrlAV16FechaInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15FechaFin_PARM", localUtil.dtoc( AV15FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15FechaFin_CTRL", GXutil.rtrim( sCtrlAV15FechaFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod_PARM", GXutil.rtrim( AV23MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod_CTRL", GXutil.rtrim( sCtrlAV23MaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25MTknUsu_PARM", GXutil.rtrim( AV25MTknUsu));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25MTknUsu)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25MTknUsu_CTRL", GXutil.rtrim( sCtrlAV25MTknUsu));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MTkn_PARM", AV24MTkn);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24MTkn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MTkn_CTRL", GXutil.rtrim( sCtrlAV24MTkn));
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
      we2DT2( ) ;
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
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026798581661", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mant_defecto.js", "?2026798581662", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Defecto_query_Internalname = sPrefix+"DEFECTO_QUERY" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      lblTextblock1_Internalname = sPrefix+"TEXTBLOCK1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Defecto_query_Title = "" ;
      Defecto_query_Pagesize = 30 ;
      Defecto_query_Paging = GXutil.toBoolean( -1) ;
      Defecto_query_Type = "PivotTable" ;
      Defecto_query_Allowselection = GXutil.toBoolean( 1) ;
      Defecto_query_Class = "QueryViewer" ;
      Defecto_query_Allowchangeaxesorder = GXutil.toBoolean( -1) ;
      Defecto_query_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV42Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID","{handler:'e132DT2',iparms:[{av:'AV33ValorRecibidoVariable',fld:'vVALORRECIBIDOVARIABLE',pic:''},{av:'AV35Variable',fld:'vVARIABLE',pic:''},{av:'AV42Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32TipMaqCodS',fld:'vTIPMAQCODS',pic:''},{av:'AV5sdtParametros',fld:'vSDTPARAMETROS',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESHGRID",",oparms:[{av:'AV5sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'AV32TipMaqCodS',fld:'vTIPMAQCODS',pic:''},{av:'AV13Elements',fld:'vELEMENTS',pic:''},{av:'Defecto_query_Class',ctrl:'DEFECTO_QUERY',prop:'Class'},{ctrl:'DEFECTO_QUERY'}]}");
      setEventMetadata("DEFECTO_QUERY.ITEMCLICK","{handler:'e112DT2',iparms:[{av:'AV5sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'AV19ItemClickData',fld:'vITEMCLICKDATA',pic:''},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6ArtCod',fld:'vARTCOD',pic:''},{av:'AV16FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV15FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV25MTknUsu',fld:'vMTKNUSU',pic:''},{av:'AV24MTkn',fld:'vMTKN',pic:''},{av:'AV42Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("DEFECTO_QUERY.ITEMCLICK",",oparms:[{av:'AV33ValorRecibidoVariable',fld:'vVALORRECIBIDOVARIABLE',pic:''},{av:'AV5sdtParametros',fld:'vSDTPARAMETROS',pic:''}]}");
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
      wcpOAV14EmprCod = "" ;
      wcpOAV6ArtCod = "" ;
      wcpOAV31TipMaqCodJSON = "" ;
      wcpOAV16FechaInicio = GXutil.nullDate() ;
      wcpOAV15FechaFin = GXutil.nullDate() ;
      wcpOAV23MaqCod = "" ;
      wcpOAV25MTknUsu = "" ;
      wcpOAV24MTkn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV14EmprCod = "" ;
      AV6ArtCod = "" ;
      AV31TipMaqCodJSON = "" ;
      AV16FechaInicio = GXutil.nullDate() ;
      AV15FechaFin = GXutil.nullDate() ;
      AV23MaqCod = "" ;
      AV25MTknUsu = "" ;
      AV24MTkn = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV42Pgmname = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV27Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV19ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV21ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV11DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV17FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV22ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV20ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      AV33ValorRecibidoVariable = "" ;
      AV35Variable = "" ;
      AV32TipMaqCodS = new GXSimpleCollection<String>(String.class, "internal", "");
      AV5sdtParametros = new app.anticipacionerrores.SdtsdtParametros(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDefecto_query = new com.genexus.webpanels.GXUserControl();
      lblTextblock1_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV30TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      AV37Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV38EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV39UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV12Element = new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV8DataPosicion = new GXBaseCollection<app.SdtQueryViewerItemClickData_Element>(app.SdtQueryViewerItemClickData_Element.class, "QueryViewerItemClickData.Element", "TexplusNET", remoteHandle);
      AV9DataPosicionElemento = new app.SdtQueryViewerItemClickData_Element(remoteHandle, context);
      AV34Values = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV14EmprCod = "" ;
      sCtrlAV7CliCod = "" ;
      sCtrlAV6ArtCod = "" ;
      sCtrlAV18ForColNum = "" ;
      sCtrlAV31TipMaqCodJSON = "" ;
      sCtrlAV16FechaInicio = "" ;
      sCtrlAV15FechaFin = "" ;
      sCtrlAV23MaqCod = "" ;
      sCtrlAV25MTknUsu = "" ;
      sCtrlAV24MTkn = "" ;
      AV42Pgmname = "AnticipacionErrores.MAnt_Defecto" ;
      /* GeneXus formulas. */
      AV42Pgmname = "AnticipacionErrores.MAnt_Defecto" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV7CliCod ;
   private int wcpOAV18ForColNum ;
   private int AV7CliCod ;
   private int AV18ForColNum ;
   private int Defecto_query_Pagesize ;
   private int edtavPgmname_Enabled ;
   private int AV43GXV1 ;
   private int AV44GXV2 ;
   private int AV45GXV3 ;
   private int AV46GXV4 ;
   private int AV47GXV5 ;
   private int AV48GXV6 ;
   private int idxLst ;
   private String wcpOAV14EmprCod ;
   private String wcpOAV6ArtCod ;
   private String wcpOAV23MaqCod ;
   private String wcpOAV25MTknUsu ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV14EmprCod ;
   private String AV6ArtCod ;
   private String AV23MaqCod ;
   private String AV25MTknUsu ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV42Pgmname ;
   private String GXKey ;
   private String Defecto_query_Objectcall ;
   private String Defecto_query_Class ;
   private String Defecto_query_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Defecto_query_Title ;
   private String Defecto_query_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV37Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV38EmprNom ;
   private String GXv_char3[] ;
   private String AV39UsurCod ;
   private String GXv_char4[] ;
   private String AV34Values ;
   private String sCtrlAV14EmprCod ;
   private String sCtrlAV7CliCod ;
   private String sCtrlAV6ArtCod ;
   private String sCtrlAV18ForColNum ;
   private String sCtrlAV31TipMaqCodJSON ;
   private String sCtrlAV16FechaInicio ;
   private String sCtrlAV15FechaFin ;
   private String sCtrlAV23MaqCod ;
   private String sCtrlAV25MTknUsu ;
   private String sCtrlAV24MTkn ;
   private java.util.Date wcpOAV16FechaInicio ;
   private java.util.Date wcpOAV15FechaFin ;
   private java.util.Date AV16FechaInicio ;
   private java.util.Date AV15FechaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Defecto_query_Allowchangeaxesorder ;
   private boolean Defecto_query_Allowselection ;
   private boolean Defecto_query_Paging ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV31TipMaqCodJSON ;
   private String wcpOAV24MTkn ;
   private String AV31TipMaqCodJSON ;
   private String AV24MTkn ;
   private String AV33ValorRecibidoVariable ;
   private String AV35Variable ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDefecto_query ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV32TipMaqCodS ;
   private GXSimpleCollection<String> AV30TipMaqCodCollection ;
   private GXBaseCollection<app.SdtQueryViewerItemClickData_Element> AV8DataPosicion ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV13Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV27Parameters ;
   private app.anticipacionerrores.SdtsdtParametros AV5sdtParametros ;
   private app.SdtQueryViewerItemClickData AV19ItemClickData ;
   private app.SdtQueryViewerItemClickData_Element AV9DataPosicionElemento ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerElements_Element AV12Element ;
   private app.SdtQueryViewerFilterChangedData AV17FilterChangedData ;
   private app.SdtQueryViewerItemCollapseData AV20ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV21ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV22ItemExpandData ;
   private app.anticipacionerrores.SdtsdtMTok AV29sdtMTok ;
}

