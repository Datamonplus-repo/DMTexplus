package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionmaquinasfases_impl extends GXWebComponent
{
   public wcproduccionmaquinasfases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionmaquinasfases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionmaquinasfases_impl.class ));
   }

   public wcproduccionmaquinasfases_impl( int remoteHandle ,
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
      cmbavQueryvieweroutputtype = new HTMLChoice();
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
               AV19Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
               AV16MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16MaqCodInicial", AV16MaqCodInicial);
               AV15MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MaqCodFinal", AV15MaqCodFinal);
               AV17Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisprodti", localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV18HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV19Emprcod,AV16MaqCodInicial,AV15MaqCodFinal,AV17Hisprodti,AV18HisProdtf});
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
         paG82( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Maquinas Fases", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionmaquinasfases", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV16MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV15MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV17Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV18HisProdtf))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV22Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV22Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV6Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV6Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Emprcod", GXutil.rtrim( wcpOAV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16MaqCodInicial", GXutil.rtrim( wcpOAV16MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15MaqCodFinal", GXutil.rtrim( wcpOAV15MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Hisprodti", localUtil.ttoc( wcpOAV17Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18HisProdtf", localUtil.ttoc( wcpOAV18HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV19Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV16MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV15MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV17Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV18HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Objectcall", GXutil.rtrim( Informeproduccionmaquinasfases_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Objectcall", GXutil.rtrim( Informeproduccionmaquinasfases_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttoxml", GXutil.booltostr( Informeproduccionmaquinasfases_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttohtml", GXutil.booltostr( Informeproduccionmaquinasfases_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttopdf", GXutil.booltostr( Informeproduccionmaquinasfases_Exporttopdf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Type", GXutil.rtrim( Informeproduccionmaquinasfases_Type));
   }

   public void renderHtmlCloseFormG82( )
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
      return "WCProduccionMaquinasFases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Maquinas Fases", "") ;
   }

   public void wbG80( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionmaquinasfases");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryvieweroutputtype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryvieweroutputtype.getInternalname(), httpContext.getMessage( "Query Viewer Output Type", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV21QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", false, (byte)(0), "HLP_WCProduccionMaquinasFases.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV21QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucInformeproduccionmaquinasfases.setProperty("Elements", AV22Elements);
         ucInformeproduccionmaquinasfases.setProperty("Parameters", AV6Parameters);
         ucInformeproduccionmaquinasfases.setProperty("ExportToXML", Informeproduccionmaquinasfases_Exporttoxml);
         ucInformeproduccionmaquinasfases.setProperty("ExportToHTML", Informeproduccionmaquinasfases_Exporttohtml);
         ucInformeproduccionmaquinasfases.setProperty("ExportToPDF", Informeproduccionmaquinasfases_Exporttopdf);
         ucInformeproduccionmaquinasfases.setProperty("Type", Informeproduccionmaquinasfases_Type);
         ucInformeproduccionmaquinasfases.setProperty("Title", Informeproduccionmaquinasfases_Title);
         ucInformeproduccionmaquinasfases.setProperty("ItemClickData", AV7ItemClickData);
         ucInformeproduccionmaquinasfases.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucInformeproduccionmaquinasfases.setProperty("DragAndDropData", AV9DragAndDropData);
         ucInformeproduccionmaquinasfases.setProperty("FilterChangedData", AV10FilterChangedData);
         ucInformeproduccionmaquinasfases.setProperty("ItemExpandData", AV11ItemExpandData);
         ucInformeproduccionmaquinasfases.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucInformeproduccionmaquinasfases.render(context, "queryviewer", Informeproduccionmaquinasfases_Internalname, sPrefix+"INFORMEPRODUCCIONMAQUINASFASESContainer");
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

   public void startG82( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Maquinas Fases", ""), (short)(0)) ;
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
            strupG80( ) ;
         }
      }
   }

   public void wsG82( )
   {
      startG82( ) ;
      evtG82( ) ;
   }

   public void evtG82( )
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
                              strupG80( ) ;
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
                              strupG80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11G82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12G82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13G82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14G82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG80( ) ;
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
                              strupG80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavQueryvieweroutputtype.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void weG82( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormG82( ) ;
         }
      }
   }

   public void paG82( )
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
            GX_FocusControl = cmbavQueryvieweroutputtype.getInternalname() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      if ( cmbavQueryvieweroutputtype.getItemCount() > 0 )
      {
         AV21QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV21QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV21QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfG82( ) ;
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

   public void rfG82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12G82 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e14G82 ();
         wbG80( ) ;
      }
   }

   public void send_integrity_lvl_hashesG82( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupG80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11G82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV22Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
         wcpOAV16MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV16MaqCodInicial") ;
         wcpOAV15MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV15MaqCodFinal") ;
         wcpOAV17Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17Hisprodti"), 0) ;
         wcpOAV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18HisProdtf"), 0) ;
         Informeproduccionmaquinasfases_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Objectcall") ;
         Informeproduccionmaquinasfases_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Objectcall") ;
         Informeproduccionmaquinasfases_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttoxml")) ;
         Informeproduccionmaquinasfases_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttohtml")) ;
         Informeproduccionmaquinasfases_Exporttopdf = GXutil.strtobool( httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Exporttopdf")) ;
         Informeproduccionmaquinasfases_Type = httpContext.cgiGet( sPrefix+"INFORMEPRODUCCIONMAQUINASFASES_Type") ;
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
      e11G82 ();
      if (returnInSub) return;
   }

   public void e11G82( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV21QueryViewerOutputType = "PivotTable" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
      Informeproduccionmaquinasfases_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionMaquinasFases")+"\", \""+GXutil.encodeJSON( AV19Emprcod)+"\", \""+GXutil.encodeJSON( AV16MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV15MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucInformeproduccionmaquinasfases.sendProperty(context, sPrefix, false, Informeproduccionmaquinasfases_Internalname, "Object", Informeproduccionmaquinasfases_Objectcall);
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionmaquinasfases_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionmaquinasfases_impl.this.AV19Emprcod = GXv_char2[0] ;
      wcproduccionmaquinasfases_impl.this.AV27Emprnom = GXv_char3[0] ;
      wcproduccionmaquinasfases_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
   }

   public void e12G82( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Informeproduccionmaquinasfases_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionMaquinasFases")+"\", \""+GXutil.encodeJSON( AV19Emprcod)+"\", \""+GXutil.encodeJSON( AV16MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV15MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucInformeproduccionmaquinasfases.sendProperty(context, sPrefix, false, Informeproduccionmaquinasfases_Internalname, "Object", Informeproduccionmaquinasfases_Objectcall);
      /*  Sending Event outputs  */
   }

   public void e13G82( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   protected void nextLoad( )
   {
   }

   protected void e14G82( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      AV16MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16MaqCodInicial", AV16MaqCodInicial);
      AV15MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MaqCodFinal", AV15MaqCodFinal);
      AV17Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisprodti", localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV18HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paG82( ) ;
      wsG82( ) ;
      weG82( ) ;
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
      sCtrlAV19Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV16MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV15MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV17Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV18HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paG82( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionmaquinasfases", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paG82( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV19Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
         AV16MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16MaqCodInicial", AV16MaqCodInicial);
         AV15MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MaqCodFinal", AV15MaqCodFinal);
         AV17Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisprodti", localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV18HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV19Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV19Emprcod") ;
      wcpOAV16MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV16MaqCodInicial") ;
      wcpOAV15MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV15MaqCodFinal") ;
      wcpOAV17Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17Hisprodti"), 0) ;
      wcpOAV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18HisProdtf"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV19Emprcod, wcpOAV19Emprcod) != 0 ) || ( GXutil.strcmp(AV16MaqCodInicial, wcpOAV16MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV15MaqCodFinal, wcpOAV15MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV17Hisprodti, wcpOAV17Hisprodti) ) || !( GXutil.dateCompare(AV18HisProdtf, wcpOAV18HisProdtf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV19Emprcod = AV19Emprcod ;
      wcpOAV16MaqCodInicial = AV16MaqCodInicial ;
      wcpOAV15MaqCodFinal = AV15MaqCodFinal ;
      wcpOAV17Hisprodti = AV17Hisprodti ;
      wcpOAV18HisProdtf = AV18HisProdtf ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV19Emprcod) > 0 )
      {
         AV19Emprcod = httpContext.cgiGet( sCtrlAV19Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Emprcod", AV19Emprcod);
      }
      else
      {
         AV19Emprcod = httpContext.cgiGet( sPrefix+"AV19Emprcod_PARM") ;
      }
      sCtrlAV16MaqCodInicial = httpContext.cgiGet( sPrefix+"AV16MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV16MaqCodInicial) > 0 )
      {
         AV16MaqCodInicial = httpContext.cgiGet( sCtrlAV16MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16MaqCodInicial", AV16MaqCodInicial);
      }
      else
      {
         AV16MaqCodInicial = httpContext.cgiGet( sPrefix+"AV16MaqCodInicial_PARM") ;
      }
      sCtrlAV15MaqCodFinal = httpContext.cgiGet( sPrefix+"AV15MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV15MaqCodFinal) > 0 )
      {
         AV15MaqCodFinal = httpContext.cgiGet( sCtrlAV15MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15MaqCodFinal", AV15MaqCodFinal);
      }
      else
      {
         AV15MaqCodFinal = httpContext.cgiGet( sPrefix+"AV15MaqCodFinal_PARM") ;
      }
      sCtrlAV17Hisprodti = httpContext.cgiGet( sPrefix+"AV17Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV17Hisprodti) > 0 )
      {
         AV17Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV17Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Hisprodti", localUtil.ttoc( AV17Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV17Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV17Hisprodti_PARM"), 0) ;
      }
      sCtrlAV18HisProdtf = httpContext.cgiGet( sPrefix+"AV18HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV18HisProdtf) > 0 )
      {
         AV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV18HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV18HisProdtf_PARM"), 0) ;
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
      paG82( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsG82( ) ;
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
      wsG82( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_PARM", GXutil.rtrim( AV19Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Emprcod_CTRL", GXutil.rtrim( sCtrlAV19Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16MaqCodInicial_PARM", GXutil.rtrim( AV16MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV16MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15MaqCodFinal_PARM", GXutil.rtrim( AV15MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV15MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Hisprodti_PARM", localUtil.ttoc( AV17Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Hisprodti_CTRL", GXutil.rtrim( sCtrlAV17Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18HisProdtf_PARM", localUtil.ttoc( AV18HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18HisProdtf_CTRL", GXutil.rtrim( sCtrlAV18HisProdtf));
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
      weG82( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101556447", true, true);
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
      httpContext.AddJavascriptSource("wcproduccionmaquinasfases.js", "?20266101556448", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Informeproduccionmaquinasfases_Internalname = sPrefix+"INFORMEPRODUCCIONMAQUINASFASES" ;
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
      Informeproduccionmaquinasfases_Title = "" ;
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Informeproduccionmaquinasfases_Type = "PivotTable" ;
      Informeproduccionmaquinasfases_Exporttopdf = GXutil.toBoolean( 0) ;
      Informeproduccionmaquinasfases_Exporttohtml = GXutil.toBoolean( 0) ;
      Informeproduccionmaquinasfases_Exporttoxml = GXutil.toBoolean( 0) ;
      Informeproduccionmaquinasfases_Objectcall = "" ;
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
      cmbavQueryvieweroutputtype.setName( "vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryvieweroutputtype.setWebtags( "" );
      cmbavQueryvieweroutputtype.addItem("Default", httpContext.getMessage( "Default", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Card", httpContext.getMessage( "Card", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Chart", httpContext.getMessage( "Chart", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Map", httpContext.getMessage( "Map", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("PivotTable", httpContext.getMessage( "PivotTable", ""), (short)(0));
      cmbavQueryvieweroutputtype.addItem("Table", httpContext.getMessage( "Table", ""), (short)(0));
      if ( cmbavQueryvieweroutputtype.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV19Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV15MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV17Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV18HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'INFORMEPRODUCCIONMAQUINASFASES'}]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e13G82',iparms:[]");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE","{handler:'validv_Queryvieweroutputtype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE",",oparms:[]}");
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
      wcpOAV19Emprcod = "" ;
      wcpOAV16MaqCodInicial = "" ;
      wcpOAV15MaqCodFinal = "" ;
      wcpOAV17Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV18HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV19Emprcod = "" ;
      AV16MaqCodInicial = "" ;
      AV15MaqCodFinal = "" ;
      AV17Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV18HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV6Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV7ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV8ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV9DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV10FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV11ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV12ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV21QueryViewerOutputType = "" ;
      ucInformeproduccionmaquinasfases = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV26Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV27Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV28Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV19Emprcod = "" ;
      sCtrlAV16MaqCodInicial = "" ;
      sCtrlAV15MaqCodFinal = "" ;
      sCtrlAV17Hisprodti = "" ;
      sCtrlAV18HisProdtf = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
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
   private int idxLst ;
   private String wcpOAV19Emprcod ;
   private String wcpOAV16MaqCodInicial ;
   private String wcpOAV15MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV19Emprcod ;
   private String AV16MaqCodInicial ;
   private String AV15MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informeproduccionmaquinasfases_Objectcall ;
   private String Informeproduccionmaquinasfases_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String AV21QueryViewerOutputType ;
   private String Informeproduccionmaquinasfases_Title ;
   private String Informeproduccionmaquinasfases_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV27Emprnom ;
   private String GXv_char3[] ;
   private String AV28Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV19Emprcod ;
   private String sCtrlAV16MaqCodInicial ;
   private String sCtrlAV15MaqCodFinal ;
   private String sCtrlAV17Hisprodti ;
   private String sCtrlAV18HisProdtf ;
   private java.util.Date wcpOAV17Hisprodti ;
   private java.util.Date wcpOAV18HisProdtf ;
   private java.util.Date AV17Hisprodti ;
   private java.util.Date AV18HisProdtf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Informeproduccionmaquinasfases_Exporttoxml ;
   private boolean Informeproduccionmaquinasfases_Exporttohtml ;
   private boolean Informeproduccionmaquinasfases_Exporttopdf ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformeproduccionmaquinasfases ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV22Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
}

