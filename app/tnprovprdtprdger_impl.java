package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnprovprdtprdger_impl extends GXWebComponent
{
   public tnprovprdtprdger_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnprovprdtprdger_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnprovprdtprdger_impl.class ));
   }

   public tnprovprdtprdger_impl( int remoteHandle ,
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
      chkPrdSalM = UIFactory.getCheckbox(this);
      chkPrdPesCon = UIFactory.getCheckbox(this);
      chkPrdSal = UIFactory.getCheckbox(this);
      cmbPrdOkotex = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A719PrdNum});
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
         pa1VB2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Tn PROVPRDTPRDGER", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnprovprdtprdger", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"EmprCod","PrdNum"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TnPROVPRDTPRDGER");
      forbiddenHiddens.add("PrdUniCom", localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9"));
      forbiddenHiddens.add("PrdUniCon", localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9"));
      forbiddenHiddens.add("ValCod", localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"));
      forbiddenHiddens.add("MetCod", localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"));
      forbiddenHiddens.add("TipPrdCod", localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tnprovprdtprdger:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA719PrdNum", GXutil.rtrim( wcpOA719PrdNum));
   }

   public void renderHtmlCloseForm1VB2( )
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
      return "TnPROVPRDTPRDGER" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tn PROVPRDTPRDGER", "") ;
   }

   public void wb1VB0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tnprovprdtprdger");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtEmprNom_Link, "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDscTec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDscTec_Internalname, httpContext.getMessage( "Descripcion Tecnica", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDscTec_Internalname, GXutil.rtrim( A703PrdDscTec), GXutil.rtrim( localUtil.format( A703PrdDscTec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDscTec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDscTec_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniCom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUniCom_Internalname, httpContext.getMessage( "Unidad de Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9") : localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUniCom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUcpDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUcpDsc_Internalname, httpContext.getMessage( "Descripcion Unidad de Compra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcpDsc_Internalname, GXutil.rtrim( A737PrdUcpDsc), GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPrdUcpDsc_Link, "", "", "", edtPrdUcpDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUcpDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniCon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUniCon_Internalname, httpContext.getMessage( "Unidad de Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCon_Internalname, GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUniCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUcoDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUcoDsc_Internalname, httpContext.getMessage( "Descripcion Unidad Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcoDsc_Internalname, GXutil.rtrim( A736PrdUcoDsc), GXutil.rtrim( localUtil.format( A736PrdUcoDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtPrdUcoDsc_Link, "", "", "", edtPrdUcoDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUcoDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRefPrv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRefPrv_Internalname, httpContext.getMessage( "Referencia Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRefPrv_Internalname, GXutil.rtrim( A728PrdRefPrv), GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRefPrv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRefPrv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpCodSus_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmpCodSus_Internalname, httpContext.getMessage( "Empresa Producto Sustituto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmpCodSus_Internalname, GXutil.rtrim( A394EmpCodSus), GXutil.rtrim( localUtil.format( A394EmpCodSus, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpCodSus_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmpCodSus_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSus_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdSus_Internalname, httpContext.getMessage( "Producto Sustituto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSus_Internalname, GXutil.rtrim( A734PrdSus), GXutil.rtrim( localUtil.format( A734PrdSus, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSus_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdSus_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSusNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdSusNom_Internalname, httpContext.getMessage( "PrdSusNom", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSusNom_Internalname, GXutil.rtrim( A735PrdSusNom), GXutil.rtrim( localUtil.format( A735PrdSusNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSusNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdSusNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValCod_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValDsc_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValDsc_Internalname, GXutil.rtrim( A857ValDsc), GXutil.rtrim( localUtil.format( A857ValDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtValDsc_Link, "", "", "", edtValDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRec_Internalname, httpContext.getMessage( "Control en Recuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRec_Internalname, GXutil.rtrim( A727PrdRec), GXutil.rtrim( localUtil.format( A727PrdRec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCalNec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCalNec_Internalname, httpContext.getMessage( "Calculo Necesidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCalNec_Internalname, GXutil.rtrim( A682PrdCalNec), GXutil.rtrim( localUtil.format( A682PrdCalNec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCalNec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCalNec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDetPar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDetPar_Internalname, httpContext.getMessage( "Detalle Partidas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDetPar_Internalname, GXutil.rtrim( A698PrdDetPar), GXutil.rtrim( localUtil.format( A698PrdDetPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDetPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDetPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdSit_Internalname, httpContext.getMessage( "Situacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSit_Internalname, GXutil.ltrim( localUtil.ntoc( A730PrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9") : localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdSit_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRotRea_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRotRea_Internalname, httpContext.getMessage( "Rotacion Real", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRotRea_Internalname, GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdRotRea_Enabled!=0) ? localUtil.format( A729PrdRotRea, "ZZZZZ9.999") : localUtil.format( A729PrdRotRea, "ZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRotRea_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRotRea_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipDtoCod_Internalname, httpContext.getMessage( "Tipo Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoDto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipDtoDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDto_Internalname, GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoDto_Enabled!=0) ? localUtil.format( A837TipDtoDto, "Z9.99") : localUtil.format( A837TipDtoDto, "Z9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipDtoDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFecPre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFecPre_Internalname, httpContext.getMessage( "Fecha Ultimo Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecPre_Internalname, localUtil.format(A709PrdFecPre, "99/99/99"), localUtil.format( A709PrdFecPre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAnt_Internalname, httpContext.getMessage( "Precio Anterior", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAnt_Enabled!=0) ? localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") : localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreMed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreMed_Internalname, httpContext.getMessage( "Precio Medio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConDia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConDia_Internalname, httpContext.getMessage( "Unidades Consumo por Dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConDia_Internalname, GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConDia_Enabled!=0) ? localUtil.format( A696PrdConDia, "ZZZ9.99") : localUtil.format( A696PrdConDia, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConDia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConDia_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinD_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinD_Internalname, httpContext.getMessage( "Stock Minimo en Dias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinD_Internalname, GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdStkMinD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinU_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinU_Internalname, httpContext.getMessage( "Unidades Stock Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinU_Internalname, GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinU_Enabled!=0) ? localUtil.format( A732PrdStkMinU, "ZZZZ9.99") : localUtil.format( A732PrdStkMinU, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdStkMinU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDiaRot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDiaRot_Internalname, httpContext.getMessage( "Dias de Rotacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDiaRot_Internalname, GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDiaRot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDiaRot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDiaRot_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPlaEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPlaEnt_Internalname, httpContext.getMessage( "Plazo Entrega Segurid.en Dias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPlaEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMetCod_Internalname, httpContext.getMessage( "Codigo Metodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMetCod_Internalname, GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMetDsc_Internalname, httpContext.getMessage( "Descripcion Metodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMetDsc_Internalname, GXutil.rtrim( A630MetDsc), GXutil.rtrim( localUtil.format( A630MetDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtMetDsc_Link, "", "", "", edtMetDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLotMin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdLotMin_Internalname, httpContext.getMessage( "Lote Minimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLotMin_Internalname, GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdLotMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLotMin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdLotMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumUco_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumUco_Internalname, httpContext.getMessage( "Unidades por Contenedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumUco_Internalname, GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumUco_Enabled!=0) ? localUtil.format( A721PrdNumUco, "ZZZ9.99") : localUtil.format( A721PrdNumUco, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumUco_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumUco_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiCC_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanRes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCanRes_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cantidad Pendiente Recibir", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFulEnt_Internalname, httpContext.getMessage( "Fecha Ultima Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulEnt_Internalname, localUtil.format(A713PrdFulEnt, "99/99/99"), localUtil.format( A713PrdFulEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulPed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFulPed_Internalname, httpContext.getMessage( "Fecha Ultimo Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFulPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulPed_Internalname, localUtil.format(A714PrdFulPed, "99/99/99"), localUtil.format( A714PrdFulPed, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulPed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFulPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFulPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFulCC_Internalname, httpContext.getMessage( "Fecha Ultima Entrega a C.Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFulCC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulCC_Internalname, localUtil.format(A712PrdFulCC, "99/99/99"), localUtil.format( A712PrdFulCC, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFulCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFulCC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulCC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCCP_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiCCP_Internalname, httpContext.getMessage( "Probabilidad existencia en CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCCP_Internalname, GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCCP_Enabled!=0) ? localUtil.format( A706PrdExiCCP, "ZZZZ9.99") : localUtil.format( A706PrdExiCCP, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCCP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiCCP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltECC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUltECC_Internalname, httpContext.getMessage( "Ultima Cantidad Entregada a CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltECC_Internalname, GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltECC_Enabled!=0) ? localUtil.format( A740PrdUltECC, "ZZZZ9.99") : localUtil.format( A740PrdUltECC, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltECC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUltECC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltCCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUltCCC_Internalname, httpContext.getMessage( "Ultimo No.Contenedores Ent.CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltCCC_Internalname, GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltCCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltCCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUltCCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltDCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUltDCC_Internalname, httpContext.getMessage( "Ultima Diferencia en CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltDCC_Internalname, GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltDCC_Enabled!=0) ? localUtil.format( A739PrdUltDCC, "ZZZZ9.99") : localUtil.format( A739PrdUltDCC, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltDCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUltDCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDifCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDifCC_Internalname, httpContext.getMessage( "Diferencia Acumulada en CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDifCC_Internalname, GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDifCC_Enabled!=0) ? localUtil.format( A700PrdDifCC, "ZZZZ9.99") : localUtil.format( A700PrdDifCC, "ZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDifCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDifCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConCC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConCC_Internalname, httpContext.getMessage( "Contenedores Acumulados en CC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConCC_Internalname, GXutil.ltrim( localUtil.ntoc( A695PrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConCC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdValStk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdValStk_Internalname, httpContext.getMessage( "Valor Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValStk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDifValStk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDifValStk_Internalname, httpContext.getMessage( "orden ascendente valor stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDifValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A332DifValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDifValStk_Enabled!=0) ? localUtil.format( A332DifValStk, "ZZZZZZZ9.99") : localUtil.format( A332DifValStk, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDifValStk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDifValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFecEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFecEnt_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecEnt_Internalname, localUtil.format(A708PrdFecEnt, "99/99/99"), localUtil.format( A708PrdFecEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosX_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPosX_Internalname, httpContext.getMessage( "Estante / Pratelera", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosX_Internalname, GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosX_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPosX_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosY_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPosY_Internalname, httpContext.getMessage( "Posición en el Estante/Pratel.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosY_Internalname, GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosY_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosY_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPosY_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdTip_Internalname, httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTip_Internalname, GXutil.rtrim( A1643PrdTip), GXutil.rtrim( localUtil.format( A1643PrdTip, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDqo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDqo_Internalname, httpContext.getMessage( "Demanda Quimica Oxigeno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDqo_Internalname, GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDqo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDqo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDqo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRev_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRev_Internalname, httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRev_Internalname, GXutil.rtrim( A3004PrdRev), GXutil.rtrim( localUtil.format( A3004PrdRev, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRev_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTnq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdTnq_Internalname, httpContext.getMessage( "Tanque", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNom2_Internalname, httpContext.getMessage( "Nombre Producto 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom2_Internalname, GXutil.rtrim( A4692PrdNom2), GXutil.rtrim( localUtil.format( A4692PrdNom2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNum2_Internalname, httpContext.getMessage( "Codigo Producto Auxiliar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum2_Internalname, GXutil.rtrim( A4693PrdNum2), GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPrdObs_Internalname, A4694PrdObs, "", "", (short)(0), 1, edtPrdObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUMeFo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdUMeFo_Internalname, httpContext.getMessage( "Unid.Medida Prod. en Formula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUMeFo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdUMeFo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAc2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPreAc2_Internalname, httpContext.getMessage( "Precio Actual_2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAc2_Enabled!=0) ? localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999") : localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPreAc2_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDensS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdDensS_Internalname, httpContext.getMessage( "Densidad Sal Muera (g/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDensS_Internalname, GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDensS_Enabled!=0) ? localUtil.format( A5416PrdDensS, "ZZ9.999") : localUtil.format( A5416PrdDensS, "ZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDensS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdDensS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConcS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConcS_Internalname, httpContext.getMessage( "Conentracion Sal Muera (g/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConcS_Internalname, GXutil.ltrim( localUtil.ntoc( A5417PrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConcS_Enabled!=0) ? localUtil.format( A5417PrdConcS, "ZZ9.999") : localUtil.format( A5417PrdConcS, "ZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConcS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConcS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSalM.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdSalM.getInternalname(), httpContext.getMessage( "Sal Muera (S/N)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSalM.getInternalname(), A5418PrdSalM, "", httpContext.getMessage( "Sal Muera (S/N)", ""), 1, chkPrdSalM.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSolub_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdSolub_Internalname, httpContext.getMessage( "Solubilidad del producto(gr/l)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSolub_Internalname, GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSolub_Enabled!=0) ? localUtil.format( A5590PrdSolub, "ZZZ9.99") : localUtil.format( A5590PrdSolub, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSolub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdSolub_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipPrdCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipPrdCod_Internalname, httpContext.getMessage( "Tipo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipPrdCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipPrdCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPrdCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipPrdCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipPrdDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipPrdDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipPrdDsc_Internalname, GXutil.rtrim( A6302TipPrdDsc), GXutil.rtrim( localUtil.format( A6302TipPrdDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", edtTipPrdDsc_Link, "", "", "", edtTipPrdDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipPrdDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumCent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumCent_Internalname, httpContext.getMessage( "PrdNumCentra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumCent_Internalname, GXutil.rtrim( A6191PrdNumCent), GXutil.rtrim( localUtil.format( A6191PrdNumCent, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumCent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumCent_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumct1_Internalname, httpContext.getMessage( "Cte %", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct1_Internalname, GXutil.ltrim( localUtil.ntoc( A7226PrdNumct1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct1_Enabled!=0) ? localUtil.format( A7226PrdNumct1, "ZZ9.99") : localUtil.format( A7226PrdNumct1, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumct1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNumct2_Internalname, httpContext.getMessage( "Cte 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct2_Internalname, GXutil.ltrim( localUtil.ntoc( A7227PrdNumct2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct2_Enabled!=0) ? localUtil.format( A7227PrdNumct2, "ZZ9.99") : localUtil.format( A7227PrdNumct2, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNumct2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHorMad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdHorMad_Internalname, httpContext.getMessage( "Horas Maduracion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHorMad_Internalname, GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdHorMad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHorMad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdHorMad_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlmc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlmc_Internalname, httpContext.getMessage( "Existencias Almacen en Consgin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlmc_Internalname, GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlmc_Enabled!=0) ? localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999") : localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlmc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlmc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdPesCon.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdPesCon.getInternalname(), httpContext.getMessage( "Controlar Pesaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdPesCon.getInternalname(), GXutil.str( A8896PrdPesCon, 1, 0), "", httpContext.getMessage( "Controlar Pesaje", ""), 1, chkPrdPesCon.getEnabled(), "1", httpContext.getMessage( "Controlar", ""), StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPesTerm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdPesTerm_Internalname, httpContext.getMessage( "Estación de Pesaje", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPesTerm_Internalname, GXutil.rtrim( A8897PrdPesTerm), GXutil.rtrim( localUtil.format( A8897PrdPesTerm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPesTerm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdPesTerm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSal.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrdSal.getInternalname(), httpContext.getMessage( "Sal Comun", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSal.getInternalname(), A8936PrdSal, "", httpContext.getMessage( "Sal Comun", ""), 1, chkPrdSal.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSubFamCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSubFamCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSubFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9609SubFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSubFamCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSubFamCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSubFamCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSubFamDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSubFamDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSubFamDsc_Internalname, GXutil.rtrim( A9610SubFamDsc), GXutil.rtrim( localUtil.format( A9610SubFamDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSubFamDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSubFamDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdInc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdInc_Internalname, httpContext.getMessage( "Incidencia (ISO)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdInc_Internalname, GXutil.rtrim( A9731PrdInc), GXutil.rtrim( localUtil.format( A9731PrdInc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdInc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdInc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdComp_Internalname, httpContext.getMessage( "Compejidad (ISO)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComp_Internalname, GXutil.rtrim( A9732PrdComp), GXutil.rtrim( localUtil.format( A9732PrdComp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdComp_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdAox_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdAox_Internalname, httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAox_Internalname, GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAox_Enabled!=0) ? localUtil.format( A9733PrdAox, "ZZ9.99") : localUtil.format( A9733PrdAox, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAox_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdAox_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNCAS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNCAS_Internalname, httpContext.getMessage( "Ubicacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNCAS_Internalname, GXutil.rtrim( A9734PrdNCAS), GXutil.rtrim( localUtil.format( A9734PrdNCAS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNCAS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNCAS_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFT_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFT_Internalname, httpContext.getMessage( "Ficha Tecnica?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFT_Internalname, GXutil.rtrim( A9739PrdFT), GXutil.rtrim( localUtil.format( A9739PrdFT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFFT_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFFT_Internalname, httpContext.getMessage( "Fecha Ficha Tecnica", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFFT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFFT_Internalname, localUtil.format(A9740PrdFFT, "99/99/99"), localUtil.format( A9740PrdFFT, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFFT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFFT_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFFT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFFT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdHS_Internalname, httpContext.getMessage( "Hoja Seguridad?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHS_Internalname, GXutil.rtrim( A9741PrdHS), GXutil.rtrim( localUtil.format( A9741PrdHS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdHS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFHS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFHS_Internalname, httpContext.getMessage( "Fecha Hoja Seguridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtPrdFHS_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFHS_Internalname, localUtil.format(A9742PrdFHS, "99/99/99"), localUtil.format( A9742PrdFHS, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFHS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFHS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtPrdFHS_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFHS_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TnPROVPRDTPRDGER.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdReach_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdReach_Internalname, httpContext.getMessage( "REACH", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdReach_Internalname, GXutil.rtrim( A5887PrdReach), GXutil.rtrim( localUtil.format( A5887PrdReach, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdReach_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdReach_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdOkotex.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdOkotex.getInternalname(), httpContext.getMessage( "OEKO-TEX", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdOkotex, cmbPrdOkotex.getInternalname(), GXutil.rtrim( A5888PrdOkotex), 1, cmbPrdOkotex.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdOkotex.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TnPROVPRDTPRDGER.htm");
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdColIdx_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdColIdx_Internalname, httpContext.getMessage( "Color Index", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdColIdx_Internalname, GXutil.rtrim( A10119PrdColIdx), GXutil.rtrim( localUtil.format( A10119PrdColIdx, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdColIdx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdColIdx_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote), GXutil.rtrim( localUtil.format( A10881PrdLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRTM_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdRTM_Internalname, httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRTM_Internalname, GXutil.rtrim( A10935PrdRTM), GXutil.rtrim( localUtil.format( A10935PrdRTM, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRTM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdRTM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw1_Internalname, httpContext.getMessage( "Formaldeido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1), GXutil.rtrim( localUtil.format( A10936PrdCtw1, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw2_Internalname, httpContext.getMessage( "Airlaminas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2), GXutil.rtrim( localUtil.format( A10937PrdCtw2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw3_Internalname, httpContext.getMessage( "Apeo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3), GXutil.rtrim( localUtil.format( A10938PrdCtw3, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw4_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdCtw4_Internalname, httpContext.getMessage( "PFC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4), GXutil.rtrim( localUtil.format( A11663PrdCtw4, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCtw4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNroCAS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNroCAS_Internalname, httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNroCAS_Internalname, GXutil.rtrim( A11196PrdNroCAS), GXutil.rtrim( localUtil.format( A11196PrdNroCAS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNroCAS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNroCAS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdGots_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdGots_Internalname, httpContext.getMessage( "GOTS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots), GXutil.rtrim( localUtil.format( A11363PrdGots, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdGots_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdGots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdHm_Internalname, httpContext.getMessage( "H&M", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHm_Internalname, GXutil.rtrim( A11364PrdHm), GXutil.rtrim( localUtil.format( A11364PrdHm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdHm_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConct_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdConct_Internalname, httpContext.getMessage( "Concentracion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConct_Internalname, GXutil.ltrim( localUtil.ntoc( A11470PrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConct_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdConct_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdEINECS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdEINECS_Internalname, httpContext.getMessage( "N EINECS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdEINECS_Internalname, GXutil.rtrim( A11614PrdEINECS), GXutil.rtrim( localUtil.format( A11614PrdEINECS, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdEINECS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdEINECS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFuncion_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdFuncion_Internalname, httpContext.getMessage( "Funcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFuncion_Internalname, GXutil.rtrim( A11615PrdFuncion), GXutil.rtrim( localUtil.format( A11615PrdFuncion, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFuncion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdFuncion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNmQu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNmQu_Internalname, httpContext.getMessage( "Nombre Substancia Quimica", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPrdNmQu_Internalname, A11616PrdNmQu, "", "", (short)(0), 1, edtPrdNmQu_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdList.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrdList.getInternalname(), httpContext.getMessage( "List by Inditex ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdList, cmbPrdList.getInternalname(), GXutil.rtrim( A11687PrdList), 1, cmbPrdList.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdList.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TnPROVPRDTPRDGER.htm");
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 544,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 5, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUPDATE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 546,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODELETE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TnPROVPRDTPRDGER.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRDTPRDGER.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1VB2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Tn PROVPRDTPRDGER", ""), (short)(0)) ;
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
            strup1VB0( ) ;
         }
      }
   }

   public void ws1VB2( )
   {
      start1VB2( ) ;
      evt1VB2( ) ;
   }

   public void evt1VB2( )
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
                              strup1VB0( ) ;
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
                              strup1VB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111VB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1VB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121VB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUPDATE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1VB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUpdate' */
                                 e131VB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODELETE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1VB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDelete' */
                                 e141VB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1VB0( ) ;
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
                              strup1VB0( ) ;
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

   public void we1VB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1VB2( ) ;
         }
      }
   }

   public void pa1VB2( )
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
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      A8936PrdSal = ((GXutil.strcmp(GXutil.rtrim( A8936PrdSal), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
      }
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1VB2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "TnPROVPRDTPRDGER" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1VB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01VB3 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A703PrdDscTec = H01VB3_A703PrdDscTec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A703PrdDscTec", A703PrdDscTec);
            A718PrdNom = H01VB3_A718PrdNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", A718PrdNom);
            A735PrdSusNom = H01VB3_A735PrdSusNom[0] ;
            n735PrdSusNom = H01VB3_n735PrdSusNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A735PrdSusNom", A735PrdSusNom);
            A11687PrdList = H01VB3_A11687PrdList[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
            A11616PrdNmQu = H01VB3_A11616PrdNmQu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11616PrdNmQu", A11616PrdNmQu);
            A11615PrdFuncion = H01VB3_A11615PrdFuncion[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11615PrdFuncion", A11615PrdFuncion);
            A11614PrdEINECS = H01VB3_A11614PrdEINECS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11614PrdEINECS", A11614PrdEINECS);
            A11470PrdConct = H01VB3_A11470PrdConct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
            A11364PrdHm = H01VB3_A11364PrdHm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11364PrdHm", A11364PrdHm);
            A11363PrdGots = H01VB3_A11363PrdGots[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11363PrdGots", A11363PrdGots);
            A11196PrdNroCAS = H01VB3_A11196PrdNroCAS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11196PrdNroCAS", A11196PrdNroCAS);
            A11663PrdCtw4 = H01VB3_A11663PrdCtw4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11663PrdCtw4", A11663PrdCtw4);
            A10938PrdCtw3 = H01VB3_A10938PrdCtw3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10938PrdCtw3", A10938PrdCtw3);
            A10937PrdCtw2 = H01VB3_A10937PrdCtw2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10937PrdCtw2", A10937PrdCtw2);
            A10936PrdCtw1 = H01VB3_A10936PrdCtw1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10936PrdCtw1", A10936PrdCtw1);
            A10935PrdRTM = H01VB3_A10935PrdRTM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10935PrdRTM", A10935PrdRTM);
            A10881PrdLote = H01VB3_A10881PrdLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10881PrdLote", A10881PrdLote);
            A10119PrdColIdx = H01VB3_A10119PrdColIdx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10119PrdColIdx", A10119PrdColIdx);
            A5888PrdOkotex = H01VB3_A5888PrdOkotex[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
            A5887PrdReach = H01VB3_A5887PrdReach[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5887PrdReach", A5887PrdReach);
            A9742PrdFHS = H01VB3_A9742PrdFHS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
            A9741PrdHS = H01VB3_A9741PrdHS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9741PrdHS", A9741PrdHS);
            A9740PrdFFT = H01VB3_A9740PrdFFT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
            A9739PrdFT = H01VB3_A9739PrdFT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9739PrdFT", A9739PrdFT);
            A9734PrdNCAS = H01VB3_A9734PrdNCAS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9734PrdNCAS", A9734PrdNCAS);
            A9733PrdAox = H01VB3_A9733PrdAox[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
            A9732PrdComp = H01VB3_A9732PrdComp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9732PrdComp", A9732PrdComp);
            A9731PrdInc = H01VB3_A9731PrdInc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9731PrdInc", A9731PrdInc);
            A9610SubFamDsc = H01VB3_A9610SubFamDsc[0] ;
            n9610SubFamDsc = H01VB3_n9610SubFamDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9610SubFamDsc", A9610SubFamDsc);
            A9609SubFamCod = H01VB3_A9609SubFamCod[0] ;
            n9609SubFamCod = H01VB3_n9609SubFamCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
            A8936PrdSal = H01VB3_A8936PrdSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
            A8897PrdPesTerm = H01VB3_A8897PrdPesTerm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8897PrdPesTerm", A8897PrdPesTerm);
            A8896PrdPesCon = H01VB3_A8896PrdPesCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
            A8659PrdExiAlmc = H01VB3_A8659PrdExiAlmc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
            A7260PrdHorMad = H01VB3_A7260PrdHorMad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
            A7227PrdNumct2 = H01VB3_A7227PrdNumct2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
            A7226PrdNumct1 = H01VB3_A7226PrdNumct1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
            A6191PrdNumCent = H01VB3_A6191PrdNumCent[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6191PrdNumCent", A6191PrdNumCent);
            A6302TipPrdDsc = H01VB3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01VB3_n6302TipPrdDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6302TipPrdDsc", A6302TipPrdDsc);
            A6301TipPrdCod = H01VB3_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H01VB3_n6301TipPrdCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
            A5590PrdSolub = H01VB3_A5590PrdSolub[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
            A5418PrdSalM = H01VB3_A5418PrdSalM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
            A5417PrdConcS = H01VB3_A5417PrdConcS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
            A5416PrdDensS = H01VB3_A5416PrdDensS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
            A5255PrdPreAc2 = H01VB3_A5255PrdPreAc2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
            A4338PrdUMeFo = H01VB3_A4338PrdUMeFo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
            A4694PrdObs = H01VB3_A4694PrdObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4694PrdObs", A4694PrdObs);
            A4693PrdNum2 = H01VB3_A4693PrdNum2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4693PrdNum2", A4693PrdNum2);
            A4692PrdNom2 = H01VB3_A4692PrdNom2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4692PrdNom2", A4692PrdNom2);
            A3273PrdTnq = H01VB3_A3273PrdTnq[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
            A3004PrdRev = H01VB3_A3004PrdRev[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3004PrdRev", A3004PrdRev);
            A1644PrdDqo = H01VB3_A1644PrdDqo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
            A1643PrdTip = H01VB3_A1643PrdTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1643PrdTip", A1643PrdTip);
            A1194PrdPosY = H01VB3_A1194PrdPosY[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
            A1193PrdPosX = H01VB3_A1193PrdPosX[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
            A708PrdFecEnt = H01VB3_A708PrdFecEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
            A332DifValStk = H01VB3_A332DifValStk[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
            A750PrdValStk = H01VB3_A750PrdValStk[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            A695PrdConCC = H01VB3_A695PrdConCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
            A700PrdDifCC = H01VB3_A700PrdDifCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
            A739PrdUltDCC = H01VB3_A739PrdUltDCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
            A738PrdUltCCC = H01VB3_A738PrdUltCCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
            A740PrdUltECC = H01VB3_A740PrdUltECC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
            A706PrdExiCCP = H01VB3_A706PrdExiCCP[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
            A712PrdFulCC = H01VB3_A712PrdFulCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
            A714PrdFulPed = H01VB3_A714PrdFulPed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
            A713PrdFulEnt = H01VB3_A713PrdFulEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
            A684PrdCanPen = H01VB3_A684PrdCanPen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            A685PrdCanRes = H01VB3_A685PrdCanRes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
            A705PrdExiCC = H01VB3_A705PrdExiCC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            A704PrdExiAlm = H01VB3_A704PrdExiAlm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            A721PrdNumUco = H01VB3_A721PrdNumUco[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
            A716PrdLotMin = H01VB3_A716PrdLotMin[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
            A630MetDsc = H01VB3_A630MetDsc[0] ;
            n630MetDsc = H01VB3_n630MetDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A630MetDsc", A630MetDsc);
            A629MetCod = H01VB3_A629MetCod[0] ;
            n629MetCod = H01VB3_n629MetCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
            A722PrdPlaEnt = H01VB3_A722PrdPlaEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
            A699PrdDiaRot = H01VB3_A699PrdDiaRot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
            A732PrdStkMinU = H01VB3_A732PrdStkMinU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
            A731PrdStkMinD = H01VB3_A731PrdStkMinD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
            A696PrdConDia = H01VB3_A696PrdConDia[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
            A726PrdPreMed = H01VB3_A726PrdPreMed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            A725PrdPreAnt = H01VB3_A725PrdPreAnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
            A709PrdFecPre = H01VB3_A709PrdFecPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
            A724PrdPreAct = H01VB3_A724PrdPreAct[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
            A837TipDtoDto = H01VB3_A837TipDtoDto[0] ;
            n837TipDtoDto = H01VB3_n837TipDtoDto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
            A835TipDtoCod = H01VB3_A835TipDtoCod[0] ;
            n835TipDtoCod = H01VB3_n835TipDtoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
            A729PrdRotRea = H01VB3_A729PrdRotRea[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
            A730PrdSit = H01VB3_A730PrdSit[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
            A698PrdDetPar = H01VB3_A698PrdDetPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698PrdDetPar", A698PrdDetPar);
            A682PrdCalNec = H01VB3_A682PrdCalNec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A682PrdCalNec", A682PrdCalNec);
            A727PrdRec = H01VB3_A727PrdRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", A727PrdRec);
            A857ValDsc = H01VB3_A857ValDsc[0] ;
            n857ValDsc = H01VB3_n857ValDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A857ValDsc", A857ValDsc);
            A856ValCod = H01VB3_A856ValCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
            A734PrdSus = H01VB3_A734PrdSus[0] ;
            n734PrdSus = H01VB3_n734PrdSus[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A734PrdSus", A734PrdSus);
            A728PrdRefPrv = H01VB3_A728PrdRefPrv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A728PrdRefPrv", A728PrdRefPrv);
            A794PrvNom = H01VB3_A794PrvNom[0] ;
            n794PrvNom = H01VB3_n794PrvNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794PrvNom", A794PrvNom);
            A795PrvNum = H01VB3_A795PrvNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A707PrdFacCon = H01VB3_A707PrdFacCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
            A736PrdUcoDsc = H01VB3_A736PrdUcoDsc[0] ;
            n736PrdUcoDsc = H01VB3_n736PrdUcoDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A736PrdUcoDsc", A736PrdUcoDsc);
            A743PrdUniCon = H01VB3_A743PrdUniCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
            A737PrdUcpDsc = H01VB3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01VB3_n737PrdUcpDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A737PrdUcpDsc", A737PrdUcpDsc);
            A742PrdUniCom = H01VB3_A742PrdUniCom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
            A630MetDsc = H01VB3_A630MetDsc[0] ;
            n630MetDsc = H01VB3_n630MetDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A630MetDsc", A630MetDsc);
            A794PrvNom = H01VB3_A794PrvNom[0] ;
            n794PrvNom = H01VB3_n794PrvNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794PrvNom", A794PrvNom);
            A837TipDtoDto = H01VB3_A837TipDtoDto[0] ;
            n837TipDtoDto = H01VB3_n837TipDtoDto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
            A737PrdUcpDsc = H01VB3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01VB3_n737PrdUcpDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A737PrdUcpDsc", A737PrdUcpDsc);
            A736PrdUcoDsc = H01VB3_A736PrdUcoDsc[0] ;
            n736PrdUcoDsc = H01VB3_n736PrdUcoDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A736PrdUcoDsc", A736PrdUcoDsc);
            A857ValDsc = H01VB3_A857ValDsc[0] ;
            n857ValDsc = H01VB3_n857ValDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A857ValDsc", A857ValDsc);
            A6302TipPrdDsc = H01VB3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01VB3_n6302TipPrdDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6302TipPrdDsc", A6302TipPrdDsc);
            A9610SubFamDsc = H01VB3_A9610SubFamDsc[0] ;
            n9610SubFamDsc = H01VB3_n9610SubFamDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9610SubFamDsc", A9610SubFamDsc);
            A735PrdSusNom = H01VB3_A735PrdSusNom[0] ;
            n735PrdSusNom = H01VB3_n735PrdSusNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A735PrdSusNom", A735PrdSusNom);
            /* Execute user event: Load */
            e121VB2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1VB0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1VB2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "TnPROVPRDTPRDGER" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01VB5 */
      pr_default.execute(1);
      if ( (pr_default.getStatus(1) != 101) )
      {
         A735PrdSusNom = H01VB5_A735PrdSusNom[0] ;
         n735PrdSusNom = H01VB5_n735PrdSusNom[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A735PrdSusNom", A735PrdSusNom);
      }
      else
      {
         A735PrdSusNom = "" ;
         n735PrdSusNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A735PrdSusNom", A735PrdSusNom);
      }
      pr_default.close(1);
      /* Using cursor H01VB6 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      A407EmprNom = H01VB6_A407EmprNom[0] ;
      n407EmprNom = H01VB6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A394EmpCodSus = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A394EmpCodSus", A394EmpCodSus);
      pr_default.close(1);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strup1VB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111VB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA719PrdNum = httpContext.cgiGet( sPrefix+"wcpOA719PrdNum") ;
         /* Read variables values. */
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = httpContext.cgiGet( edtPrdDscTec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A703PrdDscTec", A703PrdDscTec);
         A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
         n737PrdUcpDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A737PrdUcpDsc", A737PrdUcpDsc);
         A743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A736PrdUcoDsc = httpContext.cgiGet( edtPrdUcoDsc_Internalname) ;
         n736PrdUcoDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A736PrdUcoDsc", A736PrdUcoDsc);
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794PrvNom", A794PrvNom);
         A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A728PrdRefPrv", A728PrdRefPrv);
         A394EmpCodSus = GXutil.upper( httpContext.cgiGet( edtEmpCodSus_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A394EmpCodSus", A394EmpCodSus);
         A734PrdSus = httpContext.cgiGet( edtPrdSus_Internalname) ;
         n734PrdSus = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A734PrdSus", A734PrdSus);
         A735PrdSusNom = httpContext.cgiGet( edtPrdSusNom_Internalname) ;
         n735PrdSusNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A735PrdSusNom", A735PrdSusNom);
         A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A857ValDsc", A857ValDsc);
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = httpContext.cgiGet( edtPrdCalNec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = httpContext.cgiGet( edtPrdDetPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A698PrdDetPar", A698PrdDetPar);
         A730PrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
         n837TipDtoDto = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( edtPrdFecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         A629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n629MetCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         A630MetDsc = httpContext.cgiGet( edtMetDsc_Internalname) ;
         n630MetDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A630MetDsc", A630MetDsc);
         A716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = localUtil.ctod( httpContext.cgiGet( edtPrdFulPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A712PrdFulCC = localUtil.ctod( httpContext.cgiGet( edtPrdFulCC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A740PrdUltECC = localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A700PrdDifCC = localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A695PrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A332DifValStk = localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         A708PrdFecEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         A1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         A1643PrdTip = GXutil.upper( httpContext.cgiGet( edtPrdTip_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1643PrdTip", A1643PrdTip);
         A1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         A3004PrdRev = GXutil.upper( httpContext.cgiGet( edtPrdRev_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3004PrdRev", A3004PrdRev);
         A3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A4692PrdNom2 = httpContext.cgiGet( edtPrdNom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4692PrdNom2", A4692PrdNom2);
         A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4693PrdNum2", A4693PrdNum2);
         A4694PrdObs = httpContext.cgiGet( edtPrdObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4694PrdObs", A4694PrdObs);
         A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A5416PrdDensS = localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         A5417PrdConcS = localUtil.ctond( httpContext.cgiGet( edtPrdConcS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         A5418PrdSalM = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSalM.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5418PrdSalM", A5418PrdSalM);
         A5590PrdSolub = localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A6301TipPrdCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6301TipPrdCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
         n6302TipPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6302TipPrdDsc", A6302TipPrdDsc);
         A6191PrdNumCent = httpContext.cgiGet( edtPrdNumCent_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6191PrdNumCent", A6191PrdNumCent);
         A7226PrdNumct1 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct1_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         A7227PrdNumct2 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct2_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         A8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A8896PrdPesCon = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = httpContext.cgiGet( edtPrdPesTerm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A8936PrdSal = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSal.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8936PrdSal", A8936PrdSal);
         A9609SubFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtSubFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9609SubFamCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         A9610SubFamDsc = httpContext.cgiGet( edtSubFamDsc_Internalname) ;
         n9610SubFamDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9610SubFamDsc", A9610SubFamDsc);
         A9731PrdInc = httpContext.cgiGet( edtPrdInc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9731PrdInc", A9731PrdInc);
         A9732PrdComp = httpContext.cgiGet( edtPrdComp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9732PrdComp", A9732PrdComp);
         A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         A9734PrdNCAS = httpContext.cgiGet( edtPrdNCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9734PrdNCAS", A9734PrdNCAS);
         A9739PrdFT = httpContext.cgiGet( edtPrdFT_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9739PrdFT", A9739PrdFT);
         A9740PrdFFT = localUtil.ctod( httpContext.cgiGet( edtPrdFFT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9741PrdHS", A9741PrdHS);
         A9742PrdFHS = localUtil.ctod( httpContext.cgiGet( edtPrdFHS_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         A5887PrdReach = httpContext.cgiGet( edtPrdReach_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5887PrdReach", A5887PrdReach);
         cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
         A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5888PrdOkotex", A5888PrdOkotex);
         A10119PrdColIdx = httpContext.cgiGet( edtPrdColIdx_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10119PrdColIdx", A10119PrdColIdx);
         A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10881PrdLote", A10881PrdLote);
         A10935PrdRTM = httpContext.cgiGet( edtPrdRTM_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10935PrdRTM", A10935PrdRTM);
         A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10936PrdCtw1", A10936PrdCtw1);
         A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10937PrdCtw2", A10937PrdCtw2);
         A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10938PrdCtw3", A10938PrdCtw3);
         A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11663PrdCtw4", A11663PrdCtw4);
         A11196PrdNroCAS = httpContext.cgiGet( edtPrdNroCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11196PrdNroCAS", A11196PrdNroCAS);
         A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11363PrdGots", A11363PrdGots);
         A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11364PrdHm", A11364PrdHm);
         A11470PrdConct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11614PrdEINECS", A11614PrdEINECS);
         A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11615PrdFuncion", A11615PrdFuncion);
         A11616PrdNmQu = httpContext.cgiGet( edtPrdNmQu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11616PrdNmQu", A11616PrdNmQu);
         cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
         A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11687PrdList", A11687PrdList);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TnPROVPRDTPRDGER");
         A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         forbiddenHiddens.add("PrdUniCom", localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9"));
         A743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         forbiddenHiddens.add("PrdUniCon", localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9"));
         A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         forbiddenHiddens.add("ValCod", localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"));
         A629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n629MetCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         forbiddenHiddens.add("MetCod", localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"));
         A6301TipPrdCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6301TipPrdCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         forbiddenHiddens.add("TipPrdCod", localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9"));
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tnprovprdtprdger:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e111VB2 ();
      if (returnInSub) return;
   }

   public void e111VB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnprovprdtprdger_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnprovprdtprdger_impl.this.AV15Emprcod = GXv_char2[0] ;
      tnprovprdtprdger_impl.this.AV16Emprnom = GXv_char3[0] ;
      tnprovprdtprdger_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e121VB2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprNom_Link = formatLink("app.tempparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Link", edtEmprNom_Link, true);
      edtPrdUcpDsc_Link = formatLink("app.stocksquimicos.ttipuniview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A742PrdUniCom,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","UniCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUcpDsc_Internalname, "Link", edtPrdUcpDsc_Link, true);
      edtPrdUcoDsc_Link = formatLink("app.stocksquimicos.ttipuniview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A743PrdUniCon,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","UniCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUcoDsc_Internalname, "Link", edtPrdUcoDsc_Link, true);
      edtValDsc_Link = formatLink("app.stocksquimicos.ttipvalview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A856ValCod,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","ValCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtValDsc_Internalname, "Link", edtValDsc_Link, true);
      edtMetDsc_Link = formatLink("app.stocksquimicos.tmetpedview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A629MetCod,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MetCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetDsc_Internalname, "Link", edtMetDsc_Link, true);
      edtTipPrdDsc_Link = formatLink("app.stocksquimicos.ttipprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6301TipPrdCod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipPrdCod","TabCode"})  ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipPrdDsc_Internalname, "Link", edtTipPrdDsc_Link, true);
   }

   public void e131VB2( )
   {
      /* 'DoUpdate' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tprdger", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e141VB2( )
   {
      /* 'DoDelete' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tprdger", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPRDGER" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A719PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
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
      pa1VB2( ) ;
      ws1VB2( ) ;
      we1VB2( ) ;
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
      sCtrlA719PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1VB2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tnprovprdtprdger", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1VB2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A719PrdNum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA719PrdNum = httpContext.cgiGet( sPrefix+"wcpOA719PrdNum") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, wcpOA719PrdNum) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA719PrdNum = A719PrdNum ;
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
      sCtrlA719PrdNum = httpContext.cgiGet( sPrefix+"A719PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlA719PrdNum) > 0 )
      {
         A719PrdNum = httpContext.cgiGet( sCtrlA719PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = httpContext.cgiGet( sPrefix+"A719PrdNum_PARM") ;
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
      pa1VB2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1VB2( ) ;
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
      ws1VB2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A719PrdNum_PARM", GXutil.rtrim( A719PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlA719PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A719PrdNum_CTRL", GXutil.rtrim( sCtrlA719PrdNum));
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
      we1VB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556027", true, true);
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
      httpContext.AddJavascriptSource("tnprovprdtprdger.js", "?20268211556028", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrdDscTec_Internalname = sPrefix+"PRDDSCTEC" ;
      edtPrdUniCom_Internalname = sPrefix+"PRDUNICOM" ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC" ;
      edtPrdUniCon_Internalname = sPrefix+"PRDUNICON" ;
      edtPrdUcoDsc_Internalname = sPrefix+"PRDUCODSC" ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV" ;
      edtEmpCodSus_Internalname = sPrefix+"EMPCODSUS" ;
      edtPrdSus_Internalname = sPrefix+"PRDSUS" ;
      edtPrdSusNom_Internalname = sPrefix+"PRDSUSNOM" ;
      edtValCod_Internalname = sPrefix+"VALCOD" ;
      edtValDsc_Internalname = sPrefix+"VALDSC" ;
      edtPrdRec_Internalname = sPrefix+"PRDREC" ;
      edtPrdCalNec_Internalname = sPrefix+"PRDCALNEC" ;
      edtPrdDetPar_Internalname = sPrefix+"PRDDETPAR" ;
      edtPrdSit_Internalname = sPrefix+"PRDSIT" ;
      edtPrdRotRea_Internalname = sPrefix+"PRDROTREA" ;
      edtTipDtoCod_Internalname = sPrefix+"TIPDTOCOD" ;
      edtTipDtoDto_Internalname = sPrefix+"TIPDTODTO" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtPrdFecPre_Internalname = sPrefix+"PRDFECPRE" ;
      edtPrdPreAnt_Internalname = sPrefix+"PRDPREANT" ;
      edtPrdPreMed_Internalname = sPrefix+"PRDPREMED" ;
      edtPrdConDia_Internalname = sPrefix+"PRDCONDIA" ;
      edtPrdStkMinD_Internalname = sPrefix+"PRDSTKMIND" ;
      edtPrdStkMinU_Internalname = sPrefix+"PRDSTKMINU" ;
      edtPrdDiaRot_Internalname = sPrefix+"PRDDIAROT" ;
      edtPrdPlaEnt_Internalname = sPrefix+"PRDPLAENT" ;
      edtMetCod_Internalname = sPrefix+"METCOD" ;
      edtMetDsc_Internalname = sPrefix+"METDSC" ;
      edtPrdLotMin_Internalname = sPrefix+"PRDLOTMIN" ;
      edtPrdNumUco_Internalname = sPrefix+"PRDNUMUCO" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN" ;
      edtPrdFulEnt_Internalname = sPrefix+"PRDFULENT" ;
      edtPrdFulPed_Internalname = sPrefix+"PRDFULPED" ;
      edtPrdFulCC_Internalname = sPrefix+"PRDFULCC" ;
      edtPrdExiCCP_Internalname = sPrefix+"PRDEXICCP" ;
      edtPrdUltECC_Internalname = sPrefix+"PRDULTECC" ;
      edtPrdUltCCC_Internalname = sPrefix+"PRDULTCCC" ;
      edtPrdUltDCC_Internalname = sPrefix+"PRDULTDCC" ;
      edtPrdDifCC_Internalname = sPrefix+"PRDDIFCC" ;
      edtPrdConCC_Internalname = sPrefix+"PRDCONCC" ;
      edtPrdValStk_Internalname = sPrefix+"PRDVALSTK" ;
      edtDifValStk_Internalname = sPrefix+"DIFVALSTK" ;
      edtPrdFecEnt_Internalname = sPrefix+"PRDFECENT" ;
      edtPrdPosX_Internalname = sPrefix+"PRDPOSX" ;
      edtPrdPosY_Internalname = sPrefix+"PRDPOSY" ;
      edtPrdTip_Internalname = sPrefix+"PRDTIP" ;
      edtPrdDqo_Internalname = sPrefix+"PRDDQO" ;
      edtPrdRev_Internalname = sPrefix+"PRDREV" ;
      edtPrdTnq_Internalname = sPrefix+"PRDTNQ" ;
      edtPrdNom2_Internalname = sPrefix+"PRDNOM2" ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2" ;
      edtPrdObs_Internalname = sPrefix+"PRDOBS" ;
      edtPrdUMeFo_Internalname = sPrefix+"PRDUMEFO" ;
      edtPrdPreAc2_Internalname = sPrefix+"PRDPREAC2" ;
      edtPrdDensS_Internalname = sPrefix+"PRDDENSS" ;
      edtPrdConcS_Internalname = sPrefix+"PRDCONCS" ;
      chkPrdSalM.setInternalname( sPrefix+"PRDSALM" );
      edtPrdSolub_Internalname = sPrefix+"PRDSOLUB" ;
      edtTipPrdCod_Internalname = sPrefix+"TIPPRDCOD" ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC" ;
      edtPrdNumCent_Internalname = sPrefix+"PRDNUMCENT" ;
      edtPrdNumct1_Internalname = sPrefix+"PRDNUMCT1" ;
      edtPrdNumct2_Internalname = sPrefix+"PRDNUMCT2" ;
      edtPrdHorMad_Internalname = sPrefix+"PRDHORMAD" ;
      edtPrdExiAlmc_Internalname = sPrefix+"PRDEXIALMC" ;
      chkPrdPesCon.setInternalname( sPrefix+"PRDPESCON" );
      edtPrdPesTerm_Internalname = sPrefix+"PRDPESTERM" ;
      chkPrdSal.setInternalname( sPrefix+"PRDSAL" );
      edtSubFamCod_Internalname = sPrefix+"SUBFAMCOD" ;
      edtSubFamDsc_Internalname = sPrefix+"SUBFAMDSC" ;
      edtPrdInc_Internalname = sPrefix+"PRDINC" ;
      edtPrdComp_Internalname = sPrefix+"PRDCOMP" ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX" ;
      edtPrdNCAS_Internalname = sPrefix+"PRDNCAS" ;
      edtPrdFT_Internalname = sPrefix+"PRDFT" ;
      edtPrdFFT_Internalname = sPrefix+"PRDFFT" ;
      edtPrdHS_Internalname = sPrefix+"PRDHS" ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS" ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH" ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX" );
      edtPrdColIdx_Internalname = sPrefix+"PRDCOLIDX" ;
      edtPrdLote_Internalname = sPrefix+"PRDLOTE" ;
      edtPrdRTM_Internalname = sPrefix+"PRDRTM" ;
      edtPrdCtw1_Internalname = sPrefix+"PRDCTW1" ;
      edtPrdCtw2_Internalname = sPrefix+"PRDCTW2" ;
      edtPrdCtw3_Internalname = sPrefix+"PRDCTW3" ;
      edtPrdCtw4_Internalname = sPrefix+"PRDCTW4" ;
      edtPrdNroCAS_Internalname = sPrefix+"PRDNROCAS" ;
      edtPrdGots_Internalname = sPrefix+"PRDGOTS" ;
      edtPrdHm_Internalname = sPrefix+"PRDHM" ;
      edtPrdConct_Internalname = sPrefix+"PRDCONCT" ;
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS" ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION" ;
      edtPrdNmQu_Internalname = sPrefix+"PRDNMQU" ;
      cmbPrdList.setInternalname( sPrefix+"PRDLIST" );
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
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
      cmbPrdList.setJsonclick( "" );
      cmbPrdList.setEnabled( 0 );
      edtPrdNmQu_Enabled = 0 ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdFuncion_Enabled = 0 ;
      edtPrdEINECS_Jsonclick = "" ;
      edtPrdEINECS_Enabled = 0 ;
      edtPrdConct_Jsonclick = "" ;
      edtPrdConct_Enabled = 0 ;
      edtPrdHm_Jsonclick = "" ;
      edtPrdHm_Enabled = 0 ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdGots_Enabled = 0 ;
      edtPrdNroCAS_Jsonclick = "" ;
      edtPrdNroCAS_Enabled = 0 ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw4_Enabled = 0 ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw3_Enabled = 0 ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw2_Enabled = 0 ;
      edtPrdCtw1_Jsonclick = "" ;
      edtPrdCtw1_Enabled = 0 ;
      edtPrdRTM_Jsonclick = "" ;
      edtPrdRTM_Enabled = 0 ;
      edtPrdLote_Jsonclick = "" ;
      edtPrdLote_Enabled = 0 ;
      edtPrdColIdx_Jsonclick = "" ;
      edtPrdColIdx_Enabled = 0 ;
      cmbPrdOkotex.setJsonclick( "" );
      cmbPrdOkotex.setEnabled( 0 );
      edtPrdReach_Jsonclick = "" ;
      edtPrdReach_Enabled = 0 ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdFHS_Enabled = 0 ;
      edtPrdHS_Jsonclick = "" ;
      edtPrdHS_Enabled = 0 ;
      edtPrdFFT_Jsonclick = "" ;
      edtPrdFFT_Enabled = 0 ;
      edtPrdFT_Jsonclick = "" ;
      edtPrdFT_Enabled = 0 ;
      edtPrdNCAS_Jsonclick = "" ;
      edtPrdNCAS_Enabled = 0 ;
      edtPrdAox_Jsonclick = "" ;
      edtPrdAox_Enabled = 0 ;
      edtPrdComp_Jsonclick = "" ;
      edtPrdComp_Enabled = 0 ;
      edtPrdInc_Jsonclick = "" ;
      edtPrdInc_Enabled = 0 ;
      edtSubFamDsc_Jsonclick = "" ;
      edtSubFamDsc_Enabled = 0 ;
      edtSubFamCod_Jsonclick = "" ;
      edtSubFamCod_Enabled = 0 ;
      chkPrdSal.setEnabled( 0 );
      edtPrdPesTerm_Jsonclick = "" ;
      edtPrdPesTerm_Enabled = 0 ;
      chkPrdPesCon.setEnabled( 0 );
      edtPrdExiAlmc_Jsonclick = "" ;
      edtPrdExiAlmc_Enabled = 0 ;
      edtPrdHorMad_Jsonclick = "" ;
      edtPrdHorMad_Enabled = 0 ;
      edtPrdNumct2_Jsonclick = "" ;
      edtPrdNumct2_Enabled = 0 ;
      edtPrdNumct1_Jsonclick = "" ;
      edtPrdNumct1_Enabled = 0 ;
      edtPrdNumCent_Jsonclick = "" ;
      edtPrdNumCent_Enabled = 0 ;
      edtTipPrdDsc_Jsonclick = "" ;
      edtTipPrdDsc_Link = "" ;
      edtTipPrdDsc_Enabled = 0 ;
      edtTipPrdCod_Jsonclick = "" ;
      edtTipPrdCod_Enabled = 0 ;
      edtPrdSolub_Jsonclick = "" ;
      edtPrdSolub_Enabled = 0 ;
      chkPrdSalM.setEnabled( 0 );
      edtPrdConcS_Jsonclick = "" ;
      edtPrdConcS_Enabled = 0 ;
      edtPrdDensS_Jsonclick = "" ;
      edtPrdDensS_Enabled = 0 ;
      edtPrdPreAc2_Jsonclick = "" ;
      edtPrdPreAc2_Enabled = 0 ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtPrdUMeFo_Enabled = 0 ;
      edtPrdObs_Enabled = 0 ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdNum2_Enabled = 0 ;
      edtPrdNom2_Jsonclick = "" ;
      edtPrdNom2_Enabled = 0 ;
      edtPrdTnq_Jsonclick = "" ;
      edtPrdTnq_Enabled = 0 ;
      edtPrdRev_Jsonclick = "" ;
      edtPrdRev_Enabled = 0 ;
      edtPrdDqo_Jsonclick = "" ;
      edtPrdDqo_Enabled = 0 ;
      edtPrdTip_Jsonclick = "" ;
      edtPrdTip_Enabled = 0 ;
      edtPrdPosY_Jsonclick = "" ;
      edtPrdPosY_Enabled = 0 ;
      edtPrdPosX_Jsonclick = "" ;
      edtPrdPosX_Enabled = 0 ;
      edtPrdFecEnt_Jsonclick = "" ;
      edtPrdFecEnt_Enabled = 0 ;
      edtDifValStk_Jsonclick = "" ;
      edtDifValStk_Enabled = 0 ;
      edtPrdValStk_Jsonclick = "" ;
      edtPrdValStk_Enabled = 0 ;
      edtPrdConCC_Jsonclick = "" ;
      edtPrdConCC_Enabled = 0 ;
      edtPrdDifCC_Jsonclick = "" ;
      edtPrdDifCC_Enabled = 0 ;
      edtPrdUltDCC_Jsonclick = "" ;
      edtPrdUltDCC_Enabled = 0 ;
      edtPrdUltCCC_Jsonclick = "" ;
      edtPrdUltCCC_Enabled = 0 ;
      edtPrdUltECC_Jsonclick = "" ;
      edtPrdUltECC_Enabled = 0 ;
      edtPrdExiCCP_Jsonclick = "" ;
      edtPrdExiCCP_Enabled = 0 ;
      edtPrdFulCC_Jsonclick = "" ;
      edtPrdFulCC_Enabled = 0 ;
      edtPrdFulPed_Jsonclick = "" ;
      edtPrdFulPed_Enabled = 0 ;
      edtPrdFulEnt_Jsonclick = "" ;
      edtPrdFulEnt_Enabled = 0 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 0 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdNumUco_Jsonclick = "" ;
      edtPrdNumUco_Enabled = 0 ;
      edtPrdLotMin_Jsonclick = "" ;
      edtPrdLotMin_Enabled = 0 ;
      edtMetDsc_Jsonclick = "" ;
      edtMetDsc_Link = "" ;
      edtMetDsc_Enabled = 0 ;
      edtMetCod_Jsonclick = "" ;
      edtMetCod_Enabled = 0 ;
      edtPrdPlaEnt_Jsonclick = "" ;
      edtPrdPlaEnt_Enabled = 0 ;
      edtPrdDiaRot_Jsonclick = "" ;
      edtPrdDiaRot_Enabled = 0 ;
      edtPrdStkMinU_Jsonclick = "" ;
      edtPrdStkMinU_Enabled = 0 ;
      edtPrdStkMinD_Jsonclick = "" ;
      edtPrdStkMinD_Enabled = 0 ;
      edtPrdConDia_Jsonclick = "" ;
      edtPrdConDia_Enabled = 0 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Enabled = 0 ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdPreAnt_Enabled = 0 ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdFecPre_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtTipDtoDto_Jsonclick = "" ;
      edtTipDtoDto_Enabled = 0 ;
      edtTipDtoCod_Jsonclick = "" ;
      edtTipDtoCod_Enabled = 0 ;
      edtPrdRotRea_Jsonclick = "" ;
      edtPrdRotRea_Enabled = 0 ;
      edtPrdSit_Jsonclick = "" ;
      edtPrdSit_Enabled = 0 ;
      edtPrdDetPar_Jsonclick = "" ;
      edtPrdDetPar_Enabled = 0 ;
      edtPrdCalNec_Jsonclick = "" ;
      edtPrdCalNec_Enabled = 0 ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdRec_Enabled = 0 ;
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Link = "" ;
      edtValDsc_Enabled = 0 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Enabled = 0 ;
      edtPrdSusNom_Jsonclick = "" ;
      edtPrdSusNom_Enabled = 0 ;
      edtPrdSus_Jsonclick = "" ;
      edtPrdSus_Enabled = 0 ;
      edtEmpCodSus_Jsonclick = "" ;
      edtEmpCodSus_Enabled = 0 ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdRefPrv_Enabled = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 0 ;
      edtPrdUcoDsc_Jsonclick = "" ;
      edtPrdUcoDsc_Link = "" ;
      edtPrdUcoDsc_Enabled = 0 ;
      edtPrdUniCon_Jsonclick = "" ;
      edtPrdUniCon_Enabled = 0 ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUcpDsc_Link = "" ;
      edtPrdUcpDsc_Enabled = 0 ;
      edtPrdUniCom_Jsonclick = "" ;
      edtPrdUniCom_Enabled = 0 ;
      edtPrdDscTec_Jsonclick = "" ;
      edtPrdDscTec_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Link = "" ;
      edtEmprNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
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
      chkPrdSalM.setName( "PRDSALM" );
      chkPrdSalM.setWebtags( "" );
      chkPrdSalM.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdSalM.getInternalname(), "TitleCaption", chkPrdSalM.getCaption(), true);
      chkPrdSalM.setCheckedValue( "N" );
      chkPrdPesCon.setName( "PRDPESCON" );
      chkPrdPesCon.setWebtags( "" );
      chkPrdPesCon.setCaption( httpContext.getMessage( "Controlar", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdPesCon.getInternalname(), "TitleCaption", chkPrdPesCon.getCaption(), true);
      chkPrdPesCon.setCheckedValue( "0" );
      chkPrdSal.setName( "PRDSAL" );
      chkPrdSal.setWebtags( "" );
      chkPrdSal.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrdSal.getInternalname(), "TitleCaption", chkPrdSal.getCaption(), true);
      chkPrdSal.setCheckedValue( "N" );
      cmbPrdOkotex.setName( "PRDOKOTEX" );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
      }
      cmbPrdList.setName( "PRDLIST" );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A629MetCod',fld:'METCOD',pic:'9'},{av:'A6301TipPrdCod',fld:'TIPPRDCOD',pic:'ZZZ9'},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e131VB2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'DOUPDATE'",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DODELETE'","{handler:'e141VB2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'DODELETE'",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDUNICOM","{handler:'valid_Prdunicom',iparms:[]");
      setEventMetadata("VALID_PRDUNICOM",",oparms:[]}");
      setEventMetadata("VALID_PRDUNICON","{handler:'valid_Prdunicon',iparms:[]");
      setEventMetadata("VALID_PRDUNICON",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[]");
      setEventMetadata("VALID_VALCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDTOCOD","{handler:'valid_Tipdtocod',iparms:[]");
      setEventMetadata("VALID_TIPDTOCOD",",oparms:[]}");
      setEventMetadata("VALID_METCOD","{handler:'valid_Metcod',iparms:[]");
      setEventMetadata("VALID_METCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDCOD","{handler:'valid_Tipprdcod',iparms:[]");
      setEventMetadata("VALID_TIPPRDCOD",",oparms:[]}");
      setEventMetadata("VALID_SUBFAMCOD","{handler:'valid_Subfamcod',iparms:[]");
      setEventMetadata("VALID_SUBFAMCOD",",oparms:[]}");
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
      wcpOA719PrdNum = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Pgmname = "" ;
      GX_FocusControl = "" ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A703PrdDscTec = "" ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A728PrdRefPrv = "" ;
      A394EmpCodSus = "" ;
      A734PrdSus = "" ;
      A735PrdSusNom = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A682PrdCalNec = "" ;
      A698PrdDetPar = "" ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A630MetDsc = "" ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      A712PrdFulCC = GXutil.nullDate() ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      A708PrdFecEnt = GXutil.nullDate() ;
      A1643PrdTip = "" ;
      A3004PrdRev = "" ;
      A4692PrdNom2 = "" ;
      A4693PrdNum2 = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A4694PrdObs = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A6191PrdNumCent = "" ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A8897PrdPesTerm = "" ;
      A8936PrdSal = "" ;
      A9610SubFamDsc = "" ;
      A9731PrdInc = "" ;
      A9732PrdComp = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A9734PrdNCAS = "" ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A10119PrdColIdx = "" ;
      A10881PrdLote = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11196PrdNroCAS = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A11687PrdList = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01VB3_A703PrdDscTec = new String[] {""} ;
      H01VB3_A718PrdNom = new String[] {""} ;
      H01VB3_A407EmprNom = new String[] {""} ;
      H01VB3_n407EmprNom = new boolean[] {false} ;
      H01VB3_A735PrdSusNom = new String[] {""} ;
      H01VB3_n735PrdSusNom = new boolean[] {false} ;
      H01VB3_A396EmprCod = new String[] {""} ;
      H01VB3_A719PrdNum = new String[] {""} ;
      H01VB3_A11687PrdList = new String[] {""} ;
      H01VB3_A11616PrdNmQu = new String[] {""} ;
      H01VB3_A11615PrdFuncion = new String[] {""} ;
      H01VB3_A11614PrdEINECS = new String[] {""} ;
      H01VB3_A11470PrdConct = new short[1] ;
      H01VB3_A11364PrdHm = new String[] {""} ;
      H01VB3_A11363PrdGots = new String[] {""} ;
      H01VB3_A11196PrdNroCAS = new String[] {""} ;
      H01VB3_A11663PrdCtw4 = new String[] {""} ;
      H01VB3_A10938PrdCtw3 = new String[] {""} ;
      H01VB3_A10937PrdCtw2 = new String[] {""} ;
      H01VB3_A10936PrdCtw1 = new String[] {""} ;
      H01VB3_A10935PrdRTM = new String[] {""} ;
      H01VB3_A10881PrdLote = new String[] {""} ;
      H01VB3_A10119PrdColIdx = new String[] {""} ;
      H01VB3_A5888PrdOkotex = new String[] {""} ;
      H01VB3_A5887PrdReach = new String[] {""} ;
      H01VB3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A9741PrdHS = new String[] {""} ;
      H01VB3_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A9739PrdFT = new String[] {""} ;
      H01VB3_A9734PrdNCAS = new String[] {""} ;
      H01VB3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A9732PrdComp = new String[] {""} ;
      H01VB3_A9731PrdInc = new String[] {""} ;
      H01VB3_A9610SubFamDsc = new String[] {""} ;
      H01VB3_n9610SubFamDsc = new boolean[] {false} ;
      H01VB3_A9609SubFamCod = new byte[1] ;
      H01VB3_n9609SubFamCod = new boolean[] {false} ;
      H01VB3_A8936PrdSal = new String[] {""} ;
      H01VB3_A8897PrdPesTerm = new String[] {""} ;
      H01VB3_A8896PrdPesCon = new byte[1] ;
      H01VB3_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A7260PrdHorMad = new byte[1] ;
      H01VB3_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A6191PrdNumCent = new String[] {""} ;
      H01VB3_A6302TipPrdDsc = new String[] {""} ;
      H01VB3_n6302TipPrdDsc = new boolean[] {false} ;
      H01VB3_A6301TipPrdCod = new short[1] ;
      H01VB3_n6301TipPrdCod = new boolean[] {false} ;
      H01VB3_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A5418PrdSalM = new String[] {""} ;
      H01VB3_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A4338PrdUMeFo = new byte[1] ;
      H01VB3_A4694PrdObs = new String[] {""} ;
      H01VB3_A4693PrdNum2 = new String[] {""} ;
      H01VB3_A4692PrdNom2 = new String[] {""} ;
      H01VB3_A3273PrdTnq = new byte[1] ;
      H01VB3_A3004PrdRev = new String[] {""} ;
      H01VB3_A1644PrdDqo = new short[1] ;
      H01VB3_A1643PrdTip = new String[] {""} ;
      H01VB3_A1194PrdPosY = new byte[1] ;
      H01VB3_A1193PrdPosX = new short[1] ;
      H01VB3_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A695PrdConCC = new short[1] ;
      H01VB3_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A738PrdUltCCC = new short[1] ;
      H01VB3_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A716PrdLotMin = new short[1] ;
      H01VB3_A630MetDsc = new String[] {""} ;
      H01VB3_n630MetDsc = new boolean[] {false} ;
      H01VB3_A629MetCod = new byte[1] ;
      H01VB3_n629MetCod = new boolean[] {false} ;
      H01VB3_A722PrdPlaEnt = new short[1] ;
      H01VB3_A699PrdDiaRot = new short[1] ;
      H01VB3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A731PrdStkMinD = new short[1] ;
      H01VB3_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      H01VB3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_n837TipDtoDto = new boolean[] {false} ;
      H01VB3_A835TipDtoCod = new byte[1] ;
      H01VB3_n835TipDtoCod = new boolean[] {false} ;
      H01VB3_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A730PrdSit = new byte[1] ;
      H01VB3_A698PrdDetPar = new String[] {""} ;
      H01VB3_A682PrdCalNec = new String[] {""} ;
      H01VB3_A727PrdRec = new String[] {""} ;
      H01VB3_A857ValDsc = new String[] {""} ;
      H01VB3_n857ValDsc = new boolean[] {false} ;
      H01VB3_A856ValCod = new byte[1] ;
      H01VB3_A734PrdSus = new String[] {""} ;
      H01VB3_n734PrdSus = new boolean[] {false} ;
      H01VB3_A728PrdRefPrv = new String[] {""} ;
      H01VB3_A794PrvNom = new String[] {""} ;
      H01VB3_n794PrvNom = new boolean[] {false} ;
      H01VB3_A795PrvNum = new int[1] ;
      H01VB3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01VB3_A736PrdUcoDsc = new String[] {""} ;
      H01VB3_n736PrdUcoDsc = new boolean[] {false} ;
      H01VB3_A743PrdUniCon = new byte[1] ;
      H01VB3_A737PrdUcpDsc = new String[] {""} ;
      H01VB3_n737PrdUcpDsc = new boolean[] {false} ;
      H01VB3_A742PrdUniCom = new byte[1] ;
      H01VB5_A735PrdSusNom = new String[] {""} ;
      H01VB5_n735PrdSusNom = new boolean[] {false} ;
      H01VB6_A407EmprNom = new String[] {""} ;
      H01VB6_n407EmprNom = new boolean[] {false} ;
      hsh = "" ;
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
      sCtrlA719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnprovprdtprdger__default(),
         new Object[] {
             new Object[] {
            H01VB3_A703PrdDscTec, H01VB3_A718PrdNom, H01VB3_A407EmprNom, H01VB3_n407EmprNom, H01VB3_A735PrdSusNom, H01VB3_n735PrdSusNom, H01VB3_A396EmprCod, H01VB3_A719PrdNum, H01VB3_A11687PrdList, H01VB3_A11616PrdNmQu,
            H01VB3_A11615PrdFuncion, H01VB3_A11614PrdEINECS, H01VB3_A11470PrdConct, H01VB3_A11364PrdHm, H01VB3_A11363PrdGots, H01VB3_A11196PrdNroCAS, H01VB3_A11663PrdCtw4, H01VB3_A10938PrdCtw3, H01VB3_A10937PrdCtw2, H01VB3_A10936PrdCtw1,
            H01VB3_A10935PrdRTM, H01VB3_A10881PrdLote, H01VB3_A10119PrdColIdx, H01VB3_A5888PrdOkotex, H01VB3_A5887PrdReach, H01VB3_A9742PrdFHS, H01VB3_A9741PrdHS, H01VB3_A9740PrdFFT, H01VB3_A9739PrdFT, H01VB3_A9734PrdNCAS,
            H01VB3_A9733PrdAox, H01VB3_A9732PrdComp, H01VB3_A9731PrdInc, H01VB3_A9610SubFamDsc, H01VB3_n9610SubFamDsc, H01VB3_A9609SubFamCod, H01VB3_n9609SubFamCod, H01VB3_A8936PrdSal, H01VB3_A8897PrdPesTerm, H01VB3_A8896PrdPesCon,
            H01VB3_A8659PrdExiAlmc, H01VB3_A7260PrdHorMad, H01VB3_A7227PrdNumct2, H01VB3_A7226PrdNumct1, H01VB3_A6191PrdNumCent, H01VB3_A6302TipPrdDsc, H01VB3_n6302TipPrdDsc, H01VB3_A6301TipPrdCod, H01VB3_n6301TipPrdCod, H01VB3_A5590PrdSolub,
            H01VB3_A5418PrdSalM, H01VB3_A5417PrdConcS, H01VB3_A5416PrdDensS, H01VB3_A5255PrdPreAc2, H01VB3_A4338PrdUMeFo, H01VB3_A4694PrdObs, H01VB3_A4693PrdNum2, H01VB3_A4692PrdNom2, H01VB3_A3273PrdTnq, H01VB3_A3004PrdRev,
            H01VB3_A1644PrdDqo, H01VB3_A1643PrdTip, H01VB3_A1194PrdPosY, H01VB3_A1193PrdPosX, H01VB3_A708PrdFecEnt, H01VB3_A332DifValStk, H01VB3_A750PrdValStk, H01VB3_A695PrdConCC, H01VB3_A700PrdDifCC, H01VB3_A739PrdUltDCC,
            H01VB3_A738PrdUltCCC, H01VB3_A740PrdUltECC, H01VB3_A706PrdExiCCP, H01VB3_A712PrdFulCC, H01VB3_A714PrdFulPed, H01VB3_A713PrdFulEnt, H01VB3_A684PrdCanPen, H01VB3_A685PrdCanRes, H01VB3_A705PrdExiCC, H01VB3_A704PrdExiAlm,
            H01VB3_A721PrdNumUco, H01VB3_A716PrdLotMin, H01VB3_A630MetDsc, H01VB3_n630MetDsc, H01VB3_A629MetCod, H01VB3_n629MetCod, H01VB3_A722PrdPlaEnt, H01VB3_A699PrdDiaRot, H01VB3_A732PrdStkMinU, H01VB3_A731PrdStkMinD,
            H01VB3_A696PrdConDia, H01VB3_A726PrdPreMed, H01VB3_A725PrdPreAnt, H01VB3_A709PrdFecPre, H01VB3_A724PrdPreAct, H01VB3_A837TipDtoDto, H01VB3_n837TipDtoDto, H01VB3_A835TipDtoCod, H01VB3_n835TipDtoCod, H01VB3_A729PrdRotRea,
            H01VB3_A730PrdSit, H01VB3_A698PrdDetPar, H01VB3_A682PrdCalNec, H01VB3_A727PrdRec, H01VB3_A857ValDsc, H01VB3_n857ValDsc, H01VB3_A856ValCod, H01VB3_A734PrdSus, H01VB3_n734PrdSus, H01VB3_A728PrdRefPrv,
            H01VB3_A794PrvNom, H01VB3_n794PrvNom, H01VB3_A795PrvNum, H01VB3_A707PrdFacCon, H01VB3_A736PrdUcoDsc, H01VB3_n736PrdUcoDsc, H01VB3_A743PrdUniCon, H01VB3_A737PrdUcpDsc, H01VB3_n737PrdUcpDsc, H01VB3_A742PrdUniCom
            }
            , new Object[] {
            H01VB5_A735PrdSusNom, H01VB5_n735PrdSusNom
            }
            , new Object[] {
            H01VB6_A407EmprNom, H01VB6_n407EmprNom
            }
         }
      );
      AV13Pgmname = "TnPROVPRDTPRDGER" ;
      /* GeneXus formulas. */
      AV13Pgmname = "TnPROVPRDTPRDGER" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private byte A629MetCod ;
   private byte A730PrdSit ;
   private byte A835TipDtoCod ;
   private byte A1194PrdPosY ;
   private byte A3273PrdTnq ;
   private byte A4338PrdUMeFo ;
   private byte A7260PrdHorMad ;
   private byte A8896PrdPesCon ;
   private byte A9609SubFamCod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A6301TipPrdCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A731PrdStkMinD ;
   private short A699PrdDiaRot ;
   private short A722PrdPlaEnt ;
   private short A716PrdLotMin ;
   private short A738PrdUltCCC ;
   private short A695PrdConCC ;
   private short A1193PrdPosX ;
   private short A1644PrdDqo ;
   private short A11470PrdConct ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdDscTec_Enabled ;
   private int edtPrdUniCom_Enabled ;
   private int edtPrdUcpDsc_Enabled ;
   private int edtPrdUniCon_Enabled ;
   private int edtPrdUcoDsc_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int A795PrvNum ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrdRefPrv_Enabled ;
   private int edtEmpCodSus_Enabled ;
   private int edtPrdSus_Enabled ;
   private int edtPrdSusNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtValDsc_Enabled ;
   private int edtPrdRec_Enabled ;
   private int edtPrdCalNec_Enabled ;
   private int edtPrdDetPar_Enabled ;
   private int edtPrdSit_Enabled ;
   private int edtPrdRotRea_Enabled ;
   private int edtTipDtoCod_Enabled ;
   private int edtTipDtoDto_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdFecPre_Enabled ;
   private int edtPrdPreAnt_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtPrdConDia_Enabled ;
   private int edtPrdStkMinD_Enabled ;
   private int edtPrdStkMinU_Enabled ;
   private int edtPrdDiaRot_Enabled ;
   private int edtPrdPlaEnt_Enabled ;
   private int edtMetCod_Enabled ;
   private int edtMetDsc_Enabled ;
   private int edtPrdLotMin_Enabled ;
   private int edtPrdNumUco_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtPrdFulEnt_Enabled ;
   private int edtPrdFulPed_Enabled ;
   private int edtPrdFulCC_Enabled ;
   private int edtPrdExiCCP_Enabled ;
   private int edtPrdUltECC_Enabled ;
   private int edtPrdUltCCC_Enabled ;
   private int edtPrdUltDCC_Enabled ;
   private int edtPrdDifCC_Enabled ;
   private int edtPrdConCC_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtDifValStk_Enabled ;
   private int edtPrdFecEnt_Enabled ;
   private int edtPrdPosX_Enabled ;
   private int edtPrdPosY_Enabled ;
   private int edtPrdTip_Enabled ;
   private int edtPrdDqo_Enabled ;
   private int edtPrdRev_Enabled ;
   private int edtPrdTnq_Enabled ;
   private int edtPrdNom2_Enabled ;
   private int edtPrdNum2_Enabled ;
   private int edtPrdObs_Enabled ;
   private int edtPrdUMeFo_Enabled ;
   private int edtPrdPreAc2_Enabled ;
   private int edtPrdDensS_Enabled ;
   private int edtPrdConcS_Enabled ;
   private int edtPrdSolub_Enabled ;
   private int edtTipPrdCod_Enabled ;
   private int edtTipPrdDsc_Enabled ;
   private int edtPrdNumCent_Enabled ;
   private int edtPrdNumct1_Enabled ;
   private int edtPrdNumct2_Enabled ;
   private int edtPrdHorMad_Enabled ;
   private int edtPrdExiAlmc_Enabled ;
   private int edtPrdPesTerm_Enabled ;
   private int edtSubFamCod_Enabled ;
   private int edtSubFamDsc_Enabled ;
   private int edtPrdInc_Enabled ;
   private int edtPrdComp_Enabled ;
   private int edtPrdAox_Enabled ;
   private int edtPrdNCAS_Enabled ;
   private int edtPrdFT_Enabled ;
   private int edtPrdFFT_Enabled ;
   private int edtPrdHS_Enabled ;
   private int edtPrdFHS_Enabled ;
   private int edtPrdReach_Enabled ;
   private int edtPrdColIdx_Enabled ;
   private int edtPrdLote_Enabled ;
   private int edtPrdRTM_Enabled ;
   private int edtPrdCtw1_Enabled ;
   private int edtPrdCtw2_Enabled ;
   private int edtPrdCtw3_Enabled ;
   private int edtPrdCtw4_Enabled ;
   private int edtPrdNroCAS_Enabled ;
   private int edtPrdGots_Enabled ;
   private int edtPrdHm_Enabled ;
   private int edtPrdConct_Enabled ;
   private int edtPrdEINECS_Enabled ;
   private int edtPrdFuncion_Enabled ;
   private int edtPrdNmQu_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A9733PrdAox ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV13Pgmname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Link ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdDscTec_Internalname ;
   private String A703PrdDscTec ;
   private String edtPrdDscTec_Jsonclick ;
   private String edtPrdUniCom_Internalname ;
   private String edtPrdUniCom_Jsonclick ;
   private String edtPrdUcpDsc_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Link ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdUniCon_Internalname ;
   private String edtPrdUniCon_Jsonclick ;
   private String edtPrdUcoDsc_Internalname ;
   private String A736PrdUcoDsc ;
   private String edtPrdUcoDsc_Link ;
   private String edtPrdUcoDsc_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdRefPrv_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtEmpCodSus_Internalname ;
   private String A394EmpCodSus ;
   private String edtEmpCodSus_Jsonclick ;
   private String edtPrdSus_Internalname ;
   private String A734PrdSus ;
   private String edtPrdSus_Jsonclick ;
   private String edtPrdSusNom_Internalname ;
   private String A735PrdSusNom ;
   private String edtPrdSusNom_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String edtValDsc_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Link ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdRec_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Jsonclick ;
   private String edtPrdCalNec_Internalname ;
   private String A682PrdCalNec ;
   private String edtPrdCalNec_Jsonclick ;
   private String edtPrdDetPar_Internalname ;
   private String A698PrdDetPar ;
   private String edtPrdDetPar_Jsonclick ;
   private String edtPrdSit_Internalname ;
   private String edtPrdSit_Jsonclick ;
   private String edtPrdRotRea_Internalname ;
   private String edtPrdRotRea_Jsonclick ;
   private String edtTipDtoCod_Internalname ;
   private String edtTipDtoCod_Jsonclick ;
   private String edtTipDtoDto_Internalname ;
   private String edtTipDtoDto_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdFecPre_Jsonclick ;
   private String edtPrdPreAnt_Internalname ;
   private String edtPrdPreAnt_Jsonclick ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String edtPrdConDia_Internalname ;
   private String edtPrdConDia_Jsonclick ;
   private String edtPrdStkMinD_Internalname ;
   private String edtPrdStkMinD_Jsonclick ;
   private String edtPrdStkMinU_Internalname ;
   private String edtPrdStkMinU_Jsonclick ;
   private String edtPrdDiaRot_Internalname ;
   private String edtPrdDiaRot_Jsonclick ;
   private String edtPrdPlaEnt_Internalname ;
   private String edtPrdPlaEnt_Jsonclick ;
   private String edtMetCod_Internalname ;
   private String edtMetCod_Jsonclick ;
   private String edtMetDsc_Internalname ;
   private String A630MetDsc ;
   private String edtMetDsc_Link ;
   private String edtMetDsc_Jsonclick ;
   private String edtPrdLotMin_Internalname ;
   private String edtPrdLotMin_Jsonclick ;
   private String edtPrdNumUco_Internalname ;
   private String edtPrdNumUco_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPrdFulEnt_Internalname ;
   private String edtPrdFulEnt_Jsonclick ;
   private String edtPrdFulPed_Internalname ;
   private String edtPrdFulPed_Jsonclick ;
   private String edtPrdFulCC_Internalname ;
   private String edtPrdFulCC_Jsonclick ;
   private String edtPrdExiCCP_Internalname ;
   private String edtPrdExiCCP_Jsonclick ;
   private String edtPrdUltECC_Internalname ;
   private String edtPrdUltECC_Jsonclick ;
   private String edtPrdUltCCC_Internalname ;
   private String edtPrdUltCCC_Jsonclick ;
   private String edtPrdUltDCC_Internalname ;
   private String edtPrdUltDCC_Jsonclick ;
   private String edtPrdDifCC_Internalname ;
   private String edtPrdDifCC_Jsonclick ;
   private String edtPrdConCC_Internalname ;
   private String edtPrdConCC_Jsonclick ;
   private String edtPrdValStk_Internalname ;
   private String edtPrdValStk_Jsonclick ;
   private String edtDifValStk_Internalname ;
   private String edtDifValStk_Jsonclick ;
   private String edtPrdFecEnt_Internalname ;
   private String edtPrdFecEnt_Jsonclick ;
   private String edtPrdPosX_Internalname ;
   private String edtPrdPosX_Jsonclick ;
   private String edtPrdPosY_Internalname ;
   private String edtPrdPosY_Jsonclick ;
   private String edtPrdTip_Internalname ;
   private String A1643PrdTip ;
   private String edtPrdTip_Jsonclick ;
   private String edtPrdDqo_Internalname ;
   private String edtPrdDqo_Jsonclick ;
   private String edtPrdRev_Internalname ;
   private String A3004PrdRev ;
   private String edtPrdRev_Jsonclick ;
   private String edtPrdTnq_Internalname ;
   private String edtPrdTnq_Jsonclick ;
   private String edtPrdNom2_Internalname ;
   private String A4692PrdNom2 ;
   private String edtPrdNom2_Jsonclick ;
   private String edtPrdNum2_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Jsonclick ;
   private String edtPrdObs_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtPrdUMeFo_Internalname ;
   private String edtPrdUMeFo_Jsonclick ;
   private String edtPrdPreAc2_Internalname ;
   private String edtPrdPreAc2_Jsonclick ;
   private String edtPrdDensS_Internalname ;
   private String edtPrdDensS_Jsonclick ;
   private String edtPrdConcS_Internalname ;
   private String edtPrdConcS_Jsonclick ;
   private String A5418PrdSalM ;
   private String edtPrdSolub_Internalname ;
   private String edtPrdSolub_Jsonclick ;
   private String edtTipPrdCod_Internalname ;
   private String edtTipPrdCod_Jsonclick ;
   private String edtTipPrdDsc_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Link ;
   private String edtTipPrdDsc_Jsonclick ;
   private String edtPrdNumCent_Internalname ;
   private String A6191PrdNumCent ;
   private String edtPrdNumCent_Jsonclick ;
   private String edtPrdNumct1_Internalname ;
   private String edtPrdNumct1_Jsonclick ;
   private String edtPrdNumct2_Internalname ;
   private String edtPrdNumct2_Jsonclick ;
   private String edtPrdHorMad_Internalname ;
   private String edtPrdHorMad_Jsonclick ;
   private String edtPrdExiAlmc_Internalname ;
   private String edtPrdExiAlmc_Jsonclick ;
   private String edtPrdPesTerm_Internalname ;
   private String A8897PrdPesTerm ;
   private String edtPrdPesTerm_Jsonclick ;
   private String A8936PrdSal ;
   private String edtSubFamCod_Internalname ;
   private String edtSubFamCod_Jsonclick ;
   private String edtSubFamDsc_Internalname ;
   private String A9610SubFamDsc ;
   private String edtSubFamDsc_Jsonclick ;
   private String edtPrdInc_Internalname ;
   private String A9731PrdInc ;
   private String edtPrdInc_Jsonclick ;
   private String edtPrdComp_Internalname ;
   private String A9732PrdComp ;
   private String edtPrdComp_Jsonclick ;
   private String edtPrdAox_Internalname ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdNCAS_Internalname ;
   private String A9734PrdNCAS ;
   private String edtPrdNCAS_Jsonclick ;
   private String edtPrdFT_Internalname ;
   private String A9739PrdFT ;
   private String edtPrdFT_Jsonclick ;
   private String edtPrdFFT_Internalname ;
   private String edtPrdFFT_Jsonclick ;
   private String edtPrdHS_Internalname ;
   private String A9741PrdHS ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Internalname ;
   private String edtPrdFHS_Jsonclick ;
   private String edtPrdReach_Internalname ;
   private String A5887PrdReach ;
   private String edtPrdReach_Jsonclick ;
   private String A5888PrdOkotex ;
   private String edtPrdColIdx_Internalname ;
   private String A10119PrdColIdx ;
   private String edtPrdColIdx_Jsonclick ;
   private String edtPrdLote_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Jsonclick ;
   private String edtPrdRTM_Internalname ;
   private String A10935PrdRTM ;
   private String edtPrdRTM_Jsonclick ;
   private String edtPrdCtw1_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtPrdNroCAS_Internalname ;
   private String A11196PrdNroCAS ;
   private String edtPrdNroCAS_Jsonclick ;
   private String edtPrdGots_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdHm_Internalname ;
   private String A11364PrdHm ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdConct_Internalname ;
   private String edtPrdConct_Jsonclick ;
   private String edtPrdEINECS_Internalname ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Jsonclick ;
   private String edtPrdFuncion_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdNmQu_Internalname ;
   private String A11687PrdList ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA719PrdNum ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n735PrdSusNom ;
   private boolean n9610SubFamDsc ;
   private boolean n9609SubFamCod ;
   private boolean n6302TipPrdDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n630MetDsc ;
   private boolean n629MetCod ;
   private boolean n837TipDtoDto ;
   private boolean n835TipDtoCod ;
   private boolean n857ValDsc ;
   private boolean n734PrdSus ;
   private boolean n794PrvNom ;
   private boolean n736PrdUcoDsc ;
   private boolean n737PrdUcpDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String A4694PrdObs ;
   private String A11616PrdNmQu ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPrdSalM ;
   private ICheckbox chkPrdPesCon ;
   private ICheckbox chkPrdSal ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdList ;
   private IDataStoreProvider pr_default ;
   private String[] H01VB3_A703PrdDscTec ;
   private String[] H01VB3_A718PrdNom ;
   private String[] H01VB3_A407EmprNom ;
   private boolean[] H01VB3_n407EmprNom ;
   private String[] H01VB3_A735PrdSusNom ;
   private boolean[] H01VB3_n735PrdSusNom ;
   private String[] H01VB3_A396EmprCod ;
   private String[] H01VB3_A719PrdNum ;
   private String[] H01VB3_A11687PrdList ;
   private String[] H01VB3_A11616PrdNmQu ;
   private String[] H01VB3_A11615PrdFuncion ;
   private String[] H01VB3_A11614PrdEINECS ;
   private short[] H01VB3_A11470PrdConct ;
   private String[] H01VB3_A11364PrdHm ;
   private String[] H01VB3_A11363PrdGots ;
   private String[] H01VB3_A11196PrdNroCAS ;
   private String[] H01VB3_A11663PrdCtw4 ;
   private String[] H01VB3_A10938PrdCtw3 ;
   private String[] H01VB3_A10937PrdCtw2 ;
   private String[] H01VB3_A10936PrdCtw1 ;
   private String[] H01VB3_A10935PrdRTM ;
   private String[] H01VB3_A10881PrdLote ;
   private String[] H01VB3_A10119PrdColIdx ;
   private String[] H01VB3_A5888PrdOkotex ;
   private String[] H01VB3_A5887PrdReach ;
   private java.util.Date[] H01VB3_A9742PrdFHS ;
   private String[] H01VB3_A9741PrdHS ;
   private java.util.Date[] H01VB3_A9740PrdFFT ;
   private String[] H01VB3_A9739PrdFT ;
   private String[] H01VB3_A9734PrdNCAS ;
   private java.math.BigDecimal[] H01VB3_A9733PrdAox ;
   private String[] H01VB3_A9732PrdComp ;
   private String[] H01VB3_A9731PrdInc ;
   private String[] H01VB3_A9610SubFamDsc ;
   private boolean[] H01VB3_n9610SubFamDsc ;
   private byte[] H01VB3_A9609SubFamCod ;
   private boolean[] H01VB3_n9609SubFamCod ;
   private String[] H01VB3_A8936PrdSal ;
   private String[] H01VB3_A8897PrdPesTerm ;
   private byte[] H01VB3_A8896PrdPesCon ;
   private java.math.BigDecimal[] H01VB3_A8659PrdExiAlmc ;
   private byte[] H01VB3_A7260PrdHorMad ;
   private java.math.BigDecimal[] H01VB3_A7227PrdNumct2 ;
   private java.math.BigDecimal[] H01VB3_A7226PrdNumct1 ;
   private String[] H01VB3_A6191PrdNumCent ;
   private String[] H01VB3_A6302TipPrdDsc ;
   private boolean[] H01VB3_n6302TipPrdDsc ;
   private short[] H01VB3_A6301TipPrdCod ;
   private boolean[] H01VB3_n6301TipPrdCod ;
   private java.math.BigDecimal[] H01VB3_A5590PrdSolub ;
   private String[] H01VB3_A5418PrdSalM ;
   private java.math.BigDecimal[] H01VB3_A5417PrdConcS ;
   private java.math.BigDecimal[] H01VB3_A5416PrdDensS ;
   private java.math.BigDecimal[] H01VB3_A5255PrdPreAc2 ;
   private byte[] H01VB3_A4338PrdUMeFo ;
   private String[] H01VB3_A4694PrdObs ;
   private String[] H01VB3_A4693PrdNum2 ;
   private String[] H01VB3_A4692PrdNom2 ;
   private byte[] H01VB3_A3273PrdTnq ;
   private String[] H01VB3_A3004PrdRev ;
   private short[] H01VB3_A1644PrdDqo ;
   private String[] H01VB3_A1643PrdTip ;
   private byte[] H01VB3_A1194PrdPosY ;
   private short[] H01VB3_A1193PrdPosX ;
   private java.util.Date[] H01VB3_A708PrdFecEnt ;
   private java.math.BigDecimal[] H01VB3_A332DifValStk ;
   private java.math.BigDecimal[] H01VB3_A750PrdValStk ;
   private short[] H01VB3_A695PrdConCC ;
   private java.math.BigDecimal[] H01VB3_A700PrdDifCC ;
   private java.math.BigDecimal[] H01VB3_A739PrdUltDCC ;
   private short[] H01VB3_A738PrdUltCCC ;
   private java.math.BigDecimal[] H01VB3_A740PrdUltECC ;
   private java.math.BigDecimal[] H01VB3_A706PrdExiCCP ;
   private java.util.Date[] H01VB3_A712PrdFulCC ;
   private java.util.Date[] H01VB3_A714PrdFulPed ;
   private java.util.Date[] H01VB3_A713PrdFulEnt ;
   private java.math.BigDecimal[] H01VB3_A684PrdCanPen ;
   private java.math.BigDecimal[] H01VB3_A685PrdCanRes ;
   private java.math.BigDecimal[] H01VB3_A705PrdExiCC ;
   private java.math.BigDecimal[] H01VB3_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01VB3_A721PrdNumUco ;
   private short[] H01VB3_A716PrdLotMin ;
   private String[] H01VB3_A630MetDsc ;
   private boolean[] H01VB3_n630MetDsc ;
   private byte[] H01VB3_A629MetCod ;
   private boolean[] H01VB3_n629MetCod ;
   private short[] H01VB3_A722PrdPlaEnt ;
   private short[] H01VB3_A699PrdDiaRot ;
   private java.math.BigDecimal[] H01VB3_A732PrdStkMinU ;
   private short[] H01VB3_A731PrdStkMinD ;
   private java.math.BigDecimal[] H01VB3_A696PrdConDia ;
   private java.math.BigDecimal[] H01VB3_A726PrdPreMed ;
   private java.math.BigDecimal[] H01VB3_A725PrdPreAnt ;
   private java.util.Date[] H01VB3_A709PrdFecPre ;
   private java.math.BigDecimal[] H01VB3_A724PrdPreAct ;
   private java.math.BigDecimal[] H01VB3_A837TipDtoDto ;
   private boolean[] H01VB3_n837TipDtoDto ;
   private byte[] H01VB3_A835TipDtoCod ;
   private boolean[] H01VB3_n835TipDtoCod ;
   private java.math.BigDecimal[] H01VB3_A729PrdRotRea ;
   private byte[] H01VB3_A730PrdSit ;
   private String[] H01VB3_A698PrdDetPar ;
   private String[] H01VB3_A682PrdCalNec ;
   private String[] H01VB3_A727PrdRec ;
   private String[] H01VB3_A857ValDsc ;
   private boolean[] H01VB3_n857ValDsc ;
   private byte[] H01VB3_A856ValCod ;
   private String[] H01VB3_A734PrdSus ;
   private boolean[] H01VB3_n734PrdSus ;
   private String[] H01VB3_A728PrdRefPrv ;
   private String[] H01VB3_A794PrvNom ;
   private boolean[] H01VB3_n794PrvNom ;
   private int[] H01VB3_A795PrvNum ;
   private java.math.BigDecimal[] H01VB3_A707PrdFacCon ;
   private String[] H01VB3_A736PrdUcoDsc ;
   private boolean[] H01VB3_n736PrdUcoDsc ;
   private byte[] H01VB3_A743PrdUniCon ;
   private String[] H01VB3_A737PrdUcpDsc ;
   private boolean[] H01VB3_n737PrdUcpDsc ;
   private byte[] H01VB3_A742PrdUniCom ;
   private String[] H01VB5_A735PrdSusNom ;
   private boolean[] H01VB5_n735PrdSusNom ;
   private String[] H01VB6_A407EmprNom ;
   private boolean[] H01VB6_n407EmprNom ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tnprovprdtprdger__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01VB3", "SELECT T1.PrdDscTec, T1.PrdNom, T2.EmprNom, COALESCE( T11.PrdSusNom, '') AS PrdSusNom, T1.EmprCod, T1.PrdNum, T1.PrdList, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdConct, T1.PrdHm, T1.PrdGots, T1.PrdNroCAS, T1.PrdCtw4, T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdLote, T1.PrdColIdx, T1.PrdOkotex, T1.PrdReach, T1.PrdFHS, T1.PrdHS, T1.PrdFFT, T1.PrdFT, T1.PrdNCAS, T1.PrdAox, T1.PrdComp, T1.PrdInc, T10.SubFamDsc, T1.SubFamCod, T1.PrdSal, T1.PrdPesTerm, T1.PrdPesCon, T1.PrdExiAlmc, T1.PrdHorMad, T1.PrdNumct2, T1.PrdNumct1, T1.PrdNumCent, T9.TipPrdDsc, T1.TipPrdCod, T1.PrdSolub, T1.PrdSalM, T1.PrdConcS, T1.PrdDensS, T1.PrdPreAc2, T1.PrdUMeFo, T1.PrdObs, T1.PrdNum2, T1.PrdNom2, T1.PrdTnq, T1.PrdRev, T1.PrdDqo, T1.PrdTip, T1.PrdPosY, T1.PrdPosX, T1.PrdFecEnt, T1.DifValStk, T1.PrdValStk, T1.PrdConCC, T1.PrdDifCC, T1.PrdUltDCC, T1.PrdUltCCC, T1.PrdUltECC, T1.PrdExiCCP, T1.PrdFulCC, T1.PrdFulPed, T1.PrdFulEnt, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiCC, T1.PrdExiAlm, T1.PrdNumUco, T1.PrdLotMin, T3.MetDsc, T1.MetCod, T1.PrdPlaEnt, T1.PrdDiaRot, T1.PrdStkMinU, T1.PrdStkMinD, T1.PrdConDia, T1.PrdPreMed, T1.PrdPreAnt, T1.PrdFecPre, T1.PrdPreAct, T5.TipDtoDto, T1.TipDtoCod, T1.PrdRotRea, T1.PrdSit, T1.PrdDetPar, T1.PrdCalNec, T1.PrdRec, T8.ValDsc, T1.ValCod, T1.PrdSus, T1.PrdRefPrv, T4.PrvNom, T1.PrvNum, T1.PrdFacCon, T7.UniDsc AS PrdUcoDsc, T1.PrdUniCon AS PrdUniCon, T6.UniDsc AS PrdUcpDsc, T1.PrdUniCom AS PrdUniCom FROM (((((((((TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMETPED T3 ON T3.EmprCod = T1.EmprCod AND T3.MetCod = T1.MetCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrvNum) LEFT JOIN TXPTIPDTO T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDtoCod = T1.TipDtoCod) INNER JOIN TXPTIPUNI T6 ON T6.EmprCod = T1.EmprCod AND T6.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T7 ON T7.EmprCod = T1.EmprCod AND T7.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL T8 ON T8.EmprCod = T1.EmprCod AND T8.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T9 ON T9.EmprCod = T1.EmprCod AND T9.TipPrdCod = T1.TipPrdCod) LEFT JOIN TXPSUBFSP T10 ON T10.EmprCod = T1.EmprCod AND T10.SubFamCod = T1.SubFamCod),  (SELECT MIN(PrdNum) AS PrdSusNom FROM TXPPRODUC WHERE EmprCod = EmprCod and PrdNum = PrdSus ) T11 WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01VB5", "SELECT COALESCE( T1.PrdSusNom, '') AS PrdSusNom FROM (SELECT MIN(PrdNum) AS PrdSusNom FROM TXPPRODUC WHERE EmprCod = EmprCod and PrdNum = PrdSus ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01VB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 50);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 40);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((String[]) buf[17])[0] = rslt.getString(16, 3);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((String[]) buf[20])[0] = rslt.getString(19, 10);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 10);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(26);
               ((String[]) buf[28])[0] = rslt.getString(27, 1);
               ((String[]) buf[29])[0] = rslt.getString(28, 30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,2);
               ((String[]) buf[31])[0] = rslt.getString(30, 2);
               ((String[]) buf[32])[0] = rslt.getString(31, 2);
               ((String[]) buf[33])[0] = rslt.getString(32, 40);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(33);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(34, 1);
               ((String[]) buf[38])[0] = rslt.getString(35, 10);
               ((byte[]) buf[39])[0] = rslt.getByte(36);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(37,4);
               ((byte[]) buf[41])[0] = rslt.getByte(38);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[44])[0] = rslt.getString(41, 6);
               ((String[]) buf[45])[0] = rslt.getString(42, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(43);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[50])[0] = rslt.getString(45, 1);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(46,3);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(47,3);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(48,5);
               ((byte[]) buf[54])[0] = rslt.getByte(49);
               ((String[]) buf[55])[0] = rslt.getVarchar(50);
               ((String[]) buf[56])[0] = rslt.getString(51, 16);
               ((String[]) buf[57])[0] = rslt.getString(52, 40);
               ((byte[]) buf[58])[0] = rslt.getByte(53);
               ((String[]) buf[59])[0] = rslt.getString(54, 1);
               ((short[]) buf[60])[0] = rslt.getShort(55);
               ((String[]) buf[61])[0] = rslt.getString(56, 1);
               ((byte[]) buf[62])[0] = rslt.getByte(57);
               ((short[]) buf[63])[0] = rslt.getShort(58);
               ((java.util.Date[]) buf[64])[0] = rslt.getGXDate(59);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(60,2);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(61,2);
               ((short[]) buf[67])[0] = rslt.getShort(62);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(63,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(64,2);
               ((short[]) buf[70])[0] = rslt.getShort(65);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(66,2);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(67,2);
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDate(68);
               ((java.util.Date[]) buf[74])[0] = rslt.getGXDate(69);
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(70);
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(71,4);
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(72,4);
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(73,4);
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(74,4);
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(75,2);
               ((short[]) buf[81])[0] = rslt.getShort(76);
               ((String[]) buf[82])[0] = rslt.getString(77, 8);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(78);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(79);
               ((short[]) buf[87])[0] = rslt.getShort(80);
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(81,2);
               ((short[]) buf[89])[0] = rslt.getShort(82);
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(83,2);
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(84,5);
               ((java.math.BigDecimal[]) buf[92])[0] = rslt.getBigDecimal(85,5);
               ((java.util.Date[]) buf[93])[0] = rslt.getGXDate(86);
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(87,5);
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(88,2);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((byte[]) buf[97])[0] = rslt.getByte(89);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(90,5);
               ((byte[]) buf[100])[0] = rslt.getByte(91);
               ((String[]) buf[101])[0] = rslt.getString(92, 1);
               ((String[]) buf[102])[0] = rslt.getString(93, 1);
               ((String[]) buf[103])[0] = rslt.getString(94, 1);
               ((String[]) buf[104])[0] = rslt.getString(95, 16);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((byte[]) buf[106])[0] = rslt.getByte(96);
               ((String[]) buf[107])[0] = rslt.getString(97, 6);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(98, 30);
               ((String[]) buf[110])[0] = rslt.getString(99, 30);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((int[]) buf[112])[0] = rslt.getInt(100);
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(101,4);
               ((String[]) buf[114])[0] = rslt.getString(102, 8);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(103);
               ((String[]) buf[117])[0] = rslt.getString(104, 8);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((byte[]) buf[119])[0] = rslt.getByte(105);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

