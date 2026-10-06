package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionoperarios_impl extends GXWebComponent
{
   public wcproduccionoperarios_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionoperarios_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionoperarios_impl.class ));
   }

   public wcproduccionoperarios_impl( int remoteHandle ,
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
               AV17Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
               AV21MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
               AV20MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
               AV19Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisprodti", localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV18HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV17Emprcod,AV21MaqCodInicial,AV20MaqCodFinal,AV19Hisprodti,AV18HisProdtf});
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
         paJ62( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Operarios", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionoperarios", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV21MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV20MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV19Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV18HisProdtf))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV14Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV14Parameters);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV11ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV11ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV7DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV7DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV8FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV8FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV12ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV12ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV10ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV10ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Emprcod", GXutil.rtrim( wcpOAV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21MaqCodInicial", GXutil.rtrim( wcpOAV21MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20MaqCodFinal", GXutil.rtrim( wcpOAV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Hisprodti", localUtil.ttoc( wcpOAV19Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18HisProdtf", localUtil.ttoc( wcpOAV18HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV21MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV19Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV18HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONOPERARIOS_Objectcall", GXutil.rtrim( Produccionoperarios_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONOPERARIOS_Objectcall", GXutil.rtrim( Produccionoperarios_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONOPERARIOS_Type", GXutil.rtrim( Produccionoperarios_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRODUCCIONOPERARIOS_Charttype", GXutil.rtrim( Produccionoperarios_Charttype));
   }

   public void renderHtmlCloseFormJ62( )
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
      return "WCProduccionOperarios" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Operarios", "") ;
   }

   public void wbJ60( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionoperarios");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV16QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "", false, (byte)(0), "HLP_WCProduccionOperarios.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV16QueryViewerOutputType) );
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV15QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "", false, (byte)(0), "HLP_WCProduccionOperarios.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV15QueryViewerChartType) );
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
         ucProduccionoperarios.setProperty("Elements", AV22Elements);
         ucProduccionoperarios.setProperty("Parameters", AV14Parameters);
         ucProduccionoperarios.setProperty("Type", Produccionoperarios_Type);
         ucProduccionoperarios.setProperty("Title", Produccionoperarios_Title);
         ucProduccionoperarios.setProperty("ItemClickData", AV9ItemClickData);
         ucProduccionoperarios.setProperty("ItemDoubleClickData", AV11ItemDoubleClickData);
         ucProduccionoperarios.setProperty("DragAndDropData", AV7DragAndDropData);
         ucProduccionoperarios.setProperty("FilterChangedData", AV8FilterChangedData);
         ucProduccionoperarios.setProperty("ItemExpandData", AV12ItemExpandData);
         ucProduccionoperarios.setProperty("ItemCollapseData", AV10ItemCollapseData);
         ucProduccionoperarios.render(context, "queryviewer", Produccionoperarios_Internalname, sPrefix+"PRODUCCIONOPERARIOSContainer");
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

   public void startJ62( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Operarios", ""), (short)(0)) ;
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
            strupJ60( ) ;
         }
      }
   }

   public void wsJ62( )
   {
      startJ62( ) ;
      evtJ62( ) ;
   }

   public void evtJ62( )
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
                              strupJ60( ) ;
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
                              strupJ60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11J62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12J62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13J62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14J62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e15J62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJ60( ) ;
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
                              strupJ60( ) ;
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

   public void weJ62( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormJ62( ) ;
         }
      }
   }

   public void paJ62( )
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
         AV16QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV16QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16QueryViewerOutputType", AV16QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV16QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV15QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV15QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15QueryViewerChartType", AV15QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV15QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfJ62( ) ;
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

   public void rfJ62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e14J62 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15J62 ();
         wbJ60( ) ;
      }
   }

   public void send_integrity_lvl_hashesJ62( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupJ60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11J62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV22Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV14Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV9ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV11ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV7DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV8FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV12ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV10ItemCollapseData);
         /* Read saved values. */
         wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
         wcpOAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodInicial") ;
         wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
         wcpOAV19Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV19Hisprodti"), 0) ;
         wcpOAV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18HisProdtf"), 0) ;
         Produccionoperarios_Objectcall = httpContext.cgiGet( sPrefix+"PRODUCCIONOPERARIOS_Objectcall") ;
         Produccionoperarios_Objectcall = httpContext.cgiGet( sPrefix+"PRODUCCIONOPERARIOS_Objectcall") ;
         Produccionoperarios_Type = httpContext.cgiGet( sPrefix+"PRODUCCIONOPERARIOS_Type") ;
         Produccionoperarios_Charttype = httpContext.cgiGet( sPrefix+"PRODUCCIONOPERARIOS_Charttype") ;
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
      e11J62 ();
      if (returnInSub) return;
   }

   public void e11J62( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV16QueryViewerOutputType = "Table" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16QueryViewerOutputType", AV16QueryViewerOutputType);
      AV15QueryViewerChartType = "Column" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15QueryViewerChartType", AV15QueryViewerChartType);
      Produccionoperarios_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionOperarios")+"\", \""+GXutil.encodeJSON( AV17Emprcod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucProduccionoperarios.sendProperty(context, sPrefix, false, Produccionoperarios_Internalname, "Object", Produccionoperarios_Objectcall);
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionoperarios_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = AV17Emprcod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionoperarios_impl.this.AV17Emprcod = GXv_char2[0] ;
      wcproduccionoperarios_impl.this.AV27Emprnom = GXv_char3[0] ;
      wcproduccionoperarios_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
   }

   public void e12J62( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e13J62( )
   {
      /* Queryviewercharttype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void e14J62( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      Produccionoperarios_Type = AV16QueryViewerOutputType ;
      ucProduccionoperarios.sendProperty(context, sPrefix, false, Produccionoperarios_Internalname, "Type", Produccionoperarios_Type);
      Produccionoperarios_Charttype = AV15QueryViewerChartType ;
      ucProduccionoperarios.sendProperty(context, sPrefix, false, Produccionoperarios_Internalname, "ChartType", Produccionoperarios_Charttype);
      Produccionoperarios_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionOperarios")+"\", \""+GXutil.encodeJSON( AV17Emprcod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucProduccionoperarios.sendProperty(context, sPrefix, false, Produccionoperarios_Internalname, "Object", Produccionoperarios_Objectcall);
      AV5Axes.clear();
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e15J62( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      AV21MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
      AV20MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
      AV19Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisprodti", localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      paJ62( ) ;
      wsJ62( ) ;
      weJ62( ) ;
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
      sCtrlAV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV21MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV20MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV19Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV18HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paJ62( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionoperarios", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paJ62( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV17Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
         AV21MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
         AV20MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
         AV19Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisprodti", localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV18HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18HisProdtf", localUtil.ttoc( AV18HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
      wcpOAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodInicial") ;
      wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
      wcpOAV19Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV19Hisprodti"), 0) ;
      wcpOAV18HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV18HisProdtf"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV17Emprcod, wcpOAV17Emprcod) != 0 ) || ( GXutil.strcmp(AV21MaqCodInicial, wcpOAV21MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV20MaqCodFinal, wcpOAV20MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV19Hisprodti, wcpOAV19Hisprodti) ) || !( GXutil.dateCompare(AV18HisProdtf, wcpOAV18HisProdtf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV17Emprcod = AV17Emprcod ;
      wcpOAV21MaqCodInicial = AV21MaqCodInicial ;
      wcpOAV20MaqCodFinal = AV20MaqCodFinal ;
      wcpOAV19Hisprodti = AV19Hisprodti ;
      wcpOAV18HisProdtf = AV18HisProdtf ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV17Emprcod) > 0 )
      {
         AV17Emprcod = httpContext.cgiGet( sCtrlAV17Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      }
      else
      {
         AV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_PARM") ;
      }
      sCtrlAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"AV21MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV21MaqCodInicial) > 0 )
      {
         AV21MaqCodInicial = httpContext.cgiGet( sCtrlAV21MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
      }
      else
      {
         AV21MaqCodInicial = httpContext.cgiGet( sPrefix+"AV21MaqCodInicial_PARM") ;
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
      sCtrlAV19Hisprodti = httpContext.cgiGet( sPrefix+"AV19Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV19Hisprodti) > 0 )
      {
         AV19Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV19Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hisprodti", localUtil.ttoc( AV19Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV19Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV19Hisprodti_PARM"), 0) ;
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
      paJ62( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsJ62( ) ;
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
      wsJ62( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_PARM", GXutil.rtrim( AV17Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_CTRL", GXutil.rtrim( sCtrlAV17Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodInicial_PARM", GXutil.rtrim( AV21MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV21MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_PARM", GXutil.rtrim( AV20MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV20MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hisprodti_PARM", localUtil.ttoc( AV19Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hisprodti_CTRL", GXutil.rtrim( sCtrlAV19Hisprodti));
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
      weJ62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015563421", true, true);
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
      httpContext.AddJavascriptSource("wcproduccionoperarios.js", "?202661015563421", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( sPrefix+"vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Produccionoperarios_Internalname = sPrefix+"PRODUCCIONOPERARIOS" ;
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
      Produccionoperarios_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      Produccionoperarios_Type = "Table" ;
      Produccionoperarios_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV16QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV15QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV20MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV19Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV18HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Produccionoperarios_Type',ctrl:'PRODUCCIONOPERARIOS',prop:'Type'},{av:'Produccionoperarios_Charttype',ctrl:'PRODUCCIONOPERARIOS',prop:'ChartType'},{ctrl:'PRODUCCIONOPERARIOS'}]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e12J62',iparms:[]");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CONTROLVALUECHANGED","{handler:'e13J62',iparms:[]");
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
      wcpOAV17Emprcod = "" ;
      wcpOAV21MaqCodInicial = "" ;
      wcpOAV20MaqCodFinal = "" ;
      wcpOAV19Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV18HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV17Emprcod = "" ;
      AV21MaqCodInicial = "" ;
      AV20MaqCodFinal = "" ;
      AV19Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV18HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV14Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV9ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV11ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV7DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV8FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV12ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV10ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      Produccionoperarios_Charttype = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV16QueryViewerOutputType = "" ;
      AV15QueryViewerChartType = "" ;
      ucProduccionoperarios = new com.genexus.webpanels.GXUserControl();
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
      AV5Axes = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV17Emprcod = "" ;
      sCtrlAV21MaqCodInicial = "" ;
      sCtrlAV20MaqCodFinal = "" ;
      sCtrlAV19Hisprodti = "" ;
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
   private String wcpOAV17Emprcod ;
   private String wcpOAV21MaqCodInicial ;
   private String wcpOAV20MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV17Emprcod ;
   private String AV21MaqCodInicial ;
   private String AV20MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Produccionoperarios_Objectcall ;
   private String Produccionoperarios_Type ;
   private String Produccionoperarios_Charttype ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String AV16QueryViewerOutputType ;
   private String AV15QueryViewerChartType ;
   private String Produccionoperarios_Title ;
   private String Produccionoperarios_Internalname ;
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
   private String sCtrlAV17Emprcod ;
   private String sCtrlAV21MaqCodInicial ;
   private String sCtrlAV20MaqCodFinal ;
   private String sCtrlAV19Hisprodti ;
   private String sCtrlAV18HisProdtf ;
   private java.util.Date wcpOAV19Hisprodti ;
   private java.util.Date wcpOAV18HisProdtf ;
   private java.util.Date AV19Hisprodti ;
   private java.util.Date AV18HisProdtf ;
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
   private com.genexus.webpanels.GXUserControl ucProduccionoperarios ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV22Elements ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV5Axes ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV14Parameters ;
   private app.SdtQueryViewerDragAndDropData AV7DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV8FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV10ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV11ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV12ItemExpandData ;
}

