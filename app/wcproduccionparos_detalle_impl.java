package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionparos_detalle_impl extends GXWebComponent
{
   public wcproduccionparos_detalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionparos_detalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionparos_detalle_impl.class ));
   }

   public wcproduccionparos_detalle_impl( int remoteHandle ,
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
               AV9MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
               AV8MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
               AV7Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV6HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf});
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
         paJ52( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Paros_Detalle", "")) ;
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
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionparos_detalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV7Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6HisProdtf))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV20Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV20Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV11Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV11Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV12ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV12ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV13ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV13ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV14DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV14DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV15FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV15FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV16ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV16ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV17ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV17ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9MaqCodInicial", GXutil.rtrim( wcpOAV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodFinal", GXutil.rtrim( wcpOAV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Hisprodti", localUtil.ttoc( wcpOAV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HisProdtf", localUtil.ttoc( wcpOAV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONPAROS_Objectcall", GXutil.rtrim( Informeproduccionparos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONPAROS_Objectcall", GXutil.rtrim( Informeproduccionparos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONPAROS_Type", GXutil.rtrim( Informeproduccionparos_Type));
   }

   public void renderHtmlCloseFormJ52( )
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
      return "WCProduccionParos_Detalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Paros_Detalle", "") ;
   }

   public void wbJ50( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionparos_detalle");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInformeproduccionparos.setProperty("Elements", AV20Elements);
         ucInformeproduccionparos.setProperty("Parameters", AV11Parameters);
         ucInformeproduccionparos.setProperty("Type", Informeproduccionparos_Type);
         ucInformeproduccionparos.setProperty("Title", Informeproduccionparos_Title);
         ucInformeproduccionparos.setProperty("ItemClickData", AV12ItemClickData);
         ucInformeproduccionparos.setProperty("ItemDoubleClickData", AV13ItemDoubleClickData);
         ucInformeproduccionparos.setProperty("DragAndDropData", AV14DragAndDropData);
         ucInformeproduccionparos.setProperty("FilterChangedData", AV15FilterChangedData);
         ucInformeproduccionparos.setProperty("ItemExpandData", AV16ItemExpandData);
         ucInformeproduccionparos.setProperty("ItemCollapseData", AV17ItemCollapseData);
         ucInformeproduccionparos.render(context, "queryviewer", Informeproduccionparos_Internalname, sPrefix+"INFORMEPRODUCCIONPAROSContainer");
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
      }
      wbLoad = true ;
   }

   public void startJ52( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Paros_Detalle", ""), (short)(0)) ;
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
            strupJ50( ) ;
         }
      }
   }

   public void wsJ52( )
   {
      startJ52( ) ;
      evtJ52( ) ;
   }

   public void evtJ52( )
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
                              strupJ50( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11J52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12J52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e13J52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ50( ) ;
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
                              strupJ50( ) ;
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

   public void weJ52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormJ52( ) ;
         }
      }
   }

   public void paJ52( )
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
      rfJ52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rfJ52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12J52 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13J52 ();
         wbJ50( ) ;
      }
   }

   public void send_integrity_lvl_hashesJ52( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupJ50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11J52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV20Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV11Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV12ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV13ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV14DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV15FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV16ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV17ItemCollapseData);
         /* Read saved values. */
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
         wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
         wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
         wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
         Informeproduccionparos_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONPAROS_Objectcall") ;
         Informeproduccionparos_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONPAROS_Objectcall") ;
         Informeproduccionparos_Type = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONPAROS_Type") ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e11J52 ();
      if (returnInSub) return;
   }

   public void e11J52( )
   {
      /* Start Routine */
      returnInSub = false ;
      Informeproduccionparos_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionParos")+"\", \""+GXutil.encodeJSON( AV5Emprcod)+"\", \""+GXutil.encodeJSON( AV9MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV8MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucInformeproduccionparos.sendProperty(context, sPrefix, false, Informeproduccionparos_Internalname, "Object", Informeproduccionparos_Objectcall);
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionparos_detalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV25Emprnom ;
      GXv_char4[0] = AV26Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionparos_detalle_impl.this.AV5Emprcod = GXv_char2[0] ;
      wcproduccionparos_detalle_impl.this.AV25Emprnom = GXv_char3[0] ;
      wcproduccionparos_detalle_impl.this.AV26Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
   }

   public void e12J52( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Informeproduccionparos_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionParos")+"\", \""+GXutil.encodeJSON( AV5Emprcod)+"\", \""+GXutil.encodeJSON( AV9MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV8MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucInformeproduccionparos.sendProperty(context, sPrefix, false, Informeproduccionparos_Internalname, "Object", Informeproduccionparos_Objectcall);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13J52( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      AV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      AV7Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paJ52( ) ;
      wsJ52( ) ;
      weJ52( ) ;
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
      sCtrlAV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paJ52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionparos_detalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paJ52( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV9MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
         AV8MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
         AV7Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV6HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
      wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
      wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
      wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV9MaqCodInicial, wcpOAV9MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV8MaqCodFinal, wcpOAV8MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV7Hisprodti, wcpOAV7Hisprodti) ) || !( GXutil.dateCompare(AV6HisProdtf, wcpOAV6HisProdtf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV9MaqCodInicial = AV9MaqCodInicial ;
      wcpOAV8MaqCodFinal = AV8MaqCodFinal ;
      wcpOAV7Hisprodti = AV7Hisprodti ;
      wcpOAV6HisProdtf = AV6HisProdtf ;
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
      sCtrlAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV9MaqCodInicial) > 0 )
      {
         AV9MaqCodInicial = httpContext.cgiGet( sCtrlAV9MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      }
      else
      {
         AV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_PARM") ;
      }
      sCtrlAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodFinal) > 0 )
      {
         AV8MaqCodFinal = httpContext.cgiGet( sCtrlAV8MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      }
      else
      {
         AV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_PARM") ;
      }
      sCtrlAV7Hisprodti = httpContext.cgiGet( sPrefix+"AV7Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV7Hisprodti) > 0 )
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV7Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV7Hisprodti_PARM"), 0) ;
      }
      sCtrlAV6HisProdtf = httpContext.cgiGet( sPrefix+"AV6HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV6HisProdtf) > 0 )
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV6HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6HisProdtf_PARM"), 0) ;
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
      paJ52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsJ52( ) ;
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
      wsJ52( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_PARM", GXutil.rtrim( AV9MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV9MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_PARM", GXutil.rtrim( AV8MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV8MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_PARM", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_CTRL", GXutil.rtrim( sCtrlAV7Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_PARM", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_CTRL", GXutil.rtrim( sCtrlAV6HisProdtf));
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
      weJ52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015563433", true, true);
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
         httpContext.AddJavascriptSource("wcproduccionparos_detalle.js", "?202661015563434", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informeproduccionparos_Internalname = sPrefix+"INFORMEPRODUCCIONPAROS" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
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
      Informeproduccionparos_Title = "" ;
      Informeproduccionparos_Type = "Table" ;
      Informeproduccionparos_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'INFORMEPRODUCCIONPAROS'}]}");
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
      wcpOAV9MaqCodInicial = "" ;
      wcpOAV8MaqCodFinal = "" ;
      wcpOAV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV9MaqCodInicial = "" ;
      AV8MaqCodFinal = "" ;
      AV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV20Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV11Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV12ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV13ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV14DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV15FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV16ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV17ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucInformeproduccionparos = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV25Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV26Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV9MaqCodInicial = "" ;
      sCtrlAV8MaqCodFinal = "" ;
      sCtrlAV7Hisprodti = "" ;
      sCtrlAV6HisProdtf = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int idxLst ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV9MaqCodInicial ;
   private String wcpOAV8MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV9MaqCodInicial ;
   private String AV8MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informeproduccionparos_Objectcall ;
   private String Informeproduccionparos_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informeproduccionparos_Title ;
   private String Informeproduccionparos_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV25Emprnom ;
   private String GXv_char3[] ;
   private String AV26Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV9MaqCodInicial ;
   private String sCtrlAV8MaqCodFinal ;
   private String sCtrlAV7Hisprodti ;
   private String sCtrlAV6HisProdtf ;
   private java.util.Date wcpOAV7Hisprodti ;
   private java.util.Date wcpOAV6HisProdtf ;
   private java.util.Date AV7Hisprodti ;
   private java.util.Date AV6HisProdtf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformeproduccionparos ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV20Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV11Parameters ;
   private app.SdtQueryViewerItemClickData AV12ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV13ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV14DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV15FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV16ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV17ItemCollapseData ;
}

