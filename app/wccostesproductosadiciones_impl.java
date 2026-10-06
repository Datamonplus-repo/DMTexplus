package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccostesproductosadiciones_impl extends GXWebComponent
{
   public wccostesproductosadiciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccostesproductosadiciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccostesproductosadiciones_impl.class ));
   }

   public wccostesproductosadiciones_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV9Hrebarcod = (int)(GXutil.lval( httpContext.GetPar( "Hrebarcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
               AV6Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
               AV7HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
               AV10HreNumcie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumcie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
               AV8HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV9Hrebarcod),Byte.valueOf(AV6Hrebarreo),AV7HreBarPar,Byte.valueOf(AV10HreNumcie),Short.valueOf(AV8HreLinMaq)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV9Hrebarcod = (int)(GXutil.lval( httpContext.GetPar( "Hrebarcod"))) ;
      AV6Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
      AV7HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV10HreNumcie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumcie"))) ;
      AV8HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      AV65Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paTF2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico de Recetas (Añadidas)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wccostesproductosadiciones", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Hrebarcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Hrebarreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreNumcie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8HreLinMaq,4,0))}, new String[] {"Emprcod","Hrebarcod","Hrebarreo","HreBarPar","HreNumcie","HreLinMaq"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductosadiciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Hrebarcod", GXutil.ltrim( localUtil.ntoc( wcpOAV9Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Hrebarreo", GXutil.ltrim( localUtil.ntoc( wcpOAV6Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HreBarPar", GXutil.rtrim( wcpOAV7HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HreNumcie", GXutil.ltrim( localUtil.ntoc( wcpOAV10HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HreLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV8HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV9Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV6Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV7HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV10HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV8HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormTF2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "WCCostesProductosAdiciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico de Recetas (Añadidas)", "") ;
   }

   public void wbTF0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wccostesproductosadiciones");
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol17( ) ;
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (int)(nGXsfl_17_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV65Pgmname), GXutil.rtrim( localUtil.format( AV65Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCCostesProductosAdiciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 17 )
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

   public void startTF2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico de Recetas (Añadidas)", ""), (short)(0)) ;
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
            strupTF0( ) ;
         }
      }
   }

   public void wsTF2( )
   {
      startTF2( ) ;
      evtTF2( ) ;
   }

   public void evtTF2( )
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
                              strupTF0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTF0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTF0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTF0( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A4510HrdPrdDsc = httpContext.cgiGet( edtHrdPrdDsc_Internalname) ;
                           n4510HrdPrdDsc = false ;
                           A4511HrePrdCFin = localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)) ;
                           n4511HrePrdCFin = false ;
                           A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
                           AV53Costelin = localUtil.ctond( httpContext.cgiGet( edtavCostelin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostelin_Internalname, GXutil.ltrimstr( AV53Costelin, 10, 2));
                           AV45PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV45PrdPreAct, 14, 5));
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
                                       /* Execute user event: Start */
                                       e11TF2 ();
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
                                       /* Execute user event: Refresh */
                                       e12TF2 ();
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
                                       e13TF2 ();
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
                                    strupTF0( ) ;
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

   public void weTF2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormTF2( ) ;
         }
      }
   }

   public void paTF2( )
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
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV9Hrebarcod ,
                                 byte AV6Hrebarreo ,
                                 String AV7HreBarPar ,
                                 byte AV10HreNumcie ,
                                 short AV8HreLinMaq ,
                                 String AV65Pgmname ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e12TF2 ();
      GRID_nCurrentRecord = 0 ;
      rfTF2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductosadiciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
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
      rfTF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV65Pgmname = "WCCostesProductosAdiciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavCostelin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostelin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostelin_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPrdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdpreact_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfTF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e12TF2 ();
      nGXsfl_17_idx = 1 ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_172( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H00TF2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV9Hrebarcod), Byte.valueOf(AV6Hrebarreo), AV7HreBarPar, Byte.valueOf(AV10HreNumcie), Short.valueOf(AV8HreLinMaq), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_17_idx = 1 ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4492HreBarCod = H00TF2_A4492HreBarCod[0] ;
            A4493HreBarReo = H00TF2_A4493HreBarReo[0] ;
            A4494HreBarPar = H00TF2_A4494HreBarPar[0] ;
            A4495HreNumCie = H00TF2_A4495HreNumCie[0] ;
            A4508HreLinMAL = H00TF2_A4508HreLinMAL[0] ;
            A396EmprCod = H00TF2_A396EmprCod[0] ;
            A707PrdFacCon = H00TF2_A707PrdFacCon[0] ;
            A4511HrePrdCFin = H00TF2_A4511HrePrdCFin[0] ;
            n4511HrePrdCFin = H00TF2_n4511HrePrdCFin[0] ;
            A4510HrdPrdDsc = H00TF2_A4510HrdPrdDsc[0] ;
            n4510HrdPrdDsc = H00TF2_n4510HrdPrdDsc[0] ;
            A719PrdNum = H00TF2_A719PrdNum[0] ;
            A707PrdFacCon = H00TF2_A707PrdFacCon[0] ;
            e13TF2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(17) ;
         wbTF0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesTF2( )
   {
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
      /* Using cursor H00TF3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV9Hrebarcod), Byte.valueOf(AV6Hrebarreo), AV7HreBarPar, Byte.valueOf(AV10HreNumcie), Short.valueOf(AV8HreLinMaq)});
      GRID_nRecordCount = H00TF3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9Hrebarcod, AV6Hrebarreo, AV7HreBarPar, AV10HreNumcie, AV8HreLinMaq, AV65Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV65Pgmname = "WCCostesProductosAdiciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavCostelin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostelin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostelin_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPrdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdpreact_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupTF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11TF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV9Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Hrebarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV7HreBarPar") ;
         wcpOAV10HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreNumcie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones");
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wccostesproductosadiciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e11TF2 ();
      if (returnInSub) return;
   }

   public void e11TF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV59BarNHdr = GXutil.trim( GXutil.str( AV9Hrebarcod, 8, 0)) + "-" + GXutil.str( AV6Hrebarreo, 1, 0) + AV7HreBarPar + " # " + GXutil.trim( GXutil.str( AV10HreNumcie, 2, 0)) + " ## " + GXutil.trim( GXutil.str( AV8HreLinMaq, 4, 0)) ;
      GXt_char1 = AV60Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccostesproductosadiciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV60Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV61EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccostesproductosadiciones_impl.this.AV5Emprcod = GXv_char2[0] ;
      wccostesproductosadiciones_impl.this.AV61EmprNom = GXv_char3[0] ;
      wccostesproductosadiciones_impl.this.AV62UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e12TF2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV12WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
   }

   private void e13TF2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_decimal6 = AV45PrdPreAct ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_int7[0] = AV9Hrebarcod ;
      GXv_int8[0] = AV6Hrebarreo ;
      GXv_char3[0] = AV7HreBarPar ;
      GXv_int9[0] = AV10HreNumcie ;
      GXv_int10[0] = AV8HreLinMaq ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal11[0] = GXt_decimal6 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int9, GXv_int10, GXv_char2, GXv_decimal11) ;
      wccostesproductosadiciones_impl.this.AV5Emprcod = GXv_char4[0] ;
      wccostesproductosadiciones_impl.this.AV9Hrebarcod = GXv_int7[0] ;
      wccostesproductosadiciones_impl.this.AV6Hrebarreo = GXv_int8[0] ;
      wccostesproductosadiciones_impl.this.AV7HreBarPar = GXv_char3[0] ;
      wccostesproductosadiciones_impl.this.AV10HreNumcie = GXv_int9[0] ;
      wccostesproductosadiciones_impl.this.AV8HreLinMaq = GXv_int10[0] ;
      wccostesproductosadiciones_impl.this.A719PrdNum = GXv_char2[0] ;
      wccostesproductosadiciones_impl.this.GXt_decimal6 = GXv_decimal11[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
      AV45PrdPreAct = GXt_decimal6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV45PrdPreAct, 14, 5));
      AV53Costelin = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(AV45PrdPreAct).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostelin_Internalname, GXutil.ltrimstr( AV53Costelin, 10, 2));
      GXt_decimal6 = AV45PrdPreAct ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_int7[0] = AV9Hrebarcod ;
      GXv_int9[0] = AV6Hrebarreo ;
      GXv_char3[0] = AV7HreBarPar ;
      GXv_int8[0] = AV10HreNumcie ;
      GXv_int10[0] = AV8HreLinMaq ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal11[0] = GXt_decimal6 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int9, GXv_char3, GXv_int8, GXv_int10, GXv_char2, GXv_decimal11) ;
      wccostesproductosadiciones_impl.this.AV5Emprcod = GXv_char4[0] ;
      wccostesproductosadiciones_impl.this.AV9Hrebarcod = GXv_int7[0] ;
      wccostesproductosadiciones_impl.this.AV6Hrebarreo = GXv_int9[0] ;
      wccostesproductosadiciones_impl.this.AV7HreBarPar = GXv_char3[0] ;
      wccostesproductosadiciones_impl.this.AV10HreNumcie = GXv_int8[0] ;
      wccostesproductosadiciones_impl.this.AV8HreLinMaq = GXv_int10[0] ;
      wccostesproductosadiciones_impl.this.A719PrdNum = GXv_char2[0] ;
      wccostesproductosadiciones_impl.this.GXt_decimal6 = GXv_decimal11[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
      AV45PrdPreAct = GXt_decimal6 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV45PrdPreAct, 14, 5));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(17) ;
      }
      sendrow_172( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
      {
         httpContext.doAjaxLoad(17, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV65Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV65Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV27Session.getValue(AV65Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV27Session.getValue(AV65Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV65Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREA" );
      AV27Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV9Hrebarcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
      AV6Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
      AV7HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
      AV10HreNumcie = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
      AV8HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
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
      paTF2( ) ;
      wsTF2( ) ;
      weTF2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV9Hrebarcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6Hrebarreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10HreNumcie = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV8HreLinMaq = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paTF2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wccostesproductosadiciones", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paTF2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV9Hrebarcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
         AV6Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
         AV7HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
         AV10HreNumcie = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
         AV8HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV9Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Hrebarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV7HreBarPar") ;
      wcpOAV10HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreNumcie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV9Hrebarcod != wcpOAV9Hrebarcod ) || ( AV6Hrebarreo != wcpOAV6Hrebarreo ) || ( GXutil.strcmp(AV7HreBarPar, wcpOAV7HreBarPar) != 0 ) || ( AV10HreNumcie != wcpOAV10HreNumcie ) || ( AV8HreLinMaq != wcpOAV8HreLinMaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV9Hrebarcod = AV9Hrebarcod ;
      wcpOAV6Hrebarreo = AV6Hrebarreo ;
      wcpOAV7HreBarPar = AV7HreBarPar ;
      wcpOAV10HreNumcie = AV10HreNumcie ;
      wcpOAV8HreLinMaq = AV8HreLinMaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV9Hrebarcod = httpContext.cgiGet( sPrefix+"AV9Hrebarcod_CTRL") ;
      if ( GXutil.len( sCtrlAV9Hrebarcod) > 0 )
      {
         AV9Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Hrebarcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Hrebarcod), 8, 0));
      }
      else
      {
         AV9Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Hrebarcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6Hrebarreo = httpContext.cgiGet( sPrefix+"AV6Hrebarreo_CTRL") ;
      if ( GXutil.len( sCtrlAV6Hrebarreo) > 0 )
      {
         AV6Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Hrebarreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Hrebarreo", GXutil.str( AV6Hrebarreo, 1, 0));
      }
      else
      {
         AV6Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Hrebarreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7HreBarPar = httpContext.cgiGet( sPrefix+"AV7HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV7HreBarPar) > 0 )
      {
         AV7HreBarPar = httpContext.cgiGet( sCtrlAV7HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarPar", AV7HreBarPar);
      }
      else
      {
         AV7HreBarPar = httpContext.cgiGet( sPrefix+"AV7HreBarPar_PARM") ;
      }
      sCtrlAV10HreNumcie = httpContext.cgiGet( sPrefix+"AV10HreNumcie_CTRL") ;
      if ( GXutil.len( sCtrlAV10HreNumcie) > 0 )
      {
         AV10HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10HreNumcie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumcie), 2, 0));
      }
      else
      {
         AV10HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10HreNumcie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8HreLinMaq = httpContext.cgiGet( sPrefix+"AV8HreLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV8HreLinMaq) > 0 )
      {
         AV8HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8HreLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreLinMaq), 4, 0));
      }
      else
      {
         AV8HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8HreLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paTF2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsTF2( ) ;
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
      wsTF2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Hrebarcod_PARM", GXutil.ltrim( localUtil.ntoc( AV9Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Hrebarcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Hrebarcod_CTRL", GXutil.rtrim( sCtrlAV9Hrebarcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Hrebarreo_PARM", GXutil.ltrim( localUtil.ntoc( AV6Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Hrebarreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Hrebarreo_CTRL", GXutil.rtrim( sCtrlAV6Hrebarreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarPar_PARM", GXutil.rtrim( AV7HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarPar_CTRL", GXutil.rtrim( sCtrlAV7HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreNumcie_PARM", GXutil.ltrim( localUtil.ntoc( AV10HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HreNumcie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreNumcie_CTRL", GXutil.rtrim( sCtrlAV10HreNumcie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV8HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HreLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreLinMaq_CTRL", GXutil.rtrim( sCtrlAV8HreLinMaq));
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
      weTF2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564214", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("wccostesproductosadiciones.js", "?202682115564214", false, true);
         httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_17_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_17_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_17_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_17_idx ;
      edtavCostelin_Internalname = sPrefix+"vCOSTELIN_"+sGXsfl_17_idx ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_17_fel_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_17_fel_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_17_fel_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_17_fel_idx ;
      edtavCostelin_Internalname = sPrefix+"vCOSTELIN_"+sGXsfl_17_fel_idx ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wbTF0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_17_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColum","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrdPrdDsc_Internalname,GXutil.rtrim( A4510HrdPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrdPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColum","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdCFin_Internalname,GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdCFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostelin_Internalname,GXutil.ltrim( localUtil.ntoc( AV53Costelin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostelin_Enabled!=0) ? localUtil.format( AV53Costelin, "ZZZZZZ9.99") : localUtil.format( AV53Costelin, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostelin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCostelin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdpreact_Internalname,GXutil.ltrim( localUtil.ntoc( AV45PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdpreact_Enabled!=0) ? localUtil.format( AV45PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( AV45PrdPreAct, "ZZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdpreact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrdpreact_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesTF2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      /* End function sendrow_172 */
   }

   public void startgridcontrol17( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"17\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor de Conversion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4510HrdPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53Costelin, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostelin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdpreact_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC" ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN" ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      edtavCostelin_Internalname = sPrefix+"vCOSTELIN" ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      edtavPrdpreact_Jsonclick = "" ;
      edtavPrdpreact_Enabled = 0 ;
      edtavCostelin_Jsonclick = "" ;
      edtavCostelin_Enabled = 0 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtHrePrdCFin_Jsonclick = "" ;
      edtHrdPrdDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e13TF2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4511HrePrdCFin',fld:'HREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV45PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV53Costelin',fld:'vCOSTELIN',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV7HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Prdpreact',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV7HreBarPar = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV7HreBarPar = "" ;
      AV65Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV53Costelin = DecimalUtil.ZERO ;
      AV45PrdPreAct = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H00TF2_A4509HreNumAny = new byte[1] ;
      H00TF2_A4492HreBarCod = new int[1] ;
      H00TF2_A4493HreBarReo = new byte[1] ;
      H00TF2_A4494HreBarPar = new String[] {""} ;
      H00TF2_A4495HreNumCie = new byte[1] ;
      H00TF2_A4508HreLinMAL = new short[1] ;
      H00TF2_A396EmprCod = new String[] {""} ;
      H00TF2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TF2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TF2_n4511HrePrdCFin = new boolean[] {false} ;
      H00TF2_A4510HrdPrdDsc = new String[] {""} ;
      H00TF2_n4510HrdPrdDsc = new boolean[] {false} ;
      H00TF2_A719PrdNum = new String[] {""} ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      H00TF3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV59BarNHdr = "" ;
      AV60Station = "" ;
      GXt_char1 = "" ;
      AV61EmprNom = "" ;
      AV62UsurCod = "" ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_decimal6 = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int10 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV9Hrebarcod = "" ;
      sCtrlAV6Hrebarreo = "" ;
      sCtrlAV7HreBarPar = "" ;
      sCtrlAV10HreNumcie = "" ;
      sCtrlAV8HreLinMaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductosadiciones__default(),
         new Object[] {
             new Object[] {
            H00TF2_A4509HreNumAny, H00TF2_A4492HreBarCod, H00TF2_A4493HreBarReo, H00TF2_A4494HreBarPar, H00TF2_A4495HreNumCie, H00TF2_A4508HreLinMAL, H00TF2_A396EmprCod, H00TF2_A707PrdFacCon, H00TF2_A4511HrePrdCFin, H00TF2_n4511HrePrdCFin,
            H00TF2_A4510HrdPrdDsc, H00TF2_n4510HrdPrdDsc, H00TF2_A719PrdNum
            }
            , new Object[] {
            H00TF3_AGRID_nRecordCount
            }
         }
      );
      AV65Pgmname = "WCCostesProductosAdiciones" ;
      /* GeneXus formulas. */
      AV65Pgmname = "WCCostesProductosAdiciones" ;
      Gx_err = (short)(0) ;
      edtavCostelin_Enabled = 0 ;
      edtavPrdpreact_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV6Hrebarreo ;
   private byte wcpOAV10HreNumcie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV6Hrebarreo ;
   private byte AV10HreNumcie ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV8HreLinMaq ;
   private short AV8HreLinMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4508HreLinMAL ;
   private short GXv_int10[] ;
   private int wcpOAV9Hrebarcod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_17 ;
   private int AV9Hrebarcod ;
   private int nGXsfl_17_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavCostelin_Enabled ;
   private int edtavPrdpreact_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A4492HreBarCod ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV53Costelin ;
   private java.math.BigDecimal AV45PrdPreAct ;
   private java.math.BigDecimal GXt_decimal6 ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV7HreBarPar ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV7HreBarPar ;
   private String sGXsfl_17_idx="0001" ;
   private String AV65Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A4510HrdPrdDsc ;
   private String edtHrdPrdDsc_Internalname ;
   private String edtHrePrdCFin_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtavCostelin_Internalname ;
   private String edtavPrdpreact_Internalname ;
   private String scmdbuf ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV59BarNHdr ;
   private String AV60Station ;
   private String GXt_char1 ;
   private String AV61EmprNom ;
   private String AV62UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV9Hrebarcod ;
   private String sCtrlAV6Hrebarreo ;
   private String sCtrlAV7HreBarPar ;
   private String sCtrlAV10HreNumcie ;
   private String sCtrlAV8HreLinMaq ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtHrdPrdDsc_Jsonclick ;
   private String edtHrePrdCFin_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtavCostelin_Jsonclick ;
   private String edtavPrdpreact_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H00TF2_A4509HreNumAny ;
   private int[] H00TF2_A4492HreBarCod ;
   private byte[] H00TF2_A4493HreBarReo ;
   private String[] H00TF2_A4494HreBarPar ;
   private byte[] H00TF2_A4495HreNumCie ;
   private short[] H00TF2_A4508HreLinMAL ;
   private String[] H00TF2_A396EmprCod ;
   private java.math.BigDecimal[] H00TF2_A707PrdFacCon ;
   private java.math.BigDecimal[] H00TF2_A4511HrePrdCFin ;
   private boolean[] H00TF2_n4511HrePrdCFin ;
   private String[] H00TF2_A4510HrdPrdDsc ;
   private boolean[] H00TF2_n4510HrdPrdDsc ;
   private String[] H00TF2_A719PrdNum ;
   private long[] H00TF3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
}

final  class wccostesproductosadiciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00TF2", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  T1.HreNumAny, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.EmprCod, T2.PrdFacCon, T1.HrePrdCFin, T1.HrdPrdDsc, T1.PrdNum FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.HreBarCod = ?) AND (T1.HreBarReo = ?) AND (T1.HreBarPar = ?) AND (T1.HreNumCie = ?) AND (T1.HreLinMAL = ?) ORDER BY T1.EmprCod, T1.PrdNum) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TF3", "SELECT COUNT(*) FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.HreBarCod = ?) AND (T1.HreBarReo = ?) AND (T1.HreBarPar = ?) AND (T1.HreNumCie = ?) AND (T1.HreLinMAL = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

