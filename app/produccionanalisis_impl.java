package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccionanalisis_impl extends GXDataArea
{
   public produccionanalisis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccionanalisis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionanalisis_impl.class ));
   }

   public produccionanalisis_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      paD12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startD12( ) ;
      }
      return gxajaxcallmode ;
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
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccionanalisis", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GXC1", GXutil.rtrim( A40000GXC1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXC2", GXutil.rtrim( A40001GXC2));
   }

   public void renderHtmlCloseForm( )
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
      if ( ! ( WebComp_Wcproduccionanalisismaquina == null ) )
      {
         WebComp_Wcproduccionanalisismaquina.componentjscripts();
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquinadetalle == null ) )
      {
         WebComp_Wcproduccionanalisismaquinadetalle.componentjscripts();
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquina1 == null ) )
      {
         WebComp_Wcproduccionanalisismaquina1.componentjscripts();
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquina2 == null ) )
      {
         WebComp_Wcproduccionanalisismaquina2.componentjscripts();
      }
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weD12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtD12( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.produccionanalisis", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProduccionAnalisis" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion Analisis", "") ;
   }

   public void wbD10( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodini_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcodini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodini_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodini_Internalname, GXutil.rtrim( AV5MaqCodIni), GXutil.rtrim( localUtil.format( AV5MaqCodIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodini_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodfin_Internalname, "", "", "", lblTextblockmaqcodfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodfin_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodfin_Internalname, GXutil.rtrim( AV6MaqCodFin), GXutil.rtrim( localUtil.format( AV6MaqCodFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodfin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisprodti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisprodti_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblockhisprodti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV7HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV7HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionAnalisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisprodtf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisprodtf_Internalname, "", "", "", lblTextblockhisprodtf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV8HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionAnalisis.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0052"+"", GXutil.rtrim( WebComp_Wcproduccionanalisismaquina_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0052"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina), GXutil.lower( WebComp_Wcproduccionanalisismaquina_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0052"+"");
               }
               WebComp_Wcproduccionanalisismaquina.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina), GXutil.lower( WebComp_Wcproduccionanalisismaquina_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0054"+"", GXutil.rtrim( WebComp_Wcproduccionanalisismaquinadetalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0054"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquinadetalle), GXutil.lower( WebComp_Wcproduccionanalisismaquinadetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0054"+"");
               }
               WebComp_Wcproduccionanalisismaquinadetalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquinadetalle), GXutil.lower( WebComp_Wcproduccionanalisismaquinadetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0056"+"", GXutil.rtrim( WebComp_Wcproduccionanalisismaquina1_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0056"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina1), GXutil.lower( WebComp_Wcproduccionanalisismaquina1_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0056"+"");
               }
               WebComp_Wcproduccionanalisismaquina1.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina1), GXutil.lower( WebComp_Wcproduccionanalisismaquina1_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0058"+"", GXutil.rtrim( WebComp_Wcproduccionanalisismaquina2_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0058"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina2), GXutil.lower( WebComp_Wcproduccionanalisismaquina2_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0058"+"");
               }
               WebComp_Wcproduccionanalisismaquina2.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcproduccionanalisismaquina2), GXutil.lower( WebComp_Wcproduccionanalisismaquina2_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startD12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Produccion Analisis", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupD10( ) ;
   }

   public void wsD12( )
   {
      startD12( ) ;
      evtD12( ) ;
   }

   public void evtD12( )
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
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
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
                           e11D12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e12D12 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 52 )
                     {
                        OldWcproduccionanalisismaquina = httpContext.cgiGet( "W0052") ;
                        if ( ( GXutil.len( OldWcproduccionanalisismaquina) == 0 ) || ( GXutil.strcmp(OldWcproduccionanalisismaquina, WebComp_Wcproduccionanalisismaquina_Component) != 0 ) )
                        {
                           WebComp_Wcproduccionanalisismaquina = WebUtils.getWebComponent(getClass(), "app." + OldWcproduccionanalisismaquina + "_impl", remoteHandle, context);
                           WebComp_Wcproduccionanalisismaquina_Component = OldWcproduccionanalisismaquina ;
                        }
                        if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
                        {
                           WebComp_Wcproduccionanalisismaquina.componentprocess("W0052", "", sEvt);
                        }
                        WebComp_Wcproduccionanalisismaquina_Component = OldWcproduccionanalisismaquina ;
                     }
                     else if ( nCmpId == 54 )
                     {
                        OldWcproduccionanalisismaquinadetalle = httpContext.cgiGet( "W0054") ;
                        if ( ( GXutil.len( OldWcproduccionanalisismaquinadetalle) == 0 ) || ( GXutil.strcmp(OldWcproduccionanalisismaquinadetalle, WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 ) )
                        {
                           WebComp_Wcproduccionanalisismaquinadetalle = WebUtils.getWebComponent(getClass(), "app." + OldWcproduccionanalisismaquinadetalle + "_impl", remoteHandle, context);
                           WebComp_Wcproduccionanalisismaquinadetalle_Component = OldWcproduccionanalisismaquinadetalle ;
                        }
                        if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
                        {
                           WebComp_Wcproduccionanalisismaquinadetalle.componentprocess("W0054", "", sEvt);
                        }
                        WebComp_Wcproduccionanalisismaquinadetalle_Component = OldWcproduccionanalisismaquinadetalle ;
                     }
                     else if ( nCmpId == 56 )
                     {
                        OldWcproduccionanalisismaquina1 = httpContext.cgiGet( "W0056") ;
                        if ( ( GXutil.len( OldWcproduccionanalisismaquina1) == 0 ) || ( GXutil.strcmp(OldWcproduccionanalisismaquina1, WebComp_Wcproduccionanalisismaquina1_Component) != 0 ) )
                        {
                           WebComp_Wcproduccionanalisismaquina1 = WebUtils.getWebComponent(getClass(), "app." + OldWcproduccionanalisismaquina1 + "_impl", remoteHandle, context);
                           WebComp_Wcproduccionanalisismaquina1_Component = OldWcproduccionanalisismaquina1 ;
                        }
                        if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
                        {
                           WebComp_Wcproduccionanalisismaquina1.componentprocess("W0056", "", sEvt);
                        }
                        WebComp_Wcproduccionanalisismaquina1_Component = OldWcproduccionanalisismaquina1 ;
                     }
                     else if ( nCmpId == 58 )
                     {
                        OldWcproduccionanalisismaquina2 = httpContext.cgiGet( "W0058") ;
                        if ( ( GXutil.len( OldWcproduccionanalisismaquina2) == 0 ) || ( GXutil.strcmp(OldWcproduccionanalisismaquina2, WebComp_Wcproduccionanalisismaquina2_Component) != 0 ) )
                        {
                           WebComp_Wcproduccionanalisismaquina2 = WebUtils.getWebComponent(getClass(), "app." + OldWcproduccionanalisismaquina2 + "_impl", remoteHandle, context);
                           WebComp_Wcproduccionanalisismaquina2_Component = OldWcproduccionanalisismaquina2 ;
                        }
                        if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
                        {
                           WebComp_Wcproduccionanalisismaquina2.componentprocess("W0058", "", sEvt);
                        }
                        WebComp_Wcproduccionanalisismaquina2_Component = OldWcproduccionanalisismaquina2 ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weD12( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paD12( )
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
            GX_FocusControl = edtavMaqcodini_Internalname ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfD12( ) ;
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

   public void rfD12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
            {
               WebComp_Wcproduccionanalisismaquina.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
            {
               WebComp_Wcproduccionanalisismaquinadetalle.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
            {
               WebComp_Wcproduccionanalisismaquina1.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
            {
               WebComp_Wcproduccionanalisismaquina2.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12D12 ();
         wbD10( ) ;
      }
   }

   public void send_integrity_lvl_hashesD12( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      /* Using cursor H00D13 */
      pr_default.execute(0);
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = H00D13_A40000GXC1[0] ;
         n40000GXC1 = H00D13_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = "" ;
         n40000GXC1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40000GXC1", A40000GXC1);
      }
      pr_default.close(0);
      /* Using cursor H00D15 */
      pr_default.execute(1);
      if ( (pr_default.getStatus(1) != 101) )
      {
         A40001GXC2 = H00D15_A40001GXC2[0] ;
         n40001GXC2 = H00D15_n40001GXC2[0] ;
      }
      else
      {
         A40001GXC2 = "" ;
         n40001GXC2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40001GXC2", A40001GXC2);
      }
      pr_default.close(1);
      fix_multi_value_controls( ) ;
   }

   public void strupD10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11D12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         AV5MaqCodIni = httpContext.cgiGet( edtavMaqcodini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5MaqCodIni", AV5MaqCodIni);
         AV6MaqCodFin = httpContext.cgiGet( edtavMaqcodfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCodFin", AV6MaqCodFin);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV7HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV8HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
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
      e11D12 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e11D12( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Using cursor H00D17 */
      pr_default.execute(2);
      if ( (pr_default.getStatus(2) != 101) )
      {
         A40000GXC1 = H00D17_A40000GXC1[0] ;
         n40000GXC1 = H00D17_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = "" ;
         n40000GXC1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40000GXC1", A40000GXC1);
      }
      pr_default.close(2);
      /* Using cursor H00D19 */
      pr_default.execute(3);
      if ( (pr_default.getStatus(3) != 101) )
      {
         A40001GXC2 = H00D19_A40001GXC2[0] ;
         n40001GXC2 = H00D19_n40001GXC2[0] ;
      }
      else
      {
         A40001GXC2 = "" ;
         n40001GXC2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40001GXC2", A40001GXC2);
      }
      pr_default.close(3);
      AV5MaqCodIni = A40000GXC1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5MaqCodIni", AV5MaqCodIni);
      AV6MaqCodFin = A40001GXC2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCodFin", AV6MaqCodFin);
      AV8HisProDTF = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV7HisProDTI = GXutil.addmth( AV8HisProDTF, (short)(-1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccionanalisis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV12Emprcod ;
      GXv_char3[0] = AV13Emprnom ;
      GXv_char4[0] = AV14Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccionanalisis_impl.this.AV12Emprcod = GXv_char2[0] ;
      produccionanalisis_impl.this.AV13Emprnom = GXv_char3[0] ;
      produccionanalisis_impl.this.AV14Usurcod = GXv_char4[0] ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina_Component), GXutil.lower( "ProduccionAnalisisMaquina")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina_Component = "ProduccionAnalisisMaquina" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina.setjustcreated();
         WebComp_Wcproduccionanalisismaquina.componentprepare(new Object[] {"W0052","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquinadetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquinadetalle_Component), GXutil.lower( "ProduccionAnalisisMaquinaDetalle")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquinadetalle = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquinadetalle_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquinadetalle_Component = "ProduccionAnalisisMaquinaDetalle" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquinadetalle.setjustcreated();
         WebComp_Wcproduccionanalisismaquinadetalle.componentprepare(new Object[] {"W0054","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquinadetalle.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina1 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina1_Component), GXutil.lower( "ProduccionAnalisisMaquina1")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina1 = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina1_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina1_Component = "ProduccionAnalisisMaquina1" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina1.setjustcreated();
         WebComp_Wcproduccionanalisismaquina1.componentprepare(new Object[] {"W0056","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina1.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina2 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina2_Component), GXutil.lower( "ProduccionAnalisisMaquina2")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina2 = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina2_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina2_Component = "ProduccionAnalisisMaquina2" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina2.setjustcreated();
         WebComp_Wcproduccionanalisismaquina2.componentprepare(new Object[] {"W0058","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina2.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
   }

   public void S112( )
   {
      /* 'REFRESH' Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina_Component), GXutil.lower( "ProduccionAnalisisMaquina")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina_Component = "ProduccionAnalisisMaquina" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina.setjustcreated();
         WebComp_Wcproduccionanalisismaquina.componentprepare(new Object[] {"W0052","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcproduccionanalisismaquina )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0052"+"");
         WebComp_Wcproduccionanalisismaquina.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina1 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina1_Component), GXutil.lower( "ProduccionAnalisisMaquina1")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina1 = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina1_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina1_Component = "ProduccionAnalisisMaquina1" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina1.setjustcreated();
         WebComp_Wcproduccionanalisismaquina1.componentprepare(new Object[] {"W0056","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina1.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcproduccionanalisismaquina1 )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0056"+"");
         WebComp_Wcproduccionanalisismaquina1.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquina2 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquina2_Component), GXutil.lower( "ProduccionAnalisisMaquina2")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina2 = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquina2_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquina2_Component = "ProduccionAnalisisMaquina2" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquina2.setjustcreated();
         WebComp_Wcproduccionanalisismaquina2.componentprepare(new Object[] {"W0058","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquina2.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcproduccionanalisismaquina2 )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0058"+"");
         WebComp_Wcproduccionanalisismaquina2.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcproduccionanalisismaquinadetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcproduccionanalisismaquinadetalle_Component), GXutil.lower( "ProduccionAnalisisMaquinaDetalle")) != 0 )
      {
         WebComp_Wcproduccionanalisismaquinadetalle = WebUtils.getWebComponent(getClass(), "app.produccionanalisismaquinadetalle_impl", remoteHandle, context);
         WebComp_Wcproduccionanalisismaquinadetalle_Component = "ProduccionAnalisisMaquinaDetalle" ;
      }
      if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
      {
         WebComp_Wcproduccionanalisismaquinadetalle.setjustcreated();
         WebComp_Wcproduccionanalisismaquinadetalle.componentprepare(new Object[] {"W0054","",AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF});
         WebComp_Wcproduccionanalisismaquinadetalle.componentbind(new Object[] {"vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcproduccionanalisismaquinadetalle )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0054"+"");
         WebComp_Wcproduccionanalisismaquinadetalle.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e12D12( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paD12( ) ;
      wsD12( ) ;
      weD12( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcproduccionanalisismaquina == null ) )
      {
         if ( GXutil.len( WebComp_Wcproduccionanalisismaquina_Component) != 0 )
         {
            WebComp_Wcproduccionanalisismaquina.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquinadetalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcproduccionanalisismaquinadetalle_Component) != 0 )
         {
            WebComp_Wcproduccionanalisismaquinadetalle.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquina1 == null ) )
      {
         if ( GXutil.len( WebComp_Wcproduccionanalisismaquina1_Component) != 0 )
         {
            WebComp_Wcproduccionanalisismaquina1.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcproduccionanalisismaquina2 == null ) )
      {
         if ( GXutil.len( WebComp_Wcproduccionanalisismaquina2_Component) != 0 )
         {
            WebComp_Wcproduccionanalisismaquina2.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101641185", true, true);
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
      httpContext.AddJavascriptSource("produccionanalisis.js", "?20266101641185", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockmaqcodini_Internalname = "TEXTBLOCKMAQCODINI" ;
      edtavMaqcodini_Internalname = "vMAQCODINI" ;
      divUnnamedtablemaqcodini_Internalname = "UNNAMEDTABLEMAQCODINI" ;
      lblTextblockmaqcodfin_Internalname = "TEXTBLOCKMAQCODFIN" ;
      edtavMaqcodfin_Internalname = "vMAQCODFIN" ;
      divUnnamedtablemaqcodfin_Internalname = "UNNAMEDTABLEMAQCODFIN" ;
      lblTextblockhisprodti_Internalname = "TEXTBLOCKHISPRODTI" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      divUnnamedtablehisprodti_Internalname = "UNNAMEDTABLEHISPRODTI" ;
      lblTextblockhisprodtf_Internalname = "TEXTBLOCKHISPRODTF" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      divUnnamedtablehisprodtf_Internalname = "UNNAMEDTABLEHISPRODTF" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
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
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavMaqcodfin_Jsonclick = "" ;
      edtavMaqcodfin_Enabled = 1 ;
      edtavMaqcodini_Jsonclick = "" ;
      edtavMaqcodini_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Produccion Analisis", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A40000GXC1 = "" ;
      A40001GXC2 = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblockmaqcodini_Jsonclick = "" ;
      TempTags = "" ;
      AV5MaqCodIni = "" ;
      lblTextblockmaqcodfin_Jsonclick = "" ;
      AV6MaqCodFin = "" ;
      lblTextblockhisprodti_Jsonclick = "" ;
      AV7HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockhisprodtf_Jsonclick = "" ;
      AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      WebComp_Wcproduccionanalisismaquina_Component = "" ;
      OldWcproduccionanalisismaquina = "" ;
      WebComp_Wcproduccionanalisismaquinadetalle_Component = "" ;
      OldWcproduccionanalisismaquinadetalle = "" ;
      WebComp_Wcproduccionanalisismaquina1_Component = "" ;
      OldWcproduccionanalisismaquina1 = "" ;
      WebComp_Wcproduccionanalisismaquina2_Component = "" ;
      OldWcproduccionanalisismaquina2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00D13_A40000GXC1 = new String[] {""} ;
      H00D13_n40000GXC1 = new boolean[] {false} ;
      H00D15_A40001GXC2 = new String[] {""} ;
      H00D15_n40001GXC2 = new boolean[] {false} ;
      H00D17_A40000GXC1 = new String[] {""} ;
      H00D17_n40000GXC1 = new boolean[] {false} ;
      H00D19_A40001GXC2 = new String[] {""} ;
      H00D19_n40001GXC2 = new boolean[] {false} ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV12Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV13Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV14Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccionanalisis__default(),
         new Object[] {
             new Object[] {
            H00D13_A40000GXC1, H00D13_n40000GXC1
            }
            , new Object[] {
            H00D15_A40001GXC2, H00D15_n40001GXC2
            }
            , new Object[] {
            H00D17_A40000GXC1, H00D17_n40000GXC1
            }
            , new Object[] {
            H00D19_A40001GXC2, H00D19_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcproduccionanalisismaquina = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcproduccionanalisismaquinadetalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcproduccionanalisismaquina1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcproduccionanalisismaquina2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavMaqcodini_Enabled ;
   private int edtavMaqcodfin_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A40000GXC1 ;
   private String A40001GXC2 ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtablemaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Jsonclick ;
   private String edtavMaqcodini_Internalname ;
   private String TempTags ;
   private String AV5MaqCodIni ;
   private String edtavMaqcodini_Jsonclick ;
   private String divUnnamedtablemaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Jsonclick ;
   private String edtavMaqcodfin_Internalname ;
   private String AV6MaqCodFin ;
   private String edtavMaqcodfin_Jsonclick ;
   private String divUnnamedtablehisprodti_Internalname ;
   private String lblTextblockhisprodti_Internalname ;
   private String lblTextblockhisprodti_Jsonclick ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String divUnnamedtablehisprodtf_Internalname ;
   private String lblTextblockhisprodtf_Internalname ;
   private String lblTextblockhisprodtf_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcproduccionanalisismaquina_Component ;
   private String OldWcproduccionanalisismaquina ;
   private String WebComp_Wcproduccionanalisismaquinadetalle_Component ;
   private String OldWcproduccionanalisismaquinadetalle ;
   private String WebComp_Wcproduccionanalisismaquina1_Component ;
   private String OldWcproduccionanalisismaquina1 ;
   private String WebComp_Wcproduccionanalisismaquina2_Component ;
   private String OldWcproduccionanalisismaquina2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV12Emprcod ;
   private String GXv_char2[] ;
   private String AV13Emprnom ;
   private String GXv_char3[] ;
   private String AV14Usurcod ;
   private String GXv_char4[] ;
   private java.util.Date AV7HisProDTI ;
   private java.util.Date AV8HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcproduccionanalisismaquina ;
   private boolean bDynCreated_Wcproduccionanalisismaquinadetalle ;
   private boolean bDynCreated_Wcproduccionanalisismaquina1 ;
   private boolean bDynCreated_Wcproduccionanalisismaquina2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcproduccionanalisismaquina ;
   private GXWebComponent WebComp_Wcproduccionanalisismaquinadetalle ;
   private GXWebComponent WebComp_Wcproduccionanalisismaquina1 ;
   private GXWebComponent WebComp_Wcproduccionanalisismaquina2 ;
   private IDataStoreProvider pr_default ;
   private String[] H00D13_A40000GXC1 ;
   private boolean[] H00D13_n40000GXC1 ;
   private String[] H00D15_A40001GXC2 ;
   private boolean[] H00D15_n40001GXC2 ;
   private String[] H00D17_A40000GXC1 ;
   private boolean[] H00D17_n40000GXC1 ;
   private String[] H00D19_A40001GXC2 ;
   private boolean[] H00D19_n40001GXC2 ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class produccionanalisis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00D13", "SELECT COALESCE( T1.GXC1, '') AS GXC1 FROM (SELECT MIN(MaqCod) AS GXC1 FROM TXPMAQUIN ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00D15", "SELECT COALESCE( T1.GXC2, '') AS GXC2 FROM (SELECT MAX(MaqCod) AS GXC2 FROM TXPMAQUIN ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00D17", "SELECT COALESCE( T1.GXC1, '') AS GXC1 FROM (SELECT MIN(MaqCod) AS GXC1 FROM TXPMAQUIN ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00D19", "SELECT COALESCE( T1.GXC2, '') AS GXC2 FROM (SELECT MAX(MaqCod) AS GXC2 FROM TXPMAQUIN ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

