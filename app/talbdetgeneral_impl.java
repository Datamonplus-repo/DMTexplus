package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdetgeneral_impl extends GXWebComponent
{
   public talbdetgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdetgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdetgeneral_impl.class ));
   }

   public talbdetgeneral_impl( int remoteHandle ,
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
      dynCliCod = new HTMLChoice();
      dynAlbRef = new HTMLChoice();
      dynProceCod = new HTMLChoice();
      dynTrnCod = new HTMLChoice();
      dynTipEntCod = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A44AlbRecCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaclicodB72( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"ALBREF") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaalbrefB72( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"PROCECOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlaprocecodB72( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"TRNCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlatrncodB72( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"TIPENTCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlatipentcodB72( A396EmprCod) ;
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
         paB72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TALBDETGeneral", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdetgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA44AlbRecCod", GXutil.ltrim( localUtil.ntoc( wcpOA44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseFormB72( )
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
      return "TALBDETGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TALBDETGeneral", "") ;
   }

   public void wbB70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.talbdetgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDETGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCliCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynCliCod.getInternalname(), httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCliCod, dynCliCod.getInternalname(), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), 1, dynCliCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynCliCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynAlbRef.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynAlbRef.getInternalname(), httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynAlbRef, dynAlbRef.getInternalname(), GXutil.rtrim( A45AlbRef), 1, dynAlbRef.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, dynAlbRef.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynProceCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynProceCod.getInternalname(), httpContext.getMessage( "Codigo Procedencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynProceCod, dynProceCod.getInternalname(), GXutil.trim( GXutil.str( A970ProceCod, 4, 0)), 1, dynProceCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynProceCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynTrnCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynTrnCod.getInternalname(), httpContext.getMessage( "Codigo Transportista", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynTrnCod, dynTrnCod.getInternalname(), GXutil.trim( GXutil.str( A840TrnCod, 4, 0)), 1, dynTrnCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", httpContext.getMessage( "Codigo Transportista", ""), 1, dynTrnCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynTipEntCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynTipEntCod.getInternalname(), httpContext.getMessage( "Tipo Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynTipEntCod, dynTipEntCod.getInternalname(), GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)), 1, dynTipEntCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynTipEntCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_60_B72( true) ;
      }
      else
      {
         wb_table1_60_B72( false) ;
      }
      return  ;
   }

   public void wb_table1_60_B72e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup10_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPml_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup12_Internalname, httpContext.getMessage( "Tejido Blanco Quimico o Optico, valores", ""), 1, 0, "px", 0, "px", grpUnnamedgroup12_Class, "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPh_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPh_Internalname, GXutil.ltrim( localUtil.ntoc( A13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPh_Enabled!=0) ? localUtil.format( A13241AlbRPh, "ZZ9.99") : localUtil.format( A13241AlbRPh, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRRLong_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRRLong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRLong_Enabled!=0) ? localUtil.format( A13242AlbRRLong, "ZZ9.99") : localUtil.format( A13242AlbRRLong, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRLong_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRLong_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRRTrans_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRRTrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRTrans_Internalname, GXutil.ltrim( localUtil.ntoc( A13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRTrans_Enabled!=0) ? localUtil.format( A13243AlbRRTrans, "ZZ9.99") : localUtil.format( A13243AlbRRTrans, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRTrans_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRTrans_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11b71_client"+"'", TempTags, "", 2, "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12b71_client"+"'", TempTags, "", 2, "HLP_TALBDETGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPie_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetPie_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtr_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgm_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtrU_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgmU_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrD_Internalname, GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrD_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtrD_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmD_Internalname, GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmD_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgmD_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPieU_Internalname, GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPieU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetPieU_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSumKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A10758SumKgs, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumKgs_Jsonclick, 0, "Attribute", "", "", "", "", edtSumKgs_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSumMts_Internalname, GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A10759SumMts, "ZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumMts_Jsonclick, 0, "Attribute", "", "", "", "", edtSumMts_Visible, 0, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtSumPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10760SumPzs), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumPzs_Jsonclick, 0, "Attribute", "", "", "", "", edtSumPzs_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRPieReb_Visible, 0, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10761AlbUltP), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUltP_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbUltP_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbNumEti_Visible, 0, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRefDsc_Visible, 0, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startB72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TALBDETGeneral", ""), (short)(0)) ;
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
            strupB70( ) ;
         }
      }
   }

   public void wsB72( )
   {
      startB72( ) ;
      evtB72( ) ;
   }

   public void evtB72( )
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
                              strupB70( ) ;
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
                              strupB70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13B72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupB70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14B72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupB70( ) ;
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
                              strupB70( ) ;
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

   public void weB72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormB72( ) ;
         }
      }
   }

   public void paB72( )
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

   public void gxdlaclicodB72( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaclicod_dataB72( A396EmprCod) ;
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

   public void gxaclicod_htmlB72( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlaclicod_dataB72( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCliCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynCliCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   protected void gxdlaclicod_dataB72( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00B72 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00B72_A252CliCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00B72_A279CliNom[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlaalbrefB72( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaalbref_dataB72( A396EmprCod) ;
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

   public void gxaalbref_htmlB72( String A396EmprCod )
   {
      String gxdynajaxvalue;
      gxdlaalbref_dataB72( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynAlbRef.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynAlbRef.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
      }
   }

   protected void gxdlaalbref_dataB72( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00B73 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00B73_A65ArtCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00B73_A69ArtDsc[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxdlaprocecodB72( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprocecod_dataB72( A396EmprCod) ;
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

   public void gxaprocecod_htmlB72( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaprocecod_dataB72( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynProceCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynProceCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynProceCod.getItemCount() > 0 )
      {
         A970ProceCod = (short)(GXutil.lval( dynProceCod.getValidValue(GXutil.trim( GXutil.str( A970ProceCod, 4, 0))))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
   }

   protected void gxdlaprocecod_dataB72( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00B74 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00B74_A970ProceCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00B74_A971ProceNom[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxdlatrncodB72( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlatrncod_dataB72( A396EmprCod) ;
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

   public void gxatrncod_htmlB72( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlatrncod_dataB72( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynTrnCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynTrnCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynTrnCod.getItemCount() > 0 )
      {
         A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValidValue(GXutil.trim( GXutil.str( A840TrnCod, 4, 0))))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   protected void gxdlatrncod_dataB72( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00B75 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00B75_A840TrnCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00B75_A841TrnNom[0]));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxdlatipentcodB72( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlatipentcod_dataB72( A396EmprCod) ;
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

   public void gxatipentcod_htmlB72( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlatipentcod_dataB72( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynTipEntCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynTipEntCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynTipEntCod.getItemCount() > 0 )
      {
         A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValidValue(GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
   }

   protected void gxdlatipentcod_dataB72( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00B76 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00B76_A1211TipEntCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00B76_A1212TipEntNom[0]));
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxaclicod_htmlB72( A396EmprCod) ;
         gxaalbref_htmlB72( A396EmprCod) ;
         gxaprocecod_htmlB72( A396EmprCod) ;
         gxatrncod_htmlB72( A396EmprCod) ;
         gxatipentcod_htmlB72( A396EmprCod) ;
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      }
      if ( dynProceCod.getItemCount() > 0 )
      {
         A970ProceCod = (short)(GXutil.lval( dynProceCod.getValidValue(GXutil.trim( GXutil.str( A970ProceCod, 4, 0))))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
      }
      if ( dynTrnCod.getItemCount() > 0 )
      {
         A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValidValue(GXutil.trim( GXutil.str( A840TrnCod, 4, 0))))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
      }
      if ( dynTipEntCod.getItemCount() > 0 )
      {
         A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValidValue(GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfB72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV17Pgmname = "TALBDETGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfB72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00B78 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A3613AlbRefDsc = H00B78_A3613AlbRefDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3613AlbRefDsc", A3613AlbRefDsc);
            A1222AlbNumEti = H00B78_A1222AlbNumEti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
            A10761AlbUltP = H00B78_A10761AlbUltP[0] ;
            n10761AlbUltP = H00B78_n10761AlbUltP[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
            A53AlbRPieReb = H00B78_A53AlbRPieReb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
            A13243AlbRRTrans = H00B78_A13243AlbRRTrans[0] ;
            n13243AlbRRTrans = H00B78_n13243AlbRRTrans[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            A13242AlbRRLong = H00B78_A13242AlbRRLong[0] ;
            n13242AlbRRLong = H00B78_n13242AlbRRLong[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            A13241AlbRPh = H00B78_A13241AlbRPh[0] ;
            n13241AlbRPh = H00B78_n13241AlbRPh[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            A4922AlbPml = H00B78_A4922AlbPml[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            A4921AlbRAnc = H00B78_A4921AlbRAnc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            A4920AlbRGrm2 = H00B78_A4920AlbRGrm2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            A6463AlbRLote = H00B78_A6463AlbRLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6463AlbRLote", A6463AlbRLote);
            A55AlbRReo = H00B78_A55AlbRReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
            A50AlbRLoc = H00B78_A50AlbRLoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50AlbRLoc", A50AlbRLoc);
            A47AlbREst = H00B78_A47AlbREst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            A48AlbRFecUlt = H00B78_A48AlbRFecUlt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            A8029AlbNumM = H00B78_A8029AlbNumM[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8029AlbNumM", A8029AlbNumM);
            A6181AlbrPieC = H00B78_A6181AlbrPieC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            A6180AlbrUniC = H00B78_A6180AlbrUniC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            A1291AlbRDes = H00B78_A1291AlbRDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1291AlbRDes", A1291AlbRDes);
            A1211TipEntCod = H00B78_A1211TipEntCod[0] ;
            n1211TipEntCod = H00B78_n1211TipEntCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A840TrnCod = H00B78_A840TrnCod[0] ;
            n840TrnCod = H00B78_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A970ProceCod = H00B78_A970ProceCod[0] ;
            n970ProceCod = H00B78_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            A45AlbRef = H00B78_A45AlbRef[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
            A252CliCod = H00B78_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A49AlbRFen = H00B78_A49AlbRFen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            A5806AlbREnt2 = H00B78_A5806AlbREnt2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5806AlbREnt2", A5806AlbREnt2);
            A46AlbREnt = H00B78_A46AlbREnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46AlbREnt", A46AlbREnt);
            A10760SumPzs = H00B78_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            A10759SumMts = H00B78_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10758SumKgs = H00B78_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A2152AlbDetPie = H00B78_A2152AlbDetPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A54AlbRPieUti = H00B78_A54AlbRPieUti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A52AlbRPieEnt = H00B78_A52AlbRPieEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A60AlbRUniUti = H00B78_A60AlbRUniUti[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A58AlbRUniEnt = H00B78_A58AlbRUniEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            A2151AlbDetMtrU = H00B78_A2151AlbDetMtrU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2149AlbDetMtr = H00B78_A2149AlbDetMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2148AlbDetKgmU = H00B78_A2148AlbDetKgmU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A2146AlbDetKgm = H00B78_A2146AlbDetKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A56AlbRUni = H00B78_A56AlbRUni[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
            A10760SumPzs = H00B78_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            A10759SumMts = H00B78_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10758SumKgs = H00B78_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A2152AlbDetPie = H00B78_A2152AlbDetPie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2151AlbDetMtrU = H00B78_A2151AlbDetMtrU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2149AlbDetMtr = H00B78_A2149AlbDetMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2148AlbDetKgmU = H00B78_A2148AlbDetKgmU[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A2146AlbDetKgm = H00B78_A2146AlbDetKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
               {
                  A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               }
               else
               {
                  A2153AlbDetPieU = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               }
            }
            gxaclicod_htmlB72( A396EmprCod) ;
            gxaalbref_htmlB72( A396EmprCod) ;
            gxaprocecod_htmlB72( A396EmprCod) ;
            gxatrncod_htmlB72( A396EmprCod) ;
            gxatipentcod_htmlB72( A396EmprCod) ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            /* Execute user event: Load */
            e14B72 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         wbB70( ) ;
      }
   }

   public void send_integrity_lvl_hashesB72( )
   {
   }

   public void before_start_formulas( )
   {
      AV17Pgmname = "TALBDETGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00B79 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      A407EmprNom = H00B79_A407EmprNom[0] ;
      n407EmprNom = H00B79_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      gxaclicod_htmlB72( A396EmprCod) ;
      gxaalbref_htmlB72( A396EmprCod) ;
      gxaprocecod_htmlB72( A396EmprCod) ;
      gxatrncod_htmlB72( A396EmprCod) ;
      gxatipentcod_htmlB72( A396EmprCod) ;
      /* Using cursor H00B711 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A10760SumPzs = H00B711_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10759SumMts = H00B711_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10758SumKgs = H00B711_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A2152AlbDetPie = H00B711_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2151AlbDetMtrU = H00B711_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2149AlbDetMtr = H00B711_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2148AlbDetKgmU = H00B711_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A2146AlbDetKgm = H00B711_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
      }
      else
      {
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
      }
      pr_default.close(7);
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      pr_default.close(6);
      pr_default.close(7);
      fix_multi_value_controls( ) ;
   }

   public void strupB70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13B72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5806AlbREnt2", A5806AlbREnt2);
         A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         dynCliCod.setValue( httpContext.cgiGet( dynCliCod.getInternalname()) );
         A252CliCod = (int)(GXutil.lval( httpContext.cgiGet( dynCliCod.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         dynAlbRef.setValue( httpContext.cgiGet( dynAlbRef.getInternalname()) );
         A45AlbRef = httpContext.cgiGet( dynAlbRef.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", A45AlbRef);
         dynProceCod.setValue( httpContext.cgiGet( dynProceCod.getInternalname()) );
         A970ProceCod = (short)(GXutil.lval( httpContext.cgiGet( dynProceCod.getInternalname()))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         dynTrnCod.setValue( httpContext.cgiGet( dynTrnCod.getInternalname()) );
         A840TrnCod = (short)(GXutil.lval( httpContext.cgiGet( dynTrnCod.getInternalname()))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         dynTipEntCod.setValue( httpContext.cgiGet( dynTipEntCod.getInternalname()) );
         A1211TipEntCod = (short)(GXutil.lval( httpContext.cgiGet( dynTipEntCod.getInternalname()))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1291AlbRDes", A1291AlbRDes);
         A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8029AlbNumM", A8029AlbNumM);
         A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A50AlbRLoc", A50AlbRLoc);
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", A55AlbRReo);
         A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6463AlbRLote", A6463AlbRLote);
         A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A13241AlbRPh = localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)) ;
         n13241AlbRPh = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)) ;
         n13242AlbRRLong = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)) ;
         n13243AlbRRTrans = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A2152AlbDetPie = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A2150AlbDetMtrD = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2153AlbDetPieU = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPieU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A10758SumKgs = localUtil.ctond( httpContext.cgiGet( edtSumKgs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = localUtil.ctond( httpContext.cgiGet( edtSumMts_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtSumPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3613AlbRefDsc", A3613AlbRefDsc);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         gxaclicod_htmlB72( A396EmprCod) ;
         gxaalbref_htmlB72( A396EmprCod) ;
         gxaprocecod_htmlB72( A396EmprCod) ;
         gxatrncod_htmlB72( A396EmprCod) ;
         gxatipentcod_htmlB72( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e13B72 ();
      if (returnInSub) return;
   }

   public void e13B72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdetgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdetgeneral_impl.this.AV14Emprcod = GXv_char2[0] ;
      talbdetgeneral_impl.this.AV15Emprnom = GXv_char3[0] ;
      talbdetgeneral_impl.this.AV16Usurcod = GXv_char4[0] ;
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

   protected void e14B72( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtAlbDetPie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPie_Visible), 5, 0), true);
      edtAlbDetMtr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtr_Visible), 5, 0), true);
      edtAlbDetKgm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgm_Visible), 5, 0), true);
      edtAlbDetMtrU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetMtrU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrU_Visible), 5, 0), true);
      edtAlbDetKgmU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetKgmU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmU_Visible), 5, 0), true);
      edtAlbDetMtrD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetMtrD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrD_Visible), 5, 0), true);
      edtAlbDetKgmD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetKgmD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmD_Visible), 5, 0), true);
      edtAlbDetPieU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDetPieU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPieU_Visible), 5, 0), true);
      edtSumKgs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSumKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumKgs_Visible), 5, 0), true);
      edtSumMts_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSumMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumMts_Visible), 5, 0), true);
      edtSumPzs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtSumPzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPzs_Visible), 5, 0), true);
      edtAlbRPieReb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieReb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Visible), 5, 0), true);
      edtAlbUltP_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbUltP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Visible), 5, 0), true);
      edtAlbNumEti_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbNumEti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Visible), 5, 0), true);
      edtAlbRefDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbREnt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
         divAlbrent_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         edtAlbREnt_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
         divAlbrent_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbREnt2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
         divAlbrent2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         edtAlbREnt2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
         divAlbrent2_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
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
         grpUnnamedgroup12_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, grpUnnamedgroup12_Internalname, "Class", grpUnnamedgroup12_Class, true);
      }
      else
      {
         grpUnnamedgroup12_Class = "Group" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, grpUnnamedgroup12_Internalname, "Class", grpUnnamedgroup12_Class, true);
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
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBDET" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_60_B72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedgroup4_Internalname, tblTablemergedunnamedgroup4_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Entradas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Und Ent", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUniC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Und Cli", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrPieC_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbNumM_Internalname, httpContext.getMessage( "Nº Marcado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Stock", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDETGeneral.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-7 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-5 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFecUlt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDETGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDETGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-6 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-6 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDETGeneral.htm");
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_60_B72e( true) ;
      }
      else
      {
         wb_table1_60_B72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      paB72( ) ;
      wsB72( ) ;
      weB72( ) ;
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
      sCtrlA44AlbRecCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paB72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "talbdetgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paB72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A44AlbRecCod != wcpOA44AlbRecCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA44AlbRecCod = A44AlbRecCod ;
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
      sCtrlA44AlbRecCod = httpContext.cgiGet( sPrefix+"A44AlbRecCod_CTRL") ;
      if ( GXutil.len( sCtrlA44AlbRecCod) > 0 )
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA44AlbRecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A44AlbRecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paB72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsB72( ) ;
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
      wsB72( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A44AlbRecCod_PARM", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA44AlbRecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A44AlbRecCod_CTRL", GXutil.rtrim( sCtrlA44AlbRecCod));
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
      weB72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511379", true, true);
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
      httpContext.AddJavascriptSource("talbdetgeneral.js", "?20268241511379", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT" ;
      divAlbrent_cell_Internalname = sPrefix+"ALBRENT_CELL" ;
      edtAlbREnt2_Internalname = sPrefix+"ALBRENT2" ;
      divAlbrent2_cell_Internalname = sPrefix+"ALBRENT2_CELL" ;
      edtAlbRFen_Internalname = sPrefix+"ALBRFEN" ;
      dynCliCod.setInternalname( sPrefix+"CLICOD" );
      dynAlbRef.setInternalname( sPrefix+"ALBREF" );
      dynProceCod.setInternalname( sPrefix+"PROCECOD" );
      dynTrnCod.setInternalname( sPrefix+"TRNCOD" );
      dynTipEntCod.setInternalname( sPrefix+"TIPENTCOD" );
      edtAlbRDes_Internalname = sPrefix+"ALBRDES" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      grpUnnamedgroup2_Internalname = sPrefix+"UNNAMEDGROUP2" ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI" );
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT" ;
      edtAlbrUniC_Internalname = sPrefix+"ALBRUNIC" ;
      edtAlbrPieC_Internalname = sPrefix+"ALBRPIEC" ;
      edtAlbNumM_Internalname = sPrefix+"ALBNUMM" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = sPrefix+"UNNAMEDGROUP4" ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS" ;
      edtAlbRFecUlt_Internalname = sPrefix+"ALBRFECULT" ;
      cmbAlbREst.setInternalname( sPrefix+"ALBREST" );
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = sPrefix+"UNNAMEDGROUP6" ;
      tblTablemergedunnamedgroup4_Internalname = sPrefix+"TABLEMERGEDUNNAMEDGROUP4" ;
      edtAlbRLoc_Internalname = sPrefix+"ALBRLOC" ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO" );
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = sPrefix+"UNNAMEDGROUP8" ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2" ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC" ;
      edtAlbPml_Internalname = sPrefix+"ALBPML" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      grpUnnamedgroup10_Internalname = sPrefix+"UNNAMEDGROUP10" ;
      edtAlbRPh_Internalname = sPrefix+"ALBRPH" ;
      edtAlbRRLong_Internalname = sPrefix+"ALBRRLONG" ;
      edtAlbRRTrans_Internalname = sPrefix+"ALBRRTRANS" ;
      divUnnamedtable11_Internalname = sPrefix+"UNNAMEDTABLE11" ;
      grpUnnamedgroup12_Internalname = sPrefix+"UNNAMEDGROUP12" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtAlbDetPie_Internalname = sPrefix+"ALBDETPIE" ;
      edtAlbDetMtr_Internalname = sPrefix+"ALBDETMTR" ;
      edtAlbDetKgm_Internalname = sPrefix+"ALBDETKGM" ;
      edtAlbDetMtrU_Internalname = sPrefix+"ALBDETMTRU" ;
      edtAlbDetKgmU_Internalname = sPrefix+"ALBDETKGMU" ;
      edtAlbDetMtrD_Internalname = sPrefix+"ALBDETMTRD" ;
      edtAlbDetKgmD_Internalname = sPrefix+"ALBDETKGMD" ;
      edtAlbDetPieU_Internalname = sPrefix+"ALBDETPIEU" ;
      edtSumKgs_Internalname = sPrefix+"SUMKGS" ;
      edtSumMts_Internalname = sPrefix+"SUMMTS" ;
      edtSumPzs_Internalname = sPrefix+"SUMPZS" ;
      edtAlbRPieReb_Internalname = sPrefix+"ALBRPIEREB" ;
      edtAlbUltP_Internalname = sPrefix+"ALBULTP" ;
      edtAlbNumEti_Internalname = sPrefix+"ALBNUMETI" ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC" ;
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
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Enabled = 0 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 0 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Visible = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Visible = 1 ;
      edtAlbUltP_Jsonclick = "" ;
      edtAlbUltP_Visible = 1 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Visible = 1 ;
      edtSumPzs_Jsonclick = "" ;
      edtSumPzs_Visible = 1 ;
      edtSumMts_Jsonclick = "" ;
      edtSumMts_Visible = 1 ;
      edtSumKgs_Jsonclick = "" ;
      edtSumKgs_Visible = 1 ;
      edtAlbDetPieU_Jsonclick = "" ;
      edtAlbDetPieU_Visible = 1 ;
      edtAlbDetKgmD_Jsonclick = "" ;
      edtAlbDetKgmD_Visible = 1 ;
      edtAlbDetMtrD_Jsonclick = "" ;
      edtAlbDetMtrD_Visible = 1 ;
      edtAlbDetKgmU_Jsonclick = "" ;
      edtAlbDetKgmU_Visible = 1 ;
      edtAlbDetMtrU_Jsonclick = "" ;
      edtAlbDetMtrU_Visible = 1 ;
      edtAlbDetKgm_Jsonclick = "" ;
      edtAlbDetKgm_Visible = 1 ;
      edtAlbDetMtr_Jsonclick = "" ;
      edtAlbDetMtr_Visible = 1 ;
      edtAlbDetPie_Jsonclick = "" ;
      edtAlbDetPie_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtAlbRRTrans_Jsonclick = "" ;
      edtAlbRRTrans_Enabled = 0 ;
      edtAlbRRLong_Jsonclick = "" ;
      edtAlbRRLong_Enabled = 0 ;
      edtAlbRPh_Jsonclick = "" ;
      edtAlbRPh_Enabled = 0 ;
      grpUnnamedgroup12_Class = "Group" ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 0 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 0 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 0 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 0 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 0 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 0 ;
      dynTipEntCod.setJsonclick( "" );
      dynTipEntCod.setEnabled( 0 );
      dynTrnCod.setJsonclick( "" );
      dynTrnCod.setEnabled( 0 );
      dynProceCod.setJsonclick( "" );
      dynProceCod.setEnabled( 0 );
      dynAlbRef.setJsonclick( "" );
      dynAlbRef.setEnabled( 0 );
      dynCliCod.setJsonclick( "" );
      dynCliCod.setEnabled( 0 );
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 0 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 0 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 0 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 0 ;
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
      dynCliCod.setName( "CLICOD" );
      dynCliCod.setWebtags( "" );
      dynAlbRef.setName( "ALBREF" );
      dynAlbRef.setWebtags( "" );
      dynProceCod.setName( "PROCECOD" );
      dynProceCod.setWebtags( "" );
      dynTrnCod.setName( "TRNCOD" );
      dynTrnCod.setWebtags( "" );
      dynTipEntCod.setName( "TIPENTCOD" );
      dynTipEntCod.setWebtags( "" );
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
      }
      /* End function init_web_controls */
   }

   public void valid_Emprcod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      gxaclicod_htmlB72( A396EmprCod) ;
      gxaalbref_htmlB72( A396EmprCod) ;
      gxaprocecod_htmlB72( A396EmprCod) ;
      gxatrncod_htmlB72( A396EmprCod) ;
      gxatipentcod_htmlB72( A396EmprCod) ;
      dynload_actions( ) ;
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      }
      if ( dynProceCod.getItemCount() > 0 )
      {
         A970ProceCod = (short)(GXutil.lval( dynProceCod.getValidValue(GXutil.trim( GXutil.str( A970ProceCod, 4, 0))))) ;
         n970ProceCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
      }
      if ( dynTrnCod.getItemCount() > 0 )
      {
         A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValidValue(GXutil.trim( GXutil.str( A840TrnCod, 4, 0))))) ;
         n840TrnCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
      }
      if ( dynTipEntCod.getItemCount() > 0 )
      {
         A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValidValue(GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))))) ;
         n1211TipEntCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11B71',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12B71',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETMTR","{handler:'valid_Albdetmtr',iparms:[]");
      setEventMetadata("VALID_ALBDETMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGM","{handler:'valid_Albdetkgm',iparms:[]");
      setEventMetadata("VALID_ALBDETKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTRU","{handler:'valid_Albdetmtru',iparms:[]");
      setEventMetadata("VALID_ALBDETMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGMU","{handler:'valid_Albdetkgmu',iparms:[]");
      setEventMetadata("VALID_ALBDETKGMU",",oparms:[]}");
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
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor H00B712 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         Gx_cnt = H00B712_Gx_cnt[0] ;
      }
      pr_default.close(8);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor H00B713 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         Gx_cnt = H00B713_Gx_cnt[0] ;
      }
      pr_default.close(9);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      wcpOA396EmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      A6463AlbRLote = "" ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A10758SumKgs = DecimalUtil.ZERO ;
      A10759SumMts = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H00B72_A396EmprCod = new String[] {""} ;
      H00B72_A252CliCod = new int[1] ;
      H00B72_A279CliNom = new String[] {""} ;
      H00B73_A396EmprCod = new String[] {""} ;
      H00B73_A252CliCod = new int[1] ;
      H00B73_A65ArtCod = new String[] {""} ;
      H00B73_A69ArtDsc = new String[] {""} ;
      H00B73_n69ArtDsc = new boolean[] {false} ;
      H00B74_A396EmprCod = new String[] {""} ;
      H00B74_A970ProceCod = new short[1] ;
      H00B74_n970ProceCod = new boolean[] {false} ;
      H00B74_A971ProceNom = new String[] {""} ;
      H00B74_n971ProceNom = new boolean[] {false} ;
      H00B75_A396EmprCod = new String[] {""} ;
      H00B75_A840TrnCod = new short[1] ;
      H00B75_n840TrnCod = new boolean[] {false} ;
      H00B75_A841TrnNom = new String[] {""} ;
      H00B75_n841TrnNom = new boolean[] {false} ;
      H00B76_A396EmprCod = new String[] {""} ;
      H00B76_A1211TipEntCod = new short[1] ;
      H00B76_n1211TipEntCod = new boolean[] {false} ;
      H00B76_A1212TipEntNom = new String[] {""} ;
      H00B76_n1212TipEntNom = new boolean[] {false} ;
      A56AlbRUni = "" ;
      AV17Pgmname = "" ;
      H00B78_A396EmprCod = new String[] {""} ;
      H00B78_A44AlbRecCod = new int[1] ;
      H00B78_A3613AlbRefDsc = new String[] {""} ;
      H00B78_A1222AlbNumEti = new short[1] ;
      H00B78_A10761AlbUltP = new short[1] ;
      H00B78_n10761AlbUltP = new boolean[] {false} ;
      H00B78_A53AlbRPieReb = new int[1] ;
      H00B78_A407EmprNom = new String[] {""} ;
      H00B78_n407EmprNom = new boolean[] {false} ;
      H00B78_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_n13243AlbRRTrans = new boolean[] {false} ;
      H00B78_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_n13242AlbRRLong = new boolean[] {false} ;
      H00B78_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_n13241AlbRPh = new boolean[] {false} ;
      H00B78_A4922AlbPml = new short[1] ;
      H00B78_A4921AlbRAnc = new short[1] ;
      H00B78_A4920AlbRGrm2 = new short[1] ;
      H00B78_A6463AlbRLote = new String[] {""} ;
      H00B78_A55AlbRReo = new String[] {""} ;
      H00B78_A50AlbRLoc = new String[] {""} ;
      H00B78_A47AlbREst = new byte[1] ;
      H00B78_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00B78_A8029AlbNumM = new String[] {""} ;
      H00B78_A6181AlbrPieC = new int[1] ;
      H00B78_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A1291AlbRDes = new String[] {""} ;
      H00B78_A1211TipEntCod = new short[1] ;
      H00B78_n1211TipEntCod = new boolean[] {false} ;
      H00B78_A840TrnCod = new short[1] ;
      H00B78_n840TrnCod = new boolean[] {false} ;
      H00B78_A970ProceCod = new short[1] ;
      H00B78_n970ProceCod = new boolean[] {false} ;
      H00B78_A45AlbRef = new String[] {""} ;
      H00B78_A252CliCod = new int[1] ;
      H00B78_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00B78_A5806AlbREnt2 = new String[] {""} ;
      H00B78_A46AlbREnt = new String[] {""} ;
      H00B78_A10760SumPzs = new short[1] ;
      H00B78_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A2152AlbDetPie = new short[1] ;
      H00B78_A54AlbRPieUti = new int[1] ;
      H00B78_A52AlbRPieEnt = new int[1] ;
      H00B78_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B78_A56AlbRUni = new String[] {""} ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A8029AlbNumM = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      H00B79_A407EmprNom = new String[] {""} ;
      H00B79_n407EmprNom = new boolean[] {false} ;
      H00B711_A10760SumPzs = new short[1] ;
      H00B711_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B711_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B711_A2152AlbDetPie = new short[1] ;
      H00B711_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B711_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B711_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B711_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA44AlbRecCod = "" ;
      Z45AlbRef = "" ;
      E396EmprCod = "" ;
      H00B712_Gx_cnt = new int[1] ;
      H00B713_Gx_cnt = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdetgeneral__default(),
         new Object[] {
             new Object[] {
            H00B72_A396EmprCod, H00B72_A252CliCod, H00B72_A279CliNom
            }
            , new Object[] {
            H00B73_A396EmprCod, H00B73_A252CliCod, H00B73_A65ArtCod, H00B73_A69ArtDsc, H00B73_n69ArtDsc
            }
            , new Object[] {
            H00B74_A396EmprCod, H00B74_A970ProceCod, H00B74_A971ProceNom, H00B74_n971ProceNom
            }
            , new Object[] {
            H00B75_A396EmprCod, H00B75_A840TrnCod, H00B75_A841TrnNom, H00B75_n841TrnNom
            }
            , new Object[] {
            H00B76_A396EmprCod, H00B76_A1211TipEntCod, H00B76_A1212TipEntNom, H00B76_n1212TipEntNom
            }
            , new Object[] {
            H00B78_A396EmprCod, H00B78_A44AlbRecCod, H00B78_A3613AlbRefDsc, H00B78_A1222AlbNumEti, H00B78_A10761AlbUltP, H00B78_n10761AlbUltP, H00B78_A53AlbRPieReb, H00B78_A407EmprNom, H00B78_n407EmprNom, H00B78_A13243AlbRRTrans,
            H00B78_n13243AlbRRTrans, H00B78_A13242AlbRRLong, H00B78_n13242AlbRRLong, H00B78_A13241AlbRPh, H00B78_n13241AlbRPh, H00B78_A4922AlbPml, H00B78_A4921AlbRAnc, H00B78_A4920AlbRGrm2, H00B78_A6463AlbRLote, H00B78_A55AlbRReo,
            H00B78_A50AlbRLoc, H00B78_A47AlbREst, H00B78_A48AlbRFecUlt, H00B78_A8029AlbNumM, H00B78_A6181AlbrPieC, H00B78_A6180AlbrUniC, H00B78_A1291AlbRDes, H00B78_A1211TipEntCod, H00B78_n1211TipEntCod, H00B78_A840TrnCod,
            H00B78_n840TrnCod, H00B78_A970ProceCod, H00B78_n970ProceCod, H00B78_A45AlbRef, H00B78_A252CliCod, H00B78_A49AlbRFen, H00B78_A5806AlbREnt2, H00B78_A46AlbREnt, H00B78_A10760SumPzs, H00B78_A10759SumMts,
            H00B78_A10758SumKgs, H00B78_A2152AlbDetPie, H00B78_A54AlbRPieUti, H00B78_A52AlbRPieEnt, H00B78_A60AlbRUniUti, H00B78_A58AlbRUniEnt, H00B78_A2151AlbDetMtrU, H00B78_A2149AlbDetMtr, H00B78_A2148AlbDetKgmU, H00B78_A2146AlbDetKgm,
            H00B78_A56AlbRUni
            }
            , new Object[] {
            H00B79_A407EmprNom, H00B79_n407EmprNom
            }
            , new Object[] {
            H00B711_A10760SumPzs, H00B711_A10759SumMts, H00B711_A10758SumKgs, H00B711_A2152AlbDetPie, H00B711_A2151AlbDetMtrU, H00B711_A2149AlbDetMtr, H00B711_A2148AlbDetKgmU, H00B711_A2146AlbDetKgm
            }
            , new Object[] {
            H00B712_Gx_cnt
            }
            , new Object[] {
            H00B713_Gx_cnt
            }
         }
      );
      AV17Pgmname = "TALBDETGeneral" ;
      /* GeneXus formulas. */
      AV17Pgmname = "TALBDETGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte A47AlbREst ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short A10760SumPzs ;
   private short A10761AlbUltP ;
   private short A1222AlbNumEti ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short Z970ProceCod ;
   private short Z840TrnCod ;
   private short Z1211TipEntCod ;
   private int wcpOA44AlbRecCod ;
   private int A44AlbRecCod ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int A252CliCod ;
   private int edtAlbRDes_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPh_Enabled ;
   private int edtAlbRRLong_Enabled ;
   private int edtAlbRRTrans_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtAlbDetPie_Visible ;
   private int edtAlbDetMtr_Visible ;
   private int edtAlbDetKgm_Visible ;
   private int edtAlbDetMtrU_Visible ;
   private int edtAlbDetKgmU_Visible ;
   private int edtAlbDetMtrD_Visible ;
   private int edtAlbDetKgmD_Visible ;
   private int edtAlbDetPieU_Visible ;
   private int edtSumKgs_Visible ;
   private int edtSumMts_Visible ;
   private int edtSumPzs_Visible ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Visible ;
   private int edtAlbUltP_Visible ;
   private int edtAlbNumEti_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int gxdynajaxindex ;
   private int A6181AlbrPieC ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int idxLst ;
   private int Z252CliCod ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private java.math.BigDecimal A13241AlbRPh ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A10758SumKgs ;
   private java.math.BigDecimal A10759SumMts ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String grpUnnamedgroup2_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String A45AlbRef ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String A55AlbRReo ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String grpUnnamedgroup10_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String grpUnnamedgroup12_Internalname ;
   private String grpUnnamedgroup12_Class ;
   private String divUnnamedtable11_Internalname ;
   private String edtAlbRPh_Internalname ;
   private String edtAlbRPh_Jsonclick ;
   private String edtAlbRRLong_Internalname ;
   private String edtAlbRRLong_Jsonclick ;
   private String edtAlbRRTrans_Internalname ;
   private String edtAlbRRTrans_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbDetPie_Internalname ;
   private String edtAlbDetPie_Jsonclick ;
   private String edtAlbDetMtr_Internalname ;
   private String edtAlbDetMtr_Jsonclick ;
   private String edtAlbDetKgm_Internalname ;
   private String edtAlbDetKgm_Jsonclick ;
   private String edtAlbDetMtrU_Internalname ;
   private String edtAlbDetMtrU_Jsonclick ;
   private String edtAlbDetKgmU_Internalname ;
   private String edtAlbDetKgmU_Jsonclick ;
   private String edtAlbDetMtrD_Internalname ;
   private String edtAlbDetMtrD_Jsonclick ;
   private String edtAlbDetKgmD_Internalname ;
   private String edtAlbDetKgmD_Jsonclick ;
   private String edtAlbDetPieU_Internalname ;
   private String edtAlbDetPieU_Jsonclick ;
   private String edtSumKgs_Internalname ;
   private String edtSumKgs_Jsonclick ;
   private String edtSumMts_Internalname ;
   private String edtSumMts_Jsonclick ;
   private String edtSumPzs_Internalname ;
   private String edtSumPzs_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String edtAlbUltP_Internalname ;
   private String edtAlbUltP_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV17Pgmname ;
   private String A8029AlbNumM ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbNumM_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRFecUlt_Internalname ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTablemergedunnamedgroup4_Internalname ;
   private String grpUnnamedgroup4_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbrUniC_Jsonclick ;
   private String edtAlbrPieC_Jsonclick ;
   private String edtAlbNumM_Jsonclick ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA44AlbRecCod ;
   private String Z45AlbRef ;
   private String E396EmprCod ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n970ProceCod ;
   private boolean n840TrnCod ;
   private boolean n1211TipEntCod ;
   private boolean n10761AlbUltP ;
   private boolean n13243AlbRRTrans ;
   private boolean n13242AlbRRLong ;
   private boolean n13241AlbRPh ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice dynCliCod ;
   private HTMLChoice dynAlbRef ;
   private HTMLChoice dynProceCod ;
   private HTMLChoice dynTrnCod ;
   private HTMLChoice dynTipEntCod ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private String[] H00B72_A396EmprCod ;
   private int[] H00B72_A252CliCod ;
   private String[] H00B72_A279CliNom ;
   private String[] H00B73_A396EmprCod ;
   private int[] H00B73_A252CliCod ;
   private String[] H00B73_A65ArtCod ;
   private String[] H00B73_A69ArtDsc ;
   private boolean[] H00B73_n69ArtDsc ;
   private String[] H00B74_A396EmprCod ;
   private short[] H00B74_A970ProceCod ;
   private boolean[] H00B74_n970ProceCod ;
   private String[] H00B74_A971ProceNom ;
   private boolean[] H00B74_n971ProceNom ;
   private String[] H00B75_A396EmprCod ;
   private short[] H00B75_A840TrnCod ;
   private boolean[] H00B75_n840TrnCod ;
   private String[] H00B75_A841TrnNom ;
   private boolean[] H00B75_n841TrnNom ;
   private String[] H00B76_A396EmprCod ;
   private short[] H00B76_A1211TipEntCod ;
   private boolean[] H00B76_n1211TipEntCod ;
   private String[] H00B76_A1212TipEntNom ;
   private boolean[] H00B76_n1212TipEntNom ;
   private String[] H00B78_A396EmprCod ;
   private int[] H00B78_A44AlbRecCod ;
   private String[] H00B78_A3613AlbRefDsc ;
   private short[] H00B78_A1222AlbNumEti ;
   private short[] H00B78_A10761AlbUltP ;
   private boolean[] H00B78_n10761AlbUltP ;
   private int[] H00B78_A53AlbRPieReb ;
   private String[] H00B78_A407EmprNom ;
   private boolean[] H00B78_n407EmprNom ;
   private java.math.BigDecimal[] H00B78_A13243AlbRRTrans ;
   private boolean[] H00B78_n13243AlbRRTrans ;
   private java.math.BigDecimal[] H00B78_A13242AlbRRLong ;
   private boolean[] H00B78_n13242AlbRRLong ;
   private java.math.BigDecimal[] H00B78_A13241AlbRPh ;
   private boolean[] H00B78_n13241AlbRPh ;
   private short[] H00B78_A4922AlbPml ;
   private short[] H00B78_A4921AlbRAnc ;
   private short[] H00B78_A4920AlbRGrm2 ;
   private String[] H00B78_A6463AlbRLote ;
   private String[] H00B78_A55AlbRReo ;
   private String[] H00B78_A50AlbRLoc ;
   private byte[] H00B78_A47AlbREst ;
   private java.util.Date[] H00B78_A48AlbRFecUlt ;
   private String[] H00B78_A8029AlbNumM ;
   private int[] H00B78_A6181AlbrPieC ;
   private java.math.BigDecimal[] H00B78_A6180AlbrUniC ;
   private String[] H00B78_A1291AlbRDes ;
   private short[] H00B78_A1211TipEntCod ;
   private boolean[] H00B78_n1211TipEntCod ;
   private short[] H00B78_A840TrnCod ;
   private boolean[] H00B78_n840TrnCod ;
   private short[] H00B78_A970ProceCod ;
   private boolean[] H00B78_n970ProceCod ;
   private String[] H00B78_A45AlbRef ;
   private int[] H00B78_A252CliCod ;
   private java.util.Date[] H00B78_A49AlbRFen ;
   private String[] H00B78_A5806AlbREnt2 ;
   private String[] H00B78_A46AlbREnt ;
   private short[] H00B78_A10760SumPzs ;
   private java.math.BigDecimal[] H00B78_A10759SumMts ;
   private java.math.BigDecimal[] H00B78_A10758SumKgs ;
   private short[] H00B78_A2152AlbDetPie ;
   private int[] H00B78_A54AlbRPieUti ;
   private int[] H00B78_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H00B78_A60AlbRUniUti ;
   private java.math.BigDecimal[] H00B78_A58AlbRUniEnt ;
   private java.math.BigDecimal[] H00B78_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] H00B78_A2149AlbDetMtr ;
   private java.math.BigDecimal[] H00B78_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] H00B78_A2146AlbDetKgm ;
   private String[] H00B78_A56AlbRUni ;
   private String[] H00B79_A407EmprNom ;
   private boolean[] H00B79_n407EmprNom ;
   private short[] H00B711_A10760SumPzs ;
   private java.math.BigDecimal[] H00B711_A10759SumMts ;
   private java.math.BigDecimal[] H00B711_A10758SumKgs ;
   private short[] H00B711_A2152AlbDetPie ;
   private java.math.BigDecimal[] H00B711_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] H00B711_A2149AlbDetMtr ;
   private java.math.BigDecimal[] H00B711_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] H00B711_A2146AlbDetKgm ;
   private int[] H00B712_Gx_cnt ;
   private int[] H00B713_Gx_cnt ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class talbdetgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00B72", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B73", "SELECT EmprCod, CliCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? ORDER BY ArtDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B74", "SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? ORDER BY ProceNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B75", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY TrnNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B76", "SELECT EmprCod, TipEntCod, TipEntNom FROM TXPENTRAD WHERE EmprCod = ? ORDER BY TipEntNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00B78", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRefDsc, T1.AlbNumEti, T1.AlbUltP, T1.AlbRPieReb, T2.EmprNom, T1.AlbRRTrans, T1.AlbRRLong, T1.AlbRPh, T1.AlbPml, T1.AlbRAnc, T1.AlbRGrm2, T1.AlbRLote, T1.AlbRReo, T1.AlbRLoc, T1.AlbREst, T1.AlbRFecUlt, T1.AlbNumM, T1.AlbrPieC, T1.AlbrUniC, T1.AlbRDes, T1.TipEntCod, T1.TrnCod, T1.ProceCod, T1.AlbRef, T1.CliCod, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, COALESCE( T3.SumPzs, 0) AS SumPzs, COALESCE( T3.SumMts, 0) AS SumMts, COALESCE( T3.SumKgs, 0) AS SumKgs, COALESCE( T3.GXC1, 0) AS AlbDetPie, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt, COALESCE( T3.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T3.SumMts, 0) AS AlbDetMtr, COALESCE( T3.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T3.SumKgs, 0) AS AlbDetKgm, T1.AlbRUni FROM ((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS SumPzs, EmprCod, AlbRecCod, SUM(AlbRecKgm) AS SumKgs, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS SumMts, SUM(AlbRecMtrU) AS AlbDetMtrU, COUNT(*) AS GXC1 FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B79", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B711", "SELECT COALESCE( T1.SumPzs, 0) AS SumPzs, COALESCE( T1.SumMts, 0) AS SumMts, COALESCE( T1.SumKgs, 0) AS SumKgs, COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.SumMts, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.SumKgs, 0) AS AlbDetKgm FROM (SELECT COUNT(*) AS SumPzs, EmprCod, AlbRecCod, SUM(AlbRecKgm) AS SumKgs, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS SumMts, SUM(AlbRecMtrU) AS AlbDetMtrU, COUNT(*) AS GXC1 FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B712", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B713", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 20);
               ((String[]) buf[19])[0] = rslt.getString(15, 2);
               ((String[]) buf[20])[0] = rslt.getString(16, 10);
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 10);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[26])[0] = rslt.getString(22, 20);
               ((short[]) buf[27])[0] = rslt.getShort(23);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(24);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 16);
               ((int[]) buf[34])[0] = rslt.getInt(27);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((String[]) buf[36])[0] = rslt.getString(29, 20);
               ((String[]) buf[37])[0] = rslt.getString(30, 8);
               ((short[]) buf[38])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,2);
               ((short[]) buf[41])[0] = rslt.getShort(34);
               ((int[]) buf[42])[0] = rslt.getInt(35);
               ((int[]) buf[43])[0] = rslt.getInt(36);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[50])[0] = rslt.getString(43, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

