package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajosexternosenviogeneral_impl extends GXWebComponent
{
   public trabajosexternosenviogeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajosexternosenviogeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternosenviogeneral_impl.class ));
   }

   public trabajosexternosenviogeneral_impl( int remoteHandle ,
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
               A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A2253SalExtAlb)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MANCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13847ManNomID = httpContext.GetPar( "ManNomID") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamancod17Y0( A396EmprCod, A13847ManNomID) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatrncod17Y0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"MANCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13847ManNomID = httpContext.GetPar( "ManNomID") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgamancod17Y0( A396EmprCod, A13847ManNomID) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"MANCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h2248ManCod = httpContext.GetPar( "h2248ManCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcamancod17Y2( A396EmprCod, h2248ManCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgatrncod17Y0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcatrncod17Y2( A396EmprCod, h840TrnCod) ;
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
         pa17Y2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Trabajos Externos Envio General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternosenviogeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0))}, new String[] {"EmprCod","SalExtAlb"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( wcpOA2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCMANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseForm17Y2( )
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
      return "TrabajosExternosEnvioGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajos Externos Envio General", "") ;
   }

   public void wb17Y0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.trabajosexternosenviogeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAlb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtAlb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtFec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtSalExtFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtFec_Internalname, localUtil.format(A2256SalExtFec, "99/99/99"), localUtil.format( A2256SalExtFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtSalExtFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExtFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtHor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtHor_Internalname, GXutil.rtrim( A6396SalExtHor), GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFecEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalFecEnt_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtSalFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalFecEnt_Internalname, localUtil.format(A8655SalFecEnt, "99/99/99"), localUtil.format( A8655SalFecEnt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtSalFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtUsu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtUsu_Internalname, GXutil.rtrim( A7368SalExtUsu), GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalSts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalSts_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalSts_Internalname, GXutil.rtrim( A10080SalSts), GXutil.rtrim( localUtil.format( A10080SalSts, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalSts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalSts_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, h2248ManCod, GXutil.rtrim( localUtil.format( h2248ManCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSalextpre1_cell_Internalname, 1, 0, "px", 0, "px", divSalextpre1_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtSalExtPre1_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtPre1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtPre1_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtPre1_Internalname, GXutil.ltrim( localUtil.ntoc( A13244SalExtPre1, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtPre1_Enabled!=0) ? localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999") : localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtPre1_Jsonclick, 0, "AttributeFL", "", "", "", "", edtSalExtPre1_Visible, edtSalExtPre1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtMat_Internalname, GXutil.rtrim( A6397SalExtMat), GXutil.rtrim( localUtil.format( A6397SalExtMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtSalExtObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtSalExtObs_Internalname, A3554SalExtObs, "", "", (short)(0), 1, edtSalExtObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "9999", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvioGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1117y1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1217y1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternosEnvioGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtEst_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtEst_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtLis_Internalname, GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtLis_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtLis_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtSec_Internalname, GXutil.rtrim( A2254SalExtSec), GXutil.rtrim( localUtil.format( A2254SalExtSec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtSec_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtSec_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExUln_Internalname, GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6247SalExUln), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExUln_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExUln_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAT_Internalname, GXutil.rtrim( A10767SalExtAT), GXutil.rtrim( localUtil.format( A10767SalExtAT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtAT_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalCodeID_Internalname, GXutil.rtrim( A10742SalCodeID), GXutil.rtrim( localUtil.format( A10742SalCodeID, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalCodeID_Jsonclick, 0, "Attribute", "", "", "", "", edtSalCodeID_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalEnvAT_Internalname, GXutil.ltrim( localUtil.ntoc( A10741SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalEnvAT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalEnvAT_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtSalFmdD_Internalname, GXutil.rtrim( A10079SalFmdD), "", "", (short)(0), edtSalFmdD_Visible, 0, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10078SalGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalGrossT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalGrossT_Visible, 0, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtSalFmd_Internalname, GXutil.rtrim( A10077SalFmd), "", "", (short)(0), edtSalFmd_Visible, 0, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternosEnvioGeneral.htm");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtSalFhh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtSalFhh_Internalname, localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10076SalFhh, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFhh_Jsonclick, 0, "Attribute", "", "", "", "", edtSalFhh_Visible, 0, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtSalFhh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtSalFhh_Visible==0)||(0==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternosEnvioGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start17Y2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Trabajos Externos Envio General", ""), (short)(0)) ;
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
            strup17Y0( ) ;
         }
      }
   }

   public void ws17Y2( )
   {
      start17Y2( ) ;
      evt17Y2( ) ;
   }

   public void evt17Y2( )
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
                              strup17Y0( ) ;
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
                              strup17Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1317Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup17Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1417Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup17Y0( ) ;
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
                              strup17Y0( ) ;
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

   public void we17Y2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm17Y2( ) ;
         }
      }
   }

   public void pa17Y2( )
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

   public void gxsgamancod17Y0( String A396EmprCod ,
                                String A13847ManNomID )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgamancod_data17Y0( A396EmprCod, A13847ManNomID) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgamancod_data17Y0( String A396EmprCod ,
                                        String A13847ManNomID )
   {
      l13847ManNomID = GXutil.concat( GXutil.rtrim( A13847ManNomID), "%", "") ;
      /* Using cursor H017Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13847ManNomID});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H017Y2_A13847ManNomID[0]);
         gxdynajaxctrldescr.add(H017Y2_A13847ManNomID[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgatrncod17Y0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data17Y0( A396EmprCod, A13738TrnCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatrncod_data17Y0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor H017Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H017Y3_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(H017Y3_A13738TrnCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcamancod17Y2( String A396EmprCod ,
                                String A13847ManNomID )
   {
      /* Using cursor H017Y4 */
      pr_default.execute(2, new Object[] {A13847ManNomID, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13847ManNomID = H017Y4_A13847ManNomID[0] ;
         A396EmprCod = H017Y4_A396EmprCod[0] ;
         A2248ManCod = H017Y4_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(2);
   }

   public void gxhcatrncod17Y2( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      /* Using cursor H017Y5 */
      pr_default.execute(3, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = H017Y5_A13738TrnCNom[0] ;
         A396EmprCod = H017Y5_A396EmprCod[0] ;
         A840TrnCod = H017Y5_A840TrnCod[0] ;
         n840TrnCod = H017Y5_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
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
      rf17Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TrabajosExternosEnvioGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rf17Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H017Y6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A3554SalExtObs = H017Y6_A3554SalExtObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3554SalExtObs", A3554SalExtObs);
            A10076SalFhh = H017Y6_A10076SalFhh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10077SalFmd = H017Y6_A10077SalFmd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10077SalFmd", A10077SalFmd);
            A10078SalGrossT = H017Y6_A10078SalGrossT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
            A10079SalFmdD = H017Y6_A10079SalFmdD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10079SalFmdD", A10079SalFmdD);
            A10741SalEnvAT = H017Y6_A10741SalEnvAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
            A10742SalCodeID = H017Y6_A10742SalCodeID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10742SalCodeID", A10742SalCodeID);
            A10767SalExtAT = H017Y6_A10767SalExtAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10767SalExtAT", A10767SalExtAT);
            A6247SalExUln = H017Y6_A6247SalExUln[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
            A2254SalExtSec = H017Y6_A2254SalExtSec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2254SalExtSec", A2254SalExtSec);
            A2258SalExtLis = H017Y6_A2258SalExtLis[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
            A2257SalExtEst = H017Y6_A2257SalExtEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
            A6397SalExtMat = H017Y6_A6397SalExtMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6397SalExtMat", A6397SalExtMat);
            A840TrnCod = H017Y6_A840TrnCod[0] ;
            n840TrnCod = H017Y6_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A13244SalExtPre1 = H017Y6_A13244SalExtPre1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
            A2248ManCod = H017Y6_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A10080SalSts = H017Y6_A10080SalSts[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10080SalSts", A10080SalSts);
            A7368SalExtUsu = H017Y6_A7368SalExtUsu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7368SalExtUsu", A7368SalExtUsu);
            A8655SalFecEnt = H017Y6_A8655SalFecEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
            A6396SalExtHor = H017Y6_A6396SalExtHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6396SalExtHor", A6396SalExtHor);
            A2256SalExtFec = H017Y6_A2256SalExtFec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            if ( (GXutil.strcmp("", h2248ManCod)==0) )
            {
               A2248ManCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            else
            {
               A13847ManNomID = h2248ManCod ;
               /* Using cursor H017Y7 */
               pr_default.execute(5, new Object[] {A13847ManNomID, A396EmprCod});
               A2248ManCod = H017Y7_A2248ManCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               A2248ManCod = H017Y7_A2248ManCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  pr_default.readNext(5);
                  if ( ! ( (pr_default.getStatus(5) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
                  }
               }
               else
               {
               }
               pr_default.close(5);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h2248ManCod", h2248ManCod);
            if ( (GXutil.strcmp("", h840TrnCod)==0) )
            {
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A13738TrnCNom = h840TrnCod ;
               /* Using cursor H017Y8 */
               pr_default.execute(6, new Object[] {A13738TrnCNom, A396EmprCod});
               A840TrnCod = H017Y8_A840TrnCod[0] ;
               n840TrnCod = H017Y8_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A840TrnCod = H017Y8_A840TrnCod[0] ;
               n840TrnCod = H017Y8_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  pr_default.readNext(6);
                  if ( ! ( (pr_default.getStatus(6) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  }
               }
               else
               {
               }
               pr_default.close(6);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
            /* Execute user event: Load */
            e1417Y2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         wb17Y0( ) ;
      }
   }

   public void send_integrity_lvl_hashes17Y2( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TrabajosExternosEnvioGeneral" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup17Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1317Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         /* Read variables values. */
         A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( edtSalExtFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6396SalExtHor", A6396SalExtHor);
         A8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( edtSalFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
         A7368SalExtUsu = GXutil.upper( httpContext.cgiGet( edtSalExtUsu_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7368SalExtUsu", A7368SalExtUsu);
         A10080SalSts = httpContext.cgiGet( edtSalSts_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10080SalSts", A10080SalSts);
         h2248ManCod = httpContext.cgiGet( edtManCod_Internalname) ;
         if ( (GXutil.strcmp("", h2248ManCod)==0) )
         {
            A2248ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A13847ManNomID = h2248ManCod ;
            /* Using cursor H017Y9 */
            pr_default.execute(7, new Object[] {A13847ManNomID, A396EmprCod});
            A2248ManCod = H017Y9_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2248ManCod = H017Y9_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               pr_default.readNext(7);
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "MANCOD");
               }
            }
            else
            {
            }
            pr_default.close(7);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h2248ManCod", h2248ManCod);
         A13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( edtSalExtPre1_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
         h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor H017Y10 */
            pr_default.execute(8, new Object[] {A13738TrnCNom, A396EmprCod});
            A840TrnCod = H017Y10_A840TrnCod[0] ;
            n840TrnCod = H017Y10_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = H017Y10_A840TrnCod[0] ;
            n840TrnCod = H017Y10_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
         A6397SalExtMat = httpContext.cgiGet( edtSalExtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6397SalExtMat", A6397SalExtMat);
         A3554SalExtObs = httpContext.cgiGet( edtSalExtObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3554SalExtObs", A3554SalExtObs);
         A2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
         A2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
         A2254SalExtSec = httpContext.cgiGet( edtSalExtSec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2254SalExtSec", A2254SalExtSec);
         A6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExUln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
         A10767SalExtAT = httpContext.cgiGet( edtSalExtAT_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10767SalExtAT", A10767SalExtAT);
         A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10742SalCodeID", A10742SalCodeID);
         A10741SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
         A10079SalFmdD = httpContext.cgiGet( edtSalFmdD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10079SalFmdD", A10079SalFmdD);
         A10078SalGrossT = localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
         A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10077SalFmd", A10077SalFmd);
         A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      e1317Y2 ();
      if (returnInSub) return;
   }

   public void e1317Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajosexternosenviogeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajosexternosenviogeneral_impl.this.AV14Emprcod = GXv_char2[0] ;
      trabajosexternosenviogeneral_impl.this.AV15Emprnom = GXv_char3[0] ;
      trabajosexternosenviogeneral_impl.this.AV16Usurcod = GXv_char4[0] ;
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

   protected void e1417Y2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtSalExtEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEst_Visible), 5, 0), true);
      edtSalExtLis_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtLis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtLis_Visible), 5, 0), true);
      edtSalExtSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Visible), 5, 0), true);
      edtSalExUln_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExUln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExUln_Visible), 5, 0), true);
      edtSalExtAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Visible), 5, 0), true);
      edtSalCodeID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalCodeID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Visible), 5, 0), true);
      edtSalEnvAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalEnvAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalEnvAT_Visible), 5, 0), true);
      edtSalFmdD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalFmdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmdD_Visible), 5, 0), true);
      edtSalGrossT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalGrossT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Visible), 5, 0), true);
      edtSalFmd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalFmd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Visible), 5, 0), true);
      edtSalFhh_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalFhh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "BIARPR", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtSalExtPre1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtPre1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPre1_Visible), 5, 0), true);
         divSalextpre1_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSalextpre1_cell_Internalname, "Class", divSalextpre1_cell_Class, true);
      }
      else
      {
         edtSalExtPre1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSalExtPre1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPre1_Visible), 5, 0), true);
         divSalextpre1_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divSalextpre1_cell_Internalname, "Class", divSalextpre1_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV17Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TrabajosExternosEnvio" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A2253SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
      pa17Y2( ) ;
      ws17Y2( ) ;
      we17Y2( ) ;
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
      sCtrlA2253SalExtAlb = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa17Y2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "trabajosexternosenviogeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa17Y2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A2253SalExtAlb != wcpOA2253SalExtAlb ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA2253SalExtAlb = A2253SalExtAlb ;
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
      sCtrlA2253SalExtAlb = httpContext.cgiGet( sPrefix+"A2253SalExtAlb_CTRL") ;
      if ( GXutil.len( sCtrlA2253SalExtAlb) > 0 )
      {
         A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA2253SalExtAlb), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      else
      {
         A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A2253SalExtAlb_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa17Y2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws17Y2( ) ;
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
      ws17Y2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A2253SalExtAlb_PARM", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA2253SalExtAlb)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A2253SalExtAlb_CTRL", GXutil.rtrim( sCtrlA2253SalExtAlb));
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
      we17Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211682176", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternosenviogeneral.js", "?20268211682177", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtSalExtAlb_Internalname = sPrefix+"SALEXTALB" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtSalExtFec_Internalname = sPrefix+"SALEXTFEC" ;
      edtSalExtHor_Internalname = sPrefix+"SALEXTHOR" ;
      edtSalFecEnt_Internalname = sPrefix+"SALFECENT" ;
      edtSalExtUsu_Internalname = sPrefix+"SALEXTUSU" ;
      edtSalSts_Internalname = sPrefix+"SALSTS" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtManCod_Internalname = sPrefix+"MANCOD" ;
      edtSalExtPre1_Internalname = sPrefix+"SALEXTPRE1" ;
      divSalextpre1_cell_Internalname = sPrefix+"SALEXTPRE1_CELL" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtSalExtMat_Internalname = sPrefix+"SALEXTMAT" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtSalExtObs_Internalname = sPrefix+"SALEXTOBS" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtSalExtEst_Internalname = sPrefix+"SALEXTEST" ;
      edtSalExtLis_Internalname = sPrefix+"SALEXTLIS" ;
      edtSalExtSec_Internalname = sPrefix+"SALEXTSEC" ;
      edtSalExUln_Internalname = sPrefix+"SALEXULN" ;
      edtSalExtAT_Internalname = sPrefix+"SALEXTAT" ;
      edtSalCodeID_Internalname = sPrefix+"SALCODEID" ;
      edtSalEnvAT_Internalname = sPrefix+"SALENVAT" ;
      edtSalFmdD_Internalname = sPrefix+"SALFMDD" ;
      edtSalGrossT_Internalname = sPrefix+"SALGROSST" ;
      edtSalFmd_Internalname = sPrefix+"SALFMD" ;
      edtSalFhh_Internalname = sPrefix+"SALFHH" ;
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
      edtSalFhh_Jsonclick = "" ;
      edtSalFhh_Visible = 1 ;
      edtSalFmd_Visible = 1 ;
      edtSalGrossT_Jsonclick = "" ;
      edtSalGrossT_Visible = 1 ;
      edtSalFmdD_Visible = 1 ;
      edtSalEnvAT_Jsonclick = "" ;
      edtSalEnvAT_Visible = 1 ;
      edtSalCodeID_Jsonclick = "" ;
      edtSalCodeID_Visible = 1 ;
      edtSalExtAT_Jsonclick = "" ;
      edtSalExtAT_Visible = 1 ;
      edtSalExUln_Jsonclick = "" ;
      edtSalExUln_Visible = 1 ;
      edtSalExtSec_Jsonclick = "" ;
      edtSalExtSec_Visible = 1 ;
      edtSalExtLis_Jsonclick = "" ;
      edtSalExtLis_Visible = 1 ;
      edtSalExtEst_Jsonclick = "" ;
      edtSalExtEst_Visible = 1 ;
      edtSalExtObs_Enabled = 0 ;
      edtSalExtMat_Jsonclick = "" ;
      edtSalExtMat_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtSalExtPre1_Jsonclick = "" ;
      edtSalExtPre1_Enabled = 0 ;
      edtSalExtPre1_Visible = 1 ;
      divSalextpre1_cell_Class = "col-xs-12 col-sm-6" ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 0 ;
      edtSalSts_Jsonclick = "" ;
      edtSalSts_Enabled = 0 ;
      edtSalExtUsu_Jsonclick = "" ;
      edtSalExtUsu_Enabled = 0 ;
      edtSalFecEnt_Jsonclick = "" ;
      edtSalFecEnt_Enabled = 0 ;
      edtSalExtHor_Jsonclick = "" ;
      edtSalExtHor_Enabled = 0 ;
      edtSalExtFec_Jsonclick = "" ;
      edtSalExtFec_Enabled = 0 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Enabled = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e1117Y1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e1217Y1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[]");
      setEventMetadata("VALID_MANCOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A13847ManNomID = "" ;
      A13738TrnCNom = "" ;
      h2248ManCod = "" ;
      h840TrnCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A8655SalFecEnt = GXutil.nullDate() ;
      A7368SalExtUsu = "" ;
      A10080SalSts = "" ;
      A13244SalExtPre1 = DecimalUtil.ZERO ;
      A6397SalExtMat = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A3554SalExtObs = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A2254SalExtSec = "" ;
      A10767SalExtAT = "" ;
      A10742SalCodeID = "" ;
      A10079SalFmdD = "" ;
      A10078SalGrossT = DecimalUtil.ZERO ;
      A10077SalFmd = "" ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13847ManNomID = "" ;
      H017Y2_A13847ManNomID = new String[] {""} ;
      l13738TrnCNom = "" ;
      H017Y3_A13738TrnCNom = new String[] {""} ;
      H017Y4_A13847ManNomID = new String[] {""} ;
      H017Y4_A396EmprCod = new String[] {""} ;
      H017Y4_A2248ManCod = new short[1] ;
      H017Y5_A13738TrnCNom = new String[] {""} ;
      H017Y5_A396EmprCod = new String[] {""} ;
      H017Y5_A840TrnCod = new short[1] ;
      H017Y5_n840TrnCod = new boolean[] {false} ;
      AV17Pgmname = "" ;
      H017Y6_A3554SalExtObs = new String[] {""} ;
      H017Y6_A396EmprCod = new String[] {""} ;
      H017Y6_A2253SalExtAlb = new int[1] ;
      H017Y6_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      H017Y6_A10077SalFmd = new String[] {""} ;
      H017Y6_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H017Y6_A10079SalFmdD = new String[] {""} ;
      H017Y6_A10741SalEnvAT = new byte[1] ;
      H017Y6_A10742SalCodeID = new String[] {""} ;
      H017Y6_A10767SalExtAT = new String[] {""} ;
      H017Y6_A6247SalExUln = new short[1] ;
      H017Y6_A2254SalExtSec = new String[] {""} ;
      H017Y6_A2258SalExtLis = new byte[1] ;
      H017Y6_A2257SalExtEst = new byte[1] ;
      H017Y6_A6397SalExtMat = new String[] {""} ;
      H017Y6_A840TrnCod = new short[1] ;
      H017Y6_n840TrnCod = new boolean[] {false} ;
      H017Y6_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H017Y6_A2248ManCod = new short[1] ;
      H017Y6_A10080SalSts = new String[] {""} ;
      H017Y6_A7368SalExtUsu = new String[] {""} ;
      H017Y6_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H017Y6_A6396SalExtHor = new String[] {""} ;
      H017Y6_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      H017Y7_A13847ManNomID = new String[] {""} ;
      H017Y7_A396EmprCod = new String[] {""} ;
      H017Y7_A2248ManCod = new short[1] ;
      H017Y8_A13738TrnCNom = new String[] {""} ;
      H017Y8_A396EmprCod = new String[] {""} ;
      H017Y8_A840TrnCod = new short[1] ;
      H017Y8_n840TrnCod = new boolean[] {false} ;
      H017Y9_A13847ManNomID = new String[] {""} ;
      H017Y9_A396EmprCod = new String[] {""} ;
      H017Y9_A2248ManCod = new short[1] ;
      H017Y10_A13738TrnCNom = new String[] {""} ;
      H017Y10_A396EmprCod = new String[] {""} ;
      H017Y10_A840TrnCod = new short[1] ;
      H017Y10_n840TrnCod = new boolean[] {false} ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV14Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA2253SalExtAlb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenviogeneral__default(),
         new Object[] {
             new Object[] {
            H017Y2_A13847ManNomID
            }
            , new Object[] {
            H017Y3_A13738TrnCNom
            }
            , new Object[] {
            H017Y4_A13847ManNomID, H017Y4_A396EmprCod, H017Y4_A2248ManCod
            }
            , new Object[] {
            H017Y5_A13738TrnCNom, H017Y5_A396EmprCod, H017Y5_A840TrnCod
            }
            , new Object[] {
            H017Y6_A3554SalExtObs, H017Y6_A396EmprCod, H017Y6_A2253SalExtAlb, H017Y6_A10076SalFhh, H017Y6_A10077SalFmd, H017Y6_A10078SalGrossT, H017Y6_A10079SalFmdD, H017Y6_A10741SalEnvAT, H017Y6_A10742SalCodeID, H017Y6_A10767SalExtAT,
            H017Y6_A6247SalExUln, H017Y6_A2254SalExtSec, H017Y6_A2258SalExtLis, H017Y6_A2257SalExtEst, H017Y6_A6397SalExtMat, H017Y6_A840TrnCod, H017Y6_n840TrnCod, H017Y6_A13244SalExtPre1, H017Y6_A2248ManCod, H017Y6_A10080SalSts,
            H017Y6_A7368SalExtUsu, H017Y6_A8655SalFecEnt, H017Y6_A6396SalExtHor, H017Y6_A2256SalExtFec
            }
            , new Object[] {
            H017Y7_A13847ManNomID, H017Y7_A396EmprCod, H017Y7_A2248ManCod
            }
            , new Object[] {
            H017Y8_A13738TrnCNom, H017Y8_A396EmprCod, H017Y8_A840TrnCod
            }
            , new Object[] {
            H017Y9_A13847ManNomID, H017Y9_A396EmprCod, H017Y9_A2248ManCod
            }
            , new Object[] {
            H017Y10_A13738TrnCNom, H017Y10_A396EmprCod, H017Y10_A840TrnCod
            }
         }
      );
      AV17Pgmname = "TrabajosExternosEnvioGeneral" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TrabajosExternosEnvioGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A2257SalExtEst ;
   private byte A2258SalExtLis ;
   private byte A10741SalEnvAT ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short A2248ManCod ;
   private short A840TrnCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A6247SalExUln ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA2253SalExtAlb ;
   private int A2253SalExtAlb ;
   private int edtSalExtAlb_Enabled ;
   private int edtSalExtFec_Enabled ;
   private int edtSalExtHor_Enabled ;
   private int edtSalFecEnt_Enabled ;
   private int edtSalExtUsu_Enabled ;
   private int edtSalSts_Enabled ;
   private int edtManCod_Enabled ;
   private int edtSalExtPre1_Visible ;
   private int edtSalExtPre1_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtSalExtMat_Enabled ;
   private int edtSalExtObs_Enabled ;
   private int edtSalExtEst_Visible ;
   private int edtSalExtLis_Visible ;
   private int edtSalExtSec_Visible ;
   private int edtSalExUln_Visible ;
   private int edtSalExtAT_Visible ;
   private int edtSalCodeID_Visible ;
   private int edtSalEnvAT_Visible ;
   private int edtSalFmdD_Visible ;
   private int edtSalGrossT_Visible ;
   private int edtSalFmd_Visible ;
   private int edtSalFhh_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A13244SalExtPre1 ;
   private java.math.BigDecimal A10078SalGrossT ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtSalExtAlb_Internalname ;
   private String edtSalExtAlb_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtSalExtFec_Internalname ;
   private String edtSalExtFec_Jsonclick ;
   private String edtSalExtHor_Internalname ;
   private String A6396SalExtHor ;
   private String edtSalExtHor_Jsonclick ;
   private String edtSalFecEnt_Internalname ;
   private String edtSalFecEnt_Jsonclick ;
   private String edtSalExtUsu_Internalname ;
   private String A7368SalExtUsu ;
   private String edtSalExtUsu_Jsonclick ;
   private String edtSalSts_Internalname ;
   private String A10080SalSts ;
   private String edtSalSts_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String divSalextpre1_cell_Internalname ;
   private String divSalextpre1_cell_Class ;
   private String edtSalExtPre1_Internalname ;
   private String edtSalExtPre1_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtSalExtMat_Internalname ;
   private String A6397SalExtMat ;
   private String edtSalExtMat_Jsonclick ;
   private String edtSalExtObs_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtSalExtEst_Internalname ;
   private String edtSalExtEst_Jsonclick ;
   private String edtSalExtLis_Internalname ;
   private String edtSalExtLis_Jsonclick ;
   private String edtSalExtSec_Internalname ;
   private String A2254SalExtSec ;
   private String edtSalExtSec_Jsonclick ;
   private String edtSalExUln_Internalname ;
   private String edtSalExUln_Jsonclick ;
   private String edtSalExtAT_Internalname ;
   private String A10767SalExtAT ;
   private String edtSalExtAT_Jsonclick ;
   private String edtSalCodeID_Internalname ;
   private String A10742SalCodeID ;
   private String edtSalCodeID_Jsonclick ;
   private String edtSalEnvAT_Internalname ;
   private String edtSalEnvAT_Jsonclick ;
   private String edtSalFmdD_Internalname ;
   private String A10079SalFmdD ;
   private String edtSalGrossT_Internalname ;
   private String edtSalGrossT_Jsonclick ;
   private String edtSalFmd_Internalname ;
   private String A10077SalFmd ;
   private String edtSalFhh_Internalname ;
   private String edtSalFhh_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV17Pgmname ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA2253SalExtAlb ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A8655SalFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n840TrnCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A3554SalExtObs ;
   private String A13847ManNomID ;
   private String A13738TrnCNom ;
   private String h2248ManCod ;
   private String h840TrnCod ;
   private String l13847ManNomID ;
   private String l13738TrnCNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private IDataStoreProvider pr_default ;
   private String[] H017Y2_A13847ManNomID ;
   private String[] H017Y3_A13738TrnCNom ;
   private String[] H017Y4_A13847ManNomID ;
   private String[] H017Y4_A396EmprCod ;
   private short[] H017Y4_A2248ManCod ;
   private String[] H017Y5_A13738TrnCNom ;
   private String[] H017Y5_A396EmprCod ;
   private short[] H017Y5_A840TrnCod ;
   private boolean[] H017Y5_n840TrnCod ;
   private String[] H017Y6_A3554SalExtObs ;
   private String[] H017Y6_A396EmprCod ;
   private int[] H017Y6_A2253SalExtAlb ;
   private java.util.Date[] H017Y6_A10076SalFhh ;
   private String[] H017Y6_A10077SalFmd ;
   private java.math.BigDecimal[] H017Y6_A10078SalGrossT ;
   private String[] H017Y6_A10079SalFmdD ;
   private byte[] H017Y6_A10741SalEnvAT ;
   private String[] H017Y6_A10742SalCodeID ;
   private String[] H017Y6_A10767SalExtAT ;
   private short[] H017Y6_A6247SalExUln ;
   private String[] H017Y6_A2254SalExtSec ;
   private byte[] H017Y6_A2258SalExtLis ;
   private byte[] H017Y6_A2257SalExtEst ;
   private String[] H017Y6_A6397SalExtMat ;
   private short[] H017Y6_A840TrnCod ;
   private boolean[] H017Y6_n840TrnCod ;
   private java.math.BigDecimal[] H017Y6_A13244SalExtPre1 ;
   private short[] H017Y6_A2248ManCod ;
   private String[] H017Y6_A10080SalSts ;
   private String[] H017Y6_A7368SalExtUsu ;
   private java.util.Date[] H017Y6_A8655SalFecEnt ;
   private String[] H017Y6_A6396SalExtHor ;
   private java.util.Date[] H017Y6_A2256SalExtFec ;
   private String[] H017Y7_A13847ManNomID ;
   private String[] H017Y7_A396EmprCod ;
   private short[] H017Y7_A2248ManCod ;
   private String[] H017Y8_A13738TrnCNom ;
   private String[] H017Y8_A396EmprCod ;
   private short[] H017Y8_A840TrnCod ;
   private boolean[] H017Y8_n840TrnCod ;
   private String[] H017Y9_A13847ManNomID ;
   private String[] H017Y9_A396EmprCod ;
   private short[] H017Y9_A2248ManCod ;
   private String[] H017Y10_A13738TrnCNom ;
   private String[] H017Y10_A396EmprCod ;
   private short[] H017Y10_A840TrnCod ;
   private boolean[] H017Y10_n840TrnCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class trabajosexternosenviogeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H017Y2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID FROM TXPMANUFA WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, '')))) like '%' || UPPER(?)) ORDER BY ManNomID) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017Y3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017Y4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017Y5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017Y6", "SELECT SalExtObs, EmprCod, SalExtAlb, SalFhh, SalFmd, SalGrossT, SalFmdD, SalEnvAT, SalCodeID, SalExtAT, SalExUln, SalExtSec, SalExtLis, SalExtEst, SalExtMat, TrnCod, SalExtPre1, ManCod, SalSts, SalExtUsu, SalFecEnt, SalExtHor, SalExtFec FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H017Y7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H017Y8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H017Y9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) AS ManNomID, EmprCod, ManCod FROM TXPMANUFA WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ManCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ManNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H017Y10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 8);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

