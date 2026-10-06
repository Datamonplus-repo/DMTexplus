package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wclistfacturajob_impl extends GXWebComponent
{
   public wclistfacturajob_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wclistfacturajob_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wclistfacturajob_impl.class ));
   }

   public wclistfacturajob_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbJobStat = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Listjobgrid") == 0 )
            {
               gxnrlistjobgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Listjobgrid") == 0 )
            {
               gxgrlistjobgrid_refresh_invoke( ) ;
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

   public void gxnrlistjobgrid_newrow_invoke( )
   {
      nRC_GXsfl_18 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_18"))) ;
      nGXsfl_18_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_18_idx"))) ;
      sGXsfl_18_idx = httpContext.GetPar( "sGXsfl_18_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrlistjobgrid_newrow( ) ;
      /* End function gxnrListjobgrid_newrow_invoke */
   }

   public void gxgrlistjobgrid_refresh_invoke( )
   {
      subListjobgrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subListjobgrid_Rows"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrListjobgrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2BZ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Lista de Facturas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.asyncbatch.wclistfacturajob", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_18", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_18, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLISTJOBGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV15ListJobGridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV11UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Class", GXutil.rtrim( Listjobgridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Listjobgridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Listjobgridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Listjobgridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Listjobgridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Listjobgridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Listjobgridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Previous", GXutil.rtrim( Listjobgridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Next", GXutil.rtrim( Listjobgridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Caption", GXutil.rtrim( Listjobgridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Listjobgridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Gridinternalname", GXutil.rtrim( Popover_jobid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Iteminternalname", GXutil.rtrim( Popover_jobid_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Isgriditem", GXutil.booltostr( Popover_jobid_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Trigger", GXutil.rtrim( Popover_jobid_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_jobid_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"POPOVER_JOBID_Position", GXutil.rtrim( Popover_jobid_Position));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Listjobgrid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Listjobgrid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2BZ2( )
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
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
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
      return "AsyncBatch.WCListFacturaJob" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lista de Facturas", "") ;
   }

   public void wb2BZ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.asyncbatch.wclistfacturajob");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divListjobgridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         ListjobgridContainer.SetWrapped(nGXWrapped);
         startgridcontrol18( ) ;
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_18 = (int)(nGXsfl_18_idx-1) ;
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucListjobgridpaginationbar.setProperty("Class", Listjobgridpaginationbar_Class);
         ucListjobgridpaginationbar.setProperty("ShowFirst", Listjobgridpaginationbar_Showfirst);
         ucListjobgridpaginationbar.setProperty("ShowPrevious", Listjobgridpaginationbar_Showprevious);
         ucListjobgridpaginationbar.setProperty("ShowNext", Listjobgridpaginationbar_Shownext);
         ucListjobgridpaginationbar.setProperty("ShowLast", Listjobgridpaginationbar_Showlast);
         ucListjobgridpaginationbar.setProperty("PagesToShow", Listjobgridpaginationbar_Pagestoshow);
         ucListjobgridpaginationbar.setProperty("PagingButtonsPosition", Listjobgridpaginationbar_Pagingbuttonsposition);
         ucListjobgridpaginationbar.setProperty("PagingCaptionPosition", Listjobgridpaginationbar_Pagingcaptionposition);
         ucListjobgridpaginationbar.setProperty("EmptyGridClass", Listjobgridpaginationbar_Emptygridclass);
         ucListjobgridpaginationbar.setProperty("RowsPerPageSelector", Listjobgridpaginationbar_Rowsperpageselector);
         ucListjobgridpaginationbar.setProperty("RowsPerPageOptions", Listjobgridpaginationbar_Rowsperpageoptions);
         ucListjobgridpaginationbar.setProperty("Previous", Listjobgridpaginationbar_Previous);
         ucListjobgridpaginationbar.setProperty("Next", Listjobgridpaginationbar_Next);
         ucListjobgridpaginationbar.setProperty("Caption", Listjobgridpaginationbar_Caption);
         ucListjobgridpaginationbar.setProperty("EmptyGridCaption", Listjobgridpaginationbar_Emptygridcaption);
         ucListjobgridpaginationbar.setProperty("RowsPerPageCaption", Listjobgridpaginationbar_Rowsperpagecaption);
         ucListjobgridpaginationbar.setProperty("CurrentPage", AV14ListJobGridCurrentPage);
         ucListjobgridpaginationbar.setProperty("PageCount", AV15ListJobGridPageCount);
         ucListjobgridpaginationbar.render(context, "dvelop.dvpaginationbar", Listjobgridpaginationbar_Internalname, sPrefix+"LISTJOBGRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV19Pgmname), GXutil.rtrim( localUtil.format( AV19Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\WCListFacturaJob.htm");
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
         ucPopover_jobid.setProperty("IsGridItem", Popover_jobid_Isgriditem);
         ucPopover_jobid.setProperty("Trigger", Popover_jobid_Trigger);
         ucPopover_jobid.setProperty("PopoverWidth", Popover_jobid_Popoverwidth);
         ucPopover_jobid.setProperty("Position", Popover_jobid_Position);
         ucPopover_jobid.render(context, "dvelop.wwppopover", Popover_jobid_Internalname, sPrefix+"POPOVER_JOBIDContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'" + sGXsfl_18_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListjobgridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ListJobGridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListjobgridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavListjobgridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\WCListFacturaJob.htm");
         /* User Defined Control */
         ucListjobgrid_empowerer.setProperty("PopoversInGrid", Listjobgrid_empowerer_Popoversingrid);
         ucListjobgrid_empowerer.render(context, "wwp.gridempowerer", Listjobgrid_empowerer_Internalname, sPrefix+"LISTJOBGRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0044"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0044"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_18_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0044"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
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
      }
      if ( wbEnd == 18 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( ListjobgridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2BZ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Lista de Facturas", ""), (short)(0)) ;
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
            strup2BZ0( ) ;
         }
      }
   }

   public void ws2BZ2( )
   {
      start2BZ2( ) ;
      evt2BZ2( ) ;
   }

   public void evt2BZ2( )
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
                              strup2BZ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112BZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122BZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavExecutar_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "LISTJOBGRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VEXECUTAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VEXECUTAR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BZ0( ) ;
                           }
                           nGXsfl_18_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_182( ) ;
                           AV5Executar = httpContext.cgiGet( edtavExecutar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExecutar_Internalname, AV5Executar);
                           AV16JobIdWithTags = httpContext.cgiGet( edtavJobidwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavJobidwithtags_Internalname, AV16JobIdWithTags);
                           A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
                           A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
                           n14485JobDesc = false ;
                           cmbJobStat.setName( cmbJobStat.getInternalname() );
                           cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
                           A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
                           n14450JobStat = false ;
                           A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
                           n14424JobType = false ;
                           A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14457OkItem = false ;
                           A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14458ErItem = false ;
                           A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14456PrcItem = false ;
                           A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14459PrgPct = false ;
                           A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14455TotItem = false ;
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
                                       GX_FocusControl = edtavExecutar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e132BZ2 ();
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
                                       GX_FocusControl = edtavExecutar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e142BZ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LISTJOBGRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavExecutar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e152BZ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXECUTAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavExecutar_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e162BZ2 ();
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
                                    strup2BZ0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavExecutar_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 44 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0044") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0044", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2BZ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2BZ2( ) ;
         }
      }
   }

   public void pa2BZ2( )
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
            GX_FocusControl = edtavListjobgridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrlistjobgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_182( ) ;
      while ( nGXsfl_18_idx <= nRC_GXsfl_18 )
      {
         sendrow_182( ) ;
         nGXsfl_18_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_18_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      addString( httpContext.getJSONContainerResponse( ListjobgridContainer)) ;
      /* End function gxnrListjobgrid_newrow */
   }

   public void gxgrlistjobgrid_refresh( int subListjobgrid_Rows ,
                                        String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142BZ2 ();
      LISTJOBGRID_nCurrentRecord = 0 ;
      rf2BZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrListjobgrid_refresh */
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
      rf2BZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV19Pgmname = "AsyncBatch.WCListFacturaJob" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Pgmname", AV19Pgmname);
      Gx_err = (short)(0) ;
      edtavExecutar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExecutar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExecutar_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavJobidwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavJobidwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobidwithtags_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         ListjobgridContainer.ClearRows();
      }
      wbStart = (short)(18) ;
      /* Execute user event: Refresh */
      e142BZ2 ();
      nGXsfl_18_idx = 1 ;
      sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_182( ) ;
      bGXsfl_18_Refreshing = true ;
      ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      ListjobgridContainer.AddObjectProperty("CmpContext", sPrefix);
      ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
      ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      ListjobgridContainer.setPageSize( sublistjobgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_182( ) ;
         GXPagingFrom2 = (int)(((subListjobgrid_Rows==0) ? 0 : LISTJOBGRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subListjobgrid_Rows==0) ? 10000 : sublistjobgrid_fnc_recordsperpage( )+1) ;
         /* Using cursor H02BZ2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_18_idx = 1 ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subListjobgrid_Rows == 0 ) || ( LISTJOBGRID_nCurrentRecord < sublistjobgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14455TotItem = H02BZ2_A14455TotItem[0] ;
            n14455TotItem = H02BZ2_n14455TotItem[0] ;
            A14459PrgPct = H02BZ2_A14459PrgPct[0] ;
            n14459PrgPct = H02BZ2_n14459PrgPct[0] ;
            A14456PrcItem = H02BZ2_A14456PrcItem[0] ;
            n14456PrcItem = H02BZ2_n14456PrcItem[0] ;
            A14458ErItem = H02BZ2_A14458ErItem[0] ;
            n14458ErItem = H02BZ2_n14458ErItem[0] ;
            A14457OkItem = H02BZ2_A14457OkItem[0] ;
            n14457OkItem = H02BZ2_n14457OkItem[0] ;
            A14424JobType = H02BZ2_A14424JobType[0] ;
            n14424JobType = H02BZ2_n14424JobType[0] ;
            A14450JobStat = H02BZ2_A14450JobStat[0] ;
            n14450JobStat = H02BZ2_n14450JobStat[0] ;
            A14485JobDesc = H02BZ2_A14485JobDesc[0] ;
            n14485JobDesc = H02BZ2_n14485JobDesc[0] ;
            A14423JobId = H02BZ2_A14423JobId[0] ;
            e152BZ2 ();
            pr_default.readNext(0);
         }
         LISTJOBGRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(18) ;
         wb2BZ0( ) ;
      }
      bGXsfl_18_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BZ2( )
   {
   }

   public int sublistjobgrid_fnc_pagecount( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public int sublistjobgrid_fnc_recordcount( )
   {
      /* Using cursor H02BZ3 */
      pr_default.execute(1);
      LISTJOBGRID_nRecordCount = H02BZ3_ALISTJOBGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(LISTJOBGRID_nRecordCount) ;
   }

   public int sublistjobgrid_fnc_recordsperpage( )
   {
      if ( subListjobgrid_Rows > 0 )
      {
         return subListjobgrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int sublistjobgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( LISTJOBGRID_nFirstRecordOnPage/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public short sublistjobgrid_firstpage( )
   {
      LISTJOBGRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_nextpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ( LISTJOBGRID_nRecordCount >= sublistjobgrid_fnc_recordsperpage( ) ) && ( LISTJOBGRID_nEOF == 0 ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage+sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("LISTJOBGRID_nFirstRecordOnPage", LISTJOBGRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((LISTJOBGRID_nEOF==0) ? 0 : 2)) ;
   }

   public short sublistjobgrid_previouspage( )
   {
      if ( LISTJOBGRID_nFirstRecordOnPage >= sublistjobgrid_fnc_recordsperpage( ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage-sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_lastpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( LISTJOBGRID_nRecordCount > sublistjobgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-sublistjobgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int sublistjobgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(sublistjobgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV19Pgmname = "AsyncBatch.WCListFacturaJob" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Pgmname", AV19Pgmname);
      Gx_err = (short)(0) ;
      edtavExecutar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExecutar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExecutar_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavJobidwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavJobidwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobidwithtags_Enabled), 5, 0), !bGXsfl_18_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132BZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_18 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_18"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15ListJobGridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vLISTJOBGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subListjobgrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Listjobgridpaginationbar_Class = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Class") ;
         Listjobgridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showfirst")) ;
         Listjobgridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showprevious")) ;
         Listjobgridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Shownext")) ;
         Listjobgridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Showlast")) ;
         Listjobgridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Listjobgridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Listjobgridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Emptygridclass") ;
         Listjobgridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Listjobgridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Previous") ;
         Listjobgridpaginationbar_Next = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Next") ;
         Listjobgridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Caption") ;
         Listjobgridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Emptygridcaption") ;
         Listjobgridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Popover_jobid_Gridinternalname = httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Gridinternalname") ;
         Popover_jobid_Iteminternalname = httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Iteminternalname") ;
         Popover_jobid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Isgriditem")) ;
         Popover_jobid_Trigger = httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Trigger") ;
         Popover_jobid_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_jobid_Position = httpContext.cgiGet( sPrefix+"POPOVER_JOBID_Position") ;
         Listjobgrid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"LISTJOBGRID_EMPOWERER_Gridinternalname") ;
         Listjobgrid_empowerer_Popoversingrid = httpContext.cgiGet( sPrefix+"LISTJOBGRID_EMPOWERER_Popoversingrid") ;
         Listjobgridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Selectedpage") ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV19Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Pgmname", AV19Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLISTJOBGRIDCURRENTPAGE");
            GX_FocusControl = edtavListjobgridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14ListJobGridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
         }
         else
         {
            AV14ListJobGridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e132BZ2 ();
      if (returnInSub) return;
   }

   public void e132BZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wclistfacturajob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      wclistfacturajob_impl.this.AV10EmprCod = GXv_char2[0] ;
      wclistfacturajob_impl.this.AV13EmprNom = GXv_char3[0] ;
      wclistfacturajob_impl.this.AV11UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11UsurCod", AV11UsurCod);
      Popover_jobid_Gridinternalname = subListjobgrid_Internalname ;
      ucPopover_jobid.sendProperty(context, sPrefix, false, Popover_jobid_Internalname, "GridInternalName", Popover_jobid_Gridinternalname);
      Popover_jobid_Iteminternalname = edtavJobidwithtags_Internalname ;
      ucPopover_jobid.sendProperty(context, sPrefix, false, Popover_jobid_Internalname, "ItemInternalName", Popover_jobid_Iteminternalname);
      Listjobgrid_empowerer_Gridinternalname = subListjobgrid_Internalname ;
      ucListjobgrid_empowerer.sendProperty(context, sPrefix, false, Listjobgrid_empowerer_Internalname, "GridInternalName", Listjobgrid_empowerer_Gridinternalname);
      subListjobgrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV14ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
      edtavListjobgridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavListjobgridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListjobgridcurrentpage_Visible), 5, 0), true);
      AV15ListJobGridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ListJobGridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ListJobGridPageCount), 10, 0));
      Listjobgridpaginationbar_Rowsperpageselectedvalue = subListjobgrid_Rows ;
      ucListjobgridpaginationbar.sendProperty(context, sPrefix, false, Listjobgridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Listjobgridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e142BZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e152BZ2( )
   {
      /* Listjobgrid_Load Routine */
      returnInSub = false ;
      AV5Executar = "<i class=\"AttributeWeightBold fas fa-cogs\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExecutar_Internalname, AV5Executar);
      AV16JobIdWithTags = A14423JobId.toString() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavJobidwithtags_Internalname, AV16JobIdWithTags);
      AV16JobIdWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down fas fa-list'></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavJobidwithtags_Internalname, AV16JobIdWithTags);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(18) ;
      }
      sendrow_182( ) ;
      LISTJOBGRID_nCurrentRecord = (long)(LISTJOBGRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_18_Refreshing )
      {
         httpContext.doAjaxLoad(18, ListjobgridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e112BZ2( )
   {
      /* Listjobgridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV14ListJobGridCurrentPage = (long)(AV14ListJobGridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV14ListJobGridCurrentPage = (long)(AV14ListJobGridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_nextpage( ) ;
      }
      else
      {
         AV7PageToGo = (int)(GXutil.lval( Listjobgridpaginationbar_Selectedpage)) ;
         AV14ListJobGridCurrentPage = AV7PageToGo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_gotopage( AV7PageToGo) ;
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void e122BZ2( )
   {
      /* Listjobgridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subListjobgrid_Rows = Listjobgridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV14ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ListJobGridCurrentPage), 10, 0));
      sublistjobgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e162BZ2( )
   {
      /* Executar_Click Routine */
      returnInSub = false ;
      callSubmit( 1 , new Object[]{ A14423JobId,AV10EmprCod,AV11UsurCod });
      /*  Sending Event outputs  */
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
      pa2BZ2( ) ;
      ws2BZ2( ) ;
      we2BZ2( ) ;
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
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2BZ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "asyncbatch\\wclistfacturajob", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2BZ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
      }
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      pa2BZ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2BZ2( ) ;
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
      ws2BZ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      we2BZ2( ) ;
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015551870", true, true);
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
      httpContext.AddJavascriptSource("asyncbatch/wclistfacturajob.js", "?202661015551870", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_182( )
   {
      edtavExecutar_Internalname = sPrefix+"vEXECUTAR_"+sGXsfl_18_idx ;
      edtavJobidwithtags_Internalname = sPrefix+"vJOBIDWITHTAGS_"+sGXsfl_18_idx ;
      edtJobId_Internalname = sPrefix+"JOBID_"+sGXsfl_18_idx ;
      edtJobDesc_Internalname = sPrefix+"JOBDESC_"+sGXsfl_18_idx ;
      cmbJobStat.setInternalname( sPrefix+"JOBSTAT_"+sGXsfl_18_idx );
      edtJobType_Internalname = sPrefix+"JOBTYPE_"+sGXsfl_18_idx ;
      edtOkItem_Internalname = sPrefix+"OKITEM_"+sGXsfl_18_idx ;
      edtErItem_Internalname = sPrefix+"ERITEM_"+sGXsfl_18_idx ;
      edtPrcItem_Internalname = sPrefix+"PRCITEM_"+sGXsfl_18_idx ;
      edtPrgPct_Internalname = sPrefix+"PRGPCT_"+sGXsfl_18_idx ;
      edtTotItem_Internalname = sPrefix+"TOTITEM_"+sGXsfl_18_idx ;
   }

   public void subsflControlProps_fel_182( )
   {
      edtavExecutar_Internalname = sPrefix+"vEXECUTAR_"+sGXsfl_18_fel_idx ;
      edtavJobidwithtags_Internalname = sPrefix+"vJOBIDWITHTAGS_"+sGXsfl_18_fel_idx ;
      edtJobId_Internalname = sPrefix+"JOBID_"+sGXsfl_18_fel_idx ;
      edtJobDesc_Internalname = sPrefix+"JOBDESC_"+sGXsfl_18_fel_idx ;
      cmbJobStat.setInternalname( sPrefix+"JOBSTAT_"+sGXsfl_18_fel_idx );
      edtJobType_Internalname = sPrefix+"JOBTYPE_"+sGXsfl_18_fel_idx ;
      edtOkItem_Internalname = sPrefix+"OKITEM_"+sGXsfl_18_fel_idx ;
      edtErItem_Internalname = sPrefix+"ERITEM_"+sGXsfl_18_fel_idx ;
      edtPrcItem_Internalname = sPrefix+"PRCITEM_"+sGXsfl_18_fel_idx ;
      edtPrgPct_Internalname = sPrefix+"PRGPCT_"+sGXsfl_18_fel_idx ;
      edtTotItem_Internalname = sPrefix+"TOTITEM_"+sGXsfl_18_fel_idx ;
   }

   public void sendrow_182( )
   {
      subsflControlProps_182( ) ;
      wb2BZ0( ) ;
      if ( ( subListjobgrid_Rows * 1 == 0 ) || ( nGXsfl_18_idx <= sublistjobgrid_fnc_recordsperpage( ) * 1 ) )
      {
         ListjobgridRow = GXWebRow.GetNew(context,ListjobgridContainer) ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            subListjobgrid_Backcolor = subListjobgrid_Allbackcolor ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Uniform" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
            subListjobgrid_Backcolor = (int)(0x0) ;
         }
         else if ( subListjobgrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_18_idx) % (2))) == 0 )
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Even" ;
               }
            }
            else
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
               }
            }
         }
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_18_idx+"\">") ;
         }
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExecutar_Enabled!=0)&&(edtavExecutar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'"+sPrefix+"',false,'"+sGXsfl_18_idx+"',18)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExecutar_Internalname,GXutil.rtrim( AV5Executar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExecutar_Enabled!=0)&&(edtavExecutar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,19);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVEXECUTAR.CLICK."+sGXsfl_18_idx+"'","","","","",edtavExecutar_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavExecutar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavJobidwithtags_Enabled!=0)&&(edtavJobidwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 20,'"+sPrefix+"',false,'"+sGXsfl_18_idx+"',18)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavJobidwithtags_Internalname,AV16JobIdWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavJobidwithtags_Enabled!=0)&&(edtavJobidwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,20);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavJobidwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavJobidwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobId_Internalname,A14423JobId.toString(),A14423JobId.toString(),"","'"+sPrefix+"'"+",false,"+"'"+"e172bz2_client"+"'","","","","",edtJobId_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobDesc_Internalname,A14485JobDesc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtJobDesc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbJobStat.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "JOBSTAT_" + sGXsfl_18_idx ;
            cmbJobStat.setName( GXCCtl );
            cmbJobStat.setWebtags( "" );
            cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
            cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
            cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
            cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
            cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
            if ( cmbJobStat.getItemCount() > 0 )
            {
               A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
               n14450JobStat = false ;
            }
         }
         /* ComboBox */
         ListjobgridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbJobStat,cmbJobStat.getInternalname(),GXutil.rtrim( A14450JobStat),Integer.valueOf(1),cmbJobStat.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","svchar","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), !bGXsfl_18_Refreshing);
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobType_Internalname,A14424JobType,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtJobType_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOkItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14457OkItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOkItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14458ErItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtErItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrcItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14456PrcItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrcItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrgPct_Internalname,GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14459PrgPct), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrgPct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14455TotItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTotItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2BZ2( ) ;
         ListjobgridContainer.AddRow(ListjobgridRow);
         nGXsfl_18_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_18_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_18_idx+1) ;
         sGXsfl_18_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_18_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_182( ) ;
      }
      /* End function sendrow_182 */
   }

   public void startgridcontrol18( )
   {
      if ( ListjobgridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"ListjobgridContainer"+"DivS\" data-gxgridid=\"18\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subListjobgrid_Internalname, subListjobgrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            subListjobgrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subListjobgrid_Class) > 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
            }
         }
         else
         {
            subListjobgrid_Titlebackstyle = (byte)(1) ;
            if ( subListjobgrid_Backcolorstyle == 1 )
            {
               subListjobgrid_Titlebackcolor = subListjobgrid_Allbackcolor ;
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Job", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Job", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Status", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Type", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Success", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Processed", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Progress", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Rows", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            ListjobgridContainer.Clear();
         }
         ListjobgridContainer.SetWrapped(nGXWrapped);
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
         ListjobgridContainer.AddObjectProperty("Header", subListjobgrid_Header);
         ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("CmpContext", sPrefix);
         ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.rtrim( AV5Executar));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExecutar_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", AV16JobIdWithTags);
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavJobidwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14423JobId.toString());
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14485JobDesc);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14450JobStat);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14424JobType);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavExecutar_Internalname = sPrefix+"vEXECUTAR" ;
      edtavJobidwithtags_Internalname = sPrefix+"vJOBIDWITHTAGS" ;
      edtJobId_Internalname = sPrefix+"JOBID" ;
      edtJobDesc_Internalname = sPrefix+"JOBDESC" ;
      cmbJobStat.setInternalname( sPrefix+"JOBSTAT" );
      edtJobType_Internalname = sPrefix+"JOBTYPE" ;
      edtOkItem_Internalname = sPrefix+"OKITEM" ;
      edtErItem_Internalname = sPrefix+"ERITEM" ;
      edtPrcItem_Internalname = sPrefix+"PRCITEM" ;
      edtPrgPct_Internalname = sPrefix+"PRGPCT" ;
      edtTotItem_Internalname = sPrefix+"TOTITEM" ;
      Listjobgridpaginationbar_Internalname = sPrefix+"LISTJOBGRIDPAGINATIONBAR" ;
      divListjobgridtablewithpaginationbar_Internalname = sPrefix+"LISTJOBGRIDTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Popover_jobid_Internalname = sPrefix+"POPOVER_JOBID" ;
      edtavListjobgridcurrentpage_Internalname = sPrefix+"vLISTJOBGRIDCURRENTPAGE" ;
      Listjobgrid_empowerer_Internalname = sPrefix+"LISTJOBGRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subListjobgrid_Internalname = sPrefix+"LISTJOBGRID" ;
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
      subListjobgrid_Allowcollapsing = (byte)(0) ;
      subListjobgrid_Allowselection = (byte)(0) ;
      subListjobgrid_Header = "" ;
      edtTotItem_Jsonclick = "" ;
      edtPrgPct_Jsonclick = "" ;
      edtPrcItem_Jsonclick = "" ;
      edtErItem_Jsonclick = "" ;
      edtOkItem_Jsonclick = "" ;
      edtJobType_Jsonclick = "" ;
      cmbJobStat.setJsonclick( "" );
      edtJobDesc_Jsonclick = "" ;
      edtJobId_Jsonclick = "" ;
      edtavJobidwithtags_Jsonclick = "" ;
      edtavJobidwithtags_Visible = -1 ;
      edtavJobidwithtags_Enabled = 1 ;
      edtavExecutar_Jsonclick = "" ;
      edtavExecutar_Visible = -1 ;
      edtavExecutar_Enabled = 1 ;
      subListjobgrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subListjobgrid_Backcolorstyle = (byte)(0) ;
      edtavListjobgridcurrentpage_Jsonclick = "" ;
      edtavListjobgridcurrentpage_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Listjobgrid_empowerer_Popoversingrid = "Popover_JobId" ;
      Popover_jobid_Position = "Bottom" ;
      Popover_jobid_Popoverwidth = 400 ;
      Popover_jobid_Trigger = "Click" ;
      Popover_jobid_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_jobid_Iteminternalname = "" ;
      Listjobgridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Listjobgridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Listjobgridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Listjobgridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Listjobgridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Listjobgridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Listjobgridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Listjobgridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Listjobgridpaginationbar_Pagingcaptionposition = "Left" ;
      Listjobgridpaginationbar_Pagingbuttonsposition = "Right" ;
      Listjobgridpaginationbar_Pagestoshow = 5 ;
      Listjobgridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Class = "PaginationBar" ;
      subListjobgrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      GXCCtl = "JOBSTAT_" + sGXsfl_18_idx ;
      cmbJobStat.setName( GXCCtl );
      cmbJobStat.setWebtags( "" );
      cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
      cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
      cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
      cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
      cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
      if ( cmbJobStat.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'sPrefix'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("LISTJOBGRID.LOAD","{handler:'e152BZ2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''}]");
      setEventMetadata("LISTJOBGRID.LOAD",",oparms:[{av:'AV5Executar',fld:'vEXECUTAR',pic:''},{av:'AV16JobIdWithTags',fld:'vJOBIDWITHTAGS',pic:''}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112BZ2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'sPrefix'},{av:'Listjobgridpaginationbar_Selectedpage',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV14ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV14ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122BZ2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'sPrefix'},{av:'Listjobgridpaginationbar_Rowsperpageselectedvalue',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV14ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("JOBID.CLICK","{handler:'e172BZ2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''}]");
      setEventMetadata("JOBID.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VEXECUTAR.CLICK","{handler:'e162BZ2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VEXECUTAR.CLICK",",oparms:[{av:'AV11UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A14423JobId',fld:'JOBID',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Totitem',iparms:[]");
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
   public void submit( int submitId ,
                       Object [] submitParms ,
                       ModelContext submitContext )
   {
      UserInformation submitUI = (UserInformation) GXObjectHelper.getUserInformation(context, -1);
      int remoteHandle = submitUI.getHandle();
      try
      {
         switch ( submitId )
         {
               case 1 :
                  new app.asyncbatch.jobrun(remoteHandle, submitContext).execute( (java.util.UUID)submitParms[0], (String)submitParms[1], (String)submitParms[2]) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
         }
      }
      catch ( Exception e )
      {
         Application.cleanupConnection(remoteHandle);
         e.printStackTrace();
      }
   }

   public void initialize( )
   {
      Listjobgridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV10EmprCod = "" ;
      AV11UsurCod = "" ;
      Popover_jobid_Gridinternalname = "" ;
      Listjobgrid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucListjobgridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV19Pgmname = "" ;
      ucPopover_jobid = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucListjobgrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5Executar = "" ;
      AV16JobIdWithTags = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14485JobDesc = "" ;
      A14450JobStat = "" ;
      A14424JobType = "" ;
      scmdbuf = "" ;
      H02BZ2_A14455TotItem = new long[1] ;
      H02BZ2_n14455TotItem = new boolean[] {false} ;
      H02BZ2_A14459PrgPct = new short[1] ;
      H02BZ2_n14459PrgPct = new boolean[] {false} ;
      H02BZ2_A14456PrcItem = new long[1] ;
      H02BZ2_n14456PrcItem = new boolean[] {false} ;
      H02BZ2_A14458ErItem = new long[1] ;
      H02BZ2_n14458ErItem = new boolean[] {false} ;
      H02BZ2_A14457OkItem = new long[1] ;
      H02BZ2_n14457OkItem = new boolean[] {false} ;
      H02BZ2_A14424JobType = new String[] {""} ;
      H02BZ2_n14424JobType = new boolean[] {false} ;
      H02BZ2_A14450JobStat = new String[] {""} ;
      H02BZ2_n14450JobStat = new boolean[] {false} ;
      H02BZ2_A14485JobDesc = new String[] {""} ;
      H02BZ2_n14485JobDesc = new boolean[] {false} ;
      H02BZ2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02BZ3_ALISTJOBGRID_nRecordCount = new long[1] ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      ListjobgridRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subListjobgrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      ListjobgridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.wclistfacturajob__default(),
         new Object[] {
             new Object[] {
            H02BZ2_A14455TotItem, H02BZ2_n14455TotItem, H02BZ2_A14459PrgPct, H02BZ2_n14459PrgPct, H02BZ2_A14456PrcItem, H02BZ2_n14456PrcItem, H02BZ2_A14458ErItem, H02BZ2_n14458ErItem, H02BZ2_A14457OkItem, H02BZ2_n14457OkItem,
            H02BZ2_A14424JobType, H02BZ2_n14424JobType, H02BZ2_A14450JobStat, H02BZ2_n14450JobStat, H02BZ2_A14485JobDesc, H02BZ2_n14485JobDesc, H02BZ2_A14423JobId
            }
            , new Object[] {
            H02BZ3_ALISTJOBGRID_nRecordCount
            }
         }
      );
      AV19Pgmname = "AsyncBatch.WCListFacturaJob" ;
      /* GeneXus formulas. */
      AV19Pgmname = "AsyncBatch.WCListFacturaJob" ;
      Gx_err = (short)(0) ;
      edtavExecutar_Enabled = 0 ;
      edtavJobidwithtags_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte LISTJOBGRID_nEOF ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subListjobgrid_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subListjobgrid_Backstyle ;
   private byte subListjobgrid_Titlebackstyle ;
   private byte subListjobgrid_Allowselection ;
   private byte subListjobgrid_Allowhovering ;
   private byte subListjobgrid_Allowcollapsing ;
   private byte subListjobgrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short A14459PrgPct ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Listjobgridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_18 ;
   private int subListjobgrid_Rows ;
   private int nGXsfl_18_idx=1 ;
   private int Listjobgridpaginationbar_Pagestoshow ;
   private int Popover_jobid_Popoverwidth ;
   private int edtavPgmname_Enabled ;
   private int edtavListjobgridcurrentpage_Visible ;
   private int subListjobgrid_Islastpage ;
   private int edtavExecutar_Enabled ;
   private int edtavJobidwithtags_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV7PageToGo ;
   private int idxLst ;
   private int subListjobgrid_Backcolor ;
   private int subListjobgrid_Allbackcolor ;
   private int edtavExecutar_Visible ;
   private int edtavJobidwithtags_Visible ;
   private int subListjobgrid_Titlebackcolor ;
   private int subListjobgrid_Selectedindex ;
   private int subListjobgrid_Selectioncolor ;
   private int subListjobgrid_Hoveringcolor ;
   private long LISTJOBGRID_nFirstRecordOnPage ;
   private long AV15ListJobGridPageCount ;
   private long AV14ListJobGridCurrentPage ;
   private long A14457OkItem ;
   private long A14458ErItem ;
   private long A14456PrcItem ;
   private long A14455TotItem ;
   private long LISTJOBGRID_nCurrentRecord ;
   private long LISTJOBGRID_nRecordCount ;
   private String Listjobgridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_18_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV10EmprCod ;
   private String AV11UsurCod ;
   private String Listjobgridpaginationbar_Class ;
   private String Listjobgridpaginationbar_Pagingbuttonsposition ;
   private String Listjobgridpaginationbar_Pagingcaptionposition ;
   private String Listjobgridpaginationbar_Emptygridclass ;
   private String Listjobgridpaginationbar_Rowsperpageoptions ;
   private String Listjobgridpaginationbar_Previous ;
   private String Listjobgridpaginationbar_Next ;
   private String Listjobgridpaginationbar_Caption ;
   private String Listjobgridpaginationbar_Emptygridcaption ;
   private String Listjobgridpaginationbar_Rowsperpagecaption ;
   private String Popover_jobid_Gridinternalname ;
   private String Popover_jobid_Iteminternalname ;
   private String Popover_jobid_Trigger ;
   private String Popover_jobid_Position ;
   private String Listjobgrid_empowerer_Gridinternalname ;
   private String Listjobgrid_empowerer_Popoversingrid ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divListjobgridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subListjobgrid_Internalname ;
   private String Listjobgridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV19Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_jobid_Internalname ;
   private String TempTags ;
   private String edtavListjobgridcurrentpage_Internalname ;
   private String edtavListjobgridcurrentpage_Jsonclick ;
   private String Listjobgrid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavExecutar_Internalname ;
   private String AV5Executar ;
   private String edtavJobidwithtags_Internalname ;
   private String edtJobId_Internalname ;
   private String edtJobDesc_Internalname ;
   private String edtJobType_Internalname ;
   private String edtOkItem_Internalname ;
   private String edtErItem_Internalname ;
   private String edtPrcItem_Internalname ;
   private String edtPrgPct_Internalname ;
   private String edtTotItem_Internalname ;
   private String scmdbuf ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String sGXsfl_18_fel_idx="0001" ;
   private String subListjobgrid_Class ;
   private String subListjobgrid_Linesclass ;
   private String ROClassString ;
   private String edtavExecutar_Jsonclick ;
   private String edtavJobidwithtags_Jsonclick ;
   private String edtJobId_Jsonclick ;
   private String edtJobDesc_Jsonclick ;
   private String GXCCtl ;
   private String edtJobType_Jsonclick ;
   private String edtOkItem_Jsonclick ;
   private String edtErItem_Jsonclick ;
   private String edtPrcItem_Jsonclick ;
   private String edtPrgPct_Jsonclick ;
   private String edtTotItem_Jsonclick ;
   private String subListjobgrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Listjobgridpaginationbar_Showfirst ;
   private boolean Listjobgridpaginationbar_Showprevious ;
   private boolean Listjobgridpaginationbar_Shownext ;
   private boolean Listjobgridpaginationbar_Showlast ;
   private boolean Listjobgridpaginationbar_Rowsperpageselector ;
   private boolean Popover_jobid_Isgriditem ;
   private boolean wbLoad ;
   private boolean bGXsfl_18_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14485JobDesc ;
   private boolean n14450JobStat ;
   private boolean n14424JobType ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14456PrcItem ;
   private boolean n14459PrgPct ;
   private boolean n14455TotItem ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV16JobIdWithTags ;
   private String A14485JobDesc ;
   private String A14450JobStat ;
   private String A14424JobType ;
   private java.util.UUID A14423JobId ;
   private com.genexus.webpanels.GXWebGrid ListjobgridContainer ;
   private com.genexus.webpanels.GXWebRow ListjobgridRow ;
   private com.genexus.webpanels.GXWebColumn ListjobgridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.GXUserControl ucListjobgridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucPopover_jobid ;
   private com.genexus.webpanels.GXUserControl ucListjobgrid_empowerer ;
   private HTMLChoice cmbJobStat ;
   private IDataStoreProvider pr_default ;
   private long[] H02BZ2_A14455TotItem ;
   private boolean[] H02BZ2_n14455TotItem ;
   private short[] H02BZ2_A14459PrgPct ;
   private boolean[] H02BZ2_n14459PrgPct ;
   private long[] H02BZ2_A14456PrcItem ;
   private boolean[] H02BZ2_n14456PrcItem ;
   private long[] H02BZ2_A14458ErItem ;
   private boolean[] H02BZ2_n14458ErItem ;
   private long[] H02BZ2_A14457OkItem ;
   private boolean[] H02BZ2_n14457OkItem ;
   private String[] H02BZ2_A14424JobType ;
   private boolean[] H02BZ2_n14424JobType ;
   private String[] H02BZ2_A14450JobStat ;
   private boolean[] H02BZ2_n14450JobStat ;
   private String[] H02BZ2_A14485JobDesc ;
   private boolean[] H02BZ2_n14485JobDesc ;
   private java.util.UUID[] H02BZ2_A14423JobId ;
   private long[] H02BZ3_ALISTJOBGRID_nRecordCount ;
}

final  class wclistfacturajob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BZ2", "SELECT TotItem, PrgPct, PrcItem, ErItem, OkItem, JobType, JobStat, JobDesc, JobId FROM TXPJOB WHERE JobType = 'FACTURA' ORDER BY JobId  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BZ3", "SELECT COUNT(*) FROM TXPJOB WHERE JobType = 'FACTURA' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[16])[0] = rslt.getGUID(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

