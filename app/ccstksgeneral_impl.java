package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ccstksgeneral_impl extends GXWebComponent
{
   public ccstksgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ccstksgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ccstksgeneral_impl.class ));
   }

   public ccstksgeneral_impl( int remoteHandle ,
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
               A3342CCStkLin = GXutil.lval( httpContext.GetPar( "CCStkLin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,A719PrdNum,Long.valueOf(A3342CCStkLin)});
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
         pa1RV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "CCSTKSGeneral", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ccstksgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A3342CCStkLin,12,0))}, new String[] {"EmprCod","PrdNum","CCStkLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CCSTKSGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ccstksgeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA719PrdNum", GXutil.rtrim( wcpOA719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA3342CCStkLin", GXutil.ltrim( localUtil.ntoc( wcpOA3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseForm1RV2( )
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
      return "CCSTKSGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CCSTKSGeneral", "") ;
   }

   public void wb1RV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ccstksgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkLin_Internalname, httpContext.getMessage( "Linea Movimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkLin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkCanE_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkCanE_Internalname, httpContext.getMessage( "Cantidad Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkCanE_Internalname, GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkCanE_Enabled!=0) ? localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkCanE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkCanE_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkCanS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkCanS_Internalname, httpContext.getMessage( "Cantidad Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkCanS_Internalname, GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkCanS_Enabled!=0) ? localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkCanS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkCanS_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipMovCc_Internalname, httpContext.getMessage( "Codigo Tipo Movimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc), GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipMovCc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTipMovCn_Internalname, httpContext.getMessage( "Descripcion Tipo Movimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn), GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipMovCn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPri_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkPri_Internalname, httpContext.getMessage( "CCStkPri", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPri_Internalname, GXutil.rtrim( A3347CCStkPri), GXutil.rtrim( localUtil.format( A3347CCStkPri, "9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkFec_Internalname, httpContext.getMessage( "Fecha Movimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCCStkFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkFec_Internalname, localUtil.format(A3348CCStkFec, "99/99/99"), localUtil.format( A3348CCStkFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtCCStkFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCStkFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CCSTKSGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkPre_Enabled!=0) ? localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999") : localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkBar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkBar_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkBar_Internalname, GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkBar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkBar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkBar_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkReo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkReo_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkPar_Internalname, httpContext.getMessage( "Particion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPar_Internalname, GXutil.rtrim( A3352CCStkPar), GXutil.rtrim( localUtil.format( A3352CCStkPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkPed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkPed_Internalname, httpContext.getMessage( "Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkPed_Internalname, GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkPed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkPed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkPed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkAlb_Internalname, httpContext.getMessage( "Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkAlb_Internalname, GXutil.rtrim( A3354CCStkAlb), GXutil.rtrim( localUtil.format( A3354CCStkAlb, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkAlb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkUsu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkUsu_Internalname, GXutil.rtrim( A3355CCStkUsu), GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkHor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkHor_Internalname, GXutil.rtrim( A3356CCStkHor), GXutil.rtrim( localUtil.format( A3356CCStkHor, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkDsc_Internalname, GXutil.rtrim( A3357CCStkDsc), GXutil.rtrim( localUtil.format( A3357CCStkDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkLen_Internalname, httpContext.getMessage( "Linea Entrada Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLen_Internalname, GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkLen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkLen_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcoCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCcoCod_Internalname, httpContext.getMessage( "CcoCod", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCcoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorE_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValorE_Internalname, httpContext.getMessage( "Valor Entradas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValorE_Internalname, GXutil.ltrim( localUtil.ntoc( A3909ValorE, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorE_Enabled!=0) ? localUtil.format( A3909ValorE, "ZZZZZZZ9.99") : localUtil.format( A3909ValorE, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValorE_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorS_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValorS_Internalname, httpContext.getMessage( "Valor salidas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValorS_Internalname, GXutil.ltrim( localUtil.ntoc( A3910ValorS, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorS_Enabled!=0) ? localUtil.format( A3910ValorS, "ZZZZZZZZ9.99") : localUtil.format( A3910ValorS, "ZZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorS_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValorS_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorEI_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValorEI_Internalname, httpContext.getMessage( "ValorEI", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValorEI_Internalname, GXutil.ltrim( localUtil.ntoc( A3916ValorEI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorEI_Enabled!=0) ? localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999") : localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorEI_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValorEI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValorSI_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtValorSI_Internalname, httpContext.getMessage( "ValorSI", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtValorSI_Internalname, GXutil.ltrim( localUtil.ntoc( A3917ValorSI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValorSI_Enabled!=0) ? localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999") : localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValorSI_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtValorSI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkLot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkLot_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkLot_Internalname, GXutil.rtrim( A5722CCStkLot), GXutil.rtrim( localUtil.format( A5722CCStkLot, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkLot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkExp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkExp_Internalname, httpContext.getMessage( "Exportado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkExp_Internalname, GXutil.ltrim( localUtil.ntoc( A6834CCStkExp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkExp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6834CCStkExp), "9") : localUtil.format( DecimalUtil.doubleToDec(A6834CCStkExp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkExp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkExp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkExpF_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkExpF_Internalname, httpContext.getMessage( "Fecha Exportacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCCStkExpF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkExpF_Internalname, localUtil.format(A6835CCStkExpF, "99/99/99"), localUtil.format( A6835CCStkExpF, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkExpF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkExpF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtCCStkExpF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCStkExpF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CCSTKSGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcStkPrv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCcStkPrv_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCcStkPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A6157CcStkPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcStkPrv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6157CcStkPrv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6157CcStkPrv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcStkPrv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCcStkPrv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCcstkhis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCcstkhis_Internalname, httpContext.getMessage( "Historico?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCcstkhis_Internalname, GXutil.ltrim( localUtil.ntoc( A11347Ccstkhis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcstkhis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11347Ccstkhis), "9") : localUtil.format( DecimalUtil.doubleToDec(A11347Ccstkhis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcstkhis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCcstkhis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkDoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkDoc_Internalname, httpContext.getMessage( "Documento Disolucion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A12229CCStkDoc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCStkDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12229CCStkDoc), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12229CCStkDoc), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkDoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkDoc_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCStkNAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCStkNAlb_Internalname, httpContext.getMessage( "N Albaran Mayor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCStkNAlb_Internalname, GXutil.rtrim( A12858CCStkNAlb), GXutil.rtrim( localUtil.format( A12858CCStkNAlb, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCStkNAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCStkNAlb_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCstkdiaho_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCstkdiaho_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtCCstkdiaho_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCstkdiaho_Internalname, localUtil.ttoc( A13865CCstkdiaho, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13865CCstkdiaho, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCstkdiaho_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCstkdiaho_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtCCstkdiaho_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCstkdiaho_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CCSTKSGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCstkNHDR_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCCstkNHDR_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCCstkNHDR_Internalname, GXutil.rtrim( A13866CCstkNHDR), GXutil.rtrim( localUtil.format( A13866CCstkNHDR, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCstkNHDR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCstkNHDR_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111rv1_client"+"'", TempTags, "", 2, "HLP_CCSTKSGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121rv1_client"+"'", TempTags, "", 2, "HLP_CCSTKSGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSGeneral.htm");
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

   public void start1RV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "CCSTKSGeneral", ""), (short)(0)) ;
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
            strup1RV0( ) ;
         }
      }
   }

   public void ws1RV2( )
   {
      start1RV2( ) ;
      evt1RV2( ) ;
   }

   public void evt1RV2( )
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
                              strup1RV0( ) ;
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
                              strup1RV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131RV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141RV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RV0( ) ;
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
                              strup1RV0( ) ;
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

   public void we1RV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1RV2( ) ;
         }
      }
   }

   public void pa1RV2( )
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
      rf1RV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "CCSTKSGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1RV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01RV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12858CCStkNAlb = H01RV2_A12858CCStkNAlb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12858CCStkNAlb", A12858CCStkNAlb);
            A12229CCStkDoc = H01RV2_A12229CCStkDoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
            A11347Ccstkhis = H01RV2_A11347Ccstkhis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
            A6157CcStkPrv = H01RV2_A6157CcStkPrv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
            A6835CCStkExpF = H01RV2_A6835CCStkExpF[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
            A6834CCStkExp = H01RV2_A6834CCStkExp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
            A5722CCStkLot = H01RV2_A5722CCStkLot[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5722CCStkLot", A5722CCStkLot);
            A3839CcoCod = H01RV2_A3839CcoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            A3358CCStkLen = H01RV2_A3358CCStkLen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
            A3357CCStkDsc = H01RV2_A3357CCStkDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3357CCStkDsc", A3357CCStkDsc);
            A3355CCStkUsu = H01RV2_A3355CCStkUsu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3355CCStkUsu", A3355CCStkUsu);
            A3354CCStkAlb = H01RV2_A3354CCStkAlb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3354CCStkAlb", A3354CCStkAlb);
            A3353CCStkPed = H01RV2_A3353CCStkPed[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
            A3347CCStkPri = H01RV2_A3347CCStkPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3347CCStkPri", A3347CCStkPri);
            A3346TipMovCn = H01RV2_A3346TipMovCn[0] ;
            n3346TipMovCn = H01RV2_n3346TipMovCn[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3346TipMovCn", A3346TipMovCn);
            A3345TipMovCc = H01RV2_A3345TipMovCc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3345TipMovCc", A3345TipMovCc);
            A3343CCStkCanE = H01RV2_A3343CCStkCanE[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
            A3349CCStkPre = H01RV2_A3349CCStkPre[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
            A3344CCStkCanS = H01RV2_A3344CCStkCanS[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
            A3356CCStkHor = H01RV2_A3356CCStkHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3356CCStkHor", A3356CCStkHor);
            A3348CCStkFec = H01RV2_A3348CCStkFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
            A3352CCStkPar = H01RV2_A3352CCStkPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3352CCStkPar", A3352CCStkPar);
            A3351CCStkReo = H01RV2_A3351CCStkReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
            A3350CCStkBar = H01RV2_A3350CCStkBar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
            A3346TipMovCn = H01RV2_A3346TipMovCn[0] ;
            n3346TipMovCn = H01RV2_n3346TipMovCn[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3346TipMovCn", A3346TipMovCn);
            if ( ! (0==A3350CCStkBar) )
            {
               A13866CCstkNHDR = GXutil.trim( GXutil.str( A3350CCStkBar, 8, 0)) + "-" + GXutil.str( A3351CCStkReo, 1, 0) + A3352CCStkPar ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13866CCstkNHDR", A13866CCstkNHDR);
            }
            else
            {
               if ( (0==A3350CCStkBar) )
               {
                  A13866CCstkNHDR = " " ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13866CCstkNHDR", A13866CCstkNHDR);
               }
               else
               {
                  A13866CCstkNHDR = "" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13866CCstkNHDR", A13866CCstkNHDR);
               }
            }
            A13865CCstkdiaho = localUtil.ctot( localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+" "+A3356CCStkHor, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13865CCstkdiaho", localUtil.ttoc( A13865CCstkdiaho, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A3917ValorSI = A3344CCStkCanS.multiply(A3349CCStkPre) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
            if ( A3915EmpNumDec == 0 )
            {
               A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A3910ValorS = GXutil.roundDecimal( A3917ValorSI, 2) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
               }
               else
               {
                  A3910ValorS = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
               }
            }
            A3916ValorEI = A3343CCStkCanE.multiply(A3349CCStkPre) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
            if ( A3915EmpNumDec == 0 )
            {
               A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A3909ValorE = GXutil.roundDecimal( A3916ValorEI, 2) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
               }
               else
               {
                  A3909ValorE = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
               }
            }
            /* Execute user event: Load */
            e141RV2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1RV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1RV2( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "CCSTKSGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01RV3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A3915EmpNumDec = H01RV3_A3915EmpNumDec[0] ;
      n3915EmpNumDec = H01RV3_n3915EmpNumDec[0] ;
      pr_default.close(1);
      /* Using cursor H01RV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      A704PrdExiAlm = H01RV4_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      pr_default.close(2);
      pr_default.close(1);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strup1RV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131RV2 ();
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
         wcpOA3342CCStkLin = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA3342CCStkLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         /* Read variables values. */
         A3343CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtCCStkCanE_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3343CCStkCanE", GXutil.ltrimstr( A3343CCStkCanE, 12, 4));
         A3344CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtCCStkCanS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3344CCStkCanS", GXutil.ltrimstr( A3344CCStkCanS, 12, 4));
         A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3345TipMovCc", A3345TipMovCc);
         A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
         n3346TipMovCn = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3346TipMovCn", A3346TipMovCn);
         A3347CCStkPri = httpContext.cgiGet( edtCCStkPri_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3347CCStkPri", A3347CCStkPri);
         A3348CCStkFec = localUtil.ctod( httpContext.cgiGet( edtCCStkFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
         A3349CCStkPre = localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3349CCStkPre", GXutil.ltrimstr( A3349CCStkPre, 14, 5));
         A3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3350CCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3350CCStkBar), 8, 0));
         A3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3351CCStkReo", GXutil.str( A3351CCStkReo, 1, 0));
         A3352CCStkPar = httpContext.cgiGet( edtCCStkPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3352CCStkPar", A3352CCStkPar);
         A3353CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3353CCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3353CCStkPed), 8, 0));
         A3354CCStkAlb = httpContext.cgiGet( edtCCStkAlb_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3354CCStkAlb", A3354CCStkAlb);
         A3355CCStkUsu = GXutil.upper( httpContext.cgiGet( edtCCStkUsu_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3355CCStkUsu", A3355CCStkUsu);
         A3356CCStkHor = httpContext.cgiGet( edtCCStkHor_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3356CCStkHor", A3356CCStkHor);
         A3357CCStkDsc = httpContext.cgiGet( edtCCStkDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3357CCStkDsc", A3357CCStkDsc);
         A3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3358CCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3358CCStkLen), 4, 0));
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         A3909ValorE = localUtil.ctond( httpContext.cgiGet( edtValorE_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3909ValorE", GXutil.ltrimstr( A3909ValorE, 11, 2));
         A3910ValorS = localUtil.ctond( httpContext.cgiGet( edtValorS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3910ValorS", GXutil.ltrimstr( A3910ValorS, 12, 2));
         A3916ValorEI = localUtil.ctond( httpContext.cgiGet( edtValorEI_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3916ValorEI", GXutil.ltrimstr( A3916ValorEI, 14, 5));
         A3917ValorSI = localUtil.ctond( httpContext.cgiGet( edtValorSI_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3917ValorSI", GXutil.ltrimstr( A3917ValorSI, 14, 5));
         A5722CCStkLot = httpContext.cgiGet( edtCCStkLot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5722CCStkLot", A5722CCStkLot);
         A6834CCStkExp = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkExp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6834CCStkExp", GXutil.str( A6834CCStkExp, 1, 0));
         A6835CCStkExpF = localUtil.ctod( httpContext.cgiGet( edtCCStkExpF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6835CCStkExpF", localUtil.format(A6835CCStkExpF, "99/99/99"));
         A6157CcStkPrv = (int)(localUtil.ctol( httpContext.cgiGet( edtCcStkPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6157CcStkPrv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6157CcStkPrv), 6, 0));
         A11347Ccstkhis = (byte)(localUtil.ctol( httpContext.cgiGet( edtCcstkhis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11347Ccstkhis", GXutil.str( A11347Ccstkhis, 1, 0));
         A12229CCStkDoc = localUtil.ctol( httpContext.cgiGet( edtCCStkDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12229CCStkDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12229CCStkDoc), 10, 0));
         A12858CCStkNAlb = httpContext.cgiGet( edtCCStkNAlb_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A12858CCStkNAlb", A12858CCStkNAlb);
         A13865CCstkdiaho = localUtil.ctot( httpContext.cgiGet( edtCCstkdiaho_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13865CCstkdiaho", localUtil.ttoc( A13865CCstkdiaho, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13866CCstkNHDR = httpContext.cgiGet( edtCCstkNHDR_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13866CCstkNHDR", A13866CCstkNHDR);
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CCSTKSGeneral");
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ccstksgeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131RV2 ();
      if (returnInSub) return;
   }

   public void e131RV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ccstksgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      ccstksgeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      ccstksgeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      ccstksgeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
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

   protected void e141RV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "CCSTKS" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A719PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A719PrdNum", A719PrdNum);
      A3342CCStkLin = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
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
      pa1RV2( ) ;
      ws1RV2( ) ;
      we1RV2( ) ;
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
      sCtrlA3342CCStkLin = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1RV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ccstksgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1RV2( ) ;
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
         A3342CCStkLin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA719PrdNum = httpContext.cgiGet( sPrefix+"wcpOA719PrdNum") ;
      wcpOA3342CCStkLin = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA3342CCStkLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, wcpOA719PrdNum) != 0 ) || ( A3342CCStkLin != wcpOA3342CCStkLin ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA719PrdNum = A719PrdNum ;
      wcpOA3342CCStkLin = A3342CCStkLin ;
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
      sCtrlA3342CCStkLin = httpContext.cgiGet( sPrefix+"A3342CCStkLin_CTRL") ;
      if ( GXutil.len( sCtrlA3342CCStkLin) > 0 )
      {
         A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( sCtrlA3342CCStkLin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3342CCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3342CCStkLin), 12, 0));
      }
      else
      {
         A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( sPrefix+"A3342CCStkLin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
      pa1RV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1RV2( ) ;
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
      ws1RV2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A3342CCStkLin_PARM", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA3342CCStkLin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A3342CCStkLin_CTRL", GXutil.rtrim( sCtrlA3342CCStkLin));
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
      we1RV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211685723", true, true);
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
      httpContext.AddJavascriptSource("ccstksgeneral.js", "?20268211685724", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtCCStkLin_Internalname = sPrefix+"CCSTKLIN" ;
      edtCCStkCanE_Internalname = sPrefix+"CCSTKCANE" ;
      edtCCStkCanS_Internalname = sPrefix+"CCSTKCANS" ;
      edtTipMovCc_Internalname = sPrefix+"TIPMOVCC" ;
      edtTipMovCn_Internalname = sPrefix+"TIPMOVCN" ;
      edtCCStkPri_Internalname = sPrefix+"CCSTKPRI" ;
      edtCCStkFec_Internalname = sPrefix+"CCSTKFEC" ;
      edtCCStkPre_Internalname = sPrefix+"CCSTKPRE" ;
      edtCCStkBar_Internalname = sPrefix+"CCSTKBAR" ;
      edtCCStkReo_Internalname = sPrefix+"CCSTKREO" ;
      edtCCStkPar_Internalname = sPrefix+"CCSTKPAR" ;
      edtCCStkPed_Internalname = sPrefix+"CCSTKPED" ;
      edtCCStkAlb_Internalname = sPrefix+"CCSTKALB" ;
      edtCCStkUsu_Internalname = sPrefix+"CCSTKUSU" ;
      edtCCStkHor_Internalname = sPrefix+"CCSTKHOR" ;
      edtCCStkDsc_Internalname = sPrefix+"CCSTKDSC" ;
      edtCCStkLen_Internalname = sPrefix+"CCSTKLEN" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtCcoCod_Internalname = sPrefix+"CCOCOD" ;
      edtValorE_Internalname = sPrefix+"VALORE" ;
      edtValorS_Internalname = sPrefix+"VALORS" ;
      edtValorEI_Internalname = sPrefix+"VALOREI" ;
      edtValorSI_Internalname = sPrefix+"VALORSI" ;
      edtCCStkLot_Internalname = sPrefix+"CCSTKLOT" ;
      edtCCStkExp_Internalname = sPrefix+"CCSTKEXP" ;
      edtCCStkExpF_Internalname = sPrefix+"CCSTKEXPF" ;
      edtCcStkPrv_Internalname = sPrefix+"CCSTKPRV" ;
      edtCcstkhis_Internalname = sPrefix+"CCSTKHIS" ;
      edtCCStkDoc_Internalname = sPrefix+"CCSTKDOC" ;
      edtCCStkNAlb_Internalname = sPrefix+"CCSTKNALB" ;
      edtCCstkdiaho_Internalname = sPrefix+"CCSTKDIAHO" ;
      edtCCstkNHDR_Internalname = sPrefix+"CCSTKNHDR" ;
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
      edtCCstkNHDR_Jsonclick = "" ;
      edtCCstkNHDR_Enabled = 0 ;
      edtCCstkdiaho_Jsonclick = "" ;
      edtCCstkdiaho_Enabled = 0 ;
      edtCCStkNAlb_Jsonclick = "" ;
      edtCCStkNAlb_Enabled = 0 ;
      edtCCStkDoc_Jsonclick = "" ;
      edtCCStkDoc_Enabled = 0 ;
      edtCcstkhis_Jsonclick = "" ;
      edtCcstkhis_Enabled = 0 ;
      edtCcStkPrv_Jsonclick = "" ;
      edtCcStkPrv_Enabled = 0 ;
      edtCCStkExpF_Jsonclick = "" ;
      edtCCStkExpF_Enabled = 0 ;
      edtCCStkExp_Jsonclick = "" ;
      edtCCStkExp_Enabled = 0 ;
      edtCCStkLot_Jsonclick = "" ;
      edtCCStkLot_Enabled = 0 ;
      edtValorSI_Jsonclick = "" ;
      edtValorSI_Enabled = 0 ;
      edtValorEI_Jsonclick = "" ;
      edtValorEI_Enabled = 0 ;
      edtValorS_Jsonclick = "" ;
      edtValorS_Enabled = 0 ;
      edtValorE_Jsonclick = "" ;
      edtValorE_Enabled = 0 ;
      edtCcoCod_Jsonclick = "" ;
      edtCcoCod_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtCCStkLen_Jsonclick = "" ;
      edtCCStkLen_Enabled = 0 ;
      edtCCStkDsc_Jsonclick = "" ;
      edtCCStkDsc_Enabled = 0 ;
      edtCCStkHor_Jsonclick = "" ;
      edtCCStkHor_Enabled = 0 ;
      edtCCStkUsu_Jsonclick = "" ;
      edtCCStkUsu_Enabled = 0 ;
      edtCCStkAlb_Jsonclick = "" ;
      edtCCStkAlb_Enabled = 0 ;
      edtCCStkPed_Jsonclick = "" ;
      edtCCStkPed_Enabled = 0 ;
      edtCCStkPar_Jsonclick = "" ;
      edtCCStkPar_Enabled = 0 ;
      edtCCStkReo_Jsonclick = "" ;
      edtCCStkReo_Enabled = 0 ;
      edtCCStkBar_Jsonclick = "" ;
      edtCCStkBar_Enabled = 0 ;
      edtCCStkPre_Jsonclick = "" ;
      edtCCStkPre_Enabled = 0 ;
      edtCCStkFec_Jsonclick = "" ;
      edtCCStkFec_Enabled = 0 ;
      edtCCStkPri_Jsonclick = "" ;
      edtCCStkPri_Enabled = 0 ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCn_Enabled = 0 ;
      edtTipMovCc_Jsonclick = "" ;
      edtTipMovCc_Enabled = 0 ;
      edtCCStkCanS_Jsonclick = "" ;
      edtCCStkCanS_Enabled = 0 ;
      edtCCStkCanE_Jsonclick = "" ;
      edtCCStkCanE_Enabled = 0 ;
      edtCCStkLin_Jsonclick = "" ;
      edtCCStkLin_Enabled = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111RV1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121RV1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_CCSTKLIN","{handler:'valid_Ccstklin',iparms:[]");
      setEventMetadata("VALID_CCSTKLIN",",oparms:[]}");
      setEventMetadata("VALID_CCSTKCANE","{handler:'valid_Ccstkcane',iparms:[]");
      setEventMetadata("VALID_CCSTKCANE",",oparms:[]}");
      setEventMetadata("VALID_CCSTKCANS","{handler:'valid_Ccstkcans',iparms:[]");
      setEventMetadata("VALID_CCSTKCANS",",oparms:[]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[]}");
      setEventMetadata("VALID_CCSTKFEC","{handler:'valid_Ccstkfec',iparms:[]");
      setEventMetadata("VALID_CCSTKFEC",",oparms:[]}");
      setEventMetadata("VALID_CCSTKPRE","{handler:'valid_Ccstkpre',iparms:[]");
      setEventMetadata("VALID_CCSTKPRE",",oparms:[]}");
      setEventMetadata("VALID_CCSTKBAR","{handler:'valid_Ccstkbar',iparms:[]");
      setEventMetadata("VALID_CCSTKBAR",",oparms:[]}");
      setEventMetadata("VALID_CCSTKREO","{handler:'valid_Ccstkreo',iparms:[]");
      setEventMetadata("VALID_CCSTKREO",",oparms:[]}");
      setEventMetadata("VALID_CCSTKPAR","{handler:'valid_Ccstkpar',iparms:[]");
      setEventMetadata("VALID_CCSTKPAR",",oparms:[]}");
      setEventMetadata("VALID_CCSTKHOR","{handler:'valid_Ccstkhor',iparms:[]");
      setEventMetadata("VALID_CCSTKHOR",",oparms:[]}");
      setEventMetadata("VALID_VALOREI","{handler:'valid_Valorei',iparms:[]");
      setEventMetadata("VALID_VALOREI",",oparms:[]}");
      setEventMetadata("VALID_VALORSI","{handler:'valid_Valorsi',iparms:[]");
      setEventMetadata("VALID_VALORSI",",oparms:[]}");
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
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A6835CCStkExpF = GXutil.nullDate() ;
      A12858CCStkNAlb = "" ;
      A13865CCstkdiaho = GXutil.resetTime( GXutil.nullDate() );
      A13866CCstkNHDR = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01RV2_A396EmprCod = new String[] {""} ;
      H01RV2_A719PrdNum = new String[] {""} ;
      H01RV2_A3342CCStkLin = new long[1] ;
      H01RV2_A12858CCStkNAlb = new String[] {""} ;
      H01RV2_A12229CCStkDoc = new long[1] ;
      H01RV2_A11347Ccstkhis = new byte[1] ;
      H01RV2_A6157CcStkPrv = new int[1] ;
      H01RV2_A6835CCStkExpF = new java.util.Date[] {GXutil.nullDate()} ;
      H01RV2_A6834CCStkExp = new byte[1] ;
      H01RV2_A5722CCStkLot = new String[] {""} ;
      H01RV2_A3839CcoCod = new short[1] ;
      H01RV2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RV2_A3358CCStkLen = new short[1] ;
      H01RV2_A3357CCStkDsc = new String[] {""} ;
      H01RV2_A3355CCStkUsu = new String[] {""} ;
      H01RV2_A3354CCStkAlb = new String[] {""} ;
      H01RV2_A3353CCStkPed = new int[1] ;
      H01RV2_A3347CCStkPri = new String[] {""} ;
      H01RV2_A3346TipMovCn = new String[] {""} ;
      H01RV2_n3346TipMovCn = new boolean[] {false} ;
      H01RV2_A3345TipMovCc = new String[] {""} ;
      H01RV2_A3915EmpNumDec = new byte[1] ;
      H01RV2_n3915EmpNumDec = new boolean[] {false} ;
      H01RV2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RV2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RV2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RV2_A3356CCStkHor = new String[] {""} ;
      H01RV2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01RV2_A3352CCStkPar = new String[] {""} ;
      H01RV2_A3351CCStkReo = new byte[1] ;
      H01RV2_A3350CCStkBar = new int[1] ;
      H01RV3_A3915EmpNumDec = new byte[1] ;
      H01RV3_n3915EmpNumDec = new boolean[] {false} ;
      H01RV4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      sCtrlA3342CCStkLin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstksgeneral__default(),
         new Object[] {
             new Object[] {
            H01RV2_A396EmprCod, H01RV2_A719PrdNum, H01RV2_A3342CCStkLin, H01RV2_A12858CCStkNAlb, H01RV2_A12229CCStkDoc, H01RV2_A11347Ccstkhis, H01RV2_A6157CcStkPrv, H01RV2_A6835CCStkExpF, H01RV2_A6834CCStkExp, H01RV2_A5722CCStkLot,
            H01RV2_A3839CcoCod, H01RV2_A704PrdExiAlm, H01RV2_A3358CCStkLen, H01RV2_A3357CCStkDsc, H01RV2_A3355CCStkUsu, H01RV2_A3354CCStkAlb, H01RV2_A3353CCStkPed, H01RV2_A3347CCStkPri, H01RV2_A3346TipMovCn, H01RV2_n3346TipMovCn,
            H01RV2_A3345TipMovCc, H01RV2_A3915EmpNumDec, H01RV2_n3915EmpNumDec, H01RV2_A3343CCStkCanE, H01RV2_A3349CCStkPre, H01RV2_A3344CCStkCanS, H01RV2_A3356CCStkHor, H01RV2_A3348CCStkFec, H01RV2_A3352CCStkPar, H01RV2_A3351CCStkReo,
            H01RV2_A3350CCStkBar
            }
            , new Object[] {
            H01RV3_A3915EmpNumDec, H01RV3_n3915EmpNumDec
            }
            , new Object[] {
            H01RV4_A704PrdExiAlm
            }
         }
      );
      AV13Pgmname = "CCSTKSGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "CCSTKSGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A3915EmpNumDec ;
   private byte A3351CCStkReo ;
   private byte A6834CCStkExp ;
   private byte A11347Ccstkhis ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtCCStkLin_Enabled ;
   private int edtCCStkCanE_Enabled ;
   private int edtCCStkCanS_Enabled ;
   private int edtTipMovCc_Enabled ;
   private int edtTipMovCn_Enabled ;
   private int edtCCStkPri_Enabled ;
   private int edtCCStkFec_Enabled ;
   private int edtCCStkPre_Enabled ;
   private int A3350CCStkBar ;
   private int edtCCStkBar_Enabled ;
   private int edtCCStkReo_Enabled ;
   private int edtCCStkPar_Enabled ;
   private int A3353CCStkPed ;
   private int edtCCStkPed_Enabled ;
   private int edtCCStkAlb_Enabled ;
   private int edtCCStkUsu_Enabled ;
   private int edtCCStkHor_Enabled ;
   private int edtCCStkDsc_Enabled ;
   private int edtCCStkLen_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtCcoCod_Enabled ;
   private int edtValorE_Enabled ;
   private int edtValorS_Enabled ;
   private int edtValorEI_Enabled ;
   private int edtValorSI_Enabled ;
   private int edtCCStkLot_Enabled ;
   private int edtCCStkExp_Enabled ;
   private int edtCCStkExpF_Enabled ;
   private int A6157CcStkPrv ;
   private int edtCcStkPrv_Enabled ;
   private int edtCcstkhis_Enabled ;
   private int edtCCStkDoc_Enabled ;
   private int edtCCStkNAlb_Enabled ;
   private int edtCCstkdiaho_Enabled ;
   private int edtCCstkNHDR_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private long wcpOA3342CCStkLin ;
   private long A3342CCStkLin ;
   private long A12229CCStkDoc ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
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
   private String edtCCStkLin_Internalname ;
   private String edtCCStkLin_Jsonclick ;
   private String edtCCStkCanE_Internalname ;
   private String edtCCStkCanE_Jsonclick ;
   private String edtCCStkCanS_Internalname ;
   private String edtCCStkCanS_Jsonclick ;
   private String edtTipMovCc_Internalname ;
   private String A3345TipMovCc ;
   private String edtTipMovCc_Jsonclick ;
   private String edtTipMovCn_Internalname ;
   private String A3346TipMovCn ;
   private String edtTipMovCn_Jsonclick ;
   private String edtCCStkPri_Internalname ;
   private String A3347CCStkPri ;
   private String edtCCStkPri_Jsonclick ;
   private String edtCCStkFec_Internalname ;
   private String edtCCStkFec_Jsonclick ;
   private String edtCCStkPre_Internalname ;
   private String edtCCStkPre_Jsonclick ;
   private String edtCCStkBar_Internalname ;
   private String edtCCStkBar_Jsonclick ;
   private String edtCCStkReo_Internalname ;
   private String edtCCStkReo_Jsonclick ;
   private String edtCCStkPar_Internalname ;
   private String A3352CCStkPar ;
   private String edtCCStkPar_Jsonclick ;
   private String edtCCStkPed_Internalname ;
   private String edtCCStkPed_Jsonclick ;
   private String edtCCStkAlb_Internalname ;
   private String A3354CCStkAlb ;
   private String edtCCStkAlb_Jsonclick ;
   private String edtCCStkUsu_Internalname ;
   private String A3355CCStkUsu ;
   private String edtCCStkUsu_Jsonclick ;
   private String edtCCStkHor_Internalname ;
   private String A3356CCStkHor ;
   private String edtCCStkHor_Jsonclick ;
   private String edtCCStkDsc_Internalname ;
   private String A3357CCStkDsc ;
   private String edtCCStkDsc_Jsonclick ;
   private String edtCCStkLen_Internalname ;
   private String edtCCStkLen_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtCcoCod_Internalname ;
   private String edtCcoCod_Jsonclick ;
   private String edtValorE_Internalname ;
   private String edtValorE_Jsonclick ;
   private String edtValorS_Internalname ;
   private String edtValorS_Jsonclick ;
   private String edtValorEI_Internalname ;
   private String edtValorEI_Jsonclick ;
   private String edtValorSI_Internalname ;
   private String edtValorSI_Jsonclick ;
   private String edtCCStkLot_Internalname ;
   private String A5722CCStkLot ;
   private String edtCCStkLot_Jsonclick ;
   private String edtCCStkExp_Internalname ;
   private String edtCCStkExp_Jsonclick ;
   private String edtCCStkExpF_Internalname ;
   private String edtCCStkExpF_Jsonclick ;
   private String edtCcStkPrv_Internalname ;
   private String edtCcStkPrv_Jsonclick ;
   private String edtCcstkhis_Internalname ;
   private String edtCcstkhis_Jsonclick ;
   private String edtCCStkDoc_Internalname ;
   private String edtCCStkDoc_Jsonclick ;
   private String edtCCStkNAlb_Internalname ;
   private String A12858CCStkNAlb ;
   private String edtCCStkNAlb_Jsonclick ;
   private String edtCCstkdiaho_Internalname ;
   private String edtCCstkdiaho_Jsonclick ;
   private String edtCCstkNHDR_Internalname ;
   private String A13866CCstkNHDR ;
   private String edtCCstkNHDR_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
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
   private String sCtrlA3342CCStkLin ;
   private java.util.Date A13865CCstkdiaho ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A6835CCStkExpF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n3346TipMovCn ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01RV2_A396EmprCod ;
   private String[] H01RV2_A719PrdNum ;
   private long[] H01RV2_A3342CCStkLin ;
   private String[] H01RV2_A12858CCStkNAlb ;
   private long[] H01RV2_A12229CCStkDoc ;
   private byte[] H01RV2_A11347Ccstkhis ;
   private int[] H01RV2_A6157CcStkPrv ;
   private java.util.Date[] H01RV2_A6835CCStkExpF ;
   private byte[] H01RV2_A6834CCStkExp ;
   private String[] H01RV2_A5722CCStkLot ;
   private short[] H01RV2_A3839CcoCod ;
   private java.math.BigDecimal[] H01RV2_A704PrdExiAlm ;
   private short[] H01RV2_A3358CCStkLen ;
   private String[] H01RV2_A3357CCStkDsc ;
   private String[] H01RV2_A3355CCStkUsu ;
   private String[] H01RV2_A3354CCStkAlb ;
   private int[] H01RV2_A3353CCStkPed ;
   private String[] H01RV2_A3347CCStkPri ;
   private String[] H01RV2_A3346TipMovCn ;
   private boolean[] H01RV2_n3346TipMovCn ;
   private String[] H01RV2_A3345TipMovCc ;
   private byte[] H01RV2_A3915EmpNumDec ;
   private boolean[] H01RV2_n3915EmpNumDec ;
   private java.math.BigDecimal[] H01RV2_A3343CCStkCanE ;
   private java.math.BigDecimal[] H01RV2_A3349CCStkPre ;
   private java.math.BigDecimal[] H01RV2_A3344CCStkCanS ;
   private String[] H01RV2_A3356CCStkHor ;
   private java.util.Date[] H01RV2_A3348CCStkFec ;
   private String[] H01RV2_A3352CCStkPar ;
   private byte[] H01RV2_A3351CCStkReo ;
   private int[] H01RV2_A3350CCStkBar ;
   private byte[] H01RV3_A3915EmpNumDec ;
   private boolean[] H01RV3_n3915EmpNumDec ;
   private java.math.BigDecimal[] H01RV4_A704PrdExiAlm ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class ccstksgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RV2", "SELECT T1.EmprCod, T1.PrdNum, T1.CCStkLin, T1.CCStkNAlb, T1.CCStkDoc, T1.Ccstkhis, T1.CcStkPrv, T1.CCStkExpF, T1.CCStkExp, T1.CCStkLot, T1.CcoCod, T4.PrdExiAlm, T1.CCStkLen, T1.CCStkDsc, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T2.EmpNumDec, T1.CCStkCanE, T1.CCStkPre, T1.CCStkCanS, T1.CCStkHor, T1.CCStkFec, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar FROM (((TXPCCSTKS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) INNER JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.CCStkLin = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.CCStkLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01RV3", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01RV4", "SELECT PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 10);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(20, 2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,5);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,4);
               ((String[]) buf[26])[0] = rslt.getString(25, 8);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(26);
               ((String[]) buf[28])[0] = rslt.getString(27, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(28);
               ((int[]) buf[30])[0] = rslt.getInt(29);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

