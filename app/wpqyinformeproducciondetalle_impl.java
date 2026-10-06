package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpqyinformeproducciondetalle_impl extends GXWebPanel
{
   public wpqyinformeproducciondetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpqyinformeproducciondetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpqyinformeproducciondetalle_impl.class ));
   }

   public wpqyinformeproducciondetalle_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavQueryvieweroutputtype = new HTMLChoice();
      cmbavQueryviewercharttype = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV16EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV17MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17MaqCodInicial", AV17MaqCodInicial);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINICIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17MaqCodInicial, ""))));
               AV18MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodFinal", AV18MaqCodFinal);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFINAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18MaqCodFinal, ""))));
               AV15HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15HisProDTI", localUtil.ttoc( AV15HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTI", getSecureSignedToken( "", localUtil.format( AV15HisProDTI, "99/99/99 99:99:99")));
               AV19HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19HisProDTF", localUtil.ttoc( AV19HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTF", getSecureSignedToken( "", localUtil.format( AV19HisProDTF, "99/99/99 99:99:99")));
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paJ32( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            wsJ32( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               weJ32( ) ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( httpContext.getMessage( "WPQy Informe Produccion Detalle", "")) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpqyinformeproducciondetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV17MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV18MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV15HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV19HisProDTF))}, new String[] {"EmprCod","MaqCodInicial","MaqCodFinal","HisProDTI","HisProDTF"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINICIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17MaqCodInicial, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFINAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18MaqCodFinal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTI", getSecureSignedToken( "", localUtil.format( AV15HisProDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTF", getSecureSignedToken( "", localUtil.format( AV19HisProDTF, "99/99/99 99:99:99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vAXES", AV7Axes);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vAXES", AV7Axes);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARAMETERS", AV5Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARAMETERS", AV5Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCLICKDATA", AV13ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCLICKDATA", AV13ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMDOUBLECLICKDATA", AV14ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMDOUBLECLICKDATA", AV14ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMEXPANDDATA", AV10ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMEXPANDDATA", AV10ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCOLLAPSEDATA", AV11ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCOLLAPSEDATA", AV11ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODINICIAL", GXutil.rtrim( AV17MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINICIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17MaqCodInicial, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODFINAL", GXutil.rtrim( AV18MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFINAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18MaqCodFinal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTI", localUtil.ttoc( AV15HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTI", getSecureSignedToken( "", localUtil.format( AV15HisProDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTF", localUtil.ttoc( AV19HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTF", getSecureSignedToken( "", localUtil.format( AV19HisProDTF, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Objectcall", GXutil.rtrim( Queryviewer1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Objectname", GXutil.rtrim( Queryviewer1_Objectname));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Objectcall", GXutil.rtrim( Queryviewer1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Autoresize", GXutil.booltostr( Queryviewer1_Autoresize));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Type", GXutil.rtrim( Queryviewer1_Type));
      app.GxWebStd.gx_hidden_field( httpContext, "QUERYVIEWER1_Charttype", GXutil.rtrim( Queryviewer1_Charttype));
   }

   public void renderHtmlCloseFormJ32( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "WPQyInformeProduccionDetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WPQy Informe Produccion Detalle", "") ;
   }

   public void wbJ30( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavQueryvieweroutputtype.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryvieweroutputtype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryvieweroutputtype.getInternalname(), httpContext.getMessage( "Tipo", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryvieweroutputtype, cmbavQueryvieweroutputtype.getInternalname(), GXutil.rtrim( AV21QueryViewerOutputType), 1, cmbavQueryvieweroutputtype.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavQueryvieweroutputtype.getVisible(), cmbavQueryvieweroutputtype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,10);\"", "", true, (byte)(0), "HLP_WPQyInformeProduccionDetalle.htm");
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV21QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavQueryviewercharttype.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryviewercharttype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryviewercharttype.getInternalname(), httpContext.getMessage( "Gráfico", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV20QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVQUERYVIEWERCHARTTYPE.CLICK."+"'", "char", "", cmbavQueryviewercharttype.getVisible(), cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", "", true, (byte)(0), "HLP_WPQyInformeProduccionDetalle.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV20QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
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
         ucQueryviewer1.setProperty("Elements", AV7Axes);
         ucQueryviewer1.setProperty("Parameters", AV5Parameters);
         ucQueryviewer1.setProperty("ObjectName", Queryviewer1_Objectname);
         ucQueryviewer1.setProperty("AutoResize", Queryviewer1_Autoresize);
         ucQueryviewer1.setProperty("Title", Queryviewer1_Title);
         ucQueryviewer1.setProperty("ItemClickData", AV13ItemClickData);
         ucQueryviewer1.setProperty("ItemDoubleClickData", AV14ItemDoubleClickData);
         ucQueryviewer1.setProperty("DragAndDropData", AV9DragAndDropData);
         ucQueryviewer1.setProperty("FilterChangedData", AV12FilterChangedData);
         ucQueryviewer1.setProperty("ItemExpandData", AV10ItemExpandData);
         ucQueryviewer1.setProperty("ItemCollapseData", AV11ItemCollapseData);
         ucQueryviewer1.render(context, "queryviewer", Queryviewer1_Internalname, "QUERYVIEWER1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startJ32( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "WPQy Informe Produccion Detalle", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupJ30( ) ;
   }

   public void wsJ32( )
   {
      startJ32( ) ;
      evtJ32( ) ;
   }

   public void evtJ32( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
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
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11J32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Refresh */
                        e12J32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e13J32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e14J32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e15J32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
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

   public void weJ32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormJ32( ) ;
         }
      }
   }

   public void paJ32( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = cmbavQueryvieweroutputtype.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
         httpContext.ajax_rsp_assign_attri("", false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryvieweroutputtype.setValue( GXutil.rtrim( AV21QueryViewerOutputType) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavQueryvieweroutputtype.getInternalname(), "Values", cmbavQueryvieweroutputtype.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV20QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV20QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20QueryViewerChartType", AV20QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV20QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfJ32( ) ;
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

   public void rfJ32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12J32 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15J32 ();
         wbJ30( ) ;
      }
   }

   public void send_integrity_lvl_hashesJ32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODINICIAL", GXutil.rtrim( AV17MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINICIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17MaqCodInicial, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODFINAL", GXutil.rtrim( AV18MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFINAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18MaqCodFinal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTI", localUtil.ttoc( AV15HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTI", getSecureSignedToken( "", localUtil.format( AV15HisProDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTF", localUtil.ttoc( AV19HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTF", getSecureSignedToken( "", localUtil.format( AV19HisProDTF, "99/99/99 99:99:99")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupJ30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11J32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vAXES"), AV7Axes);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARAMETERS"), AV5Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCLICKDATA"), AV13ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMDOUBLECLICKDATA"), AV14ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILTERCHANGEDDATA"), AV12FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMEXPANDDATA"), AV10ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCOLLAPSEDATA"), AV11ItemCollapseData);
         /* Read saved values. */
         Queryviewer1_Objectcall = httpContext.cgiGet( "QUERYVIEWER1_Objectcall") ;
         Queryviewer1_Objectname = httpContext.cgiGet( "QUERYVIEWER1_Objectname") ;
         Queryviewer1_Objectcall = httpContext.cgiGet( "QUERYVIEWER1_Objectcall") ;
         Queryviewer1_Autoresize = GXutil.strtobool( httpContext.cgiGet( "QUERYVIEWER1_Autoresize")) ;
         Queryviewer1_Type = httpContext.cgiGet( "QUERYVIEWER1_Type") ;
         Queryviewer1_Charttype = httpContext.cgiGet( "QUERYVIEWER1_Charttype") ;
         /* Read variables values. */
         cmbavQueryvieweroutputtype.setValue( httpContext.cgiGet( cmbavQueryvieweroutputtype.getInternalname()) );
         AV21QueryViewerOutputType = httpContext.cgiGet( cmbavQueryvieweroutputtype.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
         cmbavQueryviewercharttype.setValue( httpContext.cgiGet( cmbavQueryviewercharttype.getInternalname()) );
         AV20QueryViewerChartType = httpContext.cgiGet( cmbavQueryviewercharttype.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20QueryViewerChartType", AV20QueryViewerChartType);
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
      e11J32 ();
      if (returnInSub) return;
   }

   public void e11J32( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV21QueryViewerOutputType = "Table" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
      cmbavQueryviewercharttype.setVisible( (((GXutil.strcmp(AV21QueryViewerOutputType, "Chart")==0)) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavQueryviewercharttype.getInternalname(), "Visible", GXutil.ltrimstr( cmbavQueryviewercharttype.getVisible(), 5, 0), true);
      cmbavQueryvieweroutputtype.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavQueryvieweroutputtype.getInternalname(), "Visible", GXutil.ltrimstr( cmbavQueryvieweroutputtype.getVisible(), 5, 0), true);
      Queryviewer1_Type = AV21QueryViewerOutputType ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "Type", Queryviewer1_Type);
      Queryviewer1_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionLector")+"\", \""+GXutil.encodeJSON( AV16EmprCod)+"\", \""+GXutil.encodeJSON( AV17MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV18MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV15HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV19HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "Object", Queryviewer1_Objectcall);
   }

   public void e12J32( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      cmbavQueryviewercharttype.setVisible( (((GXutil.strcmp(AV21QueryViewerOutputType, "Chart")==0)) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavQueryviewercharttype.getInternalname(), "Visible", GXutil.ltrimstr( cmbavQueryviewercharttype.getVisible(), 5, 0), true);
      Queryviewer1_Type = AV21QueryViewerOutputType ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "Type", Queryviewer1_Type);
      Queryviewer1_Charttype = AV20QueryViewerChartType ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "ChartType", Queryviewer1_Charttype);
      Queryviewer1_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionLector")+"\", \""+GXutil.encodeJSON( AV16EmprCod)+"\", \""+GXutil.encodeJSON( AV17MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV18MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV15HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV19HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
      ucQueryviewer1.sendProperty(context, "", false, Queryviewer1_Internalname, "Object", Queryviewer1_Objectcall);
      /*  Sending Event outputs  */
   }

   public void e13J32( )
   {
      /* Queryvieweroutputtype_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e14J32( )
   {
      /* Queryviewercharttype_Click Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e15J32( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV16EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      AV17MaqCodInicial = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17MaqCodInicial", AV17MaqCodInicial);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINICIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17MaqCodInicial, ""))));
      AV18MaqCodFinal = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCodFinal", AV18MaqCodFinal);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFINAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18MaqCodFinal, ""))));
      AV15HisProDTI = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15HisProDTI", localUtil.ttoc( AV15HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTI", getSecureSignedToken( "", localUtil.format( AV15HisProDTI, "99/99/99 99:99:99")));
      AV19HisProDTF = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19HisProDTF", localUtil.ttoc( AV19HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPRODTF", getSecureSignedToken( "", localUtil.format( AV19HisProDTF, "99/99/99 99:99:99")));
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
      paJ32( ) ;
      wsJ32( ) ;
      weJ32( ) ;
      httpContext.setWrapped(false);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202651998019", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("wpqyinformeproducciondetalle.js", "?202651998020", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavQueryvieweroutputtype.setInternalname( "vQUERYVIEWEROUTPUTTYPE" );
      cmbavQueryviewercharttype.setInternalname( "vQUERYVIEWERCHARTTYPE" );
      divTable1_Internalname = "TABLE1" ;
      Queryviewer1_Internalname = "QUERYVIEWER1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Queryviewer1_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryviewercharttype.setVisible( 1 );
      cmbavQueryvieweroutputtype.setJsonclick( "" );
      cmbavQueryvieweroutputtype.setEnabled( 1 );
      cmbavQueryvieweroutputtype.setVisible( 1 );
      Queryviewer1_Charttype = "Column" ;
      Queryviewer1_Type = "Default" ;
      Queryviewer1_Autoresize = GXutil.toBoolean( -1) ;
      Queryviewer1_Objectname = "" ;
      Queryviewer1_Objectcall = "" ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
         AV21QueryViewerOutputType = cmbavQueryvieweroutputtype.getValidValue(AV21QueryViewerOutputType) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21QueryViewerOutputType", AV21QueryViewerOutputType);
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
         AV20QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV20QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20QueryViewerChartType", AV20QueryViewerChartType);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavQueryvieweroutputtype'},{av:'AV21QueryViewerOutputType',fld:'vQUERYVIEWEROUTPUTTYPE',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV20QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17MaqCodInicial',fld:'vMAQCODINICIAL',pic:'',hsh:true},{av:'AV18MaqCodFinal',fld:'vMAQCODFINAL',pic:'',hsh:true},{av:'AV15HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99',hsh:true},{av:'AV19HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavQueryviewercharttype'},{av:'Queryviewer1_Type',ctrl:'QUERYVIEWER1',prop:'Type'},{av:'Queryviewer1_Charttype',ctrl:'QUERYVIEWER1',prop:'ChartType'},{ctrl:'QUERYVIEWER1'}]}");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED","{handler:'e13J32',iparms:[]");
      setEventMetadata("VQUERYVIEWEROUTPUTTYPE.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CLICK","{handler:'e14J32',iparms:[]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CLICK",",oparms:[]}");
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
      wcpOAV16EmprCod = "" ;
      wcpOAV17MaqCodInicial = "" ;
      wcpOAV18MaqCodFinal = "" ;
      wcpOAV15HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV19HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16EmprCod = "" ;
      AV17MaqCodInicial = "" ;
      AV18MaqCodFinal = "" ;
      AV15HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV19HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV7Axes = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV5Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV13ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV14ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV9DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV12FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV10ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV11ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      AV21QueryViewerOutputType = "" ;
      AV20QueryViewerChartType = "" ;
      ucQueryviewer1 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int idxLst ;
   private String wcpOAV16EmprCod ;
   private String wcpOAV17MaqCodInicial ;
   private String wcpOAV18MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV16EmprCod ;
   private String AV17MaqCodInicial ;
   private String AV18MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Queryviewer1_Objectcall ;
   private String Queryviewer1_Objectname ;
   private String Queryviewer1_Type ;
   private String Queryviewer1_Charttype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String TempTags ;
   private String AV21QueryViewerOutputType ;
   private String AV20QueryViewerChartType ;
   private String Queryviewer1_Title ;
   private String Queryviewer1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private java.util.Date wcpOAV15HisProDTI ;
   private java.util.Date wcpOAV19HisProDTF ;
   private java.util.Date AV15HisProDTI ;
   private java.util.Date AV19HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Queryviewer1_Autoresize ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucQueryviewer1 ;
   private HTMLChoice cmbavQueryvieweroutputtype ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV5Parameters ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Axes ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerItemExpandData AV10ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV11ItemCollapseData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV13ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV14ItemDoubleClickData ;
}

