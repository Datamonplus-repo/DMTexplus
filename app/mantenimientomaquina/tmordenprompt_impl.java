package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordenprompt_impl extends GXDataArea
{
   public tmordenprompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordenprompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenprompt_impl.class ));
   }

   public tmordenprompt_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV32InOutEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32InOutEmprCod", AV32InOutEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8InOutOMCod = (int)(GXutil.lval( httpContext.GetPar( "InOutOMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8InOutOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8InOutOMCod), 8, 0));
               AV9InOutOMMaqCodFor = httpContext.GetPar( "InOutOMMaqCodFor") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9InOutOMMaqCodFor", AV9InOutOMMaqCodFor);
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_24 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_24"))) ;
      nGXsfl_24_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_24_idx"))) ;
      sGXsfl_24_idx = httpContext.GetPar( "sGXsfl_24_idx") ;
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
      AV13FilterFullText = httpContext.GetPar( "FilterFullText") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      paYP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startYP2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmordenprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8InOutOMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9InOutOMMaqCodFor))}, new String[] {"InOutEmprCod","InOutOMCod","InOutOMMaqCodFor"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV13FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_24", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_24, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV16GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV17GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV14DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV14DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV11OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV32InOutEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTOMCOD", GXutil.ltrim( localUtil.ntoc( AV8InOutOMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTOMMAQCODFOR", GXutil.rtrim( AV9InOutOMMaqCodFor));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weYP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtYP2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.mantenimientomaquina.tmordenprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8InOutOMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9InOutOMMaqCodFor))}, new String[] {"InOutEmprCod","InOutOMCod","InOutOMMaqCodFor"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMOrdenPrompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Ordenes de Mantenimiento", "") ;
   }

   public void wbYP0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         wb_table1_12_YP2( true) ;
      }
      else
      {
         wb_table1_12_YP2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_YP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol24( ) ;
      }
      if ( wbEnd == 24 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_24 = (int)(nGXsfl_24_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV16GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV17GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV35Pgmname), GXutil.rtrim( localUtil.format( AV35Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdenPrompt.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV14DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 24 )
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
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startYP2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Ordenes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupYP0( ) ;
   }

   public void wsYP2( )
   {
      startYP2( ) ;
      evtYP2( ) ;
   }

   public void evtYP2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e14YP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_24_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_242( ) ;
                           AV18Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV18Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
                           A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
                           n13679OMMaqCodFo = false ;
                           A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
                           n9427OMMaqDsc = false ;
                           A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
                           n13678OMDscMqPla = false ;
                           A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9428SMCod = false ;
                           A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9429PMCod = false ;
                           A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
                           A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
                           A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
                           A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
                           cmbOMEst.setName( cmbOMEst.getInternalname() );
                           cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
                           A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
                           A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
                           A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
                           A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
                           A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
                           A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
                           A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
                           A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
                           A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e15YP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e16YP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e17YP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV13FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e18YP2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void weYP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paYP2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_242( ) ;
      while ( nGXsfl_24_idx <= nRC_GXsfl_24 )
      {
         sendrow_242( ) ;
         nGXsfl_24_idx = ((subGrid_Islastpage==1)&&(nGXsfl_24_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV13FilterFullText )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e16YP2 ();
      GRID_nCurrentRecord = 0 ;
      rfYP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_OMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMCOD", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")));
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
      rfYP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV35Pgmname = "MantenimientoMaquina.TMOrdenPrompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV11OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV13FilterFullText ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9426OMMaqCod ,
                                           A13679OMMaqCodFo ,
                                           A9427OMMaqDsc ,
                                           A13678OMDscMqPla ,
                                           Integer.valueOf(A9428SMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9433OMTxt ,
                                           A9437OMUsuCre ,
                                           A9445OMEst ,
                                           A9464OMNot ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      /* Using cursor H00YP7 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9439OMFchCer = H00YP7_A9439OMFchCer[0] ;
         A9464OMNot = H00YP7_A9464OMNot[0] ;
         A9437OMUsuCre = H00YP7_A9437OMUsuCre[0] ;
         A9436OMFchCre = H00YP7_A9436OMFchCre[0] ;
         A9438OMFchPre = H00YP7_A9438OMFchPre[0] ;
         A9433OMTxt = H00YP7_A9433OMTxt[0] ;
         A9429PMCod = H00YP7_A9429PMCod[0] ;
         n9429PMCod = H00YP7_n9429PMCod[0] ;
         A9428SMCod = H00YP7_A9428SMCod[0] ;
         n9428SMCod = H00YP7_n9428SMCod[0] ;
         A9427OMMaqDsc = H00YP7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YP7_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = H00YP7_A9426OMMaqCod[0] ;
         A9425OMCod = H00YP7_A9425OMCod[0] ;
         A407EmprNom = H00YP7_A407EmprNom[0] ;
         n407EmprNom = H00YP7_n407EmprNom[0] ;
         A396EmprCod = H00YP7_A396EmprCod[0] ;
         A13678OMDscMqPla = H00YP7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YP7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YP7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YP7_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = H00YP7_A9441OMMCCosT[0] ;
         A9443OMRCCosT = H00YP7_A9443OMRCCosT[0] ;
         A9445OMEst = H00YP7_A9445OMEst[0] ;
         A9442OMMRCosT = H00YP7_A9442OMMRCosT[0] ;
         A9444OMRRCosT = H00YP7_A9444OMRRCosT[0] ;
         A407EmprNom = H00YP7_A407EmprNom[0] ;
         n407EmprNom = H00YP7_n407EmprNom[0] ;
         A9427OMMaqDsc = H00YP7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YP7_n9427OMMaqDsc[0] ;
         A9441OMMCCosT = H00YP7_A9441OMMCCosT[0] ;
         A9442OMMRCosT = H00YP7_A9442OMMRCosT[0] ;
         A9443OMRCCosT = H00YP7_A9443OMRCCosT[0] ;
         A9444OMRRCosT = H00YP7_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = H00YP7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YP7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YP7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YP7_n13679OMMaqCodFo[0] ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
         }
         else
         {
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
            {
               A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
            }
            else
            {
               A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (GXutil.strcmp("", AV13FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV13FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "realizada", "") , GXutil.padr( "%" + GXutil.lower( AV13FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "R") == 0 ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfYP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(24) ;
      /* Execute user event: Refresh */
      e16YP2 ();
      nGXsfl_24_idx = 1 ;
      sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_242( ) ;
      bGXsfl_24_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_242( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV11OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV13FilterFullText ,
                                              Integer.valueOf(A9425OMCod) ,
                                              A9426OMMaqCod ,
                                              A13679OMMaqCodFo ,
                                              A9427OMMaqDsc ,
                                              A13678OMDscMqPla ,
                                              Integer.valueOf(A9428SMCod) ,
                                              Integer.valueOf(A9429PMCod) ,
                                              A9433OMTxt ,
                                              A9437OMUsuCre ,
                                              A9445OMEst ,
                                              A9464OMNot ,
                                              A13680OMDuracion ,
                                              A9440OMCosRea ,
                                              A9444OMRRCosT ,
                                              A9443OMRCCosT ,
                                              A9442OMMRCosT ,
                                              A9441OMMCCosT } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                              }
         });
         /* Using cursor H00YP13 */
         pr_default.execute(1);
         nGXsfl_24_idx = 1 ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9439OMFchCer = H00YP13_A9439OMFchCer[0] ;
            A9464OMNot = H00YP13_A9464OMNot[0] ;
            A9437OMUsuCre = H00YP13_A9437OMUsuCre[0] ;
            A9436OMFchCre = H00YP13_A9436OMFchCre[0] ;
            A9438OMFchPre = H00YP13_A9438OMFchPre[0] ;
            A9433OMTxt = H00YP13_A9433OMTxt[0] ;
            A9429PMCod = H00YP13_A9429PMCod[0] ;
            n9429PMCod = H00YP13_n9429PMCod[0] ;
            A9428SMCod = H00YP13_A9428SMCod[0] ;
            n9428SMCod = H00YP13_n9428SMCod[0] ;
            A9427OMMaqDsc = H00YP13_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H00YP13_n9427OMMaqDsc[0] ;
            A9426OMMaqCod = H00YP13_A9426OMMaqCod[0] ;
            A9425OMCod = H00YP13_A9425OMCod[0] ;
            A407EmprNom = H00YP13_A407EmprNom[0] ;
            n407EmprNom = H00YP13_n407EmprNom[0] ;
            A396EmprCod = H00YP13_A396EmprCod[0] ;
            A13678OMDscMqPla = H00YP13_A13678OMDscMqPla[0] ;
            n13678OMDscMqPla = H00YP13_n13678OMDscMqPla[0] ;
            A13679OMMaqCodFo = H00YP13_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H00YP13_n13679OMMaqCodFo[0] ;
            A9441OMMCCosT = H00YP13_A9441OMMCCosT[0] ;
            A9443OMRCCosT = H00YP13_A9443OMRCCosT[0] ;
            A9445OMEst = H00YP13_A9445OMEst[0] ;
            A9442OMMRCosT = H00YP13_A9442OMMRCosT[0] ;
            A9444OMRRCosT = H00YP13_A9444OMRRCosT[0] ;
            A407EmprNom = H00YP13_A407EmprNom[0] ;
            n407EmprNom = H00YP13_n407EmprNom[0] ;
            A9427OMMaqDsc = H00YP13_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H00YP13_n9427OMMaqDsc[0] ;
            A9441OMMCCosT = H00YP13_A9441OMMCCosT[0] ;
            A9442OMMRCosT = H00YP13_A9442OMMRCosT[0] ;
            A9443OMRCCosT = H00YP13_A9443OMRCCosT[0] ;
            A9444OMRRCosT = H00YP13_A9444OMRRCosT[0] ;
            A13678OMDscMqPla = H00YP13_A13678OMDscMqPla[0] ;
            n13678OMDscMqPla = H00YP13_n13678OMDscMqPla[0] ;
            A13679OMMaqCodFo = H00YP13_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H00YP13_n13679OMMaqCodFo[0] ;
            if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
            {
               A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
            }
            else
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
               {
                  A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
               }
               else
               {
                  A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
               }
            }
            if ( (GXutil.strcmp("", AV13FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV13FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "realizada", "") , GXutil.padr( "%" + GXutil.lower( AV13FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "R") == 0 ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV13FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV13FilterFullText , 254 , "%"),  ' ' ) ) ) )
            {
               e17YP2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(24) ;
         wbYP0( ) ;
      }
      bGXsfl_24_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesYP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_OMCOD"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV35Pgmname = "MantenimientoMaquina.TMOrdenPrompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
      fix_multi_value_controls( ) ;
   }

   public void strupYP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e15YP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV14DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_24 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_24"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV16GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV17GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         /* Read variables values. */
         AV13FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13FilterFullText", AV13FilterFullText);
         AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV13FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e15YP2 ();
      if (returnInSub) return;
   }

   public void e15YP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordenprompt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      GXv_char2[0] = AV37Emprcod ;
      GXv_char3[0] = AV38Emprnom ;
      GXv_char4[0] = AV39Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordenprompt_impl.this.AV37Emprcod = GXv_char2[0] ;
      tmordenprompt_impl.this.AV38Emprnom = GXv_char3[0] ;
      tmordenprompt_impl.this.AV39Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Ordenes de Mantenimiento", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV11OrderedBy < 1 )
      {
         AV11OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV14DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV14DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e16YP2( )
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
      AV16GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
      AV17GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e11YP2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV15PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV15PageToGo) ;
      }
   }

   public void e12YP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13YP2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV11OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e17YP2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV18Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV18Select);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(24) ;
         }
         sendrow_242( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_24_Refreshing )
      {
         httpContext.doAjaxLoad(24, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e18YP2 ();
      if (returnInSub) return;
   }

   public void e18YP2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV32InOutEmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32InOutEmprCod", AV32InOutEmprCod);
      AV8InOutOMCod = A9425OMCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InOutOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8InOutOMCod), 8, 0));
      AV9InOutOMMaqCodFor = A13679OMMaqCodFo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9InOutOMMaqCodFor", AV9InOutOMMaqCodFor);
      httpContext.setWebReturnParms(new Object[] {AV32InOutEmprCod,Integer.valueOf(AV8InOutOMCod),AV9InOutOMMaqCodFor});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV32InOutEmprCod","AV8InOutOMCod","AV9InOutOMMaqCodFor"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e14YP2( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S122 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV11OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV13FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13FilterFullText", AV13FilterFullText);
   }

   public void wb_table1_12_YP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_MantenimientoMaquina\\TMOrdenPrompt.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV13FilterFullText, GXutil.rtrim( localUtil.format( AV13FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdenPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_YP2e( true) ;
      }
      else
      {
         wb_table1_12_YP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV32InOutEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32InOutEmprCod", AV32InOutEmprCod);
      AV8InOutOMCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InOutOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8InOutOMCod), 8, 0));
      AV9InOutOMMaqCodFor = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9InOutOMMaqCodFor", AV9InOutOMMaqCodFor);
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
      paYP2( ) ;
      wsYP2( ) ;
      weYP2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513887", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("mantenimientomaquina/tmordenprompt.js", "?20268241513887", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_24_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_24_idx ;
      edtOMCod_Internalname = "OMCOD_"+sGXsfl_24_idx ;
      edtOMMaqCod_Internalname = "OMMAQCOD_"+sGXsfl_24_idx ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO_"+sGXsfl_24_idx ;
      edtOMMaqDsc_Internalname = "OMMAQDSC_"+sGXsfl_24_idx ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA_"+sGXsfl_24_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_24_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_24_idx ;
      edtOMTxt_Internalname = "OMTXT_"+sGXsfl_24_idx ;
      edtOMFchPre_Internalname = "OMFCHPRE_"+sGXsfl_24_idx ;
      edtOMFchCre_Internalname = "OMFCHCRE_"+sGXsfl_24_idx ;
      edtOMUsuCre_Internalname = "OMUSUCRE_"+sGXsfl_24_idx ;
      cmbOMEst.setInternalname( "OMEST_"+sGXsfl_24_idx );
      edtOMNot_Internalname = "OMNOT_"+sGXsfl_24_idx ;
      edtOMFchCer_Internalname = "OMFCHCER_"+sGXsfl_24_idx ;
      edtOMDuracion_Internalname = "OMDURACION_"+sGXsfl_24_idx ;
      edtOMCosRea_Internalname = "OMCOSREA_"+sGXsfl_24_idx ;
      edtOMRRCosT_Internalname = "OMRRCOST_"+sGXsfl_24_idx ;
      edtOMRCCosT_Internalname = "OMRCCOST_"+sGXsfl_24_idx ;
      edtOMMRCosT_Internalname = "OMMRCOST_"+sGXsfl_24_idx ;
      edtOMMCCosT_Internalname = "OMMCCOST_"+sGXsfl_24_idx ;
   }

   public void subsflControlProps_fel_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_24_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_24_fel_idx ;
      edtOMCod_Internalname = "OMCOD_"+sGXsfl_24_fel_idx ;
      edtOMMaqCod_Internalname = "OMMAQCOD_"+sGXsfl_24_fel_idx ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO_"+sGXsfl_24_fel_idx ;
      edtOMMaqDsc_Internalname = "OMMAQDSC_"+sGXsfl_24_fel_idx ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA_"+sGXsfl_24_fel_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_24_fel_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_24_fel_idx ;
      edtOMTxt_Internalname = "OMTXT_"+sGXsfl_24_fel_idx ;
      edtOMFchPre_Internalname = "OMFCHPRE_"+sGXsfl_24_fel_idx ;
      edtOMFchCre_Internalname = "OMFCHCRE_"+sGXsfl_24_fel_idx ;
      edtOMUsuCre_Internalname = "OMUSUCRE_"+sGXsfl_24_fel_idx ;
      cmbOMEst.setInternalname( "OMEST_"+sGXsfl_24_fel_idx );
      edtOMNot_Internalname = "OMNOT_"+sGXsfl_24_fel_idx ;
      edtOMFchCer_Internalname = "OMFCHCER_"+sGXsfl_24_fel_idx ;
      edtOMDuracion_Internalname = "OMDURACION_"+sGXsfl_24_fel_idx ;
      edtOMCosRea_Internalname = "OMCOSREA_"+sGXsfl_24_fel_idx ;
      edtOMRRCosT_Internalname = "OMRRCOST_"+sGXsfl_24_fel_idx ;
      edtOMRCCosT_Internalname = "OMRCCOST_"+sGXsfl_24_fel_idx ;
      edtOMMRCosT_Internalname = "OMMRCOST_"+sGXsfl_24_fel_idx ;
      edtOMMCCosT_Internalname = "OMMCCOST_"+sGXsfl_24_fel_idx ;
   }

   public void sendrow_242( )
   {
      subsflControlProps_242( ) ;
      wbYP0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_24_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_24_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_24_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 25,'',false,'"+sGXsfl_24_idx+"',24)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV18Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_24_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqCod_Internalname,GXutil.rtrim( A9426OMMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqCodFo_Internalname,GXutil.rtrim( A13679OMMaqCodFo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqCodFo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqDsc_Internalname,GXutil.rtrim( A9427OMMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMDscMqPla_Internalname,GXutil.rtrim( A13678OMDscMqPla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMDscMqPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMTxt_Internalname,A9433OMTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchPre_Internalname,localUtil.format(A9438OMFchPre, "99/99/99"),localUtil.format( A9438OMFchPre, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchCre_Internalname,localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9436OMFchCre, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMUsuCre_Internalname,GXutil.rtrim( A9437OMUsuCre),GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMUsuCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbOMEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "OMEST_" + sGXsfl_24_idx ;
            cmbOMEst.setName( GXCCtl );
            cmbOMEst.setWebtags( "" );
            cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
            if ( cmbOMEst.getItemCount() > 0 )
            {
               A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMEst,cmbOMEst.getInternalname(),GXutil.rtrim( A9445OMEst),Integer.valueOf(1),cmbOMEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), !bGXsfl_24_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMNot_Internalname,A9464OMNot,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMNot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchCer_Internalname,localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9439OMFchCer, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchCer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMDuracion_Internalname,A13680OMDuracion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMDuracion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMCosRea_Internalname,GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMCosRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesYP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_24_idx = ((subGrid_Islastpage==1)&&(nGXsfl_24_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
      }
      /* End function sendrow_242 */
   }

   public void startgridcontrol24( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"24\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod de Orden de Mantto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Maquina Orden de Mantto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod For", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc Maquina Ord Mantto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mq Planificar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod de Solicitud de Mantto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod de Preventivo de Mantto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc del Trabajo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Prevista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha de Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario que Crea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nota", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Duracion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Reserva Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Consumo Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Reserva Mano Obra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Consumo Mano Obra", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9426OMMaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13679OMMaqCodFo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9427OMMaqDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13678OMDscMqPla));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9433OMTxt);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9438OMFchPre, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9437OMUsuCre));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9445OMEst));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9464OMNot);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13680OMDuracion);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
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
      lblCleanfilters_Internalname = "CLEANFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtOMCod_Internalname = "OMCOD" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA" ;
      edtSMCod_Internalname = "SMCOD" ;
      edtPMCod_Internalname = "PMCOD" ;
      edtOMTxt_Internalname = "OMTXT" ;
      edtOMFchPre_Internalname = "OMFCHPRE" ;
      edtOMFchCre_Internalname = "OMFCHCRE" ;
      edtOMUsuCre_Internalname = "OMUSUCRE" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtOMNot_Internalname = "OMNOT" ;
      edtOMFchCer_Internalname = "OMFCHCER" ;
      edtOMDuracion_Internalname = "OMDURACION" ;
      edtOMCosRea_Internalname = "OMCOSREA" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      edtOMRCCosT_Internalname = "OMRCCOST" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMRCosT_Jsonclick = "" ;
      edtOMRCCosT_Jsonclick = "" ;
      edtOMRRCosT_Jsonclick = "" ;
      edtOMCosRea_Jsonclick = "" ;
      edtOMDuracion_Jsonclick = "" ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMNot_Jsonclick = "" ;
      cmbOMEst.setJsonclick( "" );
      edtOMUsuCre_Jsonclick = "" ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMFchPre_Jsonclick = "" ;
      edtOMTxt_Jsonclick = "" ;
      edtPMCod_Jsonclick = "" ;
      edtSMCod_Jsonclick = "" ;
      edtOMDscMqPla_Jsonclick = "" ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqCodFo_Jsonclick = "" ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "3:OMCod|4:OMMaqCod|6:OMMaqDsc|8:SMCod|9:PMCod|10:OMTxt|11:OMFchPre|12:OMFchCre|13:OMUsuCre|14:OMEst|15:OMNot|16:OMFchCer" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Selecciona Ordenes de Mantenimiento", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "OMEST_" + sGXsfl_24_idx ;
      cmbOMEst.setName( GXCCtl );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11YP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12YP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e13YP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'AV11OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV11OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e17YP2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV18Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e18YP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A13679OMMaqCodFo',fld:'OMMAQCODFO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV32InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV8InOutOMCod',fld:'vINOUTOMCOD',pic:'ZZZZZZZ9'},{av:'AV9InOutOMMaqCodFor',fld:'vINOUTOMMAQCODFOR',pic:''}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e14YP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV13FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCODFO","{handler:'valid_Ommaqcodfo',iparms:[]");
      setEventMetadata("VALID_OMMAQCODFO",",oparms:[]}");
      setEventMetadata("VALID_OMMAQDSC","{handler:'valid_Ommaqdsc',iparms:[]");
      setEventMetadata("VALID_OMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_OMDSCMQPLA","{handler:'valid_Omdscmqpla',iparms:[]");
      setEventMetadata("VALID_OMDSCMQPLA",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[]");
      setEventMetadata("VALID_SMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMTXT","{handler:'valid_Omtxt',iparms:[]");
      setEventMetadata("VALID_OMTXT",",oparms:[]}");
      setEventMetadata("VALID_OMUSUCRE","{handler:'valid_Omusucre',iparms:[]");
      setEventMetadata("VALID_OMUSUCRE",",oparms:[]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_OMNOT","{handler:'valid_Omnot',iparms:[]");
      setEventMetadata("VALID_OMNOT",",oparms:[]}");
      setEventMetadata("VALID_OMDURACION","{handler:'valid_Omduracion',iparms:[]");
      setEventMetadata("VALID_OMDURACION",",oparms:[]}");
      setEventMetadata("VALID_OMCOSREA","{handler:'valid_Omcosrea',iparms:[]");
      setEventMetadata("VALID_OMCOSREA",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
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
      wcpOAV32InOutEmprCod = "" ;
      wcpOAV9InOutOMMaqCodFor = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV32InOutEmprCod = "" ;
      AV9InOutOMMaqCodFor = "" ;
      AV13FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV14DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV35Pgmname = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Select = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A9426OMMaqCod = "" ;
      A13679OMMaqCodFo = "" ;
      A9427OMMaqDsc = "" ;
      A13678OMDscMqPla = "" ;
      A9433OMTxt = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9437OMUsuCre = "" ;
      A9445OMEst = "" ;
      A9464OMNot = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV13FilterFullText = "" ;
      H00YP7_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP7_A9464OMNot = new String[] {""} ;
      H00YP7_A9437OMUsuCre = new String[] {""} ;
      H00YP7_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP7_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP7_A9433OMTxt = new String[] {""} ;
      H00YP7_A9429PMCod = new int[1] ;
      H00YP7_n9429PMCod = new boolean[] {false} ;
      H00YP7_A9428SMCod = new int[1] ;
      H00YP7_n9428SMCod = new boolean[] {false} ;
      H00YP7_A9427OMMaqDsc = new String[] {""} ;
      H00YP7_n9427OMMaqDsc = new boolean[] {false} ;
      H00YP7_A9426OMMaqCod = new String[] {""} ;
      H00YP7_A9425OMCod = new int[1] ;
      H00YP7_A407EmprNom = new String[] {""} ;
      H00YP7_n407EmprNom = new boolean[] {false} ;
      H00YP7_A396EmprCod = new String[] {""} ;
      H00YP7_A13678OMDscMqPla = new String[] {""} ;
      H00YP7_n13678OMDscMqPla = new boolean[] {false} ;
      H00YP7_A13679OMMaqCodFo = new String[] {""} ;
      H00YP7_n13679OMMaqCodFo = new boolean[] {false} ;
      H00YP7_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP7_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP7_A9445OMEst = new String[] {""} ;
      H00YP7_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP7_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP13_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP13_A9464OMNot = new String[] {""} ;
      H00YP13_A9437OMUsuCre = new String[] {""} ;
      H00YP13_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP13_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YP13_A9433OMTxt = new String[] {""} ;
      H00YP13_A9429PMCod = new int[1] ;
      H00YP13_n9429PMCod = new boolean[] {false} ;
      H00YP13_A9428SMCod = new int[1] ;
      H00YP13_n9428SMCod = new boolean[] {false} ;
      H00YP13_A9427OMMaqDsc = new String[] {""} ;
      H00YP13_n9427OMMaqDsc = new boolean[] {false} ;
      H00YP13_A9426OMMaqCod = new String[] {""} ;
      H00YP13_A9425OMCod = new int[1] ;
      H00YP13_A407EmprNom = new String[] {""} ;
      H00YP13_n407EmprNom = new boolean[] {false} ;
      H00YP13_A396EmprCod = new String[] {""} ;
      H00YP13_A13678OMDscMqPla = new String[] {""} ;
      H00YP13_n13678OMDscMqPla = new boolean[] {false} ;
      H00YP13_A13679OMMaqCodFo = new String[] {""} ;
      H00YP13_n13679OMMaqCodFo = new boolean[] {false} ;
      H00YP13_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP13_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP13_A9445OMEst = new String[] {""} ;
      H00YP13_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YP13_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV36Station = "" ;
      GXt_char1 = "" ;
      AV37Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV38Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV39Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      lblCleanfilters_Jsonclick = "" ;
      TempTags = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenprompt__default(),
         new Object[] {
             new Object[] {
            H00YP7_A9439OMFchCer, H00YP7_A9464OMNot, H00YP7_A9437OMUsuCre, H00YP7_A9436OMFchCre, H00YP7_A9438OMFchPre, H00YP7_A9433OMTxt, H00YP7_A9429PMCod, H00YP7_n9429PMCod, H00YP7_A9428SMCod, H00YP7_n9428SMCod,
            H00YP7_A9427OMMaqDsc, H00YP7_n9427OMMaqDsc, H00YP7_A9426OMMaqCod, H00YP7_A9425OMCod, H00YP7_A407EmprNom, H00YP7_n407EmprNom, H00YP7_A396EmprCod, H00YP7_A13678OMDscMqPla, H00YP7_n13678OMDscMqPla, H00YP7_A13679OMMaqCodFo,
            H00YP7_n13679OMMaqCodFo, H00YP7_A9441OMMCCosT, H00YP7_A9443OMRCCosT, H00YP7_A9445OMEst, H00YP7_A9442OMMRCosT, H00YP7_A9444OMRRCosT
            }
            , new Object[] {
            H00YP13_A9439OMFchCer, H00YP13_A9464OMNot, H00YP13_A9437OMUsuCre, H00YP13_A9436OMFchCre, H00YP13_A9438OMFchPre, H00YP13_A9433OMTxt, H00YP13_A9429PMCod, H00YP13_n9429PMCod, H00YP13_A9428SMCod, H00YP13_n9428SMCod,
            H00YP13_A9427OMMaqDsc, H00YP13_n9427OMMaqDsc, H00YP13_A9426OMMaqCod, H00YP13_A9425OMCod, H00YP13_A407EmprNom, H00YP13_n407EmprNom, H00YP13_A396EmprCod, H00YP13_A13678OMDscMqPla, H00YP13_n13678OMDscMqPla, H00YP13_A13679OMMaqCodFo,
            H00YP13_n13679OMMaqCodFo, H00YP13_A9441OMMCCosT, H00YP13_A9443OMRCCosT, H00YP13_A9445OMEst, H00YP13_A9442OMMRCosT, H00YP13_A9444OMRRCosT
            }
         }
      );
      AV35Pgmname = "MantenimientoMaquina.TMOrdenPrompt" ;
      /* GeneXus formulas. */
      AV35Pgmname = "MantenimientoMaquina.TMOrdenPrompt" ;
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
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
   private short AV11OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8InOutOMCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_24 ;
   private int subGrid_Rows ;
   private int AV8InOutOMCod ;
   private int nGXsfl_24_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A9425OMCod ;
   private int A9428SMCod ;
   private int A9429PMCod ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV15PageToGo ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV16GridCurrentPage ;
   private long AV17GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private String wcpOAV32InOutEmprCod ;
   private String wcpOAV9InOutOMMaqCodFor ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV32InOutEmprCod ;
   private String AV9InOutOMMaqCodFor ;
   private String sGXsfl_24_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTableheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV35Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Select ;
   private String edtavSelect_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtOMCod_Internalname ;
   private String A9426OMMaqCod ;
   private String edtOMMaqCod_Internalname ;
   private String A13679OMMaqCodFo ;
   private String edtOMMaqCodFo_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Internalname ;
   private String A13678OMDscMqPla ;
   private String edtOMDscMqPla_Internalname ;
   private String edtSMCod_Internalname ;
   private String edtPMCod_Internalname ;
   private String edtOMTxt_Internalname ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchCre_Internalname ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Internalname ;
   private String A9445OMEst ;
   private String edtOMNot_Internalname ;
   private String edtOMFchCer_Internalname ;
   private String edtOMDuracion_Internalname ;
   private String edtOMCosRea_Internalname ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRCCosT_Internalname ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMCCosT_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String AV36Station ;
   private String GXt_char1 ;
   private String AV37Emprcod ;
   private String GXv_char2[] ;
   private String AV38Emprnom ;
   private String GXv_char3[] ;
   private String AV39Usurcod ;
   private String GXv_char4[] ;
   private String tblTablefilters_Internalname ;
   private String lblCleanfilters_Internalname ;
   private String lblCleanfilters_Jsonclick ;
   private String TempTags ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_24_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtOMCod_Jsonclick ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMMaqCodFo_Jsonclick ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMDscMqPla_Jsonclick ;
   private String edtSMCod_Jsonclick ;
   private String edtPMCod_Jsonclick ;
   private String edtOMTxt_Jsonclick ;
   private String edtOMFchPre_Jsonclick ;
   private String edtOMFchCre_Jsonclick ;
   private String edtOMUsuCre_Jsonclick ;
   private String GXCCtl ;
   private String edtOMNot_Jsonclick ;
   private String edtOMFchCer_Jsonclick ;
   private String edtOMDuracion_Jsonclick ;
   private String edtOMCosRea_Jsonclick ;
   private String edtOMRRCosT_Jsonclick ;
   private String edtOMRCCosT_Jsonclick ;
   private String edtOMMRCosT_Jsonclick ;
   private String edtOMMCCosT_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9438OMFchPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n13679OMMaqCodFo ;
   private boolean n9427OMMaqDsc ;
   private boolean n13678OMDscMqPla ;
   private boolean n9428SMCod ;
   private boolean n9429PMCod ;
   private boolean bGXsfl_24_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV13FilterFullText ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String lV13FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbOMEst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00YP7_A9439OMFchCer ;
   private String[] H00YP7_A9464OMNot ;
   private String[] H00YP7_A9437OMUsuCre ;
   private java.util.Date[] H00YP7_A9436OMFchCre ;
   private java.util.Date[] H00YP7_A9438OMFchPre ;
   private String[] H00YP7_A9433OMTxt ;
   private int[] H00YP7_A9429PMCod ;
   private boolean[] H00YP7_n9429PMCod ;
   private int[] H00YP7_A9428SMCod ;
   private boolean[] H00YP7_n9428SMCod ;
   private String[] H00YP7_A9427OMMaqDsc ;
   private boolean[] H00YP7_n9427OMMaqDsc ;
   private String[] H00YP7_A9426OMMaqCod ;
   private int[] H00YP7_A9425OMCod ;
   private String[] H00YP7_A407EmprNom ;
   private boolean[] H00YP7_n407EmprNom ;
   private String[] H00YP7_A396EmprCod ;
   private String[] H00YP7_A13678OMDscMqPla ;
   private boolean[] H00YP7_n13678OMDscMqPla ;
   private String[] H00YP7_A13679OMMaqCodFo ;
   private boolean[] H00YP7_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] H00YP7_A9441OMMCCosT ;
   private java.math.BigDecimal[] H00YP7_A9443OMRCCosT ;
   private String[] H00YP7_A9445OMEst ;
   private java.math.BigDecimal[] H00YP7_A9442OMMRCosT ;
   private java.math.BigDecimal[] H00YP7_A9444OMRRCosT ;
   private java.util.Date[] H00YP13_A9439OMFchCer ;
   private String[] H00YP13_A9464OMNot ;
   private String[] H00YP13_A9437OMUsuCre ;
   private java.util.Date[] H00YP13_A9436OMFchCre ;
   private java.util.Date[] H00YP13_A9438OMFchPre ;
   private String[] H00YP13_A9433OMTxt ;
   private int[] H00YP13_A9429PMCod ;
   private boolean[] H00YP13_n9429PMCod ;
   private int[] H00YP13_A9428SMCod ;
   private boolean[] H00YP13_n9428SMCod ;
   private String[] H00YP13_A9427OMMaqDsc ;
   private boolean[] H00YP13_n9427OMMaqDsc ;
   private String[] H00YP13_A9426OMMaqCod ;
   private int[] H00YP13_A9425OMCod ;
   private String[] H00YP13_A407EmprNom ;
   private boolean[] H00YP13_n407EmprNom ;
   private String[] H00YP13_A396EmprCod ;
   private String[] H00YP13_A13678OMDscMqPla ;
   private boolean[] H00YP13_n13678OMDscMqPla ;
   private String[] H00YP13_A13679OMMaqCodFo ;
   private boolean[] H00YP13_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] H00YP13_A9441OMMCCosT ;
   private java.math.BigDecimal[] H00YP13_A9443OMRCCosT ;
   private String[] H00YP13_A9445OMEst ;
   private java.math.BigDecimal[] H00YP13_A9442OMMRCosT ;
   private java.math.BigDecimal[] H00YP13_A9444OMRRCosT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV14DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tmordenprompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00YP7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV11OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV13FilterFullText ,
                                          int A9425OMCod ,
                                          String A9426OMMaqCod ,
                                          String A13679OMMaqCodFo ,
                                          String A9427OMMaqDsc ,
                                          String A13678OMDscMqPla ,
                                          int A9428SMCod ,
                                          int A9429PMCod ,
                                          String A9433OMTxt ,
                                          String A9437OMUsuCre ,
                                          String A9445OMEst ,
                                          String A9464OMNot ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.OMFchCer, T1.OMNot, T1.OMUsuCre, T1.OMFchCre, T1.OMFchPre, T1.OMTxt, T1.PMCod, T1.SMCod, T3.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T1.OMCod, T2.EmprNom," ;
      scmdbuf += " T1.EmprCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10)))" ;
      scmdbuf += " AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.OMCod = T1.OMCod)" ;
      scmdbuf += " LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep" ;
      scmdbuf += " GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE( T10.OMMaqCodFo, '')) IS NULL AND" ;
      scmdbuf += " NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla, T8.EmprCod, T8.OMCod FROM ((TXPMORDEN" ;
      scmdbuf += " T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo, T11.EmprCod, T12.OMCod, T11.MaqCod," ;
      scmdbuf += " T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo, T8.EmprCod, T9.OMCod, T8.MaqCod," ;
      scmdbuf += " T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod ) T7 ON T7.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T7.OMCod = T1.OMCod)" ;
      scmdbuf += sWhereString ;
      if ( ( AV11OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV11OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV11OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV11OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV11OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV11OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV11OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV11OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV11OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV11OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV11OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV11OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV11OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMUsuCre" ;
      }
      else if ( ( AV11OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMUsuCre DESC" ;
      }
      else if ( ( AV11OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV11OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV11OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV11OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
      }
      else if ( ( AV11OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV11OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      GXv_Object8[0] = scmdbuf ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_H00YP13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV11OrderedBy ,
                                           boolean AV12OrderedDsc ,
                                           String AV13FilterFullText ,
                                           int A9425OMCod ,
                                           String A9426OMMaqCod ,
                                           String A13679OMMaqCodFo ,
                                           String A9427OMMaqDsc ,
                                           String A13678OMDscMqPla ,
                                           int A9428SMCod ,
                                           int A9429PMCod ,
                                           String A9433OMTxt ,
                                           String A9437OMUsuCre ,
                                           String A9445OMEst ,
                                           String A9464OMNot ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.OMFchCer, T1.OMNot, T1.OMUsuCre, T1.OMFchCre, T1.OMFchPre, T1.OMTxt, T1.PMCod, T1.SMCod, T3.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T1.OMCod, T2.EmprNom," ;
      scmdbuf += " T1.EmprCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10)))" ;
      scmdbuf += " AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.OMCod = T1.OMCod)" ;
      scmdbuf += " LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep" ;
      scmdbuf += " GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE( T10.OMMaqCodFo, '')) IS NULL AND" ;
      scmdbuf += " NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla, T8.EmprCod, T8.OMCod FROM ((TXPMORDEN" ;
      scmdbuf += " T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo, T11.EmprCod, T12.OMCod, T11.MaqCod," ;
      scmdbuf += " T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo, T8.EmprCod, T9.OMCod, T8.MaqCod," ;
      scmdbuf += " T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod ) T7 ON T7.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T7.OMCod = T1.OMCod)" ;
      scmdbuf += sWhereString ;
      if ( ( AV11OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV11OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV11OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV11OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV11OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV11OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV11OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV11OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV11OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV11OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV11OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV11OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV11OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV11OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMUsuCre" ;
      }
      else if ( ( AV11OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMUsuCre DESC" ;
      }
      else if ( ( AV11OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV11OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV11OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV11OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
      }
      else if ( ( AV11OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV11OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      return GXv_Object9 ;
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
                  return conditional_H00YP7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] );
            case 1 :
                  return conditional_H00YP13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YP7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YP13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
      }
   }

}

