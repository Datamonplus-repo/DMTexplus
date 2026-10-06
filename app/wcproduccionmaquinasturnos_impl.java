package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionmaquinasturnos_impl extends GXWebComponent
{
   public wcproduccionmaquinasturnos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionmaquinasturnos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionmaquinasturnos_impl.class ));
   }

   public wcproduccionmaquinasturnos_impl( int remoteHandle ,
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
      cmbavQueryviewercharttype = new HTMLChoice();
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
               AV18Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
               AV19MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19MaqCodInicial", AV19MaqCodInicial);
               AV20MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
               AV21Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Hisprodti", localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV22HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HisProdtf", localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV18Emprcod,AV19MaqCodInicial,AV20MaqCodFinal,AV21Hisprodti,AV22HisProdtf});
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
         paG92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Maquinas Turnos", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionmaquinasturnos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV19MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV20MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV21Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22HisProdtf))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV23Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV23Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV8Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV8Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Emprcod", GXutil.rtrim( wcpOAV18Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19MaqCodInicial", GXutil.rtrim( wcpOAV19MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20MaqCodFinal", GXutil.rtrim( wcpOAV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Hisprodti", localUtil.ttoc( wcpOAV21Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22HisProdtf", localUtil.ttoc( wcpOAV22HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV18Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV19MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV21Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV22HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Objectcall", GXutil.rtrim( Produccionmaquinaturno_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Objectcall", GXutil.rtrim( Produccionmaquinaturno_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Exporttoxml", GXutil.booltostr( Produccionmaquinaturno_Exporttoxml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Exporttohtml", GXutil.booltostr( Produccionmaquinaturno_Exporttohtml));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Exporttopdf", GXutil.booltostr( Produccionmaquinaturno_Exporttopdf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Type", GXutil.rtrim( Produccionmaquinaturno_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONMAQUINATURNO_Charttype", GXutil.rtrim( Produccionmaquinaturno_Charttype));
   }

   public void renderHtmlCloseFormG92( )
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
      return "WCProduccionMaquinasTurnos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Maquinas Turnos", "") ;
   }

   public void wbG90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionmaquinasturnos");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV5QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", false, (byte)(0), "HLP_WCProduccionMaquinasTurnos.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV5QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryviewercharttype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryviewercharttype.getInternalname(), httpContext.getMessage( "Query Viewer Chart Type", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV17QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "", false, (byte)(0), "HLP_WCProduccionMaquinasTurnos.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV17QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
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
         ucProduccionmaquinaturno.setProperty("Elements", AV23Elements);
         ucProduccionmaquinaturno.setProperty("Parameters", AV8Parameters);
         ucProduccionmaquinaturno.setProperty("ExportToXML", Produccionmaquinaturno_Exporttoxml);
         ucProduccionmaquinaturno.setProperty("ExportToHTML", Produccionmaquinaturno_Exporttohtml);
         ucProduccionmaquinaturno.setProperty("ExportToPDF", Produccionmaquinaturno_Exporttopdf);
         ucProduccionmaquinaturno.setProperty("Type", Produccionmaquinaturno_Type);
         ucProduccionmaquinaturno.setProperty("Title", Produccionmaquinaturno_Title);
         ucProduccionmaquinaturno.setProperty("ItemClickData", AV9ItemClickData);
         ucProduccionmaquinaturno.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucProduccionmaquinaturno.setProperty("DragAndDropData", AV11DragAndDropData);
         ucProduccionmaquinaturno.setProperty("FilterChangedData", AV12FilterChangedData);
         ucProduccionmaquinaturno.setProperty("ItemExpandData", AV13ItemExpandData);
         ucProduccionmaquinaturno.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucProduccionmaquinaturno.render(context, "queryviewer", Produccionmaquinaturno_Internalname, sPrefix+"PRODUCCIONMAQUINATURNOContainer");
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

   public void startG92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Maquinas Turnos", ""), (short)(0)) ;
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
            strupG90( ) ;
         }
      }
   }

   public void wsG92( )
   {
      startG92( ) ;
      evtG92( ) ;
   }

   public void evtG92( )
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
                              strupG90( ) ;
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
                              strupG90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11G92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12G92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13G92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14G92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e15G92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupG90( ) ;
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
                              strupG90( ) ;
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

   public void weG92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormG92( ) ;
         }
      }
   }

   public void paG92( )
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
         AV5QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV5QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5QueryViewerOutputType", AV5QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV5QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV17QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV17QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17QueryViewerChartType", AV17QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV17QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfG92( ) ;
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

   public void rfG92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e14G92 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15G92 ();
         wbG90( ) ;
      }
   }

   public void send_integrity_lvl_hashesG92( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupG90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11G92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV23Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV8Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV9ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV10ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV11DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV12FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV13ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV14ItemCollapseData);
         /* Read saved values. */
         wcpOAV18Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18Emprcod") ;
         wcpOAV19MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV19MaqCodInicial") ;
         wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
         wcpOAV21Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV21Hisprodti"), 0) ;
         wcpOAV22HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22HisProdtf"), 0) ;
         Produccionmaquinaturno_Objectcall = httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Objectcall") ;
         Produccionmaquinaturno_Objectcall = httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Objectcall") ;
         Produccionmaquinaturno_Exporttoxml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Exporttoxml")) ;
         Produccionmaquinaturno_Exporttohtml = GXutil.strtobool( httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Exporttohtml")) ;
         Produccionmaquinaturno_Exporttopdf = GXutil.strtobool( httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Exporttopdf")) ;
         Produccionmaquinaturno_Type = httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Type") ;
         Produccionmaquinaturno_Charttype = httpContext.cgiGet( sPrefix+"PRODUCCIONMAQUINATURNO_Charttype") ;
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
      e11G92 ();
      if (returnInSub) return;
   }

   public void e11G92( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5QueryViewerOutputType = "Table" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5QueryViewerOutputType", AV5QueryViewerOutputType);
      AV17QueryViewerChartType = "Column" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17QueryViewerChartType", AV17QueryViewerChartType);
      Produccionmaquinaturno_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionMaquinasTurnos")+"\", \""+GXutil.encodeJSON( AV18Emprcod)+"\", \""+GXutil.encodeJSON( AV19MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucProduccionmaquinaturno.sendProperty(context, sPrefix, false, Produccionmaquinaturno_Internalname, "Object", Produccionmaquinaturno_Objectcall);
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionmaquinasturnos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV28Emprnom ;
      GXv_char4[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionmaquinasturnos_impl.this.AV18Emprcod = GXv_char2[0] ;
      wcproduccionmaquinasturnos_impl.this.AV28Emprnom = GXv_char3[0] ;
      wcproduccionmaquinasturnos_impl.this.AV29Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
   }

   public void e12G92( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e13G92( )
   {
      /* Queryviewercharttype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e14G92( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Produccionmaquinaturno_Type = AV5QueryViewerOutputType ;
      ucProduccionmaquinaturno.sendProperty(context, sPrefix, false, Produccionmaquinaturno_Internalname, "Type", Produccionmaquinaturno_Type);
      Produccionmaquinaturno_Charttype = AV17QueryViewerChartType ;
      ucProduccionmaquinaturno.sendProperty(context, sPrefix, false, Produccionmaquinaturno_Internalname, "ChartType", Produccionmaquinaturno_Charttype);
      Produccionmaquinaturno_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionMaquinasTurnos")+"\", \""+GXutil.encodeJSON( AV18Emprcod)+"\", \""+GXutil.encodeJSON( AV19MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucProduccionmaquinaturno.sendProperty(context, sPrefix, false, Produccionmaquinaturno_Internalname, "Object", Produccionmaquinaturno_Objectcall);
      AV7Axes.clear();
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e15G92( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      AV19MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19MaqCodInicial", AV19MaqCodInicial);
      AV20MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
      AV21Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Hisprodti", localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV22HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HisProdtf", localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paG92( ) ;
      wsG92( ) ;
      weG92( ) ;
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
      sCtrlAV18Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV19MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV20MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV21Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV22HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paG92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionmaquinasturnos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paG92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV18Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
         AV19MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19MaqCodInicial", AV19MaqCodInicial);
         AV20MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
         AV21Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Hisprodti", localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV22HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HisProdtf", localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV18Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18Emprcod") ;
      wcpOAV19MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV19MaqCodInicial") ;
      wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
      wcpOAV21Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV21Hisprodti"), 0) ;
      wcpOAV22HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV22HisProdtf"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV18Emprcod, wcpOAV18Emprcod) != 0 ) || ( GXutil.strcmp(AV19MaqCodInicial, wcpOAV19MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV20MaqCodFinal, wcpOAV20MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV21Hisprodti, wcpOAV21Hisprodti) ) || !( GXutil.dateCompare(AV22HisProdtf, wcpOAV22HisProdtf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV18Emprcod = AV18Emprcod ;
      wcpOAV19MaqCodInicial = AV19MaqCodInicial ;
      wcpOAV20MaqCodFinal = AV20MaqCodFinal ;
      wcpOAV21Hisprodti = AV21Hisprodti ;
      wcpOAV22HisProdtf = AV22HisProdtf ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV18Emprcod = httpContext.cgiGet( sPrefix+"AV18Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV18Emprcod) > 0 )
      {
         AV18Emprcod = httpContext.cgiGet( sCtrlAV18Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      }
      else
      {
         AV18Emprcod = httpContext.cgiGet( sPrefix+"AV18Emprcod_PARM") ;
      }
      sCtrlAV19MaqCodInicial = httpContext.cgiGet( sPrefix+"AV19MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV19MaqCodInicial) > 0 )
      {
         AV19MaqCodInicial = httpContext.cgiGet( sCtrlAV19MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19MaqCodInicial", AV19MaqCodInicial);
      }
      else
      {
         AV19MaqCodInicial = httpContext.cgiGet( sPrefix+"AV19MaqCodInicial_PARM") ;
      }
      sCtrlAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"AV20MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV20MaqCodFinal) > 0 )
      {
         AV20MaqCodFinal = httpContext.cgiGet( sCtrlAV20MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
      }
      else
      {
         AV20MaqCodFinal = httpContext.cgiGet( sPrefix+"AV20MaqCodFinal_PARM") ;
      }
      sCtrlAV21Hisprodti = httpContext.cgiGet( sPrefix+"AV21Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV21Hisprodti) > 0 )
      {
         AV21Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV21Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Hisprodti", localUtil.ttoc( AV21Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV21Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV21Hisprodti_PARM"), 0) ;
      }
      sCtrlAV22HisProdtf = httpContext.cgiGet( sPrefix+"AV22HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV22HisProdtf) > 0 )
      {
         AV22HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV22HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HisProdtf", localUtil.ttoc( AV22HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV22HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV22HisProdtf_PARM"), 0) ;
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
      paG92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsG92( ) ;
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
      wsG92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Emprcod_PARM", GXutil.rtrim( AV18Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Emprcod_CTRL", GXutil.rtrim( sCtrlAV18Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19MaqCodInicial_PARM", GXutil.rtrim( AV19MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV19MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_PARM", GXutil.rtrim( AV20MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV20MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Hisprodti_PARM", localUtil.ttoc( AV21Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Hisprodti_CTRL", GXutil.rtrim( sCtrlAV21Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HisProdtf_PARM", localUtil.ttoc( AV22HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HisProdtf_CTRL", GXutil.rtrim( sCtrlAV22HisProdtf));
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
      weG92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015564396", true, true);
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
      httpContext.AddJavascriptSource("wcproduccionmaquinasturnos.js", "?202661015564396", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Produccionmaquinaturno_Internalname = sPrefix+"PRODUCCIONMAQUINATURNO" ;
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
      Produccionmaquinaturno_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Produccionmaquinaturno_Type = "Table" ;
      Produccionmaquinaturno_Exporttopdf = GXutil.toBoolean( 0) ;
      Produccionmaquinaturno_Exporttohtml = GXutil.toBoolean( 0) ;
      Produccionmaquinaturno_Exporttoxml = GXutil.toBoolean( 0) ;
      Produccionmaquinaturno_Objectcall = "" ;
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
      cmbavQueryviewercharttype.setName( "vQUERYVIEWERCHARTTYPE" );
      cmbavQueryviewercharttype.setWebtags( "" );
      cmbavQueryviewercharttype.addItem("Column", httpContext.getMessage( "Column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3D", httpContext.getMessage( "Column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn", httpContext.getMessage( "Stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn3D", httpContext.getMessage( "Stacked column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn100", httpContext.getMessage( "100% stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Bar", httpContext.getMessage( "Bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar", httpContext.getMessage( "Stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar100", httpContext.getMessage( "100% stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Area", httpContext.getMessage( "Area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea", httpContext.getMessage( "Stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea100", httpContext.getMessage( "100% stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothArea", httpContext.getMessage( "Smooth area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepArea", httpContext.getMessage( "Step area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Line", httpContext.getMessage( "Line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine", httpContext.getMessage( "Stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine100", httpContext.getMessage( "100% stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothLine", httpContext.getMessage( "Smooth line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepLine", httpContext.getMessage( "Step line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie", httpContext.getMessage( "Pie", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie3D", httpContext.getMessage( "Pie 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut", httpContext.getMessage( "Doughnut", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut3D", httpContext.getMessage( "Doughnut 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("LinearGauge", httpContext.getMessage( "Linear gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("CircularGauge", httpContext.getMessage( "Circular gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Radar", httpContext.getMessage( "Radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("FilledRadar", httpContext.getMessage( "Filled radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("PolarArea", httpContext.getMessage( "Polar area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Funnel", httpContext.getMessage( "Funnel", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pyramid", httpContext.getMessage( "Pyramid", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("ColumnLine", httpContext.getMessage( "Column & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3DLine", httpContext.getMessage( "Column 3D & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Timeline", httpContext.getMessage( "Timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothTimeline", httpContext.getMessage( "Smooth timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepTimeline", httpContext.getMessage( "Step timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Sparkline", httpContext.getMessage( "Sparkline", ""), (short)(0));
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV5QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV17QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV20MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV21Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV22HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Produccionmaquinaturno_Type',ctrl:'PRODUCCIONMAQUINATURNO',prop:'Type'},{av:'Produccionmaquinaturno_Charttype',ctrl:'PRODUCCIONMAQUINATURNO',prop:'ChartType'},{ctrl:'PRODUCCIONMAQUINATURNO'}]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e12G92',iparms:[]");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED","{handler:'e13G92',iparms:[]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE","{handler:'validv_Queryvieweroutputtype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWEROUTPUTTYPE",",oparms:[]}");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE","{handler:'validv_Queryviewercharttype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE",",oparms:[]}");
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
      wcpOAV18Emprcod = "" ;
      wcpOAV19MaqCodInicial = "" ;
      wcpOAV20MaqCodFinal = "" ;
      wcpOAV21Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV22HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV18Emprcod = "" ;
      AV19MaqCodInicial = "" ;
      AV20MaqCodFinal = "" ;
      AV21Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV22HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV8Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV9ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV10ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV11DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV12FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV13ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV14ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      Produccionmaquinaturno_Charttype = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV5QueryViewerOutputType = "" ;
      AV17QueryViewerChartType = "" ;
      ucProduccionmaquinaturno = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV28Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV29Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV7Axes = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV18Emprcod = "" ;
      sCtrlAV19MaqCodInicial = "" ;
      sCtrlAV20MaqCodFinal = "" ;
      sCtrlAV21Hisprodti = "" ;
      sCtrlAV22HisProdtf = "" ;
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
   private String wcpOAV18Emprcod ;
   private String wcpOAV19MaqCodInicial ;
   private String wcpOAV20MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV18Emprcod ;
   private String AV19MaqCodInicial ;
   private String AV20MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Produccionmaquinaturno_Objectcall ;
   private String Produccionmaquinaturno_Type ;
   private String Produccionmaquinaturno_Charttype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String AV5QueryViewerOutputType ;
   private String AV17QueryViewerChartType ;
   private String Produccionmaquinaturno_Title ;
   private String Produccionmaquinaturno_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV28Emprnom ;
   private String GXv_char3[] ;
   private String AV29Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV18Emprcod ;
   private String sCtrlAV19MaqCodInicial ;
   private String sCtrlAV20MaqCodFinal ;
   private String sCtrlAV21Hisprodti ;
   private String sCtrlAV22HisProdtf ;
   private java.util.Date wcpOAV21Hisprodti ;
   private java.util.Date wcpOAV22HisProdtf ;
   private java.util.Date AV21Hisprodti ;
   private java.util.Date AV22HisProdtf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Produccionmaquinaturno_Exporttoxml ;
   private boolean Produccionmaquinaturno_Exporttohtml ;
   private boolean Produccionmaquinaturno_Exporttopdf ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucProduccionmaquinaturno ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV23Elements ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Axes ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV8Parameters ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV10ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV13ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV14ItemCollapseData ;
}

