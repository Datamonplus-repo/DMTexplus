package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_trngeneral_impl extends GXWebComponent
{
   public procesosquimicos_trngeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_trngeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_trngeneral_impl.class ));
   }

   public procesosquimicos_trngeneral_impl( int remoteHandle ,
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
      chkProForAct = UIFactory.getCheckbox(this);
      cmbProRev = new HTMLChoice();
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A764ProForCod", A764ProForCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A764ProForCod});
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
         pa1MA2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Procesos Quimicos_TRNGeneral", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_trngeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod))}, new String[] {"EmprCod","ProForCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA764ProForCod", GXutil.rtrim( wcpOA764ProForCod));
   }

   public void renderHtmlCloseForm1MA2( )
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
      return "FormulacionTinte.ProcesosQuimicos_TRNGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos Quimicos_TRNGeneral", "") ;
   }

   public void wb1MA0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.procesosquimicos_trngeneral");
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Descripcion (Large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProForAct.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkProForAct.getInternalname(), httpContext.getMessage( "Activo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProForAct.getInternalname(), A13133ProForAct, "", httpContext.getMessage( "Activo", ""), 1, chkProForAct.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForTip_Internalname, httpContext.getMessage( "Tip. Proc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForTip_Internalname, GXutil.rtrim( A5523ProForTip), GXutil.rtrim( localUtil.format( A5523ProForTip, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProforrs_cell_Internalname, 1, 0, "px", 0, "px", divProforrs_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProForRs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForRs_Internalname, httpContext.getMessage( "Resina?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForRs_Internalname, GXutil.rtrim( A13936ProForRs), GXutil.rtrim( localUtil.format( A13936ProForRs, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForRs_Visible, edtProForRs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbProRev.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbProRev.getInternalname(), httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProRev, cmbProRev.getInternalname(), GXutil.rtrim( A3005ProRev), 1, cmbProRev.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProRev.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "Temp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForMat_Internalname, GXutil.rtrim( A769ProForMat), GXutil.rtrim( localUtil.format( A769ProForMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProFDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProFDsc_Internalname, httpContext.getMessage( "Proc. Lab.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProFDsc_Internalname, A13740ProFDsc, GXutil.rtrim( localUtil.format( A13740ProFDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProFDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProforabs_cell_Internalname, 1, 0, "px", 0, "px", divProforabs_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProForAbs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForAbs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForAbs_Internalname, httpContext.getMessage( "FAbs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForAbs_Enabled!=0) ? localUtil.format( A8527ProForAbs, "ZZ9.99") : localUtil.format( A8527ProForAbs, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForAbs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForAbs_Visible, edtProForAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProforcos_cell_Internalname, 1, 0, "px", 0, "px", divProforcos_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProForCos_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForCos_Internalname, httpContext.getMessage( "Coste Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForCos_Internalname, GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCos_Enabled!=0) ? localUtil.format( A8528ProForCos, "ZZ9.9999") : localUtil.format( A8528ProForCos, "ZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCos_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForCos_Visible, edtProForCos_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProforvl_cell_Internalname, 1, 0, "px", 0, "px", divProforvl_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProforVl_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProforVl_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProforVl_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProforVl_Internalname, GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProforVl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProforVl_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProforVl_Visible, edtProforVl_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProh2o_cell_Internalname, 1, 0, "px", 0, "px", divProh2o_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProH2O_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProH2O_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProH2O_Internalname, httpContext.getMessage( "Nº Aguas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProH2O_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProH2O_Visible, edtProH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Automatismos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumPro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProNumPro_Internalname, httpContext.getMessage( "Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumPro_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumRec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProNumRec_Internalname, httpContext.getMessage( "Receta Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumRec_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProforpau_cell_Internalname, 1, 0, "px", 0, "px", divProforpau_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtProForPau_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForPau_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtProForPau_Internalname, httpContext.getMessage( "Tiempo Pausa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForPau_Internalname, GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForPau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPau_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForPau_Visible, edtProForPau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ma1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121ma1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForCCi_Internalname, GXutil.rtrim( A4864ProForCCi), GXutil.rtrim( localUtil.format( A4864ProForCCi, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCCi_Jsonclick, 0, "Attribute", "", "", "", "", edtProForCCi_Visible, 0, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForDCi_Internalname, GXutil.rtrim( A4865ProForDCi), GXutil.rtrim( localUtil.format( A4865ProForDCi, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDCi_Jsonclick, 0, "Attribute", "", "", "", "", edtProForDCi_Visible, 0, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForMer_Internalname, GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A3589ProForMer, "ZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMer_Jsonclick, 0, "Attribute", "", "", "", "", edtProForMer_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProForCodV_Internalname, GXutil.rtrim( A920ProForCodV), GXutil.rtrim( localUtil.format( A920ProForCodV, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCodV_Jsonclick, 0, "Attribute", "", "", "", "", edtProForCodV_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodV2_Internalname, GXutil.rtrim( A941EmprCodV2), GXutil.rtrim( localUtil.format( A941EmprCodV2, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodV2_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCodV2_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPorForFul_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPorForFul_Internalname, localUtil.format(A674PorForFul, "99/99/99"), localUtil.format( A674PorForFul, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPorForFul_Jsonclick, 0, "Attribute", "", "", "", "", edtPorForFul_Visible, 0, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPorForFul_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtPorForFul_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_TRNGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1MA2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Procesos Quimicos_TRNGeneral", ""), (short)(0)) ;
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
            strup1MA0( ) ;
         }
      }
   }

   public void ws1MA2( )
   {
      start1MA2( ) ;
      evt1MA2( ) ;
   }

   public void evt1MA2( )
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
                              strup1MA0( ) ;
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
                              strup1MA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131MA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141MA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MA0( ) ;
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
                              strup1MA0( ) ;
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

   public void we1MA2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1MA2( ) ;
         }
      }
   }

   public void pa1MA2( )
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
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13133ProForAct", A13133ProForAct);
      if ( cmbProRev.getItemCount() > 0 )
      {
         A3005ProRev = cmbProRev.getValidValue(A3005ProRev) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3005ProRev", A3005ProRev);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1MA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV18Pgmname = "FormulacionTinte.ProcesosQuimicos_TRNGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf1MA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01MA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A674PorForFul = H01MA2_A674PorForFul[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
            A3589ProForMer = H01MA2_A3589ProForMer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
            A4865ProForDCi = H01MA2_A4865ProForDCi[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4865ProForDCi", A4865ProForDCi);
            A4864ProForCCi = H01MA2_A4864ProForCCi[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4864ProForCCi", A4864ProForCCi);
            A4705ProForPau = H01MA2_A4705ProForPau[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            A2393ProNumRec = H01MA2_A2393ProNumRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            A2392ProNumPro = H01MA2_A2392ProNumPro[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            A10547ProH2O = H01MA2_A10547ProH2O[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            A10120ProforVl = H01MA2_A10120ProforVl[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
            A8528ProForCos = H01MA2_A8528ProForCos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            A8527ProForAbs = H01MA2_A8527ProForAbs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            A4706ProForRb = H01MA2_A4706ProForRb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            A769ProForMat = H01MA2_A769ProForMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769ProForMat", A769ProForMat);
            A772ProForTmx = H01MA2_A772ProForTmx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            A771ProForTie = H01MA2_A771ProForTie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            A3005ProRev = H01MA2_A3005ProRev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3005ProRev", A3005ProRev);
            A13936ProForRs = H01MA2_A13936ProForRs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13936ProForRs", A13936ProForRs);
            A5523ProForTip = H01MA2_A5523ProForTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5523ProForTip", A5523ProForTip);
            A13133ProForAct = H01MA2_A13133ProForAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13133ProForAct", A13133ProForAct);
            A4715ProForDsc2 = H01MA2_A4715ProForDsc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4715ProForDsc2", A4715ProForDsc2);
            A766ProForDsc = H01MA2_A766ProForDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A766ProForDsc", A766ProForDsc);
            A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13740ProFDsc", A13740ProFDsc);
            /* Execute user event: Load */
            e141MA2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1MA0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1MA2( )
   {
   }

   public void before_start_formulas( )
   {
      AV18Pgmname = "FormulacionTinte.ProcesosQuimicos_TRNGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H01MA3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A407EmprNom = H01MA3_A407EmprNom[0] ;
      n407EmprNom = H01MA3_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(1);
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A941EmprCodV2", A941EmprCodV2);
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A920ProForCodV", A920ProForCodV);
      pr_default.close(1);
      fix_multi_value_controls( ) ;
   }

   public void strup1MA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131MA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA764ProForCod = httpContext.cgiGet( sPrefix+"wcpOA764ProForCod") ;
         /* Read variables values. */
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4715ProForDsc2", A4715ProForDsc2);
         A13133ProForAct = ((GXutil.strcmp(httpContext.cgiGet( chkProForAct.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13133ProForAct", A13133ProForAct);
         A5523ProForTip = httpContext.cgiGet( edtProForTip_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5523ProForTip", A5523ProForTip);
         A13936ProForRs = httpContext.cgiGet( edtProForRs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13936ProForRs", A13936ProForRs);
         cmbProRev.setValue( httpContext.cgiGet( cmbProRev.getInternalname()) );
         A3005ProRev = httpContext.cgiGet( cmbProRev.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3005ProRev", A3005ProRev);
         A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A769ProForMat", A769ProForMat);
         A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A13740ProFDsc = httpContext.cgiGet( edtProFDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13740ProFDsc", A13740ProFDsc);
         A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A8528ProForCos = localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
         A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4864ProForCCi = httpContext.cgiGet( edtProForCCi_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4864ProForCCi", A4864ProForCCi);
         A4865ProForDCi = httpContext.cgiGet( edtProForDCi_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4865ProForDCi", A4865ProForDCi);
         A3589ProForMer = localUtil.ctond( httpContext.cgiGet( edtProForMer_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
         A920ProForCodV = httpContext.cgiGet( edtProForCodV_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A920ProForCodV", A920ProForCodV);
         A941EmprCodV2 = GXutil.upper( httpContext.cgiGet( edtEmprCodV2_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A941EmprCodV2", A941EmprCodV2);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A674PorForFul = localUtil.ctod( httpContext.cgiGet( edtPorForFul_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
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
      e131MA2 ();
      if (returnInSub) return;
   }

   public void e131MA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesosquimicos_trngeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesosquimicos_trngeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      procesosquimicos_trngeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      procesosquimicos_trngeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141MA2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtProForCCi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForCCi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCCi_Visible), 5, 0), true);
      edtProForDCi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForDCi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDCi_Visible), 5, 0), true);
      edtProForMer_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForMer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMer_Visible), 5, 0), true);
      edtProForCodV_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForCodV_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCodV_Visible), 5, 0), true);
      edtEmprCodV2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCodV2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodV2_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtPorForFul_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPorForFul_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPorForFul_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LAVAND", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProForPau_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
         divProforpau_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      }
      else
      {
         edtProForPau_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
         divProforpau_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TINTTO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProForAbs_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
         divProforabs_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      }
      else
      {
         edtProForAbs_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
         divProforabs_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TINTTO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProForCos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
         divProforcos_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      }
      else
      {
         edtProForCos_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
         divProforcos_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TEJIDO", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "LAVADO", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProforVl_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
         divProforvl_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      }
      else
      {
         edtProforVl_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
         divProforvl_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "JPF", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProH2O_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
         divProh2o_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      }
      else
      {
         edtProH2O_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
         divProh2o_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "AC2013", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtProForRs_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
         divProforrs_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
      }
      else
      {
         edtProForRs_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
         divProforrs_cell_Class = "col-xs-12 col-sm-2 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV18Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.ProcesosQuimicos_TRN" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A764ProForCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A764ProForCod", A764ProForCod);
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
      pa1MA2( ) ;
      ws1MA2( ) ;
      we1MA2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA764ProForCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1MA2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\procesosquimicos_trngeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1MA2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A764ProForCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A764ProForCod", A764ProForCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA764ProForCod = httpContext.cgiGet( sPrefix+"wcpOA764ProForCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, wcpOA764ProForCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA764ProForCod = A764ProForCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA764ProForCod = httpContext.cgiGet( sPrefix+"A764ProForCod_CTRL") ;
      if ( GXutil.len( sCtrlA764ProForCod) > 0 )
      {
         A764ProForCod = httpContext.cgiGet( sCtrlA764ProForCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A764ProForCod", A764ProForCod);
      }
      else
      {
         A764ProForCod = httpContext.cgiGet( sPrefix+"A764ProForCod_PARM") ;
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
      pa1MA2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1MA2( ) ;
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
      ws1MA2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A764ProForCod_PARM", GXutil.rtrim( A764ProForCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA764ProForCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A764ProForCod_CTRL", GXutil.rtrim( sCtrlA764ProForCod));
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
      we1MA2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692352", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_trngeneral.js", "?20268211692352", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtProForCod_Internalname = sPrefix+"PROFORCOD" ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC" ;
      edtProForDsc2_Internalname = sPrefix+"PROFORDSC2" ;
      chkProForAct.setInternalname( sPrefix+"PROFORACT" );
      edtProForTip_Internalname = sPrefix+"PROFORTIP" ;
      edtProForRs_Internalname = sPrefix+"PROFORRS" ;
      divProforrs_cell_Internalname = sPrefix+"PROFORRS_CELL" ;
      cmbProRev.setInternalname( sPrefix+"PROREV" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtProForTie_Internalname = sPrefix+"PROFORTIE" ;
      edtProForTmx_Internalname = sPrefix+"PROFORTMX" ;
      edtProForMat_Internalname = sPrefix+"PROFORMAT" ;
      edtProForRb_Internalname = sPrefix+"PROFORRB" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtProFDsc_Internalname = sPrefix+"PROFDSC" ;
      edtProForAbs_Internalname = sPrefix+"PROFORABS" ;
      divProforabs_cell_Internalname = sPrefix+"PROFORABS_CELL" ;
      edtProForCos_Internalname = sPrefix+"PROFORCOS" ;
      divProforcos_cell_Internalname = sPrefix+"PROFORCOS_CELL" ;
      edtProforVl_Internalname = sPrefix+"PROFORVL" ;
      divProforvl_cell_Internalname = sPrefix+"PROFORVL_CELL" ;
      edtProH2O_Internalname = sPrefix+"PROH2O" ;
      divProh2o_cell_Internalname = sPrefix+"PROH2O_CELL" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtProNumPro_Internalname = sPrefix+"PRONUMPRO" ;
      edtProNumRec_Internalname = sPrefix+"PRONUMREC" ;
      edtProForPau_Internalname = sPrefix+"PROFORPAU" ;
      divProforpau_cell_Internalname = sPrefix+"PROFORPAU_CELL" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtProForCCi_Internalname = sPrefix+"PROFORCCI" ;
      edtProForDCi_Internalname = sPrefix+"PROFORDCI" ;
      edtProForMer_Internalname = sPrefix+"PROFORMER" ;
      edtProForCodV_Internalname = sPrefix+"PROFORCODV" ;
      edtEmprCodV2_Internalname = sPrefix+"EMPRCODV2" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtPorForFul_Internalname = sPrefix+"PORFORFUL" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
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
      edtPorForFul_Jsonclick = "" ;
      edtPorForFul_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtEmprCodV2_Jsonclick = "" ;
      edtEmprCodV2_Visible = 1 ;
      edtProForCodV_Jsonclick = "" ;
      edtProForCodV_Visible = 1 ;
      edtProForMer_Jsonclick = "" ;
      edtProForMer_Visible = 1 ;
      edtProForDCi_Jsonclick = "" ;
      edtProForDCi_Visible = 1 ;
      edtProForCCi_Jsonclick = "" ;
      edtProForCCi_Visible = 1 ;
      edtProForPau_Jsonclick = "" ;
      edtProForPau_Enabled = 0 ;
      edtProForPau_Visible = 1 ;
      divProforpau_cell_Class = "col-xs-12 col-sm-4" ;
      edtProNumRec_Jsonclick = "" ;
      edtProNumRec_Enabled = 0 ;
      edtProNumPro_Jsonclick = "" ;
      edtProNumPro_Enabled = 0 ;
      edtProH2O_Jsonclick = "" ;
      edtProH2O_Enabled = 0 ;
      edtProH2O_Visible = 1 ;
      divProh2o_cell_Class = "col-xs-12 col-sm-2" ;
      edtProforVl_Jsonclick = "" ;
      edtProforVl_Enabled = 0 ;
      edtProforVl_Visible = 1 ;
      divProforvl_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForCos_Jsonclick = "" ;
      edtProForCos_Enabled = 0 ;
      edtProForCos_Visible = 1 ;
      divProforcos_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForAbs_Jsonclick = "" ;
      edtProForAbs_Enabled = 0 ;
      edtProForAbs_Visible = 1 ;
      divProforabs_cell_Class = "col-xs-12 col-sm-3" ;
      edtProFDsc_Jsonclick = "" ;
      edtProFDsc_Enabled = 0 ;
      edtProForRb_Jsonclick = "" ;
      edtProForRb_Enabled = 0 ;
      edtProForMat_Jsonclick = "" ;
      edtProForMat_Enabled = 0 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 0 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 0 ;
      cmbProRev.setJsonclick( "" );
      cmbProRev.setEnabled( 0 );
      edtProForRs_Jsonclick = "" ;
      edtProForRs_Enabled = 0 ;
      edtProForRs_Visible = 1 ;
      divProforrs_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForTip_Jsonclick = "" ;
      edtProForTip_Enabled = 0 ;
      chkProForAct.setEnabled( 0 );
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 0 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 0 ;
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
      chkProForAct.setName( "PROFORACT" );
      chkProForAct.setWebtags( "" );
      chkProForAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), true);
      chkProForAct.setCheckedValue( "N" );
      cmbProRev.setName( "PROREV" );
      cmbProRev.setWebtags( "" );
      cmbProRev.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbProRev.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbProRev.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111MA1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121MA1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORDSC","{handler:'valid_Profordsc',iparms:[]");
      setEventMetadata("VALID_PROFORDSC",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA764ProForCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A13133ProForAct = "" ;
      A5523ProForTip = "" ;
      A13936ProForRs = "" ;
      A3005ProRev = "" ;
      A769ProForMat = "" ;
      A13740ProFDsc = "" ;
      A8527ProForAbs = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A4864ProForCCi = "" ;
      A4865ProForDCi = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A920ProForCodV = "" ;
      A941EmprCodV2 = "" ;
      A407EmprNom = "" ;
      A674PorForFul = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      H01MA2_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      H01MA2_A407EmprNom = new String[] {""} ;
      H01MA2_n407EmprNom = new boolean[] {false} ;
      H01MA2_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MA2_A4865ProForDCi = new String[] {""} ;
      H01MA2_A4864ProForCCi = new String[] {""} ;
      H01MA2_A4705ProForPau = new short[1] ;
      H01MA2_A2393ProNumRec = new int[1] ;
      H01MA2_A2392ProNumPro = new int[1] ;
      H01MA2_A10547ProH2O = new short[1] ;
      H01MA2_A10120ProforVl = new int[1] ;
      H01MA2_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MA2_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MA2_A4706ProForRb = new short[1] ;
      H01MA2_A769ProForMat = new String[] {""} ;
      H01MA2_A772ProForTmx = new short[1] ;
      H01MA2_A771ProForTie = new short[1] ;
      H01MA2_A3005ProRev = new String[] {""} ;
      H01MA2_A13936ProForRs = new String[] {""} ;
      H01MA2_A5523ProForTip = new String[] {""} ;
      H01MA2_A13133ProForAct = new String[] {""} ;
      H01MA2_A4715ProForDsc2 = new String[] {""} ;
      H01MA2_A396EmprCod = new String[] {""} ;
      H01MA2_A764ProForCod = new String[] {""} ;
      H01MA2_A766ProForDsc = new String[] {""} ;
      H01MA3_A407EmprNom = new String[] {""} ;
      H01MA3_n407EmprNom = new boolean[] {false} ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      AV15Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV16Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV17Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trngeneral__default(),
         new Object[] {
             new Object[] {
            H01MA2_A674PorForFul, H01MA2_A407EmprNom, H01MA2_n407EmprNom, H01MA2_A3589ProForMer, H01MA2_A4865ProForDCi, H01MA2_A4864ProForCCi, H01MA2_A4705ProForPau, H01MA2_A2393ProNumRec, H01MA2_A2392ProNumPro, H01MA2_A10547ProH2O,
            H01MA2_A10120ProforVl, H01MA2_A8528ProForCos, H01MA2_A8527ProForAbs, H01MA2_A4706ProForRb, H01MA2_A769ProForMat, H01MA2_A772ProForTmx, H01MA2_A771ProForTie, H01MA2_A3005ProRev, H01MA2_A13936ProForRs, H01MA2_A5523ProForTip,
            H01MA2_A13133ProForAct, H01MA2_A4715ProForDsc2, H01MA2_A396EmprCod, H01MA2_A764ProForCod, H01MA2_A766ProForDsc
            }
            , new Object[] {
            H01MA3_A407EmprNom, H01MA3_n407EmprNom
            }
         }
      );
      AV18Pgmname = "FormulacionTinte.ProcesosQuimicos_TRNGeneral" ;
      /* GeneXus formulas. */
      AV18Pgmname = "FormulacionTinte.ProcesosQuimicos_TRNGeneral" ;
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
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A10547ProH2O ;
   private short A4705ProForPau ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForTip_Enabled ;
   private int edtProForRs_Visible ;
   private int edtProForRs_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtProForRb_Enabled ;
   private int edtProFDsc_Enabled ;
   private int edtProForAbs_Visible ;
   private int edtProForAbs_Enabled ;
   private int edtProForCos_Visible ;
   private int edtProForCos_Enabled ;
   private int edtProforVl_Visible ;
   private int A10120ProforVl ;
   private int edtProforVl_Enabled ;
   private int edtProH2O_Visible ;
   private int edtProH2O_Enabled ;
   private int A2392ProNumPro ;
   private int edtProNumPro_Enabled ;
   private int A2393ProNumRec ;
   private int edtProNumRec_Enabled ;
   private int edtProForPau_Visible ;
   private int edtProForPau_Enabled ;
   private int edtProForCCi_Visible ;
   private int edtProForDCi_Visible ;
   private int edtProForMer_Visible ;
   private int edtProForCodV_Visible ;
   private int edtEmprCodV2_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtPorForFul_Visible ;
   private int idxLst ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A3589ProForMer ;
   private String wcpOA396EmprCod ;
   private String wcpOA764ProForCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String A13133ProForAct ;
   private String edtProForTip_Internalname ;
   private String A5523ProForTip ;
   private String edtProForTip_Jsonclick ;
   private String divProforrs_cell_Internalname ;
   private String divProforrs_cell_Class ;
   private String edtProForRs_Internalname ;
   private String A13936ProForRs ;
   private String edtProForRs_Jsonclick ;
   private String A3005ProRev ;
   private String divUnnamedtable2_Internalname ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Internalname ;
   private String A769ProForMat ;
   private String edtProForMat_Jsonclick ;
   private String edtProForRb_Internalname ;
   private String edtProForRb_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtProFDsc_Internalname ;
   private String edtProFDsc_Jsonclick ;
   private String divProforabs_cell_Internalname ;
   private String divProforabs_cell_Class ;
   private String edtProForAbs_Internalname ;
   private String edtProForAbs_Jsonclick ;
   private String divProforcos_cell_Internalname ;
   private String divProforcos_cell_Class ;
   private String edtProForCos_Internalname ;
   private String edtProForCos_Jsonclick ;
   private String divProforvl_cell_Internalname ;
   private String divProforvl_cell_Class ;
   private String edtProforVl_Internalname ;
   private String edtProforVl_Jsonclick ;
   private String divProh2o_cell_Internalname ;
   private String divProh2o_cell_Class ;
   private String edtProH2O_Internalname ;
   private String edtProH2O_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtProNumPro_Internalname ;
   private String edtProNumPro_Jsonclick ;
   private String edtProNumRec_Internalname ;
   private String edtProNumRec_Jsonclick ;
   private String divProforpau_cell_Internalname ;
   private String divProforpau_cell_Class ;
   private String edtProForPau_Internalname ;
   private String edtProForPau_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtProForCCi_Internalname ;
   private String A4864ProForCCi ;
   private String edtProForCCi_Jsonclick ;
   private String edtProForDCi_Internalname ;
   private String A4865ProForDCi ;
   private String edtProForDCi_Jsonclick ;
   private String edtProForMer_Internalname ;
   private String edtProForMer_Jsonclick ;
   private String edtProForCodV_Internalname ;
   private String A920ProForCodV ;
   private String edtProForCodV_Jsonclick ;
   private String edtEmprCodV2_Internalname ;
   private String A941EmprCodV2 ;
   private String edtEmprCodV2_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPorForFul_Internalname ;
   private String edtPorForFul_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA764ProForCod ;
   private java.util.Date A674PorForFul ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13740ProFDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private ICheckbox chkProForAct ;
   private HTMLChoice cmbProRev ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01MA2_A674PorForFul ;
   private String[] H01MA2_A407EmprNom ;
   private boolean[] H01MA2_n407EmprNom ;
   private java.math.BigDecimal[] H01MA2_A3589ProForMer ;
   private String[] H01MA2_A4865ProForDCi ;
   private String[] H01MA2_A4864ProForCCi ;
   private short[] H01MA2_A4705ProForPau ;
   private int[] H01MA2_A2393ProNumRec ;
   private int[] H01MA2_A2392ProNumPro ;
   private short[] H01MA2_A10547ProH2O ;
   private int[] H01MA2_A10120ProforVl ;
   private java.math.BigDecimal[] H01MA2_A8528ProForCos ;
   private java.math.BigDecimal[] H01MA2_A8527ProForAbs ;
   private short[] H01MA2_A4706ProForRb ;
   private String[] H01MA2_A769ProForMat ;
   private short[] H01MA2_A772ProForTmx ;
   private short[] H01MA2_A771ProForTie ;
   private String[] H01MA2_A3005ProRev ;
   private String[] H01MA2_A13936ProForRs ;
   private String[] H01MA2_A5523ProForTip ;
   private String[] H01MA2_A13133ProForAct ;
   private String[] H01MA2_A4715ProForDsc2 ;
   private String[] H01MA2_A396EmprCod ;
   private String[] H01MA2_A764ProForCod ;
   private String[] H01MA2_A766ProForDsc ;
   private String[] H01MA3_A407EmprNom ;
   private boolean[] H01MA3_n407EmprNom ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class procesosquimicos_trngeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01MA2", "SELECT T1.PorForFul, T2.EmprNom, T1.ProForMer, T1.ProForDCi, T1.ProForCCi, T1.ProForPau, T1.ProNumRec, T1.ProNumPro, T1.ProH2O, T1.ProforVl, T1.ProForCos, T1.ProForAbs, T1.ProForRb, T1.ProForMat, T1.ProForTmx, T1.ProForTie, T1.ProRev, T1.ProForRs, T1.ProForTip, T1.ProForAct, T1.ProForDsc2, T1.EmprCod, T1.ProForCod, T1.ProForDsc FROM (TXPCPROFO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01MA3", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 40);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((String[]) buf[23])[0] = rslt.getString(23, 6);
               ((String[]) buf[24])[0] = rslt.getString(24, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

