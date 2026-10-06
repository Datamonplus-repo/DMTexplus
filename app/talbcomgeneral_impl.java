package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbcomgeneral_impl extends GXWebComponent
{
   public talbcomgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbcomgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbcomgeneral_impl.class ));
   }

   public talbcomgeneral_impl( int remoteHandle ,
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
      cmbAlbComPri = new HTMLChoice();
      cmbAlcDivTCod = new HTMLChoice();
      cmbAlbComEAT = new HTMLChoice();
      cmbAlbComAT = new HTMLChoice();
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
               A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A14AlbComCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicodNJ0( A396EmprCod, A13735CliCNom) ;
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
               gxsgatrncodNJ0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaclicodNJ0( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h252CliCod = httpContext.GetPar( "h252CliCod") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaclicodNJ2( A396EmprCod, h252CliCod) ;
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
               gxsgatrncodNJ0( A396EmprCod, A13738TrnCNom) ;
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
               gxhcatrncodNJ2( A396EmprCod, h840TrnCod) ;
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
         paNJ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TALBCOMGeneral", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbcomgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"EmprCod","AlbComCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA14AlbComCod", GXutil.ltrim( localUtil.ntoc( wcpOA14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCOMPRI", GXutil.rtrim( AV11AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseFormNJ2( )
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
      return "TALBCOMGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TALBCOMGeneral", "") ;
   }

   public void wbNJ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.talbcomgeneral");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "N Documento", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComPri.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComPri, cmbAlbComPri.getInternalname(), GXutil.rtrim( A22AlbComPri), 1, cmbAlbComPri.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbComPri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBCOMGeneral.htm");
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBCOMGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComHor_Internalname, httpContext.getMessage( "Dia-Hora salida", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComHor_Internalname, localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComHor_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBCOMGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlcDomEnv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlcDomEnv_Internalname, httpContext.getMessage( "Envio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlcDivCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlcDivCod_Internalname, httpContext.getMessage( "Divisa", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDivCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3111AlcDivCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3111AlcDivCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDivCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlcDivAbr_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivAbr_Internalname, GXutil.rtrim( A3112AlcDivAbr), GXutil.rtrim( localUtil.format( A3112AlcDivAbr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivAbr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlcDivTCod.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlcDivTCod, cmbAlcDivTCod.getInternalname(), GXutil.rtrim( A3095AlcDivTCod), 1, cmbAlcDivTCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlcDivTCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBCOMGeneral.htm");
         cmbAlcDivTCod.setValue( GXutil.rtrim( A3095AlcDivTCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlcDivTCod.getInternalname(), "Values", cmbAlcDivTCod.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComMat_Internalname, httpContext.getMessage( "Matricula", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComMat_Internalname, GXutil.rtrim( A4830AlbComMat), GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbcomfs_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomfs_Internalname, "", "", "", lblTextblockalbcomfs_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComFs_Internalname, httpContext.getMessage( "Fecha Sistema", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbComFs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFs_Internalname, localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFs_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbComFs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBCOMGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbcomeat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomeat_Internalname, "", "", "", lblTextblockalbcomeat_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbComEAT.getInternalname(), httpContext.getMessage( "Envio AT", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComEAT, cmbAlbComEAT.getInternalname(), GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)), 1, cmbAlbComEAT.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbComEAT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBCOMGeneral.htm");
         cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbcomid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomid_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblockalbcomid_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComID_Internalname, httpContext.getMessage( "ATDocCodeID", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComID_Internalname, GXutil.rtrim( A10740AlbComID), GXutil.rtrim( localUtil.format( A10740AlbComID, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbcomat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomat_Internalname, "", "", "", lblTextblockalbcomat_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbComAT.getInternalname(), httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComAT, cmbAlbComAT.getInternalname(), GXutil.rtrim( A10764AlbComAT), 1, cmbAlbComAT.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbComAT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBCOMGeneral.htm");
         cmbAlbComAT.setValue( GXutil.rtrim( A10764AlbComAT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComAT.getInternalname(), "Values", cmbAlbComAT.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbcomfd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbcomfd_Internalname, httpContext.getMessage( "Hash", ""), "", "", lblTextblockalbcomfd_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbComFd_Internalname, httpContext.getMessage( "Firma Digital", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFd_Internalname, GXutil.rtrim( A10014AlbComFd), "", "", (short)(0), 1, edtAlbComFd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TALBCOMGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, divUnnamedtable7_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCTrNm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbCTrNm_Internalname, httpContext.getMessage( "Nombre", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNm_Internalname, GXutil.rtrim( A11719AlbCTrNm), GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCTrNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCTrNc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbCTrNc_Internalname, httpContext.getMessage( "NIF", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNc_Internalname, GXutil.rtrim( A11721AlbCTrNc), GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCTrNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCTrDm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbCTrDm_Internalname, httpContext.getMessage( "Direccion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrDm_Internalname, GXutil.rtrim( A11720AlbCTrDm), GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrDm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCTrDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11nj1_client"+"'", TempTags, "", 2, "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12nj1_client"+"'", TempTags, "", 2, "HLP_TALBCOMGeneral.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDivTra_Internalname, GXutil.rtrim( A3091CliDivTra), GXutil.rtrim( localUtil.format( A3091CliDivTra, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDivTra_Jsonclick, 0, "Attribute", "", "", "", "", edtCliDivTra_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3140CliDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliDivCod_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComImp_Internalname, GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComImp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComImp_Visible, 0, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEst_Internalname, GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEst_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComLiC_Internalname, GXutil.ltrim( localUtil.ntoc( A19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComLiC_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComLiC_Visible, 0, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEso_Internalname, GXutil.ltrim( localUtil.ntoc( A1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEso_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEso_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtfindDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13739findDomEnv), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfindDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtfindDomEnv_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCSec_Internalname, GXutil.rtrim( A3094AlbCSec), GXutil.rtrim( localUtil.format( A3094AlbCSec, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCSec_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCSec_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlcIvaCod_Internalname, GXutil.rtrim( A5143AlcIvaCod), GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcIvaCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcIvaCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFdD_Internalname, GXutil.rtrim( A10015AlbComFdD), "", "", (short)(0), edtAlbComFdD_Visible, 0, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComSt_Internalname, GXutil.rtrim( A10738AlbComSt), GXutil.rtrim( localUtil.format( A10738AlbComSt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComSt_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComSt_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", edtCliNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startNJ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TALBCOMGeneral", ""), (short)(0)) ;
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
            strupNJ0( ) ;
         }
      }
   }

   public void wsNJ2( )
   {
      startNJ2( ) ;
      evtNJ2( ) ;
   }

   public void evtNJ2( )
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
                              strupNJ0( ) ;
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
                              strupNJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13NJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupNJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14NJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupNJ0( ) ;
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
                              strupNJ0( ) ;
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

   public void weNJ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormNJ2( ) ;
         }
      }
   }

   public void paNJ2( )
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

   public void gxsgaclicodNJ0( String A396EmprCod ,
                               String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_dataNJ0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_dataNJ0( String A396EmprCod ,
                                       String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00NJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00NJ2_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H00NJ2_A13735CliCNom[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgatrncodNJ0( String A396EmprCod ,
                               String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_dataNJ0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_dataNJ0( String A396EmprCod ,
                                       String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor H00NJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00NJ3_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(H00NJ3_A13738TrnCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcaclicodNJ2( String A396EmprCod ,
                               String A13735CliCNom )
   {
      /* Using cursor H00NJ4 */
      pr_default.execute(2, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = H00NJ4_A13735CliCNom[0] ;
         A396EmprCod = H00NJ4_A396EmprCod[0] ;
         A252CliCod = H00NJ4_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcatrncodNJ2( String A396EmprCod ,
                               String A13738TrnCNom )
   {
      /* Using cursor H00NJ5 */
      pr_default.execute(3, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = H00NJ5_A13738TrnCNom[0] ;
         A396EmprCod = H00NJ5_A396EmprCod[0] ;
         A840TrnCod = H00NJ5_A840TrnCod[0] ;
         n840TrnCod = H00NJ5_n840TrnCod[0] ;
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
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
      }
      if ( cmbAlcDivTCod.getItemCount() > 0 )
      {
         A3095AlcDivTCod = cmbAlcDivTCod.getValidValue(A3095AlcDivTCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3095AlcDivTCod", A3095AlcDivTCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlcDivTCod.setValue( GXutil.rtrim( A3095AlcDivTCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlcDivTCod.getInternalname(), "Values", cmbAlcDivTCod.ToJavascriptSource(), true);
      }
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), true);
      }
      if ( cmbAlbComAT.getItemCount() > 0 )
      {
         A10764AlbComAT = cmbAlbComAT.getValidValue(A10764AlbComAT) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10764AlbComAT", A10764AlbComAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComAT.setValue( GXutil.rtrim( A10764AlbComAT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbComAT.getInternalname(), "Values", cmbAlbComAT.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfNJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV21Pgmname = "TALBCOMGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfNJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00NJ7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A279CliNom = H00NJ7_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A841TrnNom = H00NJ7_A841TrnNom[0] ;
            n841TrnNom = H00NJ7_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A10738AlbComSt = H00NJ7_A10738AlbComSt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10738AlbComSt", A10738AlbComSt);
            A10015AlbComFdD = H00NJ7_A10015AlbComFdD[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10015AlbComFdD", A10015AlbComFdD);
            A5143AlcIvaCod = H00NJ7_A5143AlcIvaCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5143AlcIvaCod", A5143AlcIvaCod);
            A3094AlbCSec = H00NJ7_A3094AlbCSec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3094AlbCSec", A3094AlbCSec);
            A1783AlbComEso = H00NJ7_A1783AlbComEso[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
            A19AlbComLiC = H00NJ7_A19AlbComLiC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
            A16AlbComEst = H00NJ7_A16AlbComEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            A3140CliDivCod = H00NJ7_A3140CliDivCod[0] ;
            n3140CliDivCod = H00NJ7_n3140CliDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
            A3091CliDivTra = H00NJ7_A3091CliDivTra[0] ;
            n3091CliDivTra = H00NJ7_n3091CliDivTra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
            A11720AlbCTrDm = H00NJ7_A11720AlbCTrDm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11720AlbCTrDm", A11720AlbCTrDm);
            A11721AlbCTrNc = H00NJ7_A11721AlbCTrNc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11721AlbCTrNc", A11721AlbCTrNc);
            A11719AlbCTrNm = H00NJ7_A11719AlbCTrNm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11719AlbCTrNm", A11719AlbCTrNm);
            A10014AlbComFd = H00NJ7_A10014AlbComFd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10014AlbComFd", A10014AlbComFd);
            A10764AlbComAT = H00NJ7_A10764AlbComAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10764AlbComAT", A10764AlbComAT);
            A10740AlbComID = H00NJ7_A10740AlbComID[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10740AlbComID", A10740AlbComID);
            A10739AlbComEAT = H00NJ7_A10739AlbComEAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            A10013AlbComFs = H00NJ7_A10013AlbComFs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A4830AlbComMat = H00NJ7_A4830AlbComMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4830AlbComMat", A4830AlbComMat);
            A840TrnCod = H00NJ7_A840TrnCod[0] ;
            n840TrnCod = H00NJ7_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A3095AlcDivTCod = H00NJ7_A3095AlcDivTCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3095AlcDivTCod", A3095AlcDivTCod);
            A3112AlcDivAbr = H00NJ7_A3112AlcDivAbr[0] ;
            n3112AlcDivAbr = H00NJ7_n3112AlcDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
            A3111AlcDivCod = H00NJ7_A3111AlcDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
            A5142AlcDomEnv = H00NJ7_A5142AlcDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
            A252CliCod = H00NJ7_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4829AlbComHor = H00NJ7_A4829AlbComHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A17AlbComFch = H00NJ7_A17AlbComFch[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            A22AlbComPri = H00NJ7_A22AlbComPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
            A13739findDomEnv = H00NJ7_A13739findDomEnv[0] ;
            n13739findDomEnv = H00NJ7_n13739findDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
            A18AlbComImp = H00NJ7_A18AlbComImp[0] ;
            n18AlbComImp = H00NJ7_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            A3112AlcDivAbr = H00NJ7_A3112AlcDivAbr[0] ;
            n3112AlcDivAbr = H00NJ7_n3112AlcDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
            A279CliNom = H00NJ7_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A3140CliDivCod = H00NJ7_A3140CliDivCod[0] ;
            n3140CliDivCod = H00NJ7_n3140CliDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
            A3091CliDivTra = H00NJ7_A3091CliDivTra[0] ;
            n3091CliDivTra = H00NJ7_n3091CliDivTra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
            A841TrnNom = H00NJ7_A841TrnNom[0] ;
            n841TrnNom = H00NJ7_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A13739findDomEnv = H00NJ7_A13739findDomEnv[0] ;
            n13739findDomEnv = H00NJ7_n13739findDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
            A18AlbComImp = H00NJ7_A18AlbComImp[0] ;
            n18AlbComImp = H00NJ7_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            if ( (GXutil.strcmp("", h252CliCod)==0) )
            {
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A13735CliCNom = h252CliCod ;
               /* Using cursor H00NJ8 */
               pr_default.execute(5, new Object[] {A13735CliCNom, A396EmprCod});
               A252CliCod = H00NJ8_A252CliCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A252CliCod = H00NJ8_A252CliCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  pr_default.readNext(5);
                  if ( ! ( (pr_default.getStatus(5) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
                  }
               }
               else
               {
               }
               pr_default.close(5);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
            if ( (GXutil.strcmp("", h840TrnCod)==0) )
            {
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A13738TrnCNom = h840TrnCod ;
               /* Using cursor H00NJ9 */
               pr_default.execute(6, new Object[] {A13738TrnCNom, A396EmprCod});
               A840TrnCod = H00NJ9_A840TrnCod[0] ;
               n840TrnCod = H00NJ9_n840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A840TrnCod = H00NJ9_A840TrnCod[0] ;
               n840TrnCod = H00NJ9_n840TrnCod[0] ;
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
            e14NJ2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         wbNJ0( ) ;
      }
   }

   public void send_integrity_lvl_hashesNJ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCOMPRI", GXutil.rtrim( AV11AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBCOMPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbComPri, "9"))));
   }

   public void before_start_formulas( )
   {
      AV21Pgmname = "TALBCOMGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00NJ11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A18AlbComImp = H00NJ11_A18AlbComImp[0] ;
         n18AlbComImp = H00NJ11_n18AlbComImp[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      pr_default.close(7);
      pr_default.close(7);
      fix_multi_value_controls( ) ;
   }

   public void strupNJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13NJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11AlbComPri = httpContext.cgiGet( sPrefix+"vALBCOMPRI") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         /* Read variables values. */
         cmbAlbComPri.setValue( httpContext.cgiGet( cmbAlbComPri.getInternalname()) );
         A22AlbComPri = httpContext.cgiGet( cmbAlbComPri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A22AlbComPri", A22AlbComPri);
         A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor H00NJ12 */
            pr_default.execute(8, new Object[] {A13735CliCNom, A396EmprCod});
            A252CliCod = H00NJ12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = H00NJ12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h252CliCod", h252CliCod);
         A5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         A3112AlcDivAbr = httpContext.cgiGet( edtAlcDivAbr_Internalname) ;
         n3112AlcDivAbr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3112AlcDivAbr", A3112AlcDivAbr);
         cmbAlcDivTCod.setValue( httpContext.cgiGet( cmbAlcDivTCod.getInternalname()) );
         A3095AlcDivTCod = httpContext.cgiGet( cmbAlcDivTCod.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3095AlcDivTCod", A3095AlcDivTCod);
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
            /* Using cursor H00NJ13 */
            pr_default.execute(9, new Object[] {A13738TrnCNom, A396EmprCod});
            A840TrnCod = H00NJ13_A840TrnCod[0] ;
            n840TrnCod = H00NJ13_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = H00NJ13_A840TrnCod[0] ;
            n840TrnCod = H00NJ13_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
         A4830AlbComMat = httpContext.cgiGet( edtAlbComMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4830AlbComMat", A4830AlbComMat);
         A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
         A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10740AlbComID", A10740AlbComID);
         cmbAlbComAT.setValue( httpContext.cgiGet( cmbAlbComAT.getInternalname()) );
         A10764AlbComAT = httpContext.cgiGet( cmbAlbComAT.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10764AlbComAT", A10764AlbComAT);
         A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10014AlbComFd", A10014AlbComFd);
         A11719AlbCTrNm = httpContext.cgiGet( edtAlbCTrNm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11719AlbCTrNm", A11719AlbCTrNm);
         A11721AlbCTrNc = httpContext.cgiGet( edtAlbCTrNc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11721AlbCTrNc", A11721AlbCTrNc);
         A11720AlbCTrDm = httpContext.cgiGet( edtAlbCTrDm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11720AlbCTrDm", A11720AlbCTrDm);
         A3091CliDivTra = httpContext.cgiGet( edtCliDivTra_Internalname) ;
         n3091CliDivTra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3091CliDivTra", A3091CliDivTra);
         A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3140CliDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
         A18AlbComImp = localUtil.ctond( httpContext.cgiGet( edtAlbComImp_Internalname)) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLiC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
         A13739findDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtfindDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         A3094AlbCSec = httpContext.cgiGet( edtAlbCSec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3094AlbCSec", A3094AlbCSec);
         A5143AlcIvaCod = GXutil.upper( httpContext.cgiGet( edtAlcIvaCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5143AlcIvaCod", A5143AlcIvaCod);
         A10015AlbComFdD = httpContext.cgiGet( edtAlbComFdD_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10015AlbComFdD", A10015AlbComFdD);
         A10738AlbComSt = httpContext.cgiGet( edtAlbComSt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10738AlbComSt", A10738AlbComSt);
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
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
      e13NJ2 ();
      if (returnInSub) return;
   }

   public void e13NJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbcomgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV19Emprnom ;
      GXv_char4[0] = AV20Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbcomgeneral_impl.this.AV18Emprcod = GXv_char2[0] ;
      talbcomgeneral_impl.this.AV19Emprnom = GXv_char3[0] ;
      talbcomgeneral_impl.this.AV20Usurcod = GXv_char4[0] ;
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

   protected void e14NJ2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtCliDivTra_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliDivTra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDivTra_Visible), 5, 0), true);
      edtCliDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDivCod_Visible), 5, 0), true);
      edtAlbComImp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComImp_Visible), 5, 0), true);
      edtAlbComEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Visible), 5, 0), true);
      edtAlbComLiC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComLiC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Visible), 5, 0), true);
      edtAlbComEso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComEso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEso_Visible), 5, 0), true);
      edtfindDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtfindDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfindDomEnv_Visible), 5, 0), true);
      edtAlbCSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCSec_Visible), 5, 0), true);
      edtAlcIvaCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlcIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcIvaCod_Visible), 5, 0), true);
      edtAlbComFdD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComFdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFdD_Visible), 5, 0), true);
      edtAlbComSt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComSt_Visible), 5, 0), true);
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
      edtCliNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int7) ;
      talbcomgeneral_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable7_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable7_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable7_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV21Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBCOM" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
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
      paNJ2( ) ;
      wsNJ2( ) ;
      weNJ2( ) ;
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
      sCtrlA14AlbComCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paNJ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "talbcomgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paNJ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A14AlbComCod != wcpOA14AlbComCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA14AlbComCod = A14AlbComCod ;
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
      sCtrlA14AlbComCod = httpContext.cgiGet( sPrefix+"A14AlbComCod_CTRL") ;
      if ( GXutil.len( sCtrlA14AlbComCod) > 0 )
      {
         A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA14AlbComCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      else
      {
         A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A14AlbComCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paNJ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsNJ2( ) ;
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
      wsNJ2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14AlbComCod_PARM", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA14AlbComCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14AlbComCod_CTRL", GXutil.rtrim( sCtrlA14AlbComCod));
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
      weNJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165462", true, true);
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
      httpContext.AddJavascriptSource("talbcomgeneral.js", "?2026821165462", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbComCod_Internalname = sPrefix+"ALBCOMCOD" ;
      cmbAlbComPri.setInternalname( sPrefix+"ALBCOMPRI" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtAlbComFch_Internalname = sPrefix+"ALBCOMFCH" ;
      edtAlbComHor_Internalname = sPrefix+"ALBCOMHOR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtAlcDomEnv_Internalname = sPrefix+"ALCDOMENV" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtAlcDivCod_Internalname = sPrefix+"ALCDIVCOD" ;
      edtAlcDivAbr_Internalname = sPrefix+"ALCDIVABR" ;
      cmbAlcDivTCod.setInternalname( sPrefix+"ALCDIVTCOD" );
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtAlbComMat_Internalname = sPrefix+"ALBCOMMAT" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      lblTextblockalbcomfs_Internalname = sPrefix+"TEXTBLOCKALBCOMFS" ;
      edtAlbComFs_Internalname = sPrefix+"ALBCOMFS" ;
      divUnnamedtablealbcomfs_Internalname = sPrefix+"UNNAMEDTABLEALBCOMFS" ;
      lblTextblockalbcomeat_Internalname = sPrefix+"TEXTBLOCKALBCOMEAT" ;
      cmbAlbComEAT.setInternalname( sPrefix+"ALBCOMEAT" );
      divUnnamedtablealbcomeat_Internalname = sPrefix+"UNNAMEDTABLEALBCOMEAT" ;
      lblTextblockalbcomid_Internalname = sPrefix+"TEXTBLOCKALBCOMID" ;
      edtAlbComID_Internalname = sPrefix+"ALBCOMID" ;
      divUnnamedtablealbcomid_Internalname = sPrefix+"UNNAMEDTABLEALBCOMID" ;
      lblTextblockalbcomat_Internalname = sPrefix+"TEXTBLOCKALBCOMAT" ;
      cmbAlbComAT.setInternalname( sPrefix+"ALBCOMAT" );
      divUnnamedtablealbcomat_Internalname = sPrefix+"UNNAMEDTABLEALBCOMAT" ;
      lblTextblockalbcomfd_Internalname = sPrefix+"TEXTBLOCKALBCOMFD" ;
      edtAlbComFd_Internalname = sPrefix+"ALBCOMFD" ;
      divUnnamedtablealbcomfd_Internalname = sPrefix+"UNNAMEDTABLEALBCOMFD" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtAlbCTrNm_Internalname = sPrefix+"ALBCTRNM" ;
      edtAlbCTrNc_Internalname = sPrefix+"ALBCTRNC" ;
      edtAlbCTrDm_Internalname = sPrefix+"ALBCTRDM" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtCliDivTra_Internalname = sPrefix+"CLIDIVTRA" ;
      edtCliDivCod_Internalname = sPrefix+"CLIDIVCOD" ;
      edtAlbComImp_Internalname = sPrefix+"ALBCOMIMP" ;
      edtAlbComEst_Internalname = sPrefix+"ALBCOMEST" ;
      edtAlbComLiC_Internalname = sPrefix+"ALBCOMLIC" ;
      edtAlbComEso_Internalname = sPrefix+"ALBCOMESO" ;
      edtfindDomEnv_Internalname = sPrefix+"FINDDOMENV" ;
      edtAlbCSec_Internalname = sPrefix+"ALBCSEC" ;
      edtAlcIvaCod_Internalname = sPrefix+"ALCIVACOD" ;
      edtAlbComFdD_Internalname = sPrefix+"ALBCOMFDD" ;
      edtAlbComSt_Internalname = sPrefix+"ALBCOMST" ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
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
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Visible = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Visible = 1 ;
      edtAlbComSt_Jsonclick = "" ;
      edtAlbComSt_Visible = 1 ;
      edtAlbComFdD_Visible = 1 ;
      edtAlcIvaCod_Jsonclick = "" ;
      edtAlcIvaCod_Visible = 1 ;
      edtAlbCSec_Jsonclick = "" ;
      edtAlbCSec_Visible = 1 ;
      edtfindDomEnv_Jsonclick = "" ;
      edtfindDomEnv_Visible = 1 ;
      edtAlbComEso_Jsonclick = "" ;
      edtAlbComEso_Visible = 1 ;
      edtAlbComLiC_Jsonclick = "" ;
      edtAlbComLiC_Visible = 1 ;
      edtAlbComEst_Jsonclick = "" ;
      edtAlbComEst_Visible = 1 ;
      edtAlbComImp_Jsonclick = "" ;
      edtAlbComImp_Visible = 1 ;
      edtCliDivCod_Jsonclick = "" ;
      edtCliDivCod_Visible = 1 ;
      edtCliDivTra_Jsonclick = "" ;
      edtCliDivTra_Visible = 1 ;
      edtAlbCTrDm_Jsonclick = "" ;
      edtAlbCTrDm_Enabled = 0 ;
      edtAlbCTrNc_Jsonclick = "" ;
      edtAlbCTrNc_Enabled = 0 ;
      edtAlbCTrNm_Jsonclick = "" ;
      edtAlbCTrNm_Enabled = 0 ;
      divUnnamedtable7_Visible = 1 ;
      edtAlbComFd_Enabled = 0 ;
      cmbAlbComAT.setJsonclick( "" );
      cmbAlbComAT.setEnabled( 0 );
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Enabled = 0 ;
      cmbAlbComEAT.setJsonclick( "" );
      cmbAlbComEAT.setEnabled( 0 );
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Enabled = 0 ;
      edtAlbComMat_Jsonclick = "" ;
      edtAlbComMat_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      cmbAlcDivTCod.setJsonclick( "" );
      cmbAlcDivTCod.setEnabled( 0 );
      edtAlcDivAbr_Jsonclick = "" ;
      edtAlcDivAbr_Enabled = 0 ;
      edtAlcDivCod_Jsonclick = "" ;
      edtAlcDivCod_Enabled = 0 ;
      edtAlcDomEnv_Jsonclick = "" ;
      edtAlcDomEnv_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Enabled = 0 ;
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Enabled = 0 ;
      cmbAlbComPri.setJsonclick( "" );
      cmbAlbComPri.setEnabled( 0 );
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Enabled = 0 ;
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
      cmbAlbComPri.setName( "ALBCOMPRI" );
      cmbAlbComPri.setWebtags( "" );
      cmbAlbComPri.addItem("1", httpContext.getMessage( "GR", ""), (short)(0));
      cmbAlbComPri.addItem("0", httpContext.getMessage( "GT", ""), (short)(0));
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
      }
      cmbAlcDivTCod.setName( "ALCDIVTCOD" );
      cmbAlcDivTCod.setWebtags( "" );
      cmbAlcDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbAlcDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbAlcDivTCod.getItemCount() > 0 )
      {
      }
      cmbAlbComEAT.setName( "ALBCOMEAT" );
      cmbAlbComEAT.setWebtags( "" );
      cmbAlbComEAT.addItem("0", httpContext.getMessage( "Nao Enviada a AT", ""), (short)(0));
      cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
      }
      cmbAlbComAT.setName( "ALBCOMAT" );
      cmbAlbComAT.setWebtags( "" );
      cmbAlbComAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbComAT.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      if ( cmbAlbComAT.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11NJ1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12NJ1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV11AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALCDOMENV","{handler:'valid_Alcdomenv',iparms:[]");
      setEventMetadata("VALID_ALCDOMENV",",oparms:[]}");
      setEventMetadata("VALID_ALCDIVCOD","{handler:'valid_Alcdivcod',iparms:[]");
      setEventMetadata("VALID_ALCDIVCOD",",oparms:[]}");
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
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      h252CliCod = "" ;
      h840TrnCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11AlbComPri = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A3112AlcDivAbr = "" ;
      A3095AlcDivTCod = "" ;
      A4830AlbComMat = "" ;
      lblTextblockalbcomfs_Jsonclick = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockalbcomeat_Jsonclick = "" ;
      lblTextblockalbcomid_Jsonclick = "" ;
      A10740AlbComID = "" ;
      lblTextblockalbcomat_Jsonclick = "" ;
      A10764AlbComAT = "" ;
      lblTextblockalbcomfd_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A10014AlbComFd = "" ;
      A11719AlbCTrNm = "" ;
      A11721AlbCTrNc = "" ;
      A11720AlbCTrDm = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A3091CliDivTra = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      A3094AlbCSec = "" ;
      A5143AlcIvaCod = "" ;
      A10015AlbComFdD = "" ;
      A10738AlbComSt = "" ;
      A841TrnNom = "" ;
      A279CliNom = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13735CliCNom = "" ;
      H00NJ2_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      H00NJ3_A13738TrnCNom = new String[] {""} ;
      H00NJ4_A13735CliCNom = new String[] {""} ;
      H00NJ4_A396EmprCod = new String[] {""} ;
      H00NJ4_A252CliCod = new int[1] ;
      H00NJ5_A13738TrnCNom = new String[] {""} ;
      H00NJ5_A396EmprCod = new String[] {""} ;
      H00NJ5_A840TrnCod = new short[1] ;
      H00NJ5_n840TrnCod = new boolean[] {false} ;
      AV21Pgmname = "" ;
      H00NJ7_A266CliEnvLin = new byte[1] ;
      H00NJ7_A396EmprCod = new String[] {""} ;
      H00NJ7_A14AlbComCod = new int[1] ;
      H00NJ7_A279CliNom = new String[] {""} ;
      H00NJ7_A841TrnNom = new String[] {""} ;
      H00NJ7_n841TrnNom = new boolean[] {false} ;
      H00NJ7_A10738AlbComSt = new String[] {""} ;
      H00NJ7_A10015AlbComFdD = new String[] {""} ;
      H00NJ7_A5143AlcIvaCod = new String[] {""} ;
      H00NJ7_A3094AlbCSec = new String[] {""} ;
      H00NJ7_A1783AlbComEso = new byte[1] ;
      H00NJ7_A19AlbComLiC = new short[1] ;
      H00NJ7_A16AlbComEst = new byte[1] ;
      H00NJ7_A3140CliDivCod = new byte[1] ;
      H00NJ7_n3140CliDivCod = new boolean[] {false} ;
      H00NJ7_A3091CliDivTra = new String[] {""} ;
      H00NJ7_n3091CliDivTra = new boolean[] {false} ;
      H00NJ7_A11720AlbCTrDm = new String[] {""} ;
      H00NJ7_A11721AlbCTrNc = new String[] {""} ;
      H00NJ7_A11719AlbCTrNm = new String[] {""} ;
      H00NJ7_A10014AlbComFd = new String[] {""} ;
      H00NJ7_A10764AlbComAT = new String[] {""} ;
      H00NJ7_A10740AlbComID = new String[] {""} ;
      H00NJ7_A10739AlbComEAT = new byte[1] ;
      H00NJ7_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      H00NJ7_A4830AlbComMat = new String[] {""} ;
      H00NJ7_A840TrnCod = new short[1] ;
      H00NJ7_n840TrnCod = new boolean[] {false} ;
      H00NJ7_A3095AlcDivTCod = new String[] {""} ;
      H00NJ7_A3112AlcDivAbr = new String[] {""} ;
      H00NJ7_n3112AlcDivAbr = new boolean[] {false} ;
      H00NJ7_A3111AlcDivCod = new byte[1] ;
      H00NJ7_A5142AlcDomEnv = new byte[1] ;
      H00NJ7_A252CliCod = new int[1] ;
      H00NJ7_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H00NJ7_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00NJ7_A22AlbComPri = new String[] {""} ;
      H00NJ7_A13739findDomEnv = new byte[1] ;
      H00NJ7_n13739findDomEnv = new boolean[] {false} ;
      H00NJ7_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00NJ7_n18AlbComImp = new boolean[] {false} ;
      H00NJ8_A13735CliCNom = new String[] {""} ;
      H00NJ8_A396EmprCod = new String[] {""} ;
      H00NJ8_A252CliCod = new int[1] ;
      H00NJ9_A13738TrnCNom = new String[] {""} ;
      H00NJ9_A396EmprCod = new String[] {""} ;
      H00NJ9_A840TrnCod = new short[1] ;
      H00NJ9_n840TrnCod = new boolean[] {false} ;
      H00NJ11_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00NJ11_n18AlbComImp = new boolean[] {false} ;
      H00NJ12_A13735CliCNom = new String[] {""} ;
      H00NJ12_A396EmprCod = new String[] {""} ;
      H00NJ12_A252CliCod = new int[1] ;
      H00NJ13_A13738TrnCNom = new String[] {""} ;
      H00NJ13_A396EmprCod = new String[] {""} ;
      H00NJ13_A840TrnCod = new short[1] ;
      H00NJ13_n840TrnCod = new boolean[] {false} ;
      AV17Station = "" ;
      GXt_char1 = "" ;
      AV18Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV19Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV20Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int7 = new byte[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA14AlbComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbcomgeneral__default(),
         new Object[] {
             new Object[] {
            H00NJ2_A13735CliCNom
            }
            , new Object[] {
            H00NJ3_A13738TrnCNom
            }
            , new Object[] {
            H00NJ4_A13735CliCNom, H00NJ4_A396EmprCod, H00NJ4_A252CliCod
            }
            , new Object[] {
            H00NJ5_A13738TrnCNom, H00NJ5_A396EmprCod, H00NJ5_A840TrnCod
            }
            , new Object[] {
            H00NJ7_A266CliEnvLin, H00NJ7_A396EmprCod, H00NJ7_A14AlbComCod, H00NJ7_A279CliNom, H00NJ7_A841TrnNom, H00NJ7_n841TrnNom, H00NJ7_A10738AlbComSt, H00NJ7_A10015AlbComFdD, H00NJ7_A5143AlcIvaCod, H00NJ7_A3094AlbCSec,
            H00NJ7_A1783AlbComEso, H00NJ7_A19AlbComLiC, H00NJ7_A16AlbComEst, H00NJ7_A3140CliDivCod, H00NJ7_n3140CliDivCod, H00NJ7_A3091CliDivTra, H00NJ7_n3091CliDivTra, H00NJ7_A11720AlbCTrDm, H00NJ7_A11721AlbCTrNc, H00NJ7_A11719AlbCTrNm,
            H00NJ7_A10014AlbComFd, H00NJ7_A10764AlbComAT, H00NJ7_A10740AlbComID, H00NJ7_A10739AlbComEAT, H00NJ7_A10013AlbComFs, H00NJ7_A4830AlbComMat, H00NJ7_A840TrnCod, H00NJ7_n840TrnCod, H00NJ7_A3095AlcDivTCod, H00NJ7_A3112AlcDivAbr,
            H00NJ7_n3112AlcDivAbr, H00NJ7_A3111AlcDivCod, H00NJ7_A5142AlcDomEnv, H00NJ7_A252CliCod, H00NJ7_A4829AlbComHor, H00NJ7_A17AlbComFch, H00NJ7_A22AlbComPri, H00NJ7_A13739findDomEnv, H00NJ7_n13739findDomEnv, H00NJ7_A18AlbComImp,
            H00NJ7_n18AlbComImp
            }
            , new Object[] {
            H00NJ8_A13735CliCNom, H00NJ8_A396EmprCod, H00NJ8_A252CliCod
            }
            , new Object[] {
            H00NJ9_A13738TrnCNom, H00NJ9_A396EmprCod, H00NJ9_A840TrnCod
            }
            , new Object[] {
            H00NJ11_A18AlbComImp, H00NJ11_n18AlbComImp
            }
            , new Object[] {
            H00NJ12_A13735CliCNom, H00NJ12_A396EmprCod, H00NJ12_A252CliCod
            }
            , new Object[] {
            H00NJ13_A13738TrnCNom, H00NJ13_A396EmprCod, H00NJ13_A840TrnCod
            }
         }
      );
      AV21Pgmname = "TALBCOMGeneral" ;
      /* GeneXus formulas. */
      AV21Pgmname = "TALBCOMGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A5142AlcDomEnv ;
   private byte A3111AlcDivCod ;
   private byte A10739AlbComEAT ;
   private byte A3140CliDivCod ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte A13739findDomEnv ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short A840TrnCod ;
   private short wbEnd ;
   private short wbStart ;
   private short A19AlbComLiC ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int wcpOA14AlbComCod ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtAlbComHor_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlcDomEnv_Enabled ;
   private int edtAlcDivCod_Enabled ;
   private int edtAlcDivAbr_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbComMat_Enabled ;
   private int edtAlbComFs_Enabled ;
   private int edtAlbComID_Enabled ;
   private int edtAlbComFd_Enabled ;
   private int divUnnamedtable7_Visible ;
   private int edtAlbCTrNm_Enabled ;
   private int edtAlbCTrNc_Enabled ;
   private int edtAlbCTrDm_Enabled ;
   private int edtCliDivTra_Visible ;
   private int edtCliDivCod_Visible ;
   private int edtAlbComImp_Visible ;
   private int edtAlbComEst_Visible ;
   private int edtAlbComLiC_Visible ;
   private int edtAlbComEso_Visible ;
   private int edtfindDomEnv_Visible ;
   private int edtAlbCSec_Visible ;
   private int edtAlcIvaCod_Visible ;
   private int edtAlbComFdD_Visible ;
   private int edtAlbComSt_Visible ;
   private int edtTrnNom_Visible ;
   private int edtCliNom_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal A18AlbComImp ;
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
   private String AV11AlbComPri ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtAlbComCod_Internalname ;
   private String edtAlbComCod_Jsonclick ;
   private String A22AlbComPri ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Jsonclick ;
   private String edtAlbComHor_Internalname ;
   private String edtAlbComHor_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtAlcDomEnv_Internalname ;
   private String edtAlcDomEnv_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtAlcDivCod_Internalname ;
   private String edtAlcDivCod_Jsonclick ;
   private String edtAlcDivAbr_Internalname ;
   private String A3112AlcDivAbr ;
   private String edtAlcDivAbr_Jsonclick ;
   private String A3095AlcDivTCod ;
   private String divUnnamedtable5_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbComMat_Internalname ;
   private String A4830AlbComMat ;
   private String edtAlbComMat_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtablealbcomfs_Internalname ;
   private String lblTextblockalbcomfs_Internalname ;
   private String lblTextblockalbcomfs_Jsonclick ;
   private String edtAlbComFs_Internalname ;
   private String edtAlbComFs_Jsonclick ;
   private String divUnnamedtablealbcomeat_Internalname ;
   private String lblTextblockalbcomeat_Internalname ;
   private String lblTextblockalbcomeat_Jsonclick ;
   private String divUnnamedtablealbcomid_Internalname ;
   private String lblTextblockalbcomid_Internalname ;
   private String lblTextblockalbcomid_Jsonclick ;
   private String edtAlbComID_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Jsonclick ;
   private String divUnnamedtablealbcomat_Internalname ;
   private String lblTextblockalbcomat_Internalname ;
   private String lblTextblockalbcomat_Jsonclick ;
   private String A10764AlbComAT ;
   private String divUnnamedtablealbcomfd_Internalname ;
   private String lblTextblockalbcomfd_Internalname ;
   private String lblTextblockalbcomfd_Jsonclick ;
   private String edtAlbComFd_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String A10014AlbComFd ;
   private String divUnnamedtable7_Internalname ;
   private String edtAlbCTrNm_Internalname ;
   private String A11719AlbCTrNm ;
   private String edtAlbCTrNm_Jsonclick ;
   private String edtAlbCTrNc_Internalname ;
   private String A11721AlbCTrNc ;
   private String edtAlbCTrNc_Jsonclick ;
   private String edtAlbCTrDm_Internalname ;
   private String A11720AlbCTrDm ;
   private String edtAlbCTrDm_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtCliDivTra_Internalname ;
   private String A3091CliDivTra ;
   private String edtCliDivTra_Jsonclick ;
   private String edtCliDivCod_Internalname ;
   private String edtCliDivCod_Jsonclick ;
   private String edtAlbComImp_Internalname ;
   private String edtAlbComImp_Jsonclick ;
   private String edtAlbComEst_Internalname ;
   private String edtAlbComEst_Jsonclick ;
   private String edtAlbComLiC_Internalname ;
   private String edtAlbComLiC_Jsonclick ;
   private String edtAlbComEso_Internalname ;
   private String edtAlbComEso_Jsonclick ;
   private String edtfindDomEnv_Internalname ;
   private String edtfindDomEnv_Jsonclick ;
   private String edtAlbCSec_Internalname ;
   private String A3094AlbCSec ;
   private String edtAlbCSec_Jsonclick ;
   private String edtAlcIvaCod_Internalname ;
   private String A5143AlcIvaCod ;
   private String edtAlcIvaCod_Jsonclick ;
   private String edtAlbComFdD_Internalname ;
   private String A10015AlbComFdD ;
   private String edtAlbComSt_Internalname ;
   private String A10738AlbComSt ;
   private String edtAlbComSt_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV21Pgmname ;
   private String AV17Station ;
   private String GXt_char1 ;
   private String AV18Emprcod ;
   private String GXv_char2[] ;
   private String AV19Emprnom ;
   private String GXv_char3[] ;
   private String AV20Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA14AlbComCod ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date A17AlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n840TrnCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n841TrnNom ;
   private boolean n3140CliDivCod ;
   private boolean n3091CliDivTra ;
   private boolean n3112AlcDivAbr ;
   private boolean n13739findDomEnv ;
   private boolean n18AlbComImp ;
   private boolean returnInSub ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbAlbComPri ;
   private HTMLChoice cmbAlcDivTCod ;
   private HTMLChoice cmbAlbComEAT ;
   private HTMLChoice cmbAlbComAT ;
   private IDataStoreProvider pr_default ;
   private String[] H00NJ2_A13735CliCNom ;
   private String[] H00NJ3_A13738TrnCNom ;
   private String[] H00NJ4_A13735CliCNom ;
   private String[] H00NJ4_A396EmprCod ;
   private int[] H00NJ4_A252CliCod ;
   private String[] H00NJ5_A13738TrnCNom ;
   private String[] H00NJ5_A396EmprCod ;
   private short[] H00NJ5_A840TrnCod ;
   private boolean[] H00NJ5_n840TrnCod ;
   private byte[] H00NJ7_A266CliEnvLin ;
   private String[] H00NJ7_A396EmprCod ;
   private int[] H00NJ7_A14AlbComCod ;
   private String[] H00NJ7_A279CliNom ;
   private String[] H00NJ7_A841TrnNom ;
   private boolean[] H00NJ7_n841TrnNom ;
   private String[] H00NJ7_A10738AlbComSt ;
   private String[] H00NJ7_A10015AlbComFdD ;
   private String[] H00NJ7_A5143AlcIvaCod ;
   private String[] H00NJ7_A3094AlbCSec ;
   private byte[] H00NJ7_A1783AlbComEso ;
   private short[] H00NJ7_A19AlbComLiC ;
   private byte[] H00NJ7_A16AlbComEst ;
   private byte[] H00NJ7_A3140CliDivCod ;
   private boolean[] H00NJ7_n3140CliDivCod ;
   private String[] H00NJ7_A3091CliDivTra ;
   private boolean[] H00NJ7_n3091CliDivTra ;
   private String[] H00NJ7_A11720AlbCTrDm ;
   private String[] H00NJ7_A11721AlbCTrNc ;
   private String[] H00NJ7_A11719AlbCTrNm ;
   private String[] H00NJ7_A10014AlbComFd ;
   private String[] H00NJ7_A10764AlbComAT ;
   private String[] H00NJ7_A10740AlbComID ;
   private byte[] H00NJ7_A10739AlbComEAT ;
   private java.util.Date[] H00NJ7_A10013AlbComFs ;
   private String[] H00NJ7_A4830AlbComMat ;
   private short[] H00NJ7_A840TrnCod ;
   private boolean[] H00NJ7_n840TrnCod ;
   private String[] H00NJ7_A3095AlcDivTCod ;
   private String[] H00NJ7_A3112AlcDivAbr ;
   private boolean[] H00NJ7_n3112AlcDivAbr ;
   private byte[] H00NJ7_A3111AlcDivCod ;
   private byte[] H00NJ7_A5142AlcDomEnv ;
   private int[] H00NJ7_A252CliCod ;
   private java.util.Date[] H00NJ7_A4829AlbComHor ;
   private java.util.Date[] H00NJ7_A17AlbComFch ;
   private String[] H00NJ7_A22AlbComPri ;
   private byte[] H00NJ7_A13739findDomEnv ;
   private boolean[] H00NJ7_n13739findDomEnv ;
   private java.math.BigDecimal[] H00NJ7_A18AlbComImp ;
   private boolean[] H00NJ7_n18AlbComImp ;
   private String[] H00NJ8_A13735CliCNom ;
   private String[] H00NJ8_A396EmprCod ;
   private int[] H00NJ8_A252CliCod ;
   private String[] H00NJ9_A13738TrnCNom ;
   private String[] H00NJ9_A396EmprCod ;
   private short[] H00NJ9_A840TrnCod ;
   private boolean[] H00NJ9_n840TrnCod ;
   private java.math.BigDecimal[] H00NJ11_A18AlbComImp ;
   private boolean[] H00NJ11_n18AlbComImp ;
   private String[] H00NJ12_A13735CliCNom ;
   private String[] H00NJ12_A396EmprCod ;
   private int[] H00NJ12_A252CliCod ;
   private String[] H00NJ13_A13738TrnCNom ;
   private String[] H00NJ13_A396EmprCod ;
   private short[] H00NJ13_A840TrnCod ;
   private boolean[] H00NJ13_n840TrnCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class talbcomgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00NJ2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NJ3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NJ4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NJ5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NJ7", "SELECT T5.CliEnvLin, T1.EmprCod, T1.AlbComCod, T3.CliNom, T4.TrnNom, T1.AlbComSt, T1.AlbComFdD, T1.AlcIvaCod, T1.AlbCSec, T1.AlbComEso, T1.AlbComLiC, T1.AlbComEst, T3.CliDivCod, T3.CliDivTra, T1.AlbCTrDm, T1.AlbCTrNc, T1.AlbCTrNm, T1.AlbComFd, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComFs, T1.AlbComMat, T1.TrnCod, T1.AlcDivTCod, T2.DivAbr AS AlcDivAbr, T1.AlcDivCod AS AlcDivCod, T1.AlcDomEnv, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComPri, COALESCE( T5.CliEnvLin, 0) AS findDomEnv, COALESCE( T6.AlbComImp, 0) AS AlbComImp FROM (((((TXPCALCOM T1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = T1.AlcDivCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.CliEnvLin = T1.AlcDomEnv) LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.AlbComCod = T1.AlbComCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NJ8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NJ9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NJ11", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NJ12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NJ13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 200);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 60);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 60);
               ((String[]) buf[20])[0] = rslt.getString(18, 200);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 20);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((String[]) buf[29])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((byte[]) buf[32])[0] = rslt.getByte(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(30);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(31);
               ((String[]) buf[36])[0] = rslt.getString(32, 1);
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
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
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

