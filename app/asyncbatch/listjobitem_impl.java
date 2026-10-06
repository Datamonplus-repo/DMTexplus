package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listjobitem_impl extends GXWebComponent
{
   public listjobitem_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listjobitem_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listjobitem_impl.class ));
   }

   public listjobitem_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "JobId") ;
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
               AV7JobId = GXutil.strToGuid(httpContext.GetPar( "JobId")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7JobId", AV7JobId.toString());
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7JobId});
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
               gxfirstwebparm = httpContext.GetFirstPar( "JobId") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "JobId") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
               return  ;
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_9 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_9"))) ;
      nGXsfl_9_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_9_idx"))) ;
      sGXsfl_9_idx = httpContext.GetPar( "sGXsfl_9_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtItmErr_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtItmErr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmErr_Visible), 5, 0), !bGXsfl_9_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV7JobId = GXutil.strToGuid(httpContext.GetPar( "JobId")) ;
      AV47Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtItmErr_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtItmErr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmErr_Visible), 5, 0), !bGXsfl_9_Refreshing);
      AV44FacEnvMail = localUtil.parseDTimeParm( httpContext.GetPar( "FacEnvMail")) ;
      A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
      AV39FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
      A436FacFch = localUtil.parseDateParm( httpContext.GetPar( "FacFch")) ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A10050Cliemf = httpContext.GetPar( "Cliemf") ;
      A14420FacEnvMail = localUtil.parseDTimeParm( httpContext.GetPar( "FacEnvMail")) ;
      AV33EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2C02( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " JOBITEM", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.asyncbatch.listjobitem", new String[] {GXutil.URLEncode(AV7JobId.toString())}, new String[] {"JobId"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListJobItem");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("asyncbatch\\listjobitem:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_9", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_9, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7JobId", wcpOAV7JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACCOD", GXutil.ltrim( localUtil.ntoc( AV39FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACFCH", localUtil.dtoc( A436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLIEMF", GXutil.rtrim( A10050Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACENVMAIL", localUtil.ttoc( A14420FacEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vJOBID", AV7JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCH", localUtil.dtoc( AV40FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV41CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLINOM", GXutil.rtrim( AV42CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIEMF", GXutil.rtrim( AV43Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ITMERR_Visible", GXutil.ltrim( localUtil.ntoc( edtItmErr_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
   }

   public void renderHtmlCloseForm2C02( )
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
      return "AsyncBatch.ListJobItem" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " JOBITEM", "") ;
   }

   public void wb2C00( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.asyncbatch.listjobitem");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol9( ) ;
      }
      if ( wbEnd == 9 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_9 = (int)(nGXsfl_9_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV47Pgmname), GXutil.rtrim( localUtil.format( AV47Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\ListJobItem.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 9 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2C02( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " JOBITEM", ""), (short)(0)) ;
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
            strup2C00( ) ;
         }
      }
   }

   public void ws2C02( )
   {
      start2C02( ) ;
      evt2C02( ) ;
   }

   public void evt2C02( )
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
                              strup2C00( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2C00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112C02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2C00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavEmail_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2C00( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VIMPRIMIR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "VEMAIL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "VEMAIL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VIMPRIMIR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2C00( ) ;
                           }
                           nGXsfl_9_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_92( ) ;
                           AV36Email = httpContext.cgiGet( edtavEmail_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmail_Internalname, AV36Email);
                           AV37Imprimir = httpContext.cgiGet( edtavImprimir_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavImprimir_Internalname, AV37Imprimir);
                           AV38Download = httpContext.cgiGet( edtavDownload_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDownload_Internalname, AV38Download);
                           A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
                           A14468ItmId = localUtil.ctol( httpContext.cgiGet( edtItmId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
                           n14424JobType = false ;
                           A14470DocId = localUtil.ctol( httpContext.cgiGet( edtDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14470DocId = false ;
                           A14471DocLbl = httpContext.cgiGet( edtDocLbl_Internalname) ;
                           n14471DocLbl = false ;
                           A14473RetryQt = (short)(localUtil.ctol( httpContext.cgiGet( edtRetryQt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14473RetryQt = false ;
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavFacenvmail_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFACENVMAIL");
                              GX_FocusControl = edtavFacenvmail_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFacenvmail_Internalname, localUtil.ttoc( AV44FacEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV44FacEnvMail = localUtil.ctot( httpContext.cgiGet( edtavFacenvmail_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFacenvmail_Internalname, localUtil.ttoc( AV44FacEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           A14481ItmDtStart = localUtil.ctot( httpContext.cgiGet( edtItmDtStart_Internalname), 0) ;
                           n14481ItmDtStart = false ;
                           A14482ItmDtEnd = localUtil.ctot( httpContext.cgiGet( edtItmDtEnd_Internalname), 0) ;
                           n14482ItmDtEnd = false ;
                           A14474OutFile = httpContext.cgiGet( edtOutFile_Internalname) ;
                           n14474OutFile = false ;
                           A14475OutUrl = httpContext.cgiGet( edtOutUrl_Internalname) ;
                           n14475OutUrl = false ;
                           A14476FileNm = httpContext.cgiGet( edtFileNm_Internalname) ;
                           n14476FileNm = false ;
                           A14472ItmSts = httpContext.cgiGet( edtItmSts_Internalname) ;
                           n14472ItmSts = false ;
                           A14486ItmErr = httpContext.cgiGet( edtItmErr_Internalname) ;
                           n14486ItmErr = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e122C02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e132C02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e142C02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VIMPRIMIR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e152C02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VEMAIL.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e162C02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
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
                                    strup2C00( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmail_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2C02( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2C02( ) ;
         }
      }
   }

   public void pa2C02( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_92( ) ;
      while ( nGXsfl_9_idx <= nRC_GXsfl_9 )
      {
         sendrow_92( ) ;
         nGXsfl_9_idx = ((subGrid_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_9_idx+1) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_92( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.UUID AV7JobId ,
                                 String AV47Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 java.util.Date AV44FacEnvMail ,
                                 int A430FacCod ,
                                 int AV39FacCod ,
                                 java.util.Date A436FacFch ,
                                 int A252CliCod ,
                                 String A279CliNom ,
                                 String A10050Cliemf ,
                                 java.util.Date A14420FacEnvMail ,
                                 String AV33EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e132C02 ();
      GRID_nCurrentRecord = 0 ;
      rf2C02( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListJobItem");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("asyncbatch\\listjobitem:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_JOBID", getSecureSignedToken( sPrefix, A14423JobId));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"JOBID", A14423JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OUTFILE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14474OutFile, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OUTFILE", A14474OutFile);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A14470DocId), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DOCID", GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), ".", "")));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_9_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2C02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV47Pgmname = "AsyncBatch.ListJobItem" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmail_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavImprimir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImprimir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImprimir_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavDownload_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDownload_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDownload_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavFacenvmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacenvmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacenvmail_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2C02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(9) ;
      /* Execute user event: Refresh */
      e132C02 ();
      nGXsfl_9_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_92( ) ;
      bGXsfl_9_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_92( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV7JobId ,
                                              A14423JobId } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.UUID, TypeConstants.UUID
                                              }
         });
         /* Using cursor H02C02 */
         pr_default.execute(0, new Object[] {AV7JobId, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_9_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_92( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14475OutUrl = H02C02_A14475OutUrl[0] ;
            n14475OutUrl = H02C02_n14475OutUrl[0] ;
            A14486ItmErr = H02C02_A14486ItmErr[0] ;
            n14486ItmErr = H02C02_n14486ItmErr[0] ;
            A14472ItmSts = H02C02_A14472ItmSts[0] ;
            n14472ItmSts = H02C02_n14472ItmSts[0] ;
            A14476FileNm = H02C02_A14476FileNm[0] ;
            n14476FileNm = H02C02_n14476FileNm[0] ;
            A14474OutFile = H02C02_A14474OutFile[0] ;
            n14474OutFile = H02C02_n14474OutFile[0] ;
            A14482ItmDtEnd = H02C02_A14482ItmDtEnd[0] ;
            n14482ItmDtEnd = H02C02_n14482ItmDtEnd[0] ;
            A14481ItmDtStart = H02C02_A14481ItmDtStart[0] ;
            n14481ItmDtStart = H02C02_n14481ItmDtStart[0] ;
            A14473RetryQt = H02C02_A14473RetryQt[0] ;
            n14473RetryQt = H02C02_n14473RetryQt[0] ;
            A14471DocLbl = H02C02_A14471DocLbl[0] ;
            n14471DocLbl = H02C02_n14471DocLbl[0] ;
            A14470DocId = H02C02_A14470DocId[0] ;
            n14470DocId = H02C02_n14470DocId[0] ;
            A14424JobType = H02C02_A14424JobType[0] ;
            n14424JobType = H02C02_n14424JobType[0] ;
            A14468ItmId = H02C02_A14468ItmId[0] ;
            A14423JobId = H02C02_A14423JobId[0] ;
            A14424JobType = H02C02_A14424JobType[0] ;
            n14424JobType = H02C02_n14424JobType[0] ;
            e142C02 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(9) ;
         wb2C00( ) ;
      }
      bGXsfl_9_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2C02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_JOBID"+"_"+sGXsfl_9_idx, getSecureSignedToken( sPrefix+sGXsfl_9_idx, A14423JobId));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_OUTFILE"+"_"+sGXsfl_9_idx, getSecureSignedToken( sPrefix+sGXsfl_9_idx, GXutil.rtrim( localUtil.format( A14474OutFile, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DOCID"+"_"+sGXsfl_9_idx, getSecureSignedToken( sPrefix+sGXsfl_9_idx, localUtil.format( DecimalUtil.doubleToDec(A14470DocId), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV7JobId ,
                                           A14423JobId } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.UUID, TypeConstants.UUID
                                           }
      });
      /* Using cursor H02C03 */
      pr_default.execute(1, new Object[] {AV7JobId});
      GRID_nRecordCount = H02C03_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7JobId, AV47Pgmname, AV13OrderedBy, AV14OrderedDsc, AV44FacEnvMail, A430FacCod, AV39FacCod, A436FacFch, A252CliCod, A279CliNom, A10050Cliemf, A14420FacEnvMail, AV33EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV47Pgmname = "AsyncBatch.ListJobItem" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmail_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavImprimir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImprimir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImprimir_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavDownload_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDownload_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDownload_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavFacenvmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacenvmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacenvmail_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2C00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e122C02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_9 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_9"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7JobId = GXutil.strToGuid(httpContext.cgiGet( sPrefix+"wcpOAV7JobId")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         /* Read variables values. */
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Pgmname", AV47Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListJobItem");
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Pgmname", AV47Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("asyncbatch\\listjobitem:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e122C02 ();
      if (returnInSub) return;
   }

   public void e122C02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listjobitem_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV33EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      listjobitem_impl.this.AV33EmprCod = GXv_char2[0] ;
      listjobitem_impl.this.AV34EmprNom = GXv_char3[0] ;
      listjobitem_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33EmprCod", AV33EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV28DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV28DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e132C02( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      edtDocId_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDocId_Internalname, "Columnheaderclass", edtDocId_Columnheaderclass, !bGXsfl_9_Refreshing);
      edtavFacenvmail_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacenvmail_Internalname, "Columnheaderclass", edtavFacenvmail_Columnheaderclass, !bGXsfl_9_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e112C02( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e142C02( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV39FacCod = (int)(A14470DocId) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39FacCod), 8, 0));
      /* Execute user subroutine: 'BUSCARDADOSFACTURA' */
      S162 ();
      if (returnInSub) return;
      AV36Email = "<i class=\"fas fa-envelope-open-text\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmail_Internalname, AV36Email);
      if ( GXutil.strcmp(A14472ItmSts, "OK") == 0 )
      {
         edtavEmail_Class = "Attribute" ;
      }
      else
      {
         edtavEmail_Class = "Invisible" ;
      }
      AV37Imprimir = "<i class=\"fas fa-print\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavImprimir_Internalname, AV37Imprimir);
      if ( GXutil.strcmp(A14472ItmSts, "OK") == 0 )
      {
         edtavImprimir_Class = "Attribute" ;
      }
      else
      {
         edtavImprimir_Class = "Invisible" ;
      }
      AV38Download = "<i class=\"fas fa-download\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDownload_Internalname, AV38Download);
      if ( GXutil.strcmp(A14472ItmSts, "OK") == 0 )
      {
         edtavDownload_Link = formatLink("app.adownloadbinary", new String[] {GXutil.URLEncode(GXutil.rtrim(A14474OutFile)),GXutil.URLEncode(GXutil.rtrim(A14475OutUrl)),GXutil.URLEncode(GXutil.rtrim(A14476FileNm))}, new String[] {"RealPath","UrlPath","FileName"})  ;
         edtavDownload_Class = "Attribute" ;
      }
      else
      {
         edtavDownload_Link = "" ;
         edtavDownload_Class = "Invisible" ;
      }
      if ( GXutil.strcmp(A14472ItmSts, httpContext.getMessage( "WAIT", "")) == 0 )
      {
         edtDocId_Columnclass = "WWColumn WWColumnItalic WWColumnItalicSingleCell" ;
      }
      else if ( GXutil.strcmp(A14472ItmSts, httpContext.getMessage( "RUN", "")) == 0 )
      {
         edtDocId_Columnclass = "WWColumn WWColumnItalic WWColumnItalicSingleCell" ;
      }
      else if ( GXutil.strcmp(A14472ItmSts, httpContext.getMessage( "OK", "")) == 0 )
      {
         edtDocId_Columnclass = "WWColumn WWColumnItalic WWColumnItalicSingleCell" ;
      }
      else if ( GXutil.strcmp(A14472ItmSts, httpContext.getMessage( "ERR", "")) == 0 )
      {
         edtDocId_Columnclass = "WWColumn WWColumnItalic WWColumnItalicSingleCell" ;
      }
      else
      {
         edtDocId_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      if ( ( A14468ItmId != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV44FacEnvMail) )
      {
         edtavFacenvmail_Columnclass = "WWColumn WWColumnWarning WWColumnWarningSingleCell" ;
      }
      else if ( ( A14468ItmId != 0 ) && ! GXutil.dateCompare(GXutil.nullDate(), AV44FacEnvMail) )
      {
         edtavFacenvmail_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
      }
      else
      {
         edtavFacenvmail_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(9) ;
      }
      sendrow_92( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_9_Refreshing )
      {
         httpContext.doAjaxLoad(9, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV47Pgmname+"GridState"), "") == 0 )
      {
         AV11GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV47Pgmname+"GridState"), null, null);
      }
      else
      {
         AV11GridState.fromxml(AV15Session.getValue(AV47Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV11GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV11GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV11GridState.fromxml(AV15Session.getValue(AV47Pgmname+"GridState"), null, null);
      AV11GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV11GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV47Pgmname+"GridState", AV11GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV9TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV47Pgmname );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AsyncBatch.JOBITEM" );
      AV10TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV10TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "JobId" );
      AV10TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV7JobId.toString() );
      AV9TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV10TrnContextAtt, 0);
      AV15Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( GXutil.strcmp(A14472ItmSts, httpContext.getMessage( "ERR", "")) == 0 ) ) )
      {
         edtItmErr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtItmErr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmErr_Visible), 5, 0), !bGXsfl_9_Refreshing);
      }
   }

   public void e152C02( )
   {
      /* Imprimir_Click Routine */
      returnInSub = false ;
      GXt_char1 = AV30ListPrinter ;
      GXv_char4[0] = GXt_char1 ;
      new app.asyncbatch.getjobpar(remoteHandle, context).execute( A14423JobId, "LISTPRINTER", GXv_char4) ;
      listjobitem_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30ListPrinter = GXt_char1 ;
      AV29Aviso = AV31AppTool.printto(A14474OutFile, AV30ListPrinter, (byte)(1), true, false) ;
      httpContext.GX_msglist.addItem(AV29Aviso);
   }

   public void e162C02( )
   {
      /* Email_Click Routine */
      returnInSub = false ;
      AV39FacCod = (int)(A14470DocId) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39FacCod), 8, 0));
      /* Execute user subroutine: 'BUSCARDADOSFACTURA' */
      S162 ();
      if (returnInSub) return;
      new app.facturacion.facturaenviomail(remoteHandle, context).execute( AV33EmprCod, AV7JobId, AV39FacCod, AV40FacFch, AV41CliCod, AV42CliNom, AV43Cliemf, true) ;
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'BUSCARDADOSFACTURA' Routine */
      returnInSub = false ;
      /* Using cursor H02C04 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV39FacCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H02C04_A396EmprCod[0] ;
         A430FacCod = H02C04_A430FacCod[0] ;
         A436FacFch = H02C04_A436FacFch[0] ;
         A252CliCod = H02C04_A252CliCod[0] ;
         A279CliNom = H02C04_A279CliNom[0] ;
         A10050Cliemf = H02C04_A10050Cliemf[0] ;
         A14420FacEnvMail = H02C04_A14420FacEnvMail[0] ;
         A279CliNom = H02C04_A279CliNom[0] ;
         A10050Cliemf = H02C04_A10050Cliemf[0] ;
         AV40FacFch = A436FacFch ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40FacFch", localUtil.format(AV40FacFch, "99/99/99"));
         AV41CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCod), 6, 0));
         AV42CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliNom", AV42CliNom);
         AV43Cliemf = A10050Cliemf ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Cliemf", AV43Cliemf);
         AV44FacEnvMail = A14420FacEnvMail ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFacenvmail_Internalname, localUtil.ttoc( AV44FacEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7JobId = (java.util.UUID)getParm(obj,0,TypeConstants.UUID) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7JobId", AV7JobId.toString());
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
      pa2C02( ) ;
      ws2C02( ) ;
      we2C02( ) ;
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
      sCtrlAV7JobId = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2C02( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "asyncbatch\\listjobitem", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2C02( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7JobId = (java.util.UUID)getParm(obj,2,TypeConstants.UUID) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7JobId", AV7JobId.toString());
      }
      wcpOAV7JobId = GXutil.strToGuid(httpContext.cgiGet( sPrefix+"wcpOAV7JobId")) ;
      if ( ! GetJustCreated( ) && ( !( AV7JobId.equals( wcpOAV7JobId ) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7JobId = AV7JobId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7JobId = httpContext.cgiGet( sPrefix+"AV7JobId_CTRL") ;
      if ( GXutil.len( sCtrlAV7JobId) > 0 )
      {
         AV7JobId = GXutil.strToGuid(httpContext.cgiGet( sCtrlAV7JobId)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7JobId", AV7JobId.toString());
      }
      else
      {
         AV7JobId = GXutil.strToGuid(httpContext.cgiGet( sPrefix+"AV7JobId_PARM")) ;
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
      pa2C02( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2C02( ) ;
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
      ws2C02( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7JobId_PARM", AV7JobId.toString());
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7JobId)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7JobId_CTRL", GXutil.rtrim( sCtrlAV7JobId));
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
      we2C02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555222", true, true);
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
      httpContext.AddJavascriptSource("asyncbatch/listjobitem.js", "?20268211555223", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_92( )
   {
      edtavEmail_Internalname = sPrefix+"vEMAIL_"+sGXsfl_9_idx ;
      edtavImprimir_Internalname = sPrefix+"vIMPRIMIR_"+sGXsfl_9_idx ;
      edtavDownload_Internalname = sPrefix+"vDOWNLOAD_"+sGXsfl_9_idx ;
      edtJobId_Internalname = sPrefix+"JOBID_"+sGXsfl_9_idx ;
      edtItmId_Internalname = sPrefix+"ITMID_"+sGXsfl_9_idx ;
      edtJobType_Internalname = sPrefix+"JOBTYPE_"+sGXsfl_9_idx ;
      edtDocId_Internalname = sPrefix+"DOCID_"+sGXsfl_9_idx ;
      edtDocLbl_Internalname = sPrefix+"DOCLBL_"+sGXsfl_9_idx ;
      edtRetryQt_Internalname = sPrefix+"RETRYQT_"+sGXsfl_9_idx ;
      edtavFacenvmail_Internalname = sPrefix+"vFACENVMAIL_"+sGXsfl_9_idx ;
      edtItmDtStart_Internalname = sPrefix+"ITMDTSTART_"+sGXsfl_9_idx ;
      edtItmDtEnd_Internalname = sPrefix+"ITMDTEND_"+sGXsfl_9_idx ;
      edtOutFile_Internalname = sPrefix+"OUTFILE_"+sGXsfl_9_idx ;
      edtOutUrl_Internalname = sPrefix+"OUTURL_"+sGXsfl_9_idx ;
      edtFileNm_Internalname = sPrefix+"FILENM_"+sGXsfl_9_idx ;
      edtItmSts_Internalname = sPrefix+"ITMSTS_"+sGXsfl_9_idx ;
      edtItmErr_Internalname = sPrefix+"ITMERR_"+sGXsfl_9_idx ;
   }

   public void subsflControlProps_fel_92( )
   {
      edtavEmail_Internalname = sPrefix+"vEMAIL_"+sGXsfl_9_fel_idx ;
      edtavImprimir_Internalname = sPrefix+"vIMPRIMIR_"+sGXsfl_9_fel_idx ;
      edtavDownload_Internalname = sPrefix+"vDOWNLOAD_"+sGXsfl_9_fel_idx ;
      edtJobId_Internalname = sPrefix+"JOBID_"+sGXsfl_9_fel_idx ;
      edtItmId_Internalname = sPrefix+"ITMID_"+sGXsfl_9_fel_idx ;
      edtJobType_Internalname = sPrefix+"JOBTYPE_"+sGXsfl_9_fel_idx ;
      edtDocId_Internalname = sPrefix+"DOCID_"+sGXsfl_9_fel_idx ;
      edtDocLbl_Internalname = sPrefix+"DOCLBL_"+sGXsfl_9_fel_idx ;
      edtRetryQt_Internalname = sPrefix+"RETRYQT_"+sGXsfl_9_fel_idx ;
      edtavFacenvmail_Internalname = sPrefix+"vFACENVMAIL_"+sGXsfl_9_fel_idx ;
      edtItmDtStart_Internalname = sPrefix+"ITMDTSTART_"+sGXsfl_9_fel_idx ;
      edtItmDtEnd_Internalname = sPrefix+"ITMDTEND_"+sGXsfl_9_fel_idx ;
      edtOutFile_Internalname = sPrefix+"OUTFILE_"+sGXsfl_9_fel_idx ;
      edtOutUrl_Internalname = sPrefix+"OUTURL_"+sGXsfl_9_fel_idx ;
      edtFileNm_Internalname = sPrefix+"FILENM_"+sGXsfl_9_fel_idx ;
      edtItmSts_Internalname = sPrefix+"ITMSTS_"+sGXsfl_9_fel_idx ;
      edtItmErr_Internalname = sPrefix+"ITMERR_"+sGXsfl_9_fel_idx ;
   }

   public void sendrow_92( )
   {
      subsflControlProps_92( ) ;
      wb2C00( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_9_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_9_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_9_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEmail_Enabled!=0)&&(edtavEmail_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 10,'"+sPrefix+"',false,'"+sGXsfl_9_idx+"',9)\"" : " ") ;
         ROClassString = edtavEmail_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmail_Internalname,GXutil.rtrim( AV36Email),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEmail_Enabled!=0)&&(edtavEmail_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,10);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVEMAIL.CLICK."+sGXsfl_9_idx+"'","","",httpContext.getMessage( "Enviar Email", ""),"",edtavEmail_Jsonclick,Integer.valueOf(5),edtavEmail_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEmail_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavImprimir_Enabled!=0)&&(edtavImprimir_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 11,'"+sPrefix+"',false,'"+sGXsfl_9_idx+"',9)\"" : " ") ;
         ROClassString = edtavImprimir_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImprimir_Internalname,GXutil.rtrim( AV37Imprimir),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavImprimir_Enabled!=0)&&(edtavImprimir_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,11);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVIMPRIMIR.CLICK."+sGXsfl_9_idx+"'","","",httpContext.getMessage( "Enviar a impressora fisica", ""),"",edtavImprimir_Jsonclick,Integer.valueOf(5),edtavImprimir_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavImprimir_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDownload_Enabled!=0)&&(edtavDownload_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 12,'"+sPrefix+"',false,'"+sGXsfl_9_idx+"',9)\"" : " ") ;
         ROClassString = edtavDownload_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDownload_Internalname,GXutil.rtrim( AV38Download),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDownload_Enabled!=0)&&(edtavDownload_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,12);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'",edtavDownload_Link,"",httpContext.getMessage( "Realizar Download", ""),"",edtavDownload_Jsonclick,Integer.valueOf(0),edtavDownload_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDownload_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobId_Internalname,A14423JobId.toString(),A14423JobId.toString(),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtJobId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmId_Internalname,GXutil.ltrim( localUtil.ntoc( A14468ItmId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14468ItmId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtItmId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobType_Internalname,A14424JobType,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtJobType_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocId_Internalname,GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14470DocId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDocId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDocId_Columnclass,edtDocId_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocLbl_Internalname,A14471DocLbl,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDocLbl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRetryQt_Internalname,GXutil.ltrim( localUtil.ntoc( A14473RetryQt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14473RetryQt), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRetryQt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFacenvmail_Enabled!=0)&&(edtavFacenvmail_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'"+sPrefix+"',false,'"+sGXsfl_9_idx+"',9)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacenvmail_Internalname,localUtil.ttoc( AV44FacEnvMail, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV44FacEnvMail, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavFacenvmail_Enabled!=0)&&(edtavFacenvmail_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,19);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacenvmail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavFacenvmail_Columnclass,edtavFacenvmail_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavFacenvmail_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmDtStart_Internalname,localUtil.ttoc( A14481ItmDtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14481ItmDtStart, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtItmDtStart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmDtEnd_Internalname,localUtil.ttoc( A14482ItmDtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14482ItmDtEnd, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtItmDtEnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOutFile_Internalname,A14474OutFile,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOutFile_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOutUrl_Internalname,A14475OutUrl,A14475OutUrl,"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOutUrl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2097152),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFileNm_Internalname,A14476FileNm,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFileNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmSts_Internalname,A14472ItmSts,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtItmSts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtItmErr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItmErr_Internalname,A14486ItmErr,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtItmErr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtItmErr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2C02( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_9_idx = ((subGrid_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_9_idx+1) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_92( ) ;
      }
      /* End function sendrow_92 */
   }

   public void startgridcontrol9( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"9\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavEmail_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavImprimir_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavDownload_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Job", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "no Job.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Type", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "tentativas realizadas.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email Enviado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Iniciado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Finalizado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "arquivo gerado.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "(se aplicável).", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "(ex.: F_12345_20260116.pdf).", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtItmErr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV36Email));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavEmail_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmail_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV37Imprimir));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavImprimir_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImprimir_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV38Download));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavDownload_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDownload_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDownload_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14423JobId.toString());
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14468ItmId, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14424JobType);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDocId_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDocId_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14471DocLbl);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14473RetryQt, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV44FacEnvMail, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavFacenvmail_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavFacenvmail_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacenvmail_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14481ItmDtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14482ItmDtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14474OutFile);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14475OutUrl);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14476FileNm);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14472ItmSts);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14486ItmErr);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtItmErr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavEmail_Internalname = sPrefix+"vEMAIL" ;
      edtavImprimir_Internalname = sPrefix+"vIMPRIMIR" ;
      edtavDownload_Internalname = sPrefix+"vDOWNLOAD" ;
      edtJobId_Internalname = sPrefix+"JOBID" ;
      edtItmId_Internalname = sPrefix+"ITMID" ;
      edtJobType_Internalname = sPrefix+"JOBTYPE" ;
      edtDocId_Internalname = sPrefix+"DOCID" ;
      edtDocLbl_Internalname = sPrefix+"DOCLBL" ;
      edtRetryQt_Internalname = sPrefix+"RETRYQT" ;
      edtavFacenvmail_Internalname = sPrefix+"vFACENVMAIL" ;
      edtItmDtStart_Internalname = sPrefix+"ITMDTSTART" ;
      edtItmDtEnd_Internalname = sPrefix+"ITMDTEND" ;
      edtOutFile_Internalname = sPrefix+"OUTFILE" ;
      edtOutUrl_Internalname = sPrefix+"OUTURL" ;
      edtFileNm_Internalname = sPrefix+"FILENM" ;
      edtItmSts_Internalname = sPrefix+"ITMSTS" ;
      edtItmErr_Internalname = sPrefix+"ITMERR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtItmErr_Jsonclick = "" ;
      edtItmSts_Jsonclick = "" ;
      edtFileNm_Jsonclick = "" ;
      edtOutUrl_Jsonclick = "" ;
      edtOutFile_Jsonclick = "" ;
      edtItmDtEnd_Jsonclick = "" ;
      edtItmDtStart_Jsonclick = "" ;
      edtavFacenvmail_Jsonclick = "" ;
      edtavFacenvmail_Columnclass = "WWColumn" ;
      edtavFacenvmail_Visible = -1 ;
      edtavFacenvmail_Enabled = 1 ;
      edtRetryQt_Jsonclick = "" ;
      edtDocLbl_Jsonclick = "" ;
      edtDocId_Jsonclick = "" ;
      edtDocId_Columnclass = "WWColumn" ;
      edtJobType_Jsonclick = "" ;
      edtItmId_Jsonclick = "" ;
      edtJobId_Jsonclick = "" ;
      edtavDownload_Jsonclick = "" ;
      edtavDownload_Class = "Attribute" ;
      edtavDownload_Visible = -1 ;
      edtavDownload_Link = "" ;
      edtavDownload_Enabled = 1 ;
      edtavImprimir_Jsonclick = "" ;
      edtavImprimir_Class = "Attribute" ;
      edtavImprimir_Visible = -1 ;
      edtavImprimir_Enabled = 1 ;
      edtavEmail_Jsonclick = "" ;
      edtavEmail_Class = "Attribute" ;
      edtavEmail_Visible = -1 ;
      edtavEmail_Enabled = 1 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFacenvmail_Columnheaderclass = "" ;
      edtDocId_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Grid" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6" ;
      Ddo_grid_Columnids = "6:DocId|7:DocLbl|10:ItmDtStart|11:ItmDtEnd|15:ItmSts|16:ItmErr" ;
      Ddo_grid_Gridinternalname = "" ;
      edtItmErr_Visible = -1 ;
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'sPrefix'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'edtDocId_Columnheaderclass',ctrl:'DOCID',prop:'Columnheaderclass'},{av:'edtavFacenvmail_Columnheaderclass',ctrl:'vFACENVMAIL',prop:'Columnheaderclass'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e112C02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e142C02',iparms:[{av:'A14470DocId',fld:'DOCID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A14472ItmSts',fld:'ITMSTS',pic:''},{av:'A14474OutFile',fld:'OUTFILE',pic:'',hsh:true},{av:'A14475OutUrl',fld:'OUTURL',pic:''},{av:'A14476FileNm',fld:'FILENM',pic:''},{av:'A14468ItmId',fld:'ITMID',pic:'ZZZZZZZZZ9'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV36Email',fld:'vEMAIL',pic:''},{av:'edtavEmail_Class',ctrl:'vEMAIL',prop:'Class'},{av:'AV37Imprimir',fld:'vIMPRIMIR',pic:''},{av:'edtavImprimir_Class',ctrl:'vIMPRIMIR',prop:'Class'},{av:'AV38Download',fld:'vDOWNLOAD',pic:''},{av:'edtavDownload_Link',ctrl:'vDOWNLOAD',prop:'Link'},{av:'edtavDownload_Class',ctrl:'vDOWNLOAD',prop:'Class'},{av:'edtDocId_Columnclass',ctrl:'DOCID',prop:'Columnclass'},{av:'edtavFacenvmail_Columnclass',ctrl:'vFACENVMAIL',prop:'Columnclass'},{av:'AV40FacFch',fld:'vFACFCH',pic:''},{av:'AV41CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV42CliNom',fld:'vCLINOM',pic:''},{av:'AV43Cliemf',fld:'vCLIEMF',pic:''},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VIMPRIMIR.CLICK","{handler:'e152C02',iparms:[{av:'A14423JobId',fld:'JOBID',pic:'',hsh:true},{av:'A14474OutFile',fld:'OUTFILE',pic:'',hsh:true}]");
      setEventMetadata("VIMPRIMIR.CLICK",",oparms:[]}");
      setEventMetadata("VEMAIL.CLICK","{handler:'e162C02',iparms:[{av:'A14470DocId',fld:'DOCID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'AV40FacFch',fld:'vFACFCH',pic:''},{av:'AV41CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV42CliNom',fld:'vCLINOM',pic:''},{av:'AV43Cliemf',fld:'vCLIEMF',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'}]");
      setEventMetadata("VEMAIL.CLICK",",oparms:[{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV40FacFch',fld:'vFACFCH',pic:''},{av:'AV41CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV42CliNom',fld:'vCLINOM',pic:''},{av:'AV43Cliemf',fld:'vCLIEMF',pic:''},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'edtDocId_Columnheaderclass',ctrl:'DOCID',prop:'Columnheaderclass'},{av:'edtavFacenvmail_Columnheaderclass',ctrl:'vFACENVMAIL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'edtDocId_Columnheaderclass',ctrl:'DOCID',prop:'Columnheaderclass'},{av:'edtavFacenvmail_Columnheaderclass',ctrl:'vFACENVMAIL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'edtDocId_Columnheaderclass',ctrl:'DOCID',prop:'Columnheaderclass'},{av:'edtavFacenvmail_Columnheaderclass',ctrl:'vFACENVMAIL',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7JobId',fld:'vJOBID',pic:''},{av:'edtItmErr_Visible',ctrl:'ITMERR',prop:'Visible'},{av:'AV44FacEnvMail',fld:'vFACENVMAIL',pic:'99/99/99 99:99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV39FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'edtDocId_Columnheaderclass',ctrl:'DOCID',prop:'Columnheaderclass'},{av:'edtavFacenvmail_Columnheaderclass',ctrl:'vFACENVMAIL',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALID_JOBID","{handler:'valid_Jobid',iparms:[]");
      setEventMetadata("VALID_JOBID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Itmerr',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      wcpOAV7JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV47Pgmname = "" ;
      AV44FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10050Cliemf = "" ;
      A14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      AV33EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV40FacFch = GXutil.nullDate() ;
      AV42CliNom = "" ;
      AV43Cliemf = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV36Email = "" ;
      AV37Imprimir = "" ;
      AV38Download = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14424JobType = "" ;
      A14471DocLbl = "" ;
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14474OutFile = "" ;
      A14475OutUrl = "" ;
      A14476FileNm = "" ;
      A14472ItmSts = "" ;
      A14486ItmErr = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H02C02_A14475OutUrl = new String[] {""} ;
      H02C02_n14475OutUrl = new boolean[] {false} ;
      H02C02_A14486ItmErr = new String[] {""} ;
      H02C02_n14486ItmErr = new boolean[] {false} ;
      H02C02_A14472ItmSts = new String[] {""} ;
      H02C02_n14472ItmSts = new boolean[] {false} ;
      H02C02_A14476FileNm = new String[] {""} ;
      H02C02_n14476FileNm = new boolean[] {false} ;
      H02C02_A14474OutFile = new String[] {""} ;
      H02C02_n14474OutFile = new boolean[] {false} ;
      H02C02_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      H02C02_n14482ItmDtEnd = new boolean[] {false} ;
      H02C02_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      H02C02_n14481ItmDtStart = new boolean[] {false} ;
      H02C02_A14473RetryQt = new short[1] ;
      H02C02_n14473RetryQt = new boolean[] {false} ;
      H02C02_A14471DocLbl = new String[] {""} ;
      H02C02_n14471DocLbl = new boolean[] {false} ;
      H02C02_A14470DocId = new long[1] ;
      H02C02_n14470DocId = new boolean[] {false} ;
      H02C02_A14424JobType = new String[] {""} ;
      H02C02_n14424JobType = new boolean[] {false} ;
      H02C02_A14468ItmId = new long[1] ;
      H02C02_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02C03_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV32Station = "" ;
      GXv_char2 = new String[1] ;
      AV34EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV35UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15Session = httpContext.getWebSession();
      AV11GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8HTTPRequest = httpContext.getHttpRequest();
      AV10TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV30ListPrinter = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV29Aviso = "" ;
      AV31AppTool = new app.SdtAppTool(remoteHandle, context);
      H02C04_A396EmprCod = new String[] {""} ;
      H02C04_A430FacCod = new int[1] ;
      H02C04_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02C04_A252CliCod = new int[1] ;
      H02C04_A279CliNom = new String[] {""} ;
      H02C04_A10050Cliemf = new String[] {""} ;
      H02C04_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7JobId = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.listjobitem__default(),
         new Object[] {
             new Object[] {
            H02C02_A14475OutUrl, H02C02_n14475OutUrl, H02C02_A14486ItmErr, H02C02_n14486ItmErr, H02C02_A14472ItmSts, H02C02_n14472ItmSts, H02C02_A14476FileNm, H02C02_n14476FileNm, H02C02_A14474OutFile, H02C02_n14474OutFile,
            H02C02_A14482ItmDtEnd, H02C02_n14482ItmDtEnd, H02C02_A14481ItmDtStart, H02C02_n14481ItmDtStart, H02C02_A14473RetryQt, H02C02_n14473RetryQt, H02C02_A14471DocLbl, H02C02_n14471DocLbl, H02C02_A14470DocId, H02C02_n14470DocId,
            H02C02_A14424JobType, H02C02_n14424JobType, H02C02_A14468ItmId, H02C02_A14423JobId
            }
            , new Object[] {
            H02C03_AGRID_nRecordCount
            }
            , new Object[] {
            H02C04_A396EmprCod, H02C04_A430FacCod, H02C04_A436FacFch, H02C04_A252CliCod, H02C04_A279CliNom, H02C04_A10050Cliemf, H02C04_A14420FacEnvMail
            }
         }
      );
      AV47Pgmname = "AsyncBatch.ListJobItem" ;
      /* GeneXus formulas. */
      AV47Pgmname = "AsyncBatch.ListJobItem" ;
      Gx_err = (short)(0) ;
      edtavEmail_Enabled = 0 ;
      edtavImprimir_Enabled = 0 ;
      edtavDownload_Enabled = 0 ;
      edtavFacenvmail_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A14473RetryQt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtItmErr_Visible ;
   private int nRC_GXsfl_9 ;
   private int subGrid_Rows ;
   private int nGXsfl_9_idx=1 ;
   private int A430FacCod ;
   private int AV39FacCod ;
   private int A252CliCod ;
   private int AV41CliCod ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavEmail_Enabled ;
   private int edtavImprimir_Enabled ;
   private int edtavDownload_Enabled ;
   private int edtavFacenvmail_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEmail_Visible ;
   private int edtavImprimir_Visible ;
   private int edtavDownload_Visible ;
   private int edtavFacenvmail_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A14468ItmId ;
   private long A14470DocId ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_9_idx="0001" ;
   private String edtItmErr_Internalname ;
   private String AV47Pgmname ;
   private String A279CliNom ;
   private String A10050Cliemf ;
   private String AV33EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV42CliNom ;
   private String AV43Cliemf ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEmail_Internalname ;
   private String AV36Email ;
   private String AV37Imprimir ;
   private String edtavImprimir_Internalname ;
   private String AV38Download ;
   private String edtavDownload_Internalname ;
   private String edtJobId_Internalname ;
   private String edtItmId_Internalname ;
   private String edtJobType_Internalname ;
   private String edtDocId_Internalname ;
   private String edtDocLbl_Internalname ;
   private String edtRetryQt_Internalname ;
   private String edtavFacenvmail_Internalname ;
   private String edtItmDtStart_Internalname ;
   private String edtItmDtEnd_Internalname ;
   private String edtOutFile_Internalname ;
   private String edtOutUrl_Internalname ;
   private String edtFileNm_Internalname ;
   private String edtItmSts_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String hsh ;
   private String AV32Station ;
   private String GXv_char2[] ;
   private String AV34EmprNom ;
   private String GXv_char3[] ;
   private String AV35UsurCod ;
   private String edtDocId_Columnheaderclass ;
   private String edtavFacenvmail_Columnheaderclass ;
   private String edtavEmail_Class ;
   private String edtavImprimir_Class ;
   private String edtavDownload_Link ;
   private String edtavDownload_Class ;
   private String edtDocId_Columnclass ;
   private String edtavFacenvmail_Columnclass ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String A396EmprCod ;
   private String sCtrlAV7JobId ;
   private String sGXsfl_9_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String ROClassString ;
   private String edtavEmail_Jsonclick ;
   private String edtavImprimir_Jsonclick ;
   private String edtavDownload_Jsonclick ;
   private String edtJobId_Jsonclick ;
   private String edtItmId_Jsonclick ;
   private String edtJobType_Jsonclick ;
   private String edtDocId_Jsonclick ;
   private String edtDocLbl_Jsonclick ;
   private String edtRetryQt_Jsonclick ;
   private String edtavFacenvmail_Jsonclick ;
   private String edtItmDtStart_Jsonclick ;
   private String edtItmDtEnd_Jsonclick ;
   private String edtOutFile_Jsonclick ;
   private String edtOutUrl_Jsonclick ;
   private String edtFileNm_Jsonclick ;
   private String edtItmSts_Jsonclick ;
   private String edtItmErr_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV44FacEnvMail ;
   private java.util.Date A14420FacEnvMail ;
   private java.util.Date A14481ItmDtStart ;
   private java.util.Date A14482ItmDtEnd ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV40FacFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_9_Refreshing=false ;
   private boolean AV14OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14424JobType ;
   private boolean n14470DocId ;
   private boolean n14471DocLbl ;
   private boolean n14473RetryQt ;
   private boolean n14481ItmDtStart ;
   private boolean n14482ItmDtEnd ;
   private boolean n14474OutFile ;
   private boolean n14475OutUrl ;
   private boolean n14476FileNm ;
   private boolean n14472ItmSts ;
   private boolean n14486ItmErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A14475OutUrl ;
   private String A14424JobType ;
   private String A14471DocLbl ;
   private String A14474OutFile ;
   private String A14476FileNm ;
   private String A14472ItmSts ;
   private String A14486ItmErr ;
   private String AV30ListPrinter ;
   private String AV29Aviso ;
   private java.util.UUID wcpOAV7JobId ;
   private java.util.UUID AV7JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private app.SdtAppTool AV31AppTool ;
   private IDataStoreProvider pr_default ;
   private String[] H02C02_A14475OutUrl ;
   private boolean[] H02C02_n14475OutUrl ;
   private String[] H02C02_A14486ItmErr ;
   private boolean[] H02C02_n14486ItmErr ;
   private String[] H02C02_A14472ItmSts ;
   private boolean[] H02C02_n14472ItmSts ;
   private String[] H02C02_A14476FileNm ;
   private boolean[] H02C02_n14476FileNm ;
   private String[] H02C02_A14474OutFile ;
   private boolean[] H02C02_n14474OutFile ;
   private java.util.Date[] H02C02_A14482ItmDtEnd ;
   private boolean[] H02C02_n14482ItmDtEnd ;
   private java.util.Date[] H02C02_A14481ItmDtStart ;
   private boolean[] H02C02_n14481ItmDtStart ;
   private short[] H02C02_A14473RetryQt ;
   private boolean[] H02C02_n14473RetryQt ;
   private String[] H02C02_A14471DocLbl ;
   private boolean[] H02C02_n14471DocLbl ;
   private long[] H02C02_A14470DocId ;
   private boolean[] H02C02_n14470DocId ;
   private String[] H02C02_A14424JobType ;
   private boolean[] H02C02_n14424JobType ;
   private long[] H02C02_A14468ItmId ;
   private java.util.UUID[] H02C02_A14423JobId ;
   private long[] H02C03_AGRID_nRecordCount ;
   private String[] H02C04_A396EmprCod ;
   private int[] H02C04_A430FacCod ;
   private java.util.Date[] H02C04_A436FacFch ;
   private int[] H02C04_A252CliCod ;
   private String[] H02C04_A279CliNom ;
   private String[] H02C04_A10050Cliemf ;
   private java.util.Date[] H02C04_A14420FacEnvMail ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV10TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV11GridState ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class listjobitem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02C02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          java.util.UUID AV7JobId ,
                                          java.util.UUID A14423JobId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.OutUrl, T1.ItmErr, T1.ItmSts, T1.FileNm, T1.OutFile, T1.ItmDtEnd, T1.ItmDtStart, T1.RetryQt, T1.DocLbl, T1.DocId, T2.JobType, T1.ItmId," ;
      sSelectString += " T1.JobId" ;
      sFromString = " FROM (TXPJOBITE T1 INNER JOIN TXPJOB T2 ON T2.JobId = T1.JobId)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.JobId = ?)");
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.DocId" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.DocId DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.DocLbl" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.DocLbl DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.ItmDtStart" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.ItmDtStart DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.ItmDtEnd" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.ItmDtEnd DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.ItmSts" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.ItmSts DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.JobId, T1.ItmErr" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.JobId DESC, T1.ItmErr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.ItmId, T1.JobId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H02C03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          java.util.UUID AV7JobId ,
                                          java.util.UUID A14423JobId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[1];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPJOBITE T1 INNER JOIN TXPJOB T2 ON T2.JobId = T1.JobId)" ;
      addWhere(sWhereString, "(T1.JobId = ?)");
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H02C02(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (java.util.UUID)dynConstraints[2] , (java.util.UUID)dynConstraints[3] );
            case 1 :
                  return conditional_H02C03(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (java.util.UUID)dynConstraints[2] , (java.util.UUID)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02C02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02C03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02C04", "SELECT T1.EmprCod, T1.FacCod, T1.FacFch, T1.CliCod, T2.CliNom, T2.Cliemf, T1.FacEnvMail FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12);
               ((java.util.UUID[]) buf[23])[0] = rslt.getGUID(13);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setGUID(sIdx, (java.util.UUID)parms[6]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setGUID(sIdx, (java.util.UUID)parms[1]);
               }
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

