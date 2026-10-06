package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn06general_impl extends GXWebComponent
{
   public ttrn06general_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn06general_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06general_impl.class ));
   }

   public ttrn06general_impl( int remoteHandle ,
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
      cmbAlbProPri = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
      cmbAlbSec = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Long.valueOf(A30AlbProCod)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
            {
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaguiremcliJL0( A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
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
               gxsgaalbclidesJL0( A396EmprCod, A13735CliCNom) ;
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
               gxsgatrncodJL0( A396EmprCod, A13738TrnCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
            {
               A13735CliCNom = httpContext.GetPar( "CliCNom") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgaguiremcliJL0( A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"GUIREMCLI") == 0 )
            {
               h1243GuiRemCli = httpContext.GetPar( "h1243GuiRemCli") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaguiremcliJL2( h1243GuiRemCli) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
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
               gxsgaalbclidesJL0( A396EmprCod, A13735CliCNom) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALBCLIDES") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               h3869AlbCliDes = httpContext.GetPar( "h3869AlbCliDes") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcaalbclidesJL2( A396EmprCod, h3869AlbCliDes) ;
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
               gxsgatrncodJL0( A396EmprCod, A13738TrnCNom) ;
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
               gxhcatrncodJL2( A396EmprCod, h840TrnCod) ;
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
         paJL2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "TTrn06 General", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn06general", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"EmprCod","AlbProCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBPROPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBSEC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12AlbSec, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA30AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOA30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROPRI", GXutil.rtrim( AV11AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBPROPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBSEC", GXutil.rtrim( AV12AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBSEC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCGUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCALBCLIDES", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseFormJL2( )
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
      return "TTrn06General" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TTrn06 General", "") ;
   }

   public void wbJL0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ttrn06general");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProPri.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProPri, cmbAlbProPri.getInternalname(), GXutil.rtrim( A39AlbProPri), 1, cmbAlbProPri.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProPri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06General.htm");
         cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProEst.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProEst, cmbAlbProEst.getInternalname(), GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)), 1, cmbAlbProEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbProEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06General.htm");
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbsec_cell_Internalname, 1, 0, "px", 0, "px", divAlbsec_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbAlbSec.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbSec.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbSec.getInternalname(), httpContext.getMessage( "Malha Acab?", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbSec, cmbAlbSec.getInternalname(), GXutil.rtrim( A2242AlbSec), 1, cmbAlbSec.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", cmbAlbSec.getVisible(), cmbAlbSec.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06General.htm");
         cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Data", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06General.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecSal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbFecSal_Internalname, httpContext.getMessage( "Data Saida", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecSal_Internalname, localUtil.format(A4023AlbFecSal, "99/99/99"), localUtil.format( A4023AlbFecSal, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06General.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHorSal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbHorSal_Internalname, httpContext.getMessage( "Hora Salida", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHorSal_Internalname, GXutil.rtrim( A3865AlbHorSal), GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHorSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHorSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbUsu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbUsu_Internalname, httpContext.getMessage( "Operador", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUsu_Internalname, GXutil.rtrim( A7098AlbUsu), GXutil.rtrim( localUtil.format( A7098AlbUsu, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, h1243GuiRemCli, GXutil.rtrim( localUtil.format( h1243GuiRemCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCliDes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliDes_Internalname, h3869AlbCliDes, GXutil.rtrim( localUtil.format( h3869AlbCliDes, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCliDes_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDomEnv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Envio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbMat_Internalname, httpContext.getMessage( "Matricula", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMat_Internalname, GXutil.rtrim( A3868AlbMat), GXutil.rtrim( localUtil.format( A3868AlbMat, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "AT", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTrn06General.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbenvftp_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbenvftp_Internalname, "", "", "", lblTextblockalbenvftp_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06General.htm");
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealblic_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalblic_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblockalblic_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbLic_Internalname, httpContext.getMessage( "Licencia Conducir", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbproat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbproat_Internalname, "", "", "", lblTextblockalbproat_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbProAT.getInternalname(), httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProAT, cmbAlbProAT.getInternalname(), GXutil.rtrim( A10765AlbProAT), 1, cmbAlbProAT.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProAT.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06General.htm");
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbhhfm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbhhfm_Internalname, httpContext.getMessage( "StartTime", ""), "", "", lblTextblockalbhhfm_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbHhfm_Internalname, httpContext.getMessage( "Hora Firma Digital", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbHhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHhfm_Internalname, localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10019AlbHhfm, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbHhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbHhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06General.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbgrosst_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbgrosst_Internalname, httpContext.getMessage( "Gross Total", ""), "", "", lblTextblockalbgrosst_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbGrossT_Internalname, httpContext.getMessage( "Total Bruto Firma", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGrossT_Enabled!=0) ? localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGrossT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbfmd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbfmd_Internalname, httpContext.getMessage( "Hash", ""), "", "", lblTextblockalbfmd_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbFmd_Internalname, httpContext.getMessage( "Firma Digital", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtAlbFmd_Internalname, A10017AlbFmd, "", "", (short)(0), 1, edtAlbFmd_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbtrnnm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnm_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNm_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNm_Internalname, httpContext.getMessage( "Nome Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNm_Internalname, GXutil.rtrim( A10835AlbTrnNm), GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNm_Visible, edtAlbTrnNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbtrnnc_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnc_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNc_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNc_Internalname, httpContext.getMessage( "N contribuiente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNc_Internalname, GXutil.rtrim( A10837AlbTrnNc), GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNc_Visible, edtAlbTrnNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbtrndm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrndm_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnDm_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnDm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbTrnDm_Internalname, httpContext.getMessage( "Morada Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnDm_Internalname, GXutil.rtrim( A10836AlbTrnDm), GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnDm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnDm_Visible, edtAlbTrnDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11jl1_client"+"'", TempTags, "", 2, "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e12jl1_client"+"'", TempTags, "", 2, "HLP_TTrn06General.htm");
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
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtALbFmdc_Internalname, GXutil.rtrim( A10018ALbFmdc), "", "", (short)(0), edtALbFmdc_Visible, 0, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarca_Internalname, GXutil.rtrim( A5140AlbMarca), GXutil.rtrim( localUtil.format( A5140AlbMarca, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarca_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMarca_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocDes_Internalname, GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocDes_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbLocDes_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocCar_Internalname, GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocCar_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbLocCar_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsCon_Internalname, GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsCon_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbPObsCon_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbIvaCod_Internalname, GXutil.rtrim( A5141AlbIvaCod), GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbIvaCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbIvaCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColCa_Internalname, GXutil.rtrim( A7987AlbColCa), GXutil.rtrim( localUtil.format( A7987AlbColCa, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColCa_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbColCa_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDesp_Internalname, GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDesp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDesp_Visible, 0, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCambio_Internalname, GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A7986AlbCambio, "Z9.9999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCambio_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCambio_Visible, 0, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipDoc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbTipDoc_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMotTr_Internalname, GXutil.rtrim( A7984AlbMotTr), GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMotTr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMotTr_Visible, 0, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipCal_Internalname, GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipCal_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbTipCal_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbObsCb_Internalname, GXutil.rtrim( A7988AlbObsCb), GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbObsCb_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbObsCb_Visible, 0, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumT_Internalname, GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbNumT_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarCo_Internalname, GXutil.rtrim( A7100AlbMarCo), GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarCo_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMarCo_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOComp_Internalname, GXutil.rtrim( A7099AlbOComp), GXutil.rtrim( localUtil.format( A7099AlbOComp, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOComp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbOComp_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNif_Internalname, GXutil.rtrim( A3643TrnNif), GXutil.rtrim( localUtil.format( A3643TrnNif, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNif_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNif_Visible, 0, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivTCod_Internalname, GXutil.rtrim( A3093AlbDivTCod), GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivTCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivTCod_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivAbr_Internalname, GXutil.rtrim( A3109AlbDivAbr), GXutil.rtrim( localUtil.format( A3109AlbDivAbr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivAbr_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivCod_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBusDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBusDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtBusDomEnv_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprGuiRem_Internalname, GXutil.rtrim( A1253EmprGuiRem), GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprGuiRem_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprGuiRem_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDom_Internalname, GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDom_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDom_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDivT_Internalname, GXutil.rtrim( A3145GuiRemDivT), GXutil.rtrim( localUtil.format( A3145GuiRemDivT, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDivT_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDivT_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDiv_Internalname, GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDiv_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDiv_Visible, 0, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCln_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06General.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startJL2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TTrn06 General", ""), (short)(0)) ;
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
            strupJL0( ) ;
         }
      }
   }

   public void wsJL2( )
   {
      startJL2( ) ;
      evtJL2( ) ;
   }

   public void evtJL2( )
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
                              strupJL0( ) ;
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
                              strupJL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13JL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e14JL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupJL0( ) ;
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
                              strupJL0( ) ;
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

   public void weJL2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormJL2( ) ;
         }
      }
   }

   public void paJL2( )
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

   public void gxsgaguiremcliJL0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaguiremcli_dataJL0( A13735CliCNom) ;
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

   protected void gxsgaguiremcli_dataJL0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00JL2 */
      pr_default.execute(0, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00JL2_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00JL2_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H00JL2_A13735CliCNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgaalbclidesJL0( String A396EmprCod ,
                                  String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbclides_dataJL0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaalbclides_dataJL0( String A396EmprCod ,
                                          String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H00JL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H00JL3_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(H00JL3_A13735CliCNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgatrncodJL0( String A396EmprCod ,
                               String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_dataJL0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_dataJL0( String A396EmprCod ,
                                       String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor H00JL4 */
      pr_default.execute(2, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(H00JL4_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(H00JL4_A13738TrnCNom[0]);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxhcaguiremcliJL2( String A13735CliCNom )
   {
      /* Using cursor H00JL5 */
      pr_default.execute(3, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.strcmp(H00JL5_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H00JL5_A13735CliCNom[0] ;
            A396EmprCod = H00JL5_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A252CliCod = H00JL5_A252CliCod[0] ;
         }
         pr_default.readNext(3);
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
      pr_default.close(3);
   }

   public void gxhcaalbclidesJL2( String A396EmprCod ,
                                  String A13735CliCNom )
   {
      /* Using cursor H00JL6 */
      pr_default.execute(4, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = H00JL6_A13735CliCNom[0] ;
         A396EmprCod = H00JL6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A252CliCod = H00JL6_A252CliCod[0] ;
         pr_default.readNext(4);
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
      pr_default.close(4);
   }

   public void gxhcatrncodJL2( String A396EmprCod ,
                               String A13738TrnCNom )
   {
      /* Using cursor H00JL7 */
      pr_default.execute(5, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = H00JL7_A13738TrnCNom[0] ;
         A396EmprCod = H00JL7_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A840TrnCod = H00JL7_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(5);
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
      pr_default.close(5);
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
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A39AlbProPri", A39AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      }
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
      }
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2242AlbSec", A2242AlbSec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
      }
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfJL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "TTrn06General" ;
      Gx_err = (short)(0) ;
   }

   public void rfJL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00JL8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A841TrnNom = H00JL8_A841TrnNom[0] ;
            n841TrnNom = H00JL8_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A1244GuiRemCln = H00JL8_A1244GuiRemCln[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
            A3110GuiRemDiv = H00JL8_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H00JL8_n3110GuiRemDiv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
            A3145GuiRemDivT = H00JL8_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H00JL8_n3145GuiRemDivT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3145GuiRemDivT", A3145GuiRemDivT);
            A1258GuiRemDom = H00JL8_A1258GuiRemDom[0] ;
            n1258GuiRemDom = H00JL8_n1258GuiRemDom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
            A1253EmprGuiRem = H00JL8_A1253EmprGuiRem[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1253EmprGuiRem", A1253EmprGuiRem);
            A3108AlbDivCod = H00JL8_A3108AlbDivCod[0] ;
            n3108AlbDivCod = H00JL8_n3108AlbDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            A3109AlbDivAbr = H00JL8_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H00JL8_n3109AlbDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3109AlbDivAbr", A3109AlbDivAbr);
            A3093AlbDivTCod = H00JL8_A3093AlbDivTCod[0] ;
            n3093AlbDivTCod = H00JL8_n3093AlbDivTCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3093AlbDivTCod", A3093AlbDivTCod);
            A3643TrnNif = H00JL8_A3643TrnNif[0] ;
            n3643TrnNif = H00JL8_n3643TrnNif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3643TrnNif", A3643TrnNif);
            A7099AlbOComp = H00JL8_A7099AlbOComp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7099AlbOComp", A7099AlbOComp);
            A7100AlbMarCo = H00JL8_A7100AlbMarCo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7100AlbMarCo", A7100AlbMarCo);
            A7102AlbNumT = H00JL8_A7102AlbNumT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
            A7988AlbObsCb = H00JL8_A7988AlbObsCb[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7988AlbObsCb", A7988AlbObsCb);
            A5803AlbTipCal = H00JL8_A5803AlbTipCal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
            A7984AlbMotTr = H00JL8_A7984AlbMotTr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7984AlbMotTr", A7984AlbMotTr);
            A7985AlbTipDoc = H00JL8_A7985AlbTipDoc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
            A7986AlbCambio = H00JL8_A7986AlbCambio[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
            A7162AlbDesp = H00JL8_A7162AlbDesp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
            A7987AlbColCa = H00JL8_A7987AlbColCa[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7987AlbColCa", A7987AlbColCa);
            A5141AlbIvaCod = H00JL8_A5141AlbIvaCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5141AlbIvaCod", A5141AlbIvaCod);
            A914AlbPObsCon = H00JL8_A914AlbPObsCon[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            A3866AlbLocCar = H00JL8_A3866AlbLocCar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
            A3867AlbLocDes = H00JL8_A3867AlbLocDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
            A5140AlbMarca = H00JL8_A5140AlbMarca[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5140AlbMarca", A5140AlbMarca);
            A10018ALbFmdc = H00JL8_A10018ALbFmdc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10018ALbFmdc", A10018ALbFmdc);
            A10836AlbTrnDm = H00JL8_A10836AlbTrnDm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10836AlbTrnDm", A10836AlbTrnDm);
            A10837AlbTrnNc = H00JL8_A10837AlbTrnNc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10837AlbTrnNc", A10837AlbTrnNc);
            A10835AlbTrnNm = H00JL8_A10835AlbTrnNm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10835AlbTrnNm", A10835AlbTrnNm);
            A10017AlbFmd = H00JL8_A10017AlbFmd[0] ;
            n10017AlbFmd = H00JL8_n10017AlbFmd[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10017AlbFmd", A10017AlbFmd);
            A10020AlbGrossT = H00JL8_A10020AlbGrossT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            A10019AlbHhfm = H00JL8_A10019AlbHhfm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10765AlbProAT = H00JL8_A10765AlbProAT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10765AlbProAT", A10765AlbProAT);
            A7101AlbLic = H00JL8_A7101AlbLic[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7101AlbLic", A7101AlbLic);
            A5805AlbEnvFtp = H00JL8_A5805AlbEnvFtp[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A3868AlbMat = H00JL8_A3868AlbMat[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3868AlbMat", A3868AlbMat);
            A840TrnCod = H00JL8_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A1259AlbDomEnv = H00JL8_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = H00JL8_n1259AlbDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
            A3869AlbCliDes = H00JL8_A3869AlbCliDes[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
            A1243GuiRemCli = H00JL8_A1243GuiRemCli[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            A7098AlbUsu = H00JL8_A7098AlbUsu[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7098AlbUsu", A7098AlbUsu);
            A3865AlbHorSal = H00JL8_A3865AlbHorSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3865AlbHorSal", A3865AlbHorSal);
            A4023AlbFecSal = H00JL8_A4023AlbFecSal[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            A34AlbProfch = H00JL8_A34AlbProfch[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            A2242AlbSec = H00JL8_A2242AlbSec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2242AlbSec", A2242AlbSec);
            A33AlbProEst = H00JL8_A33AlbProEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            A39AlbProPri = H00JL8_A39AlbProPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A39AlbProPri", A39AlbProPri);
            A1260BusDomEnv = H00JL8_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H00JL8_n1260BusDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
            A3109AlbDivAbr = H00JL8_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H00JL8_n3109AlbDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3109AlbDivAbr", A3109AlbDivAbr);
            A1244GuiRemCln = H00JL8_A1244GuiRemCln[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
            A3110GuiRemDiv = H00JL8_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H00JL8_n3110GuiRemDiv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
            A3145GuiRemDivT = H00JL8_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H00JL8_n3145GuiRemDivT[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3145GuiRemDivT", A3145GuiRemDivT);
            A1260BusDomEnv = H00JL8_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H00JL8_n1260BusDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
            A841TrnNom = H00JL8_A841TrnNom[0] ;
            n841TrnNom = H00JL8_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A3643TrnNif = H00JL8_A3643TrnNif[0] ;
            n3643TrnNif = H00JL8_n3643TrnNif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3643TrnNif", A3643TrnNif);
            if ( (GXutil.strcmp("", h840TrnCod)==0) )
            {
               A840TrnCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A13738TrnCNom = h840TrnCod ;
               /* Using cursor H00JL9 */
               pr_default.execute(7, new Object[] {A13738TrnCNom, A396EmprCod});
               A840TrnCod = H00JL9_A840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A840TrnCod = H00JL9_A840TrnCod[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  pr_default.readNext(7);
                  if ( ! ( (pr_default.getStatus(7) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  }
               }
               else
               {
               }
               pr_default.close(7);
            }
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
            /* Using cursor H00JL10 */
            pr_default.execute(8, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
            A841TrnNom = H00JL10_A841TrnNom[0] ;
            n841TrnNom = H00JL10_n841TrnNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
            A3643TrnNif = H00JL10_A3643TrnNif[0] ;
            n3643TrnNif = H00JL10_n3643TrnNif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3643TrnNif", A3643TrnNif);
            pr_default.close(8);
            /* Execute user event: Load */
            e14JL2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         wbJL0( ) ;
      }
   }

   public void send_integrity_lvl_hashesJL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROPRI", GXutil.rtrim( AV11AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBPROPRI", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV11AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBSEC", GXutil.rtrim( AV12AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vALBSEC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV12AlbSec, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV19Pgmname = "TTrn06General" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00JL11 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      A407EmprNom = H00JL11_A407EmprNom[0] ;
      n407EmprNom = H00JL11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(9);
      pr_default.close(9);
      fix_multi_value_controls( ) ;
   }

   public void strupJL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13JL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV12AlbSec = httpContext.cgiGet( sPrefix+"vALBSEC") ;
         AV11AlbProPri = httpContext.cgiGet( sPrefix+"vALBPROPRI") ;
         /* Read variables values. */
         cmbAlbProPri.setValue( httpContext.cgiGet( cmbAlbProPri.getInternalname()) );
         A39AlbProPri = httpContext.cgiGet( cmbAlbProPri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A39AlbProPri", A39AlbProPri);
         cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
         A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         cmbAlbSec.setValue( httpContext.cgiGet( cmbAlbSec.getInternalname()) );
         A2242AlbSec = httpContext.cgiGet( cmbAlbSec.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2242AlbSec", A2242AlbSec);
         A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3865AlbHorSal", A3865AlbHorSal);
         A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7098AlbUsu", A7098AlbUsu);
         h1243GuiRemCli = httpContext.cgiGet( edtGuiRemCli_Internalname) ;
         if ( (GXutil.strcmp("", h1243GuiRemCli)==0) )
         {
            A1243GuiRemCli = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         }
         else
         {
            A13735CliCNom = h1243GuiRemCli ;
            /* Using cursor H00JL12 */
            pr_default.execute(10, new Object[] {A13735CliCNom});
            A1243GuiRemCli = H00JL12_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "GUIREMCLI");
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h1243GuiRemCli", h1243GuiRemCli);
         h3869AlbCliDes = httpContext.cgiGet( edtAlbCliDes_Internalname) ;
         if ( (GXutil.strcmp("", h3869AlbCliDes)==0) )
         {
            A3869AlbCliDes = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         }
         else
         {
            A13735CliCNom = h3869AlbCliDes ;
            /* Using cursor H00JL13 */
            pr_default.execute(11, new Object[] {A13735CliCNom, A396EmprCod});
            A3869AlbCliDes = H00JL13_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "ALBCLIDES");
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h3869AlbCliDes", h3869AlbCliDes);
         A1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1259AlbDomEnv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor H00JL14 */
            pr_default.execute(12, new Object[] {A13738TrnCNom, A396EmprCod});
            A840TrnCod = H00JL14_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = H00JL14_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               pr_default.readNext(12);
               if ( ! ( (pr_default.getStatus(12) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               }
            }
            else
            {
            }
            pr_default.close(12);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "h840TrnCod", h840TrnCod);
         A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3868AlbMat", A3868AlbMat);
         cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
         A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7101AlbLic", A7101AlbLic);
         cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
         A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
         n10017AlbFmd = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10017AlbFmd", A10017AlbFmd);
         A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10018ALbFmdc", A10018ALbFmdc);
         A5140AlbMarca = httpContext.cgiGet( edtAlbMarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5140AlbMarca", A5140AlbMarca);
         A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
         A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
         A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A5141AlbIvaCod = GXutil.upper( httpContext.cgiGet( edtAlbIvaCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5141AlbIvaCod", A5141AlbIvaCod);
         A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7987AlbColCa", A7987AlbColCa);
         A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
         A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
         A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
         A7984AlbMotTr = httpContext.cgiGet( edtAlbMotTr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7984AlbMotTr", A7984AlbMotTr);
         A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
         A7988AlbObsCb = httpContext.cgiGet( edtAlbObsCb_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7988AlbObsCb", A7988AlbObsCb);
         A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
         A7100AlbMarCo = httpContext.cgiGet( edtAlbMarCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7100AlbMarCo", A7100AlbMarCo);
         A7099AlbOComp = httpContext.cgiGet( edtAlbOComp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7099AlbOComp", A7099AlbOComp);
         A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
         n3643TrnNif = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3643TrnNif", A3643TrnNif);
         A3093AlbDivTCod = httpContext.cgiGet( edtAlbDivTCod_Internalname) ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
         n3109AlbDivAbr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3109AlbDivAbr", A3109AlbDivAbr);
         A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1258GuiRemDom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
         A3145GuiRemDivT = httpContext.cgiGet( edtGuiRemDivT_Internalname) ;
         n3145GuiRemDivT = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDiv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3110GuiRemDiv = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A841TrnNom", A841TrnNom);
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
      e13JL2 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e13JL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn06general_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn06general_impl.this.AV16Emprcod = GXv_char2[0] ;
      ttrn06general_impl.this.AV17Emprnom = GXv_char3[0] ;
      ttrn06general_impl.this.AV18Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e14JL2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtALbFmdc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtALbFmdc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbFmdc_Visible), 5, 0), true);
      edtAlbMarca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarca_Visible), 5, 0), true);
      edtAlbLocDes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbLocDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocDes_Visible), 5, 0), true);
      edtAlbLocCar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbLocCar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocCar_Visible), 5, 0), true);
      edtAlbPObsCon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbPObsCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Visible), 5, 0), true);
      edtAlbIvaCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbIvaCod_Visible), 5, 0), true);
      edtAlbColCa_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbColCa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColCa_Visible), 5, 0), true);
      edtAlbDesp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDesp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDesp_Visible), 5, 0), true);
      edtAlbCambio_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbCambio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCambio_Visible), 5, 0), true);
      edtAlbTipDoc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTipDoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipDoc_Visible), 5, 0), true);
      edtAlbMotTr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbMotTr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMotTr_Visible), 5, 0), true);
      edtAlbTipCal_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTipCal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCal_Visible), 5, 0), true);
      edtAlbObsCb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbObsCb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsCb_Visible), 5, 0), true);
      edtAlbNumT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbNumT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumT_Visible), 5, 0), true);
      edtAlbMarCo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbMarCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarCo_Visible), 5, 0), true);
      edtAlbOComp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbOComp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOComp_Visible), 5, 0), true);
      edtTrnNif_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNif_Visible), 5, 0), true);
      edtAlbDivTCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDivTCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivTCod_Visible), 5, 0), true);
      edtAlbDivAbr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivAbr_Visible), 5, 0), true);
      edtAlbDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Visible), 5, 0), true);
      edtBusDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBusDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBusDomEnv_Visible), 5, 0), true);
      edtEmprGuiRem_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprGuiRem_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Visible), 5, 0), true);
      edtGuiRemDom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDom_Visible), 5, 0), true);
      edtGuiRemDivT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemDivT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDivT_Visible), 5, 0), true);
      edtGuiRemDiv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemDiv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDiv_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtGuiRemCln_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), true);
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ERFOC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbTrnNm_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
         divAlbtrnnm_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      }
      else
      {
         edtAlbTrnNm_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
         divAlbtrnnm_cell_Class = "DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ERFOC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbTrnNc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
         divAlbtrnnc_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      }
      else
      {
         edtAlbTrnNc_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
         divAlbtrnnc_cell_Class = "DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ERFOC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtAlbTrnDm_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
         divAlbtrndm_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      }
      else
      {
         edtAlbTrnDm_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
         divAlbtrndm_cell_Class = "DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "TINAMA", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbAlbSec.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
         divAlbsec_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
      }
      else
      {
         cmbAlbSec.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
         divAlbsec_cell_Class = "DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
      }
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int7) ;
      ttrn06general_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable6_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV19Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn06" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
      paJL2( ) ;
      wsJL2( ) ;
      weJL2( ) ;
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
      sCtrlA30AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paJL2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ttrn06general", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paJL2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A30AlbProCod != wcpOA30AlbProCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA30AlbProCod = A30AlbProCod ;
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
      sCtrlA30AlbProCod = httpContext.cgiGet( sPrefix+"A30AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlA30AlbProCod) > 0 )
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlA30AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"A30AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
      paJL2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsJL2( ) ;
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
      wsJL2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA30AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_CTRL", GXutil.rtrim( sCtrlA30AlbProCod));
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
      weJL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824159627", true, true);
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
      httpContext.AddJavascriptSource("ttrn06general.js", "?2026824159627", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
      cmbAlbProPri.setInternalname( sPrefix+"ALBPROPRI" );
      cmbAlbProEst.setInternalname( sPrefix+"ALBPROEST" );
      cmbAlbSec.setInternalname( sPrefix+"ALBSEC" );
      divAlbsec_cell_Internalname = sPrefix+"ALBSEC_CELL" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH" ;
      edtAlbFecSal_Internalname = sPrefix+"ALBFECSAL" ;
      edtAlbHorSal_Internalname = sPrefix+"ALBHORSAL" ;
      edtAlbUsu_Internalname = sPrefix+"ALBUSU" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI" ;
      edtAlbCliDes_Internalname = sPrefix+"ALBCLIDES" ;
      edtAlbDomEnv_Internalname = sPrefix+"ALBDOMENV" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtAlbMat_Internalname = sPrefix+"ALBMAT" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTextblockalbenvftp_Internalname = sPrefix+"TEXTBLOCKALBENVFTP" ;
      cmbAlbEnvFtp.setInternalname( sPrefix+"ALBENVFTP" );
      divUnnamedtablealbenvftp_Internalname = sPrefix+"UNNAMEDTABLEALBENVFTP" ;
      lblTextblockalblic_Internalname = sPrefix+"TEXTBLOCKALBLIC" ;
      edtAlbLic_Internalname = sPrefix+"ALBLIC" ;
      divUnnamedtablealblic_Internalname = sPrefix+"UNNAMEDTABLEALBLIC" ;
      lblTextblockalbproat_Internalname = sPrefix+"TEXTBLOCKALBPROAT" ;
      cmbAlbProAT.setInternalname( sPrefix+"ALBPROAT" );
      divUnnamedtablealbproat_Internalname = sPrefix+"UNNAMEDTABLEALBPROAT" ;
      divUnnamedtable9_Internalname = sPrefix+"UNNAMEDTABLE9" ;
      lblTextblockalbhhfm_Internalname = sPrefix+"TEXTBLOCKALBHHFM" ;
      edtAlbHhfm_Internalname = sPrefix+"ALBHHFM" ;
      divUnnamedtablealbhhfm_Internalname = sPrefix+"UNNAMEDTABLEALBHHFM" ;
      lblTextblockalbgrosst_Internalname = sPrefix+"TEXTBLOCKALBGROSST" ;
      edtAlbGrossT_Internalname = sPrefix+"ALBGROSST" ;
      divUnnamedtablealbgrosst_Internalname = sPrefix+"UNNAMEDTABLEALBGROSST" ;
      lblTextblockalbfmd_Internalname = sPrefix+"TEXTBLOCKALBFMD" ;
      edtAlbFmd_Internalname = sPrefix+"ALBFMD" ;
      divUnnamedtablealbfmd_Internalname = sPrefix+"UNNAMEDTABLEALBFMD" ;
      divUnnamedtable10_Internalname = sPrefix+"UNNAMEDTABLE10" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = sPrefix+"UNNAMEDGROUP8" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      edtAlbTrnNm_Internalname = sPrefix+"ALBTRNNM" ;
      divAlbtrnnm_cell_Internalname = sPrefix+"ALBTRNNM_CELL" ;
      edtAlbTrnNc_Internalname = sPrefix+"ALBTRNNC" ;
      divAlbtrnnc_cell_Internalname = sPrefix+"ALBTRNNC_CELL" ;
      edtAlbTrnDm_Internalname = sPrefix+"ALBTRNDM" ;
      divAlbtrndm_cell_Internalname = sPrefix+"ALBTRNDM_CELL" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtALbFmdc_Internalname = sPrefix+"ALBFMDC" ;
      edtAlbMarca_Internalname = sPrefix+"ALBMARCA" ;
      edtAlbLocDes_Internalname = sPrefix+"ALBLOCDES" ;
      edtAlbLocCar_Internalname = sPrefix+"ALBLOCCAR" ;
      edtAlbPObsCon_Internalname = sPrefix+"ALBPOBSCON" ;
      edtAlbIvaCod_Internalname = sPrefix+"ALBIVACOD" ;
      edtAlbColCa_Internalname = sPrefix+"ALBCOLCA" ;
      edtAlbDesp_Internalname = sPrefix+"ALBDESP" ;
      edtAlbCambio_Internalname = sPrefix+"ALBCAMBIO" ;
      edtAlbTipDoc_Internalname = sPrefix+"ALBTIPDOC" ;
      edtAlbMotTr_Internalname = sPrefix+"ALBMOTTR" ;
      edtAlbTipCal_Internalname = sPrefix+"ALBTIPCAL" ;
      edtAlbObsCb_Internalname = sPrefix+"ALBOBSCB" ;
      edtAlbNumT_Internalname = sPrefix+"ALBNUMT" ;
      edtAlbMarCo_Internalname = sPrefix+"ALBMARCO" ;
      edtAlbOComp_Internalname = sPrefix+"ALBOCOMP" ;
      edtTrnNif_Internalname = sPrefix+"TRNNIF" ;
      edtAlbDivTCod_Internalname = sPrefix+"ALBDIVTCOD" ;
      edtAlbDivAbr_Internalname = sPrefix+"ALBDIVABR" ;
      edtAlbDivCod_Internalname = sPrefix+"ALBDIVCOD" ;
      edtBusDomEnv_Internalname = sPrefix+"BUSDOMENV" ;
      edtEmprGuiRem_Internalname = sPrefix+"EMPRGUIREM" ;
      edtGuiRemDom_Internalname = sPrefix+"GUIREMDOM" ;
      edtGuiRemDivT_Internalname = sPrefix+"GUIREMDIVT" ;
      edtGuiRemDiv_Internalname = sPrefix+"GUIREMDIV" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN" ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM" ;
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
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Visible = 1 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtGuiRemDiv_Jsonclick = "" ;
      edtGuiRemDiv_Visible = 1 ;
      edtGuiRemDivT_Jsonclick = "" ;
      edtGuiRemDivT_Visible = 1 ;
      edtGuiRemDom_Jsonclick = "" ;
      edtGuiRemDom_Visible = 1 ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtEmprGuiRem_Visible = 1 ;
      edtBusDomEnv_Jsonclick = "" ;
      edtBusDomEnv_Visible = 1 ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivCod_Visible = 1 ;
      edtAlbDivAbr_Jsonclick = "" ;
      edtAlbDivAbr_Visible = 1 ;
      edtAlbDivTCod_Jsonclick = "" ;
      edtAlbDivTCod_Visible = 1 ;
      edtTrnNif_Jsonclick = "" ;
      edtTrnNif_Visible = 1 ;
      edtAlbOComp_Jsonclick = "" ;
      edtAlbOComp_Visible = 1 ;
      edtAlbMarCo_Jsonclick = "" ;
      edtAlbMarCo_Visible = 1 ;
      edtAlbNumT_Jsonclick = "" ;
      edtAlbNumT_Visible = 1 ;
      edtAlbObsCb_Jsonclick = "" ;
      edtAlbObsCb_Visible = 1 ;
      edtAlbTipCal_Jsonclick = "" ;
      edtAlbTipCal_Visible = 1 ;
      edtAlbMotTr_Jsonclick = "" ;
      edtAlbMotTr_Visible = 1 ;
      edtAlbTipDoc_Jsonclick = "" ;
      edtAlbTipDoc_Visible = 1 ;
      edtAlbCambio_Jsonclick = "" ;
      edtAlbCambio_Visible = 1 ;
      edtAlbDesp_Jsonclick = "" ;
      edtAlbDesp_Visible = 1 ;
      edtAlbColCa_Jsonclick = "" ;
      edtAlbColCa_Visible = 1 ;
      edtAlbIvaCod_Jsonclick = "" ;
      edtAlbIvaCod_Visible = 1 ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbPObsCon_Visible = 1 ;
      edtAlbLocCar_Jsonclick = "" ;
      edtAlbLocCar_Visible = 1 ;
      edtAlbLocDes_Jsonclick = "" ;
      edtAlbLocDes_Visible = 1 ;
      edtAlbMarca_Jsonclick = "" ;
      edtAlbMarca_Visible = 1 ;
      edtALbFmdc_Visible = 1 ;
      edtAlbTrnDm_Jsonclick = "" ;
      edtAlbTrnDm_Enabled = 0 ;
      edtAlbTrnDm_Visible = 1 ;
      divAlbtrndm_cell_Class = "" ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbTrnNc_Enabled = 0 ;
      edtAlbTrnNc_Visible = 1 ;
      divAlbtrnnc_cell_Class = "" ;
      edtAlbTrnNm_Jsonclick = "" ;
      edtAlbTrnNm_Enabled = 0 ;
      edtAlbTrnNm_Visible = 1 ;
      divAlbtrnnm_cell_Class = "" ;
      divUnnamedtable6_Visible = 1 ;
      edtAlbFmd_Enabled = 0 ;
      edtAlbGrossT_Jsonclick = "" ;
      edtAlbGrossT_Enabled = 0 ;
      edtAlbHhfm_Jsonclick = "" ;
      edtAlbHhfm_Enabled = 0 ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbProAT.setEnabled( 0 );
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbMat_Jsonclick = "" ;
      edtAlbMat_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 0 ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 0 ;
      edtAlbCliDes_Jsonclick = "" ;
      edtAlbCliDes_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Enabled = 0 ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Enabled = 0 ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      cmbAlbSec.setJsonclick( "" );
      cmbAlbSec.setEnabled( 0 );
      cmbAlbSec.setVisible( 1 );
      divAlbsec_cell_Class = "" ;
      cmbAlbProEst.setJsonclick( "" );
      cmbAlbProEst.setEnabled( 0 );
      cmbAlbProPri.setJsonclick( "" );
      cmbAlbProPri.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
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
      cmbAlbProPri.setName( "ALBPROPRI" );
      cmbAlbProPri.setWebtags( "" );
      cmbAlbProPri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbAlbProPri.addItem("0", httpContext.getMessage( "Guia Transporte Sem Encargos", ""), (short)(0));
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
      }
      cmbAlbProEst.setName( "ALBPROEST" );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Gerado", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Faturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
      }
      cmbAlbSec.setName( "ALBSEC" );
      cmbAlbSec.setWebtags( "" );
      cmbAlbSec.addItem("S", httpContext.getMessage( "SIM", ""), (short)(0));
      cmbAlbSec.addItem("N", httpContext.getMessage( "NAO", ""), (short)(0));
      if ( cmbAlbSec.getItemCount() > 0 )
      {
      }
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Nao enviado", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviado a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
      }
      cmbAlbProAT.setName( "ALBPROAT" );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e11JL1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e12JL1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV12AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBCLIDES","{handler:'valid_Albclides',iparms:[]");
      setEventMetadata("VALID_ALBCLIDES",",oparms:[]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[]}");
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
      pr_default.close(8);
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
      h1243GuiRemCli = "" ;
      h3869AlbCliDes = "" ;
      h840TrnCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11AlbProPri = "" ;
      AV12AlbSec = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      A39AlbProPri = "" ;
      A2242AlbSec = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7098AlbUsu = "" ;
      A3868AlbMat = "" ;
      lblTextblockalbenvftp_Jsonclick = "" ;
      lblTextblockalblic_Jsonclick = "" ;
      A7101AlbLic = "" ;
      lblTextblockalbproat_Jsonclick = "" ;
      A10765AlbProAT = "" ;
      lblTextblockalbhhfm_Jsonclick = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockalbgrosst_Jsonclick = "" ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      lblTextblockalbfmd_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      A10017AlbFmd = "" ;
      A10835AlbTrnNm = "" ;
      A10837AlbTrnNc = "" ;
      A10836AlbTrnDm = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A10018ALbFmdc = "" ;
      A5140AlbMarca = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      A3093AlbDivTCod = "" ;
      A3109AlbDivAbr = "" ;
      A1253EmprGuiRem = "" ;
      A3145GuiRemDivT = "" ;
      A407EmprNom = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
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
      H00JL2_A13735CliCNom = new String[] {""} ;
      H00JL3_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      H00JL4_A13738TrnCNom = new String[] {""} ;
      H00JL5_A13735CliCNom = new String[] {""} ;
      H00JL5_A396EmprCod = new String[] {""} ;
      H00JL5_A252CliCod = new int[1] ;
      H00JL6_A13735CliCNom = new String[] {""} ;
      H00JL6_A396EmprCod = new String[] {""} ;
      H00JL6_A252CliCod = new int[1] ;
      H00JL7_A13738TrnCNom = new String[] {""} ;
      H00JL7_A396EmprCod = new String[] {""} ;
      H00JL7_A840TrnCod = new short[1] ;
      AV19Pgmname = "" ;
      H00JL8_A252CliCod = new int[1] ;
      H00JL8_A266CliEnvLin = new byte[1] ;
      H00JL8_A396EmprCod = new String[] {""} ;
      H00JL8_A30AlbProCod = new long[1] ;
      H00JL8_A841TrnNom = new String[] {""} ;
      H00JL8_n841TrnNom = new boolean[] {false} ;
      H00JL8_A1244GuiRemCln = new String[] {""} ;
      H00JL8_A407EmprNom = new String[] {""} ;
      H00JL8_n407EmprNom = new boolean[] {false} ;
      H00JL8_A3110GuiRemDiv = new byte[1] ;
      H00JL8_n3110GuiRemDiv = new boolean[] {false} ;
      H00JL8_A3145GuiRemDivT = new String[] {""} ;
      H00JL8_n3145GuiRemDivT = new boolean[] {false} ;
      H00JL8_A1258GuiRemDom = new byte[1] ;
      H00JL8_n1258GuiRemDom = new boolean[] {false} ;
      H00JL8_A1253EmprGuiRem = new String[] {""} ;
      H00JL8_A3108AlbDivCod = new byte[1] ;
      H00JL8_n3108AlbDivCod = new boolean[] {false} ;
      H00JL8_A3109AlbDivAbr = new String[] {""} ;
      H00JL8_n3109AlbDivAbr = new boolean[] {false} ;
      H00JL8_A3093AlbDivTCod = new String[] {""} ;
      H00JL8_n3093AlbDivTCod = new boolean[] {false} ;
      H00JL8_A3643TrnNif = new String[] {""} ;
      H00JL8_n3643TrnNif = new boolean[] {false} ;
      H00JL8_A7099AlbOComp = new String[] {""} ;
      H00JL8_A7100AlbMarCo = new String[] {""} ;
      H00JL8_A7102AlbNumT = new long[1] ;
      H00JL8_A7988AlbObsCb = new String[] {""} ;
      H00JL8_A5803AlbTipCal = new byte[1] ;
      H00JL8_A7984AlbMotTr = new String[] {""} ;
      H00JL8_A7985AlbTipDoc = new int[1] ;
      H00JL8_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JL8_A7162AlbDesp = new int[1] ;
      H00JL8_A7987AlbColCa = new String[] {""} ;
      H00JL8_A5141AlbIvaCod = new String[] {""} ;
      H00JL8_A914AlbPObsCon = new byte[1] ;
      H00JL8_A3866AlbLocCar = new byte[1] ;
      H00JL8_A3867AlbLocDes = new byte[1] ;
      H00JL8_A5140AlbMarca = new String[] {""} ;
      H00JL8_A10018ALbFmdc = new String[] {""} ;
      H00JL8_A10836AlbTrnDm = new String[] {""} ;
      H00JL8_A10837AlbTrnNc = new String[] {""} ;
      H00JL8_A10835AlbTrnNm = new String[] {""} ;
      H00JL8_A10017AlbFmd = new String[] {""} ;
      H00JL8_n10017AlbFmd = new boolean[] {false} ;
      H00JL8_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JL8_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      H00JL8_A10765AlbProAT = new String[] {""} ;
      H00JL8_A7101AlbLic = new String[] {""} ;
      H00JL8_A5805AlbEnvFtp = new byte[1] ;
      H00JL8_A3868AlbMat = new String[] {""} ;
      H00JL8_A840TrnCod = new short[1] ;
      H00JL8_A1259AlbDomEnv = new byte[1] ;
      H00JL8_n1259AlbDomEnv = new boolean[] {false} ;
      H00JL8_A3869AlbCliDes = new int[1] ;
      H00JL8_A1243GuiRemCli = new int[1] ;
      H00JL8_A7098AlbUsu = new String[] {""} ;
      H00JL8_A3865AlbHorSal = new String[] {""} ;
      H00JL8_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00JL8_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JL8_A2242AlbSec = new String[] {""} ;
      H00JL8_A33AlbProEst = new byte[1] ;
      H00JL8_A39AlbProPri = new String[] {""} ;
      H00JL8_A1260BusDomEnv = new byte[1] ;
      H00JL8_n1260BusDomEnv = new boolean[] {false} ;
      H00JL9_A13738TrnCNom = new String[] {""} ;
      H00JL9_A396EmprCod = new String[] {""} ;
      H00JL9_A840TrnCod = new short[1] ;
      H00JL10_A841TrnNom = new String[] {""} ;
      H00JL10_n841TrnNom = new boolean[] {false} ;
      H00JL10_A3643TrnNif = new String[] {""} ;
      H00JL10_n3643TrnNif = new boolean[] {false} ;
      H00JL11_A407EmprNom = new String[] {""} ;
      H00JL11_n407EmprNom = new boolean[] {false} ;
      H00JL12_A13735CliCNom = new String[] {""} ;
      H00JL12_A396EmprCod = new String[] {""} ;
      H00JL12_A252CliCod = new int[1] ;
      H00JL13_A13735CliCNom = new String[] {""} ;
      H00JL13_A396EmprCod = new String[] {""} ;
      H00JL13_A252CliCod = new int[1] ;
      H00JL14_A13738TrnCNom = new String[] {""} ;
      H00JL14_A396EmprCod = new String[] {""} ;
      H00JL14_A840TrnCod = new short[1] ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      AV16Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
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
      sCtrlA30AlbProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06general__default(),
         new Object[] {
             new Object[] {
            H00JL2_A13735CliCNom
            }
            , new Object[] {
            H00JL3_A13735CliCNom
            }
            , new Object[] {
            H00JL4_A13738TrnCNom
            }
            , new Object[] {
            H00JL5_A13735CliCNom, H00JL5_A396EmprCod, H00JL5_A252CliCod
            }
            , new Object[] {
            H00JL6_A13735CliCNom, H00JL6_A396EmprCod, H00JL6_A252CliCod
            }
            , new Object[] {
            H00JL7_A13738TrnCNom, H00JL7_A396EmprCod, H00JL7_A840TrnCod
            }
            , new Object[] {
            H00JL8_A252CliCod, H00JL8_A266CliEnvLin, H00JL8_A396EmprCod, H00JL8_A30AlbProCod, H00JL8_A841TrnNom, H00JL8_n841TrnNom, H00JL8_A1244GuiRemCln, H00JL8_A407EmprNom, H00JL8_n407EmprNom, H00JL8_A3110GuiRemDiv,
            H00JL8_n3110GuiRemDiv, H00JL8_A3145GuiRemDivT, H00JL8_n3145GuiRemDivT, H00JL8_A1258GuiRemDom, H00JL8_n1258GuiRemDom, H00JL8_A1253EmprGuiRem, H00JL8_A3108AlbDivCod, H00JL8_n3108AlbDivCod, H00JL8_A3109AlbDivAbr, H00JL8_n3109AlbDivAbr,
            H00JL8_A3093AlbDivTCod, H00JL8_n3093AlbDivTCod, H00JL8_A3643TrnNif, H00JL8_n3643TrnNif, H00JL8_A7099AlbOComp, H00JL8_A7100AlbMarCo, H00JL8_A7102AlbNumT, H00JL8_A7988AlbObsCb, H00JL8_A5803AlbTipCal, H00JL8_A7984AlbMotTr,
            H00JL8_A7985AlbTipDoc, H00JL8_A7986AlbCambio, H00JL8_A7162AlbDesp, H00JL8_A7987AlbColCa, H00JL8_A5141AlbIvaCod, H00JL8_A914AlbPObsCon, H00JL8_A3866AlbLocCar, H00JL8_A3867AlbLocDes, H00JL8_A5140AlbMarca, H00JL8_A10018ALbFmdc,
            H00JL8_A10836AlbTrnDm, H00JL8_A10837AlbTrnNc, H00JL8_A10835AlbTrnNm, H00JL8_A10017AlbFmd, H00JL8_n10017AlbFmd, H00JL8_A10020AlbGrossT, H00JL8_A10019AlbHhfm, H00JL8_A10765AlbProAT, H00JL8_A7101AlbLic, H00JL8_A5805AlbEnvFtp,
            H00JL8_A3868AlbMat, H00JL8_A840TrnCod, H00JL8_A1259AlbDomEnv, H00JL8_n1259AlbDomEnv, H00JL8_A3869AlbCliDes, H00JL8_A1243GuiRemCli, H00JL8_A7098AlbUsu, H00JL8_A3865AlbHorSal, H00JL8_A4023AlbFecSal, H00JL8_A34AlbProfch,
            H00JL8_A2242AlbSec, H00JL8_A33AlbProEst, H00JL8_A39AlbProPri, H00JL8_A1260BusDomEnv, H00JL8_n1260BusDomEnv
            }
            , new Object[] {
            H00JL9_A13738TrnCNom, H00JL9_A396EmprCod, H00JL9_A840TrnCod
            }
            , new Object[] {
            H00JL10_A841TrnNom, H00JL10_n841TrnNom, H00JL10_A3643TrnNif, H00JL10_n3643TrnNif
            }
            , new Object[] {
            H00JL11_A407EmprNom, H00JL11_n407EmprNom
            }
            , new Object[] {
            H00JL12_A13735CliCNom, H00JL12_A396EmprCod, H00JL12_A252CliCod
            }
            , new Object[] {
            H00JL13_A13735CliCNom, H00JL13_A396EmprCod, H00JL13_A252CliCod
            }
            , new Object[] {
            H00JL14_A13738TrnCNom, H00JL14_A396EmprCod, H00JL14_A840TrnCod
            }
         }
      );
      AV19Pgmname = "TTrn06General" ;
      /* GeneXus formulas. */
      AV19Pgmname = "TTrn06General" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A33AlbProEst ;
   private byte A1259AlbDomEnv ;
   private byte A5805AlbEnvFtp ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A3108AlbDivCod ;
   private byte A1260BusDomEnv ;
   private byte A1258GuiRemDom ;
   private byte A3110GuiRemDiv ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short A840TrnCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbFecSal_Enabled ;
   private int edtAlbHorSal_Enabled ;
   private int edtAlbUsu_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtAlbCliDes_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbMat_Enabled ;
   private int edtAlbLic_Enabled ;
   private int edtAlbHhfm_Enabled ;
   private int edtAlbGrossT_Enabled ;
   private int edtAlbFmd_Enabled ;
   private int divUnnamedtable6_Visible ;
   private int edtAlbTrnNm_Visible ;
   private int edtAlbTrnNm_Enabled ;
   private int edtAlbTrnNc_Visible ;
   private int edtAlbTrnNc_Enabled ;
   private int edtAlbTrnDm_Visible ;
   private int edtAlbTrnDm_Enabled ;
   private int edtALbFmdc_Visible ;
   private int edtAlbMarca_Visible ;
   private int edtAlbLocDes_Visible ;
   private int edtAlbLocCar_Visible ;
   private int edtAlbPObsCon_Visible ;
   private int edtAlbIvaCod_Visible ;
   private int edtAlbColCa_Visible ;
   private int A7162AlbDesp ;
   private int edtAlbDesp_Visible ;
   private int edtAlbCambio_Visible ;
   private int A7985AlbTipDoc ;
   private int edtAlbTipDoc_Visible ;
   private int edtAlbMotTr_Visible ;
   private int edtAlbTipCal_Visible ;
   private int edtAlbObsCb_Visible ;
   private int edtAlbNumT_Visible ;
   private int edtAlbMarCo_Visible ;
   private int edtAlbOComp_Visible ;
   private int edtTrnNif_Visible ;
   private int edtAlbDivTCod_Visible ;
   private int edtAlbDivAbr_Visible ;
   private int edtAlbDivCod_Visible ;
   private int edtBusDomEnv_Visible ;
   private int edtEmprGuiRem_Visible ;
   private int edtGuiRemDom_Visible ;
   private int edtGuiRemDivT_Visible ;
   private int edtGuiRemDiv_Visible ;
   private int edtEmprNom_Visible ;
   private int edtEmprCod_Visible ;
   private int edtGuiRemCln_Visible ;
   private int edtTrnNom_Visible ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int idxLst ;
   private long wcpOA30AlbProCod ;
   private long A30AlbProCod ;
   private long A7102AlbNumT ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
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
   private String AV11AlbProPri ;
   private String AV12AlbSec ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String A39AlbProPri ;
   private String divAlbsec_cell_Internalname ;
   private String divAlbsec_cell_Class ;
   private String A2242AlbSec ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Internalname ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbUsu_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbMat_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divUnnamedtablealbenvftp_Internalname ;
   private String lblTextblockalbenvftp_Internalname ;
   private String lblTextblockalbenvftp_Jsonclick ;
   private String divUnnamedtablealblic_Internalname ;
   private String lblTextblockalblic_Internalname ;
   private String lblTextblockalblic_Jsonclick ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String divUnnamedtablealbproat_Internalname ;
   private String lblTextblockalbproat_Internalname ;
   private String lblTextblockalbproat_Jsonclick ;
   private String A10765AlbProAT ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtablealbhhfm_Internalname ;
   private String lblTextblockalbhhfm_Internalname ;
   private String lblTextblockalbhhfm_Jsonclick ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbHhfm_Jsonclick ;
   private String divUnnamedtablealbgrosst_Internalname ;
   private String lblTextblockalbgrosst_Internalname ;
   private String lblTextblockalbgrosst_Jsonclick ;
   private String edtAlbGrossT_Internalname ;
   private String edtAlbGrossT_Jsonclick ;
   private String divUnnamedtablealbfmd_Internalname ;
   private String lblTextblockalbfmd_Internalname ;
   private String lblTextblockalbfmd_Jsonclick ;
   private String edtAlbFmd_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable6_Internalname ;
   private String divAlbtrnnm_cell_Internalname ;
   private String divAlbtrnnm_cell_Class ;
   private String edtAlbTrnNm_Internalname ;
   private String A10835AlbTrnNm ;
   private String edtAlbTrnNm_Jsonclick ;
   private String divAlbtrnnc_cell_Internalname ;
   private String divAlbtrnnc_cell_Class ;
   private String edtAlbTrnNc_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Jsonclick ;
   private String divAlbtrndm_cell_Internalname ;
   private String divAlbtrndm_cell_Class ;
   private String edtAlbTrnDm_Internalname ;
   private String A10836AlbTrnDm ;
   private String edtAlbTrnDm_Jsonclick ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtALbFmdc_Internalname ;
   private String A10018ALbFmdc ;
   private String edtAlbMarca_Internalname ;
   private String A5140AlbMarca ;
   private String edtAlbMarca_Jsonclick ;
   private String edtAlbLocDes_Internalname ;
   private String edtAlbLocDes_Jsonclick ;
   private String edtAlbLocCar_Internalname ;
   private String edtAlbLocCar_Jsonclick ;
   private String edtAlbPObsCon_Internalname ;
   private String edtAlbPObsCon_Jsonclick ;
   private String edtAlbIvaCod_Internalname ;
   private String A5141AlbIvaCod ;
   private String edtAlbIvaCod_Jsonclick ;
   private String edtAlbColCa_Internalname ;
   private String A7987AlbColCa ;
   private String edtAlbColCa_Jsonclick ;
   private String edtAlbDesp_Internalname ;
   private String edtAlbDesp_Jsonclick ;
   private String edtAlbCambio_Internalname ;
   private String edtAlbCambio_Jsonclick ;
   private String edtAlbTipDoc_Internalname ;
   private String edtAlbTipDoc_Jsonclick ;
   private String edtAlbMotTr_Internalname ;
   private String A7984AlbMotTr ;
   private String edtAlbMotTr_Jsonclick ;
   private String edtAlbTipCal_Internalname ;
   private String edtAlbTipCal_Jsonclick ;
   private String edtAlbObsCb_Internalname ;
   private String A7988AlbObsCb ;
   private String edtAlbObsCb_Jsonclick ;
   private String edtAlbNumT_Internalname ;
   private String edtAlbNumT_Jsonclick ;
   private String edtAlbMarCo_Internalname ;
   private String A7100AlbMarCo ;
   private String edtAlbMarCo_Jsonclick ;
   private String edtAlbOComp_Internalname ;
   private String A7099AlbOComp ;
   private String edtAlbOComp_Jsonclick ;
   private String edtTrnNif_Internalname ;
   private String A3643TrnNif ;
   private String edtTrnNif_Jsonclick ;
   private String edtAlbDivTCod_Internalname ;
   private String A3093AlbDivTCod ;
   private String edtAlbDivTCod_Jsonclick ;
   private String edtAlbDivAbr_Internalname ;
   private String A3109AlbDivAbr ;
   private String edtAlbDivAbr_Jsonclick ;
   private String edtAlbDivCod_Internalname ;
   private String edtAlbDivCod_Jsonclick ;
   private String edtBusDomEnv_Internalname ;
   private String edtBusDomEnv_Jsonclick ;
   private String edtEmprGuiRem_Internalname ;
   private String A1253EmprGuiRem ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtGuiRemDom_Internalname ;
   private String edtGuiRemDom_Jsonclick ;
   private String edtGuiRemDivT_Internalname ;
   private String A3145GuiRemDivT ;
   private String edtGuiRemDivT_Jsonclick ;
   private String edtGuiRemDiv_Internalname ;
   private String edtGuiRemDiv_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV19Pgmname ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String AV16Emprcod ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA30AlbProCod ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n841TrnNom ;
   private boolean n3110GuiRemDiv ;
   private boolean n3145GuiRemDivT ;
   private boolean n1258GuiRemDom ;
   private boolean n3108AlbDivCod ;
   private boolean n3109AlbDivAbr ;
   private boolean n3093AlbDivTCod ;
   private boolean n3643TrnNif ;
   private boolean n10017AlbFmd ;
   private boolean n1259AlbDomEnv ;
   private boolean n1260BusDomEnv ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h1243GuiRemCli ;
   private String h3869AlbCliDes ;
   private String h840TrnCod ;
   private String A10017AlbFmd ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbAlbProPri ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbSec ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] H00JL2_A13735CliCNom ;
   private String[] H00JL3_A13735CliCNom ;
   private String[] H00JL4_A13738TrnCNom ;
   private String[] H00JL5_A13735CliCNom ;
   private String[] H00JL5_A396EmprCod ;
   private int[] H00JL5_A252CliCod ;
   private String[] H00JL6_A13735CliCNom ;
   private String[] H00JL6_A396EmprCod ;
   private int[] H00JL6_A252CliCod ;
   private String[] H00JL7_A13738TrnCNom ;
   private String[] H00JL7_A396EmprCod ;
   private short[] H00JL7_A840TrnCod ;
   private int[] H00JL8_A252CliCod ;
   private byte[] H00JL8_A266CliEnvLin ;
   private String[] H00JL8_A396EmprCod ;
   private long[] H00JL8_A30AlbProCod ;
   private String[] H00JL8_A841TrnNom ;
   private boolean[] H00JL8_n841TrnNom ;
   private String[] H00JL8_A1244GuiRemCln ;
   private String[] H00JL8_A407EmprNom ;
   private boolean[] H00JL8_n407EmprNom ;
   private byte[] H00JL8_A3110GuiRemDiv ;
   private boolean[] H00JL8_n3110GuiRemDiv ;
   private String[] H00JL8_A3145GuiRemDivT ;
   private boolean[] H00JL8_n3145GuiRemDivT ;
   private byte[] H00JL8_A1258GuiRemDom ;
   private boolean[] H00JL8_n1258GuiRemDom ;
   private String[] H00JL8_A1253EmprGuiRem ;
   private byte[] H00JL8_A3108AlbDivCod ;
   private boolean[] H00JL8_n3108AlbDivCod ;
   private String[] H00JL8_A3109AlbDivAbr ;
   private boolean[] H00JL8_n3109AlbDivAbr ;
   private String[] H00JL8_A3093AlbDivTCod ;
   private boolean[] H00JL8_n3093AlbDivTCod ;
   private String[] H00JL8_A3643TrnNif ;
   private boolean[] H00JL8_n3643TrnNif ;
   private String[] H00JL8_A7099AlbOComp ;
   private String[] H00JL8_A7100AlbMarCo ;
   private long[] H00JL8_A7102AlbNumT ;
   private String[] H00JL8_A7988AlbObsCb ;
   private byte[] H00JL8_A5803AlbTipCal ;
   private String[] H00JL8_A7984AlbMotTr ;
   private int[] H00JL8_A7985AlbTipDoc ;
   private java.math.BigDecimal[] H00JL8_A7986AlbCambio ;
   private int[] H00JL8_A7162AlbDesp ;
   private String[] H00JL8_A7987AlbColCa ;
   private String[] H00JL8_A5141AlbIvaCod ;
   private byte[] H00JL8_A914AlbPObsCon ;
   private byte[] H00JL8_A3866AlbLocCar ;
   private byte[] H00JL8_A3867AlbLocDes ;
   private String[] H00JL8_A5140AlbMarca ;
   private String[] H00JL8_A10018ALbFmdc ;
   private String[] H00JL8_A10836AlbTrnDm ;
   private String[] H00JL8_A10837AlbTrnNc ;
   private String[] H00JL8_A10835AlbTrnNm ;
   private String[] H00JL8_A10017AlbFmd ;
   private boolean[] H00JL8_n10017AlbFmd ;
   private java.math.BigDecimal[] H00JL8_A10020AlbGrossT ;
   private java.util.Date[] H00JL8_A10019AlbHhfm ;
   private String[] H00JL8_A10765AlbProAT ;
   private String[] H00JL8_A7101AlbLic ;
   private byte[] H00JL8_A5805AlbEnvFtp ;
   private String[] H00JL8_A3868AlbMat ;
   private short[] H00JL8_A840TrnCod ;
   private byte[] H00JL8_A1259AlbDomEnv ;
   private boolean[] H00JL8_n1259AlbDomEnv ;
   private int[] H00JL8_A3869AlbCliDes ;
   private int[] H00JL8_A1243GuiRemCli ;
   private String[] H00JL8_A7098AlbUsu ;
   private String[] H00JL8_A3865AlbHorSal ;
   private java.util.Date[] H00JL8_A4023AlbFecSal ;
   private java.util.Date[] H00JL8_A34AlbProfch ;
   private String[] H00JL8_A2242AlbSec ;
   private byte[] H00JL8_A33AlbProEst ;
   private String[] H00JL8_A39AlbProPri ;
   private byte[] H00JL8_A1260BusDomEnv ;
   private boolean[] H00JL8_n1260BusDomEnv ;
   private String[] H00JL9_A13738TrnCNom ;
   private String[] H00JL9_A396EmprCod ;
   private short[] H00JL9_A840TrnCod ;
   private String[] H00JL10_A841TrnNom ;
   private boolean[] H00JL10_n841TrnNom ;
   private String[] H00JL10_A3643TrnNif ;
   private boolean[] H00JL10_n3643TrnNif ;
   private String[] H00JL11_A407EmprNom ;
   private boolean[] H00JL11_n407EmprNom ;
   private String[] H00JL12_A13735CliCNom ;
   private String[] H00JL12_A396EmprCod ;
   private int[] H00JL12_A252CliCod ;
   private String[] H00JL13_A13735CliCNom ;
   private String[] H00JL13_A396EmprCod ;
   private int[] H00JL13_A252CliCod ;
   private String[] H00JL14_A13738TrnCNom ;
   private String[] H00JL14_A396EmprCod ;
   private short[] H00JL14_A840TrnCod ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class ttrn06general__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00JL2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?) ORDER BY CliCNom) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JL8", "SELECT T4.CliCod, T4.CliEnvLin, T1.EmprCod, T1.AlbProCod, T6.TrnNom, T3.CliNom AS GuiRemCln, T5.EmprNom, T3.CliDivCod AS GuiRemDiv, T3.CliDivTra AS GuiRemDivT, T1.GuiRemDom, T1.EmprGuiRem AS EmprGuiRem, T1.AlbDivCod AS AlbDivCod, T2.DivAbr AS AlbDivAbr, T1.AlbDivTCod, T6.TrnNif, T1.AlbOComp, T1.AlbMarCo, T1.AlbNumT, T1.AlbObsCb, T1.AlbTipCal, T1.AlbMotTr, T1.AlbTipDoc, T1.AlbCambio, T1.AlbDesp, T1.AlbColCa, T1.AlbIvaCod, T1.AlbPObsCon, T1.AlbLocCar, T1.AlbLocDes, T1.AlbMarca, T1.ALbFmdc, T1.AlbTrnDm, T1.AlbTrnNc, T1.AlbTrnNm, T1.AlbFmd, T1.AlbGrossT, T1.AlbHhfm, T1.AlbProAT, T1.AlbLic, T1.AlbEnvFtp, T1.AlbMat, T1.TrnCod, T1.AlbDomEnv, T1.AlbCliDes, T1.GuiRemCli AS GuiRemCli, T1.AlbUsu, T1.AlbHorSal, T1.AlbFecSal, T1.AlbProfch, T1.AlbSec, T1.AlbProEst, T1.AlbProPri, COALESCE( T4.CliEnvLin, 0) AS BusDomEnv FROM (((((TXPCALPRD T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.AlbDivCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprGuiRem AND T3.CliCod = T1.GuiRemCli) LEFT JOIN TXPCLIENV T4 ON T4.EmprCod = T1.EmprGuiRem AND T4.CliCod = T1.GuiRemCli AND T4.CliEnvLin = T1.AlbDomEnv) INNER JOIN TXPEMPRES T5 ON T5.EmprCod = T1.EmprCod) INNER JOIN TXPTRANSP T6 ON T6.EmprCod = T1.EmprCod AND T6.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL10", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00JL14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 30);
               ((String[]) buf[25])[0] = rslt.getString(17, 30);
               ((long[]) buf[26])[0] = rslt.getLong(18);
               ((String[]) buf[27])[0] = rslt.getString(19, 60);
               ((byte[]) buf[28])[0] = rslt.getByte(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 25);
               ((int[]) buf[30])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(23,4);
               ((int[]) buf[32])[0] = rslt.getInt(24);
               ((String[]) buf[33])[0] = rslt.getString(25, 20);
               ((String[]) buf[34])[0] = rslt.getString(26, 3);
               ((byte[]) buf[35])[0] = rslt.getByte(27);
               ((byte[]) buf[36])[0] = rslt.getByte(28);
               ((byte[]) buf[37])[0] = rslt.getByte(29);
               ((String[]) buf[38])[0] = rslt.getString(30, 1);
               ((String[]) buf[39])[0] = rslt.getString(31, 255);
               ((String[]) buf[40])[0] = rslt.getString(32, 60);
               ((String[]) buf[41])[0] = rslt.getString(33, 20);
               ((String[]) buf[42])[0] = rslt.getString(34, 60);
               ((String[]) buf[43])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(36,2);
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDateTime(37);
               ((String[]) buf[47])[0] = rslt.getString(38, 1);
               ((String[]) buf[48])[0] = rslt.getString(39, 20);
               ((byte[]) buf[49])[0] = rslt.getByte(40);
               ((String[]) buf[50])[0] = rslt.getString(41, 20);
               ((short[]) buf[51])[0] = rslt.getShort(42);
               ((byte[]) buf[52])[0] = rslt.getByte(43);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(44);
               ((int[]) buf[55])[0] = rslt.getInt(45);
               ((String[]) buf[56])[0] = rslt.getString(46, 8);
               ((String[]) buf[57])[0] = rslt.getString(47, 8);
               ((java.util.Date[]) buf[58])[0] = rslt.getGXDate(48);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(49);
               ((String[]) buf[60])[0] = rslt.getString(50, 1);
               ((byte[]) buf[61])[0] = rslt.getByte(51);
               ((String[]) buf[62])[0] = rslt.getString(52, 1);
               ((byte[]) buf[63])[0] = rslt.getByte(53);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

