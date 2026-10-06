package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wptestsql_impl extends GXDataArea
{
   public wptestsql_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wptestsql_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wptestsql_impl.class ));
   }

   public wptestsql_impl( int remoteHandle ,
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
      pa26S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start26S2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wptestsql", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTQUERYRECORDSET", getSecureSignedToken( "", AV9SDTQueryRecordSet));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES", getSecureSignedToken( "", AV15Messages));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTQUERYRECORDSET", AV9SDTQueryRecordSet);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTQUERYRECORDSET", AV9SDTQueryRecordSet);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTQUERYRECORDSET", getSecureSignedToken( "", AV9SDTQueryRecordSet));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMESSAGES", AV15Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMESSAGES", AV15Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES", getSecureSignedToken( "", AV15Messages));
      app.GxWebStd.gx_hidden_field( httpContext, "vHTML", AV6HTML);
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
         we26S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt26S2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.wptestsql", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "wpTestsql" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "wp Testsql", "") ;
   }

   public void wb26S0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSqlstring_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSqlstring_Internalname, httpContext.getMessage( "sqlstring", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavSqlstring_Internalname, AV12sqlstring, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,8);\"", (short)(0), 1, edtavSqlstring_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpTestsql.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRetorno_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRetorno_Internalname, httpContext.getMessage( "Retorno", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavRetorno_Internalname, AV8Retorno, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,13);\"", (short)(0), 1, edtavRetorno_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpTestsql.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, lblTextblock1_Caption, "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_wpTestsql.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttEnter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttEnter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_wpTestsql.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttRecordset_Internalname, "", httpContext.getMessage( "REcordset", ""), bttRecordset_Jsonclick, 5, httpContext.getMessage( "REcordset", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'RECORDSET\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_wpTestsql.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start26S2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "wp Testsql", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup26S0( ) ;
   }

   public void ws26S2( )
   {
      start26S2( ) ;
      evt26S2( ) ;
   }

   public void evt26S2( )
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
                           e1126S2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e1226S2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'RECORDSET'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'REcordset' */
                           e1326S2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1426S2 ();
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
   }

   public void we26S2( )
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

   public void pa26S2( )
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
            GX_FocusControl = edtavSqlstring_Internalname ;
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
      rf26S2( ) ;
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

   public void rf26S2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1426S2 ();
         wb26S0( ) ;
      }
   }

   public void send_integrity_lvl_hashes26S2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTQUERYRECORDSET", AV9SDTQueryRecordSet);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTQUERYRECORDSET", AV9SDTQueryRecordSet);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTQUERYRECORDSET", getSecureSignedToken( "", AV9SDTQueryRecordSet));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMESSAGES", AV15Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMESSAGES", AV15Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES", getSecureSignedToken( "", AV15Messages));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup26S0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1126S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         AV12sqlstring = httpContext.cgiGet( edtavSqlstring_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12sqlstring", AV12sqlstring);
         AV8Retorno = httpContext.cgiGet( edtavRetorno_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Retorno", AV8Retorno);
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
      e1126S2 ();
      if (returnInSub) return;
   }

   public void e1126S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV12sqlstring = httpContext.getMessage( "SELECT * FROM TXPCLIENT", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12sqlstring", AV12sqlstring);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1226S2 ();
      if (returnInSub) return;
   }

   public void e1226S2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      GXt_char1 = AV8Retorno ;
      GXv_char2[0] = GXt_char1 ;
      new app.pgetresultset(remoteHandle, context).execute( AV12sqlstring, GXv_char2) ;
      wptestsql_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Retorno = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Retorno", AV8Retorno);
      /*  Sending Event outputs  */
   }

   public void e1326S2( )
   {
      /* 'REcordset' Routine */
      returnInSub = false ;
      GXt_char1 = AV8Retorno ;
      GXv_char2[0] = GXt_char1 ;
      new app.pgetresultsetmultiplos(remoteHandle, context).execute( AV12sqlstring, GXv_char2) ;
      wptestsql_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Retorno = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Retorno", AV8Retorno);
      AV16isOk = AV9SDTQueryRecordSet.fromxml(AV8Retorno, AV15Messages, "SDTQueryRecordSet") ;
      if ( AV16isOk )
      {
         AV6HTML += httpContext.getMessage( "<table style=\"width:100%\" class=\"table table-striped\">", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
         AV6HTML += httpContext.getMessage( "<tr>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
         AV20GXV1 = 1 ;
         while ( AV20GXV1 <= AV9SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Atributo().size() )
         {
            AV10SDTQueryRecordSetAtributoItem = (app.SdtSDTQueryRecordSet_AtributoItem)((app.SdtSDTQueryRecordSet_AtributoItem)AV9SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Atributo().elementAt(-1+AV20GXV1));
            AV6HTML += httpContext.getMessage( "<th>", "") + AV10SDTQueryRecordSetAtributoItem.getgxTv_SdtSDTQueryRecordSet_AtributoItem_Atributods() + httpContext.getMessage( "</th>", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
            AV20GXV1 = (int)(AV20GXV1+1) ;
         }
         AV6HTML += httpContext.getMessage( "</tr>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
         AV21GXV2 = 1 ;
         while ( AV21GXV2 <= AV9SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Registro().size() )
         {
            AV11SDTQueryRecordSetREgsitro = (app.SdtSDTQueryRecordSet_RegistroItem)((app.SdtSDTQueryRecordSet_RegistroItem)AV9SDTQueryRecordSet.getgxTv_SdtSDTQueryRecordSet_Registro().elementAt(-1+AV21GXV2));
            AV6HTML += httpContext.getMessage( "<tr>", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
            AV22GXV3 = 1 ;
            while ( AV22GXV3 <= AV11SDTQueryRecordSetREgsitro.getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo().size() )
            {
               AV14SDTQueryRecordSetRegistroAtribute = (app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem)((app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem)AV11SDTQueryRecordSetREgsitro.getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo().elementAt(-1+AV22GXV3));
               if ( ! (GXutil.strcmp("", AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String())==0) )
               {
                  AV6HTML += httpContext.getMessage( "<td>", "") + AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_String() + httpContext.getMessage( "</td>", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
               }
               else if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor())==0) )
               {
                  AV6HTML += httpContext.getMessage( "<td>", "") + localUtil.format( AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Valor(), "ZZZ,ZZZ,ZZZ,ZZ9.99") + httpContext.getMessage( "</td>", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
               }
               else if ( ! (0==AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero()) )
               {
                  AV6HTML += httpContext.getMessage( "<td>", "") + localUtil.format( DecimalUtil.doubleToDec(AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Numero()), "ZZZ,ZZZ,ZZZ,ZZ9") + httpContext.getMessage( "</td>", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
               }
               else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data())) )
               {
                  AV6HTML += httpContext.getMessage( "<td>", "") + localUtil.format( AV14SDTQueryRecordSetRegistroAtribute.getgxTv_SdtSDTQueryRecordSet_RegistroItem_AtributoItem_Data(), "99/99/9999") + httpContext.getMessage( "</td>", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
               }
               AV22GXV3 = (int)(AV22GXV3+1) ;
            }
            AV6HTML += httpContext.getMessage( "</tr>", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
            AV21GXV2 = (int)(AV21GXV2+1) ;
         }
         AV6HTML += httpContext.getMessage( "</table>", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6HTML", AV6HTML);
         lblTextblock1_Caption = AV6HTML ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Caption", lblTextblock1_Caption, true);
      }
      else
      {
         AV23GXV4 = 1 ;
         while ( AV23GXV4 <= AV15Messages.size() )
         {
            AV17MEssage = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV15Messages.elementAt(-1+AV23GXV4));
            httpContext.GX_msglist.addItem(AV17MEssage.getgxTv_SdtMessages_Message_Description());
            AV23GXV4 = (int)(AV23GXV4+1) ;
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1426S2( )
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
      pa26S2( ) ;
      ws26S2( ) ;
      we26S2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026125191848", true, true);
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
      httpContext.AddJavascriptSource("wptestsql.js", "?2026125191848", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavSqlstring_Internalname = "vSQLSTRING" ;
      edtavRetorno_Internalname = "vRETORNO" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      divTable1_Internalname = "TABLE1" ;
      bttEnter_Internalname = "ENTER" ;
      bttRecordset_Internalname = "RECORDSET" ;
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
      lblTextblock1_Caption = httpContext.getMessage( "Text Block", "") ;
      edtavRetorno_Enabled = 1 ;
      edtavSqlstring_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "wp Testsql", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV9SDTQueryRecordSet',fld:'vSDTQUERYRECORDSET',pic:'',hsh:true},{av:'AV15Messages',fld:'vMESSAGES',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1226S2',iparms:[{av:'AV12sqlstring',fld:'vSQLSTRING',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV8Retorno',fld:'vRETORNO',pic:''}]}");
      setEventMetadata("'RECORDSET'","{handler:'e1326S2',iparms:[{av:'AV12sqlstring',fld:'vSQLSTRING',pic:''},{av:'AV9SDTQueryRecordSet',fld:'vSDTQUERYRECORDSET',pic:'',hsh:true},{av:'AV15Messages',fld:'vMESSAGES',pic:'',hsh:true},{av:'AV6HTML',fld:'vHTML',pic:''}]");
      setEventMetadata("'RECORDSET'",",oparms:[{av:'AV8Retorno',fld:'vRETORNO',pic:''},{av:'AV6HTML',fld:'vHTML',pic:''},{av:'lblTextblock1_Caption',ctrl:'TEXTBLOCK1',prop:'Caption'}]}");
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
      AV9SDTQueryRecordSet = new app.SdtSDTQueryRecordSet(remoteHandle, context);
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXKey = "" ;
      AV6HTML = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV12sqlstring = "" ;
      AV8Retorno = "" ;
      lblTextblock1_Jsonclick = "" ;
      bttEnter_Jsonclick = "" ;
      bttRecordset_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10SDTQueryRecordSetAtributoItem = new app.SdtSDTQueryRecordSet_AtributoItem(remoteHandle, context);
      AV11SDTQueryRecordSetREgsitro = new app.SdtSDTQueryRecordSet_RegistroItem(remoteHandle, context);
      AV14SDTQueryRecordSetRegistroAtribute = new app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem(remoteHandle, context);
      AV17MEssage = new com.genexus.SdtMessages_Message(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavSqlstring_Enabled ;
   private int edtavRetorno_Enabled ;
   private int AV20GXV1 ;
   private int AV21GXV2 ;
   private int AV22GXV3 ;
   private int AV23GXV4 ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String edtavSqlstring_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String edtavRetorno_Internalname ;
   private String divTable1_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Caption ;
   private String lblTextblock1_Jsonclick ;
   private String bttEnter_Internalname ;
   private String bttEnter_Jsonclick ;
   private String bttRecordset_Internalname ;
   private String bttRecordset_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV16isOk ;
   private String AV6HTML ;
   private String AV12sqlstring ;
   private String AV8Retorno ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private com.genexus.SdtMessages_Message AV17MEssage ;
   private app.SdtSDTQueryRecordSet AV9SDTQueryRecordSet ;
   private app.SdtSDTQueryRecordSet_AtributoItem AV10SDTQueryRecordSetAtributoItem ;
   private app.SdtSDTQueryRecordSet_RegistroItem AV11SDTQueryRecordSetREgsitro ;
   private app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem AV14SDTQueryRecordSetRegistroAtribute ;
}

